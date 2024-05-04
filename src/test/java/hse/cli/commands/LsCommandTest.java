package hse.cli.commands;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LsCommandTest {
    @Test
    public void testLsCommand() {
        String before = System.getProperty("user.dir");

        var args = List.of("ls", "src/././test/../test/././resources/ls-playground");
        var out = new ByteArrayOutputStream();
        var in  = new ByteArrayInputStream("".getBytes());
        LsCommand cmd = new LsCommand(args, in, out);
        int resultCode = cmd.execute();

        assertEquals(0, resultCode);
        assertEquals(before, System.getProperty("user.dir"));

        String[] expected = new String[]{"a1", "a2", "b"};
        String[] actual = out.toString().split("\n");
        Arrays.sort(actual);

        assertEquals(expected.length, actual.length);
        assertArrayEquals(expected, actual);
    }
}
