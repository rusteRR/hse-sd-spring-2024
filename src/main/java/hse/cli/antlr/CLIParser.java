// Generated from CLI.g4 by ANTLR 4.13.1

package hse.cli.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CLIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, EnvVar=2, CommandName=3, Arg=4, StrValue=5, NumValue=6, SPACE=7, 
		PIPE=8, EOL=9;
	public static final int
		RULE_input = 0, RULE_token = 1, RULE_command = 2, RULE_surrArg = 3, RULE_envVarSet = 4, 
		RULE_surrValue = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "token", "command", "surrArg", "envVarSet", "surrValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "EnvVar", "CommandName", "Arg", "StrValue", "NumValue", "SPACE", 
			"PIPE", "EOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CLI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CLIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CLIParser.EOF, 0); }
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(CLIParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(CLIParser.PIPE, i);
		}
		public List<TerminalNode> EOL() { return getTokens(CLIParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(CLIParser.EOL, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(12);
					token();
					setState(13);
					match(PIPE);
					}
					} 
				}
				setState(19);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140L) != 0)) {
				{
				setState(20);
				token();
				}
			}

			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				{
				setState(23);
				match(EOF);
				}
				break;
			case EOL:
				{
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(24);
					match(EOL);
					}
					}
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EOL );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TokenContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public EnvVarSetContext envVarSet() {
			return getRuleContext(EnvVarSetContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CLIParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CLIParser.SPACE, i);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(31);
				match(SPACE);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CommandName:
				{
				setState(37);
				command();
				}
				break;
			case EnvVar:
				{
				setState(38);
				envVarSet();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(41);
				match(SPACE);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode CommandName() { return getToken(CLIParser.CommandName, 0); }
		public List<SurrArgContext> surrArg() {
			return getRuleContexts(SurrArgContext.class);
		}
		public SurrArgContext surrArg(int i) {
			return getRuleContext(SurrArgContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(CommandName);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					surrArg();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SurrArgContext extends ParserRuleContext {
		public TerminalNode Arg() { return getToken(CLIParser.Arg, 0); }
		public List<TerminalNode> SPACE() { return getTokens(CLIParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CLIParser.SPACE, i);
		}
		public SurrArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surrArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).enterSurrArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).exitSurrArg(this);
		}
	}

	public final SurrArgContext surrArg() throws RecognitionException {
		SurrArgContext _localctx = new SurrArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_surrArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(54);
				match(SPACE);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(Arg);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnvVarSetContext extends ParserRuleContext {
		public TerminalNode EnvVar() { return getToken(CLIParser.EnvVar, 0); }
		public SurrValueContext surrValue() {
			return getRuleContext(SurrValueContext.class,0);
		}
		public EnvVarSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_envVarSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).enterEnvVarSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).exitEnvVarSet(this);
		}
	}

	public final EnvVarSetContext envVarSet() throws RecognitionException {
		EnvVarSetContext _localctx = new EnvVarSetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_envVarSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(EnvVar);
			setState(63);
			surrValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SurrValueContext extends ParserRuleContext {
		public TerminalNode NumValue() { return getToken(CLIParser.NumValue, 0); }
		public TerminalNode StrValue() { return getToken(CLIParser.StrValue, 0); }
		public SurrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).enterSurrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).exitSurrValue(this);
		}
	}

	public final SurrValueContext surrValue() throws RecognitionException {
		SurrValueContext _localctx = new SurrValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_surrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__0);
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==StrValue || _la==NumValue) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\tE\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0003\u0000\u0016\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f"+
		"\u0000\u001b\u0003\u0000\u001e\b\u0000\u0001\u0001\u0005\u0001!\b\u0001"+
		"\n\u0001\f\u0001$\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001"+
		"\u0001\u0001\u0005\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0005\u00022\b\u0002\n\u0002\f\u00025\t\u0002\u0001\u0003"+
		"\u0005\u00038\b\u0003\n\u0003\f\u0003;\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0001"+
		"\u0001\u0000\u0005\u0006G\u0000\u0011\u0001\u0000\u0000\u0000\u0002\""+
		"\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u00069\u0001\u0000"+
		"\u0000\u0000\b>\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000\f\r"+
		"\u0003\u0002\u0001\u0000\r\u000e\u0005\b\u0000\u0000\u000e\u0010\u0001"+
		"\u0000\u0000\u0000\u000f\f\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000"+
		"\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000"+
		"\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u001d\u0001\u0000"+
		"\u0000\u0000\u0017\u001e\u0005\u0000\u0000\u0001\u0018\u001a\u0005\t\u0000"+
		"\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u0017\u0001\u0000\u0000"+
		"\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001e\u0001\u0001\u0000\u0000"+
		"\u0000\u001f!\u0005\u0007\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!"+
		"$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#\'\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%(\u0003\u0004"+
		"\u0002\u0000&(\u0003\b\u0004\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001"+
		"\u0000\u0000\u0000(,\u0001\u0000\u0000\u0000)+\u0005\u0007\u0000\u0000"+
		"*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-\u0003\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000/3\u0005\u0003\u0000\u000002\u0003\u0006\u0003\u0000"+
		"10\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004\u0005\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000068\u0005\u0007\u0000\u000076\u0001\u0000\u0000\u0000"+
		"8;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0004"+
		"\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u0002\u0000\u0000"+
		"?@\u0003\n\u0005\u0000@\t\u0001\u0000\u0000\u0000AB\u0005\u0001\u0000"+
		"\u0000BC\u0007\u0000\u0000\u0000C\u000b\u0001\u0000\u0000\u0000\t\u0011"+
		"\u0015\u001b\u001d\"\',39";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}