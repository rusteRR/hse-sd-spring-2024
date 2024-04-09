package hse.cli.commands;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EchoCommandTest {
    @Test
    public void testEchoCommand() {
        var args = List.of("echo", "123", "456");

        var out = new ByteArrayOutputStream();

        var in  = new ByteArrayInputStream("".getBytes());
        EchoCommand cmd = new EchoCommand(args, in, out);
        assertEquals(0, cmd.execute());

        assertEquals("123 456\n", out.toString());
    }
}