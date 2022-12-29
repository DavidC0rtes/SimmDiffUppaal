// Generated from /home/david/eclipse-workspace/SimmDiffUppaal/engine/src/main/java/grammar/DiffLexer.g4 by ANTLR 4.10.1
package grammar;
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
		COMMA=9, MINUS=10, SUM=11, DIGIT=12, WS=13;
	public static final int
		ANNOTATION=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "ANNOTATION"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AT", "COMMENT", "Newlines", "PLUS", "NEG", "SEA_WS", "TEXT", "AT_CLOSE", 
			"COMMA", "MINUS", "SUM", "DIGIT", "WS"
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
			"COMMA", "MINUS", "SUM", "DIGIT", "WS"
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
		"\u0004\u0000\rq\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001"+
		"+\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0004\u00022\b\u0002\u000b\u0002\f\u00023\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003;\b\u0003\u000b\u0003\f\u0003"+
		"<\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004H\b\u0004\u000b\u0004"+
		"\f\u0004I\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005R\b\u0005\u0001\u0005\u0004\u0005U\b\u0005\u000b"+
		"\u0005\f\u0005V\u0001\u0006\u0004\u0006Z\b\u0006\u000b\u0006\f\u0006["+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004\u000bj\b\u000b\u000b"+
		"\u000b\f\u000bk\u0001\f\u0001\f\u0001\f\u0001\f\u0001)\u0000\r\u0002\u0001"+
		"\u0004\u0002\u0006\u0003\b\u0004\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012"+
		"\t\u0014\n\u0016\u000b\u0018\f\u001a\r\u0002\u0000\u0001\u0004\u0002\u0000"+
		"\n\n\r\r\u0001\u0000@@\u0002\u0000\t\t  \u0001\u000009x\u0000\u0002\u0001"+
		"\u0000\u0000\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0000\u0006\u0001"+
		"\u0000\u0000\u0000\u0000\b\u0001\u0000\u0000\u0000\u0000\n\u0001\u0000"+
		"\u0000\u0000\u0000\f\u0001\u0000\u0000\u0000\u0000\u000e\u0001\u0000\u0000"+
		"\u0000\u0001\u0010\u0001\u0000\u0000\u0000\u0001\u0012\u0001\u0000\u0000"+
		"\u0000\u0001\u0014\u0001\u0000\u0000\u0000\u0001\u0016\u0001\u0000\u0000"+
		"\u0000\u0001\u0018\u0001\u0000\u0000\u0000\u0001\u001a\u0001\u0000\u0000"+
		"\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000"+
		"\u00061\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\nB\u0001\u0000"+
		"\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000eY\u0001\u0000\u0000\u0000"+
		"\u0010]\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000\u0014d"+
		"\u0001\u0000\u0000\u0000\u0016f\u0001\u0000\u0000\u0000\u0018i\u0001\u0000"+
		"\u0000\u0000\u001am\u0001\u0000\u0000\u0000\u001c\u001d\u0005@\u0000\u0000"+
		"\u001d\u001e\u0005@\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		" \u0006\u0000\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005<\u0000"+
		"\u0000\"#\u0005!\u0000\u0000#$\u0005-\u0000\u0000$%\u0005-\u0000\u0000"+
		"%)\u0001\u0000\u0000\u0000&(\t\u0000\u0000\u0000\'&\u0001\u0000\u0000"+
		"\u0000(+\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005"+
		"-\u0000\u0000-.\u0005-\u0000\u0000./\u0005>\u0000\u0000/\u0005\u0001\u0000"+
		"\u0000\u000002\u0007\u0000\u0000\u000010\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"4\u0007\u0001\u0000\u0000\u000056\u0005+\u0000\u000067\u0005+\u0000\u0000"+
		"78\u0005+\u0000\u00008:\u0001\u0000\u0000\u00009;\b\u0001\u0000\u0000"+
		":9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0003\u0006"+
		"\u0002\u0000?@\u0001\u0000\u0000\u0000@A\u0006\u0003\u0001\u0000A\t\u0001"+
		"\u0000\u0000\u0000BC\u0005-\u0000\u0000CD\u0005-\u0000\u0000DE\u0005-"+
		"\u0000\u0000EG\u0001\u0000\u0000\u0000FH\b\u0001\u0000\u0000GF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0003\u0006\u0002\u0000"+
		"LM\u0001\u0000\u0000\u0000MN\u0006\u0004\u0001\u0000N\u000b\u0001\u0000"+
		"\u0000\u0000OU\u0007\u0002\u0000\u0000PR\u0005\r\u0000\u0000QP\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0005"+
		"\n\u0000\u0000TO\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"W\r\u0001\u0000\u0000\u0000XZ\b\u0001\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\\u000f\u0001\u0000\u0000\u0000]^\u0005@\u0000\u0000^_\u0005"+
		"@\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0006\u0007\u0002\u0000a\u0011"+
		"\u0001\u0000\u0000\u0000bc\u0005,\u0000\u0000c\u0013\u0001\u0000\u0000"+
		"\u0000de\u0005-\u0000\u0000e\u0015\u0001\u0000\u0000\u0000fg\u0005+\u0000"+
		"\u0000g\u0017\u0001\u0000\u0000\u0000hj\u0007\u0003\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000l\u0019\u0001\u0000\u0000\u0000mn\u0007\u0002"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000op\u0006\f\u0001\u0000p\u001b\u0001"+
		"\u0000\u0000\u0000\u000b\u0000\u0001)3<IQTV[k\u0003\u0005\u0001\u0000"+
		"\u0006\u0000\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}