package hse.cli.commands;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ExitCommand extends AbstractCommand {

    public ExitCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
    }

    @Override
    public void run() {
        System.exit(0);
    }
}
