package hse.cli.commands;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CdCommandTest {
    @Test
    public void testBuildChangedPath() throws FileNotFoundException {
        System.setProperty("user.home", "/home/user");

        assertEquals("/my/path", CdCommand.buildChangedPath("/my/path", "././././", false).toString());
        assertEquals("/", CdCommand.buildChangedPath("/my/path", "././../../", false).toString());
        assertEquals("/my/path/c/b", CdCommand.buildChangedPath("/my/path", "c/./b/a/./../", false).toString());
        assertEquals("/my/b", CdCommand.buildChangedPath("/my/path", "./c./../../b", false).toString());
        assertEquals("/tmp", CdCommand.buildChangedPath("/my/path", "/tmp", false).toString());
        assertEquals("/home/user", CdCommand.buildChangedPath("/my/path", "~", false).toString());
        assertEquals("/home/user/a/b/c", CdCommand.buildChangedPath("/my/path", "~/a/b/c", false).toString());
        assertEquals("/home/user/a/~/c", CdCommand.buildChangedPath("/my/path", "~/a/~/c", false).toString());

        assertThrows(
                FileNotFoundException.class,
                () -> CdCommand.buildChangedPath("/ect/123/i/believe/that/this/path/not/~/exist", "sure/../"),
                "WOW, this path exist!"
        );
    }

// Эти тесты ломают тестирование из-за параллельности JUint.
// Нужно бы его как-то прикостылить... что-нибудь с очередностью...
//
//    @Test
//    public void testCdCommandExecute() {
//        String before = System.getProperty("user.dir");
//
//        var args = List.of("cd", "../././");
//        var out = new ByteArrayOutputStream();
//        var in  = new ByteArrayInputStream("".getBytes());
//        CdCommand cmd = new CdCommand(args, in, out);
//        int resultCode = cmd.execute();
//
//        String after = System.getProperty("user.dir");
//
//        assertEquals(0, resultCode);
//        assertNotEquals(before, after);
//        System.setProperty("user.dir", before);
//    }
//
//    @Test
//    public void testCdCommandExecuteNoArgs() {
//        var args = List.of("cd");
//        var out = new ByteArrayOutputStream();
//        var in  = new ByteArrayInputStream("".getBytes());
//        CdCommand cmd = new CdCommand(args, in, out);
//        int resultCode = cmd.execute();
//
//        assertEquals(0, resultCode);
//        assertEquals(System.getProperty("user.home"), System.getProperty("user.dir"));
//    }

    @Test
    public void testCdCommandExecuteTooManyArgs() {
        String before = System.getProperty("user.dir");

        var args = List.of("cd", "a", "b");
        var out = new ByteArrayOutputStream();
        var in  = new ByteArrayInputStream("".getBytes());
        CdCommand cmd = new CdCommand(args, in, out);
        int resultCode = cmd.execute();

        assertEquals(1, resultCode);
        assertEquals(before, System.getProperty("user.dir"));
    }
}
