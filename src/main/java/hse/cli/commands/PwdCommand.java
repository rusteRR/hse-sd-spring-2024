package hse.cli.commands;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PwdCommand extends AbstractCommand {

    public PwdCommand(List<String> args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
    }

    @Override
    protected int execute() {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        try {
            output.write((s + '\n').getBytes());
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
            return 1;
        }
        return 0;
    }
}
