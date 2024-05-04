package hse.cli.commands;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class LsCommand extends AbstractCommand {
    public LsCommand(List<String> args, InputStream input, OutputStream output) {
        super(args, input, output);
    }

    private int listDirectory() throws IOException {
        String listPath;
        int argsCount = arguments.size();

        if (argsCount == 1) {
            listPath = System.getProperty("user.dir");
        } else if (argsCount == 2) {
            listPath = arguments.get(1);
        } else {
            System.err.println("Exception during execute `ls`: zero or one argument is allowed");
            return 1;
        }

        Path currentPath;
        try {
            currentPath = CdCommand.buildChangedPath(System.getProperty("user.dir"), listPath);
        } catch (FileNotFoundException e) {
            System.err.println("Exception during execute `ls`: " + e.getMessage());
            return 1;
        }

        File[] files = currentPath.toFile().listFiles();
        if (files == null) {
            return 0;
        }

        for (File file : files) {
            output.write((file.getName() + "\n").getBytes());
        }

        return 0;
    }

    @Override
    protected int execute() {
        int isFailed;
        try {
            isFailed = listDirectory();
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
            return 1;
        }

        return isFailed;
    }
}
