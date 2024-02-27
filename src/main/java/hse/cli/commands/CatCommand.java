package hse.cli.commands;

import java.io.*;

public class CatCommand extends AbstractCommand {

    public CatCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
    }

    @Override
    public int execute() {
        boolean failed = false;
        if (arguments.length == 0) {
            try {
                processStream(input);
            } catch (IOException e) {
                failed = true;
                System.err.println("Exception during processing input: " + e.getMessage());
            }
        } else {
            for (String arg : arguments) {
                try (InputStream stream = new FileInputStream(arg)) {
                    processStream(stream);
                } catch (IOException e) {
                    failed = true;
                    System.err.println("Exception during processing arguments: " + e.getMessage());
                }
            }
        }
        return failed ? 1 : 0;
    }


    private void processStream(InputStream stream) throws IOException {
        int data;
        while ((data = stream.read()) != -1) {
            output.write(data);
        }
        output.write('\n');
    }

}
