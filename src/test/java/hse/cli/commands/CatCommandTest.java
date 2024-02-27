package hse.cli.commands;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class CatCommandTest {
    @Test
    public void readStdinTest() throws IOException {
        String[] args = {};

        PipedOutputStream output = new PipedOutputStream();
        PipedInputStream  input  = new PipedInputStream();
        PipedOutputStream output_main = new PipedOutputStream(input);
        PipedInputStream  input_main  = new PipedInputStream(output);

        CatCommand cmd = new CatCommand(args, input, output);

        Thread thread = new Thread(cmd);
        thread.start();
        for (int i = 0; i < 10; i++) {
            output_main.write('a');
        }
        output_main.close();
        StringBuilder builder = new StringBuilder();
        try {
            int data = input_main.read();
            while (data != -1) {
                builder.append((char) data);
                data = input_main.read();
            }
        } catch (IOException ignored) {
        }

        assertEquals("aaaaaaaaaa\n", builder.toString());
    }
}