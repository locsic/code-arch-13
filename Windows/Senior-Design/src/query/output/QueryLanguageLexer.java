// $ANTLR 3.4 C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g 2013-12-04 12:39:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryLanguageLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int AS=5;
    public static final int ATTRIBUTE=6;
    public static final int ATTRIBUTES=7;
    public static final int BIN_OP=8;
    public static final int BLOCK_STATEMENTS=9;
    public static final int BOOL_EXP=10;
    public static final int CHAIN_ID=11;
    public static final int COLON=12;
    public static final int COMMA=13;
    public static final int COMPOUND_ADD=14;
    public static final int COMP_ADD=15;
    public static final int CONTAINS=16;
    public static final int DIVIDE=17;
    public static final int EPSILON=18;
    public static final int EQUALS=19;
    public static final int ESC_SEQ=20;
    public static final int EXPONENT=21;
    public static final int FILTER=22;
    public static final int FILTER_QUERY=23;
    public static final int FLOAT=24;
    public static final int FOREACH=25;
    public static final int FOR_QUERY=26;
    public static final int GT=27;
    public static final int GTE=28;
    public static final int HAS=29;
    public static final int HEX_DIGIT=30;
    public static final int ID=31;
    public static final int IF=32;
    public static final int IF_STATEMENT=33;
    public static final int IN=34;
    public static final int INCR=35;
    public static final int INCREMENT=36;
    public static final int INTEGER=37;
    public static final int IN_CLAUSE=38;
    public static final int IS=39;
    public static final int LEFT_BRACKET=40;
    public static final int LEFT_PAREN=41;
    public static final int LEFT_SQ_BRACKET=42;
    public static final int LOGIC_EQUALS=43;
    public static final int LOGIC_OP=44;
    public static final int LT=45;
    public static final int LTE=46;
    public static final int MAX=47;
    public static final int MINUS=48;
    public static final int NESTED=49;
    public static final int NODE=50;
    public static final int NODE_CHAIN=51;
    public static final int NODE_NAME=52;
    public static final int NODE_TYPE=53;
    public static final int NOT=54;
    public static final int NOT_EQUAL=55;
    public static final int OCTAL_ESC=56;
    public static final int OR=57;
    public static final int PERIOD=58;
    public static final int PLUS=59;
    public static final int PRINT=60;
    public static final int PROPERTY=61;
    public static final int QUERIES=62;
    public static final int QUERY=63;
    public static final int QUERY_NAME=64;
    public static final int REPEATER=65;
    public static final int RESERVED_TYPES=66;
    public static final int RIGHT_BRACKET=67;
    public static final int RIGHT_PAREN=68;
    public static final int RIGHT_SQ_BRACKET=69;
    public static final int SELECT=70;
    public static final int SELECT_QUERY=71;
    public static final int SEMICOLON=72;
    public static final int SET=73;
    public static final int SET_TABLE=74;
    public static final int SPACE=75;
    public static final int STAR=76;
    public static final int STATEMENT=77;
    public static final int STATEMENTS=78;
    public static final int TABLE=79;
    public static final int UNICODE_ESC=80;
    public static final int VAR=81;
    public static final int VAR_ASSIGN=82;
    public static final int VAR_NAME=83;
    public static final int VAR_STMT=84;
    public static final int WHERE=85;
    public static final int WHERE_BLOCK=86;
    public static final int WITH=87;
    public static final int WITH_CLAUSE=88;

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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:208:2: ( 'foreach' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:208:5: 'foreach'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:211:2: ( 'select' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:211:5: 'select'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:214:2: ( 'where' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:214:4: 'where'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:217:2: ( 'with' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:217:4: 'with'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:220:2: ( 'as' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:220:4: 'as'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:223:2: ( 'set' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:223:4: 'set'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:226:2: ( 'if' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:226:4: 'if'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:228:4: ( 'in' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:228:6: 'in'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:231:2: ( '*' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:231:4: '*'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:234:2: ( PERIOD PERIOD PERIOD )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:234:4: PERIOD PERIOD PERIOD
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:237:2: ( 'contains' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:237:4: 'contains'
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

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:239:4: ( 'is' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:239:6: 'is'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:241:5: ( 'has' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:241:7: 'has'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:243:5: ( 'max' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:243:7: 'max'
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

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:246:2: ( 'print' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:246:4: 'print'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:248:7: ( ',' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:248:9: ','
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:251:2: ( '->' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:251:4: '->'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:255:2: ( '(' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:255:4: '('
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:258:2: ( ')' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:258:4: ')'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:261:2: ( '{' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:261:4: '{'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:264:2: ( '}' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:264:4: '}'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:267:2: ( '[' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:267:4: '['
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:270:2: ( ']' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:270:4: ']'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:273:2: ( ';' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:273:4: ';'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:276:2: ( ':' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:276:4: ':'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:279:2: ( '.' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:279:5: '.'
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

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:282:5: ( '>' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:282:7: '>'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:284:5: ( '<' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:284:7: '<'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:286:5: ( LT EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:286:7: LT EQUALS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:288:5: ( GT EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:288:7: GT EQUALS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:290:5: ( '&&' | 'AND' | 'and' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:290:7: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:291:4: 'AND'
                    {
                    match("AND"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:292:4: 'and'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:294:4: ( '||' | 'OR' | 'or' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:294:6: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:295:4: 'OR'
                    {
                    match("OR"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:296:4: 'or'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:298:5: ( '!' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:298:7: '!'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:301:2: ( NOT EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:301:4: NOT EQUALS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:303:14: ( EQUALS EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:303:16: EQUALS EQUALS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:306:8: ( '=' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:306:10: '='
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:308:6: ( '+' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:308:8: '+'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:310:7: ( '-' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:310:9: '-'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:312:8: ( '/' )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:312:10: '/'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:314:14: ( PLUS EQUALS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:314:16: PLUS EQUALS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:316:11: ( PLUS PLUS )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:316:13: PLUS PLUS
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:321:2: ( 'package_declaration' | 'body_declarations' | 'variable_declaration' | 'import_declaration' | 'type_declaration' | 'field_declaration' | 'method_declaration' | 'interface_declaration' | 'constructor_declaration' | 'class_declaration' | 'variable_declaration_fragment' | 'variable_declaration_statement' | 'thrown_exceptions' | 'try_statement' | 'catch_clause' | 'initializer' | 'method_invocation' | 'if_statement' | 'expression' | 'operator' | 'conditional_expression' | 'continue_expression' | 'assignment' | 'this_expression' | 'class_instance_creation' | 'field_access' | 'instance_of_expression' | 'cast_expression' | 'super_field_access' | 'statement' | 'then_statement' | 'else_statement' | 'do_statement' | 'parameters' | 'body' | 'for_statement' | 'enhanced_for_statement' | 'switch_statement' | 'while_statement' | 'null_literal' | 'integer_literal' | 'character_literal' | 'string_literal' | 'boolean_literal' | 'variable' | 'file' | 'directory' )
            int alt3=47;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:321:4: 'package_declaration'
                    {
                    match("package_declaration"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:322:4: 'body_declarations'
                    {
                    match("body_declarations"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:323:4: 'variable_declaration'
                    {
                    match("variable_declaration"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:324:4: 'import_declaration'
                    {
                    match("import_declaration"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:325:4: 'type_declaration'
                    {
                    match("type_declaration"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:326:4: 'field_declaration'
                    {
                    match("field_declaration"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:327:4: 'method_declaration'
                    {
                    match("method_declaration"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:328:4: 'interface_declaration'
                    {
                    match("interface_declaration"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:329:4: 'constructor_declaration'
                    {
                    match("constructor_declaration"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:330:4: 'class_declaration'
                    {
                    match("class_declaration"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:331:4: 'variable_declaration_fragment'
                    {
                    match("variable_declaration_fragment"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:332:4: 'variable_declaration_statement'
                    {
                    match("variable_declaration_statement"); 



                    }
                    break;
                case 13 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:333:4: 'thrown_exceptions'
                    {
                    match("thrown_exceptions"); 



                    }
                    break;
                case 14 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:334:4: 'try_statement'
                    {
                    match("try_statement"); 



                    }
                    break;
                case 15 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:335:4: 'catch_clause'
                    {
                    match("catch_clause"); 



                    }
                    break;
                case 16 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:336:4: 'initializer'
                    {
                    match("initializer"); 



                    }
                    break;
                case 17 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:337:4: 'method_invocation'
                    {
                    match("method_invocation"); 



                    }
                    break;
                case 18 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:338:4: 'if_statement'
                    {
                    match("if_statement"); 



                    }
                    break;
                case 19 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:339:4: 'expression'
                    {
                    match("expression"); 



                    }
                    break;
                case 20 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:340:4: 'operator'
                    {
                    match("operator"); 



                    }
                    break;
                case 21 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:341:4: 'conditional_expression'
                    {
                    match("conditional_expression"); 



                    }
                    break;
                case 22 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:342:4: 'continue_expression'
                    {
                    match("continue_expression"); 



                    }
                    break;
                case 23 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:343:4: 'assignment'
                    {
                    match("assignment"); 



                    }
                    break;
                case 24 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:344:4: 'this_expression'
                    {
                    match("this_expression"); 



                    }
                    break;
                case 25 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:345:4: 'class_instance_creation'
                    {
                    match("class_instance_creation"); 



                    }
                    break;
                case 26 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:346:4: 'field_access'
                    {
                    match("field_access"); 



                    }
                    break;
                case 27 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:347:4: 'instance_of_expression'
                    {
                    match("instance_of_expression"); 



                    }
                    break;
                case 28 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:348:4: 'cast_expression'
                    {
                    match("cast_expression"); 



                    }
                    break;
                case 29 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:349:4: 'super_field_access'
                    {
                    match("super_field_access"); 



                    }
                    break;
                case 30 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:350:4: 'statement'
                    {
                    match("statement"); 



                    }
                    break;
                case 31 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:351:4: 'then_statement'
                    {
                    match("then_statement"); 



                    }
                    break;
                case 32 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:352:4: 'else_statement'
                    {
                    match("else_statement"); 



                    }
                    break;
                case 33 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:353:4: 'do_statement'
                    {
                    match("do_statement"); 



                    }
                    break;
                case 34 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:354:4: 'parameters'
                    {
                    match("parameters"); 



                    }
                    break;
                case 35 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:355:4: 'body'
                    {
                    match("body"); 



                    }
                    break;
                case 36 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:356:4: 'for_statement'
                    {
                    match("for_statement"); 



                    }
                    break;
                case 37 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:357:4: 'enhanced_for_statement'
                    {
                    match("enhanced_for_statement"); 



                    }
                    break;
                case 38 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:358:4: 'switch_statement'
                    {
                    match("switch_statement"); 



                    }
                    break;
                case 39 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:359:4: 'while_statement'
                    {
                    match("while_statement"); 



                    }
                    break;
                case 40 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:360:4: 'null_literal'
                    {
                    match("null_literal"); 



                    }
                    break;
                case 41 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:361:4: 'integer_literal'
                    {
                    match("integer_literal"); 



                    }
                    break;
                case 42 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:362:4: 'character_literal'
                    {
                    match("character_literal"); 



                    }
                    break;
                case 43 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:363:4: 'string_literal'
                    {
                    match("string_literal"); 



                    }
                    break;
                case 44 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:364:4: 'boolean_literal'
                    {
                    match("boolean_literal"); 



                    }
                    break;
                case 45 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:365:4: 'variable'
                    {
                    match("variable"); 



                    }
                    break;
                case 46 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:366:4: 'file'
                    {
                    match("file"); 



                    }
                    break;
                case 47 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:367:4: 'directory'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:371:2: ( 'name' | 'type' | 'return_type' | 'parameter_types' | 'is_constructor' | 'is_deprecated' | 'is_parameter' | 'is_field' | 'default_value' | 'modifiers' | 'origin' | 'kind' | 'declared_methods' | 'declared_fields' | 'declared_types' | 'declaring_class' | 'declaring_method' | 'package' | 'interfaces' | 'superclass' | 'boxing' | 'unboxing' | 'parameter_list' | 'modifier' | 'startLine' | 'endLine' | 'totalLines' | 'boolean_value' )
            int alt4=28;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:371:4: 'name'
                    {
                    match("name"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:372:4: 'type'
                    {
                    match("type"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:373:4: 'return_type'
                    {
                    match("return_type"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:374:4: 'parameter_types'
                    {
                    match("parameter_types"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:375:4: 'is_constructor'
                    {
                    match("is_constructor"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:376:4: 'is_deprecated'
                    {
                    match("is_deprecated"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:377:4: 'is_parameter'
                    {
                    match("is_parameter"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:378:4: 'is_field'
                    {
                    match("is_field"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:379:4: 'default_value'
                    {
                    match("default_value"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:380:4: 'modifiers'
                    {
                    match("modifiers"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:381:4: 'origin'
                    {
                    match("origin"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:382:4: 'kind'
                    {
                    match("kind"); 



                    }
                    break;
                case 13 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:383:4: 'declared_methods'
                    {
                    match("declared_methods"); 



                    }
                    break;
                case 14 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:384:4: 'declared_fields'
                    {
                    match("declared_fields"); 



                    }
                    break;
                case 15 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:385:4: 'declared_types'
                    {
                    match("declared_types"); 



                    }
                    break;
                case 16 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:386:4: 'declaring_class'
                    {
                    match("declaring_class"); 



                    }
                    break;
                case 17 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:387:4: 'declaring_method'
                    {
                    match("declaring_method"); 



                    }
                    break;
                case 18 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:388:4: 'package'
                    {
                    match("package"); 



                    }
                    break;
                case 19 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:389:4: 'interfaces'
                    {
                    match("interfaces"); 



                    }
                    break;
                case 20 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:390:4: 'superclass'
                    {
                    match("superclass"); 



                    }
                    break;
                case 21 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:391:4: 'boxing'
                    {
                    match("boxing"); 



                    }
                    break;
                case 22 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:392:4: 'unboxing'
                    {
                    match("unboxing"); 



                    }
                    break;
                case 23 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:393:4: 'parameter_list'
                    {
                    match("parameter_list"); 



                    }
                    break;
                case 24 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:394:4: 'modifier'
                    {
                    match("modifier"); 



                    }
                    break;
                case 25 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:395:4: 'startLine'
                    {
                    match("startLine"); 



                    }
                    break;
                case 26 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:396:4: 'endLine'
                    {
                    match("endLine"); 



                    }
                    break;
                case 27 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:397:4: 'totalLines'
                    {
                    match("totalLines"); 



                    }
                    break;
                case 28 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:398:4: 'boolean_value'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:401:2: ( 'is_class' | 'is_primitive' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:401:4: 'is_class'
                    {
                    match("is_class"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:402:4: 'is_primitive'
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:406:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:406:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:406:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:409:9: ( ( '0' .. '9' )+ )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:409:11: ( '0' .. '9' )+
            {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:409:11: ( '0' .. '9' )+
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

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:413:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:413:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:413:9: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:413:25: ( '0' .. '9' )*
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
                    	    break loop9;
                        }
                    } while (true);


                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:413:37: ( EXPONENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:413:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:414:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:414:13: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
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
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:414:25: ( EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:414:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:415:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:415:9: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
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
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:420:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:420:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:420:22: ( '+' | '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='+'||LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
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


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:420:33: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:423:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:427:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\\') ) {
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
                    alt17=1;
                    }
                    break;
                case 'u':
                    {
                    alt17=2;
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
                    alt17=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:427:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:428:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:429:9: OCTAL_ESC
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:434:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1 >= '0' && LA18_1 <= '3')) ) {
                    int LA18_2 = input.LA(3);

                    if ( ((LA18_2 >= '0' && LA18_2 <= '7')) ) {
                        int LA18_4 = input.LA(4);

                        if ( ((LA18_4 >= '0' && LA18_4 <= '7')) ) {
                            alt18=1;
                        }
                        else {
                            alt18=2;
                        }
                    }
                    else {
                        alt18=3;
                    }
                }
                else if ( ((LA18_1 >= '4' && LA18_1 <= '7')) ) {
                    int LA18_3 = input.LA(3);

                    if ( ((LA18_3 >= '0' && LA18_3 <= '7')) ) {
                        alt18=2;
                    }
                    else {
                        alt18=3;
                    }
                }
                else {
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:434:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:435:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:436:9: '\\\\' ( '0' .. '7' )
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:441:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:441:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:443:8: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:443:10: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:443:10: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= '\t' && LA19_0 <= '\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:8: ( FOREACH | SELECT | WHERE | WITH | AS | SET | IF | IN | STAR | REPEATER | CONTAINS | IS | HAS | MAX | PRINT | COMMA | FILTER | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_SQ_BRACKET | RIGHT_SQ_BRACKET | SEMICOLON | COLON | PERIOD | GT | LT | LTE | GTE | AND | OR | NOT | NOT_EQUAL | LOGIC_EQUALS | EQUALS | PLUS | MINUS | DIVIDE | COMPOUND_ADD | INCREMENT | NODE_TYPE | ATTRIBUTES | RESERVED_TYPES | ID | INTEGER | FLOAT | SPACE )
        int alt20=48;
        alt20 = dfa20.predict(input);
        switch (alt20) {
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
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:72: IS
                {
                mIS(); 


                }
                break;
            case 13 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:75: HAS
                {
                mHAS(); 


                }
                break;
            case 14 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:79: MAX
                {
                mMAX(); 


                }
                break;
            case 15 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:83: PRINT
                {
                mPRINT(); 


                }
                break;
            case 16 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:89: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 17 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:95: FILTER
                {
                mFILTER(); 


                }
                break;
            case 18 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:102: LEFT_PAREN
                {
                mLEFT_PAREN(); 


                }
                break;
            case 19 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:113: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 


                }
                break;
            case 20 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:125: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 


                }
                break;
            case 21 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:138: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 


                }
                break;
            case 22 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:152: LEFT_SQ_BRACKET
                {
                mLEFT_SQ_BRACKET(); 


                }
                break;
            case 23 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:168: RIGHT_SQ_BRACKET
                {
                mRIGHT_SQ_BRACKET(); 


                }
                break;
            case 24 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:185: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 25 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:195: COLON
                {
                mCOLON(); 


                }
                break;
            case 26 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:201: PERIOD
                {
                mPERIOD(); 


                }
                break;
            case 27 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:208: GT
                {
                mGT(); 


                }
                break;
            case 28 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:211: LT
                {
                mLT(); 


                }
                break;
            case 29 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:214: LTE
                {
                mLTE(); 


                }
                break;
            case 30 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:218: GTE
                {
                mGTE(); 


                }
                break;
            case 31 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:222: AND
                {
                mAND(); 


                }
                break;
            case 32 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:226: OR
                {
                mOR(); 


                }
                break;
            case 33 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:229: NOT
                {
                mNOT(); 


                }
                break;
            case 34 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:233: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 35 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:243: LOGIC_EQUALS
                {
                mLOGIC_EQUALS(); 


                }
                break;
            case 36 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:256: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 37 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:263: PLUS
                {
                mPLUS(); 


                }
                break;
            case 38 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:268: MINUS
                {
                mMINUS(); 


                }
                break;
            case 39 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:274: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 40 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:281: COMPOUND_ADD
                {
                mCOMPOUND_ADD(); 


                }
                break;
            case 41 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:294: INCREMENT
                {
                mINCREMENT(); 


                }
                break;
            case 42 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:304: NODE_TYPE
                {
                mNODE_TYPE(); 


                }
                break;
            case 43 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:314: ATTRIBUTES
                {
                mATTRIBUTES(); 


                }
                break;
            case 44 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:325: RESERVED_TYPES
                {
                mRESERVED_TYPES(); 


                }
                break;
            case 45 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:340: ID
                {
                mID(); 


                }
                break;
            case 46 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:343: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 47 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:351: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 48 :
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:1:357: SPACE
                {
                mSPACE(); 


                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA20 dfa20 = new DFA20(this);
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
            return "320:1: NODE_TYPE : ( 'package_declaration' | 'body_declarations' | 'variable_declaration' | 'import_declaration' | 'type_declaration' | 'field_declaration' | 'method_declaration' | 'interface_declaration' | 'constructor_declaration' | 'class_declaration' | 'variable_declaration_fragment' | 'variable_declaration_statement' | 'thrown_exceptions' | 'try_statement' | 'catch_clause' | 'initializer' | 'method_invocation' | 'if_statement' | 'expression' | 'operator' | 'conditional_expression' | 'continue_expression' | 'assignment' | 'this_expression' | 'class_instance_creation' | 'field_access' | 'instance_of_expression' | 'cast_expression' | 'super_field_access' | 'statement' | 'then_statement' | 'else_statement' | 'do_statement' | 'parameters' | 'body' | 'for_statement' | 'enhanced_for_statement' | 'switch_statement' | 'while_statement' | 'null_literal' | 'integer_literal' | 'character_literal' | 'string_literal' | 'boolean_literal' | 'variable' | 'file' | 'directory' );";
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
            return "370:1: ATTRIBUTES : ( 'name' | 'type' | 'return_type' | 'parameter_types' | 'is_constructor' | 'is_deprecated' | 'is_parameter' | 'is_field' | 'default_value' | 'modifiers' | 'origin' | 'kind' | 'declared_methods' | 'declared_fields' | 'declared_types' | 'declaring_class' | 'declaring_method' | 'package' | 'interfaces' | 'superclass' | 'boxing' | 'unboxing' | 'parameter_list' | 'modifier' | 'startLine' | 'endLine' | 'totalLines' | 'boolean_value' );";
        }
    }
    static final String DFA14_eotS =
        "\5\uffff";
    static final String DFA14_eofS =
        "\5\uffff";
    static final String DFA14_minS =
        "\2\56\3\uffff";
    static final String DFA14_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA14_specialS =
        "\5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "412:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\5\52\1\uffff\1\73\4\52\1\uffff\1\111\10\uffff\1\112\1\114"+
        "\1\uffff\1\52\1\uffff\2\52\1\122\1\124\1\126\1\uffff\11\52\1\uffff"+
        "\1\152\1\uffff\10\52\1\170\1\52\1\173\1\177\1\u0081\1\52\3\uffff"+
        "\12\52\6\uffff\1\52\2\32\1\52\7\uffff\21\52\1\uffff\4\52\1\u00ae"+
        "\10\52\1\uffff\1\30\1\52\1\uffff\3\52\1\uffff\1\52\1\uffff\6\52"+
        "\1\u00c8\1\u00c9\5\52\1\30\34\52\1\u00eb\1\52\1\uffff\7\52\1\u00f4"+
        "\21\52\2\uffff\7\52\1\u00eb\3\52\1\u0116\16\52\1\u0116\1\52\1\u0116"+
        "\4\52\1\uffff\6\52\1\u0131\1\52\1\uffff\27\52\1\u014a\11\52\1\uffff"+
        "\23\52\1\u0168\6\52\1\uffff\30\52\1\uffff\2\52\1\u0116\3\52\1\u0116"+
        "\22\52\1\u01a0\3\52\1\uffff\37\52\1\u0116\16\52\1\u0116\10\52\1"+
        "\uffff\21\52\1\u01ec\3\52\1\u0116\1\52\1\u01f1\12\52\1\u0116\2\52"+
        "\1\u00eb\2\52\1\u00eb\20\52\1\u0116\5\52\1\u00eb\1\u0116\12\52\1"+
        "\uffff\4\52\1\uffff\12\52\1\u0116\20\52\1\u00eb\11\52\1\u0116\3"+
        "\52\1\u00eb\2\52\1\u0116\23\52\1\u00eb\12\52\1\u0116\1\u00eb\24"+
        "\52\1\u00eb\46\52\1\u0116\2\52\1\u00eb\4\52\1\u00eb\5\52\1\u0116"+
        "\1\u01ec\6\52\1\u00eb\22\52\1\u00eb\6\52\2\u00eb\11\52\1\u0116\17"+
        "\52\1\u0116\5\52\1\u00eb\2\52\1\u0116\7\52\1\u00eb\5\52\1\u0116"+
        "\14\52\1\u0116\6\52\2\u00eb\3\52\1\u0116\5\52\1\u00eb\1\52\1\u00eb"+
        "\7\52\1\u00eb\4\52\1\u0116\1\52\1\u00eb\3\52\1\u00eb\2\52\2\u0116"+
        "\3\52\1\u00eb\16\52\1\u00eb\2\52\2\u0116\1\u00eb\7\52\1\u00eb\1"+
        "\52\1\u00eb\1\52\1\u00eb\1\52\1\u00eb\1\52\1\u00eb\1\52\1\u00eb"+
        "\2\52\1\u00eb\4\52\1\u00eb\5\52\1\u00eb\3\52\1\u00eb\7\52\1\u00eb"+
        "\1\52\1\u00eb\6\52\1\u00eb\1\52\1\u00eb\3\52\3\u00eb\14\52\1\u00eb"+
        "\1\52\1\u00eb";
    static final String DFA20_eofS =
        "\u0379\uffff";
    static final String DFA20_minS =
        "\1\11\1\151\1\145\1\150\1\156\1\146\1\uffff\1\56\4\141\1\uffff\1"+
        "\76\10\uffff\2\75\1\uffff\1\116\1\uffff\1\122\1\160\2\75\1\53\1"+
        "\uffff\1\157\1\141\1\150\1\154\1\145\1\141\1\145\1\151\1\156\1\uffff"+
        "\1\56\1\uffff\1\162\1\145\1\154\1\160\1\141\1\151\1\145\1\164\1"+
        "\60\1\144\3\60\1\160\3\uffff\1\156\1\141\1\163\1\141\1\163\1\170"+
        "\1\164\1\144\1\151\1\143\6\uffff\1\104\2\60\1\145\7\uffff\1\144"+
        "\1\162\1\160\1\145\1\171\1\164\1\160\1\163\1\144\1\137\1\162\1\143"+
        "\1\154\1\155\1\164\1\156\1\142\1\uffff\1\137\1\154\2\145\1\60\1"+
        "\145\1\162\1\151\1\164\1\162\1\154\1\150\1\151\1\uffff\1\60\1\163"+
        "\1\uffff\1\145\2\164\1\uffff\1\143\1\uffff\1\157\1\144\1\163\1\143"+
        "\1\164\1\162\2\60\1\150\1\151\1\156\1\153\1\141\1\60\1\147\1\162"+
        "\1\171\1\154\2\151\1\145\1\157\1\163\1\156\1\137\1\141\1\162\1\145"+
        "\1\141\1\114\1\163\1\145\1\141\2\154\1\145\1\165\1\144\1\157\1\141"+
        "\1\163\1\144\1\60\1\143\1\uffff\1\162\1\145\1\164\1\156\1\143\2"+
        "\145\1\60\1\147\1\164\1\147\1\151\1\141\1\154\1\145\1\141\1\151"+
        "\1\162\1\141\1\164\1\151\1\163\1\150\1\137\1\141\2\uffff\1\157\1"+
        "\146\1\164\1\141\1\155\1\151\1\141\1\60\1\145\1\156\1\141\1\60\1"+
        "\167\2\137\1\163\1\154\1\145\1\137\1\156\1\151\1\164\1\143\1\165"+
        "\1\141\1\137\1\60\1\162\1\60\1\170\1\143\1\164\1\137\1\uffff\1\164"+
        "\1\137\1\155\1\114\1\147\1\150\1\60\1\137\1\uffff\1\156\1\141\1"+
        "\146\1\145\1\141\2\156\1\141\1\160\1\162\1\151\1\145\1\164\1\151"+
        "\1\156\1\162\1\164\2\137\1\145\1\143\1\144\1\151\1\60\1\147\1\145"+
        "\1\156\1\164\1\144\1\141\1\147\1\142\1\144\1\uffff\1\156\1\145\1"+
        "\163\1\164\1\114\2\163\1\143\1\156\1\141\1\164\1\154\1\162\1\154"+
        "\1\156\1\151\1\150\2\141\1\60\1\146\1\154\1\145\1\151\2\137\1\uffff"+
        "\1\163\1\155\1\164\1\141\1\162\1\154\1\143\2\163\1\162\1\141\1\155"+
        "\1\154\1\137\1\156\2\165\1\151\1\144\1\143\1\170\1\164\1\137\1\145"+
        "\1\uffff\1\145\1\164\1\60\1\157\1\145\1\156\1\60\1\154\1\145\1\137"+
        "\1\170\1\164\1\141\1\151\1\163\1\164\2\145\1\164\1\157\1\164\1\145"+
        "\1\151\1\137\1\156\1\60\1\164\1\145\1\143\1\uffff\1\151\1\141\2"+
        "\156\1\154\1\163\1\164\2\145\1\143\1\137\1\151\1\145\1\164\1\163"+
        "\1\145\1\155\1\151\2\144\1\163\1\145\1\143\1\157\1\145\1\156\1\154"+
        "\1\160\1\145\1\144\1\162\1\60\1\145\1\162\1\143\1\137\1\145\1\143"+
        "\1\145\1\160\1\141\1\164\1\156\1\151\1\141\1\144\1\60\1\145\1\162"+
        "\1\137\1\144\1\156\2\164\1\147\1\uffff\1\145\2\143\1\145\1\163\1"+
        "\164\1\145\1\151\1\164\1\141\1\156\1\155\1\145\1\154\1\172\1\137"+
        "\1\162\1\60\1\143\1\145\1\164\1\60\1\145\1\60\1\137\1\164\1\156"+
        "\1\143\1\163\1\141\2\162\1\145\1\156\1\60\1\144\1\162\1\60\2\154"+
        "\1\60\1\154\1\170\1\162\1\164\2\145\1\157\1\164\1\137\1\155\1\171"+
        "\1\166\1\137\1\147\1\145\1\171\1\60\1\155\1\154\1\145\1\154\1\163"+
        "\2\60\1\164\1\141\2\164\1\145\1\137\1\151\1\145\1\157\1\165\1\uffff"+
        "\1\141\1\164\1\151\1\143\1\uffff\1\145\1\157\1\141\1\154\1\164\1"+
        "\165\1\145\1\137\1\143\1\166\1\60\1\145\1\137\1\141\1\151\1\141"+
        "\1\144\1\141\1\143\2\145\1\155\1\163\1\156\1\145\1\146\1\145\1\60"+
        "\1\141\1\146\1\137\1\162\1\160\1\145\1\141\1\163\1\144\1\60\1\145"+
        "\1\164\1\145\1\60\1\156\1\144\1\60\1\164\1\162\1\146\1\143\1\164"+
        "\1\145\1\166\1\154\1\170\1\162\1\154\2\141\2\163\2\154\1\157\1\143"+
        "\1\60\1\154\1\162\1\164\1\154\1\145\1\162\1\145\1\163\1\155\1\145"+
        "\2\60\1\155\1\157\1\156\1\154\1\145\1\151\1\171\1\143\1\141\1\145"+
        "\1\156\1\162\1\163\1\137\1\162\1\145\1\155\1\164\2\145\1\60\1\137"+
        "\1\164\1\145\1\162\1\145\1\141\1\160\2\137\1\162\1\156\1\145\1\163"+
        "\1\151\1\141\1\143\1\154\1\171\1\151\1\141\1\145\1\165\1\143\1\141"+
        "\1\160\1\163\1\145\1\156\1\145\1\162\1\164\1\165\1\164\1\145\1\160"+
        "\1\154\1\145\1\154\1\60\1\164\1\141\1\60\2\141\1\155\1\145\1\60"+
        "\1\143\1\162\1\145\1\157\1\144\2\60\2\162\1\144\1\145\1\141\1\143"+
        "\1\60\1\151\1\164\1\162\2\141\1\160\1\163\1\164\1\162\1\145\1\154"+
        "\2\164\1\151\1\156\1\164\1\156\1\137\1\60\1\145\1\150\1\154\1\145"+
        "\1\141\1\164\2\60\1\164\1\143\1\154\1\145\1\156\1\154\1\141\1\170"+
        "\1\162\1\60\1\141\2\145\1\170\1\164\1\145\1\157\1\145\1\141\1\164"+
        "\1\162\1\145\1\164\1\151\1\141\1\60\1\141\2\151\1\157\1\164\1\60"+
        "\1\164\1\163\1\60\1\157\1\144\2\163\1\150\1\151\1\143\1\60\1\156"+
        "\1\164\1\141\1\154\1\160\1\60\1\164\1\163\1\143\1\160\1\151\1\137"+
        "\1\156\1\162\1\164\1\151\1\141\1\163\1\60\1\157\1\154\1\162\2\157"+
        "\1\156\2\60\1\164\1\144\1\163\1\60\1\163\2\157\1\145\1\164\1\60"+
        "\1\162\1\60\1\162\1\151\1\163\1\154\1\162\1\157\1\143\1\60\1\141"+
        "\1\151\1\157\1\164\1\60\1\156\1\60\1\141\2\156\1\60\1\141\1\163"+
        "\2\60\1\144\1\156\1\163\1\60\1\141\1\145\1\157\1\151\1\141\1\145"+
        "\1\156\1\162\1\154\1\157\1\156\1\151\1\163\1\164\1\60\1\163\1\164"+
        "\3\60\1\163\1\164\1\163\1\156\1\157\1\162\1\163\1\60\1\145\1\60"+
        "\1\156\1\60\1\157\1\60\1\151\1\60\1\145\1\60\1\151\1\163\1\60\1"+
        "\156\1\141\1\163\1\141\1\60\1\156\1\157\1\155\1\157\1\151\1\60\1"+
        "\164\1\151\1\164\1\60\1\156\1\145\1\156\1\157\1\151\1\157\1\151"+
        "\1\60\1\156\1\60\1\156\1\157\1\156\1\157\1\146\1\164\1\60\1\156"+
        "\1\60\1\156\1\162\1\164\3\60\2\141\1\147\1\164\1\155\2\145\1\155"+
        "\1\156\1\145\1\164\1\156\1\60\1\164\1\60";
    static final String DFA20_maxS =
        "\1\175\1\157\1\167\1\151\2\163\1\uffff\1\71\1\157\1\141\1\157\1"+
        "\162\1\uffff\1\76\10\uffff\2\75\1\uffff\1\116\1\uffff\1\122\1\162"+
        "\3\75\1\uffff\1\157\1\141\1\171\1\170\1\157\1\165\1\145\1\151\1"+
        "\156\1\uffff\1\145\1\uffff\1\162\1\154\1\164\1\160\1\162\2\151\1"+
        "\164\1\172\1\144\3\172\1\160\3\uffff\1\156\1\141\1\164\1\141\1\163"+
        "\1\170\1\164\1\144\1\151\1\162\6\uffff\1\104\2\172\1\145\7\uffff"+
        "\1\170\1\162\1\160\1\162\1\171\1\164\1\160\1\163\1\150\1\137\1\162"+
        "\1\146\1\154\1\155\1\164\1\156\1\142\1\uffff\1\145\1\154\2\145\1"+
        "\172\1\145\1\164\1\151\1\164\1\162\1\154\1\150\1\151\1\uffff\1\172"+
        "\1\163\1\uffff\1\145\2\164\1\uffff\1\160\1\uffff\1\157\1\164\1\163"+
        "\1\143\1\164\1\162\2\172\1\150\1\151\1\156\1\153\1\141\1\172\1\147"+
        "\1\162\1\171\1\154\2\151\1\145\1\157\1\163\1\156\1\137\1\141\1\162"+
        "\1\145\1\141\1\114\1\163\1\145\1\141\2\154\1\145\1\165\1\144\1\157"+
        "\1\141\1\163\1\144\1\172\1\143\1\uffff\1\162\1\145\1\164\1\156\1"+
        "\143\2\145\1\172\1\147\1\164\1\162\1\151\1\141\1\157\1\145\1\162"+
        "\1\151\1\162\1\151\1\164\1\151\1\163\1\150\1\137\1\141\2\uffff\1"+
        "\157\1\146\1\164\1\141\1\155\1\151\1\141\1\172\1\145\1\156\1\141"+
        "\1\172\1\167\2\137\1\163\1\154\1\145\1\137\1\156\1\151\1\164\1\143"+
        "\1\165\1\141\1\137\1\172\1\162\1\172\1\170\1\143\1\164\1\137\1\uffff"+
        "\1\164\1\143\1\155\1\114\1\147\1\150\1\172\1\137\1\uffff\1\156\1"+
        "\141\1\146\1\145\1\141\2\156\1\141\1\160\1\162\1\151\1\145\1\164"+
        "\1\151\1\156\1\162\1\164\2\137\1\145\1\143\1\144\1\151\1\172\1\147"+
        "\1\145\1\156\1\164\1\144\1\141\1\147\1\142\1\144\1\uffff\1\156\1"+
        "\145\1\163\1\164\1\114\2\163\1\143\1\156\1\141\1\164\1\154\1\162"+
        "\1\154\1\156\1\151\1\150\1\141\1\144\1\172\1\146\1\154\1\145\1\151"+
        "\2\137\1\uffff\1\163\1\155\1\164\1\141\1\162\1\154\1\143\2\163\1"+
        "\162\1\141\1\155\1\154\1\137\1\156\2\165\2\151\1\143\1\170\1\164"+
        "\1\137\1\145\1\uffff\1\145\1\164\1\172\1\157\1\145\1\156\1\172\1"+
        "\154\1\145\1\137\1\170\1\164\1\141\1\151\1\163\1\164\2\145\1\164"+
        "\1\157\1\164\2\151\1\137\1\156\1\172\1\164\1\145\1\143\1\uffff\1"+
        "\151\1\141\2\156\1\154\1\163\1\164\2\145\1\143\1\137\1\151\1\145"+
        "\1\164\1\163\1\145\1\155\1\151\2\144\1\163\1\145\1\143\1\157\1\145"+
        "\1\156\1\154\1\160\1\145\1\151\1\162\1\172\1\145\1\162\1\143\1\137"+
        "\1\145\1\143\1\145\1\160\1\141\1\164\1\156\1\151\1\141\1\144\1\172"+
        "\1\145\1\162\1\137\1\144\1\156\2\164\1\147\1\uffff\1\145\2\143\1"+
        "\145\1\163\1\164\1\145\1\151\1\164\1\141\1\156\1\155\1\145\1\154"+
        "\1\172\1\137\1\162\1\172\1\143\1\145\1\164\1\172\1\145\1\172\1\137"+
        "\1\164\1\156\1\143\1\163\1\141\2\162\1\145\1\156\1\172\1\144\1\162"+
        "\1\172\1\154\1\166\1\172\1\154\1\170\1\162\1\164\2\145\1\157\1\164"+
        "\1\137\1\155\1\171\1\166\1\137\1\147\1\145\1\171\1\172\1\155\1\154"+
        "\1\145\1\154\1\163\2\172\1\164\1\141\2\164\1\145\1\163\1\151\1\145"+
        "\1\157\1\165\1\uffff\1\141\1\164\1\151\1\143\1\uffff\1\145\1\157"+
        "\1\141\1\154\1\164\1\165\1\145\1\137\1\143\1\166\1\172\1\145\1\163"+
        "\1\141\1\151\1\141\1\144\1\141\1\143\2\145\1\155\1\163\1\156\1\145"+
        "\1\146\1\145\1\172\1\141\1\164\1\137\1\162\1\160\1\145\1\141\1\163"+
        "\1\144\1\172\1\145\1\164\1\145\1\172\1\156\1\144\1\172\1\164\1\162"+
        "\1\146\1\143\1\164\1\145\1\166\1\154\1\170\1\162\1\154\2\141\2\163"+
        "\2\154\1\157\1\143\1\172\1\164\1\162\1\164\1\154\1\145\1\162\1\145"+
        "\1\163\1\155\1\145\2\172\1\155\1\157\1\156\1\154\1\145\1\151\1\171"+
        "\1\155\1\141\1\145\1\156\1\162\1\163\1\137\1\162\1\145\1\155\1\164"+
        "\2\145\1\172\1\137\1\164\1\145\1\162\1\145\1\141\1\160\2\137\1\162"+
        "\1\156\1\145\1\163\1\151\1\141\1\143\1\154\1\171\1\151\1\141\1\145"+
        "\1\165\1\143\1\141\1\160\1\163\1\145\1\156\1\145\1\162\1\164\1\165"+
        "\1\164\1\145\1\160\1\154\1\145\1\154\1\172\1\164\1\141\1\172\2\141"+
        "\1\155\1\145\1\172\1\143\1\162\1\145\1\157\1\144\2\172\2\162\1\144"+
        "\1\145\1\141\1\143\1\172\1\151\1\164\1\162\2\141\1\160\1\163\1\164"+
        "\1\162\1\145\1\154\2\164\1\151\1\156\1\164\1\156\1\137\1\172\1\145"+
        "\1\150\1\154\1\145\1\141\1\164\2\172\1\164\1\143\1\154\1\145\1\156"+
        "\1\154\1\141\1\170\1\162\1\172\1\141\2\145\1\170\1\164\1\145\1\157"+
        "\1\145\1\141\1\164\1\162\1\145\1\164\1\151\1\141\1\172\1\141\2\151"+
        "\1\157\1\164\1\172\1\164\1\163\1\172\1\157\1\144\2\163\1\150\1\151"+
        "\1\143\1\172\1\156\1\164\1\141\1\154\1\160\1\172\1\164\1\163\1\143"+
        "\1\160\1\151\1\137\1\156\1\162\1\164\1\151\1\141\1\163\1\172\1\157"+
        "\1\154\1\162\2\157\1\156\2\172\1\164\1\144\1\163\1\172\1\163\2\157"+
        "\1\145\1\164\1\172\1\162\1\172\1\162\1\151\1\163\1\154\1\162\1\157"+
        "\1\143\1\172\1\141\1\151\1\157\1\164\1\172\1\156\1\172\1\141\2\156"+
        "\1\172\1\141\1\163\2\172\1\144\1\156\1\163\1\172\1\141\1\145\1\157"+
        "\1\151\1\141\1\145\1\156\1\162\1\154\1\157\1\156\1\151\1\163\1\164"+
        "\1\172\1\163\1\164\3\172\1\163\1\164\1\163\1\156\1\157\1\162\1\163"+
        "\1\172\1\145\1\172\1\156\1\172\1\157\1\172\1\151\1\172\1\145\1\172"+
        "\1\151\1\163\1\172\1\156\1\141\1\163\1\141\1\172\1\156\1\157\1\155"+
        "\1\157\1\151\1\172\1\164\1\151\1\164\1\172\1\156\1\145\1\156\1\157"+
        "\1\151\1\157\1\151\1\172\1\156\1\172\1\156\1\157\1\156\1\157\1\163"+
        "\1\164\1\172\1\156\1\172\1\156\1\162\1\164\3\172\2\141\1\147\1\164"+
        "\1\155\2\145\1\155\1\156\1\145\1\164\1\156\1\172\1\164\1\172";
    static final String DFA20_acceptS =
        "\6\uffff\1\11\5\uffff\1\20\1\uffff\1\22\1\23\1\24\1\25\1\26\1\27"+
        "\1\30\1\31\2\uffff\1\37\1\uffff\1\40\5\uffff\1\47\11\uffff\1\55"+
        "\1\uffff\1\60\16\uffff\1\32\1\12\1\57\12\uffff\1\21\1\46\1\33\1"+
        "\36\1\34\1\35\4\uffff\1\41\1\42\1\44\1\43\1\45\1\50\1\51\21\uffff"+
        "\1\56\15\uffff\1\5\2\uffff\1\7\3\uffff\1\10\1\uffff\1\14\54\uffff"+
        "\1\6\31\uffff\1\15\1\16\41\uffff\1\52\10\uffff\1\4\41\uffff\1\53"+
        "\32\uffff\1\3\30\uffff\1\17\35\uffff\1\2\67\uffff\1\1\113\uffff"+
        "\1\54\4\uffff\1\13\u0187\uffff";
    static final String DFA20_specialS =
        "\u0379\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\35\4\uffff\1\30\1\uffff\1"+
            "\16\1\17\1\6\1\37\1\14\1\15\1\7\1\40\12\53\1\25\1\24\1\27\1"+
            "\36\1\26\2\uffff\1\31\15\52\1\33\13\52\1\22\1\uffff\1\23\1\uffff"+
            "\1\52\1\uffff\1\4\1\41\1\10\1\45\1\44\1\1\1\52\1\11\1\5\1\52"+
            "\1\50\1\52\1\12\1\46\1\34\1\13\1\52\1\47\1\2\1\43\1\51\1\42"+
            "\1\3\3\52\1\20\1\32\1\21",
            "\1\56\5\uffff\1\55",
            "\1\57\16\uffff\1\61\1\60\1\uffff\1\62",
            "\1\63\1\64",
            "\1\66\4\uffff\1\65",
            "\1\67\6\uffff\1\72\1\70\4\uffff\1\71",
            "",
            "\1\74\1\uffff\12\75",
            "\1\100\6\uffff\1\101\3\uffff\1\77\2\uffff\1\76",
            "\1\102",
            "\1\103\3\uffff\1\104\11\uffff\1\105",
            "\1\107\20\uffff\1\106",
            "",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\115",
            "",
            "\1\116",
            "",
            "\1\117",
            "\1\121\1\uffff\1\120",
            "\1\123",
            "\1\125",
            "\1\130\21\uffff\1\127",
            "",
            "\1\131",
            "\1\132",
            "\1\134\6\uffff\1\136\2\uffff\1\135\6\uffff\1\133",
            "\1\140\1\uffff\1\141\11\uffff\1\137",
            "\1\144\3\uffff\1\143\5\uffff\1\142",
            "\1\146\23\uffff\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\75\1\uffff\12\53\13\uffff\1\75\37\uffff\1\75",
            "",
            "\1\153",
            "\1\154\6\uffff\1\155",
            "\1\156\7\uffff\1\157",
            "\1\160",
            "\1\161\20\uffff\1\162",
            "\1\163",
            "\1\164\3\uffff\1\165",
            "\1\166",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\167\7\52",
            "\1\171",
            "\12\52\7\uffff\32\52\4\uffff\1\172\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\175\11\52"+
            "\1\176\1\174\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\u0080\1\uffff\32\52",
            "\1\u0082",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0086\1\u0085",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d\16\uffff\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u0090\21"+
            "\52",
            "\1\u0091",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0092\12\uffff\1\u0093\10\uffff\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0099\3\uffff\1\u0098\10\uffff\1\u0097",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009f\3\uffff\1\u009e",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a3\2\uffff\1\u00a2",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00aa\5\uffff\1\u00a9",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00af",
            "\1\u00b1\1\uffff\1\u00b0",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc\1\u00bd\1\uffff\1\u00bf\11\uffff\1\u00be",
            "",
            "\1\u00c0",
            "\1\u00c3\16\uffff\1\u00c2\1\u00c1",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
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
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f8\12\uffff\1\u00f7",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fc\2\uffff\1\u00fb",
            "\1\u00fd",
            "\1\u00fe\20\uffff\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102\7\uffff\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\52\7\uffff\32\52\4\uffff\1\u0111\1\uffff\32\52",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\12\52\7\uffff\32\52\4\uffff\1\u0115\1\uffff\32\52",
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
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0125",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "\1\u012a",
            "\1\u012b\3\uffff\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
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
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0167\2\uffff\1\u0166",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181\4\uffff\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b\3\uffff\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "\1\u01a5",
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
            "\1\u01c1\4\uffff\1\u01c2",
            "\1\u01c3",
            "\12\52\7\uffff\32\52\4\uffff\1\u01c4\1\uffff\32\52",
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
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "",
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
            "\1\u01eb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01f0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u01fc\7\52",
            "\1\u01fd",
            "\1\u01fe",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ff",
            "\1\u0200\11\uffff\1\u0201",
            "\12\52\7\uffff\32\52\4\uffff\1\u0202\1\uffff\32\52",
            "\1\u0203",
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
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d\23\uffff\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0231",
            "\1\u0233\23\uffff\1\u0232",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0242",
            "\1\u0244\6\uffff\1\u0243\6\uffff\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0250",
            "\1\u0251",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0266\7\uffff\1\u0265",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277\11\uffff\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
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
            "\1\u0299",
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
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02ab",
            "\1\u02ac",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02f1",
            "\1\u02f2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02ff",
            "\1\u0300",
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
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0319",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\1\u0320",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0321",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0325",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0329",
            "\1\u032a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u032e",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "\1\u033b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u033c",
            "\1\u033d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u033e",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0345",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0346",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0347",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0348",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0349",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u034a",
            "\1\u034b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\1\u034f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0350",
            "\1\u0351",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0355",
            "\1\u0356",
            "\1\u0357",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "\12\52\7\uffff\32\52\4\uffff\1\u035f\1\uffff\32\52",
            "\1\u0360",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\1\u0364",
            "\1\u0365\14\uffff\1\u0366",
            "\1\u0367",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0368",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0369",
            "\1\u036a",
            "\1\u036b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u036c",
            "\1\u036d",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0378",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( FOREACH | SELECT | WHERE | WITH | AS | SET | IF | IN | STAR | REPEATER | CONTAINS | IS | HAS | MAX | PRINT | COMMA | FILTER | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_SQ_BRACKET | RIGHT_SQ_BRACKET | SEMICOLON | COLON | PERIOD | GT | LT | LTE | GTE | AND | OR | NOT | NOT_EQUAL | LOGIC_EQUALS | EQUALS | PLUS | MINUS | DIVIDE | COMPOUND_ADD | INCREMENT | NODE_TYPE | ATTRIBUTES | RESERVED_TYPES | ID | INTEGER | FLOAT | SPACE );";
        }
    }
 

}