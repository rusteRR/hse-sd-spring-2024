package hse.cli.commands;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.List;

/**
 * Custom implementation of *nix like command echo
 */
public class EchoCommand extends AbstractCommand {

    public EchoCommand(List<String> args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
    }

    @Override
    public int execute() {
        try {
            arguments.stream().skip(1).forEach(arg -> {
                try {
                    output.write(arg.getBytes());
                    output.write(' ');
                } catch (IOException ignored) {
                }
            });
            output.write('\n');
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
            return 1;
        }
        return 0;
    }
}
