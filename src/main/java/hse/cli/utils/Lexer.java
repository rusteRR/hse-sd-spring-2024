package hse.cli.utils;

import java.io.*;

public class Lexer {
    public Lexer() {}

    public static List<Token> lex(String input) {
        try {
            List<Token> result = new ArrayList<Token>();
            
            return result;
        } catch (IOException e) {
            System.err.println("Exception during lexical analysys: " + e.getMessage());
        }
    }
}