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
	/**
	 * Enter a parse tree produced by {@link CLIParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(CLIParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(CLIParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(CLIParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(CLIParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIParser#surrArg}.
	 * @param ctx the parse tree
	 */
	void enterSurrArg(CLIParser.SurrArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIParser#surrArg}.
	 * @param ctx the parse tree
	 */
	void exitSurrArg(CLIParser.SurrArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIParser#envVarSet}.
	 * @param ctx the parse tree
	 */
	void enterEnvVarSet(CLIParser.EnvVarSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIParser#envVarSet}.
	 * @param ctx the parse tree
	 */
	void exitEnvVarSet(CLIParser.EnvVarSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIParser#surrValue}.
	 * @param ctx the parse tree
	 */
	void enterSurrValue(CLIParser.SurrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIParser#surrValue}.
	 * @param ctx the parse tree
	 */
	void exitSurrValue(CLIParser.SurrValueContext ctx);
}