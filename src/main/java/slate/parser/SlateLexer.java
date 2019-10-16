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
		OPEN=9, CLOSE=10, CHECKDOORS=11, MOVE=12, WAIT=13, PICKUP=14, LEAVE=15, 
		HELP=16, IDENTIFIER=17, TEXT=18, EXIT=19;
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
			"NUMBER", "LOWERCASE", "UPPERCASE", "SYMBOL", "COMMANDINDICATOR", "WORD", 
			"WHITESPACE", "NEWLINE", "SAY", "SHOUT", "PEEK", "SEARCH", "OPEN", "CLOSE", 
			"CHECKDOORS", "MOVE", "WAIT", "PICKUP", "LEAVE", "HELP", "IDENTIFIER", 
			"TEXT", "EXIT"
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
			"SEARCH", "OPEN", "CLOSE", "CHECKDOORS", "MOVE", "WAIT", "PICKUP", "LEAVE", 
			"HELP", "IDENTIFIER", "TEXT", "EXIT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0189\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u009f\n\35\r\35\16\35\u00a0"+
		"\3\35\3\35\6\35\u00a5\n\35\r\35\16\35\u00a6\5\35\u00a9\n\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\6\"\u00b7\n\"\r\"\16\"\u00b8\3"+
		"#\3#\3$\5$\u00be\n$\3$\3$\6$\u00c2\n$\r$\16$\u00c3\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u00de"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u00eb\n(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u00f6\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0106"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\5+\u010f\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u011a"+
		"\n+\3,\3,\3,\3,\3,\3,\5,\u0122\n,\3,\3,\3,\5,\u0127\n,\3,\3,\3,\5,\u012c"+
		"\n,\3,\3,\3,\5,\u0131\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u013e\n,"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u014b\n-\3.\3.\3.\3.\3.\3.\5.\u0153"+
		"\n.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u015d\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\5/\u016f\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\5\61\u0179\n\61\3\62\3\62\3\62\5\62\u017e\n\62\6\62\u0180\n\62\r\62\16"+
		"\62\u0181\3\63\3\63\3\63\3\63\3\63\3\63\2\2\64\3\2\5\2\7\2\t\2\13\2\r"+
		"\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2"+
		"/\2\61\2\63\2\65\2\67\29\3;\2=\2?\2A\2C\4E\5G\6I\7K\bM\tO\nQ\13S\fU\r"+
		"W\16Y\17[\20]\21_\22a\23c\24e\25\3\2\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFf"+
		"f\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\4\2..\60\60\3\2c|\3\2"+
		"C\\\7\2##%\61<B]b}\177\4\2\13\13\"\"\2\u0187\29\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k"+
		"\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23"+
		"w\3\2\2\2\25y\3\2\2\2\27{\3\2\2\2\31}\3\2\2\2\33\177\3\2\2\2\35\u0081"+
		"\3\2\2\2\37\u0083\3\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2"+
		"\'\u008b\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0093\3"+
		"\2\2\2\61\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u0099\3\2\2\2\67\u009b\3\2"+
		"\2\29\u009e\3\2\2\2;\u00aa\3\2\2\2=\u00ac\3\2\2\2?\u00ae\3\2\2\2A\u00b0"+
		"\3\2\2\2C\u00b6\3\2\2\2E\u00ba\3\2\2\2G\u00c1\3\2\2\2I\u00c5\3\2\2\2K"+
		"\u00ca\3\2\2\2M\u00d1\3\2\2\2O\u00df\3\2\2\2Q\u00ec\3\2\2\2S\u00f7\3\2"+
		"\2\2U\u0107\3\2\2\2W\u011b\3\2\2\2Y\u013f\3\2\2\2[\u014c\3\2\2\2]\u015e"+
		"\3\2\2\2_\u0170\3\2\2\2a\u0178\3\2\2\2c\u017f\3\2\2\2e\u0183\3\2\2\2g"+
		"h\t\2\2\2h\4\3\2\2\2ij\t\3\2\2j\6\3\2\2\2kl\t\4\2\2l\b\3\2\2\2mn\t\5\2"+
		"\2n\n\3\2\2\2op\t\6\2\2p\f\3\2\2\2qr\t\7\2\2r\16\3\2\2\2st\t\b\2\2t\20"+
		"\3\2\2\2uv\t\t\2\2v\22\3\2\2\2wx\t\n\2\2x\24\3\2\2\2yz\t\13\2\2z\26\3"+
		"\2\2\2{|\t\f\2\2|\30\3\2\2\2}~\t\r\2\2~\32\3\2\2\2\177\u0080\t\16\2\2"+
		"\u0080\34\3\2\2\2\u0081\u0082\t\17\2\2\u0082\36\3\2\2\2\u0083\u0084\t"+
		"\20\2\2\u0084 \3\2\2\2\u0085\u0086\t\21\2\2\u0086\"\3\2\2\2\u0087\u0088"+
		"\t\22\2\2\u0088$\3\2\2\2\u0089\u008a\t\23\2\2\u008a&\3\2\2\2\u008b\u008c"+
		"\t\24\2\2\u008c(\3\2\2\2\u008d\u008e\t\25\2\2\u008e*\3\2\2\2\u008f\u0090"+
		"\t\26\2\2\u0090,\3\2\2\2\u0091\u0092\t\27\2\2\u0092.\3\2\2\2\u0093\u0094"+
		"\t\30\2\2\u0094\60\3\2\2\2\u0095\u0096\t\31\2\2\u0096\62\3\2\2\2\u0097"+
		"\u0098\t\32\2\2\u0098\64\3\2\2\2\u0099\u009a\t\33\2\2\u009a\66\3\2\2\2"+
		"\u009b\u009c\t\34\2\2\u009c8\3\2\2\2\u009d\u009f\5\67\34\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a8\3\2\2\2\u00a2\u00a4\t\35\2\2\u00a3\u00a5\5\67\34\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9:\3\2\2\2"+
		"\u00aa\u00ab\t\36\2\2\u00ab<\3\2\2\2\u00ac\u00ad\t\37\2\2\u00ad>\3\2\2"+
		"\2\u00ae\u00af\t \2\2\u00af@\3\2\2\2\u00b0\u00b1\7\u0080\2\2\u00b1B\3"+
		"\2\2\2\u00b2\u00b7\5;\36\2\u00b3\u00b7\5=\37\2\u00b4\u00b7\5\67\34\2\u00b5"+
		"\u00b7\5? \2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9D\3\2\2\2\u00ba\u00bb\t!\2\2\u00bbF\3\2\2\2\u00bc\u00be"+
		"\7\17\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00c2\7\f\2\2\u00c0\u00c2\7\17\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"H\3\2\2\2\u00c5\u00c6\5A!\2\u00c6\u00c7\5\'\24\2\u00c7\u00c8\5\3\2\2\u00c8"+
		"\u00c9\5\63\32\2\u00c9J\3\2\2\2\u00ca\u00cb\5A!\2\u00cb\u00cc\5\'\24\2"+
		"\u00cc\u00cd\5\21\t\2\u00cd\u00ce\5\37\20\2\u00ce\u00cf\5+\26\2\u00cf"+
		"\u00d0\5)\25\2\u00d0L\3\2\2\2\u00d1\u00dd\5A!\2\u00d2\u00d3\5!\21\2\u00d3"+
		"\u00d4\5\13\6\2\u00d4\u00d5\5\13\6\2\u00d5\u00d6\5\27\f\2\u00d6\u00de"+
		"\3\2\2\2\u00d7\u00d8\5\7\4\2\u00d8\u00d9\5\21\t\2\u00d9\u00da\5\13\6\2"+
		"\u00da\u00db\5\7\4\2\u00db\u00dc\5\27\f\2\u00dc\u00de\3\2\2\2\u00dd\u00d2"+
		"\3\2\2\2\u00dd\u00d7\3\2\2\2\u00deN\3\2\2\2\u00df\u00ea\5A!\2\u00e0\u00e1"+
		"\5\'\24\2\u00e1\u00e2\5\13\6\2\u00e2\u00e3\5\3\2\2\u00e3\u00e4\5%\23\2"+
		"\u00e4\u00e5\5\7\4\2\u00e5\u00e6\5\21\t\2\u00e6\u00eb\3\2\2\2\u00e7\u00e8"+
		"\5\31\r\2\u00e8\u00e9\5\'\24\2\u00e9\u00eb\3\2\2\2\u00ea\u00e0\3\2\2\2"+
		"\u00ea\u00e7\3\2\2\2\u00ebP\3\2\2\2\u00ec\u00f5\5A!\2\u00ed\u00ee\5\37"+
		"\20\2\u00ee\u00ef\5!\21\2\u00ef\u00f0\5\13\6\2\u00f0\u00f1\5\35\17\2\u00f1"+
		"\u00f6\3\2\2\2\u00f2\u00f3\5\7\4\2\u00f3\u00f4\5\t\5\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6R\3\2\2\2\u00f7\u0105"+
		"\5A!\2\u00f8\u00f9\5\7\4\2\u00f9\u00fa\5\31\r\2\u00fa\u00fb\5\37\20\2"+
		"\u00fb\u00fc\5\'\24\2\u00fc\u00fd\5\13\6\2\u00fd\u0106\3\2\2\2\u00fe\u00ff"+
		"\5\7\4\2\u00ff\u0100\5\t\5\2\u0100\u0101\5E#\2\u0101\u0102\7\60\2\2\u0102"+
		"\u0103\7\60\2\2\u0103\u0104\7\61\2\2\u0104\u0106\3\2\2\2\u0105\u00f8\3"+
		"\2\2\2\u0105\u00fe\3\2\2\2\u0106T\3\2\2\2\u0107\u0119\5A!\2\u0108\u0109"+
		"\5\7\4\2\u0109\u010a\5\21\t\2\u010a\u010b\5\13\6\2\u010b\u010c\5\7\4\2"+
		"\u010c\u010e\5\27\f\2\u010d\u010f\5E#\2\u010e\u010d\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5\t\5\2\u0111\u0112\5\37\20\2"+
		"\u0112\u0113\5\37\20\2\u0113\u0114\5%\23\2\u0114\u0115\5\'\24\2\u0115"+
		"\u011a\3\2\2\2\u0116\u0117\5\t\5\2\u0117\u0118\5\r\7\2\u0118\u011a\3\2"+
		"\2\2\u0119\u0108\3\2\2\2\u0119\u0116\3\2\2\2\u011aV\3\2\2\2\u011b\u013d"+
		"\5A!\2\u011c\u011d\5\33\16\2\u011d\u011e\5\37\20\2\u011e\u011f\5-\27\2"+
		"\u011f\u0126\5\13\6\2\u0120\u0122\5E#\2\u0121\u0120\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\5)\25\2\u0124\u0125\5\37\20\2"+
		"\u0125\u0127\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u013e"+
		"\3\2\2\2\u0128\u0129\5\17\b\2\u0129\u0130\5\37\20\2\u012a\u012c\5E#\2"+
		"\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\5)\25\2\u012e\u012f\5\37\20\2\u012f\u0131\3\2\2\2\u0130\u012b\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0131\u013e\3\2\2\2\u0132\u0133\5\7\4\2\u0133\u0134"+
		"\5\t\5\2\u0134\u0135\5E#\2\u0135\u0136\7\61\2\2\u0136\u0137\5\33\16\2"+
		"\u0137\u0138\5\13\6\2\u0138\u0139\5\t\5\2\u0139\u013a\5\23\n\2\u013a\u013b"+
		"\5\3\2\2\u013b\u013c\7\61\2\2\u013c\u013e\3\2\2\2\u013d\u011c\3\2\2\2"+
		"\u013d\u0128\3\2\2\2\u013d\u0132\3\2\2\2\u013eX\3\2\2\2\u013f\u014a\5"+
		"A!\2\u0140\u0141\5/\30\2\u0141\u0142\5\3\2\2\u0142\u0143\5\23\n\2\u0143"+
		"\u0144\5)\25\2\u0144\u014b\3\2\2\2\u0145\u0146\5\'\24\2\u0146\u0147\5"+
		")\25\2\u0147\u0148\5\3\2\2\u0148\u0149\5\63\32\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0140\3\2\2\2\u014a\u0145\3\2\2\2\u014bZ\3\2\2\2\u014c\u015c\5A!\2\u014d"+
		"\u014e\5!\21\2\u014e\u014f\5\23\n\2\u014f\u0150\5\7\4\2\u0150\u0152\5"+
		"\27\f\2\u0151\u0153\5E#\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\5+\26\2\u0155\u0156\5!\21\2\u0156\u015d\3\2"+
		"\2\2\u0157\u0158\5)\25\2\u0158\u0159\5\3\2\2\u0159\u015a\5\27\f\2\u015a"+
		"\u015b\5\13\6\2\u015b\u015d\3\2\2\2\u015c\u014d\3\2\2\2\u015c\u0157\3"+
		"\2\2\2\u015d\\\3\2\2\2\u015e\u016e\5A!\2\u015f\u0160\5\31\r\2\u0160\u0161"+
		"\5\13\6\2\u0161\u0162\5\3\2\2\u0162\u0163\5-\27\2\u0163\u0164\5\13\6\2"+
		"\u0164\u016f\3\2\2\2\u0165\u0166\5!\21\2\u0166\u0167\5+\26\2\u0167\u0168"+
		"\5)\25\2\u0168\u016f\3\2\2\2\u0169\u016a\5\t\5\2\u016a\u016b\5%\23\2\u016b"+
		"\u016c\5\37\20\2\u016c\u016d\5!\21\2\u016d\u016f\3\2\2\2\u016e\u015f\3"+
		"\2\2\2\u016e\u0165\3\2\2\2\u016e\u0169\3\2\2\2\u016f^\3\2\2\2\u0170\u0171"+
		"\5A!\2\u0171\u0172\5\21\t\2\u0172\u0173\5\13\6\2\u0173\u0174\5\31\r\2"+
		"\u0174\u0175\5!\21\2\u0175`\3\2\2\2\u0176\u0179\5C\"\2\u0177\u0179\59"+
		"\35\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179b\3\2\2\2\u017a\u017d"+
		"\5a\61\2\u017b\u017e\5E#\2\u017c\u017e\7\2\2\3\u017d\u017b\3\2\2\2\u017d"+
		"\u017c\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017a\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182d\3\2\2\2\u0183\u0184"+
		"\5A!\2\u0184\u0185\5\13\6\2\u0185\u0186\5\61\31\2\u0186\u0187\5\23\n\2"+
		"\u0187\u0188\5)\25\2\u0188f\3\2\2\2\35\2\u00a0\u00a6\u00a8\u00b6\u00b8"+
		"\u00bd\u00c1\u00c3\u00dd\u00ea\u00f5\u0105\u010e\u0119\u0121\u0126\u012b"+
		"\u0130\u013d\u014a\u0152\u015c\u016e\u0178\u017d\u0181\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}