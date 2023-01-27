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
		COMMA=9, MINUS=10, SUM=11, DIGIT=12, WS=13, PREFIX=14, ANY=15, S=16;
	public static final int
		ANNOTATION=1, CHANGE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "ANNOTATION", "CHANGE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AT", "COMMENT", "Newlines", "PLUS", "NEG", "SEA_WS", "TEXT", "AT_CLOSE", 
			"COMMA", "MINUS", "SUM", "DIGIT", "WS", "PREFIX", "ANY", "S"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "','", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AT", "COMMENT", "Newlines", "PLUS", "NEG", "SEA_WS", "TEXT", "AT_CLOSE", 
			"COMMA", "MINUS", "SUM", "DIGIT", "WS", "PREFIX", "ANY", "S"
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
		"\u0004\u0000\u0010\u0086\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff"+
		"\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007"+
		"\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007"+
		"\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b"+
		"\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001/\b"+
		"\u0001\n\u0001\f\u00012\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0004\u00029\b\u0002\u000b\u0002\f\u0002:\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003B\b\u0003"+
		"\u000b\u0003\f\u0003C\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"O\b\u0004\u000b\u0004\f\u0004P\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0003\u0005Y\b\u0005\u0001\u0005\u0004"+
		"\u0005\\\b\u0005\u000b\u0005\f\u0005]\u0001\u0006\u0004\u0006a\b\u0006"+
		"\u000b\u0006\f\u0006b\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0004\u000bq\b\u000b\u000b\u000b\f\u000br\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0004\u000e|\b\u000e\u000b\u000e\f\u000e"+
		"}\u0001\u000f\u0004\u000f\u0081\b\u000f\u000b\u000f\f\u000f\u0082\u0001"+
		"\u000f\u0001\u000f\u00010\u0000\u0010\u0003\u0001\u0005\u0002\u0007\u0003"+
		"\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017"+
		"\u000b\u0019\f\u001b\r\u001d\u000e\u001f\u000f!\u0010\u0003\u0000\u0001"+
		"\u0002\u0006\u0002\u0000\n\n\r\r\u0001\u0000@@\u0002\u0000\t\t  \u0001"+
		"\u000009\u0002\u0000++--\u0003\u0000\n\n\r\r--\u008e\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000"+
		"\u0000\u0001\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000"+
		"\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000"+
		"\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000"+
		"\u0000\u0002!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005"+
		"(\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000\t<\u0001\u0000"+
		"\u0000\u0000\u000bI\u0001\u0000\u0000\u0000\r[\u0001\u0000\u0000\u0000"+
		"\u000f`\u0001\u0000\u0000\u0000\u0011d\u0001\u0000\u0000\u0000\u0013i"+
		"\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017m\u0001\u0000"+
		"\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001bt\u0001\u0000\u0000\u0000"+
		"\u001dx\u0001\u0000\u0000\u0000\u001f{\u0001\u0000\u0000\u0000!\u0080"+
		"\u0001\u0000\u0000\u0000#$\u0005@\u0000\u0000$%\u0005@\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\'\u0006\u0000\u0000\u0000\'\u0004\u0001\u0000\u0000"+
		"\u0000()\u0005<\u0000\u0000)*\u0005!\u0000\u0000*+\u0005-\u0000\u0000"+
		"+,\u0005-\u0000\u0000,0\u0001\u0000\u0000\u0000-/\t\u0000\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000034\u0005-\u0000\u000045\u0005-\u0000\u000056\u0005>\u0000"+
		"\u00006\u0006\u0001\u0000\u0000\u000079\u0007\u0000\u0000\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;\b\u0001\u0000\u0000\u0000<=\u0005+\u0000\u0000"+
		"=>\u0005+\u0000\u0000>?\u0005+\u0000\u0000?A\u0001\u0000\u0000\u0000@"+
		"B\b\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0003\u0007\u0002\u0000FG\u0001\u0000\u0000\u0000GH\u0006\u0003"+
		"\u0001\u0000H\n\u0001\u0000\u0000\u0000IJ\u0005-\u0000\u0000JK\u0005-"+
		"\u0000\u0000KL\u0005-\u0000\u0000LN\u0001\u0000\u0000\u0000MO\b\u0001"+
		"\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RS\u0003\u0007\u0002\u0000ST\u0001\u0000\u0000\u0000TU\u0006\u0004\u0001"+
		"\u0000U\f\u0001\u0000\u0000\u0000V\\\u0007\u0002\u0000\u0000WY\u0005\r"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\\\u0005\n\u0000\u0000[V\u0001\u0000\u0000\u0000[X"+
		"\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\u000e\u0001\u0000\u0000\u0000_a\b\u0001"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0010\u0001\u0000\u0000"+
		"\u0000de\u0005@\u0000\u0000ef\u0005@\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gh\u0006\u0007\u0002\u0000h\u0012\u0001\u0000\u0000\u0000ij\u0005,\u0000"+
		"\u0000j\u0014\u0001\u0000\u0000\u0000kl\u0005-\u0000\u0000l\u0016\u0001"+
		"\u0000\u0000\u0000mn\u0005+\u0000\u0000n\u0018\u0001\u0000\u0000\u0000"+
		"oq\u0007\u0003\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u001a\u0001"+
		"\u0000\u0000\u0000tu\u0007\u0002\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vw\u0006\f\u0001\u0000w\u001c\u0001\u0000\u0000\u0000xy\u0007\u0004\u0000"+
		"\u0000y\u001e\u0001\u0000\u0000\u0000z|\b\u0005\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0000\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0006\u000f\u0001"+
		"\u0000\u0085\"\u0001\u0000\u0000\u0000\u000e\u0000\u0001\u00020:CPX[]"+
		"br}\u0082\u0003\u0005\u0001\u0000\u0006\u0000\u0000\u0005\u0002\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}