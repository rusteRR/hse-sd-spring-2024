package hse.cli.commands;

import java.io.*;
import java.util.List;
import java.util.Map;

/**
 * This class provides an interface for custom commands implementation
 */
public abstract class AbstractCommand implements Runnable {
    protected final List<String> arguments;
    protected InputStream input;
    protected OutputStream output;
    protected Map<String, String> environment;

    public AbstractCommand(List<String> args, InputStream input, OutputStream output) {
        this.arguments = args;
        this.input  = input;
        this.output = output;
    }
    public void setInputStream(InputStream newInput) {
        this.input = newInput;
    }

    public AbstractCommand withEnvironment(Map<String, String> environment) {
        this.environment = environment;
        return this;
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
