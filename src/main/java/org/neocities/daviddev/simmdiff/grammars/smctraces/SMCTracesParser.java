// Generated from /home/david/Documents/SimmDiffUppaal/src/main/java/org/neocities/daviddev/simmdiff/grammars/smctraces/SMCTracesParser.g4 by ANTLR 4.10.1
package org.neocities.daviddev.simmdiff.grammars.smctraces;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SMCTracesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, START=2, STATE=3, DELAY=4, TRANSITION=5, TAU=6, IDENTIFIER=7, NAT=8, 
		POINT=9, ARROW=10, BRACKET_LEFT=11, BRACKET_RIGHT=12, PAR_LEFT=13, PAR_RIGHT=14, 
		DOT=15, COLON=16, SEMICOLON=17, COMMA=18, QUESTION=19, EXCLAMATION=20, 
		FORALL=21, EXISTS=22, SUM=23, TRUE=24, FALSE=25, INT=26, DOUBLE=27, CLOCK=28, 
		CHAN=29, BOOL=30, SQUARE_BRACKET_L=31, SQUARE_BRACKET_R=32, SCALAR=33, 
		STRUCT=34, DERIVATE=35, INCREMENT=36, DECREMENT=37, ASSIGN=38, ASSIGN_COLON=39, 
		ASSIGN_ADD=40, ASSIGN_SUB=41, ASSIGN_MUL=42, ASSIGN_DIV=43, ASSIGN_PERCENT=44, 
		ASSIGN_OR=45, ASSIGN_AND=46, ASSIGN_XOR=47, ASSIGN_LSHIFT=48, ASSIGN_RSHIFT=49, 
		ADD=50, SUB=51, NOT=52, NUMERAL=53, LESS=54, LESSEQ=55, COMPARE=56, DIFFERENT=57, 
		GREATEREQ=58, GREATER=59, MUL=60, DIV=61, PERCENT=62, BITAND=63, BITOR=64, 
		BITXOR=65, LSHIFT=66, RSHIFT=67, AND_SYMBOL=68, OR_SYMBOL=69, MINIMUM=70, 
		MAXIMUM=71, OR=72, AND=73, IMPLY=74;
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
			null, null, "'Verifying formula'", "'state'", "'delay'", "'transition'", 
			"'tau'", null, null, null, "'->'", "'{'", "'}'", "'('", "')'", "'.'", 
			"':'", "';'", "','", "'?'", "'!'", "'forall'", "'exists'", "'sum'", "'true'", 
			"'false'", "'int'", "'double'", "'clock'", "'chan'", "'bool'", "'['", 
			"']'", "'scalar'", "'struct'", "'''", "'++'", "'--'", "'='", "':='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'|='", "'&='", "'^='", "'<<='", 
			"'>>='", "'+'", "'-'", "'not'", "'#'", "'<'", "'<='", "'=='", "'!='", 
			"'>='", "'>'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'<<'", "'>>'", 
			"'&&'", "'||'", "'<?'", "'>?'", "'or'", "'and'", "'imply'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "START", "STATE", "DELAY", "TRANSITION", "TAU", "IDENTIFIER", 
			"NAT", "POINT", "ARROW", "BRACKET_LEFT", "BRACKET_RIGHT", "PAR_LEFT", 
			"PAR_RIGHT", "DOT", "COLON", "SEMICOLON", "COMMA", "QUESTION", "EXCLAMATION", 
			"FORALL", "EXISTS", "SUM", "TRUE", "FALSE", "INT", "DOUBLE", "CLOCK", 
			"CHAN", "BOOL", "SQUARE_BRACKET_L", "SQUARE_BRACKET_R", "SCALAR", "STRUCT", 
			"DERIVATE", "INCREMENT", "DECREMENT", "ASSIGN", "ASSIGN_COLON", "ASSIGN_ADD", 
			"ASSIGN_SUB", "ASSIGN_MUL", "ASSIGN_DIV", "ASSIGN_PERCENT", "ASSIGN_OR", 
			"ASSIGN_AND", "ASSIGN_XOR", "ASSIGN_LSHIFT", "ASSIGN_RSHIFT", "ADD", 
			"SUB", "NOT", "NUMERAL", "LESS", "LESSEQ", "COMPARE", "DIFFERENT", "GREATEREQ", 
			"GREATER", "MUL", "DIV", "PERCENT", "BITAND", "BITOR", "BITXOR", "LSHIFT", 
			"RSHIFT", "AND_SYMBOL", "OR_SYMBOL", "MINIMUM", "MAXIMUM", "OR", "AND", 
			"IMPLY"
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
	public String getGrammarFileName() { return "SMCTracesParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SMCTracesParser(TokenStream input) {
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
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterTrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitTrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitTrace(this);
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
		public TerminalNode STATE() { return getToken(SMCTracesParser.STATE, 0); }
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
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(STATE);
			setState(54);
			location();
			setState(55);
			values();
			setState(56);
			clocks();
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
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_transition);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				delay();
				}
				break;
			case TRANSITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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
		public TerminalNode PAR_LEFT() { return getToken(SMCTracesParser.PAR_LEFT, 0); }
		public TerminalNode PAR_RIGHT() { return getToken(SMCTracesParser.PAR_RIGHT, 0); }
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
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitLocation(this);
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
			setState(62);
			match(PAR_LEFT);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				loc();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(68);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(SMCTracesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SMCTracesParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(SMCTracesParser.DOT, 0); }
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		LocContext _localctx = new LocContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IDENTIFIER);
			setState(71);
			match(DOT);
			setState(72);
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
		public List<TerminalNode> ASSIGN() { return getTokens(SMCTracesParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SMCTracesParser.ASSIGN, i);
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
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitValues(this);
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(74);
				varFieldDecl();
				setState(75);
				match(ASSIGN);
				setState(76);
				expr(0);
				}
				}
				setState(82);
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
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SMCTracesParser.SQUARE_BRACKET_L, 0); }
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SMCTracesParser.SQUARE_BRACKET_R, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SMCTracesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SMCTracesParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SMCTracesParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SMCTracesParser.ASSIGN, i);
		}
		public List<TerminalNode> POINT() { return getTokens(SMCTracesParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(SMCTracesParser.POINT, i);
		}
		public List<TerminalNode> NAT() { return getTokens(SMCTracesParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(SMCTracesParser.NAT, i);
		}
		public List<TerminalNode> NUMERAL() { return getTokens(SMCTracesParser.NUMERAL); }
		public TerminalNode NUMERAL(int i) {
			return getToken(SMCTracesParser.NUMERAL, i);
		}
		public ClocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterClocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitClocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitClocks(this);
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
			setState(83);
			match(SQUARE_BRACKET_L);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERAL) {
					{
					setState(84);
					match(NUMERAL);
					}
				}

				setState(87);
				match(IDENTIFIER);
				setState(88);
				match(ASSIGN);
				setState(89);
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
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==NUMERAL );
			setState(94);
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
		public TerminalNode DELAY() { return getToken(SMCTracesParser.DELAY, 0); }
		public TerminalNode POINT() { return getToken(SMCTracesParser.POINT, 0); }
		public DelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitDelay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitDelay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelayContext delay() throws RecognitionException {
		DelayContext _localctx = new DelayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(DELAY);
			setState(97);
			match(POINT);
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
		public TerminalNode TRANSITION() { return getToken(SMCTracesParser.TRANSITION, 0); }
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
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterDiscrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitDiscrete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitDiscrete(this);
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
			setState(99);
			match(TRANSITION);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				aDiscrete();
				}
				}
				setState(103); 
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
		public TerminalNode ARROW() { return getToken(SMCTracesParser.ARROW, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(SMCTracesParser.BRACKET_LEFT, 0); }
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SMCTracesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SMCTracesParser.COMMA, i);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(SMCTracesParser.BRACKET_RIGHT, 0); }
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public TerminalNode NAT() { return getToken(SMCTracesParser.NAT, 0); }
		public ADiscreteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aDiscrete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterADiscrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitADiscrete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitADiscrete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ADiscreteContext aDiscrete() throws RecognitionException {
		ADiscreteContext _localctx = new ADiscreteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_aDiscrete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			loc();
			setState(106);
			match(ARROW);
			setState(107);
			loc();
			setState(108);
			match(BRACKET_LEFT);
			setState(109);
			guard();
			setState(110);
			match(COMMA);
			setState(111);
			action();
			setState(112);
			match(COMMA);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(113);
				update();
				}
				break;
			case NAT:
				{
				setState(114);
				match(NAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
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
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_action);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				sync();
				}
				break;
			case TAU:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
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
		public TerminalNode IDENTIFIER() { return getToken(SMCTracesParser.IDENTIFIER, 0); }
		public TerminalNode QUESTION() { return getToken(SMCTracesParser.QUESTION, 0); }
		public TerminalNode EXCLAMATION() { return getToken(SMCTracesParser.EXCLAMATION, 0); }
		public SyncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sync; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterSync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitSync(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitSync(this);
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
			setState(125);
			match(IDENTIFIER);
			setState(126);
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
		public TerminalNode TAU() { return getToken(SMCTracesParser.TAU, 0); }
		public TauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tau; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterTau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitTau(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitTau(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TauContext tau() throws RecognitionException {
		TauContext _localctx = new TauContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tau);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		public List<TerminalNode> COMMA() { return getTokens(SMCTracesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SMCTracesParser.COMMA, i);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitUpdate(this);
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
			setState(130);
			assign();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(132);
				assign();
				}
				}
				setState(137);
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
		public TerminalNode ASSIGN_COLON() { return getToken(SMCTracesParser.ASSIGN_COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			varFieldDecl();
			setState(139);
			match(ASSIGN_COLON);
			setState(140);
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
		public TerminalNode INCREMENT() { return getToken(SMCTracesParser.INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitIncrementExpr(this);
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
		public TerminalNode QUESTION() { return getToken(SMCTracesParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(SMCTracesParser.COLON, 0); }
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExprContext extends ExprContext {
		public TerminalNode PAR_LEFT() { return getToken(SMCTracesParser.PAR_LEFT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(SMCTracesParser.PAR_RIGHT, 0); }
		public ParenthesisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitParenthesisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitParenthesisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(SMCTracesParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitTrueExpr(this);
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
		public TerminalNode LESS() { return getToken(SMCTracesParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(SMCTracesParser.LESSEQ, 0); }
		public TerminalNode COMPARE() { return getToken(SMCTracesParser.COMPARE, 0); }
		public TerminalNode DIFFERENT() { return getToken(SMCTracesParser.DIFFERENT, 0); }
		public TerminalNode GREATEREQ() { return getToken(SMCTracesParser.GREATEREQ, 0); }
		public TerminalNode GREATER() { return getToken(SMCTracesParser.GREATER, 0); }
		public ComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitComparisonExpr(this);
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
		public TerminalNode ADD() { return getToken(SMCTracesParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SMCTracesParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(SMCTracesParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SMCTracesParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(SMCTracesParser.PERCENT, 0); }
		public TerminalNode BITAND() { return getToken(SMCTracesParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(SMCTracesParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(SMCTracesParser.BITXOR, 0); }
		public TerminalNode LSHIFT() { return getToken(SMCTracesParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(SMCTracesParser.RSHIFT, 0); }
		public TerminalNode AND_SYMBOL() { return getToken(SMCTracesParser.AND_SYMBOL, 0); }
		public TerminalNode OR_SYMBOL() { return getToken(SMCTracesParser.OR_SYMBOL, 0); }
		public TerminalNode MINIMUM() { return getToken(SMCTracesParser.MINIMUM, 0); }
		public TerminalNode MAXIMUM() { return getToken(SMCTracesParser.MAXIMUM, 0); }
		public TerminalNode OR() { return getToken(SMCTracesParser.OR, 0); }
		public TerminalNode AND() { return getToken(SMCTracesParser.AND, 0); }
		public TerminalNode COMMA() { return getToken(SMCTracesParser.COMMA, 0); }
		public TerminalNode IMPLY() { return getToken(SMCTracesParser.IMPLY, 0); }
		public BinaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIncrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SMCTracesParser.INCREMENT, 0); }
		public ExprIncrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterExprIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitExprIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitExprIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SMCTracesParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMCTracesParser.IDENTIFIER, 0); }
		public DotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitDotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitDotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallExprContext extends ExprContext {
		public TerminalNode FORALL() { return getToken(SMCTracesParser.FORALL, 0); }
		public TerminalNode PAR_LEFT() { return getToken(SMCTracesParser.PAR_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMCTracesParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SMCTracesParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(SMCTracesParser.PAR_RIGHT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterForallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitForallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitForallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token unary;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(SMCTracesParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(SMCTracesParser.ADD, 0); }
		public TerminalNode EXCLAMATION() { return getToken(SMCTracesParser.EXCLAMATION, 0); }
		public TerminalNode NOT() { return getToken(SMCTracesParser.NOT, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumExprContext extends ExprContext {
		public TerminalNode SUM() { return getToken(SMCTracesParser.SUM, 0); }
		public TerminalNode PAR_LEFT() { return getToken(SMCTracesParser.PAR_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMCTracesParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SMCTracesParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(SMCTracesParser.PAR_RIGHT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterSumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitSumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitSumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_LEFT() { return getToken(SMCTracesParser.PAR_LEFT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(SMCTracesParser.PAR_RIGHT, 0); }
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDecrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(SMCTracesParser.DECREMENT, 0); }
		public ExprDecrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterExprDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitExprDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitExprDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(SMCTracesParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitFalseExpr(this);
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
		public TerminalNode ASSIGN() { return getToken(SMCTracesParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_COLON() { return getToken(SMCTracesParser.ASSIGN_COLON, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(SMCTracesParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(SMCTracesParser.ASSIGN_SUB, 0); }
		public TerminalNode ASSIGN_MUL() { return getToken(SMCTracesParser.ASSIGN_MUL, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(SMCTracesParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_PERCENT() { return getToken(SMCTracesParser.ASSIGN_PERCENT, 0); }
		public TerminalNode ASSIGN_OR() { return getToken(SMCTracesParser.ASSIGN_OR, 0); }
		public TerminalNode ASSIGN_AND() { return getToken(SMCTracesParser.ASSIGN_AND, 0); }
		public TerminalNode ASSIGN_XOR() { return getToken(SMCTracesParser.ASSIGN_XOR, 0); }
		public TerminalNode ASSIGN_LSHIFT() { return getToken(SMCTracesParser.ASSIGN_LSHIFT, 0); }
		public TerminalNode ASSIGN_RSHIFT() { return getToken(SMCTracesParser.ASSIGN_RSHIFT, 0); }
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleExprContext extends ExprContext {
		public TerminalNode POINT() { return getToken(SMCTracesParser.POINT, 0); }
		public DoubleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterDoubleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitDoubleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitDoubleExpr(this);
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
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SMCTracesParser.SQUARE_BRACKET_L, 0); }
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SMCTracesParser.SQUARE_BRACKET_R, 0); }
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StopWatchExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DERIVATE() { return getToken(SMCTracesParser.DERIVATE, 0); }
		public StopWatchExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterStopWatchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitStopWatchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitStopWatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(SMCTracesParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NatExprContext extends ExprContext {
		public TerminalNode NAT() { return getToken(SMCTracesParser.NAT, 0); }
		public NatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterNatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitNatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitNatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsExprContext extends ExprContext {
		public TerminalNode EXISTS() { return getToken(SMCTracesParser.EXISTS, 0); }
		public TerminalNode PAR_LEFT() { return getToken(SMCTracesParser.PAR_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SMCTracesParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SMCTracesParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(SMCTracesParser.PAR_RIGHT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExistsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterExistsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitExistsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitExistsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementExprContext extends ExprContext {
		public TerminalNode DECREMENT() { return getToken(SMCTracesParser.DECREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterDecrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitDecrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitDecrementExpr(this);
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
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(143);
				match(IDENTIFIER);
				}
				break;
			case NAT:
				{
				_localctx = new NatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(NAT);
				}
				break;
			case POINT:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(POINT);
				}
				break;
			case PAR_LEFT:
				{
				_localctx = new ParenthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(PAR_LEFT);
				setState(147);
				expr(0);
				setState(148);
				match(PAR_RIGHT);
				}
				break;
			case INCREMENT:
				{
				_localctx = new IncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(INCREMENT);
				setState(151);
				expr(15);
				}
				break;
			case DECREMENT:
				{
				_localctx = new DecrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(DECREMENT);
				setState(153);
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
				setState(154);
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
				setState(155);
				expr(11);
				}
				break;
			case FORALL:
				{
				_localctx = new ForallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(FORALL);
				setState(157);
				match(PAR_LEFT);
				setState(158);
				match(IDENTIFIER);
				setState(159);
				match(COLON);
				setState(160);
				type();
				setState(161);
				match(PAR_RIGHT);
				setState(162);
				expr(5);
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(EXISTS);
				setState(165);
				match(PAR_LEFT);
				setState(166);
				match(IDENTIFIER);
				setState(167);
				match(COLON);
				setState(168);
				type();
				setState(169);
				match(PAR_RIGHT);
				setState(170);
				expr(4);
				}
				break;
			case SUM:
				{
				_localctx = new SumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(SUM);
				setState(173);
				match(PAR_LEFT);
				setState(174);
				match(IDENTIFIER);
				setState(175);
				match(COLON);
				setState(176);
				type();
				setState(177);
				match(PAR_RIGHT);
				setState(178);
				expr(3);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(185);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_COLON) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MUL) | (1L << ASSIGN_DIV) | (1L << ASSIGN_PERCENT) | (1L << ASSIGN_OR) | (1L << ASSIGN_AND) | (1L << ASSIGN_XOR) | (1L << ASSIGN_LSHIFT) | (1L << ASSIGN_RSHIFT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(188);
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
						setState(189);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(191);
						((BinaryExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (COMMA - 18)) | (1L << (ADD - 18)) | (1L << (SUB - 18)) | (1L << (MUL - 18)) | (1L << (DIV - 18)) | (1L << (PERCENT - 18)) | (1L << (BITAND - 18)) | (1L << (BITOR - 18)) | (1L << (BITXOR - 18)) | (1L << (LSHIFT - 18)) | (1L << (RSHIFT - 18)) | (1L << (AND_SYMBOL - 18)) | (1L << (OR_SYMBOL - 18)) | (1L << (MINIMUM - 18)) | (1L << (MAXIMUM - 18)) | (1L << (OR - 18)) | (1L << (AND - 18)) | (1L << (IMPLY - 18)))) != 0)) ) {
							((BinaryExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new IfExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(194);
						match(QUESTION);
						setState(195);
						expr(0);
						setState(196);
						match(COLON);
						setState(197);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(200);
						match(SQUARE_BRACKET_L);
						setState(201);
						expr(0);
						setState(202);
						match(SQUARE_BRACKET_R);
						}
						break;
					case 6:
						{
						_localctx = new StopWatchExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(205);
						match(DERIVATE);
						}
						break;
					case 7:
						{
						_localctx = new ExprIncrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(207);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new ExprDecrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(209);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(211);
						match(DOT);
						setState(212);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new FuncExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(214);
						match(PAR_LEFT);
						setState(215);
						arguments();
						setState(216);
						match(PAR_RIGHT);
						}
						break;
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(SMCTracesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SMCTracesParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitArguments(this);
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
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NAT) | (1L << POINT) | (1L << PAR_LEFT) | (1L << EXCLAMATION) | (1L << FORALL) | (1L << EXISTS) | (1L << SUM) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ADD) | (1L << SUB) | (1L << NOT))) != 0)) {
				{
				setState(223);
				expr(0);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(224);
					match(COMMA);
					setState(225);
					expr(0);
					}
					}
					setState(230);
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
		public TerminalNode BOOL() { return getToken(SMCTracesParser.BOOL, 0); }
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructTypeContext extends TypeContext {
		public TerminalNode STRUCT() { return getToken(SMCTracesParser.STRUCT, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(SMCTracesParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(SMCTracesParser.BRACKET_RIGHT, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public StructTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleTypeContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(SMCTracesParser.DOUBLE, 0); }
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarTypeContext extends TypeContext {
		public TerminalNode SCALAR() { return getToken(SMCTracesParser.SCALAR, 0); }
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SMCTracesParser.SQUARE_BRACKET_L, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SMCTracesParser.SQUARE_BRACKET_R, 0); }
		public ScalarTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierTypeContext extends TypeContext {
		public TerminalNode IDENTIFIER() { return getToken(SMCTracesParser.IDENTIFIER, 0); }
		public IdentifierTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterIdentifierType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitIdentifierType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitIdentifierType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDomainTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(SMCTracesParser.INT, 0); }
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SMCTracesParser.SQUARE_BRACKET_L, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SMCTracesParser.COMMA, 0); }
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SMCTracesParser.SQUARE_BRACKET_R, 0); }
		public IntDomainTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterIntDomainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitIntDomainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitIntDomainType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(SMCTracesParser.INT, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClockTypeContext extends TypeContext {
		public TerminalNode CLOCK() { return getToken(SMCTracesParser.CLOCK, 0); }
		public ClockTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterClockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitClockType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitClockType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChanTypeContext extends TypeContext {
		public TerminalNode CHAN() { return getToken(SMCTracesParser.CHAN, 0); }
		public ChanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterChanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitChanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitChanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(INT);
				}
				break;
			case 3:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(DOUBLE);
				}
				break;
			case 4:
				_localctx = new ClockTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(CLOCK);
				}
				break;
			case 5:
				_localctx = new ChanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(CHAN);
				}
				break;
			case 6:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				match(BOOL);
				}
				break;
			case 7:
				_localctx = new IntDomainTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(239);
				match(INT);
				setState(240);
				match(SQUARE_BRACKET_L);
				setState(241);
				expr(0);
				setState(242);
				match(COMMA);
				setState(243);
				expr(0);
				setState(244);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 8:
				_localctx = new ScalarTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				match(SCALAR);
				setState(247);
				match(SQUARE_BRACKET_L);
				setState(248);
				expr(0);
				setState(249);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 9:
				_localctx = new StructTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(251);
				match(STRUCT);
				setState(252);
				match(BRACKET_LEFT);
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(253);
					fieldDecl();
					}
					}
					setState(256); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << CLOCK) | (1L << CHAN) | (1L << BOOL) | (1L << SCALAR) | (1L << STRUCT))) != 0) );
				setState(258);
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
		public TerminalNode SEMICOLON() { return getToken(SMCTracesParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SMCTracesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SMCTracesParser.COMMA, i);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitFieldDecl(this);
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
			setState(262);
			type();
			setState(263);
			varFieldDecl();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264);
				match(COMMA);
				setState(265);
				varFieldDecl();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
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
		public TerminalNode IDENTIFIER() { return getToken(SMCTracesParser.IDENTIFIER, 0); }
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
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterVarFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitVarFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitVarFieldDecl(this);
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
			setState(273);
			match(IDENTIFIER);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SQUARE_BRACKET_L) {
				{
				{
				setState(274);
				arrayDecl();
				}
				}
				setState(279);
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
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SMCTracesParser.SQUARE_BRACKET_L, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SMCTracesParser.SQUARE_BRACKET_R, 0); }
		public ArrayDeclExprContext(ArrayDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterArrayDeclExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitArrayDeclExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitArrayDeclExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclTypeContext extends ArrayDeclContext {
		public TerminalNode SQUARE_BRACKET_L() { return getToken(SMCTracesParser.SQUARE_BRACKET_L, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_R() { return getToken(SMCTracesParser.SQUARE_BRACKET_R, 0); }
		public ArrayDeclTypeContext(ArrayDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).enterArrayDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMCTracesParserListener ) ((SMCTracesParserListener)listener).exitArrayDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMCTracesParserVisitor ) return ((SMCTracesParserVisitor<? extends T>)visitor).visitArrayDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayDecl);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(SQUARE_BRACKET_L);
				setState(281);
				expr(0);
				setState(282);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 2:
				_localctx = new ArrayDeclTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(SQUARE_BRACKET_L);
				setState(285);
				type();
				setState(286);
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
		"\u0004\u0001J\u0123\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"+
		"\n\u0000\f\u00004\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u0003A\b\u0003\u000b\u0003\f\u0003B\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005O\b\u0005\n\u0005\f\u0005R\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006V\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006[\b\u0006\u000b\u0006\f\u0006\\\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0004"+
		"\bf\b\b\u000b\b\f\bg\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tt\b\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0003\u000b|\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0086"+
		"\b\u000e\n\u000e\f\u000e\u0089\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00b7\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00db\b\u0010\n\u0010\f\u0010\u00de\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00e3\b\u0011\n\u0011\f\u0011\u00e6\t\u0011\u0003\u0011"+
		"\u00e8\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u00ff\b\u0012"+
		"\u000b\u0012\f\u0012\u0100\u0001\u0012\u0001\u0012\u0003\u0012\u0105\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u010b"+
		"\b\u0013\n\u0013\f\u0013\u010e\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0114\b\u0014\n\u0014\f\u0014\u0117\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0121\b\u0015\u0001\u0015\u0000\u0001 "+
		"\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*\u0000\u0006\u0001\u0000\b\t\u0001\u0000\u0013"+
		"\u0014\u0002\u0000\u0014\u001424\u0001\u0000&1\u0001\u00006;\u0003\u0000"+
		"\u0012\u001223<J\u0139\u0000,\u0001\u0000\u0000\u0000\u00025\u0001\u0000"+
		"\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000"+
		"\bF\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\fS\u0001\u0000"+
		"\u0000\u0000\u000e`\u0001\u0000\u0000\u0000\u0010c\u0001\u0000\u0000\u0000"+
		"\u0012i\u0001\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016{"+
		"\u0001\u0000\u0000\u0000\u0018}\u0001\u0000\u0000\u0000\u001a\u0080\u0001"+
		"\u0000\u0000\u0000\u001c\u0082\u0001\u0000\u0000\u0000\u001e\u008a\u0001"+
		"\u0000\u0000\u0000 \u00b6\u0001\u0000\u0000\u0000\"\u00e7\u0001\u0000"+
		"\u0000\u0000$\u0104\u0001\u0000\u0000\u0000&\u0106\u0001\u0000\u0000\u0000"+
		"(\u0111\u0001\u0000\u0000\u0000*\u0120\u0001\u0000\u0000\u0000,2\u0003"+
		"\u0002\u0001\u0000-.\u0003\u0004\u0002\u0000./\u0003\u0002\u0001\u0000"+
		"/1\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u000014\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0001\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0005\u0003\u0000\u0000"+
		"67\u0003\u0006\u0003\u000078\u0003\n\u0005\u000089\u0003\f\u0006\u0000"+
		"9\u0003\u0001\u0000\u0000\u0000:=\u0003\u000e\u0007\u0000;=\u0003\u0010"+
		"\b\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0005\u0001"+
		"\u0000\u0000\u0000>@\u0005\r\u0000\u0000?A\u0003\b\u0004\u0000@?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005\u000e\u0000"+
		"\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0005\u0007\u0000\u0000GH\u0005"+
		"\u000f\u0000\u0000HI\u0005\u0007\u0000\u0000I\t\u0001\u0000\u0000\u0000"+
		"JK\u0003(\u0014\u0000KL\u0005&\u0000\u0000LM\u0003 \u0010\u0000MO\u0001"+
		"\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u000b\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000SZ\u0005\u001f\u0000\u0000TV\u0005"+
		"5\u0000\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0005\u0007\u0000\u0000XY\u0005&\u0000\u0000Y[\u0007"+
		"\u0000\u0000\u0000ZU\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0005 \u0000\u0000_\r\u0001\u0000\u0000\u0000`a\u0005\u0004\u0000"+
		"\u0000ab\u0005\t\u0000\u0000b\u000f\u0001\u0000\u0000\u0000ce\u0005\u0005"+
		"\u0000\u0000df\u0003\u0012\t\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0011"+
		"\u0001\u0000\u0000\u0000ij\u0003\b\u0004\u0000jk\u0005\n\u0000\u0000k"+
		"l\u0003\b\u0004\u0000lm\u0005\u000b\u0000\u0000mn\u0003\u0014\n\u0000"+
		"no\u0005\u0012\u0000\u0000op\u0003\u0016\u000b\u0000ps\u0005\u0012\u0000"+
		"\u0000qt\u0003\u001c\u000e\u0000rt\u0005\b\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\f\u0000"+
		"\u0000v\u0013\u0001\u0000\u0000\u0000wx\u0003 \u0010\u0000x\u0015\u0001"+
		"\u0000\u0000\u0000y|\u0003\u0018\f\u0000z|\u0003\u001a\r\u0000{y\u0001"+
		"\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u0017\u0001\u0000\u0000"+
		"\u0000}~\u0005\u0007\u0000\u0000~\u007f\u0007\u0001\u0000\u0000\u007f"+
		"\u0019\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0006\u0000\u0000\u0081"+
		"\u001b\u0001\u0000\u0000\u0000\u0082\u0087\u0003\u001e\u000f\u0000\u0083"+
		"\u0084\u0005\u0012\u0000\u0000\u0084\u0086\u0003\u001e\u000f\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u001d\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0003(\u0014\u0000\u008b\u008c\u0005\'\u0000\u0000\u008c\u008d"+
		"\u0003 \u0010\u0000\u008d\u001f\u0001\u0000\u0000\u0000\u008e\u008f\u0006"+
		"\u0010\uffff\uffff\u0000\u008f\u00b7\u0005\u0007\u0000\u0000\u0090\u00b7"+
		"\u0005\b\u0000\u0000\u0091\u00b7\u0005\t\u0000\u0000\u0092\u0093\u0005"+
		"\r\u0000\u0000\u0093\u0094\u0003 \u0010\u0000\u0094\u0095\u0005\u000e"+
		"\u0000\u0000\u0095\u00b7\u0001\u0000\u0000\u0000\u0096\u0097\u0005$\u0000"+
		"\u0000\u0097\u00b7\u0003 \u0010\u000f\u0098\u0099\u0005%\u0000\u0000\u0099"+
		"\u00b7\u0003 \u0010\r\u009a\u009b\u0007\u0002\u0000\u0000\u009b\u00b7"+
		"\u0003 \u0010\u000b\u009c\u009d\u0005\u0015\u0000\u0000\u009d\u009e\u0005"+
		"\r\u0000\u0000\u009e\u009f\u0005\u0007\u0000\u0000\u009f\u00a0\u0005\u0010"+
		"\u0000\u0000\u00a0\u00a1\u0003$\u0012\u0000\u00a1\u00a2\u0005\u000e\u0000"+
		"\u0000\u00a2\u00a3\u0003 \u0010\u0005\u00a3\u00b7\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0016\u0000\u0000\u00a5\u00a6\u0005\r\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0007\u0000\u0000\u00a7\u00a8\u0005\u0010\u0000\u0000\u00a8"+
		"\u00a9\u0003$\u0012\u0000\u00a9\u00aa\u0005\u000e\u0000\u0000\u00aa\u00ab"+
		"\u0003 \u0010\u0004\u00ab\u00b7\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0017\u0000\u0000\u00ad\u00ae\u0005\r\u0000\u0000\u00ae\u00af\u0005\u0007"+
		"\u0000\u0000\u00af\u00b0\u0005\u0010\u0000\u0000\u00b0\u00b1\u0003$\u0012"+
		"\u0000\u00b1\u00b2\u0005\u000e\u0000\u0000\u00b2\u00b3\u0003 \u0010\u0003"+
		"\u00b3\u00b7\u0001\u0000\u0000\u0000\u00b4\u00b7\u0005\u0018\u0000\u0000"+
		"\u00b5\u00b7\u0005\u0019\u0000\u0000\u00b6\u008e\u0001\u0000\u0000\u0000"+
		"\u00b6\u0090\u0001\u0000\u0000\u0000\u00b6\u0091\u0001\u0000\u0000\u0000"+
		"\u00b6\u0092\u0001\u0000\u0000\u0000\u00b6\u0096\u0001\u0000\u0000\u0000"+
		"\u00b6\u0098\u0001\u0000\u0000\u0000\u00b6\u009a\u0001\u0000\u0000\u0000"+
		"\u00b6\u009c\u0001\u0000\u0000\u0000\u00b6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00ac\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00dc\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\n\f\u0000\u0000\u00b9\u00ba\u0007\u0003\u0000\u0000\u00ba"+
		"\u00db\u0003 \u0010\r\u00bb\u00bc\n\n\u0000\u0000\u00bc\u00bd\u0007\u0004"+
		"\u0000\u0000\u00bd\u00db\u0003 \u0010\u000b\u00be\u00bf\n\t\u0000\u0000"+
		"\u00bf\u00c0\u0007\u0005\u0000\u0000\u00c0\u00db\u0003 \u0010\n\u00c1"+
		"\u00c2\n\b\u0000\u0000\u00c2\u00c3\u0005\u0013\u0000\u0000\u00c3\u00c4"+
		"\u0003 \u0010\u0000\u00c4\u00c5\u0005\u0010\u0000\u0000\u00c5\u00c6\u0003"+
		" \u0010\t\u00c6\u00db\u0001\u0000\u0000\u0000\u00c7\u00c8\n\u0013\u0000"+
		"\u0000\u00c8\u00c9\u0005\u001f\u0000\u0000\u00c9\u00ca\u0003 \u0010\u0000"+
		"\u00ca\u00cb\u0005 \u0000\u0000\u00cb\u00db\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\n\u0012\u0000\u0000\u00cd\u00db\u0005#\u0000\u0000\u00ce\u00cf"+
		"\n\u0010\u0000\u0000\u00cf\u00db\u0005$\u0000\u0000\u00d0\u00d1\n\u000e"+
		"\u0000\u0000\u00d1\u00db\u0005%\u0000\u0000\u00d2\u00d3\n\u0007\u0000"+
		"\u0000\u00d3\u00d4\u0005\u000f\u0000\u0000\u00d4\u00db\u0005\u0007\u0000"+
		"\u0000\u00d5\u00d6\n\u0006\u0000\u0000\u00d6\u00d7\u0005\r\u0000\u0000"+
		"\u00d7\u00d8\u0003\"\u0011\u0000\u00d8\u00d9\u0005\u000e\u0000\u0000\u00d9"+
		"\u00db\u0001\u0000\u0000\u0000\u00da\u00b8\u0001\u0000\u0000\u0000\u00da"+
		"\u00bb\u0001\u0000\u0000\u0000\u00da\u00be\u0001\u0000\u0000\u0000\u00da"+
		"\u00c1\u0001\u0000\u0000\u0000\u00da\u00c7\u0001\u0000\u0000\u0000\u00da"+
		"\u00cc\u0001\u0000\u0000\u0000\u00da\u00ce\u0001\u0000\u0000\u0000\u00da"+
		"\u00d0\u0001\u0000\u0000\u0000\u00da\u00d2\u0001\u0000\u0000\u0000\u00da"+
		"\u00d5\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"!\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e4"+
		"\u0003 \u0010\u0000\u00e0\u00e1\u0005\u0012\u0000\u0000\u00e1\u00e3\u0003"+
		" \u0010\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8#\u0001\u0000\u0000\u0000\u00e9\u0105\u0005\u0007\u0000"+
		"\u0000\u00ea\u0105\u0005\u001a\u0000\u0000\u00eb\u0105\u0005\u001b\u0000"+
		"\u0000\u00ec\u0105\u0005\u001c\u0000\u0000\u00ed\u0105\u0005\u001d\u0000"+
		"\u0000\u00ee\u0105\u0005\u001e\u0000\u0000\u00ef\u00f0\u0005\u001a\u0000"+
		"\u0000\u00f0\u00f1\u0005\u001f\u0000\u0000\u00f1\u00f2\u0003 \u0010\u0000"+
		"\u00f2\u00f3\u0005\u0012\u0000\u0000\u00f3\u00f4\u0003 \u0010\u0000\u00f4"+
		"\u00f5\u0005 \u0000\u0000\u00f5\u0105\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005!\u0000\u0000\u00f7\u00f8\u0005\u001f\u0000\u0000\u00f8\u00f9\u0003"+
		" \u0010\u0000\u00f9\u00fa\u0005 \u0000\u0000\u00fa\u0105\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005\"\u0000\u0000\u00fc\u00fe\u0005\u000b\u0000\u0000"+
		"\u00fd\u00ff\u0003&\u0013\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005\f\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00e9"+
		"\u0001\u0000\u0000\u0000\u0104\u00ea\u0001\u0000\u0000\u0000\u0104\u00eb"+
		"\u0001\u0000\u0000\u0000\u0104\u00ec\u0001\u0000\u0000\u0000\u0104\u00ed"+
		"\u0001\u0000\u0000\u0000\u0104\u00ee\u0001\u0000\u0000\u0000\u0104\u00ef"+
		"\u0001\u0000\u0000\u0000\u0104\u00f6\u0001\u0000\u0000\u0000\u0104\u00fb"+
		"\u0001\u0000\u0000\u0000\u0105%\u0001\u0000\u0000\u0000\u0106\u0107\u0003"+
		"$\u0012\u0000\u0107\u010c\u0003(\u0014\u0000\u0108\u0109\u0005\u0012\u0000"+
		"\u0000\u0109\u010b\u0003(\u0014\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0011\u0000\u0000"+
		"\u0110\'\u0001\u0000\u0000\u0000\u0111\u0115\u0005\u0007\u0000\u0000\u0112"+
		"\u0114\u0003*\u0015\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116)\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0005\u001f\u0000\u0000\u0119\u011a\u0003"+
		" \u0010\u0000\u011a\u011b\u0005 \u0000\u0000\u011b\u0121\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0005\u001f\u0000\u0000\u011d\u011e\u0003$\u0012\u0000"+
		"\u011e\u011f\u0005 \u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120"+
		"\u0118\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0121"+
		"+\u0001\u0000\u0000\u0000\u00142<BPU\\gs{\u0087\u00b6\u00da\u00dc\u00e4"+
		"\u00e7\u0100\u0104\u010c\u0115\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}