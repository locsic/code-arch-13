// $ANTLR 3.4 C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g 2014-05-18 09:56:49

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
    public static final int FOREACH=28;
    public static final int FOR_QUERY=29;
    public static final int FUNCTION=30;
    public static final int GT=31;
    public static final int GTE=32;
    public static final int HAS=33;
    public static final int HEX_DIGIT=34;
    public static final int ID=35;
    public static final int IF=36;
    public static final int IF_STATEMENT=37;
    public static final int IN=38;
    public static final int INCR=39;
    public static final int INCREMENT=40;
    public static final int INTEGER=41;
    public static final int IN_CLAUSE=42;
    public static final int IS=43;
    public static final int ISNODETYPE=44;
    public static final int ISPARENT=45;
    public static final int LEFT_BRACKET=46;
    public static final int LEFT_PAREN=47;
    public static final int LEFT_SQ_BRACKET=48;
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

    // $ANTLR start "FOREACH"
    public final void mFOREACH() throws RecognitionException {
        try {
            int _type = FOREACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:242:2: ( 'foreach' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:242:5: 'foreach'
            {
            match("foreach"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOREACH"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:245:2: ( 'select' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:245:5: 'select'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:248:2: ( 'where' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:248:4: 'where'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:251:2: ( 'with' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:251:4: 'with'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:254:2: ( 'as' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:254:4: 'as'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:257:2: ( 'set' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:257:4: 'set'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:260:2: ( 'if' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:260:4: 'if'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:262:4: ( 'in' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:262:6: 'in'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:265:2: ( '*' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:265:4: '*'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:268:2: ( PERIOD PERIOD PERIOD )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:268:4: PERIOD PERIOD PERIOD
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:271:2: ( 'contains' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:271:4: 'contains'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:274:2: ( 'isparent' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:274:4: 'isparent'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:277:2: ( 'isnodetype' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:277:4: 'isnodetype'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:279:4: ( 'is' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:279:6: 'is'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:281:5: ( 'has' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:281:7: 'has'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:283:5: ( 'max' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:283:7: 'max'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:285:5: ( 'min' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:285:7: 'min'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:287:7: ( 'depth' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:287:9: 'depth'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:290:2: ( 'print' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:290:4: 'print'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:292:7: ( ',' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:292:9: ','
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:295:2: ( '->' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:295:4: '->'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:299:2: ( '(' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:299:4: '('
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:302:2: ( ')' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:302:4: ')'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:305:2: ( '{' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:305:4: '{'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:308:2: ( '}' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:308:4: '}'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:311:2: ( '[' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:311:4: '['
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:314:2: ( ']' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:314:4: ']'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:317:2: ( ';' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:317:4: ';'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:320:2: ( ':' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:320:4: ':'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:323:2: ( '.' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:323:5: '.'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:326:8: ( '\"' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:326:10: '\"'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:328:5: ( '>' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:328:7: '>'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:330:5: ( '<' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:330:7: '<'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:332:5: ( LT EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:332:7: LT EQUALS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:334:5: ( GT EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:334:7: GT EQUALS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:336:5: ( '&&' | 'AND' | 'and' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:336:7: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:337:4: 'AND'
                    {
                    match("AND"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:338:4: 'and'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:340:4: ( '||' | 'OR' | 'or' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:340:6: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:341:4: 'OR'
                    {
                    match("OR"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:342:4: 'or'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:344:5: ( '!' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:344:7: '!'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:347:2: ( NOT EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:347:4: NOT EQUALS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:349:14: ( EQUALS EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:349:16: EQUALS EQUALS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:352:8: ( '=' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:352:10: '='
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:354:6: ( '+' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:354:8: '+'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:356:7: ( '-' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:356:9: '-'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:358:8: ( '/' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:358:10: '/'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:360:14: ( PLUS EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:360:16: PLUS EQUALS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:362:11: ( PLUS PLUS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:362:13: PLUS PLUS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:367:2: ( 'package_declaration' | 'body_declarations' | 'variable_declaration' | 'import_declaration' | 'type_declaration' | 'field_declaration' | 'method_declaration' | 'interface_declaration' | 'constructor_declaration' | 'class_declaration' | 'variable_declaration_fragment' | 'variable_declaration_statement' | 'thrown_exceptions' | 'try_statement' | 'catch_clause' | 'initializer' | 'method_invocation' | 'if_statement' | 'expression' | 'operator' | 'conditional_expression' | 'continue_expression' | 'assignment' | 'this_expression' | 'class_instance_creation' | 'field_access' | 'instance_of_expression' | 'cast_expression' | 'super_field_access' | 'statement' | 'then_statement' | 'else_statement' | 'do_statement' | 'parameters' | 'body' | 'for_statement' | 'enhanced_for_statement' | 'switch_statement' | 'while_statement' | 'null_literal' | 'integer_literal' | 'character_literal' | 'string_literal' | 'boolean_literal' | 'variable' | 'file' | 'directory' )
            int alt3=47;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:367:4: 'package_declaration'
                    {
                    match("package_declaration"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:368:4: 'body_declarations'
                    {
                    match("body_declarations"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:369:4: 'variable_declaration'
                    {
                    match("variable_declaration"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:370:4: 'import_declaration'
                    {
                    match("import_declaration"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:371:4: 'type_declaration'
                    {
                    match("type_declaration"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:372:4: 'field_declaration'
                    {
                    match("field_declaration"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:373:4: 'method_declaration'
                    {
                    match("method_declaration"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:374:4: 'interface_declaration'
                    {
                    match("interface_declaration"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:375:4: 'constructor_declaration'
                    {
                    match("constructor_declaration"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:376:4: 'class_declaration'
                    {
                    match("class_declaration"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:377:4: 'variable_declaration_fragment'
                    {
                    match("variable_declaration_fragment"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:378:4: 'variable_declaration_statement'
                    {
                    match("variable_declaration_statement"); 



                    }
                    break;
                case 13 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:379:4: 'thrown_exceptions'
                    {
                    match("thrown_exceptions"); 



                    }
                    break;
                case 14 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:380:4: 'try_statement'
                    {
                    match("try_statement"); 



                    }
                    break;
                case 15 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:381:4: 'catch_clause'
                    {
                    match("catch_clause"); 



                    }
                    break;
                case 16 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:382:4: 'initializer'
                    {
                    match("initializer"); 



                    }
                    break;
                case 17 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:383:4: 'method_invocation'
                    {
                    match("method_invocation"); 



                    }
                    break;
                case 18 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:384:4: 'if_statement'
                    {
                    match("if_statement"); 



                    }
                    break;
                case 19 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:385:4: 'expression'
                    {
                    match("expression"); 



                    }
                    break;
                case 20 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:386:4: 'operator'
                    {
                    match("operator"); 



                    }
                    break;
                case 21 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:387:4: 'conditional_expression'
                    {
                    match("conditional_expression"); 



                    }
                    break;
                case 22 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:388:4: 'continue_expression'
                    {
                    match("continue_expression"); 



                    }
                    break;
                case 23 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:389:4: 'assignment'
                    {
                    match("assignment"); 



                    }
                    break;
                case 24 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:390:4: 'this_expression'
                    {
                    match("this_expression"); 



                    }
                    break;
                case 25 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:391:4: 'class_instance_creation'
                    {
                    match("class_instance_creation"); 



                    }
                    break;
                case 26 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:392:4: 'field_access'
                    {
                    match("field_access"); 



                    }
                    break;
                case 27 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:393:4: 'instance_of_expression'
                    {
                    match("instance_of_expression"); 



                    }
                    break;
                case 28 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:394:4: 'cast_expression'
                    {
                    match("cast_expression"); 



                    }
                    break;
                case 29 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:395:4: 'super_field_access'
                    {
                    match("super_field_access"); 



                    }
                    break;
                case 30 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:396:4: 'statement'
                    {
                    match("statement"); 



                    }
                    break;
                case 31 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:397:4: 'then_statement'
                    {
                    match("then_statement"); 



                    }
                    break;
                case 32 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:398:4: 'else_statement'
                    {
                    match("else_statement"); 



                    }
                    break;
                case 33 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:399:4: 'do_statement'
                    {
                    match("do_statement"); 



                    }
                    break;
                case 34 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:400:4: 'parameters'
                    {
                    match("parameters"); 



                    }
                    break;
                case 35 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:401:4: 'body'
                    {
                    match("body"); 



                    }
                    break;
                case 36 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:402:4: 'for_statement'
                    {
                    match("for_statement"); 



                    }
                    break;
                case 37 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:403:4: 'enhanced_for_statement'
                    {
                    match("enhanced_for_statement"); 



                    }
                    break;
                case 38 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:404:4: 'switch_statement'
                    {
                    match("switch_statement"); 



                    }
                    break;
                case 39 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:405:4: 'while_statement'
                    {
                    match("while_statement"); 



                    }
                    break;
                case 40 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:406:4: 'null_literal'
                    {
                    match("null_literal"); 



                    }
                    break;
                case 41 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:407:4: 'integer_literal'
                    {
                    match("integer_literal"); 



                    }
                    break;
                case 42 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:408:4: 'character_literal'
                    {
                    match("character_literal"); 



                    }
                    break;
                case 43 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:409:4: 'string_literal'
                    {
                    match("string_literal"); 



                    }
                    break;
                case 44 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:410:4: 'boolean_literal'
                    {
                    match("boolean_literal"); 



                    }
                    break;
                case 45 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:411:4: 'variable'
                    {
                    match("variable"); 



                    }
                    break;
                case 46 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:412:4: 'file'
                    {
                    match("file"); 



                    }
                    break;
                case 47 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:413:4: 'directory'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:417:2: ( 'name' | 'type' | 'return_type' | 'parameter_types' | 'is_constructor' | 'is_deprecated' | 'is_parameter' | 'is_field' | 'default_value' | 'modifiers' | 'origin' | 'kind' | 'declared_methods' | 'declared_fields' | 'declared_types' | 'declaring_class' | 'declaring_method' | 'package' | 'interfaces' | 'superclass' | 'boxing' | 'unboxing' | 'parameter_list' | 'modifier' | 'startLine' | 'endLine' | 'totalLines' | 'boolean_value' )
            int alt4=28;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:417:4: 'name'
                    {
                    match("name"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:418:4: 'type'
                    {
                    match("type"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:419:4: 'return_type'
                    {
                    match("return_type"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:420:4: 'parameter_types'
                    {
                    match("parameter_types"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:421:4: 'is_constructor'
                    {
                    match("is_constructor"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:422:4: 'is_deprecated'
                    {
                    match("is_deprecated"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:423:4: 'is_parameter'
                    {
                    match("is_parameter"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:424:4: 'is_field'
                    {
                    match("is_field"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:425:4: 'default_value'
                    {
                    match("default_value"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:426:4: 'modifiers'
                    {
                    match("modifiers"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:427:4: 'origin'
                    {
                    match("origin"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:428:4: 'kind'
                    {
                    match("kind"); 



                    }
                    break;
                case 13 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:429:4: 'declared_methods'
                    {
                    match("declared_methods"); 



                    }
                    break;
                case 14 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:430:4: 'declared_fields'
                    {
                    match("declared_fields"); 



                    }
                    break;
                case 15 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:431:4: 'declared_types'
                    {
                    match("declared_types"); 



                    }
                    break;
                case 16 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:432:4: 'declaring_class'
                    {
                    match("declaring_class"); 



                    }
                    break;
                case 17 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:433:4: 'declaring_method'
                    {
                    match("declaring_method"); 



                    }
                    break;
                case 18 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:434:4: 'package'
                    {
                    match("package"); 



                    }
                    break;
                case 19 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:435:4: 'interfaces'
                    {
                    match("interfaces"); 



                    }
                    break;
                case 20 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:436:4: 'superclass'
                    {
                    match("superclass"); 



                    }
                    break;
                case 21 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:437:4: 'boxing'
                    {
                    match("boxing"); 



                    }
                    break;
                case 22 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:438:4: 'unboxing'
                    {
                    match("unboxing"); 



                    }
                    break;
                case 23 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:439:4: 'parameter_list'
                    {
                    match("parameter_list"); 



                    }
                    break;
                case 24 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:440:4: 'modifier'
                    {
                    match("modifier"); 



                    }
                    break;
                case 25 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:441:4: 'startLine'
                    {
                    match("startLine"); 



                    }
                    break;
                case 26 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:442:4: 'endLine'
                    {
                    match("endLine"); 



                    }
                    break;
                case 27 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:443:4: 'totalLines'
                    {
                    match("totalLines"); 



                    }
                    break;
                case 28 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:444:4: 'boolean_value'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:447:2: ( 'is_class' | 'is_primitive' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:447:4: 'is_class'
                    {
                    match("is_class"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:448:4: 'is_primitive'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:452:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:452:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:452:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:455:9: ( ( '0' .. '9' )+ )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:455:11: ( '0' .. '9' )+
            {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:455:11: ( '0' .. '9' )+
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:458:9: ( '\"' ( . )* '\"' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:458:11: '\"' ( . )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:458:15: ( . )*
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
            	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:458:15: .
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:462:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:462:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:462:9: ( '0' .. '9' )+
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

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:462:25: ( '0' .. '9' )*
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


                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:462:37: ( EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:462:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:463:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:463:13: ( '0' .. '9' )+
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


                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:463:25: ( EXPONENT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:463:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:464:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:464:9: ( '0' .. '9' )+
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:469:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:469:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:469:22: ( '+' | '-' )?
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


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:469:33: ( '0' .. '9' )+
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:472:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:476:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:476:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:477:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:478:9: OCTAL_ESC
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:483:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:483:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:484:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:485:9: '\\\\' ( '0' .. '7' )
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:490:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:490:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:492:8: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:492:10: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:492:10: ( ' ' | '\\t' | '\\r' | '\\n' )+
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

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:8: ( FOREACH | SELECT | WHERE | WITH | AS | SET | IF | IN | STAR | REPEATER | CONTAINS | ISPARENT | ISNODETYPE | IS | HAS | MAX | MIN | DEPTH | PRINT | COMMA | FILTER | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_SQ_BRACKET | RIGHT_SQ_BRACKET | SEMICOLON | COLON | PERIOD | DQOUTE | GT | LT | LTE | GTE | AND | OR | NOT | NOT_EQUAL | LOGIC_EQUALS | EQUALS | PLUS | MINUS | DIVIDE | COMPOUND_ADD | INCREMENT | NODE_TYPE | ATTRIBUTES | RESERVED_TYPES | ID | INTEGER | STRING | FLOAT | SPACE )
        int alt21=54;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:10: FOREACH
                {
                mFOREACH(); 


                }
                break;
            case 2 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:18: SELECT
                {
                mSELECT(); 


                }
                break;
            case 3 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:25: WHERE
                {
                mWHERE(); 


                }
                break;
            case 4 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:31: WITH
                {
                mWITH(); 


                }
                break;
            case 5 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:36: AS
                {
                mAS(); 


                }
                break;
            case 6 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:39: SET
                {
                mSET(); 


                }
                break;
            case 7 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:43: IF
                {
                mIF(); 


                }
                break;
            case 8 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:46: IN
                {
                mIN(); 


                }
                break;
            case 9 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:49: STAR
                {
                mSTAR(); 


                }
                break;
            case 10 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:54: REPEATER
                {
                mREPEATER(); 


                }
                break;
            case 11 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:63: CONTAINS
                {
                mCONTAINS(); 


                }
                break;
            case 12 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:72: ISPARENT
                {
                mISPARENT(); 


                }
                break;
            case 13 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:81: ISNODETYPE
                {
                mISNODETYPE(); 


                }
                break;
            case 14 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:92: IS
                {
                mIS(); 


                }
                break;
            case 15 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:95: HAS
                {
                mHAS(); 


                }
                break;
            case 16 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:99: MAX
                {
                mMAX(); 


                }
                break;
            case 17 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:103: MIN
                {
                mMIN(); 


                }
                break;
            case 18 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:107: DEPTH
                {
                mDEPTH(); 


                }
                break;
            case 19 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:113: PRINT
                {
                mPRINT(); 


                }
                break;
            case 20 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:119: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 21 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:125: FILTER
                {
                mFILTER(); 


                }
                break;
            case 22 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:132: LEFT_PAREN
                {
                mLEFT_PAREN(); 


                }
                break;
            case 23 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:143: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 


                }
                break;
            case 24 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:155: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 


                }
                break;
            case 25 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:168: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 


                }
                break;
            case 26 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:182: LEFT_SQ_BRACKET
                {
                mLEFT_SQ_BRACKET(); 


                }
                break;
            case 27 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:198: RIGHT_SQ_BRACKET
                {
                mRIGHT_SQ_BRACKET(); 


                }
                break;
            case 28 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:215: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 29 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:225: COLON
                {
                mCOLON(); 


                }
                break;
            case 30 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:231: PERIOD
                {
                mPERIOD(); 


                }
                break;
            case 31 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:238: DQOUTE
                {
                mDQOUTE(); 


                }
                break;
            case 32 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:245: GT
                {
                mGT(); 


                }
                break;
            case 33 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:248: LT
                {
                mLT(); 


                }
                break;
            case 34 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:251: LTE
                {
                mLTE(); 


                }
                break;
            case 35 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:255: GTE
                {
                mGTE(); 


                }
                break;
            case 36 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:259: AND
                {
                mAND(); 


                }
                break;
            case 37 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:263: OR
                {
                mOR(); 


                }
                break;
            case 38 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:266: NOT
                {
                mNOT(); 


                }
                break;
            case 39 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:270: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 40 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:280: LOGIC_EQUALS
                {
                mLOGIC_EQUALS(); 


                }
                break;
            case 41 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:293: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 42 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:300: PLUS
                {
                mPLUS(); 


                }
                break;
            case 43 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:305: MINUS
                {
                mMINUS(); 


                }
                break;
            case 44 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:311: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 45 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:318: COMPOUND_ADD
                {
                mCOMPOUND_ADD(); 


                }
                break;
            case 46 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:331: INCREMENT
                {
                mINCREMENT(); 


                }
                break;
            case 47 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:341: NODE_TYPE
                {
                mNODE_TYPE(); 


                }
                break;
            case 48 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:351: ATTRIBUTES
                {
                mATTRIBUTES(); 


                }
                break;
            case 49 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:362: RESERVED_TYPES
                {
                mRESERVED_TYPES(); 


                }
                break;
            case 50 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:377: ID
                {
                mID(); 


                }
                break;
            case 51 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:380: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 52 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:388: STRING
                {
                mSTRING(); 


                }
                break;
            case 53 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:395: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 54 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:401: SPACE
                {
                mSPACE(); 


                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA21 dfa21 = new DFA21(this);
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
            return "366:1: NODE_TYPE : ( 'package_declaration' | 'body_declarations' | 'variable_declaration' | 'import_declaration' | 'type_declaration' | 'field_declaration' | 'method_declaration' | 'interface_declaration' | 'constructor_declaration' | 'class_declaration' | 'variable_declaration_fragment' | 'variable_declaration_statement' | 'thrown_exceptions' | 'try_statement' | 'catch_clause' | 'initializer' | 'method_invocation' | 'if_statement' | 'expression' | 'operator' | 'conditional_expression' | 'continue_expression' | 'assignment' | 'this_expression' | 'class_instance_creation' | 'field_access' | 'instance_of_expression' | 'cast_expression' | 'super_field_access' | 'statement' | 'then_statement' | 'else_statement' | 'do_statement' | 'parameters' | 'body' | 'for_statement' | 'enhanced_for_statement' | 'switch_statement' | 'while_statement' | 'null_literal' | 'integer_literal' | 'character_literal' | 'string_literal' | 'boolean_literal' | 'variable' | 'file' | 'directory' );";
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
            return "416:1: ATTRIBUTES : ( 'name' | 'type' | 'return_type' | 'parameter_types' | 'is_constructor' | 'is_deprecated' | 'is_parameter' | 'is_field' | 'default_value' | 'modifiers' | 'origin' | 'kind' | 'declared_methods' | 'declared_fields' | 'declared_types' | 'declaring_class' | 'declaring_method' | 'package' | 'interfaces' | 'superclass' | 'boxing' | 'unboxing' | 'parameter_list' | 'modifier' | 'startLine' | 'endLine' | 'totalLines' | 'boolean_value' );";
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
            return "461:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\5\53\1\uffff\1\74\5\53\1\uffff\1\116\10\uffff\1\117\1\121"+
        "\1\123\1\uffff\1\53\1\uffff\2\53\1\131\1\133\1\135\1\uffff\10\53"+
        "\1\uffff\1\156\1\uffff\10\53\1\174\1\53\1\177\1\u0083\1\u0087\1"+
        "\53\3\uffff\16\53\10\uffff\1\53\2\34\1\53\7\uffff\16\53\1\uffff"+
        "\4\53\1\u00b6\10\53\1\uffff\1\32\1\53\1\uffff\3\53\1\uffff\3\53"+
        "\1\uffff\6\53\1\u00d2\1\u00d3\1\u00d4\12\53\1\32\30\53\1\u00f7\1"+
        "\53\1\uffff\7\53\1\u0100\23\53\3\uffff\14\53\1\u00f7\3\53\1\u0129"+
        "\12\53\1\u0129\1\53\1\u0129\4\53\1\uffff\6\53\1\u0140\1\53\1\uffff"+
        "\31\53\1\u015b\4\53\1\u0160\11\53\1\uffff\17\53\1\u017a\6\53\1\uffff"+
        "\32\53\1\uffff\4\53\1\uffff\2\53\1\u0129\3\53\1\u0129\16\53\1\u01b4"+
        "\3\53\1\uffff\46\53\1\u0129\16\53\1\u0129\3\53\1\uffff\20\53\1\u0201"+
        "\2\53\1\u0204\3\53\1\u0129\1\53\1\u0209\12\53\1\u0129\7\53\1\u00f7"+
        "\2\53\1\u00f7\13\53\1\u0129\5\53\1\u00f7\1\u0129\11\53\1\uffff\2"+
        "\53\1\uffff\4\53\1\uffff\12\53\1\u0129\4\53\1\u00f7\25\53\1\u0129"+
        "\3\53\1\u00f7\2\53\1\u0129\3\53\1\u026e\26\53\1\u00f7\12\53\1\u0129"+
        "\1\u00f7\16\53\1\u00f7\1\53\1\uffff\45\53\1\u0129\2\53\1\u00f7\4"+
        "\53\1\u00f7\5\53\1\u0129\1\u0204\6\53\1\u00f7\12\53\1\u00f7\16\53"+
        "\2\u00f7\11\53\1\u0129\12\53\1\u0129\12\53\1\u0129\5\53\1\u00f7"+
        "\4\53\1\u00f7\5\53\1\u0129\14\53\1\u0129\4\53\1\u0129\6\53\2\u00f7"+
        "\4\53\1\u00f7\1\53\1\u00f7\7\53\1\u00f7\4\53\2\u0129\2\53\1\u0129"+
        "\1\53\1\u00f7\3\53\1\u00f7\3\53\1\u00f7\13\53\2\u0129\3\53\1\u00f7"+
        "\2\53\1\u00f7\7\53\1\u00f7\1\53\1\u00f7\1\53\1\u00f7\1\53\1\u00f7"+
        "\1\53\1\u00f7\1\53\1\u00f7\2\53\1\u00f7\4\53\1\u00f7\5\53\1\u00f7"+
        "\3\53\1\u00f7\7\53\1\u00f7\1\53\1\u00f7\6\53\1\u00f7\1\53\1\u00f7"+
        "\3\53\3\u00f7\14\53\1\u00f7\1\53\1\u00f7";
    static final String DFA21_eofS =
        "\u0393\uffff";
    static final String DFA21_minS =
        "\1\11\1\151\1\145\1\150\1\156\1\146\1\uffff\1\56\3\141\1\145\1\141"+
        "\1\uffff\1\76\10\uffff\1\0\2\75\1\uffff\1\116\1\uffff\1\122\1\160"+
        "\2\75\1\53\1\uffff\1\157\1\141\1\150\1\154\1\141\1\145\1\151\1\156"+
        "\1\uffff\1\56\1\uffff\1\162\1\145\1\154\1\160\1\141\1\151\1\145"+
        "\1\164\1\60\1\144\3\60\1\160\3\uffff\1\156\1\141\1\163\1\141\1\163"+
        "\1\170\1\156\1\164\1\144\1\143\1\137\1\162\1\151\1\143\10\uffff"+
        "\1\104\2\60\1\145\7\uffff\1\144\1\162\1\160\1\145\1\171\1\164\1"+
        "\160\1\163\1\144\1\154\1\155\1\164\1\156\1\142\1\uffff\1\137\1\154"+
        "\2\145\1\60\1\145\1\162\1\151\1\164\1\162\1\154\1\150\1\151\1\uffff"+
        "\1\60\1\163\1\uffff\1\145\2\164\1\uffff\1\141\1\157\1\143\1\uffff"+
        "\1\157\1\144\1\163\1\143\1\164\1\162\3\60\1\150\1\151\1\164\1\141"+
        "\1\154\1\163\1\145\1\156\1\153\1\141\1\60\1\147\1\162\1\171\1\154"+
        "\2\151\1\145\1\157\1\163\1\156\1\137\1\141\1\162\1\145\1\141\1\114"+
        "\1\154\1\145\1\165\1\144\1\157\1\141\1\163\1\144\1\60\1\143\1\uffff"+
        "\1\162\1\145\1\164\1\156\1\143\2\145\1\60\1\147\1\164\1\147\1\151"+
        "\1\141\1\162\1\144\1\154\1\145\1\141\1\151\1\162\1\141\1\164\1\151"+
        "\1\163\1\150\1\137\1\141\3\uffff\1\157\1\146\1\150\1\165\1\141\1"+
        "\164\1\143\1\164\1\141\1\155\1\151\1\141\1\60\1\145\1\156\1\141"+
        "\1\60\1\167\2\137\1\163\1\154\1\145\1\137\1\156\1\151\1\137\1\60"+
        "\1\162\1\60\1\170\1\143\1\164\1\137\1\uffff\1\164\1\137\1\155\1"+
        "\114\1\147\1\150\1\60\1\137\1\uffff\1\156\1\141\1\146\1\145\1\141"+
        "\1\156\2\145\1\156\1\141\1\160\1\162\1\151\1\145\1\164\1\151\1\156"+
        "\1\162\1\164\2\137\1\145\1\143\1\144\1\151\1\60\1\154\1\162\1\141"+
        "\1\164\1\60\1\147\1\145\1\156\1\164\1\144\1\141\1\147\1\142\1\144"+
        "\1\uffff\1\156\1\145\1\163\1\164\1\114\2\163\1\143\1\156\1\154\1"+
        "\156\1\151\1\150\2\141\1\60\1\146\1\154\1\145\1\151\2\137\1\uffff"+
        "\1\163\1\155\1\164\1\141\1\162\1\154\1\143\1\156\1\164\2\163\1\162"+
        "\1\141\1\155\1\154\1\137\1\156\2\165\1\151\1\144\1\143\1\170\1\164"+
        "\1\137\1\145\1\uffff\1\164\1\145\1\164\1\157\1\uffff\1\145\1\164"+
        "\1\60\1\157\1\145\1\156\1\60\1\154\1\145\1\137\1\170\1\164\1\141"+
        "\1\151\1\163\1\164\2\145\1\151\1\137\1\156\1\60\1\164\1\145\1\143"+
        "\1\uffff\1\151\1\141\2\156\1\154\1\163\1\164\2\145\1\143\1\137\1"+
        "\151\1\145\1\164\1\171\1\164\1\163\1\145\1\155\1\151\2\144\1\163"+
        "\1\145\1\143\1\157\1\145\1\156\1\154\1\160\1\145\1\144\1\162\1\137"+
        "\1\144\1\156\1\145\1\162\1\60\1\145\1\162\1\143\1\137\1\145\1\143"+
        "\1\145\1\160\1\141\1\164\1\156\1\151\1\141\1\144\1\60\2\164\1\147"+
        "\1\uffff\1\145\2\143\1\145\1\163\1\164\1\145\1\151\1\164\1\141\1"+
        "\156\1\155\1\145\1\154\1\172\1\137\1\60\1\160\1\162\1\60\1\143\1"+
        "\145\1\164\1\60\1\145\1\60\1\137\1\164\1\156\1\143\1\163\1\141\2"+
        "\162\1\145\1\156\1\60\1\166\1\137\1\147\1\155\1\171\1\144\1\162"+
        "\1\60\2\154\1\60\1\154\1\170\1\162\1\164\2\145\1\157\1\164\1\137"+
        "\1\145\1\171\1\60\1\155\1\154\1\145\1\154\1\163\2\60\1\164\1\141"+
        "\2\164\1\145\1\137\1\151\1\145\1\157\1\uffff\1\145\1\165\1\uffff"+
        "\1\141\1\164\1\151\1\143\1\uffff\1\145\1\157\1\141\1\154\1\164\1"+
        "\165\1\145\1\137\1\143\1\166\1\60\1\141\1\146\1\137\1\145\1\60\1"+
        "\145\1\137\1\141\1\151\1\141\1\144\1\141\1\143\2\145\1\155\1\163"+
        "\1\156\1\145\1\146\1\162\1\160\1\145\1\141\1\163\1\144\1\60\1\145"+
        "\1\164\1\145\1\60\1\156\1\144\1\60\1\164\1\162\1\146\1\60\1\143"+
        "\1\164\1\145\1\166\1\154\1\170\1\162\1\154\2\141\2\163\2\154\1\157"+
        "\1\154\1\145\1\151\1\171\1\143\1\156\1\143\1\60\1\154\1\162\1\164"+
        "\1\154\1\145\1\162\1\145\1\163\1\155\1\145\2\60\1\155\1\157\1\141"+
        "\1\145\1\156\1\162\1\163\1\137\1\162\1\145\1\155\1\164\2\145\1\60"+
        "\1\137\1\uffff\1\164\1\145\1\162\1\145\1\141\1\160\2\137\1\162\1"+
        "\156\1\145\1\163\1\151\1\141\1\143\1\165\1\164\1\145\1\160\1\154"+
        "\1\145\1\164\1\154\1\171\1\151\1\141\1\145\1\165\1\143\1\141\1\160"+
        "\1\163\1\145\1\156\1\145\1\162\1\154\1\60\1\164\1\141\1\60\2\141"+
        "\1\155\1\145\1\60\1\143\1\162\1\145\1\157\1\144\2\60\2\162\1\144"+
        "\1\145\1\141\1\143\1\60\1\151\1\164\1\162\1\141\1\145\1\150\1\154"+
        "\1\145\1\141\1\164\1\60\1\141\1\160\1\163\1\164\1\162\1\145\1\154"+
        "\2\164\1\151\1\156\1\164\1\156\1\137\2\60\1\164\1\143\1\154\1\145"+
        "\1\156\1\154\1\141\1\170\1\162\1\60\1\141\2\145\1\170\1\164\1\145"+
        "\1\157\1\145\1\141\1\164\1\60\1\157\1\144\2\163\1\150\1\162\1\145"+
        "\1\164\1\151\1\141\1\60\1\141\2\151\1\157\1\164\1\60\1\164\1\163"+
        "\1\151\1\143\1\60\1\156\1\164\1\141\1\154\1\160\1\60\1\164\1\163"+
        "\1\143\1\160\1\151\1\137\1\156\1\162\1\164\1\151\1\144\1\163\1\60"+
        "\1\163\1\157\1\141\1\163\1\60\1\157\1\154\1\162\2\157\1\156\2\60"+
        "\1\164\1\157\1\145\1\164\1\60\1\162\1\60\1\162\1\151\1\163\1\154"+
        "\1\162\1\157\1\143\1\60\1\141\1\151\1\157\1\163\2\60\1\144\1\164"+
        "\1\60\1\156\1\60\1\141\2\156\1\60\1\141\1\156\1\163\1\60\1\141\1"+
        "\145\1\157\1\151\1\141\1\145\1\156\1\162\1\154\1\157\1\156\2\60"+
        "\1\151\1\163\1\164\1\60\1\163\1\164\1\60\1\163\1\164\1\163\1\156"+
        "\1\157\1\162\1\163\1\60\1\145\1\60\1\156\1\60\1\157\1\60\1\151\1"+
        "\60\1\145\1\60\1\151\1\163\1\60\1\156\1\141\1\163\1\141\1\60\1\156"+
        "\1\157\1\155\1\157\1\151\1\60\1\164\1\151\1\164\1\60\1\156\1\145"+
        "\1\156\1\157\1\151\1\157\1\151\1\60\1\156\1\60\1\156\1\157\1\156"+
        "\1\157\1\146\1\164\1\60\1\156\1\60\1\156\1\162\1\164\3\60\2\141"+
        "\1\147\1\164\1\155\2\145\1\155\1\156\1\145\1\164\1\156\1\60\1\164"+
        "\1\60";
    static final String DFA21_maxS =
        "\1\175\1\157\1\167\1\151\2\163\1\uffff\1\71\1\157\1\141\2\157\1"+
        "\162\1\uffff\1\76\10\uffff\1\uffff\2\75\1\uffff\1\116\1\uffff\1"+
        "\122\1\162\3\75\1\uffff\1\157\1\141\1\171\1\170\1\165\1\145\1\151"+
        "\1\156\1\uffff\1\145\1\uffff\1\162\1\154\1\164\1\160\1\162\2\151"+
        "\1\164\1\172\1\144\3\172\1\160\3\uffff\1\156\1\141\1\164\1\141\1"+
        "\163\1\170\1\156\1\164\1\144\1\160\1\137\1\162\1\151\1\162\10\uffff"+
        "\1\104\2\172\1\145\7\uffff\1\170\1\162\1\160\1\162\1\171\1\164\1"+
        "\160\1\163\1\150\1\154\1\155\1\164\1\156\1\142\1\uffff\1\145\1\154"+
        "\2\145\1\172\1\145\1\164\1\151\1\164\1\162\1\154\1\150\1\151\1\uffff"+
        "\1\172\1\163\1\uffff\1\145\2\164\1\uffff\1\141\1\157\1\160\1\uffff"+
        "\1\157\1\164\1\163\1\143\1\164\1\162\3\172\1\150\1\151\1\164\1\141"+
        "\1\154\1\163\1\145\1\156\1\153\1\141\1\172\1\147\1\162\1\171\1\154"+
        "\2\151\1\145\1\157\1\163\1\156\1\137\1\141\1\162\1\145\1\141\1\114"+
        "\1\154\1\145\1\165\1\144\1\157\1\141\1\163\1\144\1\172\1\143\1\uffff"+
        "\1\162\1\145\1\164\1\156\1\143\2\145\1\172\1\147\1\164\1\162\1\151"+
        "\1\141\1\162\1\144\1\157\1\145\1\162\1\151\1\162\1\151\1\164\1\151"+
        "\1\163\1\150\1\137\1\141\3\uffff\1\157\1\146\1\150\1\165\1\141\1"+
        "\164\1\143\1\164\1\141\1\155\1\151\1\141\1\172\1\145\1\156\1\141"+
        "\1\172\1\167\2\137\1\163\1\154\1\145\1\137\1\156\1\151\1\137\1\172"+
        "\1\162\1\172\1\170\1\143\1\164\1\137\1\uffff\1\164\1\143\1\155\1"+
        "\114\1\147\1\150\1\172\1\137\1\uffff\1\156\1\141\1\146\1\145\1\141"+
        "\1\156\2\145\1\156\1\141\1\160\1\162\1\151\1\145\1\164\1\151\1\156"+
        "\1\162\1\164\2\137\1\145\1\143\1\144\1\151\1\172\1\154\1\162\1\141"+
        "\1\164\1\172\1\147\1\145\1\156\1\164\1\144\1\141\1\147\1\142\1\144"+
        "\1\uffff\1\156\1\145\1\163\1\164\1\114\2\163\1\143\1\156\1\154\1"+
        "\156\1\151\1\150\1\141\1\144\1\172\1\146\1\154\1\145\1\151\2\137"+
        "\1\uffff\1\163\1\155\1\164\1\141\1\162\1\154\1\143\1\156\1\164\2"+
        "\163\1\162\1\141\1\155\1\154\1\137\1\156\2\165\2\151\1\143\1\170"+
        "\1\164\1\137\1\145\1\uffff\1\164\1\151\1\164\1\157\1\uffff\1\145"+
        "\1\164\1\172\1\157\1\145\1\156\1\172\1\154\1\145\1\137\1\170\1\164"+
        "\1\141\1\151\1\163\1\164\2\145\1\151\1\137\1\156\1\172\1\164\1\145"+
        "\1\143\1\uffff\1\151\1\141\2\156\1\154\1\163\1\164\2\145\1\143\1"+
        "\137\1\151\1\145\1\164\1\171\1\164\1\163\1\145\1\155\1\151\2\144"+
        "\1\163\1\145\1\143\1\157\1\145\1\156\1\154\1\160\1\145\1\151\1\162"+
        "\1\137\1\144\1\156\1\145\1\162\1\172\1\145\1\162\1\143\1\137\1\145"+
        "\1\143\1\145\1\160\1\141\1\164\1\156\1\151\1\141\1\144\1\172\2\164"+
        "\1\147\1\uffff\1\145\2\143\1\145\1\163\1\164\1\145\1\151\1\164\1"+
        "\141\1\156\1\155\1\145\1\154\1\172\1\137\1\172\1\160\1\162\1\172"+
        "\1\143\1\145\1\164\1\172\1\145\1\172\1\137\1\164\1\156\1\143\1\163"+
        "\1\141\2\162\1\145\1\156\1\172\1\166\1\137\1\147\1\155\1\171\1\144"+
        "\1\162\1\172\1\154\1\166\1\172\1\154\1\170\1\162\1\164\2\145\1\157"+
        "\1\164\1\137\1\145\1\171\1\172\1\155\1\154\1\145\1\154\1\163\2\172"+
        "\1\164\1\141\2\164\1\145\1\163\1\151\1\145\1\157\1\uffff\1\145\1"+
        "\165\1\uffff\1\141\1\164\1\151\1\143\1\uffff\1\145\1\157\1\141\1"+
        "\154\1\164\1\165\1\145\1\137\1\143\1\166\1\172\1\141\1\164\1\137"+
        "\1\145\1\172\1\145\1\163\1\141\1\151\1\141\1\144\1\141\1\143\2\145"+
        "\1\155\1\163\1\156\1\145\1\146\1\162\1\160\1\145\1\141\1\163\1\144"+
        "\1\172\1\145\1\164\1\145\1\172\1\156\1\144\1\172\1\164\1\162\1\146"+
        "\1\172\1\143\1\164\1\145\1\166\1\154\1\170\1\162\1\154\2\141\2\163"+
        "\2\154\1\157\1\154\1\145\1\151\1\171\1\155\1\156\1\143\1\172\1\164"+
        "\1\162\1\164\1\154\1\145\1\162\1\145\1\163\1\155\1\145\2\172\1\155"+
        "\1\157\1\141\1\145\1\156\1\162\1\163\1\137\1\162\1\145\1\155\1\164"+
        "\2\145\1\172\1\137\1\uffff\1\164\1\145\1\162\1\145\1\141\1\160\2"+
        "\137\1\162\1\156\1\145\1\163\1\151\1\141\1\143\1\165\1\164\1\145"+
        "\1\160\1\154\1\145\1\164\1\154\1\171\1\151\1\141\1\145\1\165\1\143"+
        "\1\141\1\160\1\163\1\145\1\156\1\145\1\162\1\154\1\172\1\164\1\141"+
        "\1\172\2\141\1\155\1\145\1\172\1\143\1\162\1\145\1\157\1\144\2\172"+
        "\2\162\1\144\1\145\1\141\1\143\1\172\1\151\1\164\1\162\1\141\1\145"+
        "\1\150\1\154\1\145\1\141\1\164\1\172\1\141\1\160\1\163\1\164\1\162"+
        "\1\145\1\154\2\164\1\151\1\156\1\164\1\156\1\137\2\172\1\164\1\143"+
        "\1\154\1\145\1\156\1\154\1\141\1\170\1\162\1\172\1\141\2\145\1\170"+
        "\1\164\1\145\1\157\1\145\1\141\1\164\1\172\1\157\1\144\2\163\1\150"+
        "\1\162\1\145\1\164\1\151\1\141\1\172\1\141\2\151\1\157\1\164\1\172"+
        "\1\164\1\163\1\151\1\143\1\172\1\156\1\164\1\141\1\154\1\160\1\172"+
        "\1\164\1\163\1\143\1\160\1\151\1\137\1\156\1\162\1\164\1\151\1\144"+
        "\1\163\1\172\1\163\1\157\1\141\1\163\1\172\1\157\1\154\1\162\2\157"+
        "\1\156\2\172\1\164\1\157\1\145\1\164\1\172\1\162\1\172\1\162\1\151"+
        "\1\163\1\154\1\162\1\157\1\143\1\172\1\141\1\151\1\157\1\163\2\172"+
        "\1\144\1\164\1\172\1\156\1\172\1\141\2\156\1\172\1\141\1\156\1\163"+
        "\1\172\1\141\1\145\1\157\1\151\1\141\1\145\1\156\1\162\1\154\1\157"+
        "\1\156\2\172\1\151\1\163\1\164\1\172\1\163\1\164\1\172\1\163\1\164"+
        "\1\163\1\156\1\157\1\162\1\163\1\172\1\145\1\172\1\156\1\172\1\157"+
        "\1\172\1\151\1\172\1\145\1\172\1\151\1\163\1\172\1\156\1\141\1\163"+
        "\1\141\1\172\1\156\1\157\1\155\1\157\1\151\1\172\1\164\1\151\1\164"+
        "\1\172\1\156\1\145\1\156\1\157\1\151\1\157\1\151\1\172\1\156\1\172"+
        "\1\156\1\157\1\156\1\157\1\163\1\164\1\172\1\156\1\172\1\156\1\162"+
        "\1\164\3\172\2\141\1\147\1\164\1\155\2\145\1\155\1\156\1\145\1\164"+
        "\1\156\1\172\1\164\1\172";
    static final String DFA21_acceptS =
        "\6\uffff\1\11\6\uffff\1\24\1\uffff\1\26\1\27\1\30\1\31\1\32\1\33"+
        "\1\34\1\35\3\uffff\1\44\1\uffff\1\45\5\uffff\1\54\10\uffff\1\62"+
        "\1\uffff\1\66\16\uffff\1\36\1\12\1\65\16\uffff\1\25\1\53\1\37\1"+
        "\64\1\40\1\43\1\41\1\42\4\uffff\1\46\1\47\1\51\1\50\1\52\1\55\1"+
        "\56\16\uffff\1\63\15\uffff\1\5\2\uffff\1\7\3\uffff\1\10\3\uffff"+
        "\1\16\56\uffff\1\6\33\uffff\1\17\1\20\1\21\42\uffff\1\57\10\uffff"+
        "\1\4\50\uffff\1\60\26\uffff\1\3\32\uffff\1\22\4\uffff\1\23\31\uffff"+
        "\1\2\71\uffff\1\1\114\uffff\1\14\2\uffff\1\61\4\uffff\1\13\144\uffff"+
        "\1\15\u0124\uffff";
    static final String DFA21_specialS =
        "\27\uffff\1\0\u037b\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\55\2\uffff\1\55\22\uffff\1\55\1\37\1\27\3\uffff\1\32\1\uffff"+
            "\1\17\1\20\1\6\1\41\1\15\1\16\1\7\1\42\12\54\1\26\1\25\1\31"+
            "\1\40\1\30\2\uffff\1\33\15\53\1\35\13\53\1\23\1\uffff\1\24\1"+
            "\uffff\1\53\1\uffff\1\4\1\43\1\10\1\13\1\46\1\1\1\53\1\11\1"+
            "\5\1\53\1\51\1\53\1\12\1\47\1\36\1\14\1\53\1\50\1\2\1\45\1\52"+
            "\1\44\1\3\3\53\1\21\1\34\1\22",
            "\1\57\5\uffff\1\56",
            "\1\60\16\uffff\1\62\1\61\1\uffff\1\63",
            "\1\64\1\65",
            "\1\67\4\uffff\1\66",
            "\1\70\6\uffff\1\73\1\71\4\uffff\1\72",
            "",
            "\1\75\1\uffff\12\76",
            "\1\101\6\uffff\1\102\3\uffff\1\100\2\uffff\1\77",
            "\1\103",
            "\1\104\3\uffff\1\106\3\uffff\1\105\5\uffff\1\107",
            "\1\110\3\uffff\1\112\5\uffff\1\111",
            "\1\114\20\uffff\1\113",
            "",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\120",
            "\1\122",
            "\1\124",
            "",
            "\1\125",
            "",
            "\1\126",
            "\1\130\1\uffff\1\127",
            "\1\132",
            "\1\134",
            "\1\137\21\uffff\1\136",
            "",
            "\1\140",
            "\1\141",
            "\1\143\6\uffff\1\145\2\uffff\1\144\6\uffff\1\142",
            "\1\147\1\uffff\1\150\11\uffff\1\146",
            "\1\152\23\uffff\1\151",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\76\1\uffff\12\54\13\uffff\1\76\37\uffff\1\76",
            "",
            "\1\157",
            "\1\160\6\uffff\1\161",
            "\1\162\7\uffff\1\163",
            "\1\164",
            "\1\165\20\uffff\1\166",
            "\1\167",
            "\1\170\3\uffff\1\171",
            "\1\172",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\173\7\53",
            "\1\175",
            "\12\53\7\uffff\32\53\4\uffff\1\176\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u0081\11"+
            "\53\1\u0082\1\u0080\6\53",
            "\12\53\7\uffff\32\53\4\uffff\1\u0086\1\uffff\15\53\1\u0085"+
            "\1\53\1\u0084\12\53",
            "\1\u0088",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008c\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0095\2\uffff\1\u0094\11\uffff\1\u0093",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099\16\uffff\1\u009a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u009c\21"+
            "\53",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009e\12\uffff\1\u009f\10\uffff\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a5\3\uffff\1\u00a4\10\uffff\1\u00a3",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00ab\3\uffff\1\u00aa",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b2\5\uffff\1\u00b1",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00b7",
            "\1\u00b9\1\uffff\1\u00b8",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6\1\u00c7\1\uffff\1\u00c9\11\uffff\1\u00c8",
            "",
            "\1\u00ca",
            "\1\u00cd\16\uffff\1\u00cc\1\u00cb",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
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
            "\1\u00f6",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0101",
            "\1\u0102",
            "\1\u0104\12\uffff\1\u0103",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u010a\2\uffff\1\u0109",
            "\1\u010b",
            "\1\u010c\20\uffff\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110\7\uffff\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\53\7\uffff\32\53\4\uffff\1\u0124\1\uffff\32\53",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\53\7\uffff\32\53\4\uffff\1\u0128\1\uffff\32\53",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
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
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013a\3\uffff\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0141",
            "",
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
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
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
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0179\2\uffff\1\u0178",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "",
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
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195\4\uffff\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "",
            "\1\u019c",
            "\1\u019d\3\uffff\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "",
            "\1\u01a1",
            "\1\u01a2",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "",
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
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7\4\uffff\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\12\53\7\uffff\32\53\4\uffff\1\u01df\1\uffff\32\53",
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
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "",
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
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0202",
            "\1\u0203",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0208",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0214\7\53",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u021c",
            "\1\u021d\11\uffff\1\u021e",
            "\12\53\7\uffff\32\53\4\uffff\1\u021f\1\uffff\32\53",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235\23\uffff\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "",
            "\1\u023a",
            "\1\u023b",
            "",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u024a",
            "\1\u024c\6\uffff\1\u024b\6\uffff\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0250",
            "\1\u0252\23\uffff\1\u0251",
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
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0269",
            "\1\u026a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
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
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282\11\uffff\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0287\7\uffff\1\u0286",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u029f",
            "",
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
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02c5",
            "\1\u02c6",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "\1\u02d5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "\1\u0300",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\1\u0320",
            "\1\u0321",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0333",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u033f",
            "\1\u0340",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0341",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\1\u0352",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0356",
            "\1\u0357",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u035f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0360",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0361",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0362",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0363",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0364",
            "\1\u0365",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0366",
            "\1\u0367",
            "\1\u0368",
            "\1\u0369",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u036a",
            "\1\u036b",
            "\1\u036c",
            "\1\u036d",
            "\1\u036e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\1\u0378",
            "\12\53\7\uffff\32\53\4\uffff\1\u0379\1\uffff\32\53",
            "\1\u037a",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u037b",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "\1\u037f\14\uffff\1\u0380",
            "\1\u0381",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0382",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "\1\u0390",
            "\1\u0391",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0392",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( FOREACH | SELECT | WHERE | WITH | AS | SET | IF | IN | STAR | REPEATER | CONTAINS | ISPARENT | ISNODETYPE | IS | HAS | MAX | MIN | DEPTH | PRINT | COMMA | FILTER | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_SQ_BRACKET | RIGHT_SQ_BRACKET | SEMICOLON | COLON | PERIOD | DQOUTE | GT | LT | LTE | GTE | AND | OR | NOT | NOT_EQUAL | LOGIC_EQUALS | EQUALS | PLUS | MINUS | DIVIDE | COMPOUND_ADD | INCREMENT | NODE_TYPE | ATTRIBUTES | RESERVED_TYPES | ID | INTEGER | STRING | FLOAT | SPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_23 = input.LA(1);

                        s = -1;
                        if ( ((LA21_23 >= '\u0000' && LA21_23 <= '\uFFFF')) ) {s = 80;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}