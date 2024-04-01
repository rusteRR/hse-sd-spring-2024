package hse.cli;

import hse.manager.Manager;
import hse.cli.antlr.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CLI {
    private static final InputStream input = System.in;
    private static final OutputStream output = System.out;

    public static void main(String[] args) throws Exception {
        var lexer = new CLILexer(CharStreams.fromStream(input));
        var tokenStream = new CommonTokenStream(lexer);
        var parser = new CLIParser(tokenStream);
        parser.setBuildParseTree(true);

        var inputContext = parser.input();
        var listener = new CLIMainListener();
        var walker = new ParseTreeWalker();
        walker.walk(listener, inputContext);

        var commands = listener.getCommands();

        if (commands == null) {
            Manager.shutDown();
            return;
        }

        Manager.startThreadPool();

        var finalInputStream = Manager.startPipeline(commands);
        finalInputStream.transferTo(System.out);
        Manager.shutDown();
    }
}
