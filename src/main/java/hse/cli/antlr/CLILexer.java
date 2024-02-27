// Generated from CLI.g4 by ANTLR 4.13.1

   package hse.cli;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CLILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Token=1, Program=2, SurrArg=3, EnvVarSet=4, SurrValue=5, ProgramName=6, 
		Arg=7, Value=8, EnvVar=9, QUOTA=10, DQUOTA=11, STRING=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Token", "Program", "SurrArg", "EnvVarSet", "SurrValue", "ProgramName", 
			"Arg", "Value", "EnvVar", "QUOTA", "DQUOTA", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Token", "Program", "SurrArg", "EnvVarSet", "SurrValue", "ProgramName", 
			"Arg", "Value", "EnvVar", "QUOTA", "DQUOTA", "STRING", "WS"
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


	public CLILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CLI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\rh\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0003\u0000\u001e"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0005\u0001\"\b\u0001\n\u0001\f\u0001"+
		"%\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005Q\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0004\u000b^\b\u000b\u000b\u000b\f\u000b_\u0001\f\u0004\fc\b\f\u000b"+
		"\f\f\fd\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u0001\u0000\u0002\u0003\u0000\n\n\r\r\"\"\u0003"+
		"\u0000\t\n\r\r  s\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000"+
		"\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000"+
		"\u00071\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000bP\u0001"+
		"\u0000\u0000\u0000\rR\u0001\u0000\u0000\u0000\u000fT\u0001\u0000\u0000"+
		"\u0000\u0011V\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000\u0015"+
		"Z\u0001\u0000\u0000\u0000\u0017]\u0001\u0000\u0000\u0000\u0019b\u0001"+
		"\u0000\u0000\u0000\u001b\u001e\u0003\u0003\u0001\u0000\u001c\u001e\u0003"+
		"\u0007\u0003\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f#\u0003\u000b"+
		"\u0005\u0000 \"\u0003\u0005\u0002\u0000! \u0001\u0000\u0000\u0000\"%\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$\u0004\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&0\u0003\r\u0006"+
		"\u0000\'(\u0003\u0013\t\u0000()\u0003\r\u0006\u0000)*\u0003\u0013\t\u0000"+
		"*0\u0001\u0000\u0000\u0000+,\u0003\u0015\n\u0000,-\u0003\r\u0006\u0000"+
		"-.\u0003\u0015\n\u0000.0\u0001\u0000\u0000\u0000/&\u0001\u0000\u0000\u0000"+
		"/\'\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000\u00000\u0006\u0001\u0000"+
		"\u0000\u000012\u0003\u0011\b\u000023\u0005=\u0000\u000034\u0003\t\u0004"+
		"\u00004\b\u0001\u0000\u0000\u00005?\u0003\u000f\u0007\u000067\u0003\u0013"+
		"\t\u000078\u0003\u000f\u0007\u000089\u0003\u0013\t\u00009?\u0001\u0000"+
		"\u0000\u0000:;\u0003\u0015\n\u0000;<\u0003\u000f\u0007\u0000<=\u0003\u0015"+
		"\n\u0000=?\u0001\u0000\u0000\u0000>5\u0001\u0000\u0000\u0000>6\u0001\u0000"+
		"\u0000\u0000>:\u0001\u0000\u0000\u0000?\n\u0001\u0000\u0000\u0000@A\u0005"+
		"c\u0000\u0000AB\u0005a\u0000\u0000BQ\u0005t\u0000\u0000CD\u0005e\u0000"+
		"\u0000DE\u0005c\u0000\u0000EF\u0005h\u0000\u0000FQ\u0005o\u0000\u0000"+
		"GH\u0005e\u0000\u0000HI\u0005x\u0000\u0000IJ\u0005i\u0000\u0000JQ\u0005"+
		"t\u0000\u0000KL\u0005p\u0000\u0000LM\u0005w\u0000\u0000MQ\u0005d\u0000"+
		"\u0000NO\u0005w\u0000\u0000OQ\u0005c\u0000\u0000P@\u0001\u0000\u0000\u0000"+
		"PC\u0001\u0000\u0000\u0000PG\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000Q\f\u0001\u0000\u0000\u0000RS\u0003\u0017"+
		"\u000b\u0000S\u000e\u0001\u0000\u0000\u0000TU\u0003\u0017\u000b\u0000"+
		"U\u0010\u0001\u0000\u0000\u0000VW\u0003\u0017\u000b\u0000W\u0012\u0001"+
		"\u0000\u0000\u0000XY\u0005\'\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000"+
		"Z[\u0005\"\u0000\u0000[\u0016\u0001\u0000\u0000\u0000\\^\b\u0000\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0018\u0001\u0000\u0000\u0000"+
		"ac\u0007\u0001\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fg\u0006\f\u0000\u0000g\u001a\u0001\u0000\u0000\u0000\b\u0000"+
		"\u001d#/>P_d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}