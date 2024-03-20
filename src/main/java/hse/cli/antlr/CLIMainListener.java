package hse.cli.antlr;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import hse.cli.commands.*;

public class CLIMainListener extends CLIBaseListener {

    private class Command {
        public String name;
        public List<String> args;

        public Command(String n, List<String> a) {
            name = n;
            args = a;
        }

        public AbstractCommand toAbstractCommand() {
            AbstractCommand result;
            switch (name) {
                case "cat":
                    result = new CatCommand((String[]) args.toArray(), null, null);
                    break;
                case "echo":
                    result = new EchoCommand((String[]) args.toArray(), null, null);
                    break;
                case "exit":
                    result = new ExitCommand((String[]) args.toArray(), null, null);
                    break;
                case "pwd":
                    result = new PwdCommand((String[]) args.toArray(), null, null);
                    break;
                case "wc":
                    result = new WcCommand((String[]) args.toArray(), null, null);
                    break;
                default:
                    result = null;
                    break;
            }
            return result;
        }
    }

    private List<Command> commands = new ArrayList<>();

    @Override public void enterInput(CLIParser.InputContext ctx) {
        commands.clear();
    }
    
    @Override public void enterCommand(CLIParser.CommandContext ctx) {
        List<String> cmdArgs = new ArrayList<>();
        for (Integer i = 0; i < ctx.surrArg().size(); ++i) {
            cmdArgs.add(ctx.surrArg(i).Arg().getText().trim());
        }
        commands.add(new Command(ctx.CommandName().getText(), cmdArgs));
    }

    public List<AbstractCommand> getCommands() {
        return commands.stream().map(cmd -> cmd.toAbstractCommand()).collect(Collectors.toList());
    }
}
