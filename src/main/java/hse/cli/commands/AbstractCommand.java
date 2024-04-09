package hse.cli.commands;

import java.io.*;
import java.util.List;

/**
 * This class provides an interface for custom commands implementation
 */
public abstract class AbstractCommand implements Runnable {
    protected final List<String> arguments;
    protected InputStream input;
    protected OutputStream output;

    public AbstractCommand(List<String> args, InputStream input, OutputStream output) {
        this.arguments = args;
        this.input  = input;
        this.output = output;
    }
    public void setInputStream(InputStream newInput) {
        this.input = newInput;
    }

    public void setOutputStream(OutputStream newOutput) {
        this.output = newOutput;
    }
    protected abstract int execute();

    @Override
    public void run() {
        execute();
    }
}
