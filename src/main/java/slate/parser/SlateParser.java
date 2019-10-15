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
		OPEN=9, CLOSE=10, CHECKDOORS=11, MOVE=12, PICKUP=13, LEAVE=14, HELP=15, 
		IDENTIFIER=16, TEXT=17, EXIT=18;
	public static final int
		RULE_saycomm = 0, RULE_shoutcomm = 1, RULE_pickupcomm = 2, RULE_leavecomm = 3, 
		RULE_checkdoorscomm = 4, RULE_peekcomm = 5, RULE_searchcomm = 6, RULE_movecomm = 7, 
		RULE_helpcomm = 8, RULE_exitcomm = 9, RULE_opencomm = 10, RULE_closecomm = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"saycomm", "shoutcomm", "pickupcomm", "leavecomm", "checkdoorscomm", 
			"peekcomm", "searchcomm", "movecomm", "helpcomm", "exitcomm", "opencomm", 
			"closecomm"
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
			setState(24);
			match(SAY);
			setState(26); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(25);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(28); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(30);
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
			setState(32);
			match(SHOUT);
			setState(34); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(33);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(36); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(38);
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
			setState(40);
			match(PICKUP);
			setState(42); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(41);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(44); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(46);
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
			setState(48);
			match(LEAVE);
			setState(50); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(49);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(52); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(54);
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
		public TerminalNode EOF() { return getToken(SlateParser.EOF, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			match(CHECKDOORS);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(57);
					match(WHITESPACE);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(63);
			match(EOF);
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
			setState(65);
			match(PEEK);
			setState(67); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(66);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(71);
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
		public TerminalNode EOF() { return getToken(SlateParser.EOF, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(73);
			match(SEARCH);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(74);
					match(WHITESPACE);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(80);
			match(EOF);
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
			setState(82);
			match(MOVE);
			setState(84); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(83);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(88);
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
		public TerminalNode EOF() { return getToken(SlateParser.EOF, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
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
		enterRule(_localctx, 16, RULE_helpcomm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(90);
			match(HELP);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(91);
					match(WHITESPACE);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(97);
			match(EOF);
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
		public TerminalNode EOF() { return getToken(SlateParser.EOF, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
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
		enterRule(_localctx, 18, RULE_exitcomm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			match(EXIT);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(100);
					match(WHITESPACE);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(106);
			match(EOF);
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
		enterRule(_localctx, 20, RULE_opencomm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			match(OPEN);
			setState(110); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(109);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(114);
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
		public TerminalNode EOF() { return getToken(SlateParser.EOF, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(SlateParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SlateParser.WHITESPACE, i);
		}
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
		enterRule(_localctx, 22, RULE_closecomm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(116);
			match(CLOSE);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(117);
					match(WHITESPACE);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(123);
			match(EOF);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\3\3\6"+
		"\3%\n\3\r\3\16\3&\3\3\3\3\3\4\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\3\5\3\5\6"+
		"\5\65\n\5\r\5\16\5\66\3\5\3\5\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\3\6"+
		"\3\7\3\7\6\7F\n\7\r\7\16\7G\3\7\3\7\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3"+
		"\b\3\b\3\t\3\t\6\tW\n\t\r\t\16\tX\3\t\3\t\3\n\3\n\7\n_\n\n\f\n\16\nb\13"+
		"\n\3\n\3\n\3\13\3\13\7\13h\n\13\f\13\16\13k\13\13\3\13\3\13\3\f\3\f\6"+
		"\fq\n\f\r\f\16\fr\3\f\3\f\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\r\3\r\3\r"+
		"\16\36&.\66>GOX`irz\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\177\2\32"+
		"\3\2\2\2\4\"\3\2\2\2\6*\3\2\2\2\b\62\3\2\2\2\n:\3\2\2\2\fC\3\2\2\2\16"+
		"K\3\2\2\2\20T\3\2\2\2\22\\\3\2\2\2\24e\3\2\2\2\26n\3\2\2\2\30v\3\2\2\2"+
		"\32\34\7\7\2\2\33\35\7\5\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2"+
		"\36\34\3\2\2\2\37 \3\2\2\2 !\7\23\2\2!\3\3\2\2\2\"$\7\b\2\2#%\7\5\2\2"+
		"$#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2&$\3\2\2\2\'(\3\2\2\2()\7\23\2\2)\5\3\2"+
		"\2\2*,\7\17\2\2+-\7\5\2\2,+\3\2\2\2-.\3\2\2\2./\3\2\2\2.,\3\2\2\2/\60"+
		"\3\2\2\2\60\61\7\23\2\2\61\7\3\2\2\2\62\64\7\20\2\2\63\65\7\5\2\2\64\63"+
		"\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\66\64\3\2\2\2\678\3\2\2\289\7\23"+
		"\2\29\t\3\2\2\2:>\7\r\2\2;=\7\5\2\2<;\3\2\2\2=@\3\2\2\2>?\3\2\2\2><\3"+
		"\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\2\2\3B\13\3\2\2\2CE\7\t\2\2DF\7\5\2\2E"+
		"D\3\2\2\2FG\3\2\2\2GH\3\2\2\2GE\3\2\2\2HI\3\2\2\2IJ\7\23\2\2J\r\3\2\2"+
		"\2KO\7\n\2\2LN\7\5\2\2ML\3\2\2\2NQ\3\2\2\2OP\3\2\2\2OM\3\2\2\2PR\3\2\2"+
		"\2QO\3\2\2\2RS\7\2\2\3S\17\3\2\2\2TV\7\16\2\2UW\7\5\2\2VU\3\2\2\2WX\3"+
		"\2\2\2XY\3\2\2\2XV\3\2\2\2YZ\3\2\2\2Z[\7\23\2\2[\21\3\2\2\2\\`\7\21\2"+
		"\2]_\7\5\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2\2\2`^\3\2\2\2ac\3\2\2\2b`\3\2\2"+
		"\2cd\7\2\2\3d\23\3\2\2\2ei\7\24\2\2fh\7\5\2\2gf\3\2\2\2hk\3\2\2\2ij\3"+
		"\2\2\2ig\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\2\2\3m\25\3\2\2\2np\7\13\2\2"+
		"oq\7\5\2\2po\3\2\2\2qr\3\2\2\2rs\3\2\2\2rp\3\2\2\2st\3\2\2\2tu\7\23\2"+
		"\2u\27\3\2\2\2vz\7\f\2\2wy\7\5\2\2xw\3\2\2\2y|\3\2\2\2z{\3\2\2\2zx\3\2"+
		"\2\2{}\3\2\2\2|z\3\2\2\2}~\7\2\2\3~\31\3\2\2\2\16\36&.\66>GOX`irz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}