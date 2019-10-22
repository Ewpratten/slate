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
		OPEN=9, CLOSE=10, CHECKDOORS=11, MOVE=12, WAIT=13, PICKUP=14, LEAVE=15, 
		HELP=16, IDENTIFIER=17, TEXT=18, EXIT=19, SECRET=20;
	public static final int
		RULE_saycomm = 0, RULE_shoutcomm = 1, RULE_pickupcomm = 2, RULE_leavecomm = 3, 
		RULE_checkdoorscomm = 4, RULE_peekcomm = 5, RULE_searchcomm = 6, RULE_movecomm = 7, 
		RULE_waitcomm = 8, RULE_helpcomm = 9, RULE_exitcomm = 10, RULE_opencomm = 11, 
		RULE_closecomm = 12, RULE_superlongcomm = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"saycomm", "shoutcomm", "pickupcomm", "leavecomm", "checkdoorscomm", 
			"peekcomm", "searchcomm", "movecomm", "waitcomm", "helpcomm", "exitcomm", 
			"opencomm", "closecomm", "superlongcomm"
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
			"HELP", "IDENTIFIER", "TEXT", "EXIT", "SECRET"
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
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(28);
			match(SAY);
			setState(30); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(29);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(32); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(34);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(36);
			match(SHOUT);
			setState(38); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(37);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(42);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			match(PICKUP);
			setState(46); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(45);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(48); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(50);
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

	public static class LeavecommContext extends ParserRuleContext {
		public TerminalNode LEAVE() { return getToken(SlateParser.LEAVE, 0); }
		public TerminalNode TEXT() { return getToken(SlateParser.TEXT, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
		public LeavecommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leavecomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterLeavecomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitLeavecomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitLeavecomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeavecommContext leavecomm() throws RecognitionException {
		LeavecommContext _localctx = new LeavecommContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_leavecomm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(52);
			match(LEAVE);
			setState(54); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(53);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(58);
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
		enterRule(_localctx, 8, RULE_checkdoorscomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(60);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
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
		enterRule(_localctx, 10, RULE_peekcomm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			match(PEEK);
			setState(64); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(63);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(66); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(68);
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
		enterRule(_localctx, 12, RULE_searchcomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(70);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
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
		enterRule(_localctx, 14, RULE_movecomm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(72);
			match(MOVE);
			setState(74); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(73);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(78);
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

	public static class WaitcommContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(SlateParser.WAIT, 0); }
		public WaitcommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitcomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterWaitcomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitWaitcomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitWaitcomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitcommContext waitcomm() throws RecognitionException {
		WaitcommContext _localctx = new WaitcommContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_waitcomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			match(WAIT);
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
		enterRule(_localctx, 18, RULE_helpcomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(82);
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
		enterRule(_localctx, 20, RULE_exitcomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(84);
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

	public static class OpencommContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(SlateParser.OPEN, 0); }
		public TerminalNode TEXT() { return getToken(SlateParser.TEXT, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
		public OpencommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opencomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterOpencomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitOpencomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitOpencomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpencommContext opencomm() throws RecognitionException {
		OpencommContext _localctx = new OpencommContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_opencomm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(86);
			match(OPEN);
			setState(88); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(87);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(92);
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

	public static class ClosecommContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(SlateParser.CLOSE, 0); }
		public ClosecommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closecomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterClosecomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitClosecomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitClosecomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosecommContext closecomm() throws RecognitionException {
		ClosecommContext _localctx = new ClosecommContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_closecomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			match(CLOSE);
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

	public static class SuperlongcommContext extends ParserRuleContext {
		public TerminalNode SECRET() { return getToken(SlateParser.SECRET, 0); }
		public SuperlongcommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superlongcomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).enterSuperlongcomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlateListener ) ((SlateListener)listener).exitSuperlongcomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlateVisitor ) return ((SlateVisitor<? extends T>)visitor).visitSuperlongcomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperlongcommContext superlongcomm() throws RecognitionException {
		SuperlongcommContext _localctx = new SuperlongcommContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_superlongcomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96);
			match(SECRET);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\"\3\2\3\2"+
		"\3\3\3\3\6\3)\n\3\r\3\16\3*\3\3\3\3\3\4\3\4\6\4\61\n\4\r\4\16\4\62\3\4"+
		"\3\4\3\5\3\5\6\59\n\5\r\5\16\5:\3\5\3\5\3\6\3\6\3\7\3\7\6\7C\n\7\r\7\16"+
		"\7D\3\7\3\7\3\b\3\b\3\t\3\t\6\tM\n\t\r\t\16\tN\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\6\r[\n\r\r\r\16\r\\\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\t\"*\62:DN\\\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2]\2\36"+
		"\3\2\2\2\4&\3\2\2\2\6.\3\2\2\2\b\66\3\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16H"+
		"\3\2\2\2\20J\3\2\2\2\22R\3\2\2\2\24T\3\2\2\2\26V\3\2\2\2\30X\3\2\2\2\32"+
		"`\3\2\2\2\34b\3\2\2\2\36 \7\7\2\2\37!\7\5\2\2 \37\3\2\2\2!\"\3\2\2\2\""+
		"#\3\2\2\2\" \3\2\2\2#$\3\2\2\2$%\7\24\2\2%\3\3\2\2\2&(\7\b\2\2\')\7\5"+
		"\2\2(\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2*(\3\2\2\2+,\3\2\2\2,-\7\24\2\2-\5"+
		"\3\2\2\2.\60\7\20\2\2/\61\7\5\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\63\3\2"+
		"\2\2\62\60\3\2\2\2\63\64\3\2\2\2\64\65\7\24\2\2\65\7\3\2\2\2\668\7\21"+
		"\2\2\679\7\5\2\28\67\3\2\2\29:\3\2\2\2:;\3\2\2\2:8\3\2\2\2;<\3\2\2\2<"+
		"=\7\24\2\2=\t\3\2\2\2>?\7\r\2\2?\13\3\2\2\2@B\7\t\2\2AC\7\5\2\2BA\3\2"+
		"\2\2CD\3\2\2\2DE\3\2\2\2DB\3\2\2\2EF\3\2\2\2FG\7\24\2\2G\r\3\2\2\2HI\7"+
		"\n\2\2I\17\3\2\2\2JL\7\16\2\2KM\7\5\2\2LK\3\2\2\2MN\3\2\2\2NO\3\2\2\2"+
		"NL\3\2\2\2OP\3\2\2\2PQ\7\24\2\2Q\21\3\2\2\2RS\7\17\2\2S\23\3\2\2\2TU\7"+
		"\22\2\2U\25\3\2\2\2VW\7\25\2\2W\27\3\2\2\2XZ\7\13\2\2Y[\7\5\2\2ZY\3\2"+
		"\2\2[\\\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]^\3\2\2\2^_\7\24\2\2_\31\3\2\2\2"+
		"`a\7\f\2\2a\33\3\2\2\2bc\7\26\2\2c\35\3\2\2\2\t\"*\62:DN\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}