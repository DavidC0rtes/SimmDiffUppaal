// Generated from /home/david/eclipse-workspace/SimmDiffUppaal/engine/src/main/java/org.neocities.davidev.simmdiff.grammars/diff/DiffParser.g4 by ANTLR 4.10.1
package org.neocities.daviddev.simmdiff.grammars.diff;
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
		COMMA=9, MINUS=10, SUM=11, DIGIT=12, WS=13, PREFIX=14, ANY=15, S=16, QUOTE=17, 
		OPEN=18, CLOSE=19, COLOR=20, X=21, Y=22, EQUALS=23, STRING=24, ID=25, 
		LOC=26;
	public static final int
		RULE_document = 0, RULE_annotation = 1, RULE_lineRange = 2, RULE_chardata = 3, 
		RULE_anything = 4, RULE_label = 5, RULE_color = 6, RULE_coordinate = 7, 
		RULE_lineChange = 8, RULE_line = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "annotation", "lineRange", "chardata", "anything", "label", 
			"color", "coordinate", "lineChange", "line"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "','", "'-'", "'+'", 
			null, null, null, null, null, "'\"'", "'<'", "'>'", "'color'", "'x'", 
			"'y'", "'='", null, "'id'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AT", "COMMENT", "Newlines", "PLUS", "NEG", "SEA_WS", "TEXT", "AT_CLOSE", 
			"COMMA", "MINUS", "SUM", "DIGIT", "WS", "PREFIX", "ANY", "S", "QUOTE", 
			"OPEN", "CLOSE", "COLOR", "X", "Y", "EQUALS", "STRING", "ID", "LOC"
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
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public List<TerminalNode> SEA_WS() { return getTokens(DiffParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(DiffParser.SEA_WS, i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> S() { return getTokens(DiffParser.S); }
		public TerminalNode S(int i) {
			return getToken(DiffParser.S, i);
		}
		public List<TerminalNode> PREFIX() { return getTokens(DiffParser.PREFIX); }
		public TerminalNode PREFIX(int i) {
			return getToken(DiffParser.PREFIX, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			annotation();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(21);
				match(SEA_WS);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREFIX) {
					{
					setState(27);
					match(PREFIX);
					}
				}

				setState(30);
				label();
				setState(31);
				match(S);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PREFIX || _la==OPEN );
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
			setState(37);
			match(AT);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(38);
				match(WS);
				}
			}

			setState(41);
			match(MINUS);
			{
			setState(42);
			lineRange();
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(43);
				match(WS);
				}
			}

			setState(46);
			match(SUM);
			{
			setState(47);
			lineRange();
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(48);
				match(WS);
				}
			}

			setState(51);
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
			setState(53);
			match(DIGIT);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(54);
				match(COMMA);
				setState(55);
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
			setState(58);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==TEXT) {
				{
				setState(60);
				chardata();
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				{
				setState(63);
				match(COMMENT);
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEA_WS || _la==TEXT) {
					{
					setState(64);
					chardata();
					}
				}

				}
				}
				setState(71);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(DiffParser.OPEN, 0); }
		public TerminalNode LOC() { return getToken(DiffParser.LOC, 0); }
		public TerminalNode ID() { return getToken(DiffParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(DiffParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(DiffParser.STRING, 0); }
		public TerminalNode CLOSE() { return getToken(DiffParser.CLOSE, 0); }
		public AnythingContext anything() {
			return getRuleContext(AnythingContext.class,0);
		}
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiffParserVisitor ) return ((DiffParserVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(OPEN);
			setState(73);
			match(LOC);
			setState(74);
			match(ID);
			setState(75);
			match(EQUALS);
			setState(76);
			match(STRING);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==X || _la==Y) {
				{
				setState(77);
				coordinate();
				}
			}

			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR) {
				{
				setState(80);
				color();
				}
			}

			setState(83);
			match(CLOSE);
			setState(84);
			anything();
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DiffParser.COLOR, 0); }
		public TerminalNode EQUALS() { return getToken(DiffParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(DiffParser.STRING, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiffParserVisitor ) return ((DiffParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(COLOR);
			setState(87);
			match(EQUALS);
			setState(88);
			match(STRING);
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

	public static class CoordinateContext extends ParserRuleContext {
		public List<TerminalNode> EQUALS() { return getTokens(DiffParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(DiffParser.EQUALS, i);
		}
		public List<TerminalNode> STRING() { return getTokens(DiffParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DiffParser.STRING, i);
		}
		public List<TerminalNode> X() { return getTokens(DiffParser.X); }
		public TerminalNode X(int i) {
			return getToken(DiffParser.X, i);
		}
		public List<TerminalNode> Y() { return getTokens(DiffParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(DiffParser.Y, i);
		}
		public CoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).enterCoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).exitCoordinate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiffParserVisitor ) return ((DiffParserVisitor<? extends T>)visitor).visitCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinateContext coordinate() throws RecognitionException {
		CoordinateContext _localctx = new CoordinateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_coordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==X || _la==Y) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(91);
			match(EQUALS);
			setState(92);
			match(STRING);
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==X || _la==Y) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94);
			match(EQUALS);
			setState(95);
			match(STRING);
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

	public static class LineChangeContext extends ParserRuleContext {
		public TerminalNode PREFIX() { return getToken(DiffParser.PREFIX, 0); }
		public TerminalNode ANY() { return getToken(DiffParser.ANY, 0); }
		public TerminalNode QUOTE() { return getToken(DiffParser.QUOTE, 0); }
		public LineChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineChange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).enterLineChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiffParserListener ) ((DiffParserListener)listener).exitLineChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiffParserVisitor ) return ((DiffParserVisitor<? extends T>)visitor).visitLineChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineChangeContext lineChange() throws RecognitionException {
		LineChangeContext _localctx = new LineChangeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lineChange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==QUOTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			match(PREFIX);
			setState(99);
			match(ANY);
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
		public TerminalNode ANY() { return getToken(DiffParser.ANY, 0); }
		public TerminalNode PREFIX() { return getToken(DiffParser.PREFIX, 0); }
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
		enterRule(_localctx, 18, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==PREFIX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
			match(ANY);
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
		"\u0004\u0001\u001ai\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0005\u0000\u0017\b"+
		"\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000"+
		"\f\u0000#\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001-\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00012\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00029\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0003\u0004>\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004"+
		"\u0005\u0004D\b\u0004\n\u0004\f\u0004G\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005"+
		"\u0001\u0005\u0003\u0005R\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0004\u0001\u0000\u0006"+
		"\u0007\u0001\u0000\u0015\u0016\u0001\u0000\u0011\u0011\u0001\u0000\u000e"+
		"\u000ej\u0000\u0014\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000"+
		"\u00045\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b=\u0001"+
		"\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000"+
		"\u000eZ\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000\u0000\u0012e"+
		"\u0001\u0000\u0000\u0000\u0014\u0018\u0003\u0002\u0001\u0000\u0015\u0017"+
		"\u0005\u0006\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a"+
		"\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0001\u0000\u0000\u0000\u0019!\u0001\u0000\u0000\u0000\u001a\u0018\u0001"+
		"\u0000\u0000\u0000\u001b\u001d\u0005\u000e\u0000\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0003\n\u0005\u0000\u001f \u0005\u0010"+
		"\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001c\u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\u0001\u0001\u0000\u0000\u0000%\'\u0005\u0001\u0000\u0000&(\u0005"+
		"\r\u0000\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000("+
		")\u0001\u0000\u0000\u0000)*\u0005\n\u0000\u0000*,\u0003\u0004\u0002\u0000"+
		"+-\u0005\r\u0000\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0005\u000b\u0000\u0000/1\u0003\u0004\u0002"+
		"\u000002\u0005\r\u0000\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000034\u0005\b\u0000\u00004\u0003\u0001\u0000"+
		"\u0000\u000058\u0005\f\u0000\u000067\u0005\t\u0000\u000079\u0005\f\u0000"+
		"\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0005\u0001"+
		"\u0000\u0000\u0000:;\u0007\u0000\u0000\u0000;\u0007\u0001\u0000\u0000"+
		"\u0000<>\u0003\u0006\u0003\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>E\u0001\u0000\u0000\u0000?A\u0005\u0002\u0000\u0000@B\u0003"+
		"\u0006\u0003\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BD\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\t\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0012\u0000\u0000IJ\u0005"+
		"\u001a\u0000\u0000JK\u0005\u0019\u0000\u0000KL\u0005\u0017\u0000\u0000"+
		"LN\u0005\u0018\u0000\u0000MO\u0003\u000e\u0007\u0000NM\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PR\u0003\f\u0006"+
		"\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000ST\u0005\u0013\u0000\u0000TU\u0003\b\u0004\u0000U\u000b\u0001"+
		"\u0000\u0000\u0000VW\u0005\u0014\u0000\u0000WX\u0005\u0017\u0000\u0000"+
		"XY\u0005\u0018\u0000\u0000Y\r\u0001\u0000\u0000\u0000Z[\u0007\u0001\u0000"+
		"\u0000[\\\u0005\u0017\u0000\u0000\\]\u0005\u0018\u0000\u0000]^\u0007\u0001"+
		"\u0000\u0000^_\u0005\u0017\u0000\u0000_`\u0005\u0018\u0000\u0000`\u000f"+
		"\u0001\u0000\u0000\u0000ab\b\u0002\u0000\u0000bc\u0005\u000e\u0000\u0000"+
		"cd\u0005\u000f\u0000\u0000d\u0011\u0001\u0000\u0000\u0000ef\b\u0003\u0000"+
		"\u0000fg\u0005\u000f\u0000\u0000g\u0013\u0001\u0000\u0000\u0000\f\u0018"+
		"\u001c#\',18=AENQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}