// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\DiscountApproval.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiscountApprovalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SPACE=5, PERCENT=6, DIGIT_NO_ZERO=7, DIGIT=8, 
		DOT=9, LOWERCHAR=10, UPPERCHAR=11, WS=12;
	public static final int
		RULE_program = 0, RULE_state = 1, RULE_decision = 2, RULE_confirmPercentage = 3, 
		RULE_confirmValue = 4, RULE_deadline = 5, RULE_year = 6, RULE_month = 7, 
		RULE_day = 8, RULE_base = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "state", "decision", "confirmPercentage", "confirmValue", 
			"deadline", "year", "month", "day", "base"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'1'", "'2'", "'0'", "'3'", "' '", "'%'", null, null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SPACE", "PERCENT", "DIGIT_NO_ZERO", "DIGIT", 
			"DOT", "LOWERCHAR", "UPPERCHAR", "WS"
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
	public String getGrammarFileName() { return "DiscountApproval.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiscountApprovalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DiscountApprovalParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			state();
			setState(21);
			match(EOF);
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
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	 
		public StateContext() { }
		public void copyFrom(StateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SendEmailContext extends StateContext {
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(DiscountApprovalParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(DiscountApprovalParser.SPACE, i);
		}
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public ConfirmPercentageContext confirmPercentage() {
			return getRuleContext(ConfirmPercentageContext.class,0);
		}
		public ConfirmValueContext confirmValue() {
			return getRuleContext(ConfirmValueContext.class,0);
		}
		public SendEmailContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterSendEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitSendEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitSendEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			_localctx = new SendEmailContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			decision();
			setState(24);
			match(SPACE);
			setState(25);
			base();
			setState(26);
			match(SPACE);
			setState(27);
			confirmPercentage();
			setState(28);
			match(SPACE);
			setState(29);
			confirmValue();
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

	public static class DecisionContext extends ParserRuleContext {
		public List<TerminalNode> LOWERCHAR() { return getTokens(DiscountApprovalParser.LOWERCHAR); }
		public TerminalNode LOWERCHAR(int i) {
			return getToken(DiscountApprovalParser.LOWERCHAR, i);
		}
		public List<TerminalNode> UPPERCHAR() { return getTokens(DiscountApprovalParser.UPPERCHAR); }
		public TerminalNode UPPERCHAR(int i) {
			return getToken(DiscountApprovalParser.UPPERCHAR, i);
		}
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterDecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitDecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitDecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				_la = _input.LA(1);
				if ( !(_la==LOWERCHAR || _la==UPPERCHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LOWERCHAR || _la==UPPERCHAR );
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

	public static class ConfirmPercentageContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(DiscountApprovalParser.DIGIT, 0); }
		public TerminalNode PERCENT() { return getToken(DiscountApprovalParser.PERCENT, 0); }
		public ConfirmPercentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confirmPercentage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterConfirmPercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitConfirmPercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitConfirmPercentage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfirmPercentageContext confirmPercentage() throws RecognitionException {
		ConfirmPercentageContext _localctx = new ConfirmPercentageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_confirmPercentage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(36);
			match(DIGIT);
			setState(37);
			match(PERCENT);
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

	public static class ConfirmValueContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(DiscountApprovalParser.DIGIT, 0); }
		public ConfirmValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confirmValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterConfirmValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitConfirmValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitConfirmValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfirmValueContext confirmValue() throws RecognitionException {
		ConfirmValueContext _localctx = new ConfirmValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_confirmValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(DIGIT);
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

	public static class DeadlineContext extends ParserRuleContext {
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(DiscountApprovalParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DiscountApprovalParser.DOT, i);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public DeadlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deadline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterDeadline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitDeadline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitDeadline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeadlineContext deadline() throws RecognitionException {
		DeadlineContext _localctx = new DeadlineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deadline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(41);
			day();
			setState(42);
			match(DOT);
			setState(43);
			month();
			setState(44);
			match(DOT);
			setState(45);
			year();
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

	public static class YearContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(DiscountApprovalParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiscountApprovalParser.DIGIT, i);
		}
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_year);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(48);
			match(DIGIT);
			setState(49);
			match(DIGIT);
			setState(50);
			match(DIGIT);
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

	public static class MonthContext extends ParserRuleContext {
		public TerminalNode DIGIT_NO_ZERO() { return getToken(DiscountApprovalParser.DIGIT_NO_ZERO, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_month);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case DIGIT_NO_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(52);
					match(T__2);
					}
				}

				setState(55);
				match(DIGIT_NO_ZERO);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(56);
				match(T__0);
				setState(57);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class DayContext extends ParserRuleContext {
		public TerminalNode DIGIT_NO_ZERO() { return getToken(DiscountApprovalParser.DIGIT_NO_ZERO, 0); }
		public TerminalNode DIGIT() { return getToken(DiscountApprovalParser.DIGIT, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_day);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case DIGIT_NO_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(60);
					match(T__2);
					}
				}

				setState(63);
				match(DIGIT_NO_ZERO);
				}
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(64);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				match(DIGIT);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(66);
				match(T__3);
				setState(67);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class BaseContext extends ParserRuleContext {
		public List<TerminalNode> UPPERCHAR() { return getTokens(DiscountApprovalParser.UPPERCHAR); }
		public TerminalNode UPPERCHAR(int i) {
			return getToken(DiscountApprovalParser.UPPERCHAR, i);
		}
		public List<TerminalNode> LOWERCHAR() { return getTokens(DiscountApprovalParser.LOWERCHAR); }
		public TerminalNode LOWERCHAR(int i) {
			return getToken(DiscountApprovalParser.LOWERCHAR, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(DiscountApprovalParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(DiscountApprovalParser.SPACE, i);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_base);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(70);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << LOWERCHAR) | (1L << UPPERCHAR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4#\n\4\r\4\16\4$\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\5\t8"+
		"\n\t\3\t\3\t\3\t\5\t=\n\t\3\n\5\n@\n\n\3\n\3\n\3\n\3\n\3\n\5\nG\n\n\3"+
		"\13\6\13J\n\13\r\13\16\13K\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\7\3\2"+
		"\f\r\3\2\3\4\3\2\3\5\4\2\3\3\5\5\4\2\7\7\f\r\2J\2\26\3\2\2\2\4\31\3\2"+
		"\2\2\6\"\3\2\2\2\b&\3\2\2\2\n)\3\2\2\2\f+\3\2\2\2\16\61\3\2\2\2\20<\3"+
		"\2\2\2\22F\3\2\2\2\24I\3\2\2\2\26\27\5\4\3\2\27\30\7\2\2\3\30\3\3\2\2"+
		"\2\31\32\5\6\4\2\32\33\7\7\2\2\33\34\5\24\13\2\34\35\7\7\2\2\35\36\5\b"+
		"\5\2\36\37\7\7\2\2\37 \5\n\6\2 \5\3\2\2\2!#\t\2\2\2\"!\3\2\2\2#$\3\2\2"+
		"\2$\"\3\2\2\2$%\3\2\2\2%\7\3\2\2\2&\'\7\n\2\2\'(\7\b\2\2(\t\3\2\2\2)*"+
		"\7\n\2\2*\13\3\2\2\2+,\5\22\n\2,-\7\13\2\2-.\5\20\t\2./\7\13\2\2/\60\5"+
		"\16\b\2\60\r\3\2\2\2\61\62\t\3\2\2\62\63\7\n\2\2\63\64\7\n\2\2\64\65\7"+
		"\n\2\2\65\17\3\2\2\2\668\7\5\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29"+
		"=\7\t\2\2:;\7\3\2\2;=\t\4\2\2<\67\3\2\2\2<:\3\2\2\2=\21\3\2\2\2>@\7\5"+
		"\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AG\7\t\2\2BC\t\3\2\2CG\7\n\2\2DE\7\6"+
		"\2\2EG\t\5\2\2F?\3\2\2\2FB\3\2\2\2FD\3\2\2\2G\23\3\2\2\2HJ\t\6\2\2IH\3"+
		"\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\25\3\2\2\2\b$\67<?FK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}