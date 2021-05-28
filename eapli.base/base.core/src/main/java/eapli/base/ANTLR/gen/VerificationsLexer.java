// Generated from C:/Users/torre/OneDrive/Documentos/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Verifications.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VerificationsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DIGIT=14, LOWERCHAR=15, UPPERCHAR=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "DIGIT", "LOWERCHAR", "UPPERCHAR", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'F'", "'boolean'", "'BOOLEAN'", "'Boolean'", "'String'", "'string'", 
			"'STRING'", "'INTEGER'", "'INT'", "'int'", "'Int'", "'integer'", "'Integer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "DIGIT", "LOWERCHAR", "UPPERCHAR", "WS"
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


	public VerificationsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Verifications.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\6\17z\n\17\r\17\16\17{\3\20\3\20\3\21\3\21\3\22\6\22\u0083\n\22"+
		"\r\22\16\22\u0084\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\6\3\2\62;\3\2c|\3"+
		"\2C\\\5\2\13\f\17\17\"\"\2\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7/\3\2\2\2"+
		"\t\67\3\2\2\2\13?\3\2\2\2\rF\3\2\2\2\17M\3\2\2\2\21T\3\2\2\2\23\\\3\2"+
		"\2\2\25`\3\2\2\2\27d\3\2\2\2\31h\3\2\2\2\33p\3\2\2\2\35y\3\2\2\2\37}\3"+
		"\2\2\2!\177\3\2\2\2#\u0082\3\2\2\2%&\7H\2\2&\4\3\2\2\2\'(\7d\2\2()\7q"+
		"\2\2)*\7q\2\2*+\7n\2\2+,\7g\2\2,-\7c\2\2-.\7p\2\2.\6\3\2\2\2/\60\7D\2"+
		"\2\60\61\7Q\2\2\61\62\7Q\2\2\62\63\7N\2\2\63\64\7G\2\2\64\65\7C\2\2\65"+
		"\66\7P\2\2\66\b\3\2\2\2\678\7D\2\289\7q\2\29:\7q\2\2:;\7n\2\2;<\7g\2\2"+
		"<=\7c\2\2=>\7p\2\2>\n\3\2\2\2?@\7U\2\2@A\7v\2\2AB\7t\2\2BC\7k\2\2CD\7"+
		"p\2\2DE\7i\2\2E\f\3\2\2\2FG\7u\2\2GH\7v\2\2HI\7t\2\2IJ\7k\2\2JK\7p\2\2"+
		"KL\7i\2\2L\16\3\2\2\2MN\7U\2\2NO\7V\2\2OP\7T\2\2PQ\7K\2\2QR\7P\2\2RS\7"+
		"I\2\2S\20\3\2\2\2TU\7K\2\2UV\7P\2\2VW\7V\2\2WX\7G\2\2XY\7I\2\2YZ\7G\2"+
		"\2Z[\7T\2\2[\22\3\2\2\2\\]\7K\2\2]^\7P\2\2^_\7V\2\2_\24\3\2\2\2`a\7k\2"+
		"\2ab\7p\2\2bc\7v\2\2c\26\3\2\2\2de\7K\2\2ef\7p\2\2fg\7v\2\2g\30\3\2\2"+
		"\2hi\7k\2\2ij\7p\2\2jk\7v\2\2kl\7g\2\2lm\7i\2\2mn\7g\2\2no\7t\2\2o\32"+
		"\3\2\2\2pq\7K\2\2qr\7p\2\2rs\7v\2\2st\7g\2\2tu\7i\2\2uv\7g\2\2vw\7t\2"+
		"\2w\34\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\36\3"+
		"\2\2\2}~\t\3\2\2~ \3\2\2\2\177\u0080\t\4\2\2\u0080\"\3\2\2\2\u0081\u0083"+
		"\t\5\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\22\2\2\u0087$\3\2\2\2"+
		"\5\2{\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}