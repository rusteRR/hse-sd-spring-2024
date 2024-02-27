package hse.cli.commands;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PwdCommand extends AbstractCommand {

    public PwdCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
    }

    @Override
    protected int execute() {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        try {
            output.write((s + '\n').getBytes());
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
            return 1;
        }
        return 0;
    }
}
