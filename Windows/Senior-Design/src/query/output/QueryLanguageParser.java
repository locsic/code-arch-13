package query.output;


// $ANTLR 3.4 C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g 2014-03-02 10:14:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryLanguageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AS", "AST_CHILD", "ATTRIBUTE", "ATTRIBUTES", "BIN_OP", "BLOCK_STATEMENTS", "BOOL_EXP", "CHAIN_ID", "COLON", "COMMA", "COMPOUND_ADD", "COMP_ADD", "CONTAINS", "DEPTH", "DIVIDE", "DQOUTE", "EPSILON", "EQUALS", "ESC_SEQ", "EXPONENT", "FILTER", "FILTER_QUERY", "FLOAT", "FOREACH", "FOR_QUERY", "FUNCTION", "GT", "GTE", "HAS", "HEX_DIGIT", "ID", "IF", "IF_STATEMENT", "IN", "INCR", "INCREMENT", "INTEGER", "IN_CLAUSE", "IS", "LEFT_BRACKET", "LEFT_PAREN", "LEFT_SQ_BRACKET", "LOGIC_EQUALS", "LOGIC_OP", "LT", "LTE", "MAX", "MIN", "MINUS", "NESTED", "NODE", "NODE_CHAIN", "NODE_CHAIN_OP", "NODE_NAME", "NODE_TYPE", "NOT", "NOT_EQUAL", "OCTAL_ESC", "OR", "PERIOD", "PLUS", "PRINT", "PROPERTY", "QUERIES", "QUERY", "QUERY_NAME", "REPEATER", "RESERVED_TYPES", "RIGHT_BRACKET", "RIGHT_PAREN", "RIGHT_SQ_BRACKET", "SELECT", "SELECT_QUERY", "SEMICOLON", "SET", "SET_TABLE", "SPACE", "STAR", "STATEMENT", "STATEMENTS", "STRING", "TABLE", "UNICODE_ESC", "VAR", "VAR_ASSIGN", "VAR_NAME", "VAR_STMT", "WHERE", "WHERE_BLOCK", "WITH", "WITH_CLAUSE"
    };

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
    public static final int LEFT_BRACKET=44;
    public static final int LEFT_PAREN=45;
    public static final int LEFT_SQ_BRACKET=46;
    public static final int LOGIC_EQUALS=47;
    public static final int LOGIC_OP=48;
    public static final int LT=49;
    public static final int LTE=50;
    public static final int MAX=51;
    public static final int MIN=52;
    public static final int MINUS=53;
    public static final int NESTED=54;
    public static final int NODE=55;
    public static final int NODE_CHAIN=56;
    public static final int NODE_CHAIN_OP=57;
    public static final int NODE_NAME=58;
    public static final int NODE_TYPE=59;
    public static final int NOT=60;
    public static final int NOT_EQUAL=61;
    public static final int OCTAL_ESC=62;
    public static final int OR=63;
    public static final int PERIOD=64;
    public static final int PLUS=65;
    public static final int PRINT=66;
    public static final int PROPERTY=67;
    public static final int QUERIES=68;
    public static final int QUERY=69;
    public static final int QUERY_NAME=70;
    public static final int REPEATER=71;
    public static final int RESERVED_TYPES=72;
    public static final int RIGHT_BRACKET=73;
    public static final int RIGHT_PAREN=74;
    public static final int RIGHT_SQ_BRACKET=75;
    public static final int SELECT=76;
    public static final int SELECT_QUERY=77;
    public static final int SEMICOLON=78;
    public static final int SET=79;
    public static final int SET_TABLE=80;
    public static final int SPACE=81;
    public static final int STAR=82;
    public static final int STATEMENT=83;
    public static final int STATEMENTS=84;
    public static final int STRING=85;
    public static final int TABLE=86;
    public static final int UNICODE_ESC=87;
    public static final int VAR=88;
    public static final int VAR_ASSIGN=89;
    public static final int VAR_NAME=90;
    public static final int VAR_STMT=91;
    public static final int WHERE=92;
    public static final int WHERE_BLOCK=93;
    public static final int WITH=94;
    public static final int WITH_CLAUSE=95;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public QueryLanguageParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public QueryLanguageParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return QueryLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g"; }


    public static class startrule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "startrule"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:45:1: startrule : queries -> ^( QUERIES queries ) ;
    public final QueryLanguageParser.startrule_return startrule() throws RecognitionException {
        QueryLanguageParser.startrule_return retval = new QueryLanguageParser.startrule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.queries_return queries1 =null;


        RewriteRuleSubtreeStream stream_queries=new RewriteRuleSubtreeStream(adaptor,"rule queries");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:46:2: ( queries -> ^( QUERIES queries ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:46:4: queries
            {
            pushFollow(FOLLOW_queries_in_startrule283);
            queries1=queries();

            state._fsp--;

            stream_queries.add(queries1.getTree());

            // AST REWRITE
            // elements: queries
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 46:12: -> ^( QUERIES queries )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:46:15: ^( QUERIES queries )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(QUERIES, "QUERIES")
                , root_1);

                adaptor.addChild(root_1, stream_queries.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "startrule"


    public static class queries_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "queries"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:49:1: queries : query ( query )* ;
    public final QueryLanguageParser.queries_return queries() throws RecognitionException {
        QueryLanguageParser.queries_return retval = new QueryLanguageParser.queries_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.query_return query2 =null;

        QueryLanguageParser.query_return query3 =null;



        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:49:9: ( query ( query )* )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:49:11: query ( query )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_query_in_queries301);
            query2=query();

            state._fsp--;

            adaptor.addChild(root_0, query2.getTree());

            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:49:17: ( query )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FOREACH||LA1_0==ID||LA1_0==SELECT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:49:17: query
            	    {
            	    pushFollow(FOLLOW_query_in_queries303);
            	    query3=query();

            	    state._fsp--;

            	    adaptor.addChild(root_0, query3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "queries"


    public static class query_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:1: query : ( query_name foreach_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) ) | query_name select_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) ) | query_name ID FILTER ID print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) ) );
    public final QueryLanguageParser.query_return query() throws RecognitionException {
        QueryLanguageParser.query_return retval = new QueryLanguageParser.query_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID11=null;
        Token FILTER12=null;
        Token ID13=null;
        QueryLanguageParser.query_name_return query_name4 =null;

        QueryLanguageParser.foreach_query_return foreach_query5 =null;

        QueryLanguageParser.print_stmt_return print_stmt6 =null;

        QueryLanguageParser.query_name_return query_name7 =null;

        QueryLanguageParser.select_query_return select_query8 =null;

        QueryLanguageParser.print_stmt_return print_stmt9 =null;

        QueryLanguageParser.query_name_return query_name10 =null;

        QueryLanguageParser.print_stmt_return print_stmt14 =null;


        Object ID11_tree=null;
        Object FILTER12_tree=null;
        Object ID13_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_FILTER=new RewriteRuleTokenStream(adaptor,"token FILTER");
        RewriteRuleSubtreeStream stream_select_query=new RewriteRuleSubtreeStream(adaptor,"rule select_query");
        RewriteRuleSubtreeStream stream_print_stmt=new RewriteRuleSubtreeStream(adaptor,"rule print_stmt");
        RewriteRuleSubtreeStream stream_foreach_query=new RewriteRuleSubtreeStream(adaptor,"rule foreach_query");
        RewriteRuleSubtreeStream stream_query_name=new RewriteRuleSubtreeStream(adaptor,"rule query_name");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:7: ( query_name foreach_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) ) | query_name select_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) ) | query_name ID FILTER ID print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==COLON) ) {
                    switch ( input.LA(3) ) {
                    case FOREACH:
                        {
                        alt2=1;
                        }
                        break;
                    case SELECT:
                        {
                        alt2=2;
                        }
                        break;
                    case ID:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;

                    }

                }
                else if ( (LA2_1==FILTER) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case FOREACH:
                {
                alt2=1;
                }
                break;
            case SELECT:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:9: query_name foreach_query print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query314);
                    query_name4=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name4.getTree());

                    pushFollow(FOLLOW_foreach_query_in_query316);
                    foreach_query5=foreach_query();

                    state._fsp--;

                    stream_foreach_query.add(foreach_query5.getTree());

                    pushFollow(FOLLOW_print_stmt_in_query318);
                    print_stmt6=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt6.getTree());

                    // AST REWRITE
                    // elements: print_stmt, query_name, foreach_query
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:45: -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:48: ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:56: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:81: ^( FOR_QUERY foreach_query )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_QUERY, "FOR_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, stream_foreach_query.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:108: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:116: ( print_stmt )?
                        if ( stream_print_stmt.hasNext() ) {
                            adaptor.addChild(root_2, stream_print_stmt.nextTree());

                        }
                        stream_print_stmt.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:4: query_name select_query print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query349);
                    query_name7=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name7.getTree());

                    pushFollow(FOLLOW_select_query_in_query351);
                    select_query8=select_query();

                    state._fsp--;

                    stream_select_query.add(select_query8.getTree());

                    pushFollow(FOLLOW_print_stmt_in_query353);
                    print_stmt9=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt9.getTree());

                    // AST REWRITE
                    // elements: print_stmt, select_query, query_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:39: -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:42: ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:50: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:75: ^( SELECT_QUERY select_query )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SELECT_QUERY, "SELECT_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, stream_select_query.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:104: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:112: ( print_stmt )?
                        if ( stream_print_stmt.hasNext() ) {
                            adaptor.addChild(root_2, stream_print_stmt.nextTree());

                        }
                        stream_print_stmt.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:54:4: query_name ID FILTER ID print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query384);
                    query_name10=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name10.getTree());

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_query386);  
                    stream_ID.add(ID11);


                    FILTER12=(Token)match(input,FILTER,FOLLOW_FILTER_in_query388);  
                    stream_FILTER.add(FILTER12);


                    ID13=(Token)match(input,ID,FOLLOW_ID_in_query390);  
                    stream_ID.add(ID13);


                    pushFollow(FOLLOW_print_stmt_in_query392);
                    print_stmt14=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt14.getTree());

                    // AST REWRITE
                    // elements: ID, FILTER, print_stmt, ID, query_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 54:39: -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:54:42: ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:54:50: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:54:75: ^( FILTER_QUERY ID FILTER ID )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FILTER_QUERY, "FILTER_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_2, 
                        stream_FILTER.nextNode()
                        );

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:54:104: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:54:112: ( print_stmt )?
                        if ( stream_print_stmt.hasNext() ) {
                            adaptor.addChild(root_2, stream_print_stmt.nextTree());

                        }
                        stream_print_stmt.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query"


    public static class query_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query_name"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:57:1: query_name : ( ID COLON -> ID | -> EPSILON );
    public final QueryLanguageParser.query_name_return query_name() throws RecognitionException {
        QueryLanguageParser.query_name_return retval = new QueryLanguageParser.query_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID15=null;
        Token COLON16=null;

        Object ID15_tree=null;
        Object COLON16_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:58:2: ( ID COLON -> ID | -> EPSILON )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==COLON) ) {
                    alt3=1;
                }
                else if ( (LA3_1==FILTER) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==FOREACH||LA3_0==SELECT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:58:4: ID COLON
                    {
                    ID15=(Token)match(input,ID,FOLLOW_ID_in_query_name434);  
                    stream_ID.add(ID15);


                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_query_name436);  
                    stream_COLON.add(COLON16);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 58:13: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:59:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query_name"


    public static class foreach_query_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "foreach_query"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:62:1: foreach_query : FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements ) ;
    public final QueryLanguageParser.foreach_query_return foreach_query() throws RecognitionException {
        QueryLanguageParser.foreach_query_return retval = new QueryLanguageParser.foreach_query_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FOREACH17=null;
        Token LEFT_PAREN18=null;
        Token ID20=null;
        Token RIGHT_PAREN22=null;
        QueryLanguageParser.node_chain_return node_chain19 =null;

        QueryLanguageParser.in_clause_return in_clause21 =null;

        QueryLanguageParser.with_clause_return with_clause23 =null;

        QueryLanguageParser.foreach_where_return foreach_where24 =null;

        QueryLanguageParser.stat_statements_return stat_statements25 =null;


        Object FOREACH17_tree=null;
        Object LEFT_PAREN18_tree=null;
        Object ID20_tree=null;
        Object RIGHT_PAREN22_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_FOREACH=new RewriteRuleTokenStream(adaptor,"token FOREACH");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_in_clause=new RewriteRuleSubtreeStream(adaptor,"rule in_clause");
        RewriteRuleSubtreeStream stream_stat_statements=new RewriteRuleSubtreeStream(adaptor,"rule stat_statements");
        RewriteRuleSubtreeStream stream_with_clause=new RewriteRuleSubtreeStream(adaptor,"rule with_clause");
        RewriteRuleSubtreeStream stream_foreach_where=new RewriteRuleSubtreeStream(adaptor,"rule foreach_where");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:2: ( FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:4: FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements
            {
            FOREACH17=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_query458);  
            stream_FOREACH.add(FOREACH17);


            LEFT_PAREN18=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_foreach_query460);  
            stream_LEFT_PAREN.add(LEFT_PAREN18);


            pushFollow(FOLLOW_node_chain_in_foreach_query462);
            node_chain19=node_chain();

            state._fsp--;

            stream_node_chain.add(node_chain19.getTree());

            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:34: ( ID )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:34: ID
                    {
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_foreach_query464);  
                    stream_ID.add(ID20);


                    }
                    break;

            }


            pushFollow(FOLLOW_in_clause_in_foreach_query467);
            in_clause21=in_clause();

            state._fsp--;

            stream_in_clause.add(in_clause21.getTree());

            RIGHT_PAREN22=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_foreach_query469);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN22);


            pushFollow(FOLLOW_with_clause_in_foreach_query471);
            with_clause23=with_clause();

            state._fsp--;

            stream_with_clause.add(with_clause23.getTree());

            pushFollow(FOLLOW_foreach_where_in_foreach_query473);
            foreach_where24=foreach_where();

            state._fsp--;

            stream_foreach_where.add(foreach_where24.getTree());

            pushFollow(FOLLOW_stat_statements_in_foreach_query475);
            stat_statements25=stat_statements();

            state._fsp--;

            stream_stat_statements.add(stat_statements25.getTree());

            // AST REWRITE
            // elements: stat_statements, node_chain, ID, foreach_where, in_clause, with_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:102: -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:105: ^( NODE_CHAIN node_chain )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:130: ^( CHAIN_ID ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:141: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:146: ^( IN_CLAUSE in_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IN_CLAUSE, "IN_CLAUSE")
                , root_1);

                adaptor.addChild(root_1, stream_in_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_with_clause.nextTree());

                adaptor.addChild(root_0, stream_foreach_where.nextTree());

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:195: ^( STATEMENTS stat_statements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                adaptor.addChild(root_1, stream_stat_statements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "foreach_query"


    public static class foreach_where_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "foreach_where"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:65:1: foreach_where : ( WHERE boolean_exp -> ^( WHERE_BLOCK boolean_exp ) | -> WHERE_BLOCK );
    public final QueryLanguageParser.foreach_where_return foreach_where() throws RecognitionException {
        QueryLanguageParser.foreach_where_return retval = new QueryLanguageParser.foreach_where_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE26=null;
        QueryLanguageParser.boolean_exp_return boolean_exp27 =null;


        Object WHERE26_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:2: ( WHERE boolean_exp -> ^( WHERE_BLOCK boolean_exp ) | -> WHERE_BLOCK )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WHERE) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==DEPTH||LA5_0==FOREACH||(LA5_0 >= ID && LA5_0 <= IF)||LA5_0==INTEGER||LA5_0==LEFT_BRACKET||LA5_0==LEFT_SQ_BRACKET||LA5_0==LT||(LA5_0 >= MAX && LA5_0 <= MIN)||LA5_0==PRINT||(LA5_0 >= RESERVED_TYPES && LA5_0 <= RIGHT_BRACKET)||LA5_0==SELECT||LA5_0==SET||LA5_0==STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:4: WHERE boolean_exp
                    {
                    WHERE26=(Token)match(input,WHERE,FOLLOW_WHERE_in_foreach_where516);  
                    stream_WHERE.add(WHERE26);


                    pushFollow(FOLLOW_boolean_exp_in_foreach_where518);
                    boolean_exp27=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp27.getTree());

                    // AST REWRITE
                    // elements: boolean_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:22: -> ^( WHERE_BLOCK boolean_exp )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:66:25: ^( WHERE_BLOCK boolean_exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHERE_BLOCK, "WHERE_BLOCK")
                        , root_1);

                        adaptor.addChild(root_1, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:67:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:4: -> WHERE_BLOCK
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(WHERE_BLOCK, "WHERE_BLOCK")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "foreach_where"


    public static class select_query_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_query"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:70:1: select_query : SELECT LEFT_PAREN node_chain ( ID )? node_chain_op block in_clause RIGHT_PAREN with_clause select_where -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( NODE_CHAIN_OP node_chain_op ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where ;
    public final QueryLanguageParser.select_query_return select_query() throws RecognitionException {
        QueryLanguageParser.select_query_return retval = new QueryLanguageParser.select_query_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT28=null;
        Token LEFT_PAREN29=null;
        Token ID31=null;
        Token RIGHT_PAREN35=null;
        QueryLanguageParser.node_chain_return node_chain30 =null;

        QueryLanguageParser.node_chain_op_return node_chain_op32 =null;

        QueryLanguageParser.block_return block33 =null;

        QueryLanguageParser.in_clause_return in_clause34 =null;

        QueryLanguageParser.with_clause_return with_clause36 =null;

        QueryLanguageParser.select_where_return select_where37 =null;


        Object SELECT28_tree=null;
        Object LEFT_PAREN29_tree=null;
        Object ID31_tree=null;
        Object RIGHT_PAREN35_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_node_chain_op=new RewriteRuleSubtreeStream(adaptor,"rule node_chain_op");
        RewriteRuleSubtreeStream stream_in_clause=new RewriteRuleSubtreeStream(adaptor,"rule in_clause");
        RewriteRuleSubtreeStream stream_with_clause=new RewriteRuleSubtreeStream(adaptor,"rule with_clause");
        RewriteRuleSubtreeStream stream_select_where=new RewriteRuleSubtreeStream(adaptor,"rule select_where");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:2: ( SELECT LEFT_PAREN node_chain ( ID )? node_chain_op block in_clause RIGHT_PAREN with_clause select_where -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( NODE_CHAIN_OP node_chain_op ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:4: SELECT LEFT_PAREN node_chain ( ID )? node_chain_op block in_clause RIGHT_PAREN with_clause select_where
            {
            SELECT28=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_query544);  
            stream_SELECT.add(SELECT28);


            LEFT_PAREN29=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_select_query546);  
            stream_LEFT_PAREN.add(LEFT_PAREN29);


            pushFollow(FOLLOW_node_chain_in_select_query548);
            node_chain30=node_chain();

            state._fsp--;

            stream_node_chain.add(node_chain30.getTree());

            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:33: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:33: ID
                    {
                    ID31=(Token)match(input,ID,FOLLOW_ID_in_select_query550);  
                    stream_ID.add(ID31);


                    }
                    break;

            }


            pushFollow(FOLLOW_node_chain_op_in_select_query553);
            node_chain_op32=node_chain_op();

            state._fsp--;

            stream_node_chain_op.add(node_chain_op32.getTree());

            pushFollow(FOLLOW_block_in_select_query555);
            block33=block();

            state._fsp--;

            stream_block.add(block33.getTree());

            pushFollow(FOLLOW_in_clause_in_select_query557);
            in_clause34=in_clause();

            state._fsp--;

            stream_in_clause.add(in_clause34.getTree());

            RIGHT_PAREN35=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_select_query559);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN35);


            pushFollow(FOLLOW_with_clause_in_select_query561);
            with_clause36=with_clause();

            state._fsp--;

            stream_with_clause.add(with_clause36.getTree());

            pushFollow(FOLLOW_select_where_in_select_query563);
            select_where37=select_where();

            state._fsp--;

            stream_select_where.add(select_where37.getTree());

            // AST REWRITE
            // elements: ID, block, node_chain_op, select_where, with_clause, node_chain, in_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:104: -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( NODE_CHAIN_OP node_chain_op ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:107: ^( NODE_CHAIN node_chain )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:132: ^( CHAIN_ID ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:143: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:148: ^( NODE_CHAIN_OP node_chain_op )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN_OP, "NODE_CHAIN_OP")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain_op.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:180: ^( IN_CLAUSE in_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IN_CLAUSE, "IN_CLAUSE")
                , root_1);

                adaptor.addChild(root_1, stream_in_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:203: ^( BLOCK_STATEMENTS block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK_STATEMENTS, "BLOCK_STATEMENTS")
                , root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_with_clause.nextTree());

                adaptor.addChild(root_0, stream_select_where.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_query"


    public static class select_where_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_where"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:73:1: select_where : ( WHERE boolean_exp stat_statements -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) ) | -> WHERE_BLOCK );
    public final QueryLanguageParser.select_where_return select_where() throws RecognitionException {
        QueryLanguageParser.select_where_return retval = new QueryLanguageParser.select_where_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE38=null;
        QueryLanguageParser.boolean_exp_return boolean_exp39 =null;

        QueryLanguageParser.stat_statements_return stat_statements40 =null;


        Object WHERE38_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_stat_statements=new RewriteRuleSubtreeStream(adaptor,"rule stat_statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:74:2: ( WHERE boolean_exp stat_statements -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) ) | -> WHERE_BLOCK )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WHERE) ) {
                alt7=1;
            }
            else if ( (LA7_0==EOF||LA7_0==DEPTH||LA7_0==FOREACH||(LA7_0 >= ID && LA7_0 <= IF)||LA7_0==INTEGER||LA7_0==LEFT_BRACKET||LA7_0==LEFT_SQ_BRACKET||LA7_0==LT||(LA7_0 >= MAX && LA7_0 <= MIN)||LA7_0==PRINT||(LA7_0 >= RESERVED_TYPES && LA7_0 <= RIGHT_BRACKET)||LA7_0==SELECT||LA7_0==SET||LA7_0==STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:74:4: WHERE boolean_exp stat_statements
                    {
                    WHERE38=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_where611);  
                    stream_WHERE.add(WHERE38);


                    pushFollow(FOLLOW_boolean_exp_in_select_where613);
                    boolean_exp39=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp39.getTree());

                    pushFollow(FOLLOW_stat_statements_in_select_where615);
                    stat_statements40=stat_statements();

                    state._fsp--;

                    stream_stat_statements.add(stat_statements40.getTree());

                    // AST REWRITE
                    // elements: stat_statements, boolean_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:38: -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:74:41: ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHERE_BLOCK, "WHERE_BLOCK")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:74:55: ^( BOOL_EXP boolean_exp )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_2);

                        adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:74:79: ^( STATEMENTS stat_statements )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                        , root_2);

                        adaptor.addChild(root_2, stream_stat_statements.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:75:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:4: -> WHERE_BLOCK
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(WHERE_BLOCK, "WHERE_BLOCK")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_where"


    public static class in_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "in_clause"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:77:1: in_clause : ( IN ID -> ID | -> EPSILON );
    public final QueryLanguageParser.in_clause_return in_clause() throws RecognitionException {
        QueryLanguageParser.in_clause_return retval = new QueryLanguageParser.in_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IN41=null;
        Token ID42=null;

        Object IN41_tree=null;
        Object ID42_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:2: ( IN ID -> ID | -> EPSILON )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IN) ) {
                alt8=1;
            }
            else if ( (LA8_0==RIGHT_PAREN) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:4: IN ID
                    {
                    IN41=(Token)match(input,IN,FOLLOW_IN_in_in_clause650);  
                    stream_IN.add(IN41);


                    ID42=(Token)match(input,ID,FOLLOW_ID_in_in_clause652);  
                    stream_ID.add(ID42);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:10: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:79:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "in_clause"


    public static class with_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "with_clause"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:81:1: with_clause : ( WITH variable AS ID -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) ) | -> WITH_CLAUSE );
    public final QueryLanguageParser.with_clause_return with_clause() throws RecognitionException {
        QueryLanguageParser.with_clause_return retval = new QueryLanguageParser.with_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WITH43=null;
        Token AS45=null;
        Token ID46=null;
        QueryLanguageParser.variable_return variable44 =null;


        Object WITH43_tree=null;
        Object AS45_tree=null;
        Object ID46_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:2: ( WITH variable AS ID -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) ) | -> WITH_CLAUSE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WITH) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||LA9_0==DEPTH||LA9_0==FOREACH||(LA9_0 >= ID && LA9_0 <= IF)||LA9_0==INTEGER||LA9_0==LEFT_BRACKET||LA9_0==LEFT_SQ_BRACKET||LA9_0==LT||(LA9_0 >= MAX && LA9_0 <= MIN)||LA9_0==PRINT||(LA9_0 >= RESERVED_TYPES && LA9_0 <= RIGHT_BRACKET)||LA9_0==SELECT||LA9_0==SET||LA9_0==STRING||LA9_0==WHERE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:4: WITH variable AS ID
                    {
                    WITH43=(Token)match(input,WITH,FOLLOW_WITH_in_with_clause674);  
                    stream_WITH.add(WITH43);


                    pushFollow(FOLLOW_variable_in_with_clause676);
                    variable44=variable();

                    state._fsp--;

                    stream_variable.add(variable44.getTree());

                    AS45=(Token)match(input,AS,FOLLOW_AS_in_with_clause678);  
                    stream_AS.add(AS45);


                    ID46=(Token)match(input,ID,FOLLOW_ID_in_with_clause680);  
                    stream_ID.add(ID46);


                    // AST REWRITE
                    // elements: ID, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:24: -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:27: ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WITH_CLAUSE, "WITH_CLAUSE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:41: ^( VAR variable )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_2);

                        adaptor.addChild(root_2, stream_variable.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:57: ^( CHAIN_ID ID )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:83:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:4: -> WITH_CLAUSE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(WITH_CLAUSE, "WITH_CLAUSE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "with_clause"


    public static class node_chain_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "node_chain_op"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:85:1: node_chain_op : ( STAR node_chain ( ID )? -> ^( STAR node_chain ^( CHAIN_ID ( ID )? ) ) | REPEATER node_chain ( ID )? -> ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) ) | -> EPSILON );
    public final QueryLanguageParser.node_chain_op_return node_chain_op() throws RecognitionException {
        QueryLanguageParser.node_chain_op_return retval = new QueryLanguageParser.node_chain_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR47=null;
        Token ID49=null;
        Token REPEATER50=null;
        Token ID52=null;
        QueryLanguageParser.node_chain_return node_chain48 =null;

        QueryLanguageParser.node_chain_return node_chain51 =null;


        Object STAR47_tree=null;
        Object ID49_tree=null;
        Object REPEATER50_tree=null;
        Object ID52_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_REPEATER=new RewriteRuleTokenStream(adaptor,"token REPEATER");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:2: ( STAR node_chain ( ID )? -> ^( STAR node_chain ^( CHAIN_ID ( ID )? ) ) | REPEATER node_chain ( ID )? -> ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) ) | -> EPSILON )
            int alt12=3;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt12=1;
                }
                break;
            case REPEATER:
                {
                alt12=2;
                }
                break;
            case IN:
            case LEFT_BRACKET:
            case RIGHT_PAREN:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:4: STAR node_chain ( ID )?
                    {
                    STAR47=(Token)match(input,STAR,FOLLOW_STAR_in_node_chain_op715);  
                    stream_STAR.add(STAR47);


                    pushFollow(FOLLOW_node_chain_in_node_chain_op717);
                    node_chain48=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain48.getTree());

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:20: ( ID )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:20: ID
                            {
                            ID49=(Token)match(input,ID,FOLLOW_ID_in_node_chain_op719);  
                            stream_ID.add(ID49);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ID, STAR, node_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:24: -> ^( STAR node_chain ^( CHAIN_ID ( ID )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:27: ^( STAR node_chain ^( CHAIN_ID ( ID )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:45: ^( CHAIN_ID ( ID )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:56: ( ID )?
                        if ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:4: REPEATER node_chain ( ID )?
                    {
                    REPEATER50=(Token)match(input,REPEATER,FOLLOW_REPEATER_in_node_chain_op740);  
                    stream_REPEATER.add(REPEATER50);


                    pushFollow(FOLLOW_node_chain_in_node_chain_op742);
                    node_chain51=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain51.getTree());

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:24: ( ID )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:24: ID
                            {
                            ID52=(Token)match(input,ID,FOLLOW_ID_in_node_chain_op744);  
                            stream_ID.add(ID52);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ID, REPEATER, node_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:28: -> ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:31: ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_REPEATER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:53: ^( CHAIN_ID ( ID )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:64: ( ID )?
                        if ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:88:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "node_chain_op"


    public static class node_chain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "node_chain"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:90:1: node_chain : ( node PERIOD node_chain -> ^( NODE node ) ^( NODE_CHAIN node_chain ) | node COLON attr -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) ) | node -> ^( NODE ^( NODE_NAME node ) ) | ast_child PERIOD node_chain -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) ) | ast_child -> ^( NODE ^( AST_CHILD ast_child ) ) | node keywords -> ^( NODE ^( NODE_NAME node ) keywords ) | ID PERIOD node_chain -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) ) | property -> ^( PROPERTY property ) );
    public final QueryLanguageParser.node_chain_return node_chain() throws RecognitionException {
        QueryLanguageParser.node_chain_return retval = new QueryLanguageParser.node_chain_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD54=null;
        Token COLON57=null;
        Token PERIOD61=null;
        Token ID66=null;
        Token PERIOD67=null;
        QueryLanguageParser.node_return node53 =null;

        QueryLanguageParser.node_chain_return node_chain55 =null;

        QueryLanguageParser.node_return node56 =null;

        QueryLanguageParser.attr_return attr58 =null;

        QueryLanguageParser.node_return node59 =null;

        QueryLanguageParser.ast_child_return ast_child60 =null;

        QueryLanguageParser.node_chain_return node_chain62 =null;

        QueryLanguageParser.ast_child_return ast_child63 =null;

        QueryLanguageParser.node_return node64 =null;

        QueryLanguageParser.keywords_return keywords65 =null;

        QueryLanguageParser.node_chain_return node_chain68 =null;

        QueryLanguageParser.property_return property69 =null;


        Object PERIOD54_tree=null;
        Object COLON57_tree=null;
        Object PERIOD61_tree=null;
        Object ID66_tree=null;
        Object PERIOD67_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_ast_child=new RewriteRuleSubtreeStream(adaptor,"rule ast_child");
        RewriteRuleSubtreeStream stream_node=new RewriteRuleSubtreeStream(adaptor,"rule node");
        RewriteRuleSubtreeStream stream_keywords=new RewriteRuleSubtreeStream(adaptor,"rule keywords");
        RewriteRuleSubtreeStream stream_property=new RewriteRuleSubtreeStream(adaptor,"rule property");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:2: ( node PERIOD node_chain -> ^( NODE node ) ^( NODE_CHAIN node_chain ) | node COLON attr -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) ) | node -> ^( NODE ^( NODE_NAME node ) ) | ast_child PERIOD node_chain -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) ) | ast_child -> ^( NODE ^( AST_CHILD ast_child ) ) | node keywords -> ^( NODE ^( NODE_NAME node ) keywords ) | ID PERIOD node_chain -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) ) | property -> ^( PROPERTY property ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case LT:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==NODE_TYPE) ) {
                    int LA13_5 = input.LA(3);

                    if ( (LA13_5==GT) ) {
                        switch ( input.LA(4) ) {
                        case PERIOD:
                            {
                            int LA13_14 = input.LA(5);

                            if ( (LA13_14==CONTAINS||LA13_14==HAS||LA13_14==IS) ) {
                                alt13=6;
                            }
                            else if ( (LA13_14==ID||LA13_14==LEFT_BRACKET||LA13_14==LEFT_SQ_BRACKET||LA13_14==LT) ) {
                                alt13=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 14, input);

                                throw nvae;

                            }
                            }
                            break;
                        case COLON:
                            {
                            alt13=2;
                            }
                            break;
                        case EOF:
                        case AND:
                        case AS:
                        case COMMA:
                        case COMPOUND_ADD:
                        case DEPTH:
                        case DIVIDE:
                        case EQUALS:
                        case FOREACH:
                        case GT:
                        case GTE:
                        case ID:
                        case IF:
                        case IN:
                        case INCREMENT:
                        case INTEGER:
                        case LEFT_BRACKET:
                        case LEFT_SQ_BRACKET:
                        case LOGIC_EQUALS:
                        case LT:
                        case LTE:
                        case MAX:
                        case MIN:
                        case MINUS:
                        case NOT_EQUAL:
                        case OR:
                        case PLUS:
                        case PRINT:
                        case REPEATER:
                        case RESERVED_TYPES:
                        case RIGHT_BRACKET:
                        case RIGHT_PAREN:
                        case SELECT:
                        case SEMICOLON:
                        case SET:
                        case STAR:
                        case STRING:
                            {
                            alt13=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 10, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case LEFT_SQ_BRACKET:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==ID) ) {
                    int LA13_6 = input.LA(3);

                    if ( (LA13_6==RIGHT_SQ_BRACKET) ) {
                        switch ( input.LA(4) ) {
                        case PERIOD:
                            {
                            int LA13_14 = input.LA(5);

                            if ( (LA13_14==CONTAINS||LA13_14==HAS||LA13_14==IS) ) {
                                alt13=6;
                            }
                            else if ( (LA13_14==ID||LA13_14==LEFT_BRACKET||LA13_14==LEFT_SQ_BRACKET||LA13_14==LT) ) {
                                alt13=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 14, input);

                                throw nvae;

                            }
                            }
                            break;
                        case COLON:
                            {
                            alt13=2;
                            }
                            break;
                        case EOF:
                        case AND:
                        case AS:
                        case COMMA:
                        case COMPOUND_ADD:
                        case DEPTH:
                        case DIVIDE:
                        case EQUALS:
                        case FOREACH:
                        case GT:
                        case GTE:
                        case ID:
                        case IF:
                        case IN:
                        case INCREMENT:
                        case INTEGER:
                        case LEFT_BRACKET:
                        case LEFT_SQ_BRACKET:
                        case LOGIC_EQUALS:
                        case LT:
                        case LTE:
                        case MAX:
                        case MIN:
                        case MINUS:
                        case NOT_EQUAL:
                        case OR:
                        case PLUS:
                        case PRINT:
                        case REPEATER:
                        case RESERVED_TYPES:
                        case RIGHT_BRACKET:
                        case RIGHT_PAREN:
                        case SELECT:
                        case SEMICOLON:
                        case SET:
                        case STAR:
                        case STRING:
                            {
                            alt13=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 11, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }
                }
                break;
            case LEFT_BRACKET:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==ID) ) {
                    int LA13_7 = input.LA(3);

                    if ( (LA13_7==RIGHT_BRACKET) ) {
                        int LA13_12 = input.LA(4);

                        if ( (LA13_12==PERIOD) ) {
                            alt13=4;
                        }
                        else if ( (LA13_12==EOF||(LA13_12 >= AND && LA13_12 <= AS)||(LA13_12 >= COMMA && LA13_12 <= COMPOUND_ADD)||(LA13_12 >= DEPTH && LA13_12 <= DIVIDE)||LA13_12==EQUALS||LA13_12==FOREACH||(LA13_12 >= GT && LA13_12 <= GTE)||(LA13_12 >= ID && LA13_12 <= IF)||LA13_12==IN||(LA13_12 >= INCREMENT && LA13_12 <= INTEGER)||LA13_12==LEFT_BRACKET||(LA13_12 >= LEFT_SQ_BRACKET && LA13_12 <= LOGIC_EQUALS)||(LA13_12 >= LT && LA13_12 <= MINUS)||LA13_12==NOT_EQUAL||LA13_12==OR||(LA13_12 >= PLUS && LA13_12 <= PRINT)||(LA13_12 >= REPEATER && LA13_12 <= RIGHT_PAREN)||LA13_12==SELECT||(LA13_12 >= SEMICOLON && LA13_12 <= SET)||LA13_12==STAR||LA13_12==STRING) ) {
                            alt13=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 12, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA13_4 = input.LA(2);

                if ( (LA13_4==PERIOD) ) {
                    int LA13_8 = input.LA(3);

                    if ( (LA13_8==CONTAINS) ) {
                        alt13=8;
                    }
                    else if ( (LA13_8==ID||LA13_8==LEFT_BRACKET||LA13_8==LEFT_SQ_BRACKET||LA13_8==LT) ) {
                        alt13=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 8, input);

                        throw nvae;

                    }
                }
                else if ( (LA13_4==EOF||(LA13_4 >= AND && LA13_4 <= AS)||(LA13_4 >= COMMA && LA13_4 <= COMPOUND_ADD)||(LA13_4 >= DEPTH && LA13_4 <= DIVIDE)||LA13_4==EQUALS||LA13_4==FOREACH||(LA13_4 >= GT && LA13_4 <= GTE)||(LA13_4 >= ID && LA13_4 <= IF)||LA13_4==IN||(LA13_4 >= INCREMENT && LA13_4 <= INTEGER)||LA13_4==LEFT_BRACKET||(LA13_4 >= LEFT_SQ_BRACKET && LA13_4 <= LOGIC_EQUALS)||(LA13_4 >= LT && LA13_4 <= MINUS)||LA13_4==NOT_EQUAL||LA13_4==OR||(LA13_4 >= PLUS && LA13_4 <= PRINT)||(LA13_4 >= REPEATER && LA13_4 <= RIGHT_PAREN)||LA13_4==SELECT||(LA13_4 >= SEMICOLON && LA13_4 <= SET)||LA13_4==STAR||LA13_4==STRING) ) {
                    alt13=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:4: node PERIOD node_chain
                    {
                    pushFollow(FOLLOW_node_in_node_chain778);
                    node53=node();

                    state._fsp--;

                    stream_node.add(node53.getTree());

                    PERIOD54=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain780);  
                    stream_PERIOD.add(PERIOD54);


                    pushFollow(FOLLOW_node_chain_in_node_chain782);
                    node_chain55=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain55.getTree());

                    // AST REWRITE
                    // elements: node_chain, node
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:31: -> ^( NODE node ) ^( NODE_CHAIN node_chain )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:34: ^( NODE node )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        adaptor.addChild(root_1, stream_node.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:47: ^( NODE_CHAIN node_chain )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                        , root_1);

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:4: node COLON attr
                    {
                    pushFollow(FOLLOW_node_in_node_chain805);
                    node56=node();

                    state._fsp--;

                    stream_node.add(node56.getTree());

                    COLON57=(Token)match(input,COLON,FOLLOW_COLON_in_node_chain807);  
                    stream_COLON.add(COLON57);


                    pushFollow(FOLLOW_attr_in_node_chain809);
                    attr58=attr();

                    state._fsp--;

                    stream_attr.add(attr58.getTree());

                    // AST REWRITE
                    // elements: attr, node
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:24: -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:27: ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:34: ^( NODE_NAME node )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_node.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:52: ^( ATTRIBUTE attr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ATTRIBUTE, "ATTRIBUTE")
                        , root_2);

                        adaptor.addChild(root_2, stream_attr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:93:4: node
                    {
                    pushFollow(FOLLOW_node_in_node_chain836);
                    node59=node();

                    state._fsp--;

                    stream_node.add(node59.getTree());

                    // AST REWRITE
                    // elements: node
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 93:15: -> ^( NODE ^( NODE_NAME node ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:93:18: ^( NODE ^( NODE_NAME node ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:93:25: ^( NODE_NAME node )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_node.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:94:6: ast_child PERIOD node_chain
                    {
                    pushFollow(FOLLOW_ast_child_in_node_chain861);
                    ast_child60=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child60.getTree());

                    PERIOD61=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain863);  
                    stream_PERIOD.add(PERIOD61);


                    pushFollow(FOLLOW_node_chain_in_node_chain865);
                    node_chain62=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain62.getTree());

                    // AST REWRITE
                    // elements: node_chain, ast_child
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:45: -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:94:48: ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:94:55: ^( AST_CHILD ast_child )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AST_CHILD, "AST_CHILD")
                        , root_2);

                        adaptor.addChild(root_2, stream_ast_child.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:94:78: ^( NODE_CHAIN node_chain )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                        , root_2);

                        adaptor.addChild(root_2, stream_node_chain.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:95:6: ast_child
                    {
                    pushFollow(FOLLOW_ast_child_in_node_chain901);
                    ast_child63=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child63.getTree());

                    // AST REWRITE
                    // elements: ast_child
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:31: -> ^( NODE ^( AST_CHILD ast_child ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:95:34: ^( NODE ^( AST_CHILD ast_child ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:95:41: ^( AST_CHILD ast_child )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AST_CHILD, "AST_CHILD")
                        , root_2);

                        adaptor.addChild(root_2, stream_ast_child.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:96:4: node keywords
                    {
                    pushFollow(FOLLOW_node_in_node_chain933);
                    node64=node();

                    state._fsp--;

                    stream_node.add(node64.getTree());

                    pushFollow(FOLLOW_keywords_in_node_chain935);
                    keywords65=keywords();

                    state._fsp--;

                    stream_keywords.add(keywords65.getTree());

                    // AST REWRITE
                    // elements: keywords, node
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:22: -> ^( NODE ^( NODE_NAME node ) keywords )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:96:25: ^( NODE ^( NODE_NAME node ) keywords )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:96:32: ^( NODE_NAME node )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_node.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_keywords.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:97:4: ID PERIOD node_chain
                    {
                    ID66=(Token)match(input,ID,FOLLOW_ID_in_node_chain958);  
                    stream_ID.add(ID66);


                    PERIOD67=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain960);  
                    stream_PERIOD.add(PERIOD67);


                    pushFollow(FOLLOW_node_chain_in_node_chain962);
                    node_chain68=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain68.getTree());

                    // AST REWRITE
                    // elements: node_chain, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:29: -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:97:32: ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:97:46: ^( NODE_CHAIN node_chain )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                        , root_2);

                        adaptor.addChild(root_2, stream_node_chain.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:98:4: property
                    {
                    pushFollow(FOLLOW_property_in_node_chain985);
                    property69=property();

                    state._fsp--;

                    stream_property.add(property69.getTree());

                    // AST REWRITE
                    // elements: property
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:17: -> ^( PROPERTY property )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:98:20: ^( PROPERTY property )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PROPERTY, "PROPERTY")
                        , root_1);

                        adaptor.addChild(root_1, stream_property.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "node_chain"


    public static class node_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "node"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:100:1: node : ( LT NODE_TYPE GT -> NODE_TYPE | LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^( TABLE ID ) );
    public final QueryLanguageParser.node_return node() throws RecognitionException {
        QueryLanguageParser.node_return retval = new QueryLanguageParser.node_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT70=null;
        Token NODE_TYPE71=null;
        Token GT72=null;
        Token LEFT_SQ_BRACKET73=null;
        Token ID74=null;
        Token RIGHT_SQ_BRACKET75=null;

        Object LT70_tree=null;
        Object NODE_TYPE71_tree=null;
        Object GT72_tree=null;
        Object LEFT_SQ_BRACKET73_tree=null;
        Object ID74_tree=null;
        Object RIGHT_SQ_BRACKET75_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NODE_TYPE=new RewriteRuleTokenStream(adaptor,"token NODE_TYPE");
        RewriteRuleTokenStream stream_RIGHT_SQ_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQ_BRACKET");
        RewriteRuleTokenStream stream_LEFT_SQ_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_SQ_BRACKET");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:101:2: ( LT NODE_TYPE GT -> NODE_TYPE | LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^( TABLE ID ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LT) ) {
                alt14=1;
            }
            else if ( (LA14_0==LEFT_SQ_BRACKET) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:101:4: LT NODE_TYPE GT
                    {
                    LT70=(Token)match(input,LT,FOLLOW_LT_in_node1008);  
                    stream_LT.add(LT70);


                    NODE_TYPE71=(Token)match(input,NODE_TYPE,FOLLOW_NODE_TYPE_in_node1010);  
                    stream_NODE_TYPE.add(NODE_TYPE71);


                    GT72=(Token)match(input,GT,FOLLOW_GT_in_node1012);  
                    stream_GT.add(GT72);


                    // AST REWRITE
                    // elements: NODE_TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:20: -> NODE_TYPE
                    {
                        adaptor.addChild(root_0, 
                        stream_NODE_TYPE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:102:4: LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET
                    {
                    LEFT_SQ_BRACKET73=(Token)match(input,LEFT_SQ_BRACKET,FOLLOW_LEFT_SQ_BRACKET_in_node1022);  
                    stream_LEFT_SQ_BRACKET.add(LEFT_SQ_BRACKET73);


                    ID74=(Token)match(input,ID,FOLLOW_ID_in_node1024);  
                    stream_ID.add(ID74);


                    RIGHT_SQ_BRACKET75=(Token)match(input,RIGHT_SQ_BRACKET,FOLLOW_RIGHT_SQ_BRACKET_in_node1026);  
                    stream_RIGHT_SQ_BRACKET.add(RIGHT_SQ_BRACKET75);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:40: -> ^( TABLE ID )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:102:43: ^( TABLE ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TABLE, "TABLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "node"


    public static class ast_child_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ast_child"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:104:1: ast_child : LEFT_BRACKET ID RIGHT_BRACKET -> ID ;
    public final QueryLanguageParser.ast_child_return ast_child() throws RecognitionException {
        QueryLanguageParser.ast_child_return retval = new QueryLanguageParser.ast_child_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET76=null;
        Token ID77=null;
        Token RIGHT_BRACKET78=null;

        Object LEFT_BRACKET76_tree=null;
        Object ID77_tree=null;
        Object RIGHT_BRACKET78_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:105:2: ( LEFT_BRACKET ID RIGHT_BRACKET -> ID )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:105:4: LEFT_BRACKET ID RIGHT_BRACKET
            {
            LEFT_BRACKET76=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_ast_child1044);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET76);


            ID77=(Token)match(input,ID,FOLLOW_ID_in_ast_child1046);  
            stream_ID.add(ID77);


            RIGHT_BRACKET78=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_ast_child1048);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET78);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 105:34: -> ID
            {
                adaptor.addChild(root_0, 
                stream_ID.nextNode()
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ast_child"


    public static class keywords_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keywords"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:107:1: keywords : ( PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) );
    public final QueryLanguageParser.keywords_return keywords() throws RecognitionException {
        QueryLanguageParser.keywords_return retval = new QueryLanguageParser.keywords_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD79=null;
        Token CONTAINS80=null;
        Token LEFT_PAREN81=null;
        Token RIGHT_PAREN83=null;
        Token PERIOD84=null;
        Token IS85=null;
        Token LEFT_PAREN86=null;
        Token RIGHT_PAREN88=null;
        Token PERIOD89=null;
        Token HAS90=null;
        Token LEFT_PAREN91=null;
        Token RIGHT_PAREN93=null;
        QueryLanguageParser.keyword_nodes_return keyword_nodes82 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes87 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes92 =null;


        Object PERIOD79_tree=null;
        Object CONTAINS80_tree=null;
        Object LEFT_PAREN81_tree=null;
        Object RIGHT_PAREN83_tree=null;
        Object PERIOD84_tree=null;
        Object IS85_tree=null;
        Object LEFT_PAREN86_tree=null;
        Object RIGHT_PAREN88_tree=null;
        Object PERIOD89_tree=null;
        Object HAS90_tree=null;
        Object LEFT_PAREN91_tree=null;
        Object RIGHT_PAREN93_tree=null;
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:2: ( PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==PERIOD) ) {
                switch ( input.LA(2) ) {
                case CONTAINS:
                    {
                    alt15=1;
                    }
                    break;
                case IS:
                    {
                    alt15=2;
                    }
                    break;
                case HAS:
                    {
                    alt15=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:4: PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD79=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1062);  
                    stream_PERIOD.add(PERIOD79);


                    CONTAINS80=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_keywords1064);  
                    stream_CONTAINS.add(CONTAINS80);


                    LEFT_PAREN81=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1066);  
                    stream_LEFT_PAREN.add(LEFT_PAREN81);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1068);
                    keyword_nodes82=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes82.getTree());

                    RIGHT_PAREN83=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1070);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN83);


                    // AST REWRITE
                    // elements: CONTAINS, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:58: -> ^( CONTAINS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:61: ^( CONTAINS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:109:4: PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD84=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1084);  
                    stream_PERIOD.add(PERIOD84);


                    IS85=(Token)match(input,IS,FOLLOW_IS_in_keywords1086);  
                    stream_IS.add(IS85);


                    LEFT_PAREN86=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1088);  
                    stream_LEFT_PAREN.add(LEFT_PAREN86);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1090);
                    keyword_nodes87=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes87.getTree());

                    RIGHT_PAREN88=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1092);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN88);


                    // AST REWRITE
                    // elements: IS, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:53: -> ^( IS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:109:56: ^( IS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:110:4: PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD89=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1107);  
                    stream_PERIOD.add(PERIOD89);


                    HAS90=(Token)match(input,HAS,FOLLOW_HAS_in_keywords1109);  
                    stream_HAS.add(HAS90);


                    LEFT_PAREN91=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1111);  
                    stream_LEFT_PAREN.add(LEFT_PAREN91);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1113);
                    keyword_nodes92=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes92.getTree());

                    RIGHT_PAREN93=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1115);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN93);


                    // AST REWRITE
                    // elements: keyword_nodes, HAS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:53: -> ^( HAS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:110:56: ^( HAS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_HAS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keywords"


    public static class keyword_nodes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keyword_nodes"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:1: keyword_nodes : ( node -> ^( NODE_NAME node ) | ID -> ^( VAR_NAME ID ) | logical_op -> ^( LOGIC_OP logical_op ) | ast_child -> ^( AST_CHILD ast_child ) );
    public final QueryLanguageParser.keyword_nodes_return keyword_nodes() throws RecognitionException {
        QueryLanguageParser.keyword_nodes_return retval = new QueryLanguageParser.keyword_nodes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID95=null;
        QueryLanguageParser.node_return node94 =null;

        QueryLanguageParser.logical_op_return logical_op96 =null;

        QueryLanguageParser.ast_child_return ast_child97 =null;


        Object ID95_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_ast_child=new RewriteRuleSubtreeStream(adaptor,"rule ast_child");
        RewriteRuleSubtreeStream stream_node=new RewriteRuleSubtreeStream(adaptor,"rule node");
        RewriteRuleSubtreeStream stream_logical_op=new RewriteRuleSubtreeStream(adaptor,"rule logical_op");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:2: ( node -> ^( NODE_NAME node ) | ID -> ^( VAR_NAME ID ) | logical_op -> ^( LOGIC_OP logical_op ) | ast_child -> ^( AST_CHILD ast_child ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case LEFT_SQ_BRACKET:
            case LT:
                {
                alt16=1;
                }
                break;
            case ID:
                {
                alt16=2;
                }
                break;
            case AND:
            case OR:
                {
                alt16=3;
                }
                break;
            case LEFT_BRACKET:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:4: node
                    {
                    pushFollow(FOLLOW_node_in_keyword_nodes1134);
                    node94=node();

                    state._fsp--;

                    stream_node.add(node94.getTree());

                    // AST REWRITE
                    // elements: node
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:9: -> ^( NODE_NAME node )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:12: ^( NODE_NAME node )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_node.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:114:4: ID
                    {
                    ID95=(Token)match(input,ID,FOLLOW_ID_in_keyword_nodes1147);  
                    stream_ID.add(ID95);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:7: -> ^( VAR_NAME ID )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:114:10: ^( VAR_NAME ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:115:4: logical_op
                    {
                    pushFollow(FOLLOW_logical_op_in_keyword_nodes1160);
                    logical_op96=logical_op();

                    state._fsp--;

                    stream_logical_op.add(logical_op96.getTree());

                    // AST REWRITE
                    // elements: logical_op
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:15: -> ^( LOGIC_OP logical_op )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:115:18: ^( LOGIC_OP logical_op )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LOGIC_OP, "LOGIC_OP")
                        , root_1);

                        adaptor.addChild(root_1, stream_logical_op.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:116:4: ast_child
                    {
                    pushFollow(FOLLOW_ast_child_in_keyword_nodes1173);
                    ast_child97=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child97.getTree());

                    // AST REWRITE
                    // elements: ast_child
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:14: -> ^( AST_CHILD ast_child )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:116:17: ^( AST_CHILD ast_child )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AST_CHILD, "AST_CHILD")
                        , root_1);

                        adaptor.addChild(root_1, stream_ast_child.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keyword_nodes"


    public static class attr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attr"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:118:1: attr : ( COLON attr -> ^( ATTRIBUTES attr ) | PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | ATTRIBUTES attr -> ^( ATTRIBUTES attr ) | -> EPSILON );
    public final QueryLanguageParser.attr_return attr() throws RecognitionException {
        QueryLanguageParser.attr_return retval = new QueryLanguageParser.attr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON98=null;
        Token PERIOD100=null;
        Token CONTAINS101=null;
        Token LEFT_PAREN102=null;
        Token RIGHT_PAREN104=null;
        Token PERIOD105=null;
        Token IS106=null;
        Token LEFT_PAREN107=null;
        Token RIGHT_PAREN109=null;
        Token PERIOD110=null;
        Token HAS111=null;
        Token LEFT_PAREN112=null;
        Token RIGHT_PAREN114=null;
        Token ATTRIBUTES115=null;
        QueryLanguageParser.attr_return attr99 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes103 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes108 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes113 =null;

        QueryLanguageParser.attr_return attr116 =null;


        Object COLON98_tree=null;
        Object PERIOD100_tree=null;
        Object CONTAINS101_tree=null;
        Object LEFT_PAREN102_tree=null;
        Object RIGHT_PAREN104_tree=null;
        Object PERIOD105_tree=null;
        Object IS106_tree=null;
        Object LEFT_PAREN107_tree=null;
        Object RIGHT_PAREN109_tree=null;
        Object PERIOD110_tree=null;
        Object HAS111_tree=null;
        Object LEFT_PAREN112_tree=null;
        Object RIGHT_PAREN114_tree=null;
        Object ATTRIBUTES115_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ATTRIBUTES=new RewriteRuleTokenStream(adaptor,"token ATTRIBUTES");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:119:2: ( COLON attr -> ^( ATTRIBUTES attr ) | PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | ATTRIBUTES attr -> ^( ATTRIBUTES attr ) | -> EPSILON )
            int alt17=6;
            switch ( input.LA(1) ) {
            case COLON:
                {
                alt17=1;
                }
                break;
            case PERIOD:
                {
                switch ( input.LA(2) ) {
                case CONTAINS:
                    {
                    alt17=2;
                    }
                    break;
                case IS:
                    {
                    alt17=3;
                    }
                    break;
                case HAS:
                    {
                    alt17=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;

                }

                }
                break;
            case ATTRIBUTES:
                {
                alt17=5;
                }
                break;
            case EOF:
            case AND:
            case AS:
            case COMMA:
            case COMPOUND_ADD:
            case DEPTH:
            case DIVIDE:
            case EQUALS:
            case FOREACH:
            case GT:
            case GTE:
            case ID:
            case IF:
            case IN:
            case INCREMENT:
            case INTEGER:
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case LOGIC_EQUALS:
            case LT:
            case LTE:
            case MAX:
            case MIN:
            case MINUS:
            case NOT_EQUAL:
            case OR:
            case PLUS:
            case PRINT:
            case REPEATER:
            case RESERVED_TYPES:
            case RIGHT_BRACKET:
            case RIGHT_PAREN:
            case SELECT:
            case SEMICOLON:
            case SET:
            case STAR:
            case STRING:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:119:4: COLON attr
                    {
                    COLON98=(Token)match(input,COLON,FOLLOW_COLON_in_attr1191);  
                    stream_COLON.add(COLON98);


                    pushFollow(FOLLOW_attr_in_attr1193);
                    attr99=attr();

                    state._fsp--;

                    stream_attr.add(attr99.getTree());

                    // AST REWRITE
                    // elements: attr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:20: -> ^( ATTRIBUTES attr )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:119:24: ^( ATTRIBUTES attr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ATTRIBUTES, "ATTRIBUTES")
                        , root_1);

                        adaptor.addChild(root_1, stream_attr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:4: PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD100=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1212);  
                    stream_PERIOD.add(PERIOD100);


                    CONTAINS101=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_attr1214);  
                    stream_CONTAINS.add(CONTAINS101);


                    LEFT_PAREN102=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1216);  
                    stream_LEFT_PAREN.add(LEFT_PAREN102);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1218);
                    keyword_nodes103=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes103.getTree());

                    RIGHT_PAREN104=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1220);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN104);


                    // AST REWRITE
                    // elements: CONTAINS, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:58: -> ^( CONTAINS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:61: ^( CONTAINS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:121:4: PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD105=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1234);  
                    stream_PERIOD.add(PERIOD105);


                    IS106=(Token)match(input,IS,FOLLOW_IS_in_attr1236);  
                    stream_IS.add(IS106);


                    LEFT_PAREN107=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1238);  
                    stream_LEFT_PAREN.add(LEFT_PAREN107);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1240);
                    keyword_nodes108=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes108.getTree());

                    RIGHT_PAREN109=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1242);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN109);


                    // AST REWRITE
                    // elements: keyword_nodes, IS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:53: -> ^( IS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:121:56: ^( IS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:122:4: PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD110=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1257);  
                    stream_PERIOD.add(PERIOD110);


                    HAS111=(Token)match(input,HAS,FOLLOW_HAS_in_attr1259);  
                    stream_HAS.add(HAS111);


                    LEFT_PAREN112=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1261);  
                    stream_LEFT_PAREN.add(LEFT_PAREN112);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1263);
                    keyword_nodes113=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes113.getTree());

                    RIGHT_PAREN114=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1265);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN114);


                    // AST REWRITE
                    // elements: keyword_nodes, HAS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:53: -> ^( HAS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:122:56: ^( HAS keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_HAS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:123:4: ATTRIBUTES attr
                    {
                    ATTRIBUTES115=(Token)match(input,ATTRIBUTES,FOLLOW_ATTRIBUTES_in_attr1279);  
                    stream_ATTRIBUTES.add(ATTRIBUTES115);


                    pushFollow(FOLLOW_attr_in_attr1281);
                    attr116=attr();

                    state._fsp--;

                    stream_attr.add(attr116.getTree());

                    // AST REWRITE
                    // elements: ATTRIBUTES, attr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:24: -> ^( ATTRIBUTES attr )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:123:27: ^( ATTRIBUTES attr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ATTRIBUTES.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_attr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:124:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attr"


    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:126:1: property : ( ID -> ^( VAR_NAME ID ) | ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) ) );
    public final QueryLanguageParser.property_return property() throws RecognitionException {
        QueryLanguageParser.property_return retval = new QueryLanguageParser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID117=null;
        Token ID118=null;
        Token PERIOD119=null;
        Token CONTAINS120=null;
        Token LEFT_PAREN121=null;
        Token RIGHT_PAREN123=null;
        QueryLanguageParser.keyword_nodes_return keyword_nodes122 =null;


        Object ID117_tree=null;
        Object ID118_tree=null;
        Object PERIOD119_tree=null;
        Object CONTAINS120_tree=null;
        Object LEFT_PAREN121_tree=null;
        Object RIGHT_PAREN123_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:127:2: ( ID -> ^( VAR_NAME ID ) | ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==PERIOD) ) {
                    alt18=2;
                }
                else if ( (LA18_1==EOF||(LA18_1 >= AND && LA18_1 <= AS)||(LA18_1 >= COMMA && LA18_1 <= COMPOUND_ADD)||(LA18_1 >= DEPTH && LA18_1 <= DIVIDE)||LA18_1==EQUALS||LA18_1==FOREACH||(LA18_1 >= GT && LA18_1 <= GTE)||(LA18_1 >= ID && LA18_1 <= IF)||LA18_1==IN||(LA18_1 >= INCREMENT && LA18_1 <= INTEGER)||LA18_1==LEFT_BRACKET||(LA18_1 >= LEFT_SQ_BRACKET && LA18_1 <= LOGIC_EQUALS)||(LA18_1 >= LT && LA18_1 <= MINUS)||LA18_1==NOT_EQUAL||LA18_1==OR||(LA18_1 >= PLUS && LA18_1 <= PRINT)||(LA18_1 >= REPEATER && LA18_1 <= RIGHT_PAREN)||LA18_1==SELECT||(LA18_1 >= SEMICOLON && LA18_1 <= SET)||LA18_1==STAR||LA18_1==STRING) ) {
                    alt18=1;
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:127:4: ID
                    {
                    ID117=(Token)match(input,ID,FOLLOW_ID_in_property1310);  
                    stream_ID.add(ID117);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:18: -> ^( VAR_NAME ID )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:127:21: ^( VAR_NAME ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:128:4: ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    ID118=(Token)match(input,ID,FOLLOW_ID_in_property1334);  
                    stream_ID.add(ID118);


                    PERIOD119=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1336);  
                    stream_PERIOD.add(PERIOD119);


                    CONTAINS120=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_property1338);  
                    stream_CONTAINS.add(CONTAINS120);


                    LEFT_PAREN121=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1340);  
                    stream_LEFT_PAREN.add(LEFT_PAREN121);


                    pushFollow(FOLLOW_keyword_nodes_in_property1342);
                    keyword_nodes122=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes122.getTree());

                    RIGHT_PAREN123=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1344);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN123);


                    // AST REWRITE
                    // elements: keyword_nodes, ID, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:60: -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:128:63: ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:128:77: ^( CONTAINS keyword_nodes )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "property"


    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:131:1: variable : ( ID COLON attr -> ^( VAR_NAME ID attr ) | node_chain -> ^( NODE_CHAIN node_chain ) | INTEGER -> INTEGER | STRING -> STRING | RESERVED_TYPES -> RESERVED_TYPES | function -> ^( FUNCTION function ) );
    public final QueryLanguageParser.variable_return variable() throws RecognitionException {
        QueryLanguageParser.variable_return retval = new QueryLanguageParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID124=null;
        Token COLON125=null;
        Token INTEGER128=null;
        Token STRING129=null;
        Token RESERVED_TYPES130=null;
        QueryLanguageParser.attr_return attr126 =null;

        QueryLanguageParser.node_chain_return node_chain127 =null;

        QueryLanguageParser.function_return function131 =null;


        Object ID124_tree=null;
        Object COLON125_tree=null;
        Object INTEGER128_tree=null;
        Object STRING129_tree=null;
        Object RESERVED_TYPES130_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RESERVED_TYPES=new RewriteRuleTokenStream(adaptor,"token RESERVED_TYPES");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:132:2: ( ID COLON attr -> ^( VAR_NAME ID attr ) | node_chain -> ^( NODE_CHAIN node_chain ) | INTEGER -> INTEGER | STRING -> STRING | RESERVED_TYPES -> RESERVED_TYPES | function -> ^( FUNCTION function ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==COLON) ) {
                    alt19=1;
                }
                else if ( (LA19_1==EOF||(LA19_1 >= AND && LA19_1 <= AS)||(LA19_1 >= COMMA && LA19_1 <= COMPOUND_ADD)||(LA19_1 >= DEPTH && LA19_1 <= DIVIDE)||LA19_1==EQUALS||LA19_1==FOREACH||(LA19_1 >= GT && LA19_1 <= GTE)||(LA19_1 >= ID && LA19_1 <= IF)||(LA19_1 >= INCREMENT && LA19_1 <= INTEGER)||LA19_1==LEFT_BRACKET||(LA19_1 >= LEFT_SQ_BRACKET && LA19_1 <= LOGIC_EQUALS)||(LA19_1 >= LT && LA19_1 <= MINUS)||LA19_1==NOT_EQUAL||(LA19_1 >= OR && LA19_1 <= PRINT)||(LA19_1 >= RESERVED_TYPES && LA19_1 <= RIGHT_PAREN)||LA19_1==SELECT||(LA19_1 >= SEMICOLON && LA19_1 <= SET)||LA19_1==STRING) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
                }
                break;
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case LT:
                {
                alt19=2;
                }
                break;
            case INTEGER:
                {
                alt19=3;
                }
                break;
            case STRING:
                {
                alt19=4;
                }
                break;
            case RESERVED_TYPES:
                {
                alt19=5;
                }
                break;
            case DEPTH:
            case MAX:
            case MIN:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:132:4: ID COLON attr
                    {
                    ID124=(Token)match(input,ID,FOLLOW_ID_in_variable1371);  
                    stream_ID.add(ID124);


                    COLON125=(Token)match(input,COLON,FOLLOW_COLON_in_variable1373);  
                    stream_COLON.add(COLON125);


                    pushFollow(FOLLOW_attr_in_variable1375);
                    attr126=attr();

                    state._fsp--;

                    stream_attr.add(attr126.getTree());

                    // AST REWRITE
                    // elements: attr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:21: -> ^( VAR_NAME ID attr )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:132:24: ^( VAR_NAME ID attr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_attr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:133:4: node_chain
                    {
                    pushFollow(FOLLOW_node_chain_in_variable1393);
                    node_chain127=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain127.getTree());

                    // AST REWRITE
                    // elements: node_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 133:19: -> ^( NODE_CHAIN node_chain )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:133:22: ^( NODE_CHAIN node_chain )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                        , root_1);

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:134:4: INTEGER
                    {
                    INTEGER128=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_variable1410);  
                    stream_INTEGER.add(INTEGER128);


                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:16: -> INTEGER
                    {
                        adaptor.addChild(root_0, 
                        stream_INTEGER.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:135:10: STRING
                    {
                    STRING129=(Token)match(input,STRING,FOLLOW_STRING_in_variable1429);  
                    stream_STRING.add(STRING129);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:50: -> STRING
                    {
                        adaptor.addChild(root_0, 
                        stream_STRING.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:136:4: RESERVED_TYPES
                    {
                    RESERVED_TYPES130=(Token)match(input,RESERVED_TYPES,FOLLOW_RESERVED_TYPES_in_variable1471);  
                    stream_RESERVED_TYPES.add(RESERVED_TYPES130);


                    // AST REWRITE
                    // elements: RESERVED_TYPES
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:22: -> RESERVED_TYPES
                    {
                        adaptor.addChild(root_0, 
                        stream_RESERVED_TYPES.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:137:4: function
                    {
                    pushFollow(FOLLOW_function_in_variable1484);
                    function131=function();

                    state._fsp--;

                    stream_function.add(function131.getTree());

                    // AST REWRITE
                    // elements: function
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:16: -> ^( FUNCTION function )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:137:19: ^( FUNCTION function )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION, "FUNCTION")
                        , root_1);

                        adaptor.addChild(root_1, stream_function.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:140:1: function : ( MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAX variable variable ) | MIN LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MIN variable variable ) | DEPTH LEFT_PAREN variable RIGHT_PAREN -> ^( DEPTH variable ) );
    public final QueryLanguageParser.function_return function() throws RecognitionException {
        QueryLanguageParser.function_return retval = new QueryLanguageParser.function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MAX132=null;
        Token LEFT_PAREN133=null;
        Token COMMA135=null;
        Token RIGHT_PAREN137=null;
        Token MIN138=null;
        Token LEFT_PAREN139=null;
        Token COMMA141=null;
        Token RIGHT_PAREN143=null;
        Token DEPTH144=null;
        Token LEFT_PAREN145=null;
        Token RIGHT_PAREN147=null;
        QueryLanguageParser.variable_return variable134 =null;

        QueryLanguageParser.variable_return variable136 =null;

        QueryLanguageParser.variable_return variable140 =null;

        QueryLanguageParser.variable_return variable142 =null;

        QueryLanguageParser.variable_return variable146 =null;


        Object MAX132_tree=null;
        Object LEFT_PAREN133_tree=null;
        Object COMMA135_tree=null;
        Object RIGHT_PAREN137_tree=null;
        Object MIN138_tree=null;
        Object LEFT_PAREN139_tree=null;
        Object COMMA141_tree=null;
        Object RIGHT_PAREN143_tree=null;
        Object DEPTH144_tree=null;
        Object LEFT_PAREN145_tree=null;
        Object RIGHT_PAREN147_tree=null;
        RewriteRuleTokenStream stream_MAX=new RewriteRuleTokenStream(adaptor,"token MAX");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_MIN=new RewriteRuleTokenStream(adaptor,"token MIN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_DEPTH=new RewriteRuleTokenStream(adaptor,"token DEPTH");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:141:2: ( MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAX variable variable ) | MIN LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MIN variable variable ) | DEPTH LEFT_PAREN variable RIGHT_PAREN -> ^( DEPTH variable ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case MAX:
                {
                alt20=1;
                }
                break;
            case MIN:
                {
                alt20=2;
                }
                break;
            case DEPTH:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:141:4: MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN
                    {
                    MAX132=(Token)match(input,MAX,FOLLOW_MAX_in_function1506);  
                    stream_MAX.add(MAX132);


                    LEFT_PAREN133=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1508);  
                    stream_LEFT_PAREN.add(LEFT_PAREN133);


                    pushFollow(FOLLOW_variable_in_function1510);
                    variable134=variable();

                    state._fsp--;

                    stream_variable.add(variable134.getTree());

                    COMMA135=(Token)match(input,COMMA,FOLLOW_COMMA_in_function1512);  
                    stream_COMMA.add(COMMA135);


                    pushFollow(FOLLOW_variable_in_function1514);
                    variable136=variable();

                    state._fsp--;

                    stream_variable.add(variable136.getTree());

                    RIGHT_PAREN137=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1516);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN137);


                    // AST REWRITE
                    // elements: MAX, variable, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:55: -> ^( MAX variable variable )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:141:58: ^( MAX variable variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MAX.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:142:4: MIN LEFT_PAREN variable COMMA variable RIGHT_PAREN
                    {
                    MIN138=(Token)match(input,MIN,FOLLOW_MIN_in_function1531);  
                    stream_MIN.add(MIN138);


                    LEFT_PAREN139=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1533);  
                    stream_LEFT_PAREN.add(LEFT_PAREN139);


                    pushFollow(FOLLOW_variable_in_function1535);
                    variable140=variable();

                    state._fsp--;

                    stream_variable.add(variable140.getTree());

                    COMMA141=(Token)match(input,COMMA,FOLLOW_COMMA_in_function1537);  
                    stream_COMMA.add(COMMA141);


                    pushFollow(FOLLOW_variable_in_function1539);
                    variable142=variable();

                    state._fsp--;

                    stream_variable.add(variable142.getTree());

                    RIGHT_PAREN143=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1541);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN143);


                    // AST REWRITE
                    // elements: variable, MIN, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:55: -> ^( MIN variable variable )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:142:58: ^( MIN variable variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MIN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:143:10: DEPTH LEFT_PAREN variable RIGHT_PAREN
                    {
                    DEPTH144=(Token)match(input,DEPTH,FOLLOW_DEPTH_in_function1562);  
                    stream_DEPTH.add(DEPTH144);


                    LEFT_PAREN145=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1564);  
                    stream_LEFT_PAREN.add(LEFT_PAREN145);


                    pushFollow(FOLLOW_variable_in_function1566);
                    variable146=variable();

                    state._fsp--;

                    stream_variable.add(variable146.getTree());

                    RIGHT_PAREN147=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1568);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN147);


                    // AST REWRITE
                    // elements: variable, DEPTH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:48: -> ^( DEPTH variable )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:143:51: ^( DEPTH variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_DEPTH.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:146:1: block : ( LEFT_BRACKET block_statements RIGHT_BRACKET -> ^( BLOCK_STATEMENTS block_statements ) | -> EPSILON );
    public final QueryLanguageParser.block_return block() throws RecognitionException {
        QueryLanguageParser.block_return retval = new QueryLanguageParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET148=null;
        Token RIGHT_BRACKET150=null;
        QueryLanguageParser.block_statements_return block_statements149 =null;


        Object LEFT_BRACKET148_tree=null;
        Object RIGHT_BRACKET150_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_block_statements=new RewriteRuleSubtreeStream(adaptor,"rule block_statements");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:147:2: ( LEFT_BRACKET block_statements RIGHT_BRACKET -> ^( BLOCK_STATEMENTS block_statements ) | -> EPSILON )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LEFT_BRACKET) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==ID) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==ID||LA21_3==LEFT_BRACKET||LA21_3==LEFT_SQ_BRACKET||LA21_3==LT||LA21_3==PERIOD||LA21_3==REPEATER||LA21_3==RIGHT_BRACKET||LA21_3==STAR) ) {
                        alt21=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA21_1==LEFT_BRACKET||LA21_1==LEFT_SQ_BRACKET||LA21_1==LT||LA21_1==REPEATER||LA21_1==RIGHT_BRACKET||LA21_1==STAR) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA21_0==ID||LA21_0==IN||LA21_0==LEFT_SQ_BRACKET||LA21_0==LT||LA21_0==REPEATER||(LA21_0 >= RIGHT_BRACKET && LA21_0 <= RIGHT_PAREN)||LA21_0==STAR) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:147:4: LEFT_BRACKET block_statements RIGHT_BRACKET
                    {
                    LEFT_BRACKET148=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_block1588);  
                    stream_LEFT_BRACKET.add(LEFT_BRACKET148);


                    pushFollow(FOLLOW_block_statements_in_block1590);
                    block_statements149=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements149.getTree());

                    RIGHT_BRACKET150=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_block1592);  
                    stream_RIGHT_BRACKET.add(RIGHT_BRACKET150);


                    // AST REWRITE
                    // elements: block_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:48: -> ^( BLOCK_STATEMENTS block_statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:147:51: ^( BLOCK_STATEMENTS block_statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BLOCK_STATEMENTS, "BLOCK_STATEMENTS")
                        , root_1);

                        adaptor.addChild(root_1, stream_block_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:148:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class block_statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_statements"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:150:1: block_statements : ( STAR block_statements -> ^( STAR block_statements ) | REPEATER block_statements -> ^( REPEATER block_statements ) | node_chain block block_statements -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) ) | -> EPSILON );
    public final QueryLanguageParser.block_statements_return block_statements() throws RecognitionException {
        QueryLanguageParser.block_statements_return retval = new QueryLanguageParser.block_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR151=null;
        Token REPEATER153=null;
        QueryLanguageParser.block_statements_return block_statements152 =null;

        QueryLanguageParser.block_statements_return block_statements154 =null;

        QueryLanguageParser.node_chain_return node_chain155 =null;

        QueryLanguageParser.block_return block156 =null;

        QueryLanguageParser.block_statements_return block_statements157 =null;


        Object STAR151_tree=null;
        Object REPEATER153_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_REPEATER=new RewriteRuleTokenStream(adaptor,"token REPEATER");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_block_statements=new RewriteRuleSubtreeStream(adaptor,"rule block_statements");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:151:2: ( STAR block_statements -> ^( STAR block_statements ) | REPEATER block_statements -> ^( REPEATER block_statements ) | node_chain block block_statements -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) ) | -> EPSILON )
            int alt22=4;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt22=1;
                }
                break;
            case REPEATER:
                {
                alt22=2;
                }
                break;
            case ID:
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case LT:
                {
                alt22=3;
                }
                break;
            case RIGHT_BRACKET:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:151:4: STAR block_statements
                    {
                    STAR151=(Token)match(input,STAR,FOLLOW_STAR_in_block_statements1617);  
                    stream_STAR.add(STAR151);


                    pushFollow(FOLLOW_block_statements_in_block_statements1619);
                    block_statements152=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements152.getTree());

                    // AST REWRITE
                    // elements: STAR, block_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 151:29: -> ^( STAR block_statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:151:32: ^( STAR block_statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_block_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:152:4: REPEATER block_statements
                    {
                    REPEATER153=(Token)match(input,REPEATER,FOLLOW_REPEATER_in_block_statements1635);  
                    stream_REPEATER.add(REPEATER153);


                    pushFollow(FOLLOW_block_statements_in_block_statements1637);
                    block_statements154=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements154.getTree());

                    // AST REWRITE
                    // elements: REPEATER, block_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:32: -> ^( REPEATER block_statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:152:35: ^( REPEATER block_statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_REPEATER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_block_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:153:4: node_chain block block_statements
                    {
                    pushFollow(FOLLOW_node_chain_in_block_statements1652);
                    node_chain155=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain155.getTree());

                    pushFollow(FOLLOW_block_in_block_statements1654);
                    block156=block();

                    state._fsp--;

                    stream_block.add(block156.getTree());

                    pushFollow(FOLLOW_block_statements_in_block_statements1656);
                    block_statements157=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements157.getTree());

                    // AST REWRITE
                    // elements: block_statements, node_chain, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:38: -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:153:41: ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NESTED, "NESTED")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:153:50: ^( node_chain )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_node_chain.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:153:70: ^( BLOCK_STATEMENTS block_statements )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BLOCK_STATEMENTS, "BLOCK_STATEMENTS")
                        , root_2);

                        adaptor.addChild(root_2, stream_block_statements.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:154:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_statements"


    public static class print_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print_stmt"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:157:1: print_stmt : ( PRINT variable_stmt SEMICOLON -> variable_stmt | -> EPSILON );
    public final QueryLanguageParser.print_stmt_return print_stmt() throws RecognitionException {
        QueryLanguageParser.print_stmt_return retval = new QueryLanguageParser.print_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT158=null;
        Token SEMICOLON160=null;
        QueryLanguageParser.variable_stmt_return variable_stmt159 =null;


        Object PRINT158_tree=null;
        Object SEMICOLON160_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_variable_stmt=new RewriteRuleSubtreeStream(adaptor,"rule variable_stmt");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:158:2: ( PRINT variable_stmt SEMICOLON -> variable_stmt | -> EPSILON )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==PRINT) ) {
                alt23=1;
            }
            else if ( (LA23_0==EOF||LA23_0==DEPTH||LA23_0==FOREACH||(LA23_0 >= ID && LA23_0 <= IF)||LA23_0==INTEGER||LA23_0==LEFT_BRACKET||LA23_0==LEFT_SQ_BRACKET||LA23_0==LT||(LA23_0 >= MAX && LA23_0 <= MIN)||(LA23_0 >= RESERVED_TYPES && LA23_0 <= RIGHT_BRACKET)||LA23_0==SELECT||LA23_0==SET||LA23_0==STRING) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:158:4: PRINT variable_stmt SEMICOLON
                    {
                    PRINT158=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stmt1692);  
                    stream_PRINT.add(PRINT158);


                    pushFollow(FOLLOW_variable_stmt_in_print_stmt1694);
                    variable_stmt159=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt159.getTree());

                    SEMICOLON160=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print_stmt1696);  
                    stream_SEMICOLON.add(SEMICOLON160);


                    // AST REWRITE
                    // elements: variable_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:34: -> variable_stmt
                    {
                        adaptor.addChild(root_0, stream_variable_stmt.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:159:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print_stmt"


    public static class stat_statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat_statements"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:1: stat_statements : ( LEFT_BRACKET statements RIGHT_BRACKET -> statements | -> EPSILON );
    public final QueryLanguageParser.stat_statements_return stat_statements() throws RecognitionException {
        QueryLanguageParser.stat_statements_return retval = new QueryLanguageParser.stat_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET161=null;
        Token RIGHT_BRACKET163=null;
        QueryLanguageParser.statements_return statements162 =null;


        Object LEFT_BRACKET161_tree=null;
        Object RIGHT_BRACKET163_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:163:2: ( LEFT_BRACKET statements RIGHT_BRACKET -> statements | -> EPSILON )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LEFT_BRACKET) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==ID) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==RIGHT_BRACKET) ) {
                        alt24=2;
                    }
                    else if ( (LA24_3==COLON||LA24_3==COMPOUND_ADD||LA24_3==EQUALS||LA24_3==FILTER||LA24_3==INCREMENT||LA24_3==PERIOD) ) {
                        alt24=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA24_1==DEPTH||LA24_1==FOREACH||LA24_1==IF||LA24_1==INTEGER||LA24_1==LEFT_BRACKET||LA24_1==LEFT_SQ_BRACKET||LA24_1==LT||(LA24_1 >= MAX && LA24_1 <= MIN)||(LA24_1 >= RESERVED_TYPES && LA24_1 <= RIGHT_BRACKET)||LA24_1==SELECT||LA24_1==SET||LA24_1==STRING) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA24_0==EOF||LA24_0==DEPTH||LA24_0==FOREACH||(LA24_0 >= ID && LA24_0 <= IF)||LA24_0==INTEGER||LA24_0==LEFT_SQ_BRACKET||LA24_0==LT||(LA24_0 >= MAX && LA24_0 <= MIN)||LA24_0==PRINT||(LA24_0 >= RESERVED_TYPES && LA24_0 <= RIGHT_BRACKET)||LA24_0==SELECT||LA24_0==SET||LA24_0==STRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:163:4: LEFT_BRACKET statements RIGHT_BRACKET
                    {
                    LEFT_BRACKET161=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_stat_statements1718);  
                    stream_LEFT_BRACKET.add(LEFT_BRACKET161);


                    pushFollow(FOLLOW_statements_in_stat_statements1720);
                    statements162=statements();

                    state._fsp--;

                    stream_statements.add(statements162.getTree());

                    RIGHT_BRACKET163=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_stat_statements1722);  
                    stream_RIGHT_BRACKET.add(RIGHT_BRACKET163);


                    // AST REWRITE
                    // elements: statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:42: -> statements
                    {
                        adaptor.addChild(root_0, stream_statements.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:164:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat_statements"


    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statements"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:167:1: statements : ( variable_assn statements -> ^( STATEMENT variable_assn statements ) | if_statement statements -> ^( STATEMENT if_statement statements ) | query statements -> ^( QUERY query ) statements | SET variable_assn WHERE boolean_exp SEMICOLON -> ^( SET_TABLE variable_assn boolean_exp ) | -> EPSILON );
    public final QueryLanguageParser.statements_return statements() throws RecognitionException {
        QueryLanguageParser.statements_return retval = new QueryLanguageParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SET170=null;
        Token WHERE172=null;
        Token SEMICOLON174=null;
        QueryLanguageParser.variable_assn_return variable_assn164 =null;

        QueryLanguageParser.statements_return statements165 =null;

        QueryLanguageParser.if_statement_return if_statement166 =null;

        QueryLanguageParser.statements_return statements167 =null;

        QueryLanguageParser.query_return query168 =null;

        QueryLanguageParser.statements_return statements169 =null;

        QueryLanguageParser.variable_assn_return variable_assn171 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp173 =null;


        Object SET170_tree=null;
        Object WHERE172_tree=null;
        Object SEMICOLON174_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_variable_assn=new RewriteRuleSubtreeStream(adaptor,"rule variable_assn");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        RewriteRuleSubtreeStream stream_if_statement=new RewriteRuleSubtreeStream(adaptor,"rule if_statement");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:168:2: ( variable_assn statements -> ^( STATEMENT variable_assn statements ) | if_statement statements -> ^( STATEMENT if_statement statements ) | query statements -> ^( QUERY query ) statements | SET variable_assn WHERE boolean_exp SEMICOLON -> ^( SET_TABLE variable_assn boolean_exp ) | -> EPSILON )
            int alt25=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case COLON:
                    {
                    int LA25_7 = input.LA(3);

                    if ( (LA25_7==ATTRIBUTES||LA25_7==COLON||LA25_7==COMPOUND_ADD||LA25_7==EQUALS||LA25_7==INCREMENT||LA25_7==PERIOD) ) {
                        alt25=1;
                    }
                    else if ( (LA25_7==FOREACH||LA25_7==ID||LA25_7==SELECT) ) {
                        alt25=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                case COMPOUND_ADD:
                case EQUALS:
                case INCREMENT:
                case PERIOD:
                    {
                    alt25=1;
                    }
                    break;
                case FILTER:
                    {
                    alt25=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }

                }
                break;
            case DEPTH:
            case INTEGER:
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case LT:
            case MAX:
            case MIN:
            case RESERVED_TYPES:
            case STRING:
                {
                alt25=1;
                }
                break;
            case IF:
                {
                alt25=2;
                }
                break;
            case FOREACH:
            case SELECT:
                {
                alt25=3;
                }
                break;
            case SET:
                {
                alt25=4;
                }
                break;
            case RIGHT_BRACKET:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:168:4: variable_assn statements
                    {
                    pushFollow(FOLLOW_variable_assn_in_statements1745);
                    variable_assn164=variable_assn();

                    state._fsp--;

                    stream_variable_assn.add(variable_assn164.getTree());

                    pushFollow(FOLLOW_statements_in_statements1747);
                    statements165=statements();

                    state._fsp--;

                    stream_statements.add(statements165.getTree());

                    // AST REWRITE
                    // elements: variable_assn, statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 168:29: -> ^( STATEMENT variable_assn statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:168:32: ^( STATEMENT variable_assn statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable_assn.nextTree());

                        adaptor.addChild(root_1, stream_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:169:4: if_statement statements
                    {
                    pushFollow(FOLLOW_if_statement_in_statements1762);
                    if_statement166=if_statement();

                    state._fsp--;

                    stream_if_statement.add(if_statement166.getTree());

                    pushFollow(FOLLOW_statements_in_statements1764);
                    statements167=statements();

                    state._fsp--;

                    stream_statements.add(statements167.getTree());

                    // AST REWRITE
                    // elements: statements, if_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 169:29: -> ^( STATEMENT if_statement statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:169:32: ^( STATEMENT if_statement statements )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENT, "STATEMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_if_statement.nextTree());

                        adaptor.addChild(root_1, stream_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:170:4: query statements
                    {
                    pushFollow(FOLLOW_query_in_statements1780);
                    query168=query();

                    state._fsp--;

                    stream_query.add(query168.getTree());

                    pushFollow(FOLLOW_statements_in_statements1782);
                    statements169=statements();

                    state._fsp--;

                    stream_statements.add(statements169.getTree());

                    // AST REWRITE
                    // elements: query, statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:22: -> ^( QUERY query ) statements
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:170:25: ^( QUERY query )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        adaptor.addChild(root_1, stream_query.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        adaptor.addChild(root_0, stream_statements.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:171:4: SET variable_assn WHERE boolean_exp SEMICOLON
                    {
                    SET170=(Token)match(input,SET,FOLLOW_SET_in_statements1798);  
                    stream_SET.add(SET170);


                    pushFollow(FOLLOW_variable_assn_in_statements1800);
                    variable_assn171=variable_assn();

                    state._fsp--;

                    stream_variable_assn.add(variable_assn171.getTree());

                    WHERE172=(Token)match(input,WHERE,FOLLOW_WHERE_in_statements1802);  
                    stream_WHERE.add(WHERE172);


                    pushFollow(FOLLOW_boolean_exp_in_statements1804);
                    boolean_exp173=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp173.getTree());

                    SEMICOLON174=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1806);  
                    stream_SEMICOLON.add(SEMICOLON174);


                    // AST REWRITE
                    // elements: variable_assn, boolean_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:50: -> ^( SET_TABLE variable_assn boolean_exp )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:171:53: ^( SET_TABLE variable_assn boolean_exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SET_TABLE, "SET_TABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable_assn.nextTree());

                        adaptor.addChild(root_1, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:172:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 172:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statements"


    public static class variable_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_stmt"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:175:1: variable_stmt : variable binary_op -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) ) ;
    public final QueryLanguageParser.variable_stmt_return variable_stmt() throws RecognitionException {
        QueryLanguageParser.variable_stmt_return retval = new QueryLanguageParser.variable_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable175 =null;

        QueryLanguageParser.binary_op_return binary_op176 =null;


        RewriteRuleSubtreeStream stream_binary_op=new RewriteRuleSubtreeStream(adaptor,"rule binary_op");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:176:2: ( variable binary_op -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:176:4: variable binary_op
            {
            pushFollow(FOLLOW_variable_in_variable_stmt1835);
            variable175=variable();

            state._fsp--;

            stream_variable.add(variable175.getTree());

            pushFollow(FOLLOW_binary_op_in_variable_stmt1837);
            binary_op176=binary_op();

            state._fsp--;

            stream_binary_op.add(binary_op176.getTree());

            // AST REWRITE
            // elements: variable, binary_op
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 176:25: -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:176:28: ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR_STMT, "VAR_STMT")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:176:39: ^( VAR variable )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR, "VAR")
                , root_2);

                adaptor.addChild(root_2, stream_variable.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:176:55: ^( BIN_OP binary_op )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BIN_OP, "BIN_OP")
                , root_2);

                adaptor.addChild(root_2, stream_binary_op.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable_stmt"


    public static class variable_assn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_assn"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:179:1: variable_assn : variable variable_assn_right -> ^( VAR variable ) variable_assn_right ;
    public final QueryLanguageParser.variable_assn_return variable_assn() throws RecognitionException {
        QueryLanguageParser.variable_assn_return retval = new QueryLanguageParser.variable_assn_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable177 =null;

        QueryLanguageParser.variable_assn_right_return variable_assn_right178 =null;


        RewriteRuleSubtreeStream stream_variable_assn_right=new RewriteRuleSubtreeStream(adaptor,"rule variable_assn_right");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:180:2: ( variable variable_assn_right -> ^( VAR variable ) variable_assn_right )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:180:4: variable variable_assn_right
            {
            pushFollow(FOLLOW_variable_in_variable_assn1869);
            variable177=variable();

            state._fsp--;

            stream_variable.add(variable177.getTree());

            pushFollow(FOLLOW_variable_assn_right_in_variable_assn1871);
            variable_assn_right178=variable_assn_right();

            state._fsp--;

            stream_variable_assn_right.add(variable_assn_right178.getTree());

            // AST REWRITE
            // elements: variable_assn_right, variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 180:33: -> ^( VAR variable ) variable_assn_right
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:180:36: ^( VAR variable )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR, "VAR")
                , root_1);

                adaptor.addChild(root_1, stream_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_variable_assn_right.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable_assn"


    public static class variable_assn_right_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_assn_right"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:182:1: variable_assn_right : ( EQUALS variable_stmt SEMICOLON -> ^( VAR_ASSIGN variable_stmt ) | COMPOUND_ADD variable_stmt SEMICOLON -> ^( COMP_ADD variable_stmt ) | INCREMENT SEMICOLON -> INCR );
    public final QueryLanguageParser.variable_assn_right_return variable_assn_right() throws RecognitionException {
        QueryLanguageParser.variable_assn_right_return retval = new QueryLanguageParser.variable_assn_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS179=null;
        Token SEMICOLON181=null;
        Token COMPOUND_ADD182=null;
        Token SEMICOLON184=null;
        Token INCREMENT185=null;
        Token SEMICOLON186=null;
        QueryLanguageParser.variable_stmt_return variable_stmt180 =null;

        QueryLanguageParser.variable_stmt_return variable_stmt183 =null;


        Object EQUALS179_tree=null;
        Object SEMICOLON181_tree=null;
        Object COMPOUND_ADD182_tree=null;
        Object SEMICOLON184_tree=null;
        Object INCREMENT185_tree=null;
        Object SEMICOLON186_tree=null;
        RewriteRuleTokenStream stream_INCREMENT=new RewriteRuleTokenStream(adaptor,"token INCREMENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_COMPOUND_ADD=new RewriteRuleTokenStream(adaptor,"token COMPOUND_ADD");
        RewriteRuleSubtreeStream stream_variable_stmt=new RewriteRuleSubtreeStream(adaptor,"rule variable_stmt");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:183:2: ( EQUALS variable_stmt SEMICOLON -> ^( VAR_ASSIGN variable_stmt ) | COMPOUND_ADD variable_stmt SEMICOLON -> ^( COMP_ADD variable_stmt ) | INCREMENT SEMICOLON -> INCR )
            int alt26=3;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt26=1;
                }
                break;
            case COMPOUND_ADD:
                {
                alt26=2;
                }
                break;
            case INCREMENT:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:183:4: EQUALS variable_stmt SEMICOLON
                    {
                    EQUALS179=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_variable_assn_right1891);  
                    stream_EQUALS.add(EQUALS179);


                    pushFollow(FOLLOW_variable_stmt_in_variable_assn_right1893);
                    variable_stmt180=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt180.getTree());

                    SEMICOLON181=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right1895);  
                    stream_SEMICOLON.add(SEMICOLON181);


                    // AST REWRITE
                    // elements: variable_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:36: -> ^( VAR_ASSIGN variable_stmt )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:183:39: ^( VAR_ASSIGN variable_stmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_ASSIGN, "VAR_ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable_stmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:184:4: COMPOUND_ADD variable_stmt SEMICOLON
                    {
                    COMPOUND_ADD182=(Token)match(input,COMPOUND_ADD,FOLLOW_COMPOUND_ADD_in_variable_assn_right1909);  
                    stream_COMPOUND_ADD.add(COMPOUND_ADD182);


                    pushFollow(FOLLOW_variable_stmt_in_variable_assn_right1911);
                    variable_stmt183=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt183.getTree());

                    SEMICOLON184=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right1913);  
                    stream_SEMICOLON.add(SEMICOLON184);


                    // AST REWRITE
                    // elements: variable_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:41: -> ^( COMP_ADD variable_stmt )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:184:44: ^( COMP_ADD variable_stmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COMP_ADD, "COMP_ADD")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable_stmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:185:4: INCREMENT SEMICOLON
                    {
                    INCREMENT185=(Token)match(input,INCREMENT,FOLLOW_INCREMENT_in_variable_assn_right1926);  
                    stream_INCREMENT.add(INCREMENT185);


                    SEMICOLON186=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right1928);  
                    stream_SEMICOLON.add(SEMICOLON186);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:26: -> INCR
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INCR, "INCR")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable_assn_right"


    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_statement"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:1: if_statement : IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) ) ;
    public final QueryLanguageParser.if_statement_return if_statement() throws RecognitionException {
        QueryLanguageParser.if_statement_return retval = new QueryLanguageParser.if_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF187=null;
        Token LEFT_PAREN188=null;
        Token RIGHT_PAREN190=null;
        Token LEFT_BRACKET191=null;
        Token RIGHT_BRACKET193=null;
        QueryLanguageParser.boolean_exp_return boolean_exp189 =null;

        QueryLanguageParser.statements_return statements192 =null;


        Object IF187_tree=null;
        Object LEFT_PAREN188_tree=null;
        Object RIGHT_PAREN190_tree=null;
        Object LEFT_BRACKET191_tree=null;
        Object RIGHT_BRACKET193_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:188:2: ( IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:188:4: IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET
            {
            IF187=(Token)match(input,IF,FOLLOW_IF_in_if_statement1944);  
            stream_IF.add(IF187);


            LEFT_PAREN188=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_if_statement1946);  
            stream_LEFT_PAREN.add(LEFT_PAREN188);


            pushFollow(FOLLOW_boolean_exp_in_if_statement1948);
            boolean_exp189=boolean_exp();

            state._fsp--;

            stream_boolean_exp.add(boolean_exp189.getTree());

            RIGHT_PAREN190=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_if_statement1950);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN190);


            LEFT_BRACKET191=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_if_statement1952);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET191);


            pushFollow(FOLLOW_statements_in_if_statement1954);
            statements192=statements();

            state._fsp--;

            stream_statements.add(statements192.getTree());

            RIGHT_BRACKET193=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_if_statement1956);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET193);


            // AST REWRITE
            // elements: boolean_exp, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:80: -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:188:83: ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF_STATEMENT, "IF_STATEMENT")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:188:98: ^( BOOL_EXP boolean_exp )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                , root_2);

                adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:188:122: ^( STATEMENTS statements )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_2);

                adaptor.addChild(root_2, stream_statements.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_statement"


    public static class boolean_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_stmt"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:191:1: boolean_stmt : variable boolean_right -> ^( VAR variable ) boolean_right ;
    public final QueryLanguageParser.boolean_stmt_return boolean_stmt() throws RecognitionException {
        QueryLanguageParser.boolean_stmt_return retval = new QueryLanguageParser.boolean_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable194 =null;

        QueryLanguageParser.boolean_right_return boolean_right195 =null;


        RewriteRuleSubtreeStream stream_boolean_right=new RewriteRuleSubtreeStream(adaptor,"rule boolean_right");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:192:2: ( variable boolean_right -> ^( VAR variable ) boolean_right )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:192:4: variable boolean_right
            {
            pushFollow(FOLLOW_variable_in_boolean_stmt1985);
            variable194=variable();

            state._fsp--;

            stream_variable.add(variable194.getTree());

            pushFollow(FOLLOW_boolean_right_in_boolean_stmt1987);
            boolean_right195=boolean_right();

            state._fsp--;

            stream_boolean_right.add(boolean_right195.getTree());

            // AST REWRITE
            // elements: boolean_right, variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 192:27: -> ^( VAR variable ) boolean_right
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:192:30: ^( VAR variable )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR, "VAR")
                , root_1);

                adaptor.addChild(root_1, stream_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_boolean_right.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_stmt"


    public static class boolean_right_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_right"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:195:1: boolean_right : ( boolean_op variable -> ^( boolean_op variable ) | -> EPSILON );
    public final QueryLanguageParser.boolean_right_return boolean_right() throws RecognitionException {
        QueryLanguageParser.boolean_right_return retval = new QueryLanguageParser.boolean_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.boolean_op_return boolean_op196 =null;

        QueryLanguageParser.variable_return variable197 =null;


        RewriteRuleSubtreeStream stream_boolean_op=new RewriteRuleSubtreeStream(adaptor,"rule boolean_op");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:196:2: ( boolean_op variable -> ^( boolean_op variable ) | -> EPSILON )
            int alt27=2;
            switch ( input.LA(1) ) {
            case GT:
            case GTE:
            case LOGIC_EQUALS:
            case LTE:
            case NOT_EQUAL:
                {
                alt27=1;
                }
                break;
            case LT:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==NODE_TYPE) ) {
                    alt27=2;
                }
                else if ( (LA27_2==DEPTH||LA27_2==ID||LA27_2==INTEGER||LA27_2==LEFT_BRACKET||LA27_2==LEFT_SQ_BRACKET||LA27_2==LT||(LA27_2 >= MAX && LA27_2 <= MIN)||LA27_2==RESERVED_TYPES||LA27_2==STRING) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;

                }
                }
                break;
            case EOF:
            case AND:
            case DEPTH:
            case FOREACH:
            case ID:
            case IF:
            case INTEGER:
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case MAX:
            case MIN:
            case OR:
            case PRINT:
            case RESERVED_TYPES:
            case RIGHT_BRACKET:
            case RIGHT_PAREN:
            case SELECT:
            case SEMICOLON:
            case SET:
            case STRING:
                {
                alt27=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:196:4: boolean_op variable
                    {
                    pushFollow(FOLLOW_boolean_op_in_boolean_right2008);
                    boolean_op196=boolean_op();

                    state._fsp--;

                    stream_boolean_op.add(boolean_op196.getTree());

                    pushFollow(FOLLOW_variable_in_boolean_right2010);
                    variable197=variable();

                    state._fsp--;

                    stream_variable.add(variable197.getTree());

                    // AST REWRITE
                    // elements: boolean_op, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:24: -> ^( boolean_op variable )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:196:27: ^( boolean_op variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_boolean_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:197:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_right"


    public static class boolean_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_exp"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:200:1: boolean_exp : ( boolean_stmt boolean_exp_cont -> boolean_stmt ^( BOOL_EXP boolean_exp_cont ) | NOT boolean_exp -> ^( NOT ^( BOOL_EXP boolean_exp ) ) );
    public final QueryLanguageParser.boolean_exp_return boolean_exp() throws RecognitionException {
        QueryLanguageParser.boolean_exp_return retval = new QueryLanguageParser.boolean_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT200=null;
        QueryLanguageParser.boolean_stmt_return boolean_stmt198 =null;

        QueryLanguageParser.boolean_exp_cont_return boolean_exp_cont199 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp201 =null;


        Object NOT200_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_boolean_stmt=new RewriteRuleSubtreeStream(adaptor,"rule boolean_stmt");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_boolean_exp_cont=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp_cont");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:201:2: ( boolean_stmt boolean_exp_cont -> boolean_stmt ^( BOOL_EXP boolean_exp_cont ) | NOT boolean_exp -> ^( NOT ^( BOOL_EXP boolean_exp ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DEPTH||LA28_0==ID||LA28_0==INTEGER||LA28_0==LEFT_BRACKET||LA28_0==LEFT_SQ_BRACKET||LA28_0==LT||(LA28_0 >= MAX && LA28_0 <= MIN)||LA28_0==RESERVED_TYPES||LA28_0==STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==NOT) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:201:4: boolean_stmt boolean_exp_cont
                    {
                    pushFollow(FOLLOW_boolean_stmt_in_boolean_exp2037);
                    boolean_stmt198=boolean_stmt();

                    state._fsp--;

                    stream_boolean_stmt.add(boolean_stmt198.getTree());

                    pushFollow(FOLLOW_boolean_exp_cont_in_boolean_exp2039);
                    boolean_exp_cont199=boolean_exp_cont();

                    state._fsp--;

                    stream_boolean_exp_cont.add(boolean_exp_cont199.getTree());

                    // AST REWRITE
                    // elements: boolean_exp_cont, boolean_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:34: -> boolean_stmt ^( BOOL_EXP boolean_exp_cont )
                    {
                        adaptor.addChild(root_0, stream_boolean_stmt.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:201:50: ^( BOOL_EXP boolean_exp_cont )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_1);

                        adaptor.addChild(root_1, stream_boolean_exp_cont.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:202:4: NOT boolean_exp
                    {
                    NOT200=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_exp2054);  
                    stream_NOT.add(NOT200);


                    pushFollow(FOLLOW_boolean_exp_in_boolean_exp2056);
                    boolean_exp201=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp201.getTree());

                    // AST REWRITE
                    // elements: boolean_exp, NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:22: -> ^( NOT ^( BOOL_EXP boolean_exp ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:202:25: ^( NOT ^( BOOL_EXP boolean_exp ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_NOT.nextNode()
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:202:31: ^( BOOL_EXP boolean_exp )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_2);

                        adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_exp"


    public static class boolean_exp_cont_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_exp_cont"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:205:1: boolean_exp_cont : ( logical_op boolean_exp -> logical_op ^( BOOL_EXP boolean_exp ) | -> EPSILON );
    public final QueryLanguageParser.boolean_exp_cont_return boolean_exp_cont() throws RecognitionException {
        QueryLanguageParser.boolean_exp_cont_return retval = new QueryLanguageParser.boolean_exp_cont_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.logical_op_return logical_op202 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp203 =null;


        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_logical_op=new RewriteRuleSubtreeStream(adaptor,"rule logical_op");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:206:2: ( logical_op boolean_exp -> logical_op ^( BOOL_EXP boolean_exp ) | -> EPSILON )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==AND||LA29_0==OR) ) {
                alt29=1;
            }
            else if ( (LA29_0==EOF||LA29_0==DEPTH||LA29_0==FOREACH||(LA29_0 >= ID && LA29_0 <= IF)||LA29_0==INTEGER||LA29_0==LEFT_BRACKET||LA29_0==LEFT_SQ_BRACKET||LA29_0==LT||(LA29_0 >= MAX && LA29_0 <= MIN)||LA29_0==PRINT||(LA29_0 >= RESERVED_TYPES && LA29_0 <= RIGHT_PAREN)||LA29_0==SELECT||(LA29_0 >= SEMICOLON && LA29_0 <= SET)||LA29_0==STRING) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:206:4: logical_op boolean_exp
                    {
                    pushFollow(FOLLOW_logical_op_in_boolean_exp_cont2081);
                    logical_op202=logical_op();

                    state._fsp--;

                    stream_logical_op.add(logical_op202.getTree());

                    pushFollow(FOLLOW_boolean_exp_in_boolean_exp_cont2083);
                    boolean_exp203=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp203.getTree());

                    // AST REWRITE
                    // elements: boolean_exp, logical_op
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:28: -> logical_op ^( BOOL_EXP boolean_exp )
                    {
                        adaptor.addChild(root_0, stream_logical_op.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:206:42: ^( BOOL_EXP boolean_exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_1);

                        adaptor.addChild(root_1, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:207:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_exp_cont"


    public static class binary_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binary_op"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:210:1: binary_op : ( PLUS variable -> PLUS ^( VAR variable ) | MINUS variable -> MINUS ^( VAR variable ) | DIVIDE variable -> DIVIDE ^( VAR variable ) | -> EPSILON );
    public final QueryLanguageParser.binary_op_return binary_op() throws RecognitionException {
        QueryLanguageParser.binary_op_return retval = new QueryLanguageParser.binary_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS204=null;
        Token MINUS206=null;
        Token DIVIDE208=null;
        QueryLanguageParser.variable_return variable205 =null;

        QueryLanguageParser.variable_return variable207 =null;

        QueryLanguageParser.variable_return variable209 =null;


        Object PLUS204_tree=null;
        Object MINUS206_tree=null;
        Object DIVIDE208_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:211:2: ( PLUS variable -> PLUS ^( VAR variable ) | MINUS variable -> MINUS ^( VAR variable ) | DIVIDE variable -> DIVIDE ^( VAR variable ) | -> EPSILON )
            int alt30=4;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt30=1;
                }
                break;
            case MINUS:
                {
                alt30=2;
                }
                break;
            case DIVIDE:
                {
                alt30=3;
                }
                break;
            case SEMICOLON:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:211:4: PLUS variable
                    {
                    PLUS204=(Token)match(input,PLUS,FOLLOW_PLUS_in_binary_op2112);  
                    stream_PLUS.add(PLUS204);


                    pushFollow(FOLLOW_variable_in_binary_op2114);
                    variable205=variable();

                    state._fsp--;

                    stream_variable.add(variable205.getTree());

                    // AST REWRITE
                    // elements: PLUS, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:20: -> PLUS ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_PLUS.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:211:28: ^( VAR variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:212:4: MINUS variable
                    {
                    MINUS206=(Token)match(input,MINUS,FOLLOW_MINUS_in_binary_op2131);  
                    stream_MINUS.add(MINUS206);


                    pushFollow(FOLLOW_variable_in_binary_op2133);
                    variable207=variable();

                    state._fsp--;

                    stream_variable.add(variable207.getTree());

                    // AST REWRITE
                    // elements: MINUS, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:21: -> MINUS ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_MINUS.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:212:30: ^( VAR variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:213:4: DIVIDE variable
                    {
                    DIVIDE208=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_binary_op2150);  
                    stream_DIVIDE.add(DIVIDE208);


                    pushFollow(FOLLOW_variable_in_binary_op2152);
                    variable209=variable();

                    state._fsp--;

                    stream_variable.add(variable209.getTree());

                    // AST REWRITE
                    // elements: variable, DIVIDE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:22: -> DIVIDE ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_DIVIDE.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:213:32: ^( VAR variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:214:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 214:4: -> EPSILON
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(EPSILON, "EPSILON")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "binary_op"


    public static class boolean_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_op"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:216:1: boolean_op : ( GT -> GT | GTE -> GTE | LT -> LT | LTE -> LTE | NOT_EQUAL -> NOT_EQUAL | LOGIC_EQUALS -> LOGIC_EQUALS );
    public final QueryLanguageParser.boolean_op_return boolean_op() throws RecognitionException {
        QueryLanguageParser.boolean_op_return retval = new QueryLanguageParser.boolean_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GT210=null;
        Token GTE211=null;
        Token LT212=null;
        Token LTE213=null;
        Token NOT_EQUAL214=null;
        Token LOGIC_EQUALS215=null;

        Object GT210_tree=null;
        Object GTE211_tree=null;
        Object LT212_tree=null;
        Object LTE213_tree=null;
        Object NOT_EQUAL214_tree=null;
        Object LOGIC_EQUALS215_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_LOGIC_EQUALS=new RewriteRuleTokenStream(adaptor,"token LOGIC_EQUALS");
        RewriteRuleTokenStream stream_NOT_EQUAL=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL");
        RewriteRuleTokenStream stream_LTE=new RewriteRuleTokenStream(adaptor,"token LTE");
        RewriteRuleTokenStream stream_GTE=new RewriteRuleTokenStream(adaptor,"token GTE");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:217:2: ( GT -> GT | GTE -> GTE | LT -> LT | LTE -> LTE | NOT_EQUAL -> NOT_EQUAL | LOGIC_EQUALS -> LOGIC_EQUALS )
            int alt31=6;
            switch ( input.LA(1) ) {
            case GT:
                {
                alt31=1;
                }
                break;
            case GTE:
                {
                alt31=2;
                }
                break;
            case LT:
                {
                alt31=3;
                }
                break;
            case LTE:
                {
                alt31=4;
                }
                break;
            case NOT_EQUAL:
                {
                alt31=5;
                }
                break;
            case LOGIC_EQUALS:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:217:4: GT
                    {
                    GT210=(Token)match(input,GT,FOLLOW_GT_in_boolean_op2181);  
                    stream_GT.add(GT210);


                    // AST REWRITE
                    // elements: GT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:8: -> GT
                    {
                        adaptor.addChild(root_0, 
                        stream_GT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:218:4: GTE
                    {
                    GTE211=(Token)match(input,GTE,FOLLOW_GTE_in_boolean_op2191);  
                    stream_GTE.add(GTE211);


                    // AST REWRITE
                    // elements: GTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:9: -> GTE
                    {
                        adaptor.addChild(root_0, 
                        stream_GTE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:219:4: LT
                    {
                    LT212=(Token)match(input,LT,FOLLOW_LT_in_boolean_op2201);  
                    stream_LT.add(LT212);


                    // AST REWRITE
                    // elements: LT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:8: -> LT
                    {
                        adaptor.addChild(root_0, 
                        stream_LT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:220:4: LTE
                    {
                    LTE213=(Token)match(input,LTE,FOLLOW_LTE_in_boolean_op2211);  
                    stream_LTE.add(LTE213);


                    // AST REWRITE
                    // elements: LTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:9: -> LTE
                    {
                        adaptor.addChild(root_0, 
                        stream_LTE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:221:4: NOT_EQUAL
                    {
                    NOT_EQUAL214=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolean_op2221);  
                    stream_NOT_EQUAL.add(NOT_EQUAL214);


                    // AST REWRITE
                    // elements: NOT_EQUAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:14: -> NOT_EQUAL
                    {
                        adaptor.addChild(root_0, 
                        stream_NOT_EQUAL.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:222:4: LOGIC_EQUALS
                    {
                    LOGIC_EQUALS215=(Token)match(input,LOGIC_EQUALS,FOLLOW_LOGIC_EQUALS_in_boolean_op2230);  
                    stream_LOGIC_EQUALS.add(LOGIC_EQUALS215);


                    // AST REWRITE
                    // elements: LOGIC_EQUALS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:17: -> LOGIC_EQUALS
                    {
                        adaptor.addChild(root_0, 
                        stream_LOGIC_EQUALS.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_op"


    public static class logical_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_op"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:224:1: logical_op : ( AND -> AND | OR -> OR );
    public final QueryLanguageParser.logical_op_return logical_op() throws RecognitionException {
        QueryLanguageParser.logical_op_return retval = new QueryLanguageParser.logical_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND216=null;
        Token OR217=null;

        Object AND216_tree=null;
        Object OR217_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:225:2: ( AND -> AND | OR -> OR )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==AND) ) {
                alt32=1;
            }
            else if ( (LA32_0==OR) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:225:4: AND
                    {
                    AND216=(Token)match(input,AND,FOLLOW_AND_in_logical_op2244);  
                    stream_AND.add(AND216);


                    // AST REWRITE
                    // elements: AND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:9: -> AND
                    {
                        adaptor.addChild(root_0, 
                        stream_AND.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:226:4: OR
                    {
                    OR217=(Token)match(input,OR,FOLLOW_OR_in_logical_op2254);  
                    stream_OR.add(OR217);


                    // AST REWRITE
                    // elements: OR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:8: -> OR
                    {
                        adaptor.addChild(root_0, 
                        stream_OR.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_op"

    // Delegated rules


 

    public static final BitSet FOLLOW_queries_in_startrule283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_queries301 = new BitSet(new long[]{0x0000000810000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_query_in_queries303 = new BitSet(new long[]{0x0000000810000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_query_name_in_query314 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_foreach_query_in_query316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_print_stmt_in_query318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_select_query_in_query351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_print_stmt_in_query353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query384 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_query386 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FILTER_in_query388 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_query390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_print_stmt_in_query392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_query_name434 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_query_name436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_in_foreach_query458 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_foreach_query460 = new BitSet(new long[]{0x0002500800000000L});
    public static final BitSet FOLLOW_node_chain_in_foreach_query462 = new BitSet(new long[]{0x0000004800000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_foreach_query464 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_in_clause_in_foreach_query467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_foreach_query469 = new BitSet(new long[]{0x0000100000000000L,0x0000000050000000L});
    public static final BitSet FOLLOW_with_clause_in_foreach_query471 = new BitSet(new long[]{0x0000100000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_foreach_where_in_foreach_query473 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_stat_statements_in_foreach_query475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_foreach_where516 = new BitSet(new long[]{0x101A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_boolean_exp_in_foreach_where518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_query544 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_select_query546 = new BitSet(new long[]{0x0002500800000000L});
    public static final BitSet FOLLOW_node_chain_in_select_query548 = new BitSet(new long[]{0x0000104800000000L,0x0000000000040480L});
    public static final BitSet FOLLOW_ID_in_select_query550 = new BitSet(new long[]{0x0000104000000000L,0x0000000000040480L});
    public static final BitSet FOLLOW_node_chain_op_in_select_query553 = new BitSet(new long[]{0x0000104000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_select_query555 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_in_clause_in_select_query557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_select_query559 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L});
    public static final BitSet FOLLOW_with_clause_in_select_query561 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_where_in_select_query563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_select_where611 = new BitSet(new long[]{0x101A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_boolean_exp_in_select_where613 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_stat_statements_in_select_where615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_in_clause650 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_in_clause652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_with_clause674 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_in_with_clause676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AS_in_with_clause678 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_with_clause680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_node_chain_op715 = new BitSet(new long[]{0x0002500800000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain_op717 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ID_in_node_chain_op719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATER_in_node_chain_op740 = new BitSet(new long[]{0x0002500800000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain_op742 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ID_in_node_chain_op744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain780 = new BitSet(new long[]{0x0002500800000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain805 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_node_chain807 = new BitSet(new long[]{0x0000000000002100L,0x0000000000000001L});
    public static final BitSet FOLLOW_attr_in_node_chain809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_node_chain861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain863 = new BitSet(new long[]{0x0002500800000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_node_chain901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_keywords_in_node_chain935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_node_chain958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain960 = new BitSet(new long[]{0x0002500800000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_node_chain985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_node1008 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_NODE_TYPE_in_node1010 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_GT_in_node1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQ_BRACKET_in_node1022 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_node1024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_SQ_BRACKET_in_node1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_ast_child1044 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_ast_child1046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_ast_child1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1062 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CONTAINS_in_keywords1064 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1066 = new BitSet(new long[]{0x8002500800000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1084 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IS_in_keywords1086 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1088 = new BitSet(new long[]{0x8002500800000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1107 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_HAS_in_keywords1109 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1111 = new BitSet(new long[]{0x8002500800000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_keyword_nodes1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_keyword_nodes1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_op_in_keyword_nodes1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_keyword_nodes1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_attr1191 = new BitSet(new long[]{0x0000000000002100L,0x0000000000000001L});
    public static final BitSet FOLLOW_attr_in_attr1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1212 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CONTAINS_in_attr1214 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1216 = new BitSet(new long[]{0x8002500800000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1234 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IS_in_attr1236 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1238 = new BitSet(new long[]{0x8002500800000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1257 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_HAS_in_attr1259 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1261 = new BitSet(new long[]{0x8002500800000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTES_in_attr1279 = new BitSet(new long[]{0x0000000000002100L,0x0000000000000001L});
    public static final BitSet FOLLOW_attr_in_attr1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_PERIOD_in_property1336 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CONTAINS_in_property1338 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1340 = new BitSet(new long[]{0x8002500800000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_property1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable1371 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_variable1373 = new BitSet(new long[]{0x0000000000002100L,0x0000000000000001L});
    public static final BitSet FOLLOW_attr_in_variable1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_chain_in_variable1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_variable1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_variable1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESERVED_TYPES_in_variable1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_variable1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_function1506 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1508 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_in_function1510 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_function1512 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_in_function1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_function1531 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1533 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_in_function1535 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_function1537 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_in_function1539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEPTH_in_function1562 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1564 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_in_function1566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_block1588 = new BitSet(new long[]{0x0002500800000000L,0x0000000000040280L});
    public static final BitSet FOLLOW_block_statements_in_block1590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_block1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_block_statements1617 = new BitSet(new long[]{0x0002500800000000L,0x0000000000040080L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATER_in_block_statements1635 = new BitSet(new long[]{0x0002500800000000L,0x0000000000040080L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_chain_in_block_statements1652 = new BitSet(new long[]{0x0002500800000000L,0x0000000000040080L});
    public static final BitSet FOLLOW_block_in_block_statements1654 = new BitSet(new long[]{0x0002500800000000L,0x0000000000040080L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt1692 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_stmt_in_print_stmt1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print_stmt1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_stat_statements1718 = new BitSet(new long[]{0x001A521810040000L,0x0000000000209300L});
    public static final BitSet FOLLOW_statements_in_stat_statements1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_stat_statements1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_assn_in_statements1745 = new BitSet(new long[]{0x001A521810040000L,0x0000000000209100L});
    public static final BitSet FOLLOW_statements_in_statements1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statements1762 = new BitSet(new long[]{0x001A521810040000L,0x0000000000209100L});
    public static final BitSet FOLLOW_statements_in_statements1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_statements1780 = new BitSet(new long[]{0x001A521810040000L,0x0000000000209100L});
    public static final BitSet FOLLOW_statements_in_statements1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_statements1798 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_assn_in_statements1800 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_WHERE_in_statements1802 = new BitSet(new long[]{0x101A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_boolean_exp_in_statements1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMICOLON_in_statements1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_stmt1835 = new BitSet(new long[]{0x0020000000080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_binary_op_in_variable_stmt1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_assn1869 = new BitSet(new long[]{0x0000010000408000L});
    public static final BitSet FOLLOW_variable_assn_right_in_variable_assn1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_variable_assn_right1891 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_stmt_in_variable_assn_right1893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPOUND_ADD_in_variable_assn_right1909 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_stmt_in_variable_assn_right1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCREMENT_in_variable_assn_right1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1944 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_if_statement1946 = new BitSet(new long[]{0x101A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_boolean_exp_in_if_statement1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_if_statement1950 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_if_statement1952 = new BitSet(new long[]{0x001A521810040000L,0x0000000000209300L});
    public static final BitSet FOLLOW_statements_in_if_statement1954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_if_statement1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_boolean_stmt1985 = new BitSet(new long[]{0x2006800180000000L});
    public static final BitSet FOLLOW_boolean_right_in_boolean_stmt1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_op_in_boolean_right2008 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_in_boolean_right2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_stmt_in_boolean_exp2037 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_boolean_exp_cont_in_boolean_exp2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_boolean_exp2054 = new BitSet(new long[]{0x101A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_boolean_exp_in_boolean_exp2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_op_in_boolean_exp_cont2081 = new BitSet(new long[]{0x101A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_boolean_exp_in_boolean_exp_cont2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_binary_op2112 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_in_binary_op2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_binary_op2131 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_in_binary_op2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_binary_op2150 = new BitSet(new long[]{0x001A520800040000L,0x0000000000200100L});
    public static final BitSet FOLLOW_variable_in_binary_op2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_boolean_op2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_boolean_op2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_boolean_op2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_boolean_op2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolean_op2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGIC_EQUALS_in_boolean_op2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_logical_op2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_op2254 = new BitSet(new long[]{0x0000000000000002L});

}