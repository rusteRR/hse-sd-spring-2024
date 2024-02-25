package hse.cli.commands;

import java.io.*;

public class CatCommand implements Runnable {
    private final String[] arguments;
    private final PipedInputStream input;
    private final PipedOutputStream output;

    public CatCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
        this.arguments = args;
        this.input  = input;
        this.output = output;
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
