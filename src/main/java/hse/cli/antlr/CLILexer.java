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
		"\u0001\u0004\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"C\b\u0005\n\u0005\f\u0005F\t\u0005\u0001\u0006\u0004\u0006I\b\u0006\u000b"+
		"\u0006\f\u0006J\u0001\u0007\u0004\u0007N\b\u0007\u000b\u0007\f\u0007O"+
		"\u0001\b\u0001\b\u0005\bT\b\b\n\b\f\bW\t\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000b^\b\u000b\u000b\u000b\f\u000b_\u0001\f\u0004"+
		"\fc\b\f\u000b\f\f\fd\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0006\u0001\u0000az\u0004\u0000"+
		"--09__az\u0005\u0000--09AZ__az\u0004\u0000\t\n\r\r\"\"\'\'\u0003\u0000"+
		"\n\n\r\r\"\"\u0003\u0000\t\n\r\r  s\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001d"+
		"\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005/\u0001"+
		"\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000"+
		"\u0000\u000b@\u0001\u0000\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000f"+
		"M\u0001\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000\u0013X\u0001"+
		"\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017]\u0001\u0000\u0000"+
		"\u0000\u0019b\u0001\u0000\u0000\u0000\u001b\u001e\u0003\u0003\u0001\u0000"+
		"\u001c\u001e\u0003\u0007\u0003\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000"+
		"\u001f#\u0003\u000b\u0005\u0000 \"\u0003\u0005\u0002\u0000! \u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000&0\u0003\r\u0006\u0000\'(\u0003\u0013\t\u0000()\u0003\r\u0006\u0000"+
		")*\u0003\u0013\t\u0000*0\u0001\u0000\u0000\u0000+,\u0003\u0015\n\u0000"+
		",-\u0003\r\u0006\u0000-.\u0003\u0015\n\u0000.0\u0001\u0000\u0000\u0000"+
		"/&\u0001\u0000\u0000\u0000/\'\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000"+
		"\u00000\u0006\u0001\u0000\u0000\u000012\u0003\u0011\b\u000023\u0005=\u0000"+
		"\u000034\u0003\t\u0004\u00004\b\u0001\u0000\u0000\u00005?\u0003\u000f"+
		"\u0007\u000067\u0003\u0013\t\u000078\u0003\u000f\u0007\u000089\u0003\u0013"+
		"\t\u00009?\u0001\u0000\u0000\u0000:;\u0003\u0015\n\u0000;<\u0003\u000f"+
		"\u0007\u0000<=\u0003\u0015\n\u0000=?\u0001\u0000\u0000\u0000>5\u0001\u0000"+
		"\u0000\u0000>6\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000?\n\u0001"+
		"\u0000\u0000\u0000@D\u0007\u0000\u0000\u0000AC\u0007\u0001\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000E\f\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000GI\u0007\u0002\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"K\u000e\u0001\u0000\u0000\u0000LN\b\u0003\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000P\u0010\u0001\u0000\u0000\u0000QU\u0007\u0000\u0000\u0000"+
		"RT\u0007\u0001\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0012\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\'\u0000\u0000Y\u0014"+
		"\u0001\u0000\u0000\u0000Z[\u0005\"\u0000\u0000[\u0016\u0001\u0000\u0000"+
		"\u0000\\^\b\u0004\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0018"+
		"\u0001\u0000\u0000\u0000ac\u0007\u0005\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0006\f\u0000\u0000g\u001a\u0001"+
		"\u0000\u0000\u0000\u000b\u0000\u001d#/>DJOU_d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}