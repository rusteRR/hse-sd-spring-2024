package hse.cli;

import hse.cli.commands.*;
import hse.manager.Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CLI {
    private static final InputStream input = System.in;
    private static final OutputStream output = System.out;

    private static final String commandRegex = "[a-zA-Z][a-zA-Z0-9_-]*";
    private static final String argRegex = "[a-zA-Z0-9_-]+";

    private static AbstractCommand buildCommand(String name, List<String> args) {
        return switch (name) {
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
            if (token.matches(String.format("(%s)(\\s+%s)", commandRegex, argRegex))) {
                String[] cmd = token.split("\\s+");
                String[] args = Arrays.copyOfRange(cmd, 1, cmd.length);
                result.add(buildCommand(cmd[0], Arrays.asList(args)));
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(input);
        while (true) {
            try {
                System.out.print('>');
                List<AbstractCommand> commands = getCommands(scanner.nextLine());
                if (!commands.isEmpty()) {
                    Manager.startThreadPool();

                    InputStream finalInputStream = Manager.startPipeline(commands);
                    finalInputStream.transferTo(output);
                    Manager.shutDown();
                }
            } catch (Exception e) {
                return;
            }
        }
    }
}
