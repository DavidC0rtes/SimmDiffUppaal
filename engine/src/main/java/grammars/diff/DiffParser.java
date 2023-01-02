// Generated from /home/david/eclipse-workspace/SimmDiffUppaal/engine/src/main/java/grammars/DiffParser.g4 by ANTLR 4.10.1
package grammars.diff;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiffParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AT=1, COMMENT=2, Newlines=3, PLUS=4, NEG=5, SEA_WS=6, TEXT=7, AT_CLOSE=8, 
		COMMA=9, MINUS=10, SUM=11, DIGIT=12, WS=13;
	public static final int
		RULE_document = 0, RULE_annotation = 1, RULE_lineRange = 2, RULE_chardata = 3, 
		RULE_anything = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "annotation", "lineRange", "chardata", "anything"
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
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
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(10);
						annotation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(13); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(15);
				anything();
				}
				}
				setState(19); 
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(DiffParser.AT, 0); }
		public TerminalNode MINUS() { return getToken(DiffParser.MINUS, 0); }
		public TerminalNode SUM() { return getToken(DiffParser.SUM, 0); }
		public TerminalNode AT_CLOSE() { return getToken(DiffParser.AT_CLOSE, 0); }
		public List<LineRangeContext> lineRange() {
			return getRuleContexts(LineRangeContext.class);
		}
		public LineRangeContext lineRange(int i) {
			return getRuleContext(LineRangeContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(DiffParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DiffParser.WS, i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiffParserVisitor ) return ((DiffParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(AT);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(22);
				match(WS);
				}
			}

			setState(25);
			match(MINUS);
			{
			setState(26);
			lineRange();
			}
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(27);
				match(WS);
				}
			}

			setState(30);
			match(SUM);
			{
			setState(31);
			lineRange();
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(32);
				match(WS);
				}
			}

			setState(35);
			match(AT_CLOSE);
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

	public static class LineRangeContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(DiffParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiffParser.DIGIT, i);
		}
		public TerminalNode COMMA() { return getToken(DiffParser.COMMA, 0); }
		public LineRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).enterLineRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).exitLineRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiffParserVisitor ) return ((DiffParserVisitor<? extends T>)visitor).visitLineRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineRangeContext lineRange() throws RecognitionException {
		LineRangeContext _localctx = new LineRangeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lineRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(DIGIT);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(38);
				match(COMMA);
				setState(39);
				match(DIGIT);
				}
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
		enterRule(_localctx, 6, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
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
		enterRule(_localctx, 8, RULE_anything);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(44);
				chardata();
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				{
				setState(47);
				match(COMMENT);
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(48);
					chardata();
					}
				}

				}
				}
				setState(55);
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
		"\u0004\u0001\r9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001d\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\""+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002)\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004.\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u00042\b\u0004\u0005\u00044\b\u0004\n\u0004"+
		"\f\u00047\t\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0001\u0001\u0000\u0006\u0007<\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000"+
		"\u0006*\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n\f\u0003\u0002"+
		"\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0001\u0000\u0000\u0000\u000f\u0010\u0003\b\u0004\u0000\u0010\u0012"+
		"\u0001\u0000\u0000\u0000\u0011\u000b\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0001\u0000\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0017"+
		"\u0005\u0001\u0000\u0000\u0016\u0018\u0005\r\u0000\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005\n\u0000\u0000\u001a\u001c\u0003\u0004"+
		"\u0002\u0000\u001b\u001d\u0005\r\u0000\u0000\u001c\u001b\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u000b\u0000\u0000\u001f!\u0003\u0004\u0002\u0000"+
		" \"\u0005\r\u0000\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#$\u0005\b\u0000\u0000$\u0003\u0001\u0000"+
		"\u0000\u0000%(\u0005\f\u0000\u0000&\'\u0005\t\u0000\u0000\')\u0005\f\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0005\u0001"+
		"\u0000\u0000\u0000*+\u0007\u0000\u0000\u0000+\u0007\u0001\u0000\u0000"+
		"\u0000,.\u0003\u0006\u0003\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.5\u0001\u0000\u0000\u0000/1\u0005\u0002\u0000\u000002\u0003"+
		"\u0006\u0003\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"24\u0001\u0000\u0000\u00003/\u0001\u0000\u0000\u000047\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\t\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u0000\t\r\u0013\u0017\u001c!(-15";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}