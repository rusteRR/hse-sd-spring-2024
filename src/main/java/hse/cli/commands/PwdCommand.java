package hse.cli.commands;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Custom implementation of *nix like command echo
 */
public class PwdCommand extends AbstractCommand {

    public PwdCommand(List<String> args, InputStream input, OutputStream output) {
        super(args, input, output);
    }

    @Override
    protected int execute() {
        Path currentRelativePath = Paths.get(System.getProperty("user.dir"));
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
