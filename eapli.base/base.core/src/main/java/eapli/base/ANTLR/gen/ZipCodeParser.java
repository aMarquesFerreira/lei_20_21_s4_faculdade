// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\ZipCode.g4 by ANTLR 4.9.1
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
public class ZipCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPECIALCHARACTER=1, DIGIT=2, WS=3;
	public static final int
		RULE_state = 0, RULE_zip = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"state", "zip"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPECIALCHARACTER", "DIGIT", "WS"
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
	public String getGrammarFileName() { return "ZipCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ZipCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StateContext extends ParserRuleContext {
		public ZipContext zip() {
			return getRuleContext(ZipContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZipCodeListener ) ((ZipCodeListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZipCodeListener ) ((ZipCodeListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZipCodeVisitor ) return ((ZipCodeVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			zip();
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

	public static class ZipContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ZipCodeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ZipCodeParser.DIGIT, i);
		}
		public TerminalNode SPECIALCHARACTER() { return getToken(ZipCodeParser.SPECIALCHARACTER, 0); }
		public TerminalNode EOF() { return getToken(ZipCodeParser.EOF, 0); }
		public ZipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZipCodeListener ) ((ZipCodeListener)listener).enterZip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZipCodeListener ) ((ZipCodeListener)listener).exitZip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ZipCodeVisitor ) return ((ZipCodeVisitor<? extends T>)visitor).visitZip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZipContext zip() throws RecognitionException {
		ZipContext _localctx = new ZipContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_zip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(DIGIT);
			setState(7);
			match(DIGIT);
			setState(8);
			match(DIGIT);
			setState(9);
			match(DIGIT);
			setState(10);
			match(SPECIALCHARACTER);
			setState(11);
			match(DIGIT);
			setState(12);
			match(DIGIT);
			setState(13);
			match(DIGIT);
			setState(14);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\23\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2"+
		"\2\20\2\6\3\2\2\2\4\b\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\t\7\4\2\2\t\n"+
		"\7\4\2\2\n\13\7\4\2\2\13\f\7\4\2\2\f\r\7\3\2\2\r\16\7\4\2\2\16\17\7\4"+
		"\2\2\17\20\7\4\2\2\20\21\7\2\2\3\21\5\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}