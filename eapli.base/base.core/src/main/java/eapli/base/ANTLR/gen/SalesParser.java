// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Sales.g4 by ANTLR 4.9.1
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
public class SalesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ACCEPTDECIMALS=8, 
		COMA=9, ZERO=10, PERCENT=11, DIGIT_NO_ZERO=12, DIGIT=13, DOT=14, LOWERCHAR=15, 
		UPPERCHAR=16, WS=17;
	public static final int
		RULE_program = 0, RULE_state = 1, RULE_productCode = 2, RULE_quantity = 3, 
		RULE_clientType = 4, RULE_letter = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "state", "productCode", "quantity", "clientType", "letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'1'", "'Nacional'", "'Europeu'", "'Resto do mundo'", "'nacional'", 
			"'europeu'", "'resto do mundo'", null, "','", "'0'", "'%'", null, null, 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ACCEPTDECIMALS", "COMA", 
			"ZERO", "PERCENT", "DIGIT_NO_ZERO", "DIGIT", "DOT", "LOWERCHAR", "UPPERCHAR", 
			"WS"
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
	public String getGrammarFileName() { return "Sales.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SalesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SalesParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SalesVisitor ) return ((SalesVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			state();
			setState(13);
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
		public ProductCodeContext productCode() {
			return getRuleContext(ProductCodeContext.class,0);
		}
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public ClientTypeContext clientType() {
			return getRuleContext(ClientTypeContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SalesVisitor ) return ((SalesVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			productCode();
			setState(16);
			quantity();
			setState(17);
			clientType();
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

	public static class ProductCodeContext extends ParserRuleContext {
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(SalesParser.DIGIT, 0); }
		public ProductCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterProductCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitProductCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SalesVisitor ) return ((SalesVisitor<? extends T>)visitor).visitProductCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductCodeContext productCode() throws RecognitionException {
		ProductCodeContext _localctx = new ProductCodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_productCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			letter();
			setState(20);
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

	public static class QuantityContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(SalesParser.COMA, 0); }
		public List<TerminalNode> ZERO() { return getTokens(SalesParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(SalesParser.ZERO, i);
		}
		public TerminalNode DIGIT_NO_ZERO() { return getToken(SalesParser.DIGIT_NO_ZERO, 0); }
		public TerminalNode DIGIT() { return getToken(SalesParser.DIGIT, 0); }
		public TerminalNode ACCEPTDECIMALS() { return getToken(SalesParser.ACCEPTDECIMALS, 0); }
		public QuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitQuantity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SalesVisitor ) return ((SalesVisitor<? extends T>)visitor).visitQuantity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantityContext quantity() throws RecognitionException {
		QuantityContext _localctx = new QuantityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_quantity);
		int _la;
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
			case DIGIT_NO_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ZERO) {
					{
					setState(22);
					match(ZERO);
					}
				}

				setState(25);
				match(DIGIT_NO_ZERO);
				}
				setState(27);
				match(COMA);
				setState(28);
				match(ZERO);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(29);
				match(T__0);
				setState(30);
				match(DIGIT);
				}
				}
				break;
			case ACCEPTDECIMALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(ACCEPTDECIMALS);
				setState(32);
				match(COMA);
				setState(33);
				match(DIGIT);
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

	public static class ClientTypeContext extends ParserRuleContext {
		public ClientTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clientType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterClientType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitClientType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SalesVisitor ) return ((SalesVisitor<? extends T>)visitor).visitClientType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClientTypeContext clientType() throws RecognitionException {
		ClientTypeContext _localctx = new ClientTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_clientType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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

	public static class LetterContext extends ParserRuleContext {
		public List<TerminalNode> UPPERCHAR() { return getTokens(SalesParser.UPPERCHAR); }
		public TerminalNode UPPERCHAR(int i) {
			return getToken(SalesParser.UPPERCHAR, i);
		}
		public List<TerminalNode> LOWERCHAR() { return getTokens(SalesParser.LOWERCHAR); }
		public TerminalNode LOWERCHAR(int i) {
			return getToken(SalesParser.LOWERCHAR, i);
		}
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SalesListener ) ((SalesListener)listener).exitLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SalesVisitor ) return ((SalesVisitor<? extends T>)visitor).visitLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
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
				setState(41); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23.\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\5\5\32\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5%\n\5\3\6\3"+
		"\6\3\7\6\7*\n\7\r\7\16\7+\3\7\2\2\b\2\4\6\b\n\f\2\4\3\2\4\t\3\2\21\22"+
		"\2+\2\16\3\2\2\2\4\21\3\2\2\2\6\25\3\2\2\2\b$\3\2\2\2\n&\3\2\2\2\f)\3"+
		"\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\5\6\4\2\22\23\5"+
		"\b\5\2\23\24\5\n\6\2\24\5\3\2\2\2\25\26\5\f\7\2\26\27\7\17\2\2\27\7\3"+
		"\2\2\2\30\32\7\f\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\7"+
		"\16\2\2\34\35\3\2\2\2\35\36\7\13\2\2\36%\7\f\2\2\37 \7\3\2\2 %\7\17\2"+
		"\2!\"\7\n\2\2\"#\7\13\2\2#%\7\17\2\2$\31\3\2\2\2$\37\3\2\2\2$!\3\2\2\2"+
		"%\t\3\2\2\2&\'\t\2\2\2\'\13\3\2\2\2(*\t\3\2\2)(\3\2\2\2*+\3\2\2\2+)\3"+
		"\2\2\2+,\3\2\2\2,\r\3\2\2\2\5\31$+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}