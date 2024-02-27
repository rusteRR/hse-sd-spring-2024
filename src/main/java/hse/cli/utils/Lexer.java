package hse.cli.utils;

import java.io.*;

public class Lexer implements Runnable {
    private final String[] args;
    private final PipedInputStream input;
    private final PipedOutputStream output;

    public Lexer(String args, PipedInputStream input, PipedOutputStream output) {
        this.args = args;
        this.input  = input;
        this.output = output;
    }

    @Override
    public void run() {
        lex();
    }

    private void lex() {
        try {
            return;
        } catch (IOException e) {
            System.err.println("Exception during lexical analysys: " + e.getMessage());
        }
    }
}