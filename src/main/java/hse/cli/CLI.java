package hse.cli;

import hse.cli.commands.AbstractCommand;
import hse.manager.Manager;
import hse.cli.antlr.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CLI {
    private static final InputStream input = System.in;
    private static final OutputStream output = System.out;

    public static void main(String[] args) throws Exception {
        CLILexer lexer = new CLILexer(CharStreams.fromStream(input));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CLIParser parser = new CLIParser(tokenStream);
        parser.setBuildParseTree(true);

        CLIParser.InputContext inputContext = parser.input();
        CLIMainListener listener = new CLIMainListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, inputContext);

        List<AbstractCommand> commands = listener.getCommands();

        if (commands == null) {
            Manager.shutDown();
            return;
        }

        Manager.startThreadPool();

        InputStream finalInputStream = Manager.startPipeline(commands);
        finalInputStream.transferTo(System.out);
        Manager.shutDown();
    }
}
