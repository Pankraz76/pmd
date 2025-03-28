/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

// CHECKSTYLE:OFF
// Generated from net/sourceforge/pmd/lang/julia/ast/Julia.g4 by ANTLR 4.9.3
package net.sourceforge.pmd.lang.julia.ast;

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @deprecated Since 7.8.0. This class was never intended to be generated. It will be removed with no replacement.
 */

@Deprecated
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public class JuliaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		COMMENTS=18, MULTILINECOMMENTS1=19, MULTILINECOMMENTS2=20, MULTILINESTRING=21, 
		NL=22, WHITESPACE=23, ABSTRACT=24, ARROWOPERATOR=25, ASSIGNMENTOPERATOR=26, 
		BAREMODULE=27, BEGIN=28, BITSHIFTOPERATOR=29, BITSTYPE=30, BREAK=31, CATCH=32, 
		CCALL=33, CHAR=34, CONST=35, CONTINUE=36, DO=37, ELSE=38, ELSIF=39, END=40, 
		EXPORT=41, EXTERNALCOMMAND=42, FINALLY=43, FOR=44, FUNCTION=45, GLOBAL=46, 
		IF=47, IMMUTABLE=48, IMPORT=49, IMPORTALL=50, INSTANCEOF=51, LET=52, LOCAL=53, 
		MACRO=54, MODULE=55, PIPEOPERATOR=56, QUOTE=57, RETURN=58, STAGEDFUNCTION=59, 
		STRING=60, STRUCT=61, TRY=62, TYPE=63, TYPEALIAS=64, USING=65, WHERE=66, 
		WHILE=67, NUMERICAL=68, INT_LITERAL=69, BINARY=70, OCTAL=71, HEX=72, FLOAT32_LITERAL=73, 
		FLOAT64_LITERAL=74, HEX_FLOAT=75, IDENTIFIER=76, ANY=77, STAGED_FUNCTION=78;
	public static final int
		RULE_main = 0, RULE_functionDefinition = 1, RULE_functionDefinition1 = 2, 
		RULE_functionDefinition2 = 3, RULE_functionIdentifier = 4, RULE_whereClause = 5, 
		RULE_functionBody = 6, RULE_statement = 7, RULE_beginStatement = 8, RULE_doStatement = 9, 
		RULE_forStatement = 10, RULE_ifStatement = 11, RULE_letStatement = 12, 
		RULE_macroStatement = 13, RULE_structStatement = 14, RULE_tryCatchStatement = 15, 
		RULE_typeStatement = 16, RULE_whileStatement = 17, RULE_anyToken = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "functionDefinition", "functionDefinition1", "functionDefinition2", 
			"functionIdentifier", "whereClause", "functionBody", "statement", "beginStatement", 
			"doStatement", "forStatement", "ifStatement", "letStatement", "macroStatement", 
			"structStatement", "tryCatchStatement", "typeStatement", "whileStatement", 
			"anyToken"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'['", "']'", "'{'", "'}'", "'=>'", "'&&'", 
			"'||'", "'=='", "'>='", "'<='", "'<'", "'<:'", "'>'", "'...'", null, 
			null, null, null, null, null, "'abstract'", null, null, "'baremodule'", 
			"'begin'", null, "'bitstype'", "'break'", "'catch'", "'ccall'", null, 
			"'const'", "'continue'", "'do'", "'else'", "'elsif'", "'end'", "'export'", 
			null, "'finally'", "'for'", "'function'", "'global'", "'if'", "'immutable'", 
			"'import'", "'importall'", "'::'", "'let'", "'local'", "'macro'", "'module'", 
			null, "'quote'", "'return'", "'stagedfunction'", null, "'struct'", "'try'", 
			"'type'", "'typealias'", "'using'", "'where'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "COMMENTS", "MULTILINECOMMENTS1", 
			"MULTILINECOMMENTS2", "MULTILINESTRING", "NL", "WHITESPACE", "ABSTRACT", 
			"ARROWOPERATOR", "ASSIGNMENTOPERATOR", "BAREMODULE", "BEGIN", "BITSHIFTOPERATOR", 
			"BITSTYPE", "BREAK", "CATCH", "CCALL", "CHAR", "CONST", "CONTINUE", "DO", 
			"ELSE", "ELSIF", "END", "EXPORT", "EXTERNALCOMMAND", "FINALLY", "FOR", 
			"FUNCTION", "GLOBAL", "IF", "IMMUTABLE", "IMPORT", "IMPORTALL", "INSTANCEOF", 
			"LET", "LOCAL", "MACRO", "MODULE", "PIPEOPERATOR", "QUOTE", "RETURN", 
			"STAGEDFUNCTION", "STRING", "STRUCT", "TRY", "TYPE", "TYPEALIAS", "USING", 
			"WHERE", "WHILE", "NUMERICAL", "INT_LITERAL", "BINARY", "OCTAL", "HEX", 
			"FLOAT32_LITERAL", "FLOAT64_LITERAL", "HEX_FLOAT", "IDENTIFIER", "ANY", 
			"STAGED_FUNCTION"
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
	public String getGrammarFileName() { return "Julia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuliaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class MainContext extends ParserRuleContext {
		public List<FunctionBodyContext> functionBody() {
			return getRuleContexts(FunctionBodyContext.class);
		}
		public FunctionBodyContext functionBody(int i) {
			return getRuleContext(FunctionBodyContext.class,i);
		}
		public TerminalNode EOF() { return getToken(JuliaParser.EOF, 0); }
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			functionBody();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==FUNCTION || _la==IDENTIFIER) {
				{
				{
				setState(39);
				functionDefinition();
				setState(40);
				functionBody();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(47);
				match(END);
				}
			}

			setState(50);
			match(EOF);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinition1Context functionDefinition1() {
			return getRuleContext(FunctionDefinition1Context.class,0);
		}
		public FunctionDefinition2Context functionDefinition2() {
			return getRuleContext(FunctionDefinition2Context.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDefinition);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				functionDefinition1();
				}
				break;
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				functionDefinition2();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class FunctionDefinition1Context extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JuliaParser.FUNCTION, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JuliaParser.IDENTIFIER, 0); }
		public List<AnyTokenContext> anyToken() {
			return getRuleContexts(AnyTokenContext.class);
		}
		public AnyTokenContext anyToken(int i) {
			return getRuleContext(AnyTokenContext.class,i);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<WhereClauseContext> whereClause() {
			return getRuleContexts(WhereClauseContext.class);
		}
		public WhereClauseContext whereClause(int i) {
			return getRuleContext(WhereClauseContext.class,i);
		}
		public FunctionDefinition1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterFunctionDefinition1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitFunctionDefinition1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitFunctionDefinition1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinition1Context functionDefinition1() throws RecognitionException {
		FunctionDefinition1Context _localctx = new FunctionDefinition1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDefinition1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(FUNCTION);
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(57);
				match(IDENTIFIER);
				}
				break;
			}
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(60);
					anyToken();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(66);
				match(T__0);
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(67);
						anyToken();
						}
						} 
					}
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(73);
				match(T__1);
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(74);
						whereClause();
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(80);
				functionBody();
				}
			}

			setState(83);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class FunctionDefinition2Context extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<AnyTokenContext> anyToken() {
			return getRuleContexts(AnyTokenContext.class);
		}
		public AnyTokenContext anyToken(int i) {
			return getRuleContext(AnyTokenContext.class,i);
		}
		public List<WhereClauseContext> whereClause() {
			return getRuleContexts(WhereClauseContext.class);
		}
		public WhereClauseContext whereClause(int i) {
			return getRuleContext(WhereClauseContext.class,i);
		}
		public FunctionDefinition2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterFunctionDefinition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitFunctionDefinition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitFunctionDefinition2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinition2Context functionDefinition2() throws RecognitionException {
		FunctionDefinition2Context _localctx = new FunctionDefinition2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			functionIdentifier();
			setState(86);
			match(T__0);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(87);
					anyToken();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(93);
			match(T__1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(94);
					whereClause();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(100);
			match(T__2);
			setState(101);
			functionBody();
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class FunctionIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JuliaParser.IDENTIFIER, 0); }
		public List<AnyTokenContext> anyToken() {
			return getRuleContexts(AnyTokenContext.class);
		}
		public AnyTokenContext anyToken(int i) {
			return getRuleContext(AnyTokenContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionIdentifier);
		try {
			int _alt;
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(IDENTIFIER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__0);
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(105);
						anyToken();
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(111);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(JuliaParser.WHERE, 0); }
		public List<AnyTokenContext> anyToken() {
			return getRuleContexts(AnyTokenContext.class);
		}
		public AnyTokenContext anyToken(int i) {
			return getRuleContext(AnyTokenContext.class,i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whereClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(WHERE);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(115);
					anyToken();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class FunctionBodyContext extends ParserRuleContext {
		public List<AnyTokenContext> anyToken() {
			return getRuleContexts(AnyTokenContext.class);
		}
		public AnyTokenContext anyToken(int i) {
			return getRuleContext(AnyTokenContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(121);
					anyToken();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(127);
					statement();
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(128);
							anyToken();
							}
							} 
						}
						setState(133);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class StatementContext extends ParserRuleContext {
		public BeginStatementContext beginStatement() {
			return getRuleContext(BeginStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public FunctionDefinition1Context functionDefinition1() {
			return getRuleContext(FunctionDefinition1Context.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public MacroStatementContext macroStatement() {
			return getRuleContext(MacroStatementContext.class,0);
		}
		public StructStatementContext structStatement() {
			return getRuleContext(StructStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public TypeStatementContext typeStatement() {
			return getRuleContext(TypeStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				beginStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				doStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				forStatement();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				functionDefinition1();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				ifStatement();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				letStatement();
				}
				break;
			case MACRO:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				macroStatement();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				structStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				tryCatchStatement();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
				typeStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(149);
				whileStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class BeginStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(JuliaParser.BEGIN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public BeginStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterBeginStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitBeginStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitBeginStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginStatementContext beginStatement() throws RecognitionException {
		BeginStatementContext _localctx = new BeginStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_beginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(BEGIN);
			setState(153);
			functionBody();
			setState(154);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(JuliaParser.DO, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(DO);
			setState(157);
			functionBody();
			setState(158);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JuliaParser.FOR, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(FOR);
			setState(161);
			functionBody();
			setState(162);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JuliaParser.IF, 0); }
		public List<FunctionBodyContext> functionBody() {
			return getRuleContexts(FunctionBodyContext.class);
		}
		public FunctionBodyContext functionBody(int i) {
			return getRuleContext(FunctionBodyContext.class,i);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<TerminalNode> ELSIF() { return getTokens(JuliaParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(JuliaParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(JuliaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IF);
			setState(165);
			functionBody();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(166);
				match(ELSIF);
				setState(167);
				functionBody();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(173);
				match(ELSE);
				setState(174);
				functionBody();
				}
			}

			setState(177);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class LetStatementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(JuliaParser.LET, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterLetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitLetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_letStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LET);
			setState(180);
			functionBody();
			setState(181);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class MacroStatementContext extends ParserRuleContext {
		public TerminalNode MACRO() { return getToken(JuliaParser.MACRO, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public MacroStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterMacroStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitMacroStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitMacroStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroStatementContext macroStatement() throws RecognitionException {
		MacroStatementContext _localctx = new MacroStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_macroStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(MACRO);
			setState(184);
			functionBody();
			setState(185);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class StructStatementContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(JuliaParser.STRUCT, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public StructStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterStructStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitStructStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitStructStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructStatementContext structStatement() throws RecognitionException {
		StructStatementContext _localctx = new StructStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(STRUCT);
			setState(188);
			functionBody();
			setState(189);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class TryCatchStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JuliaParser.TRY, 0); }
		public List<FunctionBodyContext> functionBody() {
			return getRuleContexts(FunctionBodyContext.class);
		}
		public FunctionBodyContext functionBody(int i) {
			return getRuleContext(FunctionBodyContext.class,i);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public TerminalNode CATCH() { return getToken(JuliaParser.CATCH, 0); }
		public TerminalNode FINALLY() { return getToken(JuliaParser.FINALLY, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(TRY);
			setState(192);
			functionBody();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(193);
				match(CATCH);
				setState(194);
				functionBody();
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(197);
				match(FINALLY);
				setState(198);
				functionBody();
				}
			}

			setState(201);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class TypeStatementContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(JuliaParser.TYPE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public TypeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterTypeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitTypeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitTypeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeStatementContext typeStatement() throws RecognitionException {
		TypeStatementContext _localctx = new TypeStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(TYPE);
			setState(204);
			functionBody();
			setState(205);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JuliaParser.WHILE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(WHILE);
			setState(208);
			functionBody();
			setState(209);
			match(END);
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

	@net.sourceforge.pmd.annotation.Generated("org.antlr.v4.Tool")
 public static class AnyTokenContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(JuliaParser.ABSTRACT, 0); }
		public TerminalNode ANY() { return getToken(JuliaParser.ANY, 0); }
		public TerminalNode ARROWOPERATOR() { return getToken(JuliaParser.ARROWOPERATOR, 0); }
		public TerminalNode ASSIGNMENTOPERATOR() { return getToken(JuliaParser.ASSIGNMENTOPERATOR, 0); }
		public TerminalNode BAREMODULE() { return getToken(JuliaParser.BAREMODULE, 0); }
		public TerminalNode BEGIN() { return getToken(JuliaParser.BEGIN, 0); }
		public TerminalNode BITSHIFTOPERATOR() { return getToken(JuliaParser.BITSHIFTOPERATOR, 0); }
		public TerminalNode BITSTYPE() { return getToken(JuliaParser.BITSTYPE, 0); }
		public TerminalNode BREAK() { return getToken(JuliaParser.BREAK, 0); }
		public TerminalNode CATCH() { return getToken(JuliaParser.CATCH, 0); }
		public TerminalNode CCALL() { return getToken(JuliaParser.CCALL, 0); }
		public TerminalNode CHAR() { return getToken(JuliaParser.CHAR, 0); }
		public TerminalNode CONST() { return getToken(JuliaParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(JuliaParser.CONTINUE, 0); }
		public TerminalNode DO() { return getToken(JuliaParser.DO, 0); }
		public TerminalNode ELSE() { return getToken(JuliaParser.ELSE, 0); }
		public TerminalNode ELSIF() { return getToken(JuliaParser.ELSIF, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public TerminalNode EXPORT() { return getToken(JuliaParser.EXPORT, 0); }
		public TerminalNode EXTERNALCOMMAND() { return getToken(JuliaParser.EXTERNALCOMMAND, 0); }
		public TerminalNode FINALLY() { return getToken(JuliaParser.FINALLY, 0); }
		public TerminalNode FOR() { return getToken(JuliaParser.FOR, 0); }
		public TerminalNode FUNCTION() { return getToken(JuliaParser.FUNCTION, 0); }
		public TerminalNode GLOBAL() { return getToken(JuliaParser.GLOBAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JuliaParser.IDENTIFIER, 0); }
		public TerminalNode IF() { return getToken(JuliaParser.IF, 0); }
		public TerminalNode IMMUTABLE() { return getToken(JuliaParser.IMMUTABLE, 0); }
		public TerminalNode IMPORT() { return getToken(JuliaParser.IMPORT, 0); }
		public TerminalNode IMPORTALL() { return getToken(JuliaParser.IMPORTALL, 0); }
		public TerminalNode INSTANCEOF() { return getToken(JuliaParser.INSTANCEOF, 0); }
		public TerminalNode LET() { return getToken(JuliaParser.LET, 0); }
		public TerminalNode LOCAL() { return getToken(JuliaParser.LOCAL, 0); }
		public TerminalNode MACRO() { return getToken(JuliaParser.MACRO, 0); }
		public TerminalNode MODULE() { return getToken(JuliaParser.MODULE, 0); }
		public TerminalNode NUMERICAL() { return getToken(JuliaParser.NUMERICAL, 0); }
		public TerminalNode PIPEOPERATOR() { return getToken(JuliaParser.PIPEOPERATOR, 0); }
		public TerminalNode QUOTE() { return getToken(JuliaParser.QUOTE, 0); }
		public TerminalNode RETURN() { return getToken(JuliaParser.RETURN, 0); }
		public TerminalNode STAGED_FUNCTION() { return getToken(JuliaParser.STAGED_FUNCTION, 0); }
		public TerminalNode STRING() { return getToken(JuliaParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(JuliaParser.STRUCT, 0); }
		public TerminalNode TRY() { return getToken(JuliaParser.TRY, 0); }
		public TerminalNode TYPE() { return getToken(JuliaParser.TYPE, 0); }
		public TerminalNode TYPEALIAS() { return getToken(JuliaParser.TYPEALIAS, 0); }
		public TerminalNode USING() { return getToken(JuliaParser.USING, 0); }
		public TerminalNode WHERE() { return getToken(JuliaParser.WHERE, 0); }
		public TerminalNode WHILE() { return getToken(JuliaParser.WHILE, 0); }
		public List<AnyTokenContext> anyToken() {
			return getRuleContexts(AnyTokenContext.class);
		}
		public AnyTokenContext anyToken(int i) {
			return getRuleContext(AnyTokenContext.class,i);
		}
		public AnyTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.enterAnyToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener juliaListener ) juliaListener.exitAnyToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor<? extends T> juliaVisitor ) return juliaVisitor.visitAnyToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyTokenContext anyToken() throws RecognitionException {
		AnyTokenContext _localctx = new AnyTokenContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_anyToken);
		try {
			int _alt;
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(ABSTRACT);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(ANY);
				}
				break;
			case ARROWOPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(ARROWOPERATOR);
				}
				break;
			case ASSIGNMENTOPERATOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(ASSIGNMENTOPERATOR);
				}
				break;
			case BAREMODULE:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(BAREMODULE);
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(BEGIN);
				}
				break;
			case BITSHIFTOPERATOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(217);
				match(BITSHIFTOPERATOR);
				}
				break;
			case BITSTYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				match(BITSTYPE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(219);
				match(BREAK);
				}
				break;
			case CATCH:
				enterOuterAlt(_localctx, 10);
				{
				setState(220);
				match(CATCH);
				}
				break;
			case CCALL:
				enterOuterAlt(_localctx, 11);
				{
				setState(221);
				match(CCALL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 12);
				{
				setState(222);
				match(CHAR);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 13);
				{
				setState(223);
				match(CONST);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 14);
				{
				setState(224);
				match(CONTINUE);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 15);
				{
				setState(225);
				match(DO);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 16);
				{
				setState(226);
				match(ELSE);
				}
				break;
			case ELSIF:
				enterOuterAlt(_localctx, 17);
				{
				setState(227);
				match(ELSIF);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 18);
				{
				setState(228);
				match(END);
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 19);
				{
				setState(229);
				match(EXPORT);
				}
				break;
			case EXTERNALCOMMAND:
				enterOuterAlt(_localctx, 20);
				{
				setState(230);
				match(EXTERNALCOMMAND);
				}
				break;
			case FINALLY:
				enterOuterAlt(_localctx, 21);
				{
				setState(231);
				match(FINALLY);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 22);
				{
				setState(232);
				match(FOR);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 23);
				{
				setState(233);
				match(FUNCTION);
				}
				break;
			case GLOBAL:
				enterOuterAlt(_localctx, 24);
				{
				setState(234);
				match(GLOBAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 25);
				{
				setState(235);
				match(IDENTIFIER);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 26);
				{
				setState(236);
				match(IF);
				}
				break;
			case IMMUTABLE:
				enterOuterAlt(_localctx, 27);
				{
				setState(237);
				match(IMMUTABLE);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 28);
				{
				setState(238);
				match(IMPORT);
				}
				break;
			case IMPORTALL:
				enterOuterAlt(_localctx, 29);
				{
				setState(239);
				match(IMPORTALL);
				}
				break;
			case INSTANCEOF:
				enterOuterAlt(_localctx, 30);
				{
				setState(240);
				match(INSTANCEOF);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 31);
				{
				setState(241);
				match(LET);
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 32);
				{
				setState(242);
				match(LOCAL);
				}
				break;
			case MACRO:
				enterOuterAlt(_localctx, 33);
				{
				setState(243);
				match(MACRO);
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 34);
				{
				setState(244);
				match(MODULE);
				}
				break;
			case NUMERICAL:
				enterOuterAlt(_localctx, 35);
				{
				setState(245);
				match(NUMERICAL);
				}
				break;
			case PIPEOPERATOR:
				enterOuterAlt(_localctx, 36);
				{
				setState(246);
				match(PIPEOPERATOR);
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 37);
				{
				setState(247);
				match(QUOTE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 38);
				{
				setState(248);
				match(RETURN);
				}
				break;
			case STAGED_FUNCTION:
				enterOuterAlt(_localctx, 39);
				{
				setState(249);
				match(STAGED_FUNCTION);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 40);
				{
				setState(250);
				match(STRING);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 41);
				{
				setState(251);
				match(STRUCT);
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 42);
				{
				setState(252);
				match(TRY);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 43);
				{
				setState(253);
				match(TYPE);
				}
				break;
			case TYPEALIAS:
				enterOuterAlt(_localctx, 44);
				{
				setState(254);
				match(TYPEALIAS);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 45);
				{
				setState(255);
				match(USING);
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 46);
				{
				setState(256);
				match(WHERE);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 47);
				{
				setState(257);
				match(WHILE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 48);
				{
				setState(258);
				match(T__0);
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(259);
						anyToken();
						}
						} 
					}
					setState(264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(265);
				match(T__1);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 49);
				{
				setState(266);
				match(T__3);
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(267);
						anyToken();
						}
						} 
					}
					setState(272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(273);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 50);
				{
				setState(274);
				match(T__5);
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(275);
						anyToken();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(281);
				match(T__6);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 51);
				{
				setState(282);
				match(T__2);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 52);
				{
				setState(283);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 53);
				{
				setState(284);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 54);
				{
				setState(285);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 55);
				{
				setState(286);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 56);
				{
				setState(287);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 57);
				{
				setState(288);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 58);
				{
				setState(289);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 59);
				{
				setState(290);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 60);
				{
				setState(291);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 61);
				{
				setState(292);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"""
        悋Ꜫ脳맭䅼㯧瞆奤PĪ	\
        									
        	
        	\
        							\
        		-
        0\
        3
        9
        =
        @
        \
        CG
        JN
        Q\
        T
        [
        ^\
        b
        em
        p\
        s
        w
        z}
        \
        
        
        \
        												
        	\
        
        
        
        
        \
        «
        ®²
        \
        \
        Æ
        Ê
        \
        \
        \
        \
        ć
        Ċď
        \
        Ēė
        Ě\
        Ĩ
        \
        AHO\\cnx~ĈĐĘ
        \
         "$&ų(8:\
        W
        rt~\
        ¢¦µ\
        ¹½ Á"Í\
        $Ñ&ħ(.)**++-\
        ,)-0.,.//20.\
        13*21233445\
        5697986879\
        :</;=N<;<==A>@&?>\
        @CABA?BSCADHEG&\
        FEGJHIHFIKJHKO\
        LNMLNQOPOMPRQO\
        RTSDSTTUUV*VWX
        \
        X\\Y[&ZY[^\\]\\Z]_\
        ^\\_c`ba`becdca\
        dfecfgghh	isN\
        jnkm&lkmpnonloq\
        pnqsrirjstxDuw&\
        vuwzxyxvyzx{}&\
        |{}~~|\
        ~	&\
        \
        \
        \
        
        \
        \
         "\
        $\
        \
        \
        \
        *'\
          ¡*¡¢£.\
        £¤¤¥*¥¦§\
        1§¬¨©)©«\
        ª¨«®¬ª¬­\
        ­±®¬¯°(°\
        ²±¯±²²³\
        ³´*´µ¶6¶\
        ··¸*¸¹º8\
        º»»¼*¼½¾\
        ?¾¿¿À*ÀÁ\
        Â@ÂÅÃÄ"ÄÆ\
        ÅÃÅÆÆÉÇ\
        È-ÈÊÉÇÉÊ\
        ÊËËÌ*Ì!ÍÎ\
        AÎÏÏÐ*Ð#ÑÒ\
        EÒÓÓÔ*Ô%ÕĨ\
        ÖĨO×ĨØĨ\
        ÙĨÚĨÛĨÜ\
        Ĩ ÝĨ!ÞĨ"ßĨ#\
        àĨ$áĨ%âĨ&ãĨ\
        'äĨ(åĨ)æĨ*ç\
        Ĩ+èĨ,éĨ-êĨ.\
        ëĨ/ìĨ0íĨNîĨ\
        1ïĨ2ðĨ3ñĨ4\
        òĨ5óĨ6ôĨ7õ\
        Ĩ8öĨ9÷ĨFøĨ:\
        ùĨ;úĨ<ûĨPüĨ\
        >ýĨ?þĨ@ÿĨAĀ\
        ĨBāĨCĂĨDăĨE\
        ĄĈąć&ĆąćĊ\
        ĈĉĈĆĉċĊ\
        ĈċĨČĐčď&\
        ĎčďĒĐđĐ\
        ĎđēĒĐēĨ\
        ĔĘĕė&Ėĕė\
        ĚĘęĘĖęě\
        ĚĘěĨ	ĜĨĝ\
        Ĩ
        ĞĨğĨĠĨ\
        ġĨĢĨģĨ\
        ĤĨĥĨĦĨħ\
        ÕħÖħ×ħØ\
        ħÙħÚħÛħ\
        ÜħÝħÞħß\
        ħàħáħâħ\
        ãħäħåħæ\
        ħçħèħéħ\
        êħëħìħí\
        ħîħïħðħ\
        ñħòħóħô\
        ħõħöħ÷ħ\
        øħùħúħû\
        ħüħýħþħ\
        ÿħĀħāħĂ\
        ħăħĄħČħ\
        ĔħĜħĝħĞ\
        ħğħĠħġħ\
        ĢħģħĤħĥ\
        ħĦĨ'.28<AHOS\\cnrx~\
        ¬±ÅÉĈĐĘħ""";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
