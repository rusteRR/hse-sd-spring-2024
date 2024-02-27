package hse.cli.commands;

import java.io.*;

public class CatCommand extends AbstractCommand {
    public CatCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
    }

    @Override
    public void run() {
        if (arguments.length == 0) {
            readFromPipe();
        } else {
            readFile();
        }
    }

    private void readFromPipe() {
        try {
            int data = input.read();
            while (data != -1){
                output.write(data);
                data = input.read();
            }
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
        }
    }

    private void readFile() {
        try (FileInputStream fileInputStream = new FileInputStream(arguments[0])) {
            int data;
            while ((data = fileInputStream.read()) != -1) {
                output.write(data);
            }
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
        }
    }

}
