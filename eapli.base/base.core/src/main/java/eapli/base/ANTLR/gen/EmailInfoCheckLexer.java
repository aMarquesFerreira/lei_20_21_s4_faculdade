// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\EmailInfoCheck.g4 by ANTLR 4.9.1
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
public class EmailInfoCheckLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SPECIALCHARACTERS=7, DIGIT=8, 
		LOWERCHAR=9, UPPERCHAR=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "SPECIALCHARACTERS", 
			"DIGIT", "LOWERCHAR", "UPPERCHAR", "WS"
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


	public EmailInfoCheckLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EmailInfoCheck.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rM\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\6\t?\n\t\r\t\16\t@\3\n\3\n\3\13\3\13\3\f\6\fH\n\f"+
		"\r\f\16\fI\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\3\2\7\4\2//aa\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17\17\"\"\2N\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2"+
		"\2\2\5!\3\2\2\2\7\'\3\2\2\2\t\60\3\2\2\2\13\64\3\2\2\2\r9\3\2\2\2\17;"+
		"\3\2\2\2\21>\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27G\3\2\2\2\31\32\7j\2\2"+
		"\32\33\7q\2\2\33\34\7v\2\2\34\35\7o\2\2\35\36\7c\2\2\36\37\7k\2\2\37 "+
		"\7n\2\2 \4\3\2\2\2!\"\7i\2\2\"#\7o\2\2#$\7c\2\2$%\7k\2\2%&\7n\2\2&\6\3"+
		"\2\2\2\'(\7k\2\2()\7u\2\2)*\7g\2\2*+\7r\2\2+,\7\60\2\2,-\7k\2\2-.\7r\2"+
		"\2./\7r\2\2/\b\3\2\2\2\60\61\7\60\2\2\61\62\7r\2\2\62\63\7v\2\2\63\n\3"+
		"\2\2\2\64\65\7\60\2\2\65\66\7e\2\2\66\67\7q\2\2\678\7o\2\28\f\3\2\2\2"+
		"9:\7B\2\2:\16\3\2\2\2;<\t\2\2\2<\20\3\2\2\2=?\t\3\2\2>=\3\2\2\2?@\3\2"+
		"\2\2@>\3\2\2\2@A\3\2\2\2A\22\3\2\2\2BC\t\4\2\2C\24\3\2\2\2DE\t\5\2\2E"+
		"\26\3\2\2\2FH\t\6\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2"+
		"\2KL\b\f\2\2L\30\3\2\2\2\5\2@I\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}