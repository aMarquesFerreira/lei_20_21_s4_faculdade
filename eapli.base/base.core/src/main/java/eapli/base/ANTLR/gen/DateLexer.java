// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Date.g4 by ANTLR 4.9.1
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
public class DateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, JUSTIFIED=5, ZERO=6, ONE=7, TWO=8, THREE=9, 
		DIGIT=10, DIGIT_NO_ZERO=11, DOT=12, SPACE=13, EQUALS=14, SPECIALCHARACTERS=15, 
		LOWERCHAR=16, UPPERCHAR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "JUSTIFIED", "ZERO", "ONE", "TWO", "THREE", 
			"DIGIT", "DIGIT_NO_ZERO", "DOT", "SPACE", "EQUALS", "SPECIALCHARACTERS", 
			"LOWERCHAR", "UPPERCHAR"
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


	public DateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Date.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6j\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\5\13v\n\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\2\2\23\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\6\3\2\63;\b\2##.\61<>@A]_aa\3\2c|\3\2C\\\2\u0086\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3"+
		"\2\2\2\5,\3\2\2\2\7<\3\2\2\2\tC\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17m\3\2"+
		"\2\2\21o\3\2\2\2\23q\3\2\2\2\25u\3\2\2\2\27w\3\2\2\2\31y\3\2\2\2\33{\3"+
		"\2\2\2\35}\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%&\7H\2"+
		"\2&\'\7g\2\2\'(\7t\2\2()\7k\2\2)*\7c\2\2*+\7u\2\2+\4\3\2\2\2,-\7P\2\2"+
		"-.\7c\2\2./\7q\2\2/\60\7\"\2\2\60\61\7L\2\2\61\62\7w\2\2\62\63\7u\2\2"+
		"\63\64\7v\2\2\64\65\7k\2\2\65\66\7h\2\2\66\67\7k\2\2\678\7e\2\289\7c\2"+
		"\29:\7f\2\2:;\7c\2\2;\6\3\2\2\2<=\7h\2\2=>\7g\2\2>?\7t\2\2?@\7k\2\2@A"+
		"\7c\2\2AB\7u\2\2B\b\3\2\2\2CD\7p\2\2DE\7c\2\2EF\7q\2\2FG\7\"\2\2GH\7l"+
		"\2\2HI\7w\2\2IJ\7u\2\2JK\7v\2\2KL\7k\2\2LM\7h\2\2MN\7k\2\2NO\7e\2\2OP"+
		"\7c\2\2PQ\7f\2\2QR\7c\2\2R\n\3\2\2\2ST\7l\2\2TU\7w\2\2UV\7u\2\2VW\7v\2"+
		"\2WX\7k\2\2XY\7h\2\2YZ\7k\2\2Z[\7e\2\2[\\\7c\2\2\\]\7f\2\2]j\7c\2\2^_"+
		"\7L\2\2_`\7w\2\2`a\7u\2\2ab\7v\2\2bc\7k\2\2cd\7h\2\2de\7k\2\2ef\7e\2\2"+
		"fg\7c\2\2gh\7f\2\2hj\7c\2\2iS\3\2\2\2i^\3\2\2\2j\f\3\2\2\2kl\7\62\2\2"+
		"l\16\3\2\2\2mn\7\63\2\2n\20\3\2\2\2op\7\64\2\2p\22\3\2\2\2qr\7\65\2\2"+
		"r\24\3\2\2\2sv\5\r\7\2tv\5\27\f\2us\3\2\2\2ut\3\2\2\2v\26\3\2\2\2wx\t"+
		"\2\2\2x\30\3\2\2\2yz\7\60\2\2z\32\3\2\2\2{|\7\"\2\2|\34\3\2\2\2}~\7?\2"+
		"\2~\36\3\2\2\2\177\u0080\t\3\2\2\u0080 \3\2\2\2\u0081\u0082\t\4\2\2\u0082"+
		"\"\3\2\2\2\u0083\u0084\t\5\2\2\u0084$\3\2\2\2\5\2iu\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}