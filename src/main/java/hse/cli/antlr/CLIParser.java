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
		T__0=1, ProgramName=2, Arg=3, Value=4, EnvVar=5, QUOTA=6, DQUOTA=7, WS=8;
	public static final int
		RULE_input = 0, RULE_token = 1, RULE_program = 2, RULE_surrArg = 3, RULE_envVarSet = 4, 
		RULE_surrValue = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "token", "program", "surrArg", "envVarSet", "surrValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", null, null, null, null, "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ProgramName", "Arg", "Value", "EnvVar", "QUOTA", "DQUOTA", 
			"WS"
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
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ProgramName || _la==EnvVar) {
				{
				{
				setState(12);
				token();
				}
				}
				setState(17);
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
	public static class TokenContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public EnvVarSetContext envVarSet() {
			return getRuleContext(EnvVarSetContext.class,0);
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
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ProgramName:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				program();
				}
				break;
			case EnvVar:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				envVarSet();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ProgramName() { return getToken(CLIParser.ProgramName, 0); }
		public List<SurrArgContext> surrArg() {
			return getRuleContexts(SurrArgContext.class);
		}
		public SurrArgContext surrArg(int i) {
			return getRuleContext(SurrArgContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIListener ) ((CLIListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(ProgramName);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 200L) != 0)) {
				{
				{
				setState(23);
				surrArg();
				}
				}
				setState(28);
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
	public static class SurrArgContext extends ParserRuleContext {
		public TerminalNode Arg() { return getToken(CLIParser.Arg, 0); }
		public List<TerminalNode> QUOTA() { return getTokens(CLIParser.QUOTA); }
		public TerminalNode QUOTA(int i) {
			return getToken(CLIParser.QUOTA, i);
		}
		public List<TerminalNode> DQUOTA() { return getTokens(CLIParser.DQUOTA); }
		public TerminalNode DQUOTA(int i) {
			return getToken(CLIParser.DQUOTA, i);
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
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Arg:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(Arg);
				}
				break;
			case QUOTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(QUOTA);
				setState(31);
				match(Arg);
				setState(32);
				match(QUOTA);
				}
				break;
			case DQUOTA:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(DQUOTA);
				setState(34);
				match(Arg);
				setState(35);
				match(DQUOTA);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(38);
			match(EnvVar);
			setState(39);
			match(T__0);
			setState(40);
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
		public TerminalNode Value() { return getToken(CLIParser.Value, 0); }
		public List<TerminalNode> QUOTA() { return getTokens(CLIParser.QUOTA); }
		public TerminalNode QUOTA(int i) {
			return getToken(CLIParser.QUOTA, i);
		}
		public List<TerminalNode> DQUOTA() { return getTokens(CLIParser.DQUOTA); }
		public TerminalNode DQUOTA(int i) {
			return getToken(CLIParser.DQUOTA, i);
		}
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
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Value:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(Value);
				}
				break;
			case QUOTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(QUOTA);
				setState(44);
				match(Value);
				setState(45);
				match(QUOTA);
				}
				break;
			case DQUOTA:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(DQUOTA);
				setState(47);
				match(Value);
				setState(48);
				match(DQUOTA);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001\b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u0019\b\u0002\n\u0002\f\u0002\u001c\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003%\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u00052\b\u0005\u0001\u0005\u0000\u0000"+
		"\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u00004\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u0016\u0001\u0000"+
		"\u0000\u0000\u0006$\u0001\u0000\u0000\u0000\b&\u0001\u0000\u0000\u0000"+
		"\n1\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001"+
		"\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000"+
		"\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0015\u0003\u0004"+
		"\u0002\u0000\u0013\u0015\u0003\b\u0004\u0000\u0014\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0003\u0001\u0000\u0000"+
		"\u0000\u0016\u001a\u0005\u0002\u0000\u0000\u0017\u0019\u0003\u0006\u0003"+
		"\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u0005\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001d%\u0005\u0003\u0000\u0000\u001e\u001f\u0005\u0006\u0000\u0000"+
		"\u001f \u0005\u0003\u0000\u0000 %\u0005\u0006\u0000\u0000!\"\u0005\u0007"+
		"\u0000\u0000\"#\u0005\u0003\u0000\u0000#%\u0005\u0007\u0000\u0000$\u001d"+
		"\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000\u0000$!\u0001\u0000"+
		"\u0000\u0000%\u0007\u0001\u0000\u0000\u0000&\'\u0005\u0005\u0000\u0000"+
		"\'(\u0005\u0001\u0000\u0000()\u0003\n\u0005\u0000)\t\u0001\u0000\u0000"+
		"\u0000*2\u0005\u0004\u0000\u0000+,\u0005\u0006\u0000\u0000,-\u0005\u0004"+
		"\u0000\u0000-2\u0005\u0006\u0000\u0000./\u0005\u0007\u0000\u0000/0\u0005"+
		"\u0004\u0000\u000002\u0005\u0007\u0000\u00001*\u0001\u0000\u0000\u0000"+
		"1+\u0001\u0000\u0000\u00001.\u0001\u0000\u0000\u00002\u000b\u0001\u0000"+
		"\u0000\u0000\u0005\u000f\u0014\u001a$1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}