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
		OPEN=9, CLOSE=10, CHECKDOORS=11, MOVE=12, PICKUP=13, LEAVE=14, HELP=15, 
		IDENTIFIER=16, TEXT=17, EXIT=18;
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
			"CHECKDOORS", "MOVE", "PICKUP", "LEAVE", "HELP", "IDENTIFIER", "TEXT", 
			"EXIT"
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
			"SEARCH", "OPEN", "CLOSE", "CHECKDOORS", "MOVE", "PICKUP", "LEAVE", "HELP", 
			"IDENTIFIER", "TEXT", "EXIT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u014f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u009d\n\35\r\35\16\35\u009e\3\35\3"+
		"\35\6\35\u00a3\n\35\r\35\16\35\u00a4\5\35\u00a7\n\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\6\"\u00b5\n\"\r\"\16\"\u00b6\3#\3#\3$"+
		"\5$\u00bc\n$\3$\3$\6$\u00c0\n$\r$\16$\u00c1\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u00f2\n+\3+\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3,\5,\u0100\n,\3,\3,\3,\5,\u0105\n,\3,\3,\3"+
		",\5,\u010a\n,\3,\3,\3,\5,\u010f\n,\5,\u0111\n,\3-\3-\3-\3-\3-\3-\5-\u0119"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0123\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\5.\u0135\n.\3/\3/\3/\3/\3/\3/\3\60\3\60\5\60\u013f"+
		"\n\60\3\61\3\61\3\61\5\61\u0144\n\61\6\61\u0146\n\61\r\61\16\61\u0147"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\2\2\63\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21"+
		"\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63"+
		"\2\65\2\67\29\3;\2=\2?\2A\2C\4E\5G\6I\7K\bM\tO\nQ\13S\fU\rW\16Y\17[\20"+
		"]\21_\22a\23c\24\3\2\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHh"+
		"h\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2"+
		"QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\4\2..\60\60\3\2c|\3\2C\\\7\2##%\61<B"+
		"]b}\177\4\2\13\13\"\"\2\u0146\29\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2"+
		"\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2"+
		"\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a"+
		"\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3"+
		"\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27y"+
		"\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083"+
		"\3\2\2\2#\u0085\3\2\2\2%\u0087\3\2\2\2\'\u0089\3\2\2\2)\u008b\3\2\2\2"+
		"+\u008d\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u0095"+
		"\3\2\2\2\65\u0097\3\2\2\2\67\u0099\3\2\2\29\u009c\3\2\2\2;\u00a8\3\2\2"+
		"\2=\u00aa\3\2\2\2?\u00ac\3\2\2\2A\u00ae\3\2\2\2C\u00b4\3\2\2\2E\u00b8"+
		"\3\2\2\2G\u00bf\3\2\2\2I\u00c3\3\2\2\2K\u00c8\3\2\2\2M\u00cf\3\2\2\2O"+
		"\u00d5\3\2\2\2Q\u00dd\3\2\2\2S\u00e3\3\2\2\2U\u00ea\3\2\2\2W\u00f9\3\2"+
		"\2\2Y\u0112\3\2\2\2[\u0124\3\2\2\2]\u0136\3\2\2\2_\u013e\3\2\2\2a\u0145"+
		"\3\2\2\2c\u0149\3\2\2\2ef\t\2\2\2f\4\3\2\2\2gh\t\3\2\2h\6\3\2\2\2ij\t"+
		"\4\2\2j\b\3\2\2\2kl\t\5\2\2l\n\3\2\2\2mn\t\6\2\2n\f\3\2\2\2op\t\7\2\2"+
		"p\16\3\2\2\2qr\t\b\2\2r\20\3\2\2\2st\t\t\2\2t\22\3\2\2\2uv\t\n\2\2v\24"+
		"\3\2\2\2wx\t\13\2\2x\26\3\2\2\2yz\t\f\2\2z\30\3\2\2\2{|\t\r\2\2|\32\3"+
		"\2\2\2}~\t\16\2\2~\34\3\2\2\2\177\u0080\t\17\2\2\u0080\36\3\2\2\2\u0081"+
		"\u0082\t\20\2\2\u0082 \3\2\2\2\u0083\u0084\t\21\2\2\u0084\"\3\2\2\2\u0085"+
		"\u0086\t\22\2\2\u0086$\3\2\2\2\u0087\u0088\t\23\2\2\u0088&\3\2\2\2\u0089"+
		"\u008a\t\24\2\2\u008a(\3\2\2\2\u008b\u008c\t\25\2\2\u008c*\3\2\2\2\u008d"+
		"\u008e\t\26\2\2\u008e,\3\2\2\2\u008f\u0090\t\27\2\2\u0090.\3\2\2\2\u0091"+
		"\u0092\t\30\2\2\u0092\60\3\2\2\2\u0093\u0094\t\31\2\2\u0094\62\3\2\2\2"+
		"\u0095\u0096\t\32\2\2\u0096\64\3\2\2\2\u0097\u0098\t\33\2\2\u0098\66\3"+
		"\2\2\2\u0099\u009a\t\34\2\2\u009a8\3\2\2\2\u009b\u009d\5\67\34\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a6\3\2\2\2\u00a0\u00a2\t\35\2\2\u00a1\u00a3\5\67\34\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		":\3\2\2\2\u00a8\u00a9\t\36\2\2\u00a9<\3\2\2\2\u00aa\u00ab\t\37\2\2\u00ab"+
		">\3\2\2\2\u00ac\u00ad\t \2\2\u00ad@\3\2\2\2\u00ae\u00af\7\u0080\2\2\u00af"+
		"B\3\2\2\2\u00b0\u00b5\5;\36\2\u00b1\u00b5\5=\37\2\u00b2\u00b5\5\67\34"+
		"\2\u00b3\u00b5\5? \2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7D\3\2\2\2\u00b8\u00b9\t!\2\2\u00b9F\3\2\2\2\u00ba"+
		"\u00bc\7\17\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3"+
		"\2\2\2\u00bd\u00c0\7\f\2\2\u00be\u00c0\7\17\2\2\u00bf\u00bb\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2H\3\2\2\2\u00c3\u00c4\5A!\2\u00c4\u00c5\5\'\24\2\u00c5\u00c6"+
		"\5\3\2\2\u00c6\u00c7\5\63\32\2\u00c7J\3\2\2\2\u00c8\u00c9\5A!\2\u00c9"+
		"\u00ca\5\'\24\2\u00ca\u00cb\5\21\t\2\u00cb\u00cc\5\37\20\2\u00cc\u00cd"+
		"\5+\26\2\u00cd\u00ce\5)\25\2\u00ceL\3\2\2\2\u00cf\u00d0\5A!\2\u00d0\u00d1"+
		"\5!\21\2\u00d1\u00d2\5\13\6\2\u00d2\u00d3\5\13\6\2\u00d3\u00d4\5\27\f"+
		"\2\u00d4N\3\2\2\2\u00d5\u00d6\5A!\2\u00d6\u00d7\5\'\24\2\u00d7\u00d8\5"+
		"\13\6\2\u00d8\u00d9\5\3\2\2\u00d9\u00da\5%\23\2\u00da\u00db\5\7\4\2\u00db"+
		"\u00dc\5\21\t\2\u00dcP\3\2\2\2\u00dd\u00de\5A!\2\u00de\u00df\5\37\20\2"+
		"\u00df\u00e0\5!\21\2\u00e0\u00e1\5\13\6\2\u00e1\u00e2\5\35\17\2\u00e2"+
		"R\3\2\2\2\u00e3\u00e4\5A!\2\u00e4\u00e5\5\7\4\2\u00e5\u00e6\5\31\r\2\u00e6"+
		"\u00e7\5\37\20\2\u00e7\u00e8\5\'\24\2\u00e8\u00e9\5\13\6\2\u00e9T\3\2"+
		"\2\2\u00ea\u00eb\5A!\2\u00eb\u00ec\5\7\4\2\u00ec\u00ed\5\21\t\2\u00ed"+
		"\u00ee\5\13\6\2\u00ee\u00ef\5\7\4\2\u00ef\u00f1\5\27\f\2\u00f0\u00f2\5"+
		"E#\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\5\t\5\2\u00f4\u00f5\5\37\20\2\u00f5\u00f6\5\37\20\2\u00f6\u00f7"+
		"\5%\23\2\u00f7\u00f8\5\'\24\2\u00f8V\3\2\2\2\u00f9\u0110\5A!\2\u00fa\u00fb"+
		"\5\33\16\2\u00fb\u00fc\5\37\20\2\u00fc\u00fd\5-\27\2\u00fd\u0104\5\13"+
		"\6\2\u00fe\u0100\5E#\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0102\5)\25\2\u0102\u0103\5\37\20\2\u0103\u0105\3\2\2\2"+
		"\u0104\u00ff\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0111\3\2\2\2\u0106\u0107"+
		"\5\17\b\2\u0107\u010e\5\37\20\2\u0108\u010a\5E#\2\u0109\u0108\3\2\2\2"+
		"\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\5)\25\2\u010c\u010d"+
		"\5\37\20\2\u010d\u010f\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010f\u0111\3\2\2\2\u0110\u00fa\3\2\2\2\u0110\u0106\3\2\2\2\u0111X\3"+
		"\2\2\2\u0112\u0122\5A!\2\u0113\u0114\5!\21\2\u0114\u0115\5\23\n\2\u0115"+
		"\u0116\5\7\4\2\u0116\u0118\5\27\f\2\u0117\u0119\5E#\2\u0118\u0117\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\5+\26\2\u011b"+
		"\u011c\5!\21\2\u011c\u0123\3\2\2\2\u011d\u011e\5)\25\2\u011e\u011f\5\3"+
		"\2\2\u011f\u0120\5\27\f\2\u0120\u0121\5\13\6\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0113\3\2\2\2\u0122\u011d\3\2\2\2\u0123Z\3\2\2\2\u0124\u0134\5A!\2\u0125"+
		"\u0126\5\31\r\2\u0126\u0127\5\13\6\2\u0127\u0128\5\3\2\2\u0128\u0129\5"+
		"-\27\2\u0129\u012a\5\13\6\2\u012a\u0135\3\2\2\2\u012b\u012c\5!\21\2\u012c"+
		"\u012d\5+\26\2\u012d\u012e\5)\25\2\u012e\u0135\3\2\2\2\u012f\u0130\5\t"+
		"\5\2\u0130\u0131\5%\23\2\u0131\u0132\5\37\20\2\u0132\u0133\5!\21\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0125\3\2\2\2\u0134\u012b\3\2\2\2\u0134\u012f\3\2"+
		"\2\2\u0135\\\3\2\2\2\u0136\u0137\5A!\2\u0137\u0138\5\21\t\2\u0138\u0139"+
		"\5\13\6\2\u0139\u013a\5\31\r\2\u013a\u013b\5!\21\2\u013b^\3\2\2\2\u013c"+
		"\u013f\5C\"\2\u013d\u013f\59\35\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2"+
		"\2\2\u013f`\3\2\2\2\u0140\u0143\5_\60\2\u0141\u0144\5E#\2\u0142\u0144"+
		"\7\2\2\3\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0140\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148b\3\2\2\2\u0149\u014a\5A!\2\u014a\u014b\5\13\6\2\u014b\u014c"+
		"\5\61\31\2\u014c\u014d\5\23\n\2\u014d\u014e\5)\25\2\u014ed\3\2\2\2\27"+
		"\2\u009e\u00a4\u00a6\u00b4\u00b6\u00bb\u00bf\u00c1\u00f1\u00ff\u0104\u0109"+
		"\u010e\u0110\u0118\u0122\u0134\u013e\u0143\u0147\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}