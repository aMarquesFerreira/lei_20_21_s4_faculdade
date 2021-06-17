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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PERCENT=7, DIGIT_NO_ZERO=8, 
		DIGIT=9, DOT=10, LOWERCHAR=11, UPPERCHAR=12, WS=13;
	public static final int
		RULE_program = 0, RULE_state = 1, RULE_decision = 2, RULE_discountType = 3, 
		RULE_recurrence = 4, RULE_confirmPercentage = 5, RULE_confirmValue = 6, 
		RULE_invoiceID = 7, RULE_deadline = 8, RULE_year = 9, RULE_month = 10, 
		RULE_day = 11, RULE_base = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "state", "decision", "discountType", "recurrence", "confirmPercentage", 
			"confirmValue", "invoiceID", "deadline", "year", "month", "day", "base"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'percentage'", "'valor'", "'1'", "'2'", "'0'", "'3'", "'%'", null, 
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PERCENT", "DIGIT_NO_ZERO", 
			"DIGIT", "DOT", "LOWERCHAR", "UPPERCHAR", "WS"
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
			setState(26);
			state();
			setState(27);
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
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
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
		public DeadlineContext deadline() {
			return getRuleContext(DeadlineContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			decision();
			setState(30);
			base();
			setState(31);
			confirmPercentage();
			setState(32);
			confirmValue();
			setState(33);
			deadline();
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(35);
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
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(38); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DiscountTypeContext extends ParserRuleContext {
		public DiscountTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discountType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterDiscountType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitDiscountType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitDiscountType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiscountTypeContext discountType() throws RecognitionException {
		DiscountTypeContext _localctx = new DiscountTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_discountType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class RecurrenceContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(DiscountApprovalParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiscountApprovalParser.DIGIT, i);
		}
		public RecurrenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recurrence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterRecurrence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitRecurrence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitRecurrence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecurrenceContext recurrence() throws RecognitionException {
		RecurrenceContext _localctx = new RecurrenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_recurrence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(42);
				match(DIGIT);
				}
				}
				setState(47);
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
		enterRule(_localctx, 10, RULE_confirmPercentage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(48);
			match(DIGIT);
			setState(49);
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
		enterRule(_localctx, 12, RULE_confirmValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
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

	public static class InvoiceIDContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(DiscountApprovalParser.DIGIT, 0); }
		public InvoiceIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoiceID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).enterInvoiceID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountApprovalListener ) ((DiscountApprovalListener)listener).exitInvoiceID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountApprovalVisitor ) return ((DiscountApprovalVisitor<? extends T>)visitor).visitInvoiceID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvoiceIDContext invoiceID() throws RecognitionException {
		InvoiceIDContext _localctx = new InvoiceIDContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_invoiceID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
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
		enterRule(_localctx, 16, RULE_deadline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(55);
			day();
			setState(56);
			match(DOT);
			setState(57);
			month();
			setState(58);
			match(DOT);
			setState(59);
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
		enterRule(_localctx, 18, RULE_year);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(62);
			match(DIGIT);
			setState(63);
			match(DIGIT);
			setState(64);
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
		enterRule(_localctx, 20, RULE_month);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case DIGIT_NO_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(66);
					match(T__4);
					}
				}

				setState(69);
				match(DIGIT_NO_ZERO);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(70);
				match(T__2);
				setState(71);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_day);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case DIGIT_NO_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(74);
					match(T__4);
					}
				}

				setState(77);
				match(DIGIT_NO_ZERO);
				}
				}
				break;
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(78);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(79);
				match(DIGIT);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(80);
				match(T__5);
				setState(81);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__4) ) {
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
		enterRule(_localctx, 24, RULE_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
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
				setState(87); 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4"+
		"\'\n\4\r\4\16\4(\3\5\3\5\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\5\f"+
		"F\n\f\3\f\3\f\3\f\5\fK\n\f\3\r\5\rN\n\r\3\r\3\r\3\r\3\r\3\r\5\rU\n\r\3"+
		"\16\6\16X\n\16\r\16\16\16Y\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\2\7\3\2\r\16\3\2\3\4\3\2\5\6\3\2\5\7\4\2\5\5\7\7\2V\2\34\3\2\2\2\4\37"+
		"\3\2\2\2\6&\3\2\2\2\b*\3\2\2\2\n/\3\2\2\2\f\62\3\2\2\2\16\65\3\2\2\2\20"+
		"\67\3\2\2\2\229\3\2\2\2\24?\3\2\2\2\26J\3\2\2\2\30T\3\2\2\2\32W\3\2\2"+
		"\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \5\6\4\2 !\5\32\16\2!\""+
		"\5\f\7\2\"#\5\16\b\2#$\5\22\n\2$\5\3\2\2\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2"+
		"\2\2(&\3\2\2\2()\3\2\2\2)\7\3\2\2\2*+\t\3\2\2+\t\3\2\2\2,.\7\13\2\2-,"+
		"\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\13\3\2\2\2\61/\3\2\2\2\62"+
		"\63\7\13\2\2\63\64\7\t\2\2\64\r\3\2\2\2\65\66\7\13\2\2\66\17\3\2\2\2\67"+
		"8\7\13\2\28\21\3\2\2\29:\5\30\r\2:;\7\f\2\2;<\5\26\f\2<=\7\f\2\2=>\5\24"+
		"\13\2>\23\3\2\2\2?@\t\4\2\2@A\7\13\2\2AB\7\13\2\2BC\7\13\2\2C\25\3\2\2"+
		"\2DF\7\7\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GK\7\n\2\2HI\7\5\2\2IK\t\5\2"+
		"\2JE\3\2\2\2JH\3\2\2\2K\27\3\2\2\2LN\7\7\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2"+
		"\2\2OU\7\n\2\2PQ\t\4\2\2QU\7\13\2\2RS\7\b\2\2SU\t\6\2\2TM\3\2\2\2TP\3"+
		"\2\2\2TR\3\2\2\2U\31\3\2\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2Y"+
		"Z\3\2\2\2Z\33\3\2\2\2\t(/EJMTY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}