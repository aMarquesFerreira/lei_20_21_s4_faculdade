// Generated from C:/Users/torre/OneDrive/Documentos/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Verifications.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VerificationsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, DIGIT=16, LOWERCHAR=17, 
		UPPERCHAR=18, WS=19, IF=20, ELSE=21, SPACE=22;
	public static final int
		RULE_program = 0, RULE_state = 1, RULE_formID = 2, RULE_names = 3, RULE_name = 4, 
		RULE_typeOfData = 5, RULE_description = 6, RULE_letters = 7, RULE_ignore = 8, 
		RULE_number = 9, RULE_ok = 10, RULE_notok = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "state", "formID", "names", "name", "typeOfData", "description", 
			"letters", "ignore", "number", "ok", "notok"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'F'", "'boolean'", "'BOOLEAN'", "'Boolean'", "'String'", "'string'", 
			"'STRING'", "'INTEGER'", "'INT'", "'Int'", "'int'", "'integer'", "'Integer'", 
			"'OK'", "'NotOk'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "DIGIT", "LOWERCHAR", "UPPERCHAR", "WS", "IF", 
			"ELSE", "SPACE"
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
	public String getGrammarFileName() { return "Verifications.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VerificationsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VerificationsParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			state();
			setState(25);
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
		public FormIDContext formID() {
			return getRuleContext(FormIDContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeOfDataContext typeOfData() {
			return getRuleContext(TypeOfDataContext.class,0);
		}
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				formID();
				setState(28);
				name();
				setState(29);
				typeOfData();
				setState(30);
				names();
				setState(31);
				description();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				formID();
				setState(34);
				name();
				setState(35);
				typeOfData();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				formID();
				setState(38);
				name();
				setState(39);
				names();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				formID();
				setState(42);
				description();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				formID();
				setState(45);
				typeOfData();
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

	public static class FormIDContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(VerificationsParser.DIGIT, 0); }
		public FormIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterFormID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitFormID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitFormID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormIDContext formID() throws RecognitionException {
		FormIDContext _localctx = new FormIDContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
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

	public static class NamesContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		NamesContext _localctx = new NamesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			name();
			setState(53);
			name();
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
		public LettersContext letters() {
			return getRuleContext(LettersContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			letters();
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

	public static class TypeOfDataContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VerificationsParser.IF, 0); }
		public OkContext ok() {
			return getRuleContext(OkContext.class,0);
		}
		public NotokContext notok() {
			return getRuleContext(NotokContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(VerificationsParser.ELSE, 0); }
		public TypeOfDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOfData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterTypeOfData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitTypeOfData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitTypeOfData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOfDataContext typeOfData() throws RecognitionException {
		TypeOfDataContext _localctx = new TypeOfDataContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeOfData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(IF);
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
			ok();
			{
			setState(60);
			match(ELSE);
			}
			setState(61);
			notok();
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

	public static class DescriptionContext extends ParserRuleContext {
		public List<TerminalNode> UPPERCHAR() { return getTokens(VerificationsParser.UPPERCHAR); }
		public TerminalNode UPPERCHAR(int i) {
			return getToken(VerificationsParser.UPPERCHAR, i);
		}
		public List<TerminalNode> LOWERCHAR() { return getTokens(VerificationsParser.LOWERCHAR); }
		public TerminalNode LOWERCHAR(int i) {
			return getToken(VerificationsParser.LOWERCHAR, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOWERCHAR || _la==UPPERCHAR) {
				{
				{
				setState(63);
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
				setState(68);
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

	public static class LettersContext extends ParserRuleContext {
		public List<TerminalNode> LOWERCHAR() { return getTokens(VerificationsParser.LOWERCHAR); }
		public TerminalNode LOWERCHAR(int i) {
			return getToken(VerificationsParser.LOWERCHAR, i);
		}
		public List<TerminalNode> UPPERCHAR() { return getTokens(VerificationsParser.UPPERCHAR); }
		public TerminalNode UPPERCHAR(int i) {
			return getToken(VerificationsParser.UPPERCHAR, i);
		}
		public LettersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterLetters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitLetters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitLetters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LettersContext letters() throws RecognitionException {
		LettersContext _localctx = new LettersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_letters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(69);
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
				setState(72); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class IgnoreContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(VerificationsParser.SPACE, 0); }
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitIgnore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitIgnore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ignore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				{
				}
				break;
			case SPACE:
				{
				setState(75);
				match(SPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(VerificationsParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(VerificationsParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				match(DIGIT);
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class OkContext extends ParserRuleContext {
		public OkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterOk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitOk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitOk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OkContext ok() throws RecognitionException {
		OkContext _localctx = new OkContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__13);
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

	public static class NotokContext extends ParserRuleContext {
		public NotokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).enterNotok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerificationsListener ) ((VerificationsListener)listener).exitNotok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerificationsVisitor ) return ((VerificationsVisitor<? extends T>)visitor).visitNotok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotokContext notok() throws RecognitionException {
		NotokContext _localctx = new NotokContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_notok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__14);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\bC\n\b\f\b\16\bF\13\b\3\t\6\t"+
		"I\n\t\r\t\16\tJ\3\n\3\n\5\nO\n\n\3\13\6\13R\n\13\r\13\16\13S\3\f\3\f\3"+
		"\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\4\17\3\2\23\24"+
		"\2U\2\32\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b\66\3\2\2\2\n9\3\2\2\2\f;"+
		"\3\2\2\2\16D\3\2\2\2\20H\3\2\2\2\22N\3\2\2\2\24Q\3\2\2\2\26U\3\2\2\2\30"+
		"W\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35\36\5\6\4\2\36\37"+
		"\5\n\6\2\37 \5\f\7\2 !\5\b\5\2!\"\5\16\b\2\"\62\3\2\2\2#$\5\6\4\2$%\5"+
		"\n\6\2%&\5\f\7\2&\62\3\2\2\2\'(\5\6\4\2()\5\n\6\2)*\5\b\5\2*\62\3\2\2"+
		"\2+,\5\6\4\2,-\5\16\b\2-\62\3\2\2\2./\5\6\4\2/\60\5\f\7\2\60\62\3\2\2"+
		"\2\61\35\3\2\2\2\61#\3\2\2\2\61\'\3\2\2\2\61+\3\2\2\2\61.\3\2\2\2\62\5"+
		"\3\2\2\2\63\64\7\3\2\2\64\65\7\22\2\2\65\7\3\2\2\2\66\67\5\n\6\2\678\5"+
		"\n\6\28\t\3\2\2\29:\5\20\t\2:\13\3\2\2\2;<\7\26\2\2<=\t\2\2\2=>\5\26\f"+
		"\2>?\7\27\2\2?@\5\30\r\2@\r\3\2\2\2AC\t\3\2\2BA\3\2\2\2CF\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2E\17\3\2\2\2FD\3\2\2\2GI\t\3\2\2HG\3\2\2\2IJ\3\2\2\2J"+
		"H\3\2\2\2JK\3\2\2\2K\21\3\2\2\2LO\3\2\2\2MO\7\30\2\2NL\3\2\2\2NM\3\2\2"+
		"\2O\23\3\2\2\2PR\7\22\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\25"+
		"\3\2\2\2UV\7\20\2\2V\27\3\2\2\2WX\7\21\2\2X\31\3\2\2\2\7\61DJNS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}