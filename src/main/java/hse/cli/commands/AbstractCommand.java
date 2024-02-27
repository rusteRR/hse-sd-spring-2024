package hse.cli.commands;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public abstract class AbstractCommand implements Runnable {
    protected final String[] arguments;
    protected final PipedInputStream input;
    protected final PipedOutputStream output;

    public AbstractCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
        this.arguments = args;
        this.input  = input;
        this.output = output;
    }

    protected abstract int execute();

    @Override
    public void run() {
        execute();
    }

}
