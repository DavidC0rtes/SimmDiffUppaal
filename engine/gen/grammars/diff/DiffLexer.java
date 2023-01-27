// Generated from /home/david/eclipse-workspace/SimmDiffUppaal/engine/src/main/java/grammars/diff/DiffLexer.g4 by ANTLR 4.10.1
package grammars.diff;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiffLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AT=1, COMMENT=2, Newlines=3, PLUS=4, NEG=5, SEA_WS=6, TEXT=7, AT_CLOSE=8, 
		COMMA=9, MINUS=10, SUM=11, DIGIT=12, WS=13, TEXT2=14, SUM2=15;
	public static final int
		ANNOTATION=1, CHANGES=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "ANNOTATION", "CHANGES"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AT", "COMMENT", "Newlines", "PLUS", "NEG", "SEA_WS", "TEXT", "AT_CLOSE", 
			"COMMA", "MINUS", "SUM", "DIGIT", "WS", "TEXT2", "SUM2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "','", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AT", "COMMENT", "Newlines", "PLUS", "NEG", "SEA_WS", "TEXT", "AT_CLOSE", 
			"COMMA", "MINUS", "SUM", "DIGIT", "WS", "TEXT2", "SUM2"
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


	public DiffLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DiffLexer.g4"; }

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
		"\u0004\u0000\u000f}\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff"+
		"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002"+
		"\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005"+
		"\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002"+
		"\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002"+
		"\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002"+
		"7\b\u0002\u000b\u0002\f\u00028\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003@\b\u0003\u000b\u0003\f\u0003A\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004M\b\u0004\u000b\u0004\f\u0004N\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005W\b\u0005\u0001\u0005\u0004\u0005Z\b\u0005\u000b\u0005\f\u0005["+
		"\u0001\u0006\u0004\u0006_\b\u0006\u000b\u0006\f\u0006`\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0004\u000bo\b\u000b\u000b\u000b\f\u000b"+
		"p\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\rx\b\r\u000b\r\f\ry\u0001"+
		"\u000e\u0001\u000e\u0001.\u0000\u000f\u0003\u0001\u0005\u0002\u0007\u0003"+
		"\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017"+
		"\u000b\u0019\f\u001b\r\u001d\u000e\u001f\u000f\u0003\u0000\u0001\u0002"+
		"\u0005\u0002\u0000\n\n\r\r\u0001\u0000@@\u0002\u0000\t\t  \u0001\u0000"+
		"09\u0002\u0000+,@@\u0084\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000"+
		"\u0000\u0000\u0001\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001\u0000"+
		"\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000"+
		"\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000"+
		"\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000"+
		"\u0000\u0005&\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000\u0000\t"+
		":\u0001\u0000\u0000\u0000\u000bG\u0001\u0000\u0000\u0000\rY\u0001\u0000"+
		"\u0000\u0000\u000f^\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000"+
		"\u0013g\u0001\u0000\u0000\u0000\u0015i\u0001\u0000\u0000\u0000\u0017k"+
		"\u0001\u0000\u0000\u0000\u0019n\u0001\u0000\u0000\u0000\u001br\u0001\u0000"+
		"\u0000\u0000\u001dw\u0001\u0000\u0000\u0000\u001f{\u0001\u0000\u0000\u0000"+
		"!\"\u0005@\u0000\u0000\"#\u0005@\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$%\u0006\u0000\u0000\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005<\u0000"+
		"\u0000\'(\u0005!\u0000\u0000()\u0005-\u0000\u0000)*\u0005-\u0000\u0000"+
		"*.\u0001\u0000\u0000\u0000+-\t\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000"+
		"-0\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005-\u0000"+
		"\u000023\u0005-\u0000\u000034\u0005>\u0000\u00004\u0006\u0001\u0000\u0000"+
		"\u000057\u0007\u0000\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009\b\u0001"+
		"\u0000\u0000\u0000:;\u0005+\u0000\u0000;<\u0005+\u0000\u0000<=\u0005+"+
		"\u0000\u0000=?\u0001\u0000\u0000\u0000>@\b\u0001\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0003\u0007\u0002\u0000"+
		"DE\u0001\u0000\u0000\u0000EF\u0006\u0003\u0001\u0000F\n\u0001\u0000\u0000"+
		"\u0000GH\u0005-\u0000\u0000HI\u0005-\u0000\u0000IJ\u0005-\u0000\u0000"+
		"JL\u0001\u0000\u0000\u0000KM\b\u0001\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0003\u0007\u0002\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0006\u0004\u0001\u0000S\f\u0001\u0000\u0000\u0000TZ\u0007"+
		"\u0002\u0000\u0000UW\u0005\r\u0000\u0000VU\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0005\n\u0000\u0000YT\u0001"+
		"\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u000e\u0001\u0000"+
		"\u0000\u0000]_\b\u0001\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0010"+
		"\u0001\u0000\u0000\u0000bc\u0005@\u0000\u0000cd\u0005@\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000ef\u0006\u0007\u0002\u0000f\u0012\u0001\u0000\u0000"+
		"\u0000gh\u0005,\u0000\u0000h\u0014\u0001\u0000\u0000\u0000ij\u0005-\u0000"+
		"\u0000j\u0016\u0001\u0000\u0000\u0000kl\u0005+\u0000\u0000l\u0018\u0001"+
		"\u0000\u0000\u0000mo\u0007\u0003\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000q\u001a\u0001\u0000\u0000\u0000rs\u0007\u0002\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0006\f\u0001\u0000u\u001c\u0001\u0000\u0000\u0000"+
		"vx\b\u0004\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u001e\u0001\u0000"+
		"\u0000\u0000{|\u0005+\u0000\u0000| \u0001\u0000\u0000\u0000\r\u0000\u0001"+
		"\u0002.8ANVY[`py\u0003\u0005\u0001\u0000\u0006\u0000\u0000\u0005\u0002"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}