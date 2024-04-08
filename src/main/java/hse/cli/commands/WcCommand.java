package hse.cli.commands;

import java.io.*;
import java.util.List;

/**
 * Custom implementation of *nix like command echo
 * Supports two types of input: both from files and stdin
 */
public class WcCommand extends AbstractCommand {

    public WcCommand(List<String> args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
    }

    @Override
    protected int execute() {
        boolean failed = false;
        if (arguments.size() == 1) {
            try {
                output.write((processStream(input) + "\n").getBytes());
                output.close();
            } catch (IOException e) {
                failed = true;
                System.err.println("Exception during processing input: " + e.getMessage());
            }
        } else {
            Counts total = new Counts();
            for (String arg : arguments) {
                try (InputStream stream = new FileInputStream(arg)) {
                    Counts curr = processStream(stream);
                    output.write((curr + String.format(" %s\n", arg)).getBytes());
                    total.add(curr);
                    output.close();
                } catch (IOException e) {
                    failed = true;
                    System.err.println("Exception during processing arguments: " + e.getMessage());
                }
            }
            if (arguments.size() > 2) {
                try {
                    output.write((total + " total\n").getBytes());
                    output.close();
                } catch (IOException e) {
                    failed = true;
                    System.err.println("Exception during processing arguments: " + e.getMessage());
                }
            }
        }
        return failed ? 1 : 0;
    }

    private Counts processStream(InputStream stream) throws IOException {
        Counts counts = new Counts();
        int data = stream.read();
        boolean isPrevSpace = true;
        while (data != -1) {
            counts.bytes++;
            if (Character.isWhitespace(data)) {
                if (!isPrevSpace) {
                    counts.words++;
                }
                isPrevSpace = true;
            } else {
                isPrevSpace = false;
            }
            if ((char) data == '\n') {
                counts.lines++;
            }
            data = stream.read();
        }
        return counts;
    }

    private static class Counts {
        public int lines = 0;
        public int words = 0;
        public int bytes = 0;

        public void add(Counts other) {
            lines += other.lines;
            words += other.words;
            bytes += other.bytes;
        }

        @Override
        public String toString() {
            return String.format("\t%d\t%d\t%d", lines, words, bytes);
        }
    }
}
