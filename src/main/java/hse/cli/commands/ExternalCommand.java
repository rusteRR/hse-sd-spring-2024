package hse.cli.commands;

import java.io.*;
import java.nio.file.Paths;
import java.util.List;

/**
 * ExternalCommand provides a way to call an external command
 * from CLI.
 * External commands are any commands, that does not have
 * custom implementation in CLI
 */
public class ExternalCommand extends AbstractCommand {
    public ExternalCommand(List<String> args, InputStream input, OutputStream output) {
        super(args, input, output);
    }

    @Override
    public int execute() {
        try {
            File currentDirectory = Paths.get(System.getProperty("user.dir")).toFile();
            Process process = new ProcessBuilder(arguments).directory(currentDirectory).start();
            OutputStream stdin = process.getOutputStream();
            input.transferTo(stdin);
            InputStream stdout = process.getInputStream();
            stdout.transferTo(output);
//            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
