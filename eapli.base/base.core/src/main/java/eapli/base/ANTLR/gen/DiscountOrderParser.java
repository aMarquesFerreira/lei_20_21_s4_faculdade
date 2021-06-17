// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\DiscountOrder.g4 by ANTLR 4.9.1
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
public class DiscountOrderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, PERCENT=9, 
		DIGIT_NO_ZERO=10, DIGIT=11, DOT=12, LOWERCHAR=13, UPPERCHAR=14, WS=15;
	public static final int
		RULE_program = 0, RULE_state = 1, RULE_clientCode = 2, RULE_name = 3, 
		RULE_discountType = 4, RULE_recurrence = 5, RULE_discountPercentage = 6, 
		RULE_discountValor = 7, RULE_invoiceID = 8, RULE_deadline = 9, RULE_year = 10, 
		RULE_month = 11, RULE_day = 12, RULE_base = 13, RULE_digits = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "state", "clientCode", "name", "discountType", "recurrence", 
			"discountPercentage", "discountValor", "invoiceID", "deadline", "year", 
			"month", "day", "base", "digits"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Unica'", "'Ate data limite'", "'percentage'", "'valor'", "'1'", 
			"'2'", "'0'", "'3'", "'%'", null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "PERCENT", "DIGIT_NO_ZERO", 
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
	public String getGrammarFileName() { return "DiscountOrder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiscountOrderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DiscountOrderParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			state();
			setState(31);
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
		public ClientCodeContext clientCode() {
			return getRuleContext(ClientCodeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DiscountTypeContext discountType() {
			return getRuleContext(DiscountTypeContext.class,0);
		}
		public DiscountPercentageContext discountPercentage() {
			return getRuleContext(DiscountPercentageContext.class,0);
		}
		public DiscountValorContext discountValor() {
			return getRuleContext(DiscountValorContext.class,0);
		}
		public InvoiceIDContext invoiceID() {
			return getRuleContext(InvoiceIDContext.class,0);
		}
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
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
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				clientCode();
				setState(34);
				name();
				setState(35);
				discountType();
				setState(36);
				match(T__0);
				setState(37);
				discountPercentage();
				setState(38);
				discountValor();
				setState(39);
				invoiceID();
				setState(40);
				base();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				clientCode();
				setState(43);
				name();
				setState(44);
				discountType();
				setState(45);
				match(T__1);
				setState(46);
				discountPercentage();
				setState(47);
				discountValor();
				setState(48);
				deadline();
				setState(49);
				base();
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

	public static class ClientCodeContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(DiscountOrderParser.DIGIT, 0); }
		public ClientCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clientCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterClientCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitClientCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitClientCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClientCodeContext clientCode() throws RecognitionException {
		ClientCodeContext _localctx = new ClientCodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clientCode);
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> LOWERCHAR() { return getTokens(DiscountOrderParser.LOWERCHAR); }
		public TerminalNode LOWERCHAR(int i) {
			return getToken(DiscountOrderParser.LOWERCHAR, i);
		}
		public List<TerminalNode> UPPERCHAR() { return getTokens(DiscountOrderParser.UPPERCHAR); }
		public TerminalNode UPPERCHAR(int i) {
			return getToken(DiscountOrderParser.UPPERCHAR, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
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
				setState(58); 
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

	public static class DiscountTypeContext extends ParserRuleContext {
		public DiscountTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discountType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterDiscountType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitDiscountType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitDiscountType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiscountTypeContext discountType() throws RecognitionException {
		DiscountTypeContext _localctx = new DiscountTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_discountType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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
		public RecurrenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recurrence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterRecurrence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitRecurrence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitRecurrence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecurrenceContext recurrence() throws RecognitionException {
		RecurrenceContext _localctx = new RecurrenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_recurrence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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

	public static class DiscountPercentageContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(DiscountOrderParser.DIGIT, 0); }
		public TerminalNode PERCENT() { return getToken(DiscountOrderParser.PERCENT, 0); }
		public DiscountPercentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discountPercentage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterDiscountPercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitDiscountPercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitDiscountPercentage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiscountPercentageContext discountPercentage() throws RecognitionException {
		DiscountPercentageContext _localctx = new DiscountPercentageContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_discountPercentage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(64);
			match(DIGIT);
			setState(65);
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

	public static class DiscountValorContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(DiscountOrderParser.DIGIT, 0); }
		public DiscountValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discountValor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterDiscountValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitDiscountValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitDiscountValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiscountValorContext discountValor() throws RecognitionException {
		DiscountValorContext _localctx = new DiscountValorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_discountValor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
		public TerminalNode DIGIT() { return getToken(DiscountOrderParser.DIGIT, 0); }
		public InvoiceIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoiceID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterInvoiceID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitInvoiceID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitInvoiceID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvoiceIDContext invoiceID() throws RecognitionException {
		InvoiceIDContext _localctx = new InvoiceIDContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_invoiceID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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
		public List<TerminalNode> DOT() { return getTokens(DiscountOrderParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DiscountOrderParser.DOT, i);
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
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterDeadline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitDeadline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitDeadline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeadlineContext deadline() throws RecognitionException {
		DeadlineContext _localctx = new DeadlineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deadline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(71);
			day();
			setState(72);
			match(DOT);
			setState(73);
			month();
			setState(74);
			match(DOT);
			setState(75);
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
		public List<TerminalNode> DIGIT() { return getTokens(DiscountOrderParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiscountOrderParser.DIGIT, i);
		}
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_year);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(78);
			match(DIGIT);
			setState(79);
			match(DIGIT);
			setState(80);
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
		public TerminalNode DIGIT_NO_ZERO() { return getToken(DiscountOrderParser.DIGIT_NO_ZERO, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_month);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case DIGIT_NO_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(82);
					match(T__6);
					}
				}

				setState(85);
				match(DIGIT_NO_ZERO);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(86);
				match(T__4);
				setState(87);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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
		public TerminalNode DIGIT_NO_ZERO() { return getToken(DiscountOrderParser.DIGIT_NO_ZERO, 0); }
		public TerminalNode DIGIT() { return getToken(DiscountOrderParser.DIGIT, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_day);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case DIGIT_NO_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(90);
					match(T__6);
					}
				}

				setState(93);
				match(DIGIT_NO_ZERO);
				}
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				match(DIGIT);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(96);
				match(T__7);
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__6) ) {
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
		public List<TerminalNode> UPPERCHAR() { return getTokens(DiscountOrderParser.UPPERCHAR); }
		public TerminalNode UPPERCHAR(int i) {
			return getToken(DiscountOrderParser.UPPERCHAR, i);
		}
		public List<TerminalNode> LOWERCHAR() { return getTokens(DiscountOrderParser.LOWERCHAR); }
		public TerminalNode LOWERCHAR(int i) {
			return getToken(DiscountOrderParser.LOWERCHAR, i);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
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
				setState(103); 
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

	public static class DigitsContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(DiscountOrderParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiscountOrderParser.DIGIT, i);
		}
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiscountOrderListener ) ((DiscountOrderListener)listener).exitDigits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiscountOrderVisitor ) return ((DiscountOrderVisitor<? extends T>)visitor).visitDigits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_digits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(DIGIT);
			setState(106);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\66\n\3"+
		"\3\4\3\4\3\5\6\5;\n\5\r\5\16\5<\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\5\rV\n\r"+
		"\3\r\3\r\3\r\5\r[\n\r\3\16\5\16^\n\16\3\16\3\16\3\16\3\16\3\16\5\16e\n"+
		"\16\3\17\6\17h\n\17\r\17\16\17i\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36\2\b\3\2\17\20\3\2\5\6\3\2\3\4\3\2\7\b\3\2"+
		"\7\t\4\2\7\7\t\t\2g\2 \3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2\b:\3\2\2\2\n"+
		">\3\2\2\2\f@\3\2\2\2\16B\3\2\2\2\20E\3\2\2\2\22G\3\2\2\2\24I\3\2\2\2\26"+
		"O\3\2\2\2\30Z\3\2\2\2\32d\3\2\2\2\34g\3\2\2\2\36k\3\2\2\2 !\5\4\3\2!\""+
		"\7\2\2\3\"\3\3\2\2\2#$\5\6\4\2$%\5\b\5\2%&\5\n\6\2&\'\7\3\2\2\'(\5\16"+
		"\b\2()\5\20\t\2)*\5\22\n\2*+\5\34\17\2+\66\3\2\2\2,-\5\6\4\2-.\5\b\5\2"+
		"./\5\n\6\2/\60\7\4\2\2\60\61\5\16\b\2\61\62\5\20\t\2\62\63\5\24\13\2\63"+
		"\64\5\34\17\2\64\66\3\2\2\2\65#\3\2\2\2\65,\3\2\2\2\66\5\3\2\2\2\678\7"+
		"\r\2\28\7\3\2\2\29;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\t"+
		"\3\2\2\2>?\t\3\2\2?\13\3\2\2\2@A\t\4\2\2A\r\3\2\2\2BC\7\r\2\2CD\7\13\2"+
		"\2D\17\3\2\2\2EF\7\r\2\2F\21\3\2\2\2GH\7\r\2\2H\23\3\2\2\2IJ\5\32\16\2"+
		"JK\7\16\2\2KL\5\30\r\2LM\7\16\2\2MN\5\26\f\2N\25\3\2\2\2OP\t\5\2\2PQ\7"+
		"\r\2\2QR\7\r\2\2RS\7\r\2\2S\27\3\2\2\2TV\7\t\2\2UT\3\2\2\2UV\3\2\2\2V"+
		"W\3\2\2\2W[\7\f\2\2XY\7\7\2\2Y[\t\6\2\2ZU\3\2\2\2ZX\3\2\2\2[\31\3\2\2"+
		"\2\\^\7\t\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_e\7\f\2\2`a\t\5\2\2ae\7\r"+
		"\2\2bc\7\n\2\2ce\t\7\2\2d]\3\2\2\2d`\3\2\2\2db\3\2\2\2e\33\3\2\2\2fh\t"+
		"\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\35\3\2\2\2kl\7\r\2\2l"+
		"m\7\r\2\2m\37\3\2\2\2\t\65<UZ]di";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}