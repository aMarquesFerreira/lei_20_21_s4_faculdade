// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\EmailInfoCheck.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EmailInfoCheckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SPECIALCHARACTERS=7, DIGIT=8, 
		LOWERCHAR=9, UPPERCHAR=10, WS=11;
	public static final int
		RULE_state = 0, RULE_email = 1, RULE_typeOfEmail = 2, RULE_domain = 3, 
		RULE_username = 4, RULE_atSign = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"state", "email", "typeOfEmail", "domain", "username", "atSign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hotmail'", "'gmail'", "'isep.ipp'", "'.pt'", "'.com'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "SPECIALCHARACTERS", "DIGIT", 
			"LOWERCHAR", "UPPERCHAR", "WS"
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
	public String getGrammarFileName() { return "EmailInfoCheck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EmailInfoCheckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StateContext extends ParserRuleContext {
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmailInfoCheckVisitor ) return ((EmailInfoCheckVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			email();
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

	public static class EmailContext extends ParserRuleContext {
		public UsernameContext username() {
			return getRuleContext(UsernameContext.class,0);
		}
		public AtSignContext atSign() {
			return getRuleContext(AtSignContext.class,0);
		}
		public TypeOfEmailContext typeOfEmail() {
			return getRuleContext(TypeOfEmailContext.class,0);
		}
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).enterEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).exitEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmailInfoCheckVisitor ) return ((EmailInfoCheckVisitor<? extends T>)visitor).visitEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			username();
			setState(15);
			atSign();
			setState(16);
			typeOfEmail();
			setState(17);
			domain();
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

	public static class TypeOfEmailContext extends ParserRuleContext {
		public TypeOfEmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOfEmail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).enterTypeOfEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).exitTypeOfEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmailInfoCheckVisitor ) return ((EmailInfoCheckVisitor<? extends T>)visitor).visitTypeOfEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOfEmailContext typeOfEmail() throws RecognitionException {
		TypeOfEmailContext _localctx = new TypeOfEmailContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeOfEmail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
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

	public static class DomainContext extends ParserRuleContext {
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).enterDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).exitDomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmailInfoCheckVisitor ) return ((EmailInfoCheckVisitor<? extends T>)visitor).visitDomain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_domain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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

	public static class UsernameContext extends ParserRuleContext {
		public List<TerminalNode> LOWERCHAR() { return getTokens(EmailInfoCheckParser.LOWERCHAR); }
		public TerminalNode LOWERCHAR(int i) {
			return getToken(EmailInfoCheckParser.LOWERCHAR, i);
		}
		public List<TerminalNode> UPPERCHAR() { return getTokens(EmailInfoCheckParser.UPPERCHAR); }
		public TerminalNode UPPERCHAR(int i) {
			return getToken(EmailInfoCheckParser.UPPERCHAR, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(EmailInfoCheckParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(EmailInfoCheckParser.DIGIT, i);
		}
		public List<TerminalNode> SPECIALCHARACTERS() { return getTokens(EmailInfoCheckParser.SPECIALCHARACTERS); }
		public TerminalNode SPECIALCHARACTERS(int i) {
			return getToken(EmailInfoCheckParser.SPECIALCHARACTERS, i);
		}
		public UsernameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_username; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).enterUsername(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).exitUsername(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmailInfoCheckVisitor ) return ((EmailInfoCheckVisitor<? extends T>)visitor).visitUsername(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsernameContext username() throws RecognitionException {
		UsernameContext _localctx = new UsernameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_username);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIALCHARACTERS) | (1L << DIGIT) | (1L << LOWERCHAR) | (1L << UPPERCHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIALCHARACTERS) | (1L << DIGIT) | (1L << LOWERCHAR) | (1L << UPPERCHAR))) != 0) );
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

	public static class AtSignContext extends ParserRuleContext {
		public AtSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).enterAtSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmailInfoCheckListener ) ((EmailInfoCheckListener)listener).exitAtSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmailInfoCheckVisitor ) return ((EmailInfoCheckVisitor<? extends T>)visitor).visitAtSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtSignContext atSign() throws RecognitionException {
		AtSignContext _localctx = new AtSignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atSign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r!\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\6\6\33\n\6\r\6\16\6\34\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\5"+
		"\3\2\3\5\3\2\6\7\3\2\t\f\2\33\2\16\3\2\2\2\4\20\3\2\2\2\6\25\3\2\2\2\b"+
		"\27\3\2\2\2\n\32\3\2\2\2\f\36\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\21"+
		"\5\n\6\2\21\22\5\f\7\2\22\23\5\6\4\2\23\24\5\b\5\2\24\5\3\2\2\2\25\26"+
		"\t\2\2\2\26\7\3\2\2\2\27\30\t\3\2\2\30\t\3\2\2\2\31\33\t\4\2\2\32\31\3"+
		"\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\13\3\2\2\2\36\37\7"+
		"\b\2\2\37\r\3\2\2\2\3\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}