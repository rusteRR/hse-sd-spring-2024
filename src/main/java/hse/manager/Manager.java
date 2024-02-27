package hse.manager;

import java.io.*;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import hse.cli.commands.AbstractCommand;

public class Manager {
    private static ThreadPoolExecutor executor;

    public static void shutDown() {
        if (executor != null) {
            executor.shutdownNow();
        }
    }

    public static void startThreadPool() {
        executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
    }

    public static InputStream startPipeline(List<AbstractCommand> commands) throws IOException {
        PipedInputStream previousInput = null;

        for (AbstractCommand command : commands) {
            PipedOutputStream output = new PipedOutputStream();
            PipedInputStream input = new PipedInputStream(output);

            if (previousInput != null) {
                command.setInputStream(previousInput);
            }

            command.setOutputStream(output);
            previousInput = input;

            executor.execute(command);
        }

        return previousInput;
    }
}
