// Generated from c:/Users/guill/Desktop/DLP-2425-ANTLR-1/specifications/Tokenizer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Tokenizer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITENT=1, LITREAL=2, CHAR_LITERAL=3, ID=4, LINE_COMMENT=5, MULTILINE_COMMENT=6, 
		WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LITENT", "LITREAL", "CHAR_LITERAL", "ID", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITENT", "LITREAL", "CHAR_LITERAL", "ID", "LINE_COMMENT", "MULTILINE_COMMENT", 
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


	public Tokenizer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tokenizer.g4"; }

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
		"\u0004\u0000\u0007R\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0004\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0001\u0004"+
		"\u0001\u0016\b\u0001\u000b\u0001\f\u0001\u0017\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u001c\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\'\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003+\b\u0003\n\u0003"+
		"\f\u0003.\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u00044\b\u0004\n\u0004\f\u00047\t\u0004\u0001\u0004\u0003\u0004:\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005B\b\u0005\n\u0005\f\u0005E\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006M\b\u0006"+
		"\u000b\u0006\f\u0006N\u0001\u0006\u0001\u0006\u00025C\u0000\u0007\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u0001\u0000\u0006\u0001\u000009\u0002\u0000\n\n\r\r\u0003\u0000AZ__a"+
		"z\u0004\u000009AZ__az\u0001\u0001\n\n\u0003\u0000\t\n\r\r  Y\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0001\u0010\u0001\u0000\u0000\u0000\u0003\u0015\u0001\u0000"+
		"\u0000\u0000\u0005&\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000\u0000"+
		"\t/\u0001\u0000\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\rL\u0001\u0000"+
		"\u0000\u0000\u000f\u0011\u0007\u0000\u0000\u0000\u0010\u000f\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0002\u0001\u0000"+
		"\u0000\u0000\u0014\u0016\u0007\u0000\u0000\u0000\u0015\u0014\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000"+
		"\u0000\u0000\u0019\u001b\u0005.\u0000\u0000\u001a\u001c\u0007\u0000\u0000"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005\'\u0000\u0000"+
		" !\b\u0001\u0000\u0000!\'\u0005\'\u0000\u0000\"#\u0005\'\u0000\u0000#"+
		"$\u0005\\\u0000\u0000$%\u0005n\u0000\u0000%\'\u0005\'\u0000\u0000&\u001f"+
		"\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000\u0000\'\u0006\u0001\u0000"+
		"\u0000\u0000(,\u0007\u0002\u0000\u0000)+\u0007\u0003\u0000\u0000*)\u0001"+
		"\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-\b\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000/0\u0005/\u0000\u000001\u0005/\u0000\u000015\u0001\u0000\u0000\u0000"+
		"24\t\u0000\u0000\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000069\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u00008:\u0007\u0004\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0006\u0004\u0000\u0000<\n\u0001"+
		"\u0000\u0000\u0000=>\u0005/\u0000\u0000>?\u0005*\u0000\u0000?C\u0001\u0000"+
		"\u0000\u0000@B\t\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005*\u0000\u0000GH\u0005"+
		"/\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\u0005\u0000\u0000J\f\u0001"+
		"\u0000\u0000\u0000KM\u0007\u0005\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0006\u0006\u0000\u0000Q\u000e\u0001"+
		"\u0000\u0000\u0000\n\u0000\u0012\u0017\u001d&,59CN\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}