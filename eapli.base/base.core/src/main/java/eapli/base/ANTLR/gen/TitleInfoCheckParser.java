// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\TitleInfoCheck.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TitleInfoCheckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPECIALCHARACTERS=1, DIGIT=2, LOWERCHAR=3, UPPERCHAR=4, SPACE=5;
	public static final int
		RULE_state = 0, RULE_title = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"state", "title"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPECIALCHARACTERS", "DIGIT", "LOWERCHAR", "UPPERCHAR", "SPACE"
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
	public String getGrammarFileName() { return "TitleInfoCheck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TitleInfoCheckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StateContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitleInfoCheckListener ) ((TitleInfoCheckListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitleInfoCheckListener ) ((TitleInfoCheckListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitleInfoCheckVisitor ) return ((TitleInfoCheckVisitor<? extends T>)visitor).visitState(this);
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
			title();
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

	public static class TitleContext extends ParserRuleContext {
		public List<TerminalNode> UPPERCHAR() { return getTokens(TitleInfoCheckParser.UPPERCHAR); }
		public TerminalNode UPPERCHAR(int i) {
			return getToken(TitleInfoCheckParser.UPPERCHAR, i);
		}
		public List<TerminalNode> LOWERCHAR() { return getTokens(TitleInfoCheckParser.LOWERCHAR); }
		public TerminalNode LOWERCHAR(int i) {
			return getToken(TitleInfoCheckParser.LOWERCHAR, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(TitleInfoCheckParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TitleInfoCheckParser.DIGIT, i);
		}
		public List<TerminalNode> SPECIALCHARACTERS() { return getTokens(TitleInfoCheckParser.SPECIALCHARACTERS); }
		public TerminalNode SPECIALCHARACTERS(int i) {
			return getToken(TitleInfoCheckParser.SPECIALCHARACTERS, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(TitleInfoCheckParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(TitleInfoCheckParser.SPACE, i);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TitleInfoCheckListener ) ((TitleInfoCheckListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TitleInfoCheckListener ) ((TitleInfoCheckListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TitleInfoCheckVisitor ) return ((TitleInfoCheckVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIALCHARACTERS) | (1L << DIGIT) | (1L << LOWERCHAR) | (1L << UPPERCHAR) | (1L << SPACE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIALCHARACTERS) | (1L << DIGIT) | (1L << LOWERCHAR) | (1L << UPPERCHAR) | (1L << SPACE))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\16\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\6\3\n\n\3\r\3\16\3\13\3\3\2\2\4\2\4\2\3\3\2\3\7\2\f\2"+
		"\6\3\2\2\2\4\t\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\n\t\2\2\2\t\b\3\2\2\2"+
		"\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\5\3\2\2\2\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}