package hse.cli.commands;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class EchoCommand extends AbstractCommand {

    public EchoCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
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
