package hse.cli.commands;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrepCommand extends AbstractCommand {

    public GrepCommand(List<String> args, PipedInputStream input, PipedOutputStream output) {
        super(args, input, output);
    }

    @Override
    protected int execute() {
        Options options = new Options();

        Option wholeWord = new Option("w", "whole-word", false, "Search for whole words only");
        wholeWord.setRequired(false);
        options.addOption(wholeWord);

        Option ignoreCase = new Option("i", "ignore-case", false, "Perform case-insensitive matching");
        ignoreCase.setRequired(false);
        options.addOption(ignoreCase);

        Option afterContext = new Option("A", "after-context", true, "Print NUM lines of trailing context after matching lines");
        afterContext.setRequired(false);
        options.addOption(afterContext);

        CommandLineParser parser = new DefaultParser();

        try {
            cmd = parser.parse(options, arguments);
            String[] remainingArgs = cmd.getArgs();

            if (remainingArgs.length < 2) {
                System.err.println("Usage: grep <pattern> <file>");
                return;
            }

            String pattern = remainingArgs[1];
            String filename = remainingArgs[2];

            boolean isWholeWord = cmd.hasOption("w");
            boolean ignoreCaseFlag = cmd.hasOption("i");
            int afterContextLines = cmd.hasOption("A") ? Integer.parseInt(cmd.getOptionValue("A")) : 0;

            Pattern searchPattern = Pattern.compile(pattern, ignoreCaseFlag ? Pattern.CASE_INSENSITIVE : 0);

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = br.readLine()) != null) {
                    Matcher matcher = searchPattern.matcher(line);
                    if (matcher.find()) {
                        output.write(line.getBytes());
                        for (int i = 0; i < afterContextLines; i++) {
                            line = br.readLine();
                            if (line != null) {
                                output.write(line.getBytes());
                            } else {
                                break;
                            }
                        }
                    }
                }
                output.close();
            } catch (IOException e) {
                System.err.println("Error reading file in grep: " + e.getMessage());
            }
        } catch (ParseException e) {
            System.err.println(e.getMessage());
            return 1;
        }
    }
}
