package hse.cli.antlr;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import hse.cli.commands.*;

public class CLIMainListener extends CLIBaseListener {
    private List<Command> commands = new ArrayList<>();

    private static class Command {
        public String name;
        public List<String> args;

        public Command(String n, List<String> a) {
            name = n;
            args = a;
        }

        public AbstractCommand toAbstractCommand() {
            return switch (name) {
                case "cat" -> new CatCommand(args, null, null);
                case "echo" -> new EchoCommand(args, null, null);
                case "exit" -> new ExitCommand(args, null, null);
                case "pwd" -> new PwdCommand(args, null, null);
                case "wc" -> new WcCommand(args, null, null);
                default -> new ExternalCommand(args, null, null);
            };
        }
    }

    @Override
    public void enterInput(CLIParser.InputContext ctx) {
        commands.clear();
    }
    
    @Override
    public void enterCommand(CLIParser.CommandContext ctx) {
        List<String> cmdArgs = new ArrayList<>();
        cmdArgs.add(ctx.CommandName().getText());
        for (int i = 0; i < ctx.surrArg().size(); ++i) {
            cmdArgs.add(ctx.surrArg(i).Arg().getText().trim());
        }
        commands.add(new Command(ctx.CommandName().getText(), cmdArgs));
    }

    public List<AbstractCommand> getCommands() {
        return commands.stream().map(Command::toAbstractCommand).collect(Collectors.toList());
    }
}
