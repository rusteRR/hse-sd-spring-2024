package hse.cli.commands;

import java.io.*;
import java.util.List;

/**
 * Custom implementation of *nix like command echo
 */
public class EchoCommand extends AbstractCommand {

    public EchoCommand(List<String> args, InputStream input, OutputStream output) {
        super(args, input, output);
    }

    @Override
    public int execute() {
        try {
            for (int ind = 1; ind < arguments.size(); ind++) {
                output.write(arguments.get(ind).getBytes());
                if (ind != arguments.size() - 1) output.write(' ');
                else output.write('\n');
            }
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
            return 1;
        }
        return 0;
    }
}
