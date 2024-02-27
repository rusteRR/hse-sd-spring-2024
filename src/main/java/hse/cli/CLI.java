package hse.cli;

import hse.manager.Manager;

import java.io.InputStream;
import java.io.OutputStream;

public class CLI {
    private static InputStream input = System.in;
    private static OutputStream output = System.out;

    public static void main(String[] args) throws Exception {
        var lexer = new Lexer(input);
        var parser = new Parser();

        var tokens = lexer.getTokens();
        var commands = parser.parse(tokens);

        if (commands == null) {
            Manager.shutDown();
            return;
        }

        Manager.startThreadPool();

        var finalInputStream = Manager.startPipeline(commands);
        if (finalInputStream != null) {
            finalInputStream.transferTo(output);
        }
    }
}
