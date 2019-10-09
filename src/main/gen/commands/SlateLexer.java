// Generated from D:/Users/barts/eclipse-workspace/slate-dev/src/main/resources/commands\Slate.g4 by ANTLR 4.7.2
package commands;
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
		NUMBER=1, WORD=2, WHITESPACE=3, NEWLINE=4, TEXT=5, ITEMNAME=6, SAY=7, 
		SHOUT=8, PICKUP=9, TAKE=10, HELP=11;
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
			"NUMBER", "LOWERCASE", "UPPERCASE", "WORD", "WHITESPACE", "NEWLINE", 
			"TEXT", "ITEMNAME", "SAY", "SHOUT", "PICKUP", "TAKE", "HELP"
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
			null, "NUMBER", "WORD", "WHITESPACE", "NEWLINE", "TEXT", "ITEMNAME", 
			"SAY", "SHOUT", "PICKUP", "TAKE", "HELP"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u00de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u008b\n\35\r\35\16\35\u008c\3\35\3"+
		"\35\6\35\u0091\n\35\r\35\16\35\u0092\5\35\u0095\n\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3 \6 \u009e\n \r \16 \u009f\3!\3!\3\"\5\"\u00a5\n\"\3\"\3\""+
		"\6\"\u00a9\n\"\r\"\16\"\u00aa\3#\3#\7#\u00af\n#\f#\16#\u00b2\13#\3#\3"+
		"#\3$\3$\7$\u00b8\n$\f$\16$\u00bb\13$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\4\u00b0\u00b9\2*\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25"+
		"\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\29\3;\2=\2?\4A\5C\6E\7G\bI\tK\nM\13O\fQ\r\3\2!\4\2CCcc\4\2DDdd\4\2EE"+
		"ee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\4\2..\60\60\3"+
		"\2c|\3\2C\\\4\2\13\13\"\"\2\u00cb\29\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2"+
		"\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2"+
		"\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2"+
		"\2%u\3\2\2\2\'w\3\2\2\2)y\3\2\2\2+{\3\2\2\2-}\3\2\2\2/\177\3\2\2\2\61"+
		"\u0081\3\2\2\2\63\u0083\3\2\2\2\65\u0085\3\2\2\2\67\u0087\3\2\2\29\u008a"+
		"\3\2\2\2;\u0096\3\2\2\2=\u0098\3\2\2\2?\u009d\3\2\2\2A\u00a1\3\2\2\2C"+
		"\u00a8\3\2\2\2E\u00ac\3\2\2\2G\u00b5\3\2\2\2I\u00be\3\2\2\2K\u00c3\3\2"+
		"\2\2M\u00ca\3\2\2\2O\u00d3\3\2\2\2Q\u00d9\3\2\2\2ST\t\2\2\2T\4\3\2\2\2"+
		"UV\t\3\2\2V\6\3\2\2\2WX\t\4\2\2X\b\3\2\2\2YZ\t\5\2\2Z\n\3\2\2\2[\\\t\6"+
		"\2\2\\\f\3\2\2\2]^\t\7\2\2^\16\3\2\2\2_`\t\b\2\2`\20\3\2\2\2ab\t\t\2\2"+
		"b\22\3\2\2\2cd\t\n\2\2d\24\3\2\2\2ef\t\13\2\2f\26\3\2\2\2gh\t\f\2\2h\30"+
		"\3\2\2\2ij\t\r\2\2j\32\3\2\2\2kl\t\16\2\2l\34\3\2\2\2mn\t\17\2\2n\36\3"+
		"\2\2\2op\t\20\2\2p \3\2\2\2qr\t\21\2\2r\"\3\2\2\2st\t\22\2\2t$\3\2\2\2"+
		"uv\t\23\2\2v&\3\2\2\2wx\t\24\2\2x(\3\2\2\2yz\t\25\2\2z*\3\2\2\2{|\t\26"+
		"\2\2|,\3\2\2\2}~\t\27\2\2~.\3\2\2\2\177\u0080\t\30\2\2\u0080\60\3\2\2"+
		"\2\u0081\u0082\t\31\2\2\u0082\62\3\2\2\2\u0083\u0084\t\32\2\2\u0084\64"+
		"\3\2\2\2\u0085\u0086\t\33\2\2\u0086\66\3\2\2\2\u0087\u0088\t\34\2\2\u0088"+
		"8\3\2\2\2\u0089\u008b\5\67\34\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0094\3\2\2\2\u008e\u0090"+
		"\t\35\2\2\u008f\u0091\5\67\34\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2"+
		"\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008e"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095:\3\2\2\2\u0096\u0097\t\36\2\2\u0097"+
		"<\3\2\2\2\u0098\u0099\t\37\2\2\u0099>\3\2\2\2\u009a\u009e\5;\36\2\u009b"+
		"\u009e\5=\37\2\u009c\u009e\7a\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0@\3\2\2\2\u00a1\u00a2\t \2\2\u00a2B\3\2\2\2\u00a3"+
		"\u00a5\7\17\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3"+
		"\2\2\2\u00a6\u00a9\7\f\2\2\u00a7\u00a9\7\17\2\2\u00a8\u00a4\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00abD\3\2\2\2\u00ac\u00b0\7$\2\2\u00ad\u00af\13\2\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4F\3\2\2\2\u00b5"+
		"\u00b9\7]\2\2\u00b6\u00b8\13\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\7_\2\2\u00bdH\3\2\2\2\u00be\u00bf\5\'\24\2"+
		"\u00bf\u00c0\5\3\2\2\u00c0\u00c1\5\63\32\2\u00c1\u00c2\5A!\2\u00c2J\3"+
		"\2\2\2\u00c3\u00c4\5\'\24\2\u00c4\u00c5\5\21\t\2\u00c5\u00c6\5\37\20\2"+
		"\u00c6\u00c7\5+\26\2\u00c7\u00c8\5)\25\2\u00c8\u00c9\5A!\2\u00c9L\3\2"+
		"\2\2\u00ca\u00cb\5!\21\2\u00cb\u00cc\5\23\n\2\u00cc\u00cd\5\7\4\2\u00cd"+
		"\u00ce\5\27\f\2\u00ce\u00cf\5A!\2\u00cf\u00d0\5+\26\2\u00d0\u00d1\5!\21"+
		"\2\u00d1\u00d2\5A!\2\u00d2N\3\2\2\2\u00d3\u00d4\5)\25\2\u00d4\u00d5\5"+
		"\3\2\2\u00d5\u00d6\5\27\f\2\u00d6\u00d7\5\13\6\2\u00d7\u00d8\5A!\2\u00d8"+
		"P\3\2\2\2\u00d9\u00da\5\21\t\2\u00da\u00db\5\13\6\2\u00db\u00dc\5\31\r"+
		"\2\u00dc\u00dd\5!\21\2\u00ddR\3\2\2\2\r\2\u008c\u0092\u0094\u009d\u009f"+
		"\u00a4\u00a8\u00aa\u00b0\u00b9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}