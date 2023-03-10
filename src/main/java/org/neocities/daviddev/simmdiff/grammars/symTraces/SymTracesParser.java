// Generated from /home/david/Documents/SimmDiffUppaal/src/main/java/org/neocities/daviddev/simmdiff/grammars/symTraces/SymTracesParser.g4 by ANTLR 4.10.1
package org.neocities.daviddev.simmdiff.grammars.symTraces;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SymTracesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, STATE=2, DELAY=3, TRANSITION=4, TAU=5, IDENTIFIER=6, NAT=7, POINT=8, 
		ARROW=9, BRACKET_LEFT=10, BRACKET_RIGHT=11, PAR_LEFT=12, PAR_RIGHT=13, 
		DOT=14, COLON=15, SEMICOLON=16, COMMA=17, QUESTION=18, EXCLAMATION=19, 
		FORALL=20, EXISTS=21, SUM=22, TRUE=23, FALSE=24, INT=25, DOUBLE=26, CLOCK=27, 
		CHAN=28, BOOL=29, SQUARE_BRACKET_L=30, SQUARE_BRACKET_R=31, SCALAR=32, 
		STRUCT=33, DERIVATE=34, INCREMENT=35, DECREMENT=36, ASSIGN=37, ASSIGN_COLON=38, 
		ASSIGN_ADD=39, ASSIGN_SUB=40, ASSIGN_MUL=41, ASSIGN_DIV=42, ASSIGN_PERCENT=43, 
		ASSIGN_OR=44, ASSIGN_AND=45, ASSIGN_XOR=46, ASSIGN_LSHIFT=47, ASSIGN_RSHIFT=48, 
		ADD=49, SUB=50, NOT=51, NUMERAL=52, LESS=53, LESSEQ=54, COMPARE=55, DIFFERENT=56, 
		GREATEREQ=57, GREATER=58, MUL=59, DIV=60, PERCENT=61, BITAND=62, BITOR=63, 
		BITXOR=64, LSHIFT=65, RSHIFT=66, AND_SYMBOL=67, OR_SYMBOL=68, MINIMUM=69, 
		MAXIMUM=70, OR=71, AND=72, IMPLY=73;
	public static final int
		RULE_trace = 0, RULE_state = 1, RULE_transition = 2, RULE_location = 3, 
		RULE_loc = 4, RULE_values = 5, RULE_clocks = 6, RULE_delay = 7, RULE_discrete = 8, 
		RULE_aDiscrete = 9, RULE_guard = 10, RULE_action = 11, RULE_sync = 12, 
		RULE_tau = 13, RULE_update = 14, RULE_assign = 15, RULE_expr = 16, RULE_arguments = 17, 
		RULE_type = 18, RULE_fieldDecl = 19, RULE_varFieldDecl = 20, RULE_arrayDecl = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"trace", "state", "transition", "location", "loc", "values", "clocks", 
			"delay", "discrete", "aDiscrete", "guard", "action", "sync", "tau", "update", 
			"assign", "expr", "arguments", "type", "fieldDecl", "varFieldDecl", "arrayDecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'State'", "'Delay'", "'Transitions'", "'tau'", null, null, 
			null, "'->'", "'{'", "'}'", "'('", "')'", "'.'", "':'", "';'", "','", 
			"'?'", "'!'", "'forall'", "'exists'", "'sum'", "'true'", "'false'", "'int'", 
			"'double'", "'clock'", "'chan'", "'bool'", "'['", "']'", "'scalar'", 
			"'struct'", "'''", "'++'", "'--'", "'='", "':='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'|='", "'&='", "'^='", "'<<='", "'>>='", "'+'", "'-'", 
			"'not'", "'#'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'*'", 
			"'/'", "'%'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'&&'", "'||'", "'<?'", 
			"'>?'", "'or'", "'and'", "'imply'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "STATE", "DELAY", "TRANSITION", "TAU", "IDENTIFIER", "NAT", 
			"POINT", "ARROW", "BRACKET_LEFT", "BRACKET_RIGHT", "PAR_LEFT", "PAR_RIGHT", 
			"DOT", "COLON", "SEMICOLON", "COMMA", "QUESTION", "EXCLAMATION", "FORALL", 
			"EXISTS", "SUM", "TRUE", "FALSE", "INT", "DOUBLE", "CLOCK", "CHAN", "BOOL", 
			"SQUARE_BRACKET_L", "SQUARE_BRACKET_R", "SCALAR", "STRUCT", "DERIVATE", 
			"INCREMENT", "DECREMENT", "ASSIGN", "ASSIGN_COLON", "ASSIGN_ADD", "ASSIGN_SUB", 
			"ASSIGN_MUL", "ASSIGN_DIV", "ASSIGN_PERCENT", "ASSIGN_OR", "ASSIGN_AND", 
			"ASSIGN_XOR", "ASSIGN_LSHIFT", "ASSIGN_RSHIFT", "ADD", "SUB", "NOT", 
			"NUMERAL", "LESS", "LESSEQ", "COMPARE", "DIFFERENT", "GREATEREQ", "GREATER", 
			"MUL", "DIV", "PERCENT", "BITAND", "BITOR", "BITXOR", "LSHIFT", "RSHIFT", 
			"AND_SYMBOL", "OR_SYMBOL", "MINIMUM", "MAXIMUM", "OR", "AND", "IMPLY"
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
	public String getGrammarFileName() { return "SymTracesParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SymTracesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TraceContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public TraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterTrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitTrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitTrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraceContext trace() throws RecognitionException {
		TraceContext _localctx = new TraceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_trace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			state();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELAY || _la==TRANSITION) {
				{
				{
				setState(45);
				transition();
				setState(46);
				state();
				}
				}
				setState(52);
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(SymTracesParser.STATE, 0); }
		public TerminalNode COLON() { return getToken(SymTracesParser.COLON, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ClocksContext clocks() {
			return getRuleContext(ClocksContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(STATE);
			setState(54);
			match(COLON);
			setState(55);
			location();
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(56);
				values();
				}
				break;
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQUARE_BRACKET_L) {
				{
				setState(59);
				clocks();
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

	public static class TransitionContext extends ParserRuleContext {
		public DelayContext delay() {
			return getRuleContext(DelayContext.class,0);
		}
		public DiscreteContext discrete() {
			return getRuleContext(DiscreteContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_transition);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				delay();
				}
				break;
			case TRANSITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				discrete();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode PAR_LEFT() { return getToken(SymTracesParser.PAR_LEFT, 0); }
		public TerminalNode PAR_RIGHT() { return getToken(SymTracesParser.PAR_RIGHT, 0); }
		public List<LocContext> loc() {
			return getRuleContexts(LocContext.class);
		}
		public LocContext loc(int i) {
			return getRuleContext(LocContext.class,i);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PAR_LEFT);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				loc();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(72);
			match(PAR_RIGHT);
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

	public static class LocContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SymTracesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SymTracesParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(SymTracesParser.DOT, 0); }
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		LocContext _localctx = new LocContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(DOT);
			setState(76);
			match(IDENTIFIER);
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

	public static class ValuesContext extends ParserRuleContext {
		public List<VarFieldDeclContext> varFieldDecl() {
			return getRuleContexts(VarFieldDeclContext.class);
		}
		public VarFieldDeclContext varFieldDecl(int i) {
			return getRuleContext(VarFieldDeclContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SymTracesParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SymTracesParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(78);
				varFieldDecl();
				setState(79);
				match(ASSIGN);
				setState(80);
				expr(0);
				}
				}
				setState(86);
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

	public static class ClocksContext extends ParserRuleContext {
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SymTracesParser.SQUARE_BRACKET_L, 0); }
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SymTracesParser.SQUARE_BRACKET_R, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SymTracesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SymTracesParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SymTracesParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SymTracesParser.ASSIGN, i);
		}
		public List<TerminalNode> POINT() { return getTokens(SymTracesParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(SymTracesParser.POINT, i);
		}
		public List<TerminalNode> NAT() { return getTokens(SymTracesParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(SymTracesParser.NAT, i);
		}
		public List<TerminalNode> NUMERAL() { return getTokens(SymTracesParser.NUMERAL); }
		public TerminalNode NUMERAL(int i) {
			return getToken(SymTracesParser.NUMERAL, i);
		}
		public ClocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterClocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitClocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitClocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClocksContext clocks() throws RecognitionException {
		ClocksContext _localctx = new ClocksContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_clocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(SQUARE_BRACKET_L);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERAL) {
					{
					setState(88);
					match(NUMERAL);
					}
				}

				setState(91);
				match(IDENTIFIER);
				setState(92);
				match(ASSIGN);
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==NAT || _la==POINT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==NUMERAL );
			setState(98);
			match(SQUARE_BRACKET_R);
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

	public static class DelayContext extends ParserRuleContext {
		public TerminalNode DELAY() { return getToken(SymTracesParser.DELAY, 0); }
		public TerminalNode COLON() { return getToken(SymTracesParser.COLON, 0); }
		public TerminalNode NAT() { return getToken(SymTracesParser.NAT, 0); }
		public TerminalNode POINT() { return getToken(SymTracesParser.POINT, 0); }
		public DelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitDelay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitDelay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelayContext delay() throws RecognitionException {
		DelayContext _localctx = new DelayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delay);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(DELAY);
			setState(101);
			match(COLON);
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==NAT || _la==POINT) ) {
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

	public static class DiscreteContext extends ParserRuleContext {
		public TerminalNode TRANSITION() { return getToken(SymTracesParser.TRANSITION, 0); }
		public TerminalNode COLON() { return getToken(SymTracesParser.COLON, 0); }
		public List<ADiscreteContext> aDiscrete() {
			return getRuleContexts(ADiscreteContext.class);
		}
		public ADiscreteContext aDiscrete(int i) {
			return getRuleContext(ADiscreteContext.class,i);
		}
		public DiscreteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discrete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterDiscrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitDiscrete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitDiscrete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiscreteContext discrete() throws RecognitionException {
		DiscreteContext _localctx = new DiscreteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_discrete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(TRANSITION);
			setState(105);
			match(COLON);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				aDiscrete();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	public static class ADiscreteContext extends ParserRuleContext {
		public List<LocContext> loc() {
			return getRuleContexts(LocContext.class);
		}
		public LocContext loc(int i) {
			return getRuleContext(LocContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(SymTracesParser.ARROW, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(SymTracesParser.BRACKET_LEFT, 0); }
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SymTracesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SymTracesParser.COMMA, i);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(SymTracesParser.BRACKET_RIGHT, 0); }
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public TerminalNode NAT() { return getToken(SymTracesParser.NAT, 0); }
		public ADiscreteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aDiscrete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterADiscrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitADiscrete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitADiscrete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ADiscreteContext aDiscrete() throws RecognitionException {
		ADiscreteContext _localctx = new ADiscreteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_aDiscrete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			loc();
			setState(112);
			match(ARROW);
			setState(113);
			loc();
			setState(114);
			match(BRACKET_LEFT);
			setState(115);
			guard();
			setState(116);
			match(COMMA);
			setState(117);
			action();
			setState(118);
			match(COMMA);
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(119);
				update();
				}
				break;
			case NAT:
				{
				setState(120);
				match(NAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(123);
			match(BRACKET_RIGHT);
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

	public static class GuardContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			expr(0);
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

	public static class ActionContext extends ParserRuleContext {
		public SyncContext sync() {
			return getRuleContext(SyncContext.class,0);
		}
		public TauContext tau() {
			return getRuleContext(TauContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_action);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				sync();
				}
				break;
			case TAU:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				tau();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SyncContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SymTracesParser.IDENTIFIER, 0); }
		public TerminalNode QUESTION() { return getToken(SymTracesParser.QUESTION, 0); }
		public TerminalNode EXCLAMATION() { return getToken(SymTracesParser.EXCLAMATION, 0); }
		public SyncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sync; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterSync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitSync(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitSync(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyncContext sync() throws RecognitionException {
		SyncContext _localctx = new SyncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sync);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENTIFIER);
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==QUESTION || _la==EXCLAMATION) ) {
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

	public static class TauContext extends ParserRuleContext {
		public TerminalNode TAU() { return getToken(SymTracesParser.TAU, 0); }
		public TauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tau; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterTau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitTau(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitTau(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TauContext tau() throws RecognitionException {
		TauContext _localctx = new TauContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tau);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(TAU);
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

	public static class UpdateContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SymTracesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SymTracesParser.COMMA, i);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			assign();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(137);
				match(COMMA);
				setState(138);
				assign();
				}
				}
				setState(143);
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

	public static class AssignContext extends ParserRuleContext {
		public VarFieldDeclContext varFieldDecl() {
			return getRuleContext(VarFieldDeclContext.class,0);
		}
		public TerminalNode ASSIGN_COLON() { return getToken(SymTracesParser.ASSIGN_COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			varFieldDecl();
			setState(145);
			match(ASSIGN_COLON);
			setState(146);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementExprContext extends ExprContext {
		public TerminalNode INCREMENT() { return getToken(SymTracesParser.INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(SymTracesParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(SymTracesParser.COLON, 0); }
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExprContext extends ExprContext {
		public TerminalNode PAR_LEFT() { return getToken(SymTracesParser.PAR_LEFT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(SymTracesParser.PAR_RIGHT, 0); }
		public ParenthesisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitParenthesisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitParenthesisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(SymTracesParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExprContext extends ExprContext {
		public Token binary;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(SymTracesParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(SymTracesParser.LESSEQ, 0); }
		public TerminalNode COMPARE() { return getToken(SymTracesParser.COMPARE, 0); }
		public TerminalNode DIFFERENT() { return getToken(SymTracesParser.DIFFERENT, 0); }
		public TerminalNode GREATEREQ() { return getToken(SymTracesParser.GREATEREQ, 0); }
		public TerminalNode GREATER() { return getToken(SymTracesParser.GREATER, 0); }
		public ComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExprContext {
		public Token binary;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SymTracesParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SymTracesParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(SymTracesParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SymTracesParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(SymTracesParser.PERCENT, 0); }
		public TerminalNode BITAND() { return getToken(SymTracesParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(SymTracesParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(SymTracesParser.BITXOR, 0); }
		public TerminalNode LSHIFT() { return getToken(SymTracesParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(SymTracesParser.RSHIFT, 0); }
		public TerminalNode AND_SYMBOL() { return getToken(SymTracesParser.AND_SYMBOL, 0); }
		public TerminalNode OR_SYMBOL() { return getToken(SymTracesParser.OR_SYMBOL, 0); }
		public TerminalNode MINIMUM() { return getToken(SymTracesParser.MINIMUM, 0); }
		public TerminalNode MAXIMUM() { return getToken(SymTracesParser.MAXIMUM, 0); }
		public TerminalNode OR() { return getToken(SymTracesParser.OR, 0); }
		public TerminalNode AND() { return getToken(SymTracesParser.AND, 0); }
		public TerminalNode COMMA() { return getToken(SymTracesParser.COMMA, 0); }
		public TerminalNode IMPLY() { return getToken(SymTracesParser.IMPLY, 0); }
		public BinaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIncrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SymTracesParser.INCREMENT, 0); }
		public ExprIncrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterExprIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitExprIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitExprIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SymTracesParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SymTracesParser.IDENTIFIER, 0); }
		public DotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitDotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitDotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallExprContext extends ExprContext {
		public TerminalNode FORALL() { return getToken(SymTracesParser.FORALL, 0); }
		public TerminalNode PAR_LEFT() { return getToken(SymTracesParser.PAR_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SymTracesParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SymTracesParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(SymTracesParser.PAR_RIGHT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterForallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitForallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitForallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token unary;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(SymTracesParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(SymTracesParser.ADD, 0); }
		public TerminalNode EXCLAMATION() { return getToken(SymTracesParser.EXCLAMATION, 0); }
		public TerminalNode NOT() { return getToken(SymTracesParser.NOT, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumExprContext extends ExprContext {
		public TerminalNode SUM() { return getToken(SymTracesParser.SUM, 0); }
		public TerminalNode PAR_LEFT() { return getToken(SymTracesParser.PAR_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SymTracesParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SymTracesParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(SymTracesParser.PAR_RIGHT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterSumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitSumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitSumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_LEFT() { return getToken(SymTracesParser.PAR_LEFT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(SymTracesParser.PAR_RIGHT, 0); }
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDecrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(SymTracesParser.DECREMENT, 0); }
		public ExprDecrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterExprDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitExprDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitExprDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(SymTracesParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SymTracesParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_COLON() { return getToken(SymTracesParser.ASSIGN_COLON, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(SymTracesParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(SymTracesParser.ASSIGN_SUB, 0); }
		public TerminalNode ASSIGN_MUL() { return getToken(SymTracesParser.ASSIGN_MUL, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(SymTracesParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_PERCENT() { return getToken(SymTracesParser.ASSIGN_PERCENT, 0); }
		public TerminalNode ASSIGN_OR() { return getToken(SymTracesParser.ASSIGN_OR, 0); }
		public TerminalNode ASSIGN_AND() { return getToken(SymTracesParser.ASSIGN_AND, 0); }
		public TerminalNode ASSIGN_XOR() { return getToken(SymTracesParser.ASSIGN_XOR, 0); }
		public TerminalNode ASSIGN_LSHIFT() { return getToken(SymTracesParser.ASSIGN_LSHIFT, 0); }
		public TerminalNode ASSIGN_RSHIFT() { return getToken(SymTracesParser.ASSIGN_RSHIFT, 0); }
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleExprContext extends ExprContext {
		public TerminalNode POINT() { return getToken(SymTracesParser.POINT, 0); }
		public DoubleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterDoubleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitDoubleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitDoubleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SymTracesParser.SQUARE_BRACKET_L, 0); }
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SymTracesParser.SQUARE_BRACKET_R, 0); }
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StopWatchExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DERIVATE() { return getToken(SymTracesParser.DERIVATE, 0); }
		public StopWatchExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterStopWatchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitStopWatchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitStopWatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(SymTracesParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NatExprContext extends ExprContext {
		public TerminalNode NAT() { return getToken(SymTracesParser.NAT, 0); }
		public NatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterNatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitNatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitNatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsExprContext extends ExprContext {
		public TerminalNode EXISTS() { return getToken(SymTracesParser.EXISTS, 0); }
		public TerminalNode PAR_LEFT() { return getToken(SymTracesParser.PAR_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SymTracesParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SymTracesParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(SymTracesParser.PAR_RIGHT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExistsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterExistsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitExistsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitExistsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementExprContext extends ExprContext {
		public TerminalNode DECREMENT() { return getToken(SymTracesParser.DECREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterDecrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitDecrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitDecrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(149);
				match(IDENTIFIER);
				}
				break;
			case NAT:
				{
				_localctx = new NatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(NAT);
				}
				break;
			case POINT:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(POINT);
				}
				break;
			case PAR_LEFT:
				{
				_localctx = new ParenthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(PAR_LEFT);
				setState(153);
				expr(0);
				setState(154);
				match(PAR_RIGHT);
				}
				break;
			case INCREMENT:
				{
				_localctx = new IncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(INCREMENT);
				setState(157);
				expr(15);
				}
				break;
			case DECREMENT:
				{
				_localctx = new DecrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(DECREMENT);
				setState(159);
				expr(13);
				}
				break;
			case EXCLAMATION:
			case ADD:
			case SUB:
			case NOT:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				((UnaryExprContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << ADD) | (1L << SUB) | (1L << NOT))) != 0)) ) {
					((UnaryExprContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				expr(11);
				}
				break;
			case FORALL:
				{
				_localctx = new ForallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(FORALL);
				setState(163);
				match(PAR_LEFT);
				setState(164);
				match(IDENTIFIER);
				setState(165);
				match(COLON);
				setState(166);
				type();
				setState(167);
				match(PAR_RIGHT);
				setState(168);
				expr(5);
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(EXISTS);
				setState(171);
				match(PAR_LEFT);
				setState(172);
				match(IDENTIFIER);
				setState(173);
				match(COLON);
				setState(174);
				type();
				setState(175);
				match(PAR_RIGHT);
				setState(176);
				expr(4);
				}
				break;
			case SUM:
				{
				_localctx = new SumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(SUM);
				setState(179);
				match(PAR_LEFT);
				setState(180);
				match(IDENTIFIER);
				setState(181);
				match(COLON);
				setState(182);
				type();
				setState(183);
				match(PAR_RIGHT);
				setState(184);
				expr(3);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(191);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_COLON) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MUL) | (1L << ASSIGN_DIV) | (1L << ASSIGN_PERCENT) | (1L << ASSIGN_OR) | (1L << ASSIGN_AND) | (1L << ASSIGN_XOR) | (1L << ASSIGN_LSHIFT) | (1L << ASSIGN_RSHIFT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(194);
						((ComparisonExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSEQ) | (1L << COMPARE) | (1L << DIFFERENT) | (1L << GREATEREQ) | (1L << GREATER))) != 0)) ) {
							((ComparisonExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						((BinaryExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (COMMA - 17)) | (1L << (ADD - 17)) | (1L << (SUB - 17)) | (1L << (MUL - 17)) | (1L << (DIV - 17)) | (1L << (PERCENT - 17)) | (1L << (BITAND - 17)) | (1L << (BITOR - 17)) | (1L << (BITXOR - 17)) | (1L << (LSHIFT - 17)) | (1L << (RSHIFT - 17)) | (1L << (AND_SYMBOL - 17)) | (1L << (OR_SYMBOL - 17)) | (1L << (MINIMUM - 17)) | (1L << (MAXIMUM - 17)) | (1L << (OR - 17)) | (1L << (AND - 17)) | (1L << (IMPLY - 17)))) != 0)) ) {
							((BinaryExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new IfExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(200);
						match(QUESTION);
						setState(201);
						expr(0);
						setState(202);
						match(COLON);
						setState(203);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(206);
						match(SQUARE_BRACKET_L);
						setState(207);
						expr(0);
						setState(208);
						match(SQUARE_BRACKET_R);
						}
						break;
					case 6:
						{
						_localctx = new StopWatchExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(211);
						match(DERIVATE);
						}
						break;
					case 7:
						{
						_localctx = new ExprIncrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(213);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new ExprDecrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(215);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(217);
						match(DOT);
						setState(218);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new FuncExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(220);
						match(PAR_LEFT);
						setState(221);
						arguments();
						setState(222);
						match(PAR_RIGHT);
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SymTracesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SymTracesParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NAT) | (1L << POINT) | (1L << PAR_LEFT) | (1L << EXCLAMATION) | (1L << FORALL) | (1L << EXISTS) | (1L << SUM) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ADD) | (1L << SUB) | (1L << NOT))) != 0)) {
				{
				setState(229);
				expr(0);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(230);
					match(COMMA);
					setState(231);
					expr(0);
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(SymTracesParser.BOOL, 0); }
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructTypeContext extends TypeContext {
		public TerminalNode STRUCT() { return getToken(SymTracesParser.STRUCT, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(SymTracesParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(SymTracesParser.BRACKET_RIGHT, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public StructTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleTypeContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(SymTracesParser.DOUBLE, 0); }
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarTypeContext extends TypeContext {
		public TerminalNode SCALAR() { return getToken(SymTracesParser.SCALAR, 0); }
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SymTracesParser.SQUARE_BRACKET_L, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SymTracesParser.SQUARE_BRACKET_R, 0); }
		public ScalarTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierTypeContext extends TypeContext {
		public TerminalNode IDENTIFIER() { return getToken(SymTracesParser.IDENTIFIER, 0); }
		public IdentifierTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterIdentifierType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitIdentifierType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitIdentifierType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDomainTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(SymTracesParser.INT, 0); }
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SymTracesParser.SQUARE_BRACKET_L, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SymTracesParser.COMMA, 0); }
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SymTracesParser.SQUARE_BRACKET_R, 0); }
		public IntDomainTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterIntDomainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitIntDomainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitIntDomainType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(SymTracesParser.INT, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClockTypeContext extends TypeContext {
		public TerminalNode CLOCK() { return getToken(SymTracesParser.CLOCK, 0); }
		public ClockTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterClockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitClockType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitClockType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChanTypeContext extends TypeContext {
		public TerminalNode CHAN() { return getToken(SymTracesParser.CHAN, 0); }
		public ChanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterChanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitChanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitChanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(INT);
				}
				break;
			case 3:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(DOUBLE);
				}
				break;
			case 4:
				_localctx = new ClockTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(CLOCK);
				}
				break;
			case 5:
				_localctx = new ChanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(CHAN);
				}
				break;
			case 6:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				match(BOOL);
				}
				break;
			case 7:
				_localctx = new IntDomainTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				match(INT);
				setState(246);
				match(SQUARE_BRACKET_L);
				setState(247);
				expr(0);
				setState(248);
				match(COMMA);
				setState(249);
				expr(0);
				setState(250);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 8:
				_localctx = new ScalarTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				match(SCALAR);
				setState(253);
				match(SQUARE_BRACKET_L);
				setState(254);
				expr(0);
				setState(255);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 9:
				_localctx = new StructTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				match(STRUCT);
				setState(258);
				match(BRACKET_LEFT);
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(259);
					fieldDecl();
					}
					}
					setState(262); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << CLOCK) | (1L << CHAN) | (1L << BOOL) | (1L << SCALAR) | (1L << STRUCT))) != 0) );
				setState(264);
				match(BRACKET_RIGHT);
				}
				break;
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

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarFieldDeclContext> varFieldDecl() {
			return getRuleContexts(VarFieldDeclContext.class);
		}
		public VarFieldDeclContext varFieldDecl(int i) {
			return getRuleContext(VarFieldDeclContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(SymTracesParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SymTracesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SymTracesParser.COMMA, i);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			type();
			setState(269);
			varFieldDecl();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(270);
				match(COMMA);
				setState(271);
				varFieldDecl();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(SEMICOLON);
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

	public static class VarFieldDeclContext extends ParserRuleContext {
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SymTracesParser.IDENTIFIER, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public VarFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterVarFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitVarFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitVarFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarFieldDeclContext varFieldDecl() throws RecognitionException {
		VarFieldDeclContext _localctx = new VarFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varFieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(279);
				loc();
				}
				break;
			case 2:
				{
				setState(280);
				match(IDENTIFIER);
				}
				break;
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SQUARE_BRACKET_L) {
				{
				{
				setState(283);
				arrayDecl();
				}
				}
				setState(288);
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

	public static class ArrayDeclContext extends ParserRuleContext {
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
	 
		public ArrayDeclContext() { }
		public void copyFrom(ArrayDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclExprContext extends ArrayDeclContext {
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SymTracesParser.SQUARE_BRACKET_L, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SymTracesParser.SQUARE_BRACKET_R, 0); }
		public ArrayDeclExprContext(ArrayDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterArrayDeclExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitArrayDeclExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitArrayDeclExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclTypeContext extends ArrayDeclContext {
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SymTracesParser.SQUARE_BRACKET_L, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SymTracesParser.SQUARE_BRACKET_R, 0); }
		public ArrayDeclTypeContext(ArrayDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).enterArrayDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymTracesParserListener ) ((SymTracesParserListener)listener).exitArrayDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymTracesParserVisitor ) return ((SymTracesParserVisitor<? extends T>)visitor).visitArrayDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayDecl);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(SQUARE_BRACKET_L);
				setState(290);
				expr(0);
				setState(291);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 2:
				_localctx = new ArrayDeclTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(SQUARE_BRACKET_L);
				setState(294);
				type();
				setState(295);
				match(SQUARE_BRACKET_R);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001I\u012c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"+
		"\n\u0000\f\u00004\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001:\b\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0004\u0003E\b\u0003"+
		"\u000b\u0003\f\u0003F\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005S\b\u0005\n\u0005\f\u0005V\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006Z\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"_\b\u0006\u000b\u0006\f\u0006`\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\bl\b\b\u000b"+
		"\b\f\bm\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tz\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0082\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u008c\b\u000e"+
		"\n\u000e\f\u000e\u008f\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00bd"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e1"+
		"\b\u0010\n\u0010\f\u0010\u00e4\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00e9\b\u0011\n\u0011\f\u0011\u00ec\t\u0011\u0003\u0011\u00ee"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u0105\b\u0012\u000b"+
		"\u0012\f\u0012\u0106\u0001\u0012\u0001\u0012\u0003\u0012\u010b\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0111\b\u0013"+
		"\n\u0013\f\u0013\u0114\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u011a\b\u0014\u0001\u0014\u0005\u0014\u011d\b\u0014"+
		"\n\u0014\f\u0014\u0120\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u012a"+
		"\b\u0015\u0001\u0015\u0000\u0001 \u0016\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0006"+
		"\u0001\u0000\u0007\b\u0001\u0000\u0012\u0013\u0002\u0000\u0013\u00131"+
		"3\u0001\u0000%0\u0001\u00005:\u0003\u0000\u0011\u001112;I\u0145\u0000"+
		",\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0004@\u0001"+
		"\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000"+
		"\u0000\nT\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000ed\u0001"+
		"\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000\u0012o\u0001\u0000\u0000"+
		"\u0000\u0014}\u0001\u0000\u0000\u0000\u0016\u0081\u0001\u0000\u0000\u0000"+
		"\u0018\u0083\u0001\u0000\u0000\u0000\u001a\u0086\u0001\u0000\u0000\u0000"+
		"\u001c\u0088\u0001\u0000\u0000\u0000\u001e\u0090\u0001\u0000\u0000\u0000"+
		" \u00bc\u0001\u0000\u0000\u0000\"\u00ed\u0001\u0000\u0000\u0000$\u010a"+
		"\u0001\u0000\u0000\u0000&\u010c\u0001\u0000\u0000\u0000(\u0119\u0001\u0000"+
		"\u0000\u0000*\u0129\u0001\u0000\u0000\u0000,2\u0003\u0002\u0001\u0000"+
		"-.\u0003\u0004\u0002\u0000./\u0003\u0002\u0001\u0000/1\u0001\u0000\u0000"+
		"\u00000-\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u00003\u0001\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000056\u0005\u0002\u0000\u000067\u0005\u000f\u0000"+
		"\u000079\u0003\u0006\u0003\u00008:\u0003\n\u0005\u000098\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;=\u0003\f\u0006"+
		"\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0003\u0001"+
		"\u0000\u0000\u0000>A\u0003\u000e\u0007\u0000?A\u0003\u0010\b\u0000@>\u0001"+
		"\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000"+
		"\u0000BD\u0005\f\u0000\u0000CE\u0003\b\u0004\u0000DC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\r\u0000\u0000I\u0007\u0001"+
		"\u0000\u0000\u0000JK\u0005\u0006\u0000\u0000KL\u0005\u000e\u0000\u0000"+
		"LM\u0005\u0006\u0000\u0000M\t\u0001\u0000\u0000\u0000NO\u0003(\u0014\u0000"+
		"OP\u0005%\u0000\u0000PQ\u0003 \u0010\u0000QS\u0001\u0000\u0000\u0000R"+
		"N\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\u000b\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000W^\u0005\u001e\u0000\u0000XZ\u00054\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0006\u0000\u0000\\]\u0005%\u0000\u0000]_\u0007\u0000\u0000"+
		"\u0000^Y\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005"+
		"\u001f\u0000\u0000c\r\u0001\u0000\u0000\u0000de\u0005\u0003\u0000\u0000"+
		"ef\u0005\u000f\u0000\u0000fg\u0007\u0000\u0000\u0000g\u000f\u0001\u0000"+
		"\u0000\u0000hi\u0005\u0004\u0000\u0000ik\u0005\u000f\u0000\u0000jl\u0003"+
		"\u0012\t\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0011\u0001\u0000\u0000"+
		"\u0000op\u0003\b\u0004\u0000pq\u0005\t\u0000\u0000qr\u0003\b\u0004\u0000"+
		"rs\u0005\n\u0000\u0000st\u0003\u0014\n\u0000tu\u0005\u0011\u0000\u0000"+
		"uv\u0003\u0016\u000b\u0000vy\u0005\u0011\u0000\u0000wz\u0003\u001c\u000e"+
		"\u0000xz\u0005\u0007\u0000\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u000b\u0000\u0000|\u0013"+
		"\u0001\u0000\u0000\u0000}~\u0003 \u0010\u0000~\u0015\u0001\u0000\u0000"+
		"\u0000\u007f\u0082\u0003\u0018\f\u0000\u0080\u0082\u0003\u001a\r\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0006\u0000\u0000"+
		"\u0084\u0085\u0007\u0001\u0000\u0000\u0085\u0019\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\u0005\u0000\u0000\u0087\u001b\u0001\u0000\u0000\u0000"+
		"\u0088\u008d\u0003\u001e\u000f\u0000\u0089\u008a\u0005\u0011\u0000\u0000"+
		"\u008a\u008c\u0003\u001e\u000f\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0003(\u0014\u0000\u0091"+
		"\u0092\u0005&\u0000\u0000\u0092\u0093\u0003 \u0010\u0000\u0093\u001f\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0006\u0010\uffff\uffff\u0000\u0095\u00bd"+
		"\u0005\u0006\u0000\u0000\u0096\u00bd\u0005\u0007\u0000\u0000\u0097\u00bd"+
		"\u0005\b\u0000\u0000\u0098\u0099\u0005\f\u0000\u0000\u0099\u009a\u0003"+
		" \u0010\u0000\u009a\u009b\u0005\r\u0000\u0000\u009b\u00bd\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005#\u0000\u0000\u009d\u00bd\u0003 \u0010\u000f"+
		"\u009e\u009f\u0005$\u0000\u0000\u009f\u00bd\u0003 \u0010\r\u00a0\u00a1"+
		"\u0007\u0002\u0000\u0000\u00a1\u00bd\u0003 \u0010\u000b\u00a2\u00a3\u0005"+
		"\u0014\u0000\u0000\u00a3\u00a4\u0005\f\u0000\u0000\u00a4\u00a5\u0005\u0006"+
		"\u0000\u0000\u00a5\u00a6\u0005\u000f\u0000\u0000\u00a6\u00a7\u0003$\u0012"+
		"\u0000\u00a7\u00a8\u0005\r\u0000\u0000\u00a8\u00a9\u0003 \u0010\u0005"+
		"\u00a9\u00bd\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0015\u0000\u0000"+
		"\u00ab\u00ac\u0005\f\u0000\u0000\u00ac\u00ad\u0005\u0006\u0000\u0000\u00ad"+
		"\u00ae\u0005\u000f\u0000\u0000\u00ae\u00af\u0003$\u0012\u0000\u00af\u00b0"+
		"\u0005\r\u0000\u0000\u00b0\u00b1\u0003 \u0010\u0004\u00b1\u00bd\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005\u0016\u0000\u0000\u00b3\u00b4\u0005"+
		"\f\u0000\u0000\u00b4\u00b5\u0005\u0006\u0000\u0000\u00b5\u00b6\u0005\u000f"+
		"\u0000\u0000\u00b6\u00b7\u0003$\u0012\u0000\u00b7\u00b8\u0005\r\u0000"+
		"\u0000\u00b8\u00b9\u0003 \u0010\u0003\u00b9\u00bd\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bd\u0005\u0017\u0000\u0000\u00bb\u00bd\u0005\u0018\u0000\u0000"+
		"\u00bc\u0094\u0001\u0000\u0000\u0000\u00bc\u0096\u0001\u0000\u0000\u0000"+
		"\u00bc\u0097\u0001\u0000\u0000\u0000\u00bc\u0098\u0001\u0000\u0000\u0000"+
		"\u00bc\u009c\u0001\u0000\u0000\u0000\u00bc\u009e\u0001\u0000\u0000\u0000"+
		"\u00bc\u00a0\u0001\u0000\u0000\u0000\u00bc\u00a2\u0001\u0000\u0000\u0000"+
		"\u00bc\u00aa\u0001\u0000\u0000\u0000\u00bc\u00b2\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00e2\u0001\u0000\u0000\u0000\u00be\u00bf\n\f\u0000\u0000\u00bf"+
		"\u00c0\u0007\u0003\u0000\u0000\u00c0\u00e1\u0003 \u0010\r\u00c1\u00c2"+
		"\n\n\u0000\u0000\u00c2\u00c3\u0007\u0004\u0000\u0000\u00c3\u00e1\u0003"+
		" \u0010\u000b\u00c4\u00c5\n\t\u0000\u0000\u00c5\u00c6\u0007\u0005\u0000"+
		"\u0000\u00c6\u00e1\u0003 \u0010\n\u00c7\u00c8\n\b\u0000\u0000\u00c8\u00c9"+
		"\u0005\u0012\u0000\u0000\u00c9\u00ca\u0003 \u0010\u0000\u00ca\u00cb\u0005"+
		"\u000f\u0000\u0000\u00cb\u00cc\u0003 \u0010\t\u00cc\u00e1\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\n\u0013\u0000\u0000\u00ce\u00cf\u0005\u001e\u0000"+
		"\u0000\u00cf\u00d0\u0003 \u0010\u0000\u00d0\u00d1\u0005\u001f\u0000\u0000"+
		"\u00d1\u00e1\u0001\u0000\u0000\u0000\u00d2\u00d3\n\u0012\u0000\u0000\u00d3"+
		"\u00e1\u0005\"\u0000\u0000\u00d4\u00d5\n\u0010\u0000\u0000\u00d5\u00e1"+
		"\u0005#\u0000\u0000\u00d6\u00d7\n\u000e\u0000\u0000\u00d7\u00e1\u0005"+
		"$\u0000\u0000\u00d8\u00d9\n\u0007\u0000\u0000\u00d9\u00da\u0005\u000e"+
		"\u0000\u0000\u00da\u00e1\u0005\u0006\u0000\u0000\u00db\u00dc\n\u0006\u0000"+
		"\u0000\u00dc\u00dd\u0005\f\u0000\u0000\u00dd\u00de\u0003\"\u0011\u0000"+
		"\u00de\u00df\u0005\r\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0"+
		"\u00be\u0001\u0000\u0000\u0000\u00e0\u00c1\u0001\u0000\u0000\u0000\u00e0"+
		"\u00c4\u0001\u0000\u0000\u0000\u00e0\u00c7\u0001\u0000\u0000\u0000\u00e0"+
		"\u00cd\u0001\u0000\u0000\u0000\u00e0\u00d2\u0001\u0000\u0000\u0000\u00e0"+
		"\u00d4\u0001\u0000\u0000\u0000\u00e0\u00d6\u0001\u0000\u0000\u0000\u00e0"+
		"\u00d8\u0001\u0000\u0000\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3!\u0001\u0000\u0000\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e5\u00ea\u0003 \u0010\u0000\u00e6\u00e7\u0005"+
		"\u0011\u0000\u0000\u00e7\u00e9\u0003 \u0010\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00e5\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee#\u0001\u0000\u0000"+
		"\u0000\u00ef\u010b\u0005\u0006\u0000\u0000\u00f0\u010b\u0005\u0019\u0000"+
		"\u0000\u00f1\u010b\u0005\u001a\u0000\u0000\u00f2\u010b\u0005\u001b\u0000"+
		"\u0000\u00f3\u010b\u0005\u001c\u0000\u0000\u00f4\u010b\u0005\u001d\u0000"+
		"\u0000\u00f5\u00f6\u0005\u0019\u0000\u0000\u00f6\u00f7\u0005\u001e\u0000"+
		"\u0000\u00f7\u00f8\u0003 \u0010\u0000\u00f8\u00f9\u0005\u0011\u0000\u0000"+
		"\u00f9\u00fa\u0003 \u0010\u0000\u00fa\u00fb\u0005\u001f\u0000\u0000\u00fb"+
		"\u010b\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005 \u0000\u0000\u00fd\u00fe"+
		"\u0005\u001e\u0000\u0000\u00fe\u00ff\u0003 \u0010\u0000\u00ff\u0100\u0005"+
		"\u001f\u0000\u0000\u0100\u010b\u0001\u0000\u0000\u0000\u0101\u0102\u0005"+
		"!\u0000\u0000\u0102\u0104\u0005\n\u0000\u0000\u0103\u0105\u0003&\u0013"+
		"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u000b\u0000"+
		"\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u00ef\u0001\u0000\u0000"+
		"\u0000\u010a\u00f0\u0001\u0000\u0000\u0000\u010a\u00f1\u0001\u0000\u0000"+
		"\u0000\u010a\u00f2\u0001\u0000\u0000\u0000\u010a\u00f3\u0001\u0000\u0000"+
		"\u0000\u010a\u00f4\u0001\u0000\u0000\u0000\u010a\u00f5\u0001\u0000\u0000"+
		"\u0000\u010a\u00fc\u0001\u0000\u0000\u0000\u010a\u0101\u0001\u0000\u0000"+
		"\u0000\u010b%\u0001\u0000\u0000\u0000\u010c\u010d\u0003$\u0012\u0000\u010d"+
		"\u0112\u0003(\u0014\u0000\u010e\u010f\u0005\u0011\u0000\u0000\u010f\u0111"+
		"\u0003(\u0014\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0114\u0001"+
		"\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001"+
		"\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0005\u0010\u0000\u0000\u0116\'\u0001\u0000"+
		"\u0000\u0000\u0117\u011a\u0003\b\u0004\u0000\u0118\u011a\u0005\u0006\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u011e\u0001\u0000\u0000\u0000\u011b\u011d\u0003*\u0015\u0000"+
		"\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000"+
		"\u011f)\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0005\u001e\u0000\u0000\u0122\u0123\u0003 \u0010\u0000\u0123\u0124"+
		"\u0005\u001f\u0000\u0000\u0124\u012a\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0005\u001e\u0000\u0000\u0126\u0127\u0003$\u0012\u0000\u0127\u0128\u0005"+
		"\u001f\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0121\u0001"+
		"\u0000\u0000\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u012a+\u0001\u0000"+
		"\u0000\u0000\u001729<@FTY`my\u0081\u008d\u00bc\u00e0\u00e2\u00ea\u00ed"+
		"\u0106\u010a\u0112\u0119\u011e\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}