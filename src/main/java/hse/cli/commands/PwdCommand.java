package hse.cli.commands;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PwdCommand implements Runnable {
    private final String[] arguments;
    private final PipedInputStream input;
    private final PipedOutputStream output;

    public PwdCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
        this.arguments = args;
        this.input  = input;
        this.output = output;
    }

    @Override
    public void run() {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        try {
            output.write(s.getBytes());
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
        }
    }
}
