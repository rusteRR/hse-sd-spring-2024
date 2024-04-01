package hse.cli.commands;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.List;

public class ExitCommand extends AbstractCommand {

    public ExitCommand(List<String> args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
    }

    @Override
    protected int execute() {
        // TODO: we need to say interpreter to shutdown either do not execute this as individual command
        // just exiting is bad idea
        System.exit(0);
        return 0;
    }

}
