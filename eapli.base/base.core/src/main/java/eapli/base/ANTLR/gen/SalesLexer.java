// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Sales.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SalesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ACCEPTDECIMALS=8, 
		COMA=9, ZERO=10, PERCENT=11, DIGIT_NO_ZERO=12, DIGIT=13, DOT=14, LOWERCHAR=15, 
		UPPERCHAR=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ACCEPTDECIMALS", 
			"COMA", "ZERO", "PERCENT", "DIGIT_NO_ZERO", "DIGIT", "DOT", "LOWERCHAR", 
			"UPPERCHAR", "WS"
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


	public SalesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sales.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16t\n\16\r\16\16\16u\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\6\22\177\n\22\r\22\16\22\u0080\3\22\3\22"+
		"\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23\3\2\7\3\2\63;\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17\17"+
		"\"\"\2\u0085\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7\60\3\2\2\2\t8\3\2\2\2\13G\3\2"+
		"\2\2\rP\3\2\2\2\17X\3\2\2\2\21g\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27n\3"+
		"\2\2\2\31p\3\2\2\2\33s\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2!{\3\2\2\2#~\3\2"+
		"\2\2%&\7\63\2\2&\4\3\2\2\2\'(\7P\2\2()\7c\2\2)*\7e\2\2*+\7k\2\2+,\7q\2"+
		"\2,-\7p\2\2-.\7c\2\2./\7n\2\2/\6\3\2\2\2\60\61\7G\2\2\61\62\7w\2\2\62"+
		"\63\7t\2\2\63\64\7q\2\2\64\65\7r\2\2\65\66\7g\2\2\66\67\7w\2\2\67\b\3"+
		"\2\2\289\7T\2\29:\7g\2\2:;\7u\2\2;<\7v\2\2<=\7q\2\2=>\7\"\2\2>?\7f\2\2"+
		"?@\7q\2\2@A\7\"\2\2AB\7o\2\2BC\7w\2\2CD\7p\2\2DE\7f\2\2EF\7q\2\2F\n\3"+
		"\2\2\2GH\7p\2\2HI\7c\2\2IJ\7e\2\2JK\7k\2\2KL\7q\2\2LM\7p\2\2MN\7c\2\2"+
		"NO\7n\2\2O\f\3\2\2\2PQ\7g\2\2QR\7w\2\2RS\7t\2\2ST\7q\2\2TU\7r\2\2UV\7"+
		"g\2\2VW\7w\2\2W\16\3\2\2\2XY\7t\2\2YZ\7g\2\2Z[\7u\2\2[\\\7v\2\2\\]\7q"+
		"\2\2]^\7\"\2\2^_\7f\2\2_`\7q\2\2`a\7\"\2\2ab\7o\2\2bc\7w\2\2cd\7p\2\2"+
		"de\7f\2\2ef\7q\2\2f\20\3\2\2\2gh\7\64\2\2hi\4\62\63\2i\22\3\2\2\2jk\7"+
		".\2\2k\24\3\2\2\2lm\7\62\2\2m\26\3\2\2\2no\7\'\2\2o\30\3\2\2\2pq\t\2\2"+
		"\2q\32\3\2\2\2rt\t\3\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\34\3"+
		"\2\2\2wx\7\60\2\2x\36\3\2\2\2yz\t\4\2\2z \3\2\2\2{|\t\5\2\2|\"\3\2\2\2"+
		"}\177\t\6\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\22\2\2\u0083$\3\2\2\2\5\2u\u0080"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}