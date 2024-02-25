package hse.cli.commands;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class EchoCommand implements Runnable {
    private final String[] arguments;
    private final PipedInputStream input;
    private final PipedOutputStream output;

    public EchoCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
        this.arguments = args;
        this.input  = input;
        this.output = output;
    }

    @Override
    public void run() {
        try {
            for (String arg : arguments) {
                output.write(arg.getBytes());
            }
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
        }
    }
}
