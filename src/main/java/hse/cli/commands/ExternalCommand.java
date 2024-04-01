package hse.cli.commands;

import java.io.*;
import java.util.List;

public class ExternalCommand extends AbstractCommand {
    public ExternalCommand(List<String> args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
    }

    @Override
    public int execute() {
        try {
            Process process = new ProcessBuilder(arguments).start();
            OutputStream stdin = process.getOutputStream();
            input.transferTo(stdin);
            InputStream stdout = process.getInputStream();
            stdout.transferTo(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
