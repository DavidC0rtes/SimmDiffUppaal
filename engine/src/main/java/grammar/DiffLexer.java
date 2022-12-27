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
		COMMA=9, MINUS=10, SUM=11, DIGIT=12;
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
			"COMMA", "MINUS", "SUM", "DIGIT"
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
			"COMMA", "MINUS", "SUM", "DIGIT"
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
		"\u0004\u0000\fk\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0002\u000b\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u00020\b"+
		"\u0002\u000b\u0002\f\u00021\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u00039\b\u0003\u000b\u0003\f\u0003:\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004F\b\u0004\u000b\u0004\f\u0004G\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005P\b\u0005\u0001\u0005\u0004\u0005S\b\u0005\u000b\u0005\f\u0005T"+
		"\u0001\u0006\u0004\u0006X\b\u0006\u000b\u0006\f\u0006Y\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0004\u000bh\b\u000b\u000b\u000b\f\u000b"+
		"i\u0001\'\u0000\f\u0002\u0001\u0004\u0002\u0006\u0003\b\u0004\n\u0005"+
		"\f\u0006\u000e\u0007\u0010\b\u0012\t\u0014\n\u0016\u000b\u0018\f\u0002"+
		"\u0000\u0001\u0004\u0002\u0000\n\n\r\r\u0001\u0000@@\u0002\u0000\t\t "+
		" \u0001\u000009r\u0000\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001"+
		"\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000"+
		"\u0000\u0000\u0000\n\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000\u0000"+
		"\u0000\u0000\u000e\u0001\u0000\u0000\u0000\u0001\u0010\u0001\u0000\u0000"+
		"\u0000\u0001\u0012\u0001\u0000\u0000\u0000\u0001\u0014\u0001\u0000\u0000"+
		"\u0000\u0001\u0016\u0001\u0000\u0000\u0000\u0001\u0018\u0001\u0000\u0000"+
		"\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000"+
		"\u0000\u0006/\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n@\u0001"+
		"\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000"+
		"\u0000\u0010[\u0001\u0000\u0000\u0000\u0012`\u0001\u0000\u0000\u0000\u0014"+
		"b\u0001\u0000\u0000\u0000\u0016d\u0001\u0000\u0000\u0000\u0018g\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005@\u0000\u0000\u001b\u001c\u0005@\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0006\u0000\u0000"+
		"\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005<\u0000\u0000 "+
		"!\u0005!\u0000\u0000!\"\u0005-\u0000\u0000\"#\u0005-\u0000\u0000#\'\u0001"+
		"\u0000\u0000\u0000$&\t\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005-\u0000\u0000"+
		"+,\u0005-\u0000\u0000,-\u0005>\u0000\u0000-\u0005\u0001\u0000\u0000\u0000"+
		".0\u0007\u0000\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0007\u0001"+
		"\u0000\u0000\u000034\u0005+\u0000\u000045\u0005+\u0000\u000056\u0005+"+
		"\u0000\u000068\u0001\u0000\u0000\u000079\b\u0001\u0000\u000087\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0003\u0006\u0002\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0006\u0003\u0001\u0000?\t\u0001\u0000\u0000"+
		"\u0000@A\u0005-\u0000\u0000AB\u0005-\u0000\u0000BC\u0005-\u0000\u0000"+
		"CE\u0001\u0000\u0000\u0000DF\b\u0001\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IJ\u0003\u0006\u0002\u0000JK\u0001\u0000"+
		"\u0000\u0000KL\u0006\u0004\u0001\u0000L\u000b\u0001\u0000\u0000\u0000"+
		"MS\u0007\u0002\u0000\u0000NP\u0005\r\u0000\u0000ON\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0005\n\u0000\u0000"+
		"RM\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\r\u0001\u0000"+
		"\u0000\u0000VX\b\u0001\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u000f"+
		"\u0001\u0000\u0000\u0000[\\\u0005@\u0000\u0000\\]\u0005@\u0000\u0000]"+
		"^\u0001\u0000\u0000\u0000^_\u0006\u0007\u0002\u0000_\u0011\u0001\u0000"+
		"\u0000\u0000`a\u0005,\u0000\u0000a\u0013\u0001\u0000\u0000\u0000bc\u0005"+
		"-\u0000\u0000c\u0015\u0001\u0000\u0000\u0000de\u0005+\u0000\u0000e\u0017"+
		"\u0001\u0000\u0000\u0000fh\u0007\u0003\u0000\u0000gf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000j\u0019\u0001\u0000\u0000\u0000\u000b\u0000\u0001\'1:GORT"+
		"Yi\u0003\u0005\u0001\u0000\u0006\u0000\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}