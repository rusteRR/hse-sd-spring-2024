package hse.cli.commands;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.List;

public abstract class AbstractCommand implements Runnable {
    protected final List<String> arguments;
    protected PipedInputStream input;
    protected PipedOutputStream output;

    public AbstractCommand(List<String> args, PipedInputStream input, PipedOutputStream output) {
        this.arguments = args;
        this.input  = input;
        this.output = output;
    }
    public void setInputStream(PipedInputStream newInput) {
        this.input = newInput;
    }

    public void setOutputStream(PipedOutputStream newOutput) {
        this.output = newOutput;
    }
    protected abstract int execute();

    @Override
    public void run() {
        execute();
    }
}
