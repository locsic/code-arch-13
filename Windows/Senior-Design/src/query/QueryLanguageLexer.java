package query;

// $ANTLR 3.4 C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g 2014-11-02 15:56:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryLanguageLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int AS=5;
    public static final int AST_CHILD=6;
    public static final int ATTRIBUTE=7;
    public static final int ATTRIBUTES=8;
    public static final int BIN_OP=9;
    public static final int BLOCK_STATEMENTS=10;
    public static final int BOOL_EXP=11;
    public static final int CHAIN_ID=12;
    public static final int COLON=13;
    public static final int COMMA=14;
    public static final int COMPOUND_ADD=15;
    public static final int COMP_ADD=16;
    public static final int CONTAINS=17;
    public static final int DEPTH=18;
    public static final int DIVIDE=19;
    public static final int DQOUTE=20;
    public static final int EPSILON=21;
    public static final int EQUALS=22;
    public static final int ESC_SEQ=23;
    public static final int EXPONENT=24;
    public static final int FILTER=25;
    public static final int FILTER_QUERY=26;
    public static final int FLOAT=27;
    public static final int FOR_QUERY=28;
    public static final int FUNCTION=29;
    public static final int GT=30;
    public static final int GTE=31;
    public static final int HAS=32;
    public static final int HEX_DIGIT=33;
    public static final int ID=34;
    public static final int IF=35;
    public static final int IF_STATEMENT=36;
    public static final int IN=37;
    public static final int INCR=38;
    public static final int INCREMENT=39;
    public static final int INTEGER=40;
    public static final int IN_CLAUSE=41;
    public static final int IS=42;
    public static final int ISNODETYPE=43;
    public static final int ISPARENT=44;
    public static final int LEFT_BRACKET=45;
    public static final int LEFT_PAREN=46;
    public static final int LEFT_SQ_BRACKET=47;
    public static final int LINE_COMMENT=48;
    public static final int LOGIC_EQUALS=49;
    public static final int LOGIC_OP=50;
    public static final int LT=51;
    public static final int LTE=52;
    public static final int MAX=53;
    public static final int MIN=54;
    public static final int MINUS=55;
    public static final int NESTED=56;
    public static final int NODE=57;
    public static final int NODE_CHAIN=58;
    public static final int NODE_CHAIN_OP=59;
    public static final int NODE_NAME=60;
    public static final int NODE_TYPE=61;
    public static final int NOT=62;
    public static final int NOT_EQUAL=63;
    public static final int OCTAL_ESC=64;
    public static final int OR=65;
    public static final int PERIOD=66;
    public static final int PLUS=67;
    public static final int PRINT=68;
    public static final int PROPERTY=69;
    public static final int QUERIES=70;
    public static final int QUERY=71;
    public static final int QUERY_NAME=72;
    public static final int REPEATER=73;
    public static final int RESERVED_TYPES=74;
    public static final int RIGHT_BRACKET=75;
    public static final int RIGHT_PAREN=76;
    public static final int RIGHT_SQ_BRACKET=77;
    public static final int SELECT=78;
    public static final int SELECT_QUERY=79;
    public static final int SEMICOLON=80;
    public static final int SET=81;
    public static final int SET_TABLE=82;
    public static final int SPACE=83;
    public static final int STAR=84;
    public static final int STATEMENT=85;
    public static final int STATEMENTS=86;
    public static final int STRING=87;
    public static final int TABLE=88;
    public static final int UNICODE_ESC=89;
    public static final int VAR=90;
    public static final int VAR_ASSIGN=91;
    public static final int VAR_NAME=92;
    public static final int VAR_STMT=93;
    public static final int WHERE=94;
    public static final int WHERE_BLOCK=95;
    public static final int WITH=96;
    public static final int WITH_CLAUSE=97;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public QueryLanguageLexer() {} 
    public QueryLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public QueryLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:233:2: ( 'select' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:233:5: 'select'
            {
            match("select"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:236:2: ( 'where' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:236:4: 'where'
            {
            match("where"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:239:2: ( 'with' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:239:4: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:242:2: ( 'as' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:242:4: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:245:2: ( 'set' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:245:4: 'set'
            {
            match("set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:248:2: ( 'if' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:248:4: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:250:4: ( 'in' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:250:6: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:253:2: ( '*' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:253:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "REPEATER"
    public final void mREPEATER() throws RecognitionException {
        try {
            int _type = REPEATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:256:2: ( PERIOD PERIOD PERIOD )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:256:4: PERIOD PERIOD PERIOD
            {
            mPERIOD(); 


            mPERIOD(); 


            mPERIOD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPEATER"

    // $ANTLR start "CONTAINS"
    public final void mCONTAINS() throws RecognitionException {
        try {
            int _type = CONTAINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:259:2: ( 'contains' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:259:4: 'contains'
            {
            match("contains"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTAINS"

    // $ANTLR start "ISPARENT"
    public final void mISPARENT() throws RecognitionException {
        try {
            int _type = ISPARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:262:2: ( 'isparent' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:262:4: 'isparent'
            {
            match("isparent"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISPARENT"

    // $ANTLR start "ISNODETYPE"
    public final void mISNODETYPE() throws RecognitionException {
        try {
            int _type = ISNODETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:265:2: ( 'isnodetype' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:265:4: 'isnodetype'
            {
            match("isnodetype"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISNODETYPE"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:267:4: ( 'is' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:267:6: 'is'
            {
            match("is"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "HAS"
    public final void mHAS() throws RecognitionException {
        try {
            int _type = HAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:269:5: ( 'has' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:269:7: 'has'
            {
            match("has"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HAS"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:271:5: ( 'max' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:271:7: 'max'
            {
            match("max"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAX"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:273:5: ( 'min' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:273:7: 'min'
            {
            match("min"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "DEPTH"
    public final void mDEPTH() throws RecognitionException {
        try {
            int _type = DEPTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:275:7: ( 'depth' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:275:9: 'depth'
            {
            match("depth"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEPTH"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:278:2: ( 'print' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:278:4: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:280:7: ( ',' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:280:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "FILTER"
    public final void mFILTER() throws RecognitionException {
        try {
            int _type = FILTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:283:2: ( '->' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:283:4: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FILTER"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:287:2: ( '(' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:287:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:290:2: ( ')' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:290:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "LEFT_BRACKET"
    public final void mLEFT_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:293:2: ( '{' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:293:4: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_BRACKET"

    // $ANTLR start "RIGHT_BRACKET"
    public final void mRIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:296:2: ( '}' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:296:4: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_BRACKET"

    // $ANTLR start "LEFT_SQ_BRACKET"
    public final void mLEFT_SQ_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_SQ_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:299:2: ( '[' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:299:4: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_SQ_BRACKET"

    // $ANTLR start "RIGHT_SQ_BRACKET"
    public final void mRIGHT_SQ_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_SQ_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:302:2: ( ']' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:302:4: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_SQ_BRACKET"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:305:2: ( ';' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:305:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:308:2: ( ':' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:308:4: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            int _type = PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:311:2: ( '.' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:311:5: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERIOD"

    // $ANTLR start "DQOUTE"
    public final void mDQOUTE() throws RecognitionException {
        try {
            int _type = DQOUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:314:8: ( '\"' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:314:10: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DQOUTE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:316:5: ( '>' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:316:7: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:318:5: ( '<' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:318:7: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:320:5: ( LT EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:320:7: LT EQUALS
            {
            mLT(); 


            mEQUALS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:322:5: ( GT EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:322:7: GT EQUALS
            {
            mGT(); 


            mEQUALS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:324:5: ( '&&' | 'AND' | 'and' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case '&':
                {
                alt1=1;
                }
                break;
            case 'A':
                {
                alt1=2;
                }
                break;
            case 'a':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:324:7: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:325:4: 'AND'
                    {
                    match("AND"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:326:4: 'and'
                    {
                    match("and"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:328:4: ( '||' | 'OR' | 'or' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case '|':
                {
                alt2=1;
                }
                break;
            case 'O':
                {
                alt2=2;
                }
                break;
            case 'o':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:328:6: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:329:4: 'OR'
                    {
                    match("OR"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:330:4: 'or'
                    {
                    match("or"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:332:5: ( '!' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:332:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:335:2: ( NOT EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:335:4: NOT EQUALS
            {
            mNOT(); 


            mEQUALS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LOGIC_EQUALS"
    public final void mLOGIC_EQUALS() throws RecognitionException {
        try {
            int _type = LOGIC_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:337:14: ( EQUALS EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:337:16: EQUALS EQUALS
            {
            mEQUALS(); 


            mEQUALS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGIC_EQUALS"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:340:8: ( '=' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:340:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:342:6: ( '+' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:342:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:344:7: ( '-' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:344:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:346:8: ( '/' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:346:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "COMPOUND_ADD"
    public final void mCOMPOUND_ADD() throws RecognitionException {
        try {
            int _type = COMPOUND_ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:348:14: ( PLUS EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:348:16: PLUS EQUALS
            {
            mPLUS(); 


            mEQUALS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPOUND_ADD"

    // $ANTLR start "INCREMENT"
    public final void mINCREMENT() throws RecognitionException {
        try {
            int _type = INCREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:350:11: ( PLUS PLUS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:350:13: PLUS PLUS
            {
            mPLUS(); 


            mPLUS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCREMENT"

    // $ANTLR start "NODE_TYPE"
    public final void mNODE_TYPE() throws RecognitionException {
        try {
            int _type = NODE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:355:2: ( 'package_declaration' | 'body_declarations' | 'variable_declaration' | 'import_declaration' | 'type_declaration' | 'field_declaration' | 'method_declaration' | 'interface_declaration' | 'constructor_declaration' | 'class_declaration' | 'variable_declaration_fragment' | 'variable_declaration_statement' | 'thrown_exceptions' | 'try_statement' | 'catch_clause' | 'initializer' | 'method_invocation' | 'if_statement' | 'expression' | 'operator' | 'conditional_expression' | 'continue_expression' | 'assignment' | 'this_expression' | 'class_instance_creation' | 'field_access' | 'instance_of_expression' | 'cast_expression' | 'super_field_access' | 'statement' | 'then_statement' | 'else_statement' | 'do_statement' | 'parameters' | 'body' | 'for_statement' | 'enhanced_for_statement' | 'switch_statement' | 'while_statement' | 'null_literal' | 'integer_literal' | 'character_literal' | 'string_literal' | 'boolean_literal' | 'variable' | 'file' | 'directory' )
            int alt3=47;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:355:4: 'package_declaration'
                    {
                    match("package_declaration"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:356:4: 'body_declarations'
                    {
                    match("body_declarations"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:357:4: 'variable_declaration'
                    {
                    match("variable_declaration"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:358:4: 'import_declaration'
                    {
                    match("import_declaration"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:359:4: 'type_declaration'
                    {
                    match("type_declaration"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:360:4: 'field_declaration'
                    {
                    match("field_declaration"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:361:4: 'method_declaration'
                    {
                    match("method_declaration"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:362:4: 'interface_declaration'
                    {
                    match("interface_declaration"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:363:4: 'constructor_declaration'
                    {
                    match("constructor_declaration"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:364:4: 'class_declaration'
                    {
                    match("class_declaration"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:365:4: 'variable_declaration_fragment'
                    {
                    match("variable_declaration_fragment"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:366:4: 'variable_declaration_statement'
                    {
                    match("variable_declaration_statement"); 



                    }
                    break;
                case 13 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:367:4: 'thrown_exceptions'
                    {
                    match("thrown_exceptions"); 



                    }
                    break;
                case 14 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:368:4: 'try_statement'
                    {
                    match("try_statement"); 



                    }
                    break;
                case 15 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:369:4: 'catch_clause'
                    {
                    match("catch_clause"); 



                    }
                    break;
                case 16 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:370:4: 'initializer'
                    {
                    match("initializer"); 



                    }
                    break;
                case 17 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:371:4: 'method_invocation'
                    {
                    match("method_invocation"); 



                    }
                    break;
                case 18 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:372:4: 'if_statement'
                    {
                    match("if_statement"); 



                    }
                    break;
                case 19 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:373:4: 'expression'
                    {
                    match("expression"); 



                    }
                    break;
                case 20 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:374:4: 'operator'
                    {
                    match("operator"); 



                    }
                    break;
                case 21 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:375:4: 'conditional_expression'
                    {
                    match("conditional_expression"); 



                    }
                    break;
                case 22 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:376:4: 'continue_expression'
                    {
                    match("continue_expression"); 



                    }
                    break;
                case 23 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:377:4: 'assignment'
                    {
                    match("assignment"); 



                    }
                    break;
                case 24 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:378:4: 'this_expression'
                    {
                    match("this_expression"); 



                    }
                    break;
                case 25 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:379:4: 'class_instance_creation'
                    {
                    match("class_instance_creation"); 



                    }
                    break;
                case 26 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:380:4: 'field_access'
                    {
                    match("field_access"); 



                    }
                    break;
                case 27 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:381:4: 'instance_of_expression'
                    {
                    match("instance_of_expression"); 



                    }
                    break;
                case 28 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:382:4: 'cast_expression'
                    {
                    match("cast_expression"); 



                    }
                    break;
                case 29 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:383:4: 'super_field_access'
                    {
                    match("super_field_access"); 



                    }
                    break;
                case 30 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:384:4: 'statement'
                    {
                    match("statement"); 



                    }
                    break;
                case 31 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:385:4: 'then_statement'
                    {
                    match("then_statement"); 



                    }
                    break;
                case 32 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:386:4: 'else_statement'
                    {
                    match("else_statement"); 



                    }
                    break;
                case 33 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:387:4: 'do_statement'
                    {
                    match("do_statement"); 



                    }
                    break;
                case 34 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:388:4: 'parameters'
                    {
                    match("parameters"); 



                    }
                    break;
                case 35 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:389:4: 'body'
                    {
                    match("body"); 



                    }
                    break;
                case 36 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:390:4: 'for_statement'
                    {
                    match("for_statement"); 



                    }
                    break;
                case 37 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:391:4: 'enhanced_for_statement'
                    {
                    match("enhanced_for_statement"); 



                    }
                    break;
                case 38 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:392:4: 'switch_statement'
                    {
                    match("switch_statement"); 



                    }
                    break;
                case 39 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:393:4: 'while_statement'
                    {
                    match("while_statement"); 



                    }
                    break;
                case 40 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:394:4: 'null_literal'
                    {
                    match("null_literal"); 



                    }
                    break;
                case 41 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:395:4: 'integer_literal'
                    {
                    match("integer_literal"); 



                    }
                    break;
                case 42 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:396:4: 'character_literal'
                    {
                    match("character_literal"); 



                    }
                    break;
                case 43 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:397:4: 'string_literal'
                    {
                    match("string_literal"); 



                    }
                    break;
                case 44 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:398:4: 'boolean_literal'
                    {
                    match("boolean_literal"); 



                    }
                    break;
                case 45 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:399:4: 'variable'
                    {
                    match("variable"); 



                    }
                    break;
                case 46 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:400:4: 'file'
                    {
                    match("file"); 



                    }
                    break;
                case 47 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:401:4: 'directory'
                    {
                    match("directory"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NODE_TYPE"

    // $ANTLR start "ATTRIBUTES"
    public final void mATTRIBUTES() throws RecognitionException {
        try {
            int _type = ATTRIBUTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:405:2: ( 'name' | 'type' | 'return_type' | 'parameter_types' | 'is_constructor' | 'is_deprecated' | 'is_parameter' | 'is_field' | 'default_value' | 'modifiers' | 'origin' | 'kind' | 'declared_methods' | 'declared_fields' | 'declared_types' | 'declaring_class' | 'declaring_method' | 'package' | 'interfaces' | 'superclass' | 'boxing' | 'unboxing' | 'parameter_list' | 'modifier' | 'startLine' | 'endLine' | 'totalLines' | 'boolean_value' )
            int alt4=28;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:405:4: 'name'
                    {
                    match("name"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:406:4: 'type'
                    {
                    match("type"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:407:4: 'return_type'
                    {
                    match("return_type"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:408:4: 'parameter_types'
                    {
                    match("parameter_types"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:409:4: 'is_constructor'
                    {
                    match("is_constructor"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:410:4: 'is_deprecated'
                    {
                    match("is_deprecated"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:411:4: 'is_parameter'
                    {
                    match("is_parameter"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:412:4: 'is_field'
                    {
                    match("is_field"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:413:4: 'default_value'
                    {
                    match("default_value"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:414:4: 'modifiers'
                    {
                    match("modifiers"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:415:4: 'origin'
                    {
                    match("origin"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:416:4: 'kind'
                    {
                    match("kind"); 



                    }
                    break;
                case 13 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:417:4: 'declared_methods'
                    {
                    match("declared_methods"); 



                    }
                    break;
                case 14 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:418:4: 'declared_fields'
                    {
                    match("declared_fields"); 



                    }
                    break;
                case 15 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:419:4: 'declared_types'
                    {
                    match("declared_types"); 



                    }
                    break;
                case 16 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:420:4: 'declaring_class'
                    {
                    match("declaring_class"); 



                    }
                    break;
                case 17 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:421:4: 'declaring_method'
                    {
                    match("declaring_method"); 



                    }
                    break;
                case 18 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:422:4: 'package'
                    {
                    match("package"); 



                    }
                    break;
                case 19 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:423:4: 'interfaces'
                    {
                    match("interfaces"); 



                    }
                    break;
                case 20 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:424:4: 'superclass'
                    {
                    match("superclass"); 



                    }
                    break;
                case 21 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:425:4: 'boxing'
                    {
                    match("boxing"); 



                    }
                    break;
                case 22 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:426:4: 'unboxing'
                    {
                    match("unboxing"); 



                    }
                    break;
                case 23 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:427:4: 'parameter_list'
                    {
                    match("parameter_list"); 



                    }
                    break;
                case 24 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:428:4: 'modifier'
                    {
                    match("modifier"); 



                    }
                    break;
                case 25 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:429:4: 'startLine'
                    {
                    match("startLine"); 



                    }
                    break;
                case 26 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:430:4: 'endLine'
                    {
                    match("endLine"); 



                    }
                    break;
                case 27 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:431:4: 'totalLines'
                    {
                    match("totalLines"); 



                    }
                    break;
                case 28 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:432:4: 'boolean_value'
                    {
                    match("boolean_value"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATTRIBUTES"

    // $ANTLR start "RESERVED_TYPES"
    public final void mRESERVED_TYPES() throws RecognitionException {
        try {
            int _type = RESERVED_TYPES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:435:2: ( 'is_class' | 'is_primitive' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='i') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='s') ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2=='_') ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3=='c') ) {
                            alt5=1;
                        }
                        else if ( (LA5_3=='p') ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:435:4: 'is_class'
                    {
                    match("is_class"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:436:4: 'is_primitive'
                    {
                    match("is_primitive"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESERVED_TYPES"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:440:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:440:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:440:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:443:9: ( ( '0' .. '9' )+ )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:443:11: ( '0' .. '9' )+
            {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:443:11: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:446:9: ( '\"' ( . )* '\"' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:446:11: '\"' ( . )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:446:15: ( . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\"') ) {
                    alt8=2;
                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:446:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:450:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:450:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:450:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:450:25: ( '0' .. '9' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:450:37: ( EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:450:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:451:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:451:13: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:451:25: ( EXPONENT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:451:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:452:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:452:9: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:457:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:457:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:457:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:457:33: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:460:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:464:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:464:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:465:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:466:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:471:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;
                        }
                    }
                    else {
                        alt19=3;
                    }
                }
                else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:471:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:472:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:473:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:478:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:478:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:480:8: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:480:10: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:480:10: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0 >= '\t' && LA20_0 <= '\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:482:14: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:483:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); 



            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:484:13: (~ ( '\\n' | '\\r' ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= '\u0000' && LA21_0 <= '\t')||(LA21_0 >= '\u000B' && LA21_0 <= '\f')||(LA21_0 >= '\u000E' && LA21_0 <= '\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:485:13: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n') ) {
                alt23=1;
            }
            else if ( (LA23_0=='\r') ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:485:15: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:485:20: '\\r' ( '\\n' )?
                    {
                    match('\r'); 

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:485:24: ( '\\n' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\n') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:485:25: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

            }


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:8: ( SELECT | WHERE | WITH | AS | SET | IF | IN | STAR | REPEATER | CONTAINS | ISPARENT | ISNODETYPE | IS | HAS | MAX | MIN | DEPTH | PRINT | COMMA | FILTER | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_SQ_BRACKET | RIGHT_SQ_BRACKET | SEMICOLON | COLON | PERIOD | DQOUTE | GT | LT | LTE | GTE | AND | OR | NOT | NOT_EQUAL | LOGIC_EQUALS | EQUALS | PLUS | MINUS | DIVIDE | COMPOUND_ADD | INCREMENT | NODE_TYPE | ATTRIBUTES | RESERVED_TYPES | ID | INTEGER | STRING | FLOAT | SPACE | LINE_COMMENT )
        int alt24=54;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:10: SELECT
                {
                mSELECT(); 


                }
                break;
            case 2 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:17: WHERE
                {
                mWHERE(); 


                }
                break;
            case 3 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:23: WITH
                {
                mWITH(); 


                }
                break;
            case 4 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:28: AS
                {
                mAS(); 


                }
                break;
            case 5 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:31: SET
                {
                mSET(); 


                }
                break;
            case 6 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:35: IF
                {
                mIF(); 


                }
                break;
            case 7 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:38: IN
                {
                mIN(); 


                }
                break;
            case 8 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:41: STAR
                {
                mSTAR(); 


                }
                break;
            case 9 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:46: REPEATER
                {
                mREPEATER(); 


                }
                break;
            case 10 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:55: CONTAINS
                {
                mCONTAINS(); 


                }
                break;
            case 11 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:64: ISPARENT
                {
                mISPARENT(); 


                }
                break;
            case 12 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:73: ISNODETYPE
                {
                mISNODETYPE(); 


                }
                break;
            case 13 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:84: IS
                {
                mIS(); 


                }
                break;
            case 14 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:87: HAS
                {
                mHAS(); 


                }
                break;
            case 15 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:91: MAX
                {
                mMAX(); 


                }
                break;
            case 16 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:95: MIN
                {
                mMIN(); 


                }
                break;
            case 17 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:99: DEPTH
                {
                mDEPTH(); 


                }
                break;
            case 18 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:105: PRINT
                {
                mPRINT(); 


                }
                break;
            case 19 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:111: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 20 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:117: FILTER
                {
                mFILTER(); 


                }
                break;
            case 21 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:124: LEFT_PAREN
                {
                mLEFT_PAREN(); 


                }
                break;
            case 22 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:135: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 


                }
                break;
            case 23 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:147: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 


                }
                break;
            case 24 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:160: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 


                }
                break;
            case 25 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:174: LEFT_SQ_BRACKET
                {
                mLEFT_SQ_BRACKET(); 


                }
                break;
            case 26 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:190: RIGHT_SQ_BRACKET
                {
                mRIGHT_SQ_BRACKET(); 


                }
                break;
            case 27 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:207: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 28 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:217: COLON
                {
                mCOLON(); 


                }
                break;
            case 29 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:223: PERIOD
                {
                mPERIOD(); 


                }
                break;
            case 30 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:230: DQOUTE
                {
                mDQOUTE(); 


                }
                break;
            case 31 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:237: GT
                {
                mGT(); 


                }
                break;
            case 32 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:240: LT
                {
                mLT(); 


                }
                break;
            case 33 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:243: LTE
                {
                mLTE(); 


                }
                break;
            case 34 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:247: GTE
                {
                mGTE(); 


                }
                break;
            case 35 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:251: AND
                {
                mAND(); 


                }
                break;
            case 36 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:255: OR
                {
                mOR(); 


                }
                break;
            case 37 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:258: NOT
                {
                mNOT(); 


                }
                break;
            case 38 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:262: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 39 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:272: LOGIC_EQUALS
                {
                mLOGIC_EQUALS(); 


                }
                break;
            case 40 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:285: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 41 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:292: PLUS
                {
                mPLUS(); 


                }
                break;
            case 42 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:297: MINUS
                {
                mMINUS(); 


                }
                break;
            case 43 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:303: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 44 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:310: COMPOUND_ADD
                {
                mCOMPOUND_ADD(); 


                }
                break;
            case 45 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:323: INCREMENT
                {
                mINCREMENT(); 


                }
                break;
            case 46 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:333: NODE_TYPE
                {
                mNODE_TYPE(); 


                }
                break;
            case 47 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:343: ATTRIBUTES
                {
                mATTRIBUTES(); 


                }
                break;
            case 48 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:354: RESERVED_TYPES
                {
                mRESERVED_TYPES(); 


                }
                break;
            case 49 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:369: ID
                {
                mID(); 


                }
                break;
            case 50 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:372: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 51 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:380: STRING
                {
                mSTRING(); 


                }
                break;
            case 52 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:387: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 53 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:393: SPACE
                {
                mSPACE(); 


                }
                break;
            case 54 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:399: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA3_eotS =
        "\74\uffff\1\106\32\uffff\1\133\16\uffff\1\150\4\uffff";
    static final String DFA3_eofS =
        "\153\uffff";
    static final String DFA3_minS =
        "\2\141\1\157\1\141\1\146\1\150\1\151\1\145\1\141\1\154\2\uffff\1"+
        "\164\1\151\2\uffff\1\143\1\144\1\162\1\uffff\1\151\2\uffff\1\145"+
        "\1\uffff\1\145\1\uffff\1\164\1\156\1\141\1\163\5\uffff\1\141\5\uffff"+
        "\1\171\1\uffff\1\151\1\145\5\uffff\1\154\1\uffff\1\150\1\144\1\163"+
        "\4\uffff\1\137\1\141\1\147\1\144\1\157\3\uffff\1\163\2\uffff\1\142"+
        "\2\uffff\1\137\1\144\1\137\1\154\1\141\1\137\1\144\1\145\2\uffff"+
        "\1\144\2\uffff\1\137\2\uffff\1\144\1\uffff\1\145\1\143\1\154\1\141"+
        "\1\162\1\141\1\164\1\151\1\157\1\156\1\137\1\146\3\uffff";
    static final String DFA3_maxS =
        "\1\167\1\141\1\157\1\141\1\156\1\171\1\157\1\145\1\157\1\170\2\uffff"+
        "\1\167\1\157\2\uffff\1\162\1\157\1\162\1\uffff\1\164\2\uffff\1\162"+
        "\1\uffff\1\154\1\uffff\1\164\1\156\1\141\1\164\5\uffff\1\162\5\uffff"+
        "\1\171\1\uffff\1\151\1\145\5\uffff\1\154\1\uffff\1\150\1\164\1\163"+
        "\4\uffff\1\137\1\141\1\162\1\144\1\157\3\uffff\1\163\2\uffff\1\142"+
        "\2\uffff\1\137\1\144\1\137\1\154\1\144\1\137\1\151\1\145\2\uffff"+
        "\1\151\2\uffff\1\137\2\uffff\1\144\1\uffff\1\145\1\143\1\154\1\141"+
        "\1\162\1\141\1\164\1\151\1\157\1\156\1\137\1\163\3\uffff";
    static final String DFA3_acceptS =
        "\12\uffff\1\24\1\27\2\uffff\1\47\1\50\3\uffff\1\4\1\uffff\1\22\1"+
        "\5\1\uffff\1\16\1\uffff\1\44\4\uffff\1\52\1\23\1\40\1\45\1\35\1"+
        "\uffff\1\46\1\41\1\57\1\1\1\42\1\uffff\1\54\2\uffff\1\20\1\33\1"+
        "\15\1\30\1\37\1\uffff\1\56\3\uffff\1\17\1\34\1\36\1\53\5\uffff\1"+
        "\11\1\25\1\26\1\uffff\1\2\1\43\1\uffff\1\10\1\51\10\uffff\1\6\1"+
        "\32\1\uffff\1\12\1\31\1\uffff\1\7\1\21\1\uffff\1\55\14\uffff\1\3"+
        "\1\13\1\14";
    static final String DFA3_specialS =
        "\153\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\13\1\2\1\10\1\15\1\11\1\6\2\uffff\1\4\3\uffff\1\7\1\17\1"+
            "\12\1\1\2\uffff\1\14\1\5\1\uffff\1\3\1\16",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\25\6\uffff\1\23\1\24",
            "\1\27\11\uffff\1\30\6\uffff\1\26",
            "\1\31\5\uffff\1\32",
            "\1\33",
            "\1\36\6\uffff\1\37\3\uffff\1\35\2\uffff\1\34",
            "\1\41\1\uffff\1\42\11\uffff\1\40",
            "",
            "",
            "\1\44\1\43\1\uffff\1\45",
            "\1\47\5\uffff\1\46",
            "",
            "",
            "\1\50\16\uffff\1\51",
            "\1\52\12\uffff\1\53",
            "\1\54",
            "",
            "\1\56\11\uffff\1\57\1\55",
            "",
            "",
            "\1\62\3\uffff\1\61\10\uffff\1\60",
            "",
            "\1\63\6\uffff\1\64",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\71\1\70",
            "",
            "",
            "",
            "",
            "",
            "\1\72\20\uffff\1\73",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "",
            "\1\100",
            "\1\102\16\uffff\1\101\1\103",
            "\1\104",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\107",
            "\1\111\12\uffff\1\110",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "\1\114",
            "",
            "",
            "\1\115",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\123\2\uffff\1\122",
            "\1\124",
            "\1\125\4\uffff\1\126",
            "\1\127",
            "",
            "",
            "\1\130\4\uffff\1\131",
            "",
            "",
            "\1\132",
            "",
            "",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\151\14\uffff\1\152",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "354:1: NODE_TYPE : ( 'package_declaration' | 'body_declarations' | 'variable_declaration' | 'import_declaration' | 'type_declaration' | 'field_declaration' | 'method_declaration' | 'interface_declaration' | 'constructor_declaration' | 'class_declaration' | 'variable_declaration_fragment' | 'variable_declaration_statement' | 'thrown_exceptions' | 'try_statement' | 'catch_clause' | 'initializer' | 'method_invocation' | 'if_statement' | 'expression' | 'operator' | 'conditional_expression' | 'continue_expression' | 'assignment' | 'this_expression' | 'class_instance_creation' | 'field_access' | 'instance_of_expression' | 'cast_expression' | 'super_field_access' | 'statement' | 'then_statement' | 'else_statement' | 'do_statement' | 'parameters' | 'body' | 'for_statement' | 'enhanced_for_statement' | 'switch_statement' | 'while_statement' | 'null_literal' | 'integer_literal' | 'character_literal' | 'string_literal' | 'boolean_literal' | 'variable' | 'file' | 'directory' );";
        }
    }
    static final String DFA4_eotS =
        "\64\uffff\1\71\16\uffff";
    static final String DFA4_eofS =
        "\103\uffff";
    static final String DFA4_minS =
        "\1\142\1\uffff\1\157\1\uffff\1\141\1\156\1\145\1\157\2\uffff\1\164"+
        "\1\157\4\uffff\1\143\1\137\1\uffff\1\143\1\144\2\uffff\1\157\1\141"+
        "\1\uffff\1\143\1\uffff\1\154\1\151\2\uffff\1\155\4\uffff\1\141\1"+
        "\146\1\145\1\162\1\151\1\164\3\145\1\144\1\156\2\162\1\137\1\147"+
        "\1\163\1\137\1\146\1\137\2\uffff\1\154\3\uffff\1\143\4\uffff";
    static final String DFA4_maxS =
        "\1\165\1\uffff\1\171\1\uffff\1\141\1\163\1\145\1\157\2\uffff\1\165"+
        "\1\157\4\uffff\1\162\1\137\1\uffff\1\146\1\144\2\uffff\1\170\1\141"+
        "\1\uffff\1\160\1\uffff\1\154\1\151\2\uffff\1\155\4\uffff\1\141\1"+
        "\146\1\145\1\162\1\151\1\164\1\151\2\145\1\144\1\156\2\162\1\137"+
        "\1\147\1\163\1\137\1\164\1\137\2\uffff\1\164\3\uffff\1\155\4\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\4\uffff\1\13\1\14\2\uffff\1\26\1\32\1\2"+
        "\1\33\2\uffff\1\23\2\uffff\1\24\1\31\2\uffff\1\22\1\uffff\1\11\2"+
        "\uffff\1\25\1\34\1\uffff\1\5\1\6\1\7\1\10\23\uffff\1\12\1\30\1\uffff"+
        "\1\15\1\16\1\17\1\uffff\1\4\1\27\1\20\1\21";
    static final String DFA4_specialS =
        "\103\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\13\1\uffff\1\6\1\15\3\uffff\1\5\1\uffff\1\11\1\uffff\1\7"+
            "\1\1\1\10\1\4\1\uffff\1\3\1\12\1\2\1\14",
            "",
            "\1\17\11\uffff\1\16",
            "",
            "\1\20",
            "\1\22\4\uffff\1\21",
            "\1\23",
            "\1\24",
            "",
            "",
            "\1\26\1\25",
            "\1\27",
            "",
            "",
            "",
            "",
            "\1\31\16\uffff\1\30",
            "\1\32",
            "",
            "\1\34\2\uffff\1\33",
            "\1\35",
            "",
            "",
            "\1\37\10\uffff\1\36",
            "\1\40",
            "",
            "\1\41\1\42\1\uffff\1\44\11\uffff\1\43",
            "",
            "\1\45",
            "\1\46",
            "",
            "",
            "\1\47",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56\3\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72",
            "\1\74\6\uffff\1\73\6\uffff\1\75",
            "\1\76",
            "",
            "",
            "\1\100\7\uffff\1\77",
            "",
            "",
            "",
            "\1\101\11\uffff\1\102",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "404:1: ATTRIBUTES : ( 'name' | 'type' | 'return_type' | 'parameter_types' | 'is_constructor' | 'is_deprecated' | 'is_parameter' | 'is_field' | 'default_value' | 'modifiers' | 'origin' | 'kind' | 'declared_methods' | 'declared_fields' | 'declared_types' | 'declaring_class' | 'declaring_method' | 'package' | 'interfaces' | 'superclass' | 'boxing' | 'unboxing' | 'parameter_list' | 'modifier' | 'startLine' | 'endLine' | 'totalLines' | 'boolean_value' );";
        }
    }
    static final String DFA15_eotS =
        "\5\uffff";
    static final String DFA15_eofS =
        "\5\uffff";
    static final String DFA15_minS =
        "\2\56\3\uffff";
    static final String DFA15_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA15_specialS =
        "\5\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "449:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\4\53\1\uffff\1\72\5\53\1\uffff\1\114\10\uffff\1\115\1\117"+
        "\1\121\1\uffff\1\53\1\uffff\2\53\1\127\1\131\1\133\1\137\11\53\1"+
        "\uffff\1\160\1\uffff\6\53\1\173\1\53\1\176\1\u0082\1\u0086\1\53"+
        "\3\uffff\16\53\10\uffff\1\53\2\33\1\53\11\uffff\20\53\1\uffff\1"+
        "\53\1\u00b4\10\53\1\uffff\1\31\1\53\1\uffff\3\53\1\uffff\3\53\1"+
        "\uffff\6\53\1\u00d0\1\u00d1\1\u00d2\12\53\1\31\31\53\1\uffff\7\53"+
        "\1\u00fd\23\53\3\uffff\14\53\1\u0122\3\53\1\u0127\6\53\1\u0122\6"+
        "\53\1\u0127\1\53\1\u0127\7\53\1\u013d\1\53\1\uffff\31\53\1\u0158"+
        "\4\53\1\u015d\5\53\1\uffff\4\53\1\uffff\16\53\1\u0175\6\53\1\uffff"+
        "\32\53\1\uffff\4\53\1\uffff\2\53\1\u0127\3\53\1\u0127\20\53\1\uffff"+
        "\46\53\1\u0127\21\53\1\u0127\20\53\1\u01fb\2\53\1\u01fe\3\53\1\u0127"+
        "\1\53\1\u0203\12\53\1\u0127\7\53\1\u0122\2\53\1\u0122\16\53\1\u0127"+
        "\2\53\1\u0122\1\u0127\11\53\1\uffff\2\53\1\uffff\4\53\1\uffff\12"+
        "\53\1\u0127\4\53\1\u0122\25\53\1\u0127\3\53\1\u0122\2\53\1\u0127"+
        "\3\53\1\u0268\26\53\1\u0122\12\53\1\u0127\3\53\1\u0122\13\53\1\u0122"+
        "\1\53\1\uffff\50\53\1\u0127\4\53\1\u0122\5\53\1\u0127\1\u01fe\6"+
        "\53\1\u0122\12\53\1\u0122\15\53\1\u0122\3\53\1\u0122\10\53\1\u0127"+
        "\12\53\1\u0127\12\53\1\u0127\5\53\1\u0122\1\53\1\u0122\3\53\1\u0122"+
        "\5\53\1\u0127\14\53\1\u0127\4\53\1\u0127\6\53\1\u0122\1\53\1\u0122"+
        "\3\53\1\u0122\1\53\1\u0122\7\53\1\u0122\4\53\2\u0127\2\53\1\u0127"+
        "\1\53\1\u0122\3\53\1\u0122\3\53\1\u0122\13\53\2\u0127\3\53\1\u0122"+
        "\12\53\1\u0122\1\53\1\u0122\1\53\1\u0122\1\53\1\u0122\1\53\2\u0122"+
        "\1\53\1\u0122\2\53\1\u0122\4\53\1\u0122\5\53\1\u0122\3\53\1\u0122"+
        "\7\53\1\u0122\1\53\1\u0122\6\53\1\u0122\1\53\1\u0122\3\53\3\u0122"+
        "\14\53\1\u0122\1\53\1\u0122";
    static final String DFA24_eofS =
        "\u0390\uffff";
    static final String DFA24_minS =
        "\1\11\1\145\1\150\1\156\1\146\1\uffff\1\56\3\141\1\145\1\141\1\uffff"+
        "\1\76\10\uffff\1\0\2\75\1\uffff\1\116\1\uffff\1\122\1\160\2\75\1"+
        "\53\1\57\1\157\1\141\1\150\1\151\1\154\1\141\1\145\1\151\1\156\1"+
        "\uffff\1\56\1\uffff\1\154\1\160\1\141\1\151\1\145\1\164\1\60\1\144"+
        "\3\60\1\160\3\uffff\1\156\1\141\1\163\1\141\1\163\1\170\1\156\1"+
        "\164\1\144\1\143\1\137\1\162\1\151\1\143\10\uffff\1\104\2\60\1\145"+
        "\11\uffff\1\144\1\162\1\160\1\145\1\171\1\164\1\145\1\162\1\160"+
        "\1\163\1\144\1\154\1\155\1\164\1\156\1\142\1\uffff\1\145\1\60\1"+
        "\145\1\162\1\151\1\164\1\162\1\154\1\150\1\151\1\uffff\1\60\1\163"+
        "\1\uffff\1\145\2\164\1\uffff\1\141\1\157\1\143\1\uffff\1\157\1\144"+
        "\1\163\1\143\1\164\1\162\3\60\1\150\1\151\1\164\1\141\1\154\1\163"+
        "\1\145\1\156\1\153\1\141\1\60\1\147\1\162\1\171\1\154\2\151\1\145"+
        "\1\157\1\163\1\156\1\137\1\141\1\154\1\145\1\137\1\162\1\145\1\141"+
        "\1\114\1\154\1\145\1\165\1\144\1\157\1\143\1\uffff\1\162\1\145\1"+
        "\164\1\156\1\143\2\145\1\60\1\147\1\164\1\147\1\151\1\141\1\162"+
        "\1\144\1\154\1\145\1\141\1\151\1\162\1\141\1\164\1\151\1\163\1\150"+
        "\1\137\1\141\3\uffff\1\157\1\146\1\150\1\165\1\141\1\164\1\143\1"+
        "\164\1\141\1\155\1\151\1\141\1\60\1\145\1\156\1\141\1\60\1\167\2"+
        "\137\1\163\1\154\1\144\1\60\1\163\1\145\1\137\1\156\1\151\1\137"+
        "\1\60\1\162\1\60\1\170\1\164\1\137\1\155\1\114\1\147\1\150\1\60"+
        "\1\137\1\uffff\1\156\1\141\1\146\1\145\1\141\1\156\2\145\1\156\1"+
        "\141\1\160\1\162\1\151\1\145\1\164\1\151\1\156\1\162\1\164\2\137"+
        "\1\145\1\143\1\144\1\151\1\60\1\154\1\162\1\141\1\164\1\60\1\147"+
        "\1\145\1\156\1\164\1\144\1\uffff\1\141\1\147\1\142\1\144\1\uffff"+
        "\1\156\1\145\1\163\1\164\1\114\1\137\1\164\2\163\1\143\1\156\1\154"+
        "\1\156\1\151\1\60\1\146\1\154\1\145\1\151\2\137\1\uffff\1\163\1"+
        "\155\1\164\1\141\1\162\1\154\1\143\1\156\1\164\2\163\1\162\1\141"+
        "\1\155\1\154\1\137\1\156\2\165\1\151\1\144\1\143\1\170\1\164\1\137"+
        "\1\145\1\uffff\1\164\1\145\1\164\1\157\1\uffff\1\145\1\164\1\60"+
        "\1\157\1\145\1\156\1\60\1\154\1\145\1\137\1\170\1\164\1\141\1\151"+
        "\2\141\1\163\1\164\2\145\1\151\1\137\1\156\1\uffff\1\151\1\141\2"+
        "\156\1\154\1\163\1\164\2\145\1\143\1\137\1\151\1\145\1\164\1\171"+
        "\1\164\1\163\1\145\1\155\1\151\2\144\1\163\1\145\1\143\1\157\1\145"+
        "\1\156\1\154\1\160\1\145\1\144\1\162\1\137\1\144\1\156\1\145\1\162"+
        "\1\60\1\145\1\162\1\143\1\137\1\145\1\143\1\145\1\160\1\141\1\164"+
        "\1\156\1\145\1\143\1\164\1\151\1\141\1\144\1\60\2\164\1\147\1\145"+
        "\1\163\1\164\1\145\1\151\1\164\1\141\1\156\1\155\1\145\1\154\1\172"+
        "\1\137\1\60\1\160\1\162\1\60\1\143\1\145\1\164\1\60\1\145\1\60\1"+
        "\137\1\164\1\156\1\143\1\163\1\141\2\162\1\145\1\156\1\60\1\166"+
        "\1\137\1\147\1\155\1\171\1\144\1\162\1\60\2\154\1\60\1\154\1\170"+
        "\1\162\1\164\2\145\2\143\1\145\1\157\1\164\1\137\1\145\1\171\1\60"+
        "\1\154\1\163\2\60\1\164\1\141\2\164\1\145\1\137\1\151\1\145\1\157"+
        "\1\uffff\1\145\1\165\1\uffff\1\141\1\164\1\151\1\143\1\uffff\1\145"+
        "\1\157\1\141\1\154\1\164\1\165\1\145\1\137\1\143\1\166\1\60\1\141"+
        "\1\146\1\137\1\145\1\60\1\145\1\137\1\141\1\151\1\141\1\144\1\141"+
        "\1\143\2\145\1\155\1\163\1\154\1\145\1\155\1\156\1\145\1\146\1\162"+
        "\1\160\1\144\1\60\1\145\1\164\1\145\1\60\1\156\1\144\1\60\1\164"+
        "\1\162\1\146\1\60\1\143\1\164\1\145\1\166\1\154\1\170\1\162\1\154"+
        "\2\141\2\163\2\154\1\157\1\154\1\145\1\151\1\171\1\143\1\156\1\143"+
        "\1\60\1\154\1\162\1\164\1\154\1\145\1\162\1\145\1\163\1\155\1\145"+
        "\1\60\1\141\1\163\1\145\1\60\1\155\1\157\1\141\1\145\1\137\1\162"+
        "\1\145\1\155\1\164\2\145\1\60\1\137\1\uffff\1\164\1\145\1\162\1"+
        "\145\1\141\1\160\2\137\1\162\1\156\1\145\1\163\1\151\1\141\1\143"+
        "\1\165\1\164\1\145\1\160\1\154\1\145\1\164\1\154\1\171\1\151\1\141"+
        "\1\145\1\165\1\143\1\141\1\160\1\163\1\145\1\156\1\162\1\163\1\156"+
        "\1\145\1\162\1\154\1\60\2\141\1\155\1\145\1\60\1\143\1\162\1\145"+
        "\1\157\1\144\2\60\2\162\1\144\1\145\1\141\1\143\1\60\1\151\1\164"+
        "\1\162\1\141\1\145\1\150\1\154\1\145\1\141\1\164\1\60\1\141\1\160"+
        "\1\163\1\164\1\162\1\145\1\154\2\164\1\151\1\156\1\164\1\141\1\60"+
        "\1\164\1\156\1\137\1\60\1\143\1\154\1\145\1\156\1\154\1\141\1\170"+
        "\1\162\1\60\1\141\2\145\1\170\1\164\1\145\1\157\1\145\1\141\1\164"+
        "\1\60\1\157\1\144\2\163\1\150\1\162\1\145\1\164\1\151\1\141\1\60"+
        "\1\141\2\151\1\157\1\164\1\60\1\164\1\60\1\164\1\163\1\143\1\60"+
        "\1\156\1\164\1\141\1\154\1\160\1\60\1\164\1\163\1\143\1\160\1\151"+
        "\1\137\1\156\1\162\1\164\1\151\1\144\1\163\1\60\1\163\1\157\1\141"+
        "\1\163\1\60\1\157\1\154\1\162\2\157\1\156\1\60\1\151\1\60\1\164"+
        "\1\145\1\164\1\60\1\162\1\60\1\162\1\151\1\163\1\154\1\162\1\157"+
        "\1\143\1\60\1\141\1\151\1\157\1\163\2\60\1\144\1\164\1\60\1\156"+
        "\1\60\1\141\2\156\1\60\1\157\1\141\1\163\1\60\1\141\1\145\1\157"+
        "\1\151\1\141\1\145\1\156\1\162\1\154\1\157\1\156\2\60\1\151\1\163"+
        "\1\164\1\60\1\163\1\156\1\164\1\163\1\164\1\163\1\156\1\157\1\162"+
        "\1\163\1\60\1\145\1\60\1\156\1\60\1\157\1\60\1\151\2\60\1\145\1"+
        "\60\1\151\1\163\1\60\1\156\1\141\1\163\1\141\1\60\1\156\1\157\1"+
        "\155\1\157\1\151\1\60\1\164\1\151\1\164\1\60\1\156\1\145\1\156\1"+
        "\157\1\151\1\157\1\151\1\60\1\156\1\60\1\156\1\157\1\156\1\157\1"+
        "\146\1\164\1\60\1\156\1\60\1\156\1\162\1\164\3\60\2\141\1\147\1"+
        "\164\1\155\2\145\1\155\1\156\1\145\1\164\1\156\1\60\1\164\1\60";
    static final String DFA24_maxS =
        "\1\175\1\167\1\151\2\163\1\uffff\1\71\1\157\1\141\2\157\1\162\1"+
        "\uffff\1\76\10\uffff\1\uffff\2\75\1\uffff\1\116\1\uffff\1\122\1"+
        "\162\3\75\1\57\1\157\1\141\1\171\1\157\1\170\1\165\1\145\1\151\1"+
        "\156\1\uffff\1\145\1\uffff\1\164\1\160\1\162\2\151\1\164\1\172\1"+
        "\144\3\172\1\160\3\uffff\1\156\1\141\1\164\1\141\1\163\1\170\1\156"+
        "\1\164\1\144\1\160\1\137\1\162\1\151\1\162\10\uffff\1\104\2\172"+
        "\1\145\11\uffff\1\170\1\162\1\160\1\162\1\171\1\164\1\154\1\162"+
        "\1\160\1\163\1\150\1\154\1\155\1\164\1\156\1\142\1\uffff\1\145\1"+
        "\172\1\145\1\164\1\151\1\164\1\162\1\154\1\150\1\151\1\uffff\1\172"+
        "\1\163\1\uffff\1\145\2\164\1\uffff\1\141\1\157\1\160\1\uffff\1\157"+
        "\1\164\1\163\1\143\1\164\1\162\3\172\1\150\1\151\1\164\1\141\1\154"+
        "\1\163\1\145\1\156\1\153\1\141\1\172\1\147\1\162\1\171\1\154\2\151"+
        "\1\145\1\157\1\163\1\156\1\137\1\141\1\154\1\145\1\137\1\162\1\145"+
        "\1\141\1\114\1\154\1\145\1\165\1\144\1\157\1\143\1\uffff\1\162\1"+
        "\145\1\164\1\156\1\143\2\145\1\172\1\147\1\164\1\162\1\151\1\141"+
        "\1\162\1\144\1\157\1\145\1\162\1\151\1\162\1\151\1\164\1\151\1\163"+
        "\1\150\1\137\1\141\3\uffff\1\157\1\146\1\150\1\165\1\141\1\164\1"+
        "\143\1\164\1\141\1\155\1\151\1\141\1\172\1\145\1\156\1\141\1\172"+
        "\1\167\2\137\1\163\1\154\1\144\1\172\1\163\1\145\1\137\1\156\1\151"+
        "\1\137\1\172\1\162\1\172\1\170\1\164\1\143\1\155\1\114\1\147\1\150"+
        "\1\172\1\137\1\uffff\1\156\1\141\1\146\1\145\1\141\1\156\2\145\1"+
        "\156\1\141\1\160\1\162\1\151\1\145\1\164\1\151\1\156\1\162\1\164"+
        "\2\137\1\145\1\143\1\144\1\151\1\172\1\154\1\162\1\141\1\164\1\172"+
        "\1\147\1\145\1\156\1\164\1\144\1\uffff\1\141\1\147\1\142\1\144\1"+
        "\uffff\1\156\1\145\1\163\1\164\1\114\1\137\1\164\2\163\1\143\1\156"+
        "\1\154\1\156\1\151\1\172\1\146\1\154\1\145\1\151\2\137\1\uffff\1"+
        "\163\1\155\1\164\1\141\1\162\1\154\1\143\1\156\1\164\2\163\1\162"+
        "\1\141\1\155\1\154\1\137\1\156\2\165\2\151\1\143\1\170\1\164\1\137"+
        "\1\145\1\uffff\1\164\1\151\1\164\1\157\1\uffff\1\145\1\164\1\172"+
        "\1\157\1\145\1\156\1\172\1\154\1\145\1\137\1\170\1\164\1\141\1\151"+
        "\1\144\1\141\1\163\1\164\2\145\1\151\1\137\1\156\1\uffff\1\151\1"+
        "\141\2\156\1\154\1\163\1\164\2\145\1\143\1\137\1\151\1\145\1\164"+
        "\1\171\1\164\1\163\1\145\1\155\1\151\2\144\1\163\1\145\1\143\1\157"+
        "\1\145\1\156\1\154\1\160\1\145\1\151\1\162\1\137\1\144\1\156\1\145"+
        "\1\162\1\172\1\145\1\162\1\143\1\137\1\145\1\143\1\145\1\160\1\141"+
        "\1\164\1\156\1\145\1\143\1\164\1\151\1\141\1\144\1\172\2\164\1\147"+
        "\1\145\1\163\1\164\1\145\1\151\1\164\1\141\1\156\1\155\1\145\1\154"+
        "\1\172\1\137\1\172\1\160\1\162\1\172\1\143\1\145\1\164\1\172\1\145"+
        "\1\172\1\137\1\164\1\156\1\143\1\163\1\141\2\162\1\145\1\156\1\172"+
        "\1\166\1\137\1\147\1\155\1\171\1\144\1\162\1\172\1\154\1\166\1\172"+
        "\1\154\1\170\1\162\1\164\2\145\2\143\1\145\1\157\1\164\1\137\1\145"+
        "\1\171\1\172\1\154\1\163\2\172\1\164\1\141\2\164\1\145\1\163\1\151"+
        "\1\145\1\157\1\uffff\1\145\1\165\1\uffff\1\141\1\164\1\151\1\143"+
        "\1\uffff\1\145\1\157\1\141\1\154\1\164\1\165\1\145\1\137\1\143\1"+
        "\166\1\172\1\141\1\164\1\137\1\145\1\172\1\145\1\163\1\141\1\151"+
        "\1\141\1\144\1\141\1\143\2\145\1\155\1\163\1\154\1\145\1\155\1\156"+
        "\1\145\1\146\1\162\1\160\1\144\1\172\1\145\1\164\1\145\1\172\1\156"+
        "\1\144\1\172\1\164\1\162\1\146\1\172\1\143\1\164\1\145\1\166\1\154"+
        "\1\170\1\162\1\154\2\141\2\163\2\154\1\157\1\154\1\145\1\151\1\171"+
        "\1\155\1\156\1\143\1\172\1\164\1\162\1\164\1\154\1\145\1\162\1\145"+
        "\1\163\1\155\1\145\1\172\1\141\1\163\1\145\1\172\1\155\1\157\1\141"+
        "\1\145\1\137\1\162\1\145\1\155\1\164\2\145\1\172\1\137\1\uffff\1"+
        "\164\1\145\1\162\1\145\1\141\1\160\2\137\1\162\1\156\1\145\1\163"+
        "\1\151\1\141\1\143\1\165\1\164\1\145\1\160\1\154\1\145\1\164\1\154"+
        "\1\171\1\151\1\141\1\145\1\165\1\143\1\141\1\160\1\163\1\145\1\156"+
        "\1\162\1\163\1\156\1\145\1\162\1\154\1\172\2\141\1\155\1\145\1\172"+
        "\1\143\1\162\1\145\1\157\1\144\2\172\2\162\1\144\1\145\1\141\1\143"+
        "\1\172\1\151\1\164\1\162\1\141\1\145\1\150\1\154\1\145\1\141\1\164"+
        "\1\172\1\141\1\160\1\163\1\164\1\162\1\145\1\154\2\164\1\151\1\156"+
        "\1\164\1\141\1\172\1\164\1\156\1\137\1\172\1\143\1\154\1\145\1\156"+
        "\1\154\1\141\1\170\1\162\1\172\1\141\2\145\1\170\1\164\1\145\1\157"+
        "\1\145\1\141\1\164\1\172\1\157\1\144\2\163\1\150\1\162\1\145\1\164"+
        "\1\151\1\141\1\172\1\141\2\151\1\157\1\164\1\172\1\164\1\172\1\164"+
        "\1\163\1\143\1\172\1\156\1\164\1\141\1\154\1\160\1\172\1\164\1\163"+
        "\1\143\1\160\1\151\1\137\1\156\1\162\1\164\1\151\1\144\1\163\1\172"+
        "\1\163\1\157\1\141\1\163\1\172\1\157\1\154\1\162\2\157\1\156\1\172"+
        "\1\151\1\172\1\164\1\145\1\164\1\172\1\162\1\172\1\162\1\151\1\163"+
        "\1\154\1\162\1\157\1\143\1\172\1\141\1\151\1\157\1\163\2\172\1\144"+
        "\1\164\1\172\1\156\1\172\1\141\2\156\1\172\1\157\1\141\1\163\1\172"+
        "\1\141\1\145\1\157\1\151\1\141\1\145\1\156\1\162\1\154\1\157\1\156"+
        "\2\172\1\151\1\163\1\164\1\172\1\163\1\156\1\164\1\163\1\164\1\163"+
        "\1\156\1\157\1\162\1\163\1\172\1\145\1\172\1\156\1\172\1\157\1\172"+
        "\1\151\2\172\1\145\1\172\1\151\1\163\1\172\1\156\1\141\1\163\1\141"+
        "\1\172\1\156\1\157\1\155\1\157\1\151\1\172\1\164\1\151\1\164\1\172"+
        "\1\156\1\145\1\156\1\157\1\151\1\157\1\151\1\172\1\156\1\172\1\156"+
        "\1\157\1\156\1\157\1\163\1\164\1\172\1\156\1\172\1\156\1\162\1\164"+
        "\3\172\2\141\1\147\1\164\1\155\2\145\1\155\1\156\1\145\1\164\1\156"+
        "\1\172\1\164\1\172";
    static final String DFA24_acceptS =
        "\5\uffff\1\10\6\uffff\1\23\1\uffff\1\25\1\26\1\27\1\30\1\31\1\32"+
        "\1\33\1\34\3\uffff\1\43\1\uffff\1\44\17\uffff\1\61\1\uffff\1\65"+
        "\14\uffff\1\35\1\11\1\64\16\uffff\1\24\1\52\1\36\1\63\1\37\1\42"+
        "\1\40\1\41\4\uffff\1\45\1\46\1\50\1\47\1\51\1\54\1\55\1\66\1\53"+
        "\20\uffff\1\62\12\uffff\1\4\2\uffff\1\6\3\uffff\1\7\3\uffff\1\15"+
        "\55\uffff\1\5\33\uffff\1\16\1\17\1\20\52\uffff\1\3\44\uffff\1\56"+
        "\4\uffff\1\57\25\uffff\1\2\32\uffff\1\21\4\uffff\1\22\27\uffff\1"+
        "\1\u0085\uffff\1\13\2\uffff\1\60\4\uffff\1\12\144\uffff\1\14\u0127"+
        "\uffff";
    static final String DFA24_specialS =
        "\26\uffff\1\0\u0379\uffff}>";
    static final String[] DFA24_transitionS = {
            "\2\55\2\uffff\1\55\22\uffff\1\55\1\36\1\26\3\uffff\1\31\1\uffff"+
            "\1\16\1\17\1\5\1\40\1\14\1\15\1\6\1\41\12\54\1\25\1\24\1\30"+
            "\1\37\1\27\2\uffff\1\32\15\53\1\34\13\53\1\22\1\uffff\1\23\1"+
            "\uffff\1\53\1\uffff\1\3\1\42\1\7\1\12\1\46\1\45\1\53\1\10\1"+
            "\4\1\53\1\51\1\53\1\11\1\47\1\35\1\13\1\53\1\50\1\1\1\44\1\52"+
            "\1\43\1\2\3\53\1\20\1\33\1\21",
            "\1\56\16\uffff\1\60\1\57\1\uffff\1\61",
            "\1\62\1\63",
            "\1\65\4\uffff\1\64",
            "\1\66\6\uffff\1\71\1\67\4\uffff\1\70",
            "",
            "\1\73\1\uffff\12\74",
            "\1\77\6\uffff\1\100\3\uffff\1\76\2\uffff\1\75",
            "\1\101",
            "\1\102\3\uffff\1\104\3\uffff\1\103\5\uffff\1\105",
            "\1\106\3\uffff\1\110\5\uffff\1\107",
            "\1\112\20\uffff\1\111",
            "",
            "\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\116",
            "\1\120",
            "\1\122",
            "",
            "\1\123",
            "",
            "\1\124",
            "\1\126\1\uffff\1\125",
            "\1\130",
            "\1\132",
            "\1\135\21\uffff\1\134",
            "\1\136",
            "\1\140",
            "\1\141",
            "\1\143\6\uffff\1\145\2\uffff\1\144\6\uffff\1\142",
            "\1\146\5\uffff\1\147",
            "\1\151\1\uffff\1\152\11\uffff\1\150",
            "\1\154\23\uffff\1\153",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\1\74\1\uffff\12\54\13\uffff\1\74\37\uffff\1\74",
            "",
            "\1\161\7\uffff\1\162",
            "\1\163",
            "\1\164\20\uffff\1\165",
            "\1\166",
            "\1\167\3\uffff\1\170",
            "\1\171",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\172\7\53",
            "\1\174",
            "\12\53\7\uffff\32\53\4\uffff\1\175\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u0080\11"+
            "\53\1\u0081\1\177\6\53",
            "\12\53\7\uffff\32\53\4\uffff\1\u0085\1\uffff\15\53\1\u0084"+
            "\1\53\1\u0083\12\53",
            "\1\u0087",
            "",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008b\1\u008a",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0094\2\uffff\1\u0093\11\uffff\1\u0092",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098\16\uffff\1\u0099",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u009b\21"+
            "\53",
            "\1\u009c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009d\12\uffff\1\u009e\10\uffff\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a4\3\uffff\1\u00a3\10\uffff\1\u00a2",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\6\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ad\3\uffff\1\u00ac",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00b5",
            "\1\u00b7\1\uffff\1\u00b6",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4\1\u00c5\1\uffff\1\u00c7\11\uffff\1\u00c6",
            "",
            "\1\u00c8",
            "\1\u00cb\16\uffff\1\u00ca\1\u00c9",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0101\12\uffff\1\u0100",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0107\2\uffff\1\u0106",
            "\1\u0108",
            "\1\u0109\20\uffff\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d\7\uffff\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\12\53\7\uffff\32\53\4\uffff\1\u0121\1\uffff\32\53",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\53\7\uffff\32\53\4\uffff\1\u0126\1\uffff\32\53",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0134",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137\3\uffff\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190\4\uffff\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "",
            "\1\u0197",
            "\1\u0198\3\uffff\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "",
            "\1\u019c",
            "\1\u019d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a9\2\uffff\1\u01a8",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1\4\uffff\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\12\53\7\uffff\32\53\4\uffff\1\u01d9\1\uffff\32\53",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01fc",
            "\1\u01fd",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0202",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u020e\7\53",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0216",
            "\1\u0217\11\uffff\1\u0218",
            "\12\53\7\uffff\32\53\4\uffff\1\u0219\1\uffff\32\53",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0228",
            "\1\u0229",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f\23\uffff\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "",
            "\1\u0234",
            "\1\u0235",
            "",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0244",
            "\1\u0246\6\uffff\1\u0245\6\uffff\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u024a",
            "\1\u024c\23\uffff\1\u024b",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0263",
            "\1\u0264",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c\11\uffff\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0281\7\uffff\1\u0280",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0299",
            "",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u030c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\1\u0320",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0321",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u032b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u032f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u033b",
            "\1\u033c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u033d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u033e",
            "\1\u033f",
            "\1\u0340",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\1\u0356",
            "\1\u0357",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u035c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u035d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u035e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u035f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0360",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0361",
            "\1\u0362",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0363",
            "\1\u0364",
            "\1\u0365",
            "\1\u0366",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0367",
            "\1\u0368",
            "\1\u0369",
            "\1\u036a",
            "\1\u036b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u036c",
            "\1\u036d",
            "\1\u036e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\12\53\7\uffff\32\53\4\uffff\1\u0376\1\uffff\32\53",
            "\1\u0377",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0378",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "\1\u037c\14\uffff\1\u037d",
            "\1\u037e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u037f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0380",
            "\1\u0381",
            "\1\u0382",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u038f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | WHERE | WITH | AS | SET | IF | IN | STAR | REPEATER | CONTAINS | ISPARENT | ISNODETYPE | IS | HAS | MAX | MIN | DEPTH | PRINT | COMMA | FILTER | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_SQ_BRACKET | RIGHT_SQ_BRACKET | SEMICOLON | COLON | PERIOD | DQOUTE | GT | LT | LTE | GTE | AND | OR | NOT | NOT_EQUAL | LOGIC_EQUALS | EQUALS | PLUS | MINUS | DIVIDE | COMPOUND_ADD | INCREMENT | NODE_TYPE | ATTRIBUTES | RESERVED_TYPES | ID | INTEGER | STRING | FLOAT | SPACE | LINE_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_22 = input.LA(1);

                        s = -1;
                        if ( ((LA24_22 >= '\u0000' && LA24_22 <= '\uFFFF')) ) {s = 78;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}