package hse.cli.commands;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Custom implementation of shell command to change directory
 */
public class CdCommand extends AbstractCommand {
    public CdCommand(List<String> args, InputStream input, OutputStream output) {
        super(args, input, output);
    }

    /**
     * Relative destination will change the source path by (./)* or (../)*
     * Absolute destination path will replace the source path
     * Works only for directories
     * @param src absolute path
     * @param dst relative or absolute path
     * @param enableExistCheck checking path exist
     * @return new Path by destination
     * @throws FileNotFoundException if new path is not exist or not a directory
     */
    public static Path buildChangedPath(String src, String dst, boolean enableExistCheck) throws FileNotFoundException {
        if (!src.startsWith("/")) {
            throw new FileNotFoundException("Source path should be absolute");
        }

        if (dst.startsWith("~")) {
            dst = dst.replaceFirst("~", System.getProperty("user.home"));
        }

        if (dst.startsWith("/")) {
            src = "";
        }

        Path currentPath = Paths.get(src, dst).normalize();
        if (enableExistCheck && (!Files.exists(currentPath) || !Files.isDirectory(currentPath))) {
            throw new FileNotFoundException("Not found directory by " + currentPath);
        }

        return currentPath;
    }

    public static Path buildChangedPath(String src, String dst) throws FileNotFoundException {
        return buildChangedPath(src, dst, true);
    }

    private int changeDirectory() {
        String changeToPath;
        int argsCount = arguments.size();

        if (argsCount == 1) {
            changeToPath = System.getProperty("user.home");
        } else if (argsCount == 2) {
            changeToPath = arguments.get(1);
        } else {
            System.err.println("Exception during execute `cd`: zero or one argument is allowed");
            return 1;
        }

        Path currentPath;
        try {
            currentPath = buildChangedPath(System.getProperty("user.dir"), changeToPath);
        } catch (FileNotFoundException e) {
            System.err.println("Exception during execute `cd`: " + e.getMessage());
            return 1;
        }

        System.setProperty("user.dir", currentPath.toString());
        return 0;
    }

    @Override
    protected int execute() {
        int changeDirectoryStatus = changeDirectory();

        try {
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during close pipe: " + e.getMessage());
            return 1;
        }

        return changeDirectoryStatus;
    }
}
