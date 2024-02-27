package hse.cli.utils;

import java.io.*;

public class Token {
    public static enum ECommand {
        CAT, ECHO, EXIT, PWD, WC;
    }
    public final ECommand command;
    public final String[] args;
    
    public Token(ECommand command, String args) {
        this.command = command;
        this.args = args;
    }
    
    public String toString() {
        return t.toString();
    }
}