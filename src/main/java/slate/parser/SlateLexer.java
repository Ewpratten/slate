// Generated from D:/Users/barts/eclipse-workspace/slate-dev/src/main/resources/commands\Slate.g4 by ANTLR 4.7.2
package slate.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, WORD=2, WHITESPACE=3, NEWLINE=4, SAY=5, SHOUT=6, PEEK=7, SEARCH=8, 
		CHECKDOORS=9, MOVE=10, PICKUP=11, HELP=12, IDENTIFIER=13, TEXT=14, EXIT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "DIGIT", 
			"NUMBER", "LOWERCASE", "UPPERCASE", "COMMANDINDICATOR", "WORD", "WHITESPACE", 
			"NEWLINE", "SAY", "SHOUT", "PEEK", "SEARCH", "CHECKDOORS", "MOVE", "PICKUP", 
			"HELP", "IDENTIFIER", "TEXT", "EXIT"
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
			null, "NUMBER", "WORD", "WHITESPACE", "NEWLINE", "SAY", "SHOUT", "PEEK", 
			"SEARCH", "CHECKDOORS", "MOVE", "PICKUP", "HELP", "IDENTIFIER", "TEXT", 
			"EXIT"
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


	public SlateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Slate.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0125\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u0095"+
		"\n\35\r\35\16\35\u0096\3\35\3\35\6\35\u009b\n\35\r\35\16\35\u009c\5\35"+
		"\u009f\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\6!\u00aa\n!\r!\16!\u00ab"+
		"\3\"\3\"\3#\5#\u00b1\n#\3#\3#\6#\u00b5\n#\r#\16#\u00b6\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\5(\u00da\n(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\5)\u00e8\n)\3)\3)\3)\5)\u00ed\n)\3)\3)\3)\5)\u00f2\n)\3)\3)\3)\5)\u00f7"+
		"\n)\5)\u00f9\n)\3*\3*\3*\3*\3*\3*\5*\u0101\n*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\5*\u010b\n*\3+\3+\3+\3+\3+\3+\3,\3,\5,\u0115\n,\3-\3-\3-\5-\u011a\n-"+
		"\6-\u011c\n-\r-\16-\u011d\3.\3.\3.\3.\3.\3.\2\2/\3\2\5\2\7\2\t\2\13\2"+
		"\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-"+
		"\2/\2\61\2\63\2\65\2\67\29\3;\2=\2?\2A\4C\5E\6G\7I\bK\tM\nO\13Q\fS\rU"+
		"\16W\17Y\20[\21\3\2!\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4"+
		"\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2"+
		"ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\4\2..\60\60\3\2c|\3\2C\\\4\2\13\13\"\""+
		"\2\u011a\29\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2"+
		"\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2"+
		"\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\tc"+
		"\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23m\3\2\2\2\25"+
		"o\3\2\2\2\27q\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2"+
		"!{\3\2\2\2#}\3\2\2\2%\177\3\2\2\2\'\u0081\3\2\2\2)\u0083\3\2\2\2+\u0085"+
		"\3\2\2\2-\u0087\3\2\2\2/\u0089\3\2\2\2\61\u008b\3\2\2\2\63\u008d\3\2\2"+
		"\2\65\u008f\3\2\2\2\67\u0091\3\2\2\29\u0094\3\2\2\2;\u00a0\3\2\2\2=\u00a2"+
		"\3\2\2\2?\u00a4\3\2\2\2A\u00a9\3\2\2\2C\u00ad\3\2\2\2E\u00b4\3\2\2\2G"+
		"\u00b8\3\2\2\2I\u00bd\3\2\2\2K\u00c4\3\2\2\2M\u00ca\3\2\2\2O\u00d2\3\2"+
		"\2\2Q\u00e1\3\2\2\2S\u00fa\3\2\2\2U\u010c\3\2\2\2W\u0114\3\2\2\2Y\u011b"+
		"\3\2\2\2[\u011f\3\2\2\2]^\t\2\2\2^\4\3\2\2\2_`\t\3\2\2`\6\3\2\2\2ab\t"+
		"\4\2\2b\b\3\2\2\2cd\t\5\2\2d\n\3\2\2\2ef\t\6\2\2f\f\3\2\2\2gh\t\7\2\2"+
		"h\16\3\2\2\2ij\t\b\2\2j\20\3\2\2\2kl\t\t\2\2l\22\3\2\2\2mn\t\n\2\2n\24"+
		"\3\2\2\2op\t\13\2\2p\26\3\2\2\2qr\t\f\2\2r\30\3\2\2\2st\t\r\2\2t\32\3"+
		"\2\2\2uv\t\16\2\2v\34\3\2\2\2wx\t\17\2\2x\36\3\2\2\2yz\t\20\2\2z \3\2"+
		"\2\2{|\t\21\2\2|\"\3\2\2\2}~\t\22\2\2~$\3\2\2\2\177\u0080\t\23\2\2\u0080"+
		"&\3\2\2\2\u0081\u0082\t\24\2\2\u0082(\3\2\2\2\u0083\u0084\t\25\2\2\u0084"+
		"*\3\2\2\2\u0085\u0086\t\26\2\2\u0086,\3\2\2\2\u0087\u0088\t\27\2\2\u0088"+
		".\3\2\2\2\u0089\u008a\t\30\2\2\u008a\60\3\2\2\2\u008b\u008c\t\31\2\2\u008c"+
		"\62\3\2\2\2\u008d\u008e\t\32\2\2\u008e\64\3\2\2\2\u008f\u0090\t\33\2\2"+
		"\u0090\66\3\2\2\2\u0091\u0092\t\34\2\2\u00928\3\2\2\2\u0093\u0095\5\67"+
		"\34\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u009e\3\2\2\2\u0098\u009a\t\35\2\2\u0099\u009b\5"+
		"\67\34\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f:\3\2\2\2\u00a0\u00a1\t\36\2\2\u00a1<\3\2\2\2\u00a2\u00a3\t"+
		"\37\2\2\u00a3>\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5@\3\2\2\2\u00a6\u00aa\5"+
		";\36\2\u00a7\u00aa\5=\37\2\u00a8\u00aa\7a\2\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00acB\3\2\2\2\u00ad\u00ae\t \2\2\u00aeD\3\2"+
		"\2\2\u00af\u00b1\7\17\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b5\7\f\2\2\u00b3\u00b5\7\17\2\2\u00b4\u00b0\3"+
		"\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7F\3\2\2\2\u00b8\u00b9\5? \2\u00b9\u00ba\5\'\24\2\u00ba"+
		"\u00bb\5\3\2\2\u00bb\u00bc\5\63\32\2\u00bcH\3\2\2\2\u00bd\u00be\5? \2"+
		"\u00be\u00bf\5\'\24\2\u00bf\u00c0\5\21\t\2\u00c0\u00c1\5\37\20\2\u00c1"+
		"\u00c2\5+\26\2\u00c2\u00c3\5)\25\2\u00c3J\3\2\2\2\u00c4\u00c5\5? \2\u00c5"+
		"\u00c6\5!\21\2\u00c6\u00c7\5\13\6\2\u00c7\u00c8\5\13\6\2\u00c8\u00c9\5"+
		"\27\f\2\u00c9L\3\2\2\2\u00ca\u00cb\5? \2\u00cb\u00cc\5\'\24\2\u00cc\u00cd"+
		"\5\13\6\2\u00cd\u00ce\5\3\2\2\u00ce\u00cf\5%\23\2\u00cf\u00d0\5\7\4\2"+
		"\u00d0\u00d1\5\21\t\2\u00d1N\3\2\2\2\u00d2\u00d3\5? \2\u00d3\u00d4\5\7"+
		"\4\2\u00d4\u00d5\5\21\t\2\u00d5\u00d6\5\13\6\2\u00d6\u00d7\5\7\4\2\u00d7"+
		"\u00d9\5\27\f\2\u00d8\u00da\5C\"\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5\t\5\2\u00dc\u00dd\5\37\20\2\u00dd"+
		"\u00de\5\37\20\2\u00de\u00df\5%\23\2\u00df\u00e0\5\'\24\2\u00e0P\3\2\2"+
		"\2\u00e1\u00f8\5? \2\u00e2\u00e3\5\33\16\2\u00e3\u00e4\5\37\20\2\u00e4"+
		"\u00e5\5-\27\2\u00e5\u00ec\5\13\6\2\u00e6\u00e8\5C\"\2\u00e7\u00e6\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\5)\25\2\u00ea"+
		"\u00eb\5\37\20\2\u00eb\u00ed\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00ed\3"+
		"\2\2\2\u00ed\u00f9\3\2\2\2\u00ee\u00ef\5\17\b\2\u00ef\u00f6\5\37\20\2"+
		"\u00f0\u00f2\5C\"\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f4\5)\25\2\u00f4\u00f5\5\37\20\2\u00f5\u00f7\3\2\2\2"+
		"\u00f6\u00f1\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00e2"+
		"\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f9R\3\2\2\2\u00fa\u010a\5? \2\u00fb\u00fc"+
		"\5!\21\2\u00fc\u00fd\5\23\n\2\u00fd\u00fe\5\7\4\2\u00fe\u0100\5\27\f\2"+
		"\u00ff\u0101\5C\"\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\5+\26\2\u0103\u0104\5!\21\2\u0104\u010b\3\2\2\2\u0105"+
		"\u0106\5)\25\2\u0106\u0107\5\3\2\2\u0107\u0108\5\27\f\2\u0108\u0109\5"+
		"\13\6\2\u0109\u010b\3\2\2\2\u010a\u00fb\3\2\2\2\u010a\u0105\3\2\2\2\u010b"+
		"T\3\2\2\2\u010c\u010d\5? \2\u010d\u010e\5\21\t\2\u010e\u010f\5\13\6\2"+
		"\u010f\u0110\5\31\r\2\u0110\u0111\5!\21\2\u0111V\3\2\2\2\u0112\u0115\5"+
		"A!\2\u0113\u0115\59\35\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"X\3\2\2\2\u0116\u0119\5W,\2\u0117\u011a\5C\"\2\u0118\u011a\7\2\2\3\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0116\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"Z\3\2\2\2\u011f\u0120\5? \2\u0120\u0121\5\13\6\2\u0121\u0122\5\61\31\2"+
		"\u0122\u0123\5\23\n\2\u0123\u0124\5)\25\2\u0124\\\3\2\2\2\26\2\u0096\u009c"+
		"\u009e\u00a9\u00ab\u00b0\u00b4\u00b6\u00d9\u00e7\u00ec\u00f1\u00f6\u00f8"+
		"\u0100\u010a\u0114\u0119\u011d\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}