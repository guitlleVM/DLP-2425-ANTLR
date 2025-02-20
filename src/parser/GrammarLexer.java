// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, LITENT=15, LITREAL=16, 
		CHAR_LITERAL=17, ID=18, LINE_COMMENT=19, MULTILINE_COMMENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "LITENT", "LITREAL", "CHAR_LITERAL", 
			"ID", "LINE_COMMENT", "MULTILINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'{'", "'}'", "'var'", "'('", "')'", "':'", "','", 
			"';'", "'['", "']'", "'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "LITENT", "LITREAL", "CHAR_LITERAL", "ID", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\u0004\u0000\u0015\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000eY\b\u000e\u000b\u000e"+
		"\f\u000eZ\u0001\u000f\u0004\u000f^\b\u000f\u000b\u000f\f\u000f_\u0001"+
		"\u000f\u0001\u000f\u0004\u000fd\b\u000f\u000b\u000f\f\u000fe\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010o\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011s\b\u0011\n\u0011"+
		"\f\u0011v\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012|\b\u0012\n\u0012\f\u0012\u007f\t\u0012\u0001\u0012\u0003\u0012"+
		"\u0082\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u008a\b\u0013\n\u0013\f\u0013\u008d\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0004"+
		"\u0014\u0095\b\u0014\u000b\u0014\f\u0014\u0096\u0001\u0014\u0001\u0014"+
		"\u0002}\u008b\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015\u0001\u0000\u0006\u0001\u000009\u0002\u0000\n\n\r\r\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0001\u0001\n\n\u0003\u0000\t\n\r\r "+
		" \u00a1\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000"+
		"\u00054\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000\u0000\t:\u0001"+
		"\u0000\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\r>\u0001\u0000\u0000"+
		"\u0000\u000f@\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013"+
		"D\u0001\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017H\u0001"+
		"\u0000\u0000\u0000\u0019L\u0001\u0000\u0000\u0000\u001bR\u0001\u0000\u0000"+
		"\u0000\u001dX\u0001\u0000\u0000\u0000\u001f]\u0001\u0000\u0000\u0000!"+
		"n\u0001\u0000\u0000\u0000#p\u0001\u0000\u0000\u0000%w\u0001\u0000\u0000"+
		"\u0000\'\u0085\u0001\u0000\u0000\u0000)\u0094\u0001\u0000\u0000\u0000"+
		"+,\u0005s\u0000\u0000,-\u0005t\u0000\u0000-.\u0005r\u0000\u0000./\u0005"+
		"u\u0000\u0000/0\u0005c\u0000\u000001\u0005t\u0000\u00001\u0002\u0001\u0000"+
		"\u0000\u000023\u0005{\u0000\u00003\u0004\u0001\u0000\u0000\u000045\u0005"+
		"}\u0000\u00005\u0006\u0001\u0000\u0000\u000067\u0005v\u0000\u000078\u0005"+
		"a\u0000\u000089\u0005r\u0000\u00009\b\u0001\u0000\u0000\u0000:;\u0005"+
		"(\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005)\u0000\u0000=\f\u0001"+
		"\u0000\u0000\u0000>?\u0005:\u0000\u0000?\u000e\u0001\u0000\u0000\u0000"+
		"@A\u0005,\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005;\u0000\u0000"+
		"C\u0012\u0001\u0000\u0000\u0000DE\u0005[\u0000\u0000E\u0014\u0001\u0000"+
		"\u0000\u0000FG\u0005]\u0000\u0000G\u0016\u0001\u0000\u0000\u0000HI\u0005"+
		"i\u0000\u0000IJ\u0005n\u0000\u0000JK\u0005t\u0000\u0000K\u0018\u0001\u0000"+
		"\u0000\u0000LM\u0005f\u0000\u0000MN\u0005l\u0000\u0000NO\u0005o\u0000"+
		"\u0000OP\u0005a\u0000\u0000PQ\u0005t\u0000\u0000Q\u001a\u0001\u0000\u0000"+
		"\u0000RS\u0005c\u0000\u0000ST\u0005h\u0000\u0000TU\u0005a\u0000\u0000"+
		"UV\u0005r\u0000\u0000V\u001c\u0001\u0000\u0000\u0000WY\u0007\u0000\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u001e\u0001\u0000\u0000\u0000"+
		"\\^\u0007\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ac\u0005.\u0000\u0000bd\u0007\u0000\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000f \u0001\u0000\u0000\u0000gh\u0005\'\u0000\u0000hi\b"+
		"\u0001\u0000\u0000io\u0005\'\u0000\u0000jk\u0005\'\u0000\u0000kl\u0005"+
		"\\\u0000\u0000lm\u0005n\u0000\u0000mo\u0005\'\u0000\u0000ng\u0001\u0000"+
		"\u0000\u0000nj\u0001\u0000\u0000\u0000o\"\u0001\u0000\u0000\u0000pt\u0007"+
		"\u0002\u0000\u0000qs\u0007\u0003\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000u$\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005/\u0000"+
		"\u0000xy\u0005/\u0000\u0000y}\u0001\u0000\u0000\u0000z|\t\u0000\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0082\u0007\u0004\u0000\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0006\u0012\u0000\u0000\u0084&\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005/\u0000\u0000\u0086\u0087\u0005*\u0000\u0000\u0087\u008b\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\t\u0000\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005*\u0000"+
		"\u0000\u008f\u0090\u0005/\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0006\u0013\u0000\u0000\u0092(\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0007\u0005\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0006\u0014\u0000\u0000\u0099*\u0001\u0000\u0000\u0000\n\u0000"+
		"Z_ent}\u0081\u008b\u0096\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}