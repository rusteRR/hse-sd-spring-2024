package hse.cli;

import hse.cli.commands.*;
import hse.manager.Manager;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CLI {
    private static final InputStream input = System.in;
    private static final OutputStream output = System.out;

    private static final Map<String, String> environment = new HashMap<>();

    private static final String wordRegex = "[a-zA-Z]\\w*";
    private static final String argRegex = "[\\$a-zA-Z0-9_-]+";

    private static final String assignmentRegex = wordRegex + "=\\w*";

    private static final String commandRegex = String.format("((%s)*\\s+)*%s(\\s+(%s))*", assignmentRegex, wordRegex, argRegex);
    private static final String varRegex = String.format("(\\$(%s))+", wordRegex);

    private static AbstractCommand buildCommand(List<String> args) {
        return switch (args.get(0)) {
            case "cat" -> new CatCommand(args, null, null);
            case "echo" -> new EchoCommand(args, null, null);
            case "exit" -> new ExitCommand(args, null, null);
            case "pwd" -> new PwdCommand(args, null, null);
            case "wc" -> new WcCommand(args, null, null);
            default -> new ExternalCommand(args, null, null);
        };
    }

    private static List<AbstractCommand> getCommands(String line) {
        List<AbstractCommand> result = new ArrayList<>();
        for (String _token : line.split("\\|")) {
            String token = _token.trim();
            if (token.matches(commandRegex)) {
                var commandEnv = new HashMap<>(environment);
                String[] args = token.split("\\s+");
                int iter = 0;
                while (iter < args.length && args[iter].matches(assignmentRegex)) {
                    var splitted = args[iter++].split("=");
                    var variable = splitted[0];
                    var value = splitted.length == 2 ? splitted[1] : "";
                    commandEnv.put(variable, value);
                }
                result.add(buildCommand(
                                Arrays.stream(args)
                                        .skip(iter)
                                        .map(CLI::replaceVar)
                                        .collect(Collectors.toList())
                        ).withEnvironment(commandEnv)
                );

            } else if (token.matches(String.format("export(\\s+)%s", assignmentRegex))) {
                var splitted = token.replace("export", "").trim().split("=");
                var variable = splitted[0];
                var value = splitted.length == 2 ? splitted[1] : "";
                environment.put(variable, value);
            }
        }
        return result;
    }

    private static String replaceVar(String arg) {
        if (!arg.matches(varRegex)) {
            return arg;
        }
        return Arrays.stream(arg.replace("$", " ").split(" "))
                .map(var -> environment.getOrDefault(var, ""))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(input);
        Manager.startThreadPool();
        while (true) {
            try {
                System.out.print("> ");
                List<AbstractCommand> commands = getCommands(scanner.nextLine());
                if (!commands.isEmpty()) {

                    InputStream finalInputStream = Manager.startPipeline(commands);
                    finalInputStream.transferTo(output);
                }
            } catch (NoSuchElementException e) {
                break;
            }
        }
        Manager.shutDown();
    }
}
