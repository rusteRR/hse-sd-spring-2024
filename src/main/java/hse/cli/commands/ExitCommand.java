package hse.cli.commands;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ExitCommand implements Runnable {
    private final String[] arguments;
    private final PipedInputStream input;
    private final PipedOutputStream output;

    public ExitCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
        this.arguments = args;
        this.input  = input;
        this.output = output;
    }

    @Override
    public void run() {
        System.exit(0);
    }
}
