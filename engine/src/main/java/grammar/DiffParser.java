// Generated from /home/david/eclipse-workspace/SimmDiffUppaal/engine/src/main/java/grammar/DiffParser.g4 by ANTLR 4.10.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiffParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AT=1, COMMENT=2, Newlines=3, PLUS=4, NEG=5, DIGIT=6, COMMA=7, SEA_WS=8, 
		TEXT=9;
	public static final int
		RULE_document = 0, RULE_line = 1, RULE_chardata = 2, RULE_anything = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "line", "chardata", "anything"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@@'", null, null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AT", "COMMENT", "Newlines", "PLUS", "NEG", "DIGIT", "COMMA", "SEA_WS", 
			"TEXT"
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
	public String getGrammarFileName() { return "DiffParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiffParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public List<AnythingContext> anything() {
			return getRuleContexts(AnythingContext.class);
		}
		public AnythingContext anything(int i) {
			return getRuleContext(AnythingContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiffParserVisitor ) return ((DiffParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(9); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(8);
						line();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(11); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(13);
				anything();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
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

	public static class LineContext extends ParserRuleContext {
		public List<TerminalNode> AT() { return getTokens(DiffParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(DiffParser.AT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(DiffParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiffParser.DIGIT, i);
		}
		public TerminalNode COMMA() { return getToken(DiffParser.COMMA, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiffParserVisitor ) return ((DiffParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(AT);
			setState(20);
			match(DIGIT);
			setState(21);
			match(COMMA);
			setState(22);
			match(DIGIT);
			setState(23);
			match(AT);
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

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DiffParser.TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(DiffParser.SEA_WS, 0); }
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).enterChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).exitChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiffParserVisitor ) return ((DiffParserVisitor<? extends T>)visitor).visitChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AnythingContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(DiffParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(DiffParser.COMMENT, i);
		}
		public AnythingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anything; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).enterAnything(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).exitAnything(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiffParserVisitor ) return ((DiffParserVisitor<? extends T>)visitor).visitAnything(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnythingContext anything() throws RecognitionException {
		AnythingContext _localctx = new AnythingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anything);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(27);
				chardata();
				}
			}

			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				{
				setState(30);
				match(COMMENT);
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(31);
					chardata();
					}
				}

				}
				}
				setState(38);
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

	public static final String _serializedATN =
		"\u0004\u0001\t(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0003\u0003\u001d\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003!\b\u0003"+
		"\u0005\u0003#\b\u0003\n\u0003\f\u0003&\t\u0003\u0001\u0003\u0000\u0000"+
		"\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\b\t(\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u0019"+
		"\u0001\u0000\u0000\u0000\u0006\u001c\u0001\u0000\u0000\u0000\b\n\u0003"+
		"\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000"+
		"\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000"+
		"\f\r\u0001\u0000\u0000\u0000\r\u000e\u0003\u0006\u0003\u0000\u000e\u0010"+
		"\u0001\u0000\u0000\u0000\u000f\t\u0001\u0000\u0000\u0000\u0010\u0011\u0001"+
		"\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001"+
		"\u0000\u0000\u0000\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0005"+
		"\u0001\u0000\u0000\u0014\u0015\u0005\u0006\u0000\u0000\u0015\u0016\u0005"+
		"\u0007\u0000\u0000\u0016\u0017\u0005\u0006\u0000\u0000\u0017\u0018\u0005"+
		"\u0001\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001a\u0007"+
		"\u0000\u0000\u0000\u001a\u0005\u0001\u0000\u0000\u0000\u001b\u001d\u0003"+
		"\u0004\u0002\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d$\u0001\u0000\u0000\u0000\u001e \u0005\u0002\u0000"+
		"\u0000\u001f!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000 "+
		"!\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\"\u001e\u0001\u0000"+
		"\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%\u0007\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000\u0005\u000b\u0011\u001c $";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}