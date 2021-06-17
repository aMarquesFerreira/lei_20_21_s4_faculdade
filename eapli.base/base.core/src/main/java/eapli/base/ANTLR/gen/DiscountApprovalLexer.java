// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\DiscountApproval.g4 by ANTLR 4.9.1
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
public class DiscountApprovalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PERCENT=7, DIGIT_NO_ZERO=8, 
		DIGIT=9, DOT=10, LOWERCHAR=11, UPPERCHAR=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "PERCENT", "DIGIT_NO_ZERO", 
			"DIGIT", "DOT", "LOWERCHAR", "UPPERCHAR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'percentage'", "'valor'", "'1'", "'2'", "'0'", "'3'", "'%'", null, 
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PERCENT", "DIGIT_NO_ZERO", 
			"DIGIT", "DOT", "LOWERCHAR", "UPPERCHAR", "WS"
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


	public DiscountApprovalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DiscountApproval.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17L\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\6\n<\n\n\r\n\16\n=\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16G\n\16"+
		"\r\16\16\16H\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\3\2\7\3\2\63;\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17"+
		"\17\"\"\2M\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5(\3\2\2\2\7.\3\2\2\2"+
		"\t\60\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23"+
		";\3\2\2\2\25?\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33F\3\2\2\2\35\36\7r\2\2"+
		"\36\37\7g\2\2\37 \7t\2\2 !\7e\2\2!\"\7g\2\2\"#\7p\2\2#$\7v\2\2$%\7c\2"+
		"\2%&\7i\2\2&\'\7g\2\2\'\4\3\2\2\2()\7x\2\2)*\7c\2\2*+\7n\2\2+,\7q\2\2"+
		",-\7t\2\2-\6\3\2\2\2./\7\63\2\2/\b\3\2\2\2\60\61\7\64\2\2\61\n\3\2\2\2"+
		"\62\63\7\62\2\2\63\f\3\2\2\2\64\65\7\65\2\2\65\16\3\2\2\2\66\67\7\'\2"+
		"\2\67\20\3\2\2\289\t\2\2\29\22\3\2\2\2:<\t\3\2\2;:\3\2\2\2<=\3\2\2\2="+
		";\3\2\2\2=>\3\2\2\2>\24\3\2\2\2?@\7\60\2\2@\26\3\2\2\2AB\t\4\2\2B\30\3"+
		"\2\2\2CD\t\5\2\2D\32\3\2\2\2EG\t\6\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2H"+
		"I\3\2\2\2IJ\3\2\2\2JK\b\16\2\2K\34\3\2\2\2\5\2=H\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}