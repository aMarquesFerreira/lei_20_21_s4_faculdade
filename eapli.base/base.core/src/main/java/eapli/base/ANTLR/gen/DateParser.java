// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Date.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, JUSTIFIED=5, ZERO=6, ONE=7, TWO=8, THREE=9, 
		DIGIT=10, DIGIT_NO_ZERO=11, DOT=12, SPACE=13, EQUALS=14, SPECIALCHARACTERS=15, 
		LOWERCHAR=16, UPPERCHAR=17;
	public static final int
		RULE_program = 0, RULE_state = 1, RULE_compare = 2, RULE_date = 3, RULE_year = 4, 
		RULE_month = 5, RULE_day = 6, RULE_faultType = 7, RULE_content = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "state", "compare", "date", "year", "month", "day", "faultType", 
			"content"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Ferias'", "'Nao Justificada'", "'ferias'", "'nao justificada'", 
			null, "'0'", "'1'", "'2'", "'3'", null, null, "'.'", "' '", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "JUSTIFIED", "ZERO", "ONE", "TWO", "THREE", 
			"DIGIT", "DIGIT_NO_ZERO", "DOT", "SPACE", "EQUALS", "SPECIALCHARACTERS", 
			"LOWERCHAR", "UPPERCHAR"
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
	public String getGrammarFileName() { return "Date.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DateParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			state();
			setState(19);
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
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public FaultTypeContext faultType() {
			return getRuleContext(FaultTypeContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			compare();
			setState(22);
			faultType();
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

	public static class CompareContext extends ParserRuleContext {
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	 
		public CompareContext() { }
		public void copyFrom(CompareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonContext extends CompareContext {
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public TerminalNode SPACE() { return getToken(DateParser.SPACE, 0); }
		public ComparisonContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compare);
		try {
			_localctx = new ComparisonContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			date();
			setState(25);
			match(SPACE);
			setState(26);
			date();
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

	public static class DateContext extends ParserRuleContext {
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(DateParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DateParser.DOT, i);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(28);
			day();
			setState(29);
			match(DOT);
			setState(30);
			month();
			setState(31);
			match(DOT);
			setState(32);
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
		public List<TerminalNode> DIGIT() { return getTokens(DateParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DateParser.DIGIT, i);
		}
		public TerminalNode ONE() { return getToken(DateParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(DateParser.TWO, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_year);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==ONE || _la==TWO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(35);
			match(DIGIT);
			setState(36);
			match(DIGIT);
			setState(37);
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
		public TerminalNode DIGIT_NO_ZERO() { return getToken(DateParser.DIGIT_NO_ZERO, 0); }
		public TerminalNode ZERO() { return getToken(DateParser.ZERO, 0); }
		public List<TerminalNode> ONE() { return getTokens(DateParser.ONE); }
		public TerminalNode ONE(int i) {
			return getToken(DateParser.ONE, i);
		}
		public TerminalNode TWO() { return getToken(DateParser.TWO, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_month);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
			case DIGIT_NO_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ZERO) {
					{
					setState(39);
					match(ZERO);
					}
				}

				setState(42);
				match(DIGIT_NO_ZERO);
				}
				}
				break;
			case ONE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(43);
				match(ONE);
				setState(44);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO))) != 0)) ) {
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
		public TerminalNode DIGIT_NO_ZERO() { return getToken(DateParser.DIGIT_NO_ZERO, 0); }
		public TerminalNode ZERO() { return getToken(DateParser.ZERO, 0); }
		public TerminalNode DIGIT() { return getToken(DateParser.DIGIT, 0); }
		public TerminalNode ONE() { return getToken(DateParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(DateParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(DateParser.THREE, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_day);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
			case DIGIT_NO_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ZERO) {
					{
					setState(47);
					match(ZERO);
					}
				}

				setState(50);
				match(DIGIT_NO_ZERO);
				}
				}
				break;
			case ONE:
			case TWO:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(51);
				_la = _input.LA(1);
				if ( !(_la==ONE || _la==TWO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(52);
				match(DIGIT);
				}
				}
				break;
			case THREE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(53);
				match(THREE);
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==ZERO || _la==ONE) ) {
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

	public static class FaultTypeContext extends ParserRuleContext {
		public FaultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterFaultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitFaultType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitFaultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaultTypeContext faultType() throws RecognitionException {
		FaultTypeContext _localctx = new FaultTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_faultType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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

	public static class ContentContext extends ParserRuleContext {
		public List<TerminalNode> UPPERCHAR() { return getTokens(DateParser.UPPERCHAR); }
		public TerminalNode UPPERCHAR(int i) {
			return getToken(DateParser.UPPERCHAR, i);
		}
		public List<TerminalNode> LOWERCHAR() { return getTokens(DateParser.LOWERCHAR); }
		public TerminalNode LOWERCHAR(int i) {
			return getToken(DateParser.LOWERCHAR, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(DateParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DateParser.DIGIT, i);
		}
		public List<TerminalNode> SPECIALCHARACTERS() { return getTokens(DateParser.SPECIALCHARACTERS); }
		public TerminalNode SPECIALCHARACTERS(int i) {
			return getToken(DateParser.SPECIALCHARACTERS, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(DateParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(DateParser.SPACE, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << SPACE) | (1L << SPECIALCHARACTERS) | (1L << LOWERCHAR) | (1L << UPPERCHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << SPACE) | (1L << SPECIALCHARACTERS) | (1L << LOWERCHAR) | (1L << UPPERCHAR))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\5\7+\n\7\3\7\3\7\3\7\5\7\60\n\7\3\b\5\b\63\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b:\n\b\3\t\3\t\3\n\6\n?\n\n\r\n\16\n@\3\n\2\2\13\2\4\6\b\n\f\16"+
		"\20\22\2\7\3\2\t\n\3\2\b\n\3\2\b\t\3\2\3\6\5\2\f\f\17\17\21\23\2?\2\24"+
		"\3\2\2\2\4\27\3\2\2\2\6\32\3\2\2\2\b\36\3\2\2\2\n$\3\2\2\2\f/\3\2\2\2"+
		"\169\3\2\2\2\20;\3\2\2\2\22>\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26\3"+
		"\3\2\2\2\27\30\5\6\4\2\30\31\5\20\t\2\31\5\3\2\2\2\32\33\5\b\5\2\33\34"+
		"\7\17\2\2\34\35\5\b\5\2\35\7\3\2\2\2\36\37\5\16\b\2\37 \7\16\2\2 !\5\f"+
		"\7\2!\"\7\16\2\2\"#\5\n\6\2#\t\3\2\2\2$%\t\2\2\2%&\7\f\2\2&\'\7\f\2\2"+
		"\'(\7\f\2\2(\13\3\2\2\2)+\7\b\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,\60\7"+
		"\r\2\2-.\7\t\2\2.\60\t\3\2\2/*\3\2\2\2/-\3\2\2\2\60\r\3\2\2\2\61\63\7"+
		"\b\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64:\7\r\2\2\65\66\t\2"+
		"\2\2\66:\7\f\2\2\678\7\13\2\28:\t\4\2\29\62\3\2\2\29\65\3\2\2\29\67\3"+
		"\2\2\2:\17\3\2\2\2;<\t\5\2\2<\21\3\2\2\2=?\t\6\2\2>=\3\2\2\2?@\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2A\23\3\2\2\2\7*/\629@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}