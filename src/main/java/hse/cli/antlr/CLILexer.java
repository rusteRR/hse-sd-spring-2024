// Generated from CLI.g4 by ANTLR 4.13.1

package hse.cli.antlr;

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
		T__0=1, EnvVar=2, CommandName=3, Arg=4, StrValue=5, NumValue=6, SPACE=7, 
		PIPE=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LOWERCASE", "UPPERCASE", "DIGIT", "QUOTA", "DQUOTA", "EOL", 
			"ALL", "EnvVar", "CommandName", "Arg", "StrValue", "NumValue", "SPACE", 
			"PIPE"
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
			"PIPE"
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
		"\u0004\u0000\bv\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0004\b4\b\b\u000b\b\f\b5\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t<"+
		"\b\t\u000b\t\f\t=\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\nE\b\n"+
		"\u000b\n\f\nF\u0001\u000b\u0001\u000b\u0004\u000bK\b\u000b\u000b\u000b"+
		"\f\u000bL\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"S\b\u000b\u000b\u000b\f\u000bT\u0001\u000b\u0001\u000b\u0003\u000bY\b"+
		"\u000b\u0001\f\u0004\f\\\b\f\u000b\f\f\f]\u0001\f\u0001\f\u0004\fb\b\f"+
		"\u000b\f\f\fc\u0003\ff\b\f\u0001\r\u0001\r\u0001\u000e\u0005\u000ek\b"+
		"\u000e\n\u000e\f\u000en\t\u000e\u0001\u000e\u0001\u000e\u0005\u000er\b"+
		"\u000e\n\u000e\f\u000eu\t\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0000"+
		"\u0005\u0000\u0007\u0000\t\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011"+
		"\u0002\u0013\u0003\u0015\u0004\u0017\u0005\u0019\u0006\u001b\u0007\u001d"+
		"\b\u0001\u0000\b\u0001\u0000az\u0001\u0000AZ\u0001\u000009\u0002\u0000"+
		"\n\n\r\r\u0002\u0000\"\"\'\'\u0002\u0000--__\u0002\u0000,,..\u0002\u0000"+
		"\t\t  \u0080\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000"+
		"\u0000\u0005#\u0001\u0000\u0000\u0000\u0007%\u0001\u0000\u0000\u0000\t"+
		"\'\u0001\u0000\u0000\u0000\u000b)\u0001\u0000\u0000\u0000\r+\u0001\u0000"+
		"\u0000\u0000\u000f-\u0001\u0000\u0000\u0000\u0011/\u0001\u0000\u0000\u0000"+
		"\u00137\u0001\u0000\u0000\u0000\u0015?\u0001\u0000\u0000\u0000\u0017X"+
		"\u0001\u0000\u0000\u0000\u0019[\u0001\u0000\u0000\u0000\u001bg\u0001\u0000"+
		"\u0000\u0000\u001dl\u0001\u0000\u0000\u0000\u001f \u0005=\u0000\u0000"+
		" \u0002\u0001\u0000\u0000\u0000!\"\u0007\u0000\u0000\u0000\"\u0004\u0001"+
		"\u0000\u0000\u0000#$\u0007\u0001\u0000\u0000$\u0006\u0001\u0000\u0000"+
		"\u0000%&\u0007\u0002\u0000\u0000&\b\u0001\u0000\u0000\u0000\'(\u0005\'"+
		"\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005\"\u0000\u0000*\f\u0001"+
		"\u0000\u0000\u0000+,\u0007\u0003\u0000\u0000,\u000e\u0001\u0000\u0000"+
		"\u0000-.\b\u0004\u0000\u0000.\u0010\u0001\u0000\u0000\u0000/3\u0003\u0005"+
		"\u0002\u000004\u0003\u0005\u0002\u000014\u0003\u0007\u0003\u000024\u0007"+
		"\u0005\u0000\u000030\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"32\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u00006\u0012\u0001\u0000\u0000\u00007;\u0003"+
		"\u0003\u0001\u00008<\u0003\u0003\u0001\u00009<\u0003\u0007\u0003\u0000"+
		":<\u0007\u0005\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0014\u0001\u0000\u0000\u0000"+
		"?D\u0003\u001b\r\u0000@E\u0003\u0003\u0001\u0000AE\u0003\u0005\u0002\u0000"+
		"BE\u0003\u0007\u0003\u0000CE\u0007\u0005\u0000\u0000D@\u0001\u0000\u0000"+
		"\u0000DA\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000G\u0016\u0001\u0000\u0000\u0000HJ\u0003\t\u0004\u0000"+
		"IK\u0003\u000f\u0007\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NO\u0003\t\u0004\u0000OY\u0001\u0000\u0000\u0000PR\u0003\u000b"+
		"\u0005\u0000QS\u0003\u000f\u0007\u0000RQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u0003\u000b\u0005\u0000WY\u0001\u0000\u0000"+
		"\u0000XH\u0001\u0000\u0000\u0000XP\u0001\u0000\u0000\u0000Y\u0018\u0001"+
		"\u0000\u0000\u0000Z\\\u0003\u0007\u0003\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^e\u0001\u0000\u0000\u0000_a\u0007\u0006\u0000\u0000`b\u0003\u0007"+
		"\u0003\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000"+
		"e_\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u001a\u0001\u0000"+
		"\u0000\u0000gh\u0007\u0007\u0000\u0000h\u001c\u0001\u0000\u0000\u0000"+
		"ik\u0003\u001b\r\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000os\u0005|\u0000\u0000pr\u0003\u001b\r"+
		"\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000t\u001e\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000\u000f\u000035;=DFLTX]cels\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}