// Generated from D:/Users/barts/eclipse-workspace/slate-dev/src/main/resources/commands\Slate.g4 by ANTLR 4.7.2
package slate.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, WORD=2, WHITESPACE=3, NEWLINE=4, SAY=5, SHOUT=6, PEEK=7, SEARCH=8, 
		CHECKDOORS=9, MOVE=10, PICKUP=11, HELP=12, IDENTIFIER=13, TEXT=14, EXIT=15;
	public static final int
		RULE_saycomm = 0, RULE_shoutcomm = 1, RULE_pickupcomm = 2, RULE_checkdoorscomm = 3, 
		RULE_peekcomm = 4, RULE_searchcomm = 5, RULE_movecomm = 6, RULE_helpcomm = 7, 
		RULE_exitcomm = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"saycomm", "shoutcomm", "pickupcomm", "checkdoorscomm", "peekcomm", "searchcomm", 
			"movecomm", "helpcomm", "exitcomm"
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

	@Override
	public String getGrammarFileName() { return "Slate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SlateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SaycommContext extends ParserRuleContext {
		public TerminalNode SAY() { return getToken(SlateParser.SAY, 0); }
		public TerminalNode TEXT() { return getToken(SlateParser.TEXT, 0); }
		public TerminalNode WHITESPACE() { return getToken(SlateParser.WHITESPACE, 0); }
		public SaycommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saycomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterSaycomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitSaycomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitSaycomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaycommContext saycomm() throws RecognitionException {
		SaycommContext _localctx = new SaycommContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_saycomm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(18);
			match(SAY);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(19);
				match(WHITESPACE);
				}
			}

			setState(22);
			match(TEXT);
			}
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

	public static class ShoutcommContext extends ParserRuleContext {
		public TerminalNode SHOUT() { return getToken(SlateParser.SHOUT, 0); }
		public TerminalNode TEXT() { return getToken(SlateParser.TEXT, 0); }
		public TerminalNode WHITESPACE() { return getToken(SlateParser.WHITESPACE, 0); }
		public ShoutcommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shoutcomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterShoutcomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitShoutcomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitShoutcomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShoutcommContext shoutcomm() throws RecognitionException {
		ShoutcommContext _localctx = new ShoutcommContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_shoutcomm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(24);
			match(SHOUT);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(25);
				match(WHITESPACE);
				}
			}

			setState(28);
			match(TEXT);
			}
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

	public static class PickupcommContext extends ParserRuleContext {
		public TerminalNode PICKUP() { return getToken(SlateParser.PICKUP, 0); }
		public TerminalNode TEXT() { return getToken(SlateParser.TEXT, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
		public PickupcommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickupcomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterPickupcomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitPickupcomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitPickupcomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickupcommContext pickupcomm() throws RecognitionException {
		PickupcommContext _localctx = new PickupcommContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pickupcomm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(30);
			match(PICKUP);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(31);
				match(WHITESPACE);
				}
			}

			setState(34);
			match(TEXT);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(35);
				match(WHITESPACE);
				}
			}

			}
			}
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

	public static class CheckdoorscommContext extends ParserRuleContext {
		public TerminalNode CHECKDOORS() { return getToken(SlateParser.CHECKDOORS, 0); }
		public CheckdoorscommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkdoorscomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterCheckdoorscomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitCheckdoorscomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitCheckdoorscomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckdoorscommContext checkdoorscomm() throws RecognitionException {
		CheckdoorscommContext _localctx = new CheckdoorscommContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_checkdoorscomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(38);
			match(CHECKDOORS);
			}
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

	public static class PeekcommContext extends ParserRuleContext {
		public TerminalNode PEEK() { return getToken(SlateParser.PEEK, 0); }
		public TerminalNode TEXT() { return getToken(SlateParser.TEXT, 0); }
		public TerminalNode WHITESPACE() { return getToken(SlateParser.WHITESPACE, 0); }
		public PeekcommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peekcomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterPeekcomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitPeekcomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitPeekcomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeekcommContext peekcomm() throws RecognitionException {
		PeekcommContext _localctx = new PeekcommContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_peekcomm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(40);
			match(PEEK);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(41);
				match(WHITESPACE);
				}
			}

			setState(44);
			match(TEXT);
			}
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

	public static class SearchcommContext extends ParserRuleContext {
		public TerminalNode SEARCH() { return getToken(SlateParser.SEARCH, 0); }
		public SearchcommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchcomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterSearchcomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitSearchcomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitSearchcomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchcommContext searchcomm() throws RecognitionException {
		SearchcommContext _localctx = new SearchcommContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_searchcomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(46);
			match(SEARCH);
			}
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

	public static class MovecommContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(SlateParser.MOVE, 0); }
		public TerminalNode TEXT() { return getToken(SlateParser.TEXT, 0); }
		public TerminalNode WHITESPACE() { return getToken(SlateParser.WHITESPACE, 0); }
		public MovecommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movecomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterMovecomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitMovecomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitMovecomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovecommContext movecomm() throws RecognitionException {
		MovecommContext _localctx = new MovecommContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_movecomm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(48);
			match(MOVE);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(49);
				match(WHITESPACE);
				}
			}

			setState(52);
			match(TEXT);
			}
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

	public static class HelpcommContext extends ParserRuleContext {
		public TerminalNode HELP() { return getToken(SlateParser.HELP, 0); }
		public HelpcommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helpcomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterHelpcomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitHelpcomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitHelpcomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelpcommContext helpcomm() throws RecognitionException {
		HelpcommContext _localctx = new HelpcommContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_helpcomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(54);
			match(HELP);
			}
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

	public static class ExitcommContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(SlateParser.EXIT, 0); }
		public ExitcommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitcomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterExitcomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitExitcomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitExitcomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitcommContext exitcomm() throws RecognitionException {
		ExitcommContext _localctx = new ExitcommContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exitcomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			match(EXIT);
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\5\2"+
		"\27\n\2\3\2\3\2\3\3\3\3\5\3\35\n\3\3\3\3\3\3\4\3\4\5\4#\n\4\3\4\3\4\5"+
		"\4\'\n\4\3\5\3\5\3\6\3\6\5\6-\n\6\3\6\3\6\3\7\3\7\3\b\3\b\5\b\65\n\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\29\2\24\3\2"+
		"\2\2\4\32\3\2\2\2\6 \3\2\2\2\b(\3\2\2\2\n*\3\2\2\2\f\60\3\2\2\2\16\62"+
		"\3\2\2\2\208\3\2\2\2\22:\3\2\2\2\24\26\7\7\2\2\25\27\7\5\2\2\26\25\3\2"+
		"\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\7\20\2\2\31\3\3\2\2\2\32\34\7\b"+
		"\2\2\33\35\7\5\2\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7\20"+
		"\2\2\37\5\3\2\2\2 \"\7\r\2\2!#\7\5\2\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2"+
		"$&\7\20\2\2%\'\7\5\2\2&%\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2()\7\13\2\2)\t"+
		"\3\2\2\2*,\7\t\2\2+-\7\5\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\20\2\2"+
		"/\13\3\2\2\2\60\61\7\n\2\2\61\r\3\2\2\2\62\64\7\f\2\2\63\65\7\5\2\2\64"+
		"\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\20\2\2\67\17\3\2\2\28"+
		"9\7\16\2\29\21\3\2\2\2:;\7\21\2\2;\23\3\2\2\2\b\26\34\"&,\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}