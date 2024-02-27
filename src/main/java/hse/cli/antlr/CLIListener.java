// Generated from CLI.g4 by ANTLR 4.13.1

package hse.cli.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLIParser}.
 */
public interface CLIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLIParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(CLIParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(CLIParser.InputContext ctx);
}