package hse.cli.commands;

import java.io.*;

public class WcCommand implements Runnable {
    private final String[] arguments;
    private final PipedInputStream input;
    private final PipedOutputStream output;

    private int bytes = 0;
    private int lines = 0;
    private int words = 0;

    public WcCommand(String[] args, PipedInputStream input, PipedOutputStream output) {
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
        boolean isPrevSpace = true;
        try {
            int data = input.read();
            while (data != -1){
                bytes++;
                if (Character.isWhitespace(data)) {
                    if (!isPrevSpace) {
                        words++;
                    }
                    isPrevSpace = true;
                } else {
                    isPrevSpace = false;
                }
                if ((char) data == '\n') {
                    lines++;
                }
                data = input.read();
            }
            dumpResults();
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
        }
    }

    private void readFile() {
        try {
            FileReader fileReader = new FileReader(arguments[0]);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines++;
                bytes += line.length();
                String[] wordsArray = line.trim().split("\\s+");
                words += wordsArray.length;
            }

            bufferedReader.close();
            dumpResults();
            output.close();
        } catch (IOException e) {
            System.err.println("Exception during writing to pipe: " + e.getMessage());
        }
    }

    private void dumpResults() throws IOException {
        String result = String.format("%d %d %d", lines, words, bytes);
        output.write(result.getBytes());
    }
}
