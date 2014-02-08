package query;

// $ANTLR 3.4 C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g 2014-02-02 10:17:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryLanguageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AS", "AST_CHILD", "ATTRIBUTE", "ATTRIBUTES", "BIN_OP", "BLOCK_STATEMENTS", "BOOL_EXP", "CHAIN_ID", "COLON", "COMMA", "COMPOUND_ADD", "COMP_ADD", "CONTAINS", "DIVIDE", "DQOUTE", "EPSILON", "EQUALS", "ESC_SEQ", "EXPONENT", "FILTER", "FILTER_QUERY", "FLOAT", "FOREACH", "FOR_QUERY", "GT", "GTE", "HAS", "HEX_DIGIT", "ID", "IF", "IF_STATEMENT", "IN", "INCR", "INCREMENT", "INTEGER", "IN_CLAUSE", "IS", "LEFT_BRACKET", "LEFT_PAREN", "LEFT_SQ_BRACKET", "LOGIC_EQUALS", "LOGIC_OP", "LT", "LTE", "MAX", "MINUS", "NESTED", "NODE", "NODE_CHAIN", "NODE_NAME", "NODE_TYPE", "NOT", "NOT_EQUAL", "OCTAL_ESC", "OR", "PERIOD", "PLUS", "PRINT", "PROPERTY", "QUERIES", "QUERY", "QUERY_NAME", "REPEATER", "RESERVED_TYPES", "RIGHT_BRACKET", "RIGHT_PAREN", "RIGHT_SQ_BRACKET", "SELECT", "SELECT_QUERY", "SEMICOLON", "SET", "SET_TABLE", "SPACE", "STAR", "STATEMENT", "STATEMENTS", "STRING", "TABLE", "UNICODE_ESC", "VAR", "VAR_ASSIGN", "VAR_NAME", "VAR_STMT", "WHERE", "WHERE_BLOCK", "WITH", "WITH_CLAUSE"
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
    public static final int DIVIDE=18;
    public static final int DQOUTE=19;
    public static final int EPSILON=20;
    public static final int EQUALS=21;
    public static final int ESC_SEQ=22;
    public static final int EXPONENT=23;
    public static final int FILTER=24;
    public static final int FILTER_QUERY=25;
    public static final int FLOAT=26;
    public static final int FOREACH=27;
    public static final int FOR_QUERY=28;
    public static final int GT=29;
    public static final int GTE=30;
    public static final int HAS=31;
    public static final int HEX_DIGIT=32;
    public static final int ID=33;
    public static final int IF=34;
    public static final int IF_STATEMENT=35;
    public static final int IN=36;
    public static final int INCR=37;
    public static final int INCREMENT=38;
    public static final int INTEGER=39;
    public static final int IN_CLAUSE=40;
    public static final int IS=41;
    public static final int LEFT_BRACKET=42;
    public static final int LEFT_PAREN=43;
    public static final int LEFT_SQ_BRACKET=44;
    public static final int LOGIC_EQUALS=45;
    public static final int LOGIC_OP=46;
    public static final int LT=47;
    public static final int LTE=48;
    public static final int MAX=49;
    public static final int MINUS=50;
    public static final int NESTED=51;
    public static final int NODE=52;
    public static final int NODE_CHAIN=53;
    public static final int NODE_NAME=54;
    public static final int NODE_TYPE=55;
    public static final int NOT=56;
    public static final int NOT_EQUAL=57;
    public static final int OCTAL_ESC=58;
    public static final int OR=59;
    public static final int PERIOD=60;
    public static final int PLUS=61;
    public static final int PRINT=62;
    public static final int PROPERTY=63;
    public static final int QUERIES=64;
    public static final int QUERY=65;
    public static final int QUERY_NAME=66;
    public static final int REPEATER=67;
    public static final int RESERVED_TYPES=68;
    public static final int RIGHT_BRACKET=69;
    public static final int RIGHT_PAREN=70;
    public static final int RIGHT_SQ_BRACKET=71;
    public static final int SELECT=72;
    public static final int SELECT_QUERY=73;
    public static final int SEMICOLON=74;
    public static final int SET=75;
    public static final int SET_TABLE=76;
    public static final int SPACE=77;
    public static final int STAR=78;
    public static final int STATEMENT=79;
    public static final int STATEMENTS=80;
    public static final int STRING=81;
    public static final int TABLE=82;
    public static final int UNICODE_ESC=83;
    public static final int VAR=84;
    public static final int VAR_ASSIGN=85;
    public static final int VAR_NAME=86;
    public static final int VAR_STMT=87;
    public static final int WHERE=88;
    public static final int WHERE_BLOCK=89;
    public static final int WITH=90;
    public static final int WITH_CLAUSE=91;

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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:43:1: startrule : queries -> ^( QUERIES queries ) ;
    public final QueryLanguageParser.startrule_return startrule() throws RecognitionException {
        QueryLanguageParser.startrule_return retval = new QueryLanguageParser.startrule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.queries_return queries1 =null;


        RewriteRuleSubtreeStream stream_queries=new RewriteRuleSubtreeStream(adaptor,"rule queries");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:44:2: ( queries -> ^( QUERIES queries ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:44:4: queries
            {
            pushFollow(FOLLOW_queries_in_startrule269);
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
            // 44:12: -> ^( QUERIES queries )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:44:15: ^( QUERIES queries )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:47:1: queries : query ( query )* ;
    public final QueryLanguageParser.queries_return queries() throws RecognitionException {
        QueryLanguageParser.queries_return retval = new QueryLanguageParser.queries_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.query_return query2 =null;

        QueryLanguageParser.query_return query3 =null;



        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:47:9: ( query ( query )* )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:47:11: query ( query )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_query_in_queries287);
            query2=query();

            state._fsp--;

            adaptor.addChild(root_0, query2.getTree());

            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:47:17: ( query )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FOREACH||LA1_0==ID||LA1_0==SELECT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:47:17: query
            	    {
            	    pushFollow(FOLLOW_query_in_queries289);
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:50:1: query : ( query_name foreach_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) ) | query_name select_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) ) | query_name ID FILTER ID print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) ) );
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:50:7: ( query_name foreach_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) ) | query_name select_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) ) | query_name ID FILTER ID print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) ) )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:50:9: query_name foreach_query print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query300);
                    query_name4=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name4.getTree());

                    pushFollow(FOLLOW_foreach_query_in_query302);
                    foreach_query5=foreach_query();

                    state._fsp--;

                    stream_foreach_query.add(foreach_query5.getTree());

                    pushFollow(FOLLOW_print_stmt_in_query304);
                    print_stmt6=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt6.getTree());

                    // AST REWRITE
                    // elements: foreach_query, print_stmt, query_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:45: -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:50:48: ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:50:56: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:50:81: ^( FOR_QUERY foreach_query )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_QUERY, "FOR_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, stream_foreach_query.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:50:108: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:50:116: ( print_stmt )?
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:51:4: query_name select_query print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query335);
                    query_name7=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name7.getTree());

                    pushFollow(FOLLOW_select_query_in_query337);
                    select_query8=select_query();

                    state._fsp--;

                    stream_select_query.add(select_query8.getTree());

                    pushFollow(FOLLOW_print_stmt_in_query339);
                    print_stmt9=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt9.getTree());

                    // AST REWRITE
                    // elements: query_name, select_query, print_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 51:39: -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:51:42: ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:51:50: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:51:75: ^( SELECT_QUERY select_query )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SELECT_QUERY, "SELECT_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, stream_select_query.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:51:104: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:51:112: ( print_stmt )?
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:4: query_name ID FILTER ID print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query370);
                    query_name10=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name10.getTree());

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_query372);  
                    stream_ID.add(ID11);


                    FILTER12=(Token)match(input,FILTER,FOLLOW_FILTER_in_query374);  
                    stream_FILTER.add(FILTER12);


                    ID13=(Token)match(input,ID,FOLLOW_ID_in_query376);  
                    stream_ID.add(ID13);


                    pushFollow(FOLLOW_print_stmt_in_query378);
                    print_stmt14=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt14.getTree());

                    // AST REWRITE
                    // elements: print_stmt, ID, ID, query_name, FILTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:39: -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:42: ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:50: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:75: ^( FILTER_QUERY ID FILTER ID )
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

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:104: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:52:112: ( print_stmt )?
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:55:1: query_name : ( ID COLON -> ID | -> EPSILON );
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:2: ( ID COLON -> ID | -> EPSILON )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:4: ID COLON
                    {
                    ID15=(Token)match(input,ID,FOLLOW_ID_in_query_name420);  
                    stream_ID.add(ID15);


                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_query_name422);  
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
                    // 56:13: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:57:4: 
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
                    // 57:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:60:1: foreach_query : FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements ) ;
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:61:2: ( FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:61:4: FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements
            {
            FOREACH17=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_query444);  
            stream_FOREACH.add(FOREACH17);


            LEFT_PAREN18=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_foreach_query446);  
            stream_LEFT_PAREN.add(LEFT_PAREN18);


            pushFollow(FOLLOW_node_chain_in_foreach_query448);
            node_chain19=node_chain();

            state._fsp--;

            stream_node_chain.add(node_chain19.getTree());

            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:61:34: ( ID )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:61:34: ID
                    {
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_foreach_query450);  
                    stream_ID.add(ID20);


                    }
                    break;

            }


            pushFollow(FOLLOW_in_clause_in_foreach_query453);
            in_clause21=in_clause();

            state._fsp--;

            stream_in_clause.add(in_clause21.getTree());

            RIGHT_PAREN22=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_foreach_query455);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN22);


            pushFollow(FOLLOW_with_clause_in_foreach_query457);
            with_clause23=with_clause();

            state._fsp--;

            stream_with_clause.add(with_clause23.getTree());

            pushFollow(FOLLOW_foreach_where_in_foreach_query459);
            foreach_where24=foreach_where();

            state._fsp--;

            stream_foreach_where.add(foreach_where24.getTree());

            pushFollow(FOLLOW_stat_statements_in_foreach_query461);
            stat_statements25=stat_statements();

            state._fsp--;

            stream_stat_statements.add(stat_statements25.getTree());

            // AST REWRITE
            // elements: with_clause, node_chain, foreach_where, in_clause, ID, stat_statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:102: -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:61:105: ^( NODE_CHAIN node_chain )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:61:130: ^( CHAIN_ID ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:61:141: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:61:146: ^( IN_CLAUSE in_clause )
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

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:61:195: ^( STATEMENTS stat_statements )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:1: foreach_where : ( WHERE boolean_exp -> ^( WHERE_BLOCK boolean_exp ) | -> WHERE_BLOCK );
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:64:2: ( WHERE boolean_exp -> ^( WHERE_BLOCK boolean_exp ) | -> WHERE_BLOCK )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WHERE) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==FOREACH||(LA5_0 >= ID && LA5_0 <= IF)||LA5_0==INTEGER||LA5_0==LEFT_BRACKET||LA5_0==LEFT_SQ_BRACKET||LA5_0==LT||LA5_0==PRINT||(LA5_0 >= RESERVED_TYPES && LA5_0 <= RIGHT_BRACKET)||LA5_0==SELECT||LA5_0==SET||LA5_0==STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:64:4: WHERE boolean_exp
                    {
                    WHERE26=(Token)match(input,WHERE,FOLLOW_WHERE_in_foreach_where502);  
                    stream_WHERE.add(WHERE26);


                    pushFollow(FOLLOW_boolean_exp_in_foreach_where504);
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
                    // 64:22: -> ^( WHERE_BLOCK boolean_exp )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:64:25: ^( WHERE_BLOCK boolean_exp )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:65:4: 
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
                    // 65:4: -> WHERE_BLOCK
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:1: select_query : SELECT LEFT_PAREN node_chain block ( ID )? in_clause RIGHT_PAREN with_clause select_where -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where ;
    public final QueryLanguageParser.select_query_return select_query() throws RecognitionException {
        QueryLanguageParser.select_query_return retval = new QueryLanguageParser.select_query_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT28=null;
        Token LEFT_PAREN29=null;
        Token ID32=null;
        Token RIGHT_PAREN34=null;
        QueryLanguageParser.node_chain_return node_chain30 =null;

        QueryLanguageParser.block_return block31 =null;

        QueryLanguageParser.in_clause_return in_clause33 =null;

        QueryLanguageParser.with_clause_return with_clause35 =null;

        QueryLanguageParser.select_where_return select_where36 =null;


        Object SELECT28_tree=null;
        Object LEFT_PAREN29_tree=null;
        Object ID32_tree=null;
        Object RIGHT_PAREN34_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_in_clause=new RewriteRuleSubtreeStream(adaptor,"rule in_clause");
        RewriteRuleSubtreeStream stream_with_clause=new RewriteRuleSubtreeStream(adaptor,"rule with_clause");
        RewriteRuleSubtreeStream stream_select_where=new RewriteRuleSubtreeStream(adaptor,"rule select_where");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:69:2: ( SELECT LEFT_PAREN node_chain block ( ID )? in_clause RIGHT_PAREN with_clause select_where -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:69:4: SELECT LEFT_PAREN node_chain block ( ID )? in_clause RIGHT_PAREN with_clause select_where
            {
            SELECT28=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_query530);  
            stream_SELECT.add(SELECT28);


            LEFT_PAREN29=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_select_query532);  
            stream_LEFT_PAREN.add(LEFT_PAREN29);


            pushFollow(FOLLOW_node_chain_in_select_query534);
            node_chain30=node_chain();

            state._fsp--;

            stream_node_chain.add(node_chain30.getTree());

            pushFollow(FOLLOW_block_in_select_query536);
            block31=block();

            state._fsp--;

            stream_block.add(block31.getTree());

            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:69:39: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:69:39: ID
                    {
                    ID32=(Token)match(input,ID,FOLLOW_ID_in_select_query538);  
                    stream_ID.add(ID32);


                    }
                    break;

            }


            pushFollow(FOLLOW_in_clause_in_select_query541);
            in_clause33=in_clause();

            state._fsp--;

            stream_in_clause.add(in_clause33.getTree());

            RIGHT_PAREN34=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_select_query543);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN34);


            pushFollow(FOLLOW_with_clause_in_select_query545);
            with_clause35=with_clause();

            state._fsp--;

            stream_with_clause.add(with_clause35.getTree());

            pushFollow(FOLLOW_select_where_in_select_query547);
            select_where36=select_where();

            state._fsp--;

            stream_select_where.add(select_where36.getTree());

            // AST REWRITE
            // elements: with_clause, select_where, in_clause, ID, block, node_chain
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:90: -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:69:93: ^( NODE_CHAIN node_chain )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:69:118: ^( CHAIN_ID ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:69:129: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:69:134: ^( IN_CLAUSE in_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IN_CLAUSE, "IN_CLAUSE")
                , root_1);

                adaptor.addChild(root_1, stream_in_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:69:157: ^( BLOCK_STATEMENTS block )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:1: select_where : ( WHERE boolean_exp stat_statements -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) ) | -> WHERE_BLOCK );
    public final QueryLanguageParser.select_where_return select_where() throws RecognitionException {
        QueryLanguageParser.select_where_return retval = new QueryLanguageParser.select_where_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE37=null;
        QueryLanguageParser.boolean_exp_return boolean_exp38 =null;

        QueryLanguageParser.stat_statements_return stat_statements39 =null;


        Object WHERE37_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_stat_statements=new RewriteRuleSubtreeStream(adaptor,"rule stat_statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:72:2: ( WHERE boolean_exp stat_statements -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) ) | -> WHERE_BLOCK )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WHERE) ) {
                alt7=1;
            }
            else if ( (LA7_0==EOF||LA7_0==FOREACH||(LA7_0 >= ID && LA7_0 <= IF)||LA7_0==INTEGER||LA7_0==LEFT_BRACKET||LA7_0==LEFT_SQ_BRACKET||LA7_0==LT||LA7_0==PRINT||(LA7_0 >= RESERVED_TYPES && LA7_0 <= RIGHT_BRACKET)||LA7_0==SELECT||LA7_0==SET||LA7_0==STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:72:4: WHERE boolean_exp stat_statements
                    {
                    WHERE37=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_where588);  
                    stream_WHERE.add(WHERE37);


                    pushFollow(FOLLOW_boolean_exp_in_select_where590);
                    boolean_exp38=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp38.getTree());

                    pushFollow(FOLLOW_stat_statements_in_select_where592);
                    stat_statements39=stat_statements();

                    state._fsp--;

                    stream_stat_statements.add(stat_statements39.getTree());

                    // AST REWRITE
                    // elements: boolean_exp, stat_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:38: -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:72:41: ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHERE_BLOCK, "WHERE_BLOCK")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:72:55: ^( BOOL_EXP boolean_exp )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_2);

                        adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:72:79: ^( STATEMENTS stat_statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:73:4: 
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
                    // 73:4: -> WHERE_BLOCK
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:75:1: in_clause : ( IN ID -> ID | -> EPSILON );
    public final QueryLanguageParser.in_clause_return in_clause() throws RecognitionException {
        QueryLanguageParser.in_clause_return retval = new QueryLanguageParser.in_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IN40=null;
        Token ID41=null;

        Object IN40_tree=null;
        Object ID41_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:2: ( IN ID -> ID | -> EPSILON )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:4: IN ID
                    {
                    IN40=(Token)match(input,IN,FOLLOW_IN_in_in_clause627);  
                    stream_IN.add(IN40);


                    ID41=(Token)match(input,ID,FOLLOW_ID_in_in_clause629);  
                    stream_ID.add(ID41);


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
                    // 76:10: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:77:4: 
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
                    // 77:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:79:1: with_clause : ( WITH variable AS ID -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) ) | -> WITH_CLAUSE );
    public final QueryLanguageParser.with_clause_return with_clause() throws RecognitionException {
        QueryLanguageParser.with_clause_return retval = new QueryLanguageParser.with_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WITH42=null;
        Token AS44=null;
        Token ID45=null;
        QueryLanguageParser.variable_return variable43 =null;


        Object WITH42_tree=null;
        Object AS44_tree=null;
        Object ID45_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:80:2: ( WITH variable AS ID -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) ) | -> WITH_CLAUSE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WITH) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||LA9_0==FOREACH||(LA9_0 >= ID && LA9_0 <= IF)||LA9_0==INTEGER||LA9_0==LEFT_BRACKET||LA9_0==LEFT_SQ_BRACKET||LA9_0==LT||LA9_0==PRINT||(LA9_0 >= RESERVED_TYPES && LA9_0 <= RIGHT_BRACKET)||LA9_0==SELECT||LA9_0==SET||LA9_0==STRING||LA9_0==WHERE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:80:4: WITH variable AS ID
                    {
                    WITH42=(Token)match(input,WITH,FOLLOW_WITH_in_with_clause651);  
                    stream_WITH.add(WITH42);


                    pushFollow(FOLLOW_variable_in_with_clause653);
                    variable43=variable();

                    state._fsp--;

                    stream_variable.add(variable43.getTree());

                    AS44=(Token)match(input,AS,FOLLOW_AS_in_with_clause655);  
                    stream_AS.add(AS44);


                    ID45=(Token)match(input,ID,FOLLOW_ID_in_with_clause657);  
                    stream_ID.add(ID45);


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
                    // 80:24: -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:80:27: ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WITH_CLAUSE, "WITH_CLAUSE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:80:41: ^( VAR variable )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_2);

                        adaptor.addChild(root_2, stream_variable.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:80:57: ^( CHAIN_ID ID )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:81:4: 
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
                    // 81:4: -> WITH_CLAUSE
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


    public static class node_chain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "node_chain"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:83:1: node_chain : ( node PERIOD node_chain -> ^( NODE node ) ^( NODE_CHAIN node_chain ) | node COLON attr -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) ) | node -> ^( NODE ^( NODE_NAME node ) ) | ast_child PERIOD node_chain -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) ) | ast_child -> ^( NODE ^( AST_CHILD ast_child ) ) | node keywords -> ^( NODE ^( NODE_NAME node ) keywords ) | ID PERIOD node_chain -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) ) | property -> ^( PROPERTY property ) );
    public final QueryLanguageParser.node_chain_return node_chain() throws RecognitionException {
        QueryLanguageParser.node_chain_return retval = new QueryLanguageParser.node_chain_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD47=null;
        Token COLON50=null;
        Token PERIOD54=null;
        Token ID59=null;
        Token PERIOD60=null;
        QueryLanguageParser.node_return node46 =null;

        QueryLanguageParser.node_chain_return node_chain48 =null;

        QueryLanguageParser.node_return node49 =null;

        QueryLanguageParser.attr_return attr51 =null;

        QueryLanguageParser.node_return node52 =null;

        QueryLanguageParser.ast_child_return ast_child53 =null;

        QueryLanguageParser.node_chain_return node_chain55 =null;

        QueryLanguageParser.ast_child_return ast_child56 =null;

        QueryLanguageParser.node_return node57 =null;

        QueryLanguageParser.keywords_return keywords58 =null;

        QueryLanguageParser.node_chain_return node_chain61 =null;

        QueryLanguageParser.property_return property62 =null;


        Object PERIOD47_tree=null;
        Object COLON50_tree=null;
        Object PERIOD54_tree=null;
        Object ID59_tree=null;
        Object PERIOD60_tree=null;
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:84:2: ( node PERIOD node_chain -> ^( NODE node ) ^( NODE_CHAIN node_chain ) | node COLON attr -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) ) | node -> ^( NODE ^( NODE_NAME node ) ) | ast_child PERIOD node_chain -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) ) | ast_child -> ^( NODE ^( AST_CHILD ast_child ) ) | node keywords -> ^( NODE ^( NODE_NAME node ) keywords ) | ID PERIOD node_chain -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) ) | property -> ^( PROPERTY property ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case LT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==NODE_TYPE) ) {
                    int LA10_5 = input.LA(3);

                    if ( (LA10_5==GT) ) {
                        switch ( input.LA(4) ) {
                        case PERIOD:
                            {
                            int LA10_14 = input.LA(5);

                            if ( (LA10_14==CONTAINS||LA10_14==HAS||LA10_14==IS) ) {
                                alt10=6;
                            }
                            else if ( (LA10_14==ID||LA10_14==LEFT_BRACKET||LA10_14==LEFT_SQ_BRACKET||LA10_14==LT) ) {
                                alt10=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 14, input);

                                throw nvae;

                            }
                            }
                            break;
                        case COLON:
                            {
                            alt10=2;
                            }
                            break;
                        case EOF:
                        case AND:
                        case AS:
                        case COMMA:
                        case COMPOUND_ADD:
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
                            alt10=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 10, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
                }
                break;
            case LEFT_SQ_BRACKET:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==ID) ) {
                    int LA10_6 = input.LA(3);

                    if ( (LA10_6==RIGHT_SQ_BRACKET) ) {
                        switch ( input.LA(4) ) {
                        case PERIOD:
                            {
                            int LA10_14 = input.LA(5);

                            if ( (LA10_14==CONTAINS||LA10_14==HAS||LA10_14==IS) ) {
                                alt10=6;
                            }
                            else if ( (LA10_14==ID||LA10_14==LEFT_BRACKET||LA10_14==LEFT_SQ_BRACKET||LA10_14==LT) ) {
                                alt10=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 14, input);

                                throw nvae;

                            }
                            }
                            break;
                        case COLON:
                            {
                            alt10=2;
                            }
                            break;
                        case EOF:
                        case AND:
                        case AS:
                        case COMMA:
                        case COMPOUND_ADD:
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
                            alt10=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 11, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
                }
                break;
            case LEFT_BRACKET:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==ID) ) {
                    int LA10_7 = input.LA(3);

                    if ( (LA10_7==RIGHT_BRACKET) ) {
                        int LA10_12 = input.LA(4);

                        if ( (LA10_12==PERIOD) ) {
                            alt10=4;
                        }
                        else if ( (LA10_12==EOF||(LA10_12 >= AND && LA10_12 <= AS)||(LA10_12 >= COMMA && LA10_12 <= COMPOUND_ADD)||LA10_12==DIVIDE||LA10_12==EQUALS||LA10_12==FOREACH||(LA10_12 >= GT && LA10_12 <= GTE)||(LA10_12 >= ID && LA10_12 <= IF)||LA10_12==IN||(LA10_12 >= INCREMENT && LA10_12 <= INTEGER)||LA10_12==LEFT_BRACKET||(LA10_12 >= LEFT_SQ_BRACKET && LA10_12 <= LOGIC_EQUALS)||(LA10_12 >= LT && LA10_12 <= LTE)||LA10_12==MINUS||LA10_12==NOT_EQUAL||LA10_12==OR||(LA10_12 >= PLUS && LA10_12 <= PRINT)||(LA10_12 >= REPEATER && LA10_12 <= RIGHT_PAREN)||LA10_12==SELECT||(LA10_12 >= SEMICOLON && LA10_12 <= SET)||LA10_12==STAR||LA10_12==STRING) ) {
                            alt10=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 12, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4==PERIOD) ) {
                    int LA10_8 = input.LA(3);

                    if ( (LA10_8==CONTAINS) ) {
                        alt10=8;
                    }
                    else if ( (LA10_8==ID||LA10_8==LEFT_BRACKET||LA10_8==LEFT_SQ_BRACKET||LA10_8==LT) ) {
                        alt10=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 8, input);

                        throw nvae;

                    }
                }
                else if ( (LA10_4==EOF||(LA10_4 >= AND && LA10_4 <= AS)||(LA10_4 >= COMMA && LA10_4 <= COMPOUND_ADD)||LA10_4==DIVIDE||LA10_4==EQUALS||LA10_4==FOREACH||(LA10_4 >= GT && LA10_4 <= GTE)||(LA10_4 >= ID && LA10_4 <= IF)||LA10_4==IN||(LA10_4 >= INCREMENT && LA10_4 <= INTEGER)||LA10_4==LEFT_BRACKET||(LA10_4 >= LEFT_SQ_BRACKET && LA10_4 <= LOGIC_EQUALS)||(LA10_4 >= LT && LA10_4 <= LTE)||LA10_4==MINUS||LA10_4==NOT_EQUAL||LA10_4==OR||(LA10_4 >= PLUS && LA10_4 <= PRINT)||(LA10_4 >= REPEATER && LA10_4 <= RIGHT_PAREN)||LA10_4==SELECT||(LA10_4 >= SEMICOLON && LA10_4 <= SET)||LA10_4==STAR||LA10_4==STRING) ) {
                    alt10=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:84:4: node PERIOD node_chain
                    {
                    pushFollow(FOLLOW_node_in_node_chain692);
                    node46=node();

                    state._fsp--;

                    stream_node.add(node46.getTree());

                    PERIOD47=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain694);  
                    stream_PERIOD.add(PERIOD47);


                    pushFollow(FOLLOW_node_chain_in_node_chain696);
                    node_chain48=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain48.getTree());

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
                    // 84:31: -> ^( NODE node ) ^( NODE_CHAIN node_chain )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:84:34: ^( NODE node )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        adaptor.addChild(root_1, stream_node.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:84:47: ^( NODE_CHAIN node_chain )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:85:4: node COLON attr
                    {
                    pushFollow(FOLLOW_node_in_node_chain719);
                    node49=node();

                    state._fsp--;

                    stream_node.add(node49.getTree());

                    COLON50=(Token)match(input,COLON,FOLLOW_COLON_in_node_chain721);  
                    stream_COLON.add(COLON50);


                    pushFollow(FOLLOW_attr_in_node_chain723);
                    attr51=attr();

                    state._fsp--;

                    stream_attr.add(attr51.getTree());

                    // AST REWRITE
                    // elements: node, attr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:24: -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:85:27: ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:85:34: ^( NODE_NAME node )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_node.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:85:52: ^( ATTRIBUTE attr )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:4: node
                    {
                    pushFollow(FOLLOW_node_in_node_chain750);
                    node52=node();

                    state._fsp--;

                    stream_node.add(node52.getTree());

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
                    // 86:15: -> ^( NODE ^( NODE_NAME node ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:18: ^( NODE ^( NODE_NAME node ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:25: ^( NODE_NAME node )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:6: ast_child PERIOD node_chain
                    {
                    pushFollow(FOLLOW_ast_child_in_node_chain775);
                    ast_child53=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child53.getTree());

                    PERIOD54=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain777);  
                    stream_PERIOD.add(PERIOD54);


                    pushFollow(FOLLOW_node_chain_in_node_chain779);
                    node_chain55=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain55.getTree());

                    // AST REWRITE
                    // elements: ast_child, node_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:45: -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:48: ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:55: ^( AST_CHILD ast_child )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AST_CHILD, "AST_CHILD")
                        , root_2);

                        adaptor.addChild(root_2, stream_ast_child.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:78: ^( NODE_CHAIN node_chain )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:88:6: ast_child
                    {
                    pushFollow(FOLLOW_ast_child_in_node_chain815);
                    ast_child56=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child56.getTree());

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
                    // 88:31: -> ^( NODE ^( AST_CHILD ast_child ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:88:34: ^( NODE ^( AST_CHILD ast_child ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:88:41: ^( AST_CHILD ast_child )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:89:4: node keywords
                    {
                    pushFollow(FOLLOW_node_in_node_chain847);
                    node57=node();

                    state._fsp--;

                    stream_node.add(node57.getTree());

                    pushFollow(FOLLOW_keywords_in_node_chain849);
                    keywords58=keywords();

                    state._fsp--;

                    stream_keywords.add(keywords58.getTree());

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
                    // 89:22: -> ^( NODE ^( NODE_NAME node ) keywords )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:89:25: ^( NODE ^( NODE_NAME node ) keywords )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:89:32: ^( NODE_NAME node )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:90:4: ID PERIOD node_chain
                    {
                    ID59=(Token)match(input,ID,FOLLOW_ID_in_node_chain872);  
                    stream_ID.add(ID59);


                    PERIOD60=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain874);  
                    stream_PERIOD.add(PERIOD60);


                    pushFollow(FOLLOW_node_chain_in_node_chain876);
                    node_chain61=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain61.getTree());

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
                    // 90:29: -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:90:32: ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:90:46: ^( NODE_CHAIN node_chain )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:4: property
                    {
                    pushFollow(FOLLOW_property_in_node_chain899);
                    property62=property();

                    state._fsp--;

                    stream_property.add(property62.getTree());

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
                    // 91:17: -> ^( PROPERTY property )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:20: ^( PROPERTY property )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:93:1: node : ( LT NODE_TYPE GT -> NODE_TYPE | LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^( TABLE ID ) );
    public final QueryLanguageParser.node_return node() throws RecognitionException {
        QueryLanguageParser.node_return retval = new QueryLanguageParser.node_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT63=null;
        Token NODE_TYPE64=null;
        Token GT65=null;
        Token LEFT_SQ_BRACKET66=null;
        Token ID67=null;
        Token RIGHT_SQ_BRACKET68=null;

        Object LT63_tree=null;
        Object NODE_TYPE64_tree=null;
        Object GT65_tree=null;
        Object LEFT_SQ_BRACKET66_tree=null;
        Object ID67_tree=null;
        Object RIGHT_SQ_BRACKET68_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NODE_TYPE=new RewriteRuleTokenStream(adaptor,"token NODE_TYPE");
        RewriteRuleTokenStream stream_RIGHT_SQ_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQ_BRACKET");
        RewriteRuleTokenStream stream_LEFT_SQ_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_SQ_BRACKET");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:94:2: ( LT NODE_TYPE GT -> NODE_TYPE | LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^( TABLE ID ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LT) ) {
                alt11=1;
            }
            else if ( (LA11_0==LEFT_SQ_BRACKET) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:94:4: LT NODE_TYPE GT
                    {
                    LT63=(Token)match(input,LT,FOLLOW_LT_in_node922);  
                    stream_LT.add(LT63);


                    NODE_TYPE64=(Token)match(input,NODE_TYPE,FOLLOW_NODE_TYPE_in_node924);  
                    stream_NODE_TYPE.add(NODE_TYPE64);


                    GT65=(Token)match(input,GT,FOLLOW_GT_in_node926);  
                    stream_GT.add(GT65);


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
                    // 94:20: -> NODE_TYPE
                    {
                        adaptor.addChild(root_0, 
                        stream_NODE_TYPE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:95:4: LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET
                    {
                    LEFT_SQ_BRACKET66=(Token)match(input,LEFT_SQ_BRACKET,FOLLOW_LEFT_SQ_BRACKET_in_node936);  
                    stream_LEFT_SQ_BRACKET.add(LEFT_SQ_BRACKET66);


                    ID67=(Token)match(input,ID,FOLLOW_ID_in_node938);  
                    stream_ID.add(ID67);


                    RIGHT_SQ_BRACKET68=(Token)match(input,RIGHT_SQ_BRACKET,FOLLOW_RIGHT_SQ_BRACKET_in_node940);  
                    stream_RIGHT_SQ_BRACKET.add(RIGHT_SQ_BRACKET68);


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
                    // 95:40: -> ^( TABLE ID )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:95:43: ^( TABLE ID )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:97:1: ast_child : LEFT_BRACKET ID RIGHT_BRACKET -> ID ;
    public final QueryLanguageParser.ast_child_return ast_child() throws RecognitionException {
        QueryLanguageParser.ast_child_return retval = new QueryLanguageParser.ast_child_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET69=null;
        Token ID70=null;
        Token RIGHT_BRACKET71=null;

        Object LEFT_BRACKET69_tree=null;
        Object ID70_tree=null;
        Object RIGHT_BRACKET71_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:98:2: ( LEFT_BRACKET ID RIGHT_BRACKET -> ID )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:98:4: LEFT_BRACKET ID RIGHT_BRACKET
            {
            LEFT_BRACKET69=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_ast_child958);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET69);


            ID70=(Token)match(input,ID,FOLLOW_ID_in_ast_child960);  
            stream_ID.add(ID70);


            RIGHT_BRACKET71=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_ast_child962);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET71);


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
            // 98:34: -> ID
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:100:1: keywords : ( PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) );
    public final QueryLanguageParser.keywords_return keywords() throws RecognitionException {
        QueryLanguageParser.keywords_return retval = new QueryLanguageParser.keywords_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD72=null;
        Token CONTAINS73=null;
        Token LEFT_PAREN74=null;
        Token RIGHT_PAREN76=null;
        Token PERIOD77=null;
        Token IS78=null;
        Token LEFT_PAREN79=null;
        Token RIGHT_PAREN81=null;
        Token PERIOD82=null;
        Token HAS83=null;
        Token LEFT_PAREN84=null;
        Token RIGHT_PAREN86=null;
        QueryLanguageParser.keyword_nodes_return keyword_nodes75 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes80 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes85 =null;


        Object PERIOD72_tree=null;
        Object CONTAINS73_tree=null;
        Object LEFT_PAREN74_tree=null;
        Object RIGHT_PAREN76_tree=null;
        Object PERIOD77_tree=null;
        Object IS78_tree=null;
        Object LEFT_PAREN79_tree=null;
        Object RIGHT_PAREN81_tree=null;
        Object PERIOD82_tree=null;
        Object HAS83_tree=null;
        Object LEFT_PAREN84_tree=null;
        Object RIGHT_PAREN86_tree=null;
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:101:2: ( PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==PERIOD) ) {
                switch ( input.LA(2) ) {
                case CONTAINS:
                    {
                    alt12=1;
                    }
                    break;
                case IS:
                    {
                    alt12=2;
                    }
                    break;
                case HAS:
                    {
                    alt12=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:101:4: PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD72=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords976);  
                    stream_PERIOD.add(PERIOD72);


                    CONTAINS73=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_keywords978);  
                    stream_CONTAINS.add(CONTAINS73);


                    LEFT_PAREN74=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords980);  
                    stream_LEFT_PAREN.add(LEFT_PAREN74);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords982);
                    keyword_nodes75=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes75.getTree());

                    RIGHT_PAREN76=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords984);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN76);


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
                    // 101:58: -> ^( CONTAINS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:101:61: ^( CONTAINS keyword_nodes )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:102:4: PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD77=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords998);  
                    stream_PERIOD.add(PERIOD77);


                    IS78=(Token)match(input,IS,FOLLOW_IS_in_keywords1000);  
                    stream_IS.add(IS78);


                    LEFT_PAREN79=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1002);  
                    stream_LEFT_PAREN.add(LEFT_PAREN79);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1004);
                    keyword_nodes80=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes80.getTree());

                    RIGHT_PAREN81=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1006);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN81);


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
                    // 102:53: -> ^( IS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:102:56: ^( IS keyword_nodes )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:103:4: PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD82=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1021);  
                    stream_PERIOD.add(PERIOD82);


                    HAS83=(Token)match(input,HAS,FOLLOW_HAS_in_keywords1023);  
                    stream_HAS.add(HAS83);


                    LEFT_PAREN84=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1025);  
                    stream_LEFT_PAREN.add(LEFT_PAREN84);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1027);
                    keyword_nodes85=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes85.getTree());

                    RIGHT_PAREN86=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1029);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN86);


                    // AST REWRITE
                    // elements: HAS, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:53: -> ^( HAS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:103:56: ^( HAS keyword_nodes )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:105:1: keyword_nodes : ( node -> ^( NODE_NAME node ) | ID -> ^( VAR_NAME ID ) | logical_op -> ^( LOGIC_OP logical_op ) | ast_child -> ^( AST_CHILD ast_child ) );
    public final QueryLanguageParser.keyword_nodes_return keyword_nodes() throws RecognitionException {
        QueryLanguageParser.keyword_nodes_return retval = new QueryLanguageParser.keyword_nodes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID88=null;
        QueryLanguageParser.node_return node87 =null;

        QueryLanguageParser.logical_op_return logical_op89 =null;

        QueryLanguageParser.ast_child_return ast_child90 =null;


        Object ID88_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_ast_child=new RewriteRuleSubtreeStream(adaptor,"rule ast_child");
        RewriteRuleSubtreeStream stream_node=new RewriteRuleSubtreeStream(adaptor,"rule node");
        RewriteRuleSubtreeStream stream_logical_op=new RewriteRuleSubtreeStream(adaptor,"rule logical_op");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:106:2: ( node -> ^( NODE_NAME node ) | ID -> ^( VAR_NAME ID ) | logical_op -> ^( LOGIC_OP logical_op ) | ast_child -> ^( AST_CHILD ast_child ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case LEFT_SQ_BRACKET:
            case LT:
                {
                alt13=1;
                }
                break;
            case ID:
                {
                alt13=2;
                }
                break;
            case AND:
            case OR:
                {
                alt13=3;
                }
                break;
            case LEFT_BRACKET:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:106:4: node
                    {
                    pushFollow(FOLLOW_node_in_keyword_nodes1048);
                    node87=node();

                    state._fsp--;

                    stream_node.add(node87.getTree());

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
                    // 106:9: -> ^( NODE_NAME node )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:106:12: ^( NODE_NAME node )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:107:4: ID
                    {
                    ID88=(Token)match(input,ID,FOLLOW_ID_in_keyword_nodes1061);  
                    stream_ID.add(ID88);


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
                    // 107:7: -> ^( VAR_NAME ID )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:107:10: ^( VAR_NAME ID )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:4: logical_op
                    {
                    pushFollow(FOLLOW_logical_op_in_keyword_nodes1074);
                    logical_op89=logical_op();

                    state._fsp--;

                    stream_logical_op.add(logical_op89.getTree());

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
                    // 108:15: -> ^( LOGIC_OP logical_op )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:108:18: ^( LOGIC_OP logical_op )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:109:4: ast_child
                    {
                    pushFollow(FOLLOW_ast_child_in_keyword_nodes1087);
                    ast_child90=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child90.getTree());

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
                    // 109:14: -> ^( AST_CHILD ast_child )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:109:17: ^( AST_CHILD ast_child )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:111:1: attr : ( COLON attr -> ^( ATTRIBUTES attr ) | PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | ATTRIBUTES attr -> ^( ATTRIBUTES attr ) | -> EPSILON );
    public final QueryLanguageParser.attr_return attr() throws RecognitionException {
        QueryLanguageParser.attr_return retval = new QueryLanguageParser.attr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON91=null;
        Token PERIOD93=null;
        Token CONTAINS94=null;
        Token LEFT_PAREN95=null;
        Token RIGHT_PAREN97=null;
        Token PERIOD98=null;
        Token IS99=null;
        Token LEFT_PAREN100=null;
        Token RIGHT_PAREN102=null;
        Token PERIOD103=null;
        Token HAS104=null;
        Token LEFT_PAREN105=null;
        Token RIGHT_PAREN107=null;
        Token ATTRIBUTES108=null;
        QueryLanguageParser.attr_return attr92 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes96 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes101 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes106 =null;

        QueryLanguageParser.attr_return attr109 =null;


        Object COLON91_tree=null;
        Object PERIOD93_tree=null;
        Object CONTAINS94_tree=null;
        Object LEFT_PAREN95_tree=null;
        Object RIGHT_PAREN97_tree=null;
        Object PERIOD98_tree=null;
        Object IS99_tree=null;
        Object LEFT_PAREN100_tree=null;
        Object RIGHT_PAREN102_tree=null;
        Object PERIOD103_tree=null;
        Object HAS104_tree=null;
        Object LEFT_PAREN105_tree=null;
        Object RIGHT_PAREN107_tree=null;
        Object ATTRIBUTES108_tree=null;
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:2: ( COLON attr -> ^( ATTRIBUTES attr ) | PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | ATTRIBUTES attr -> ^( ATTRIBUTES attr ) | -> EPSILON )
            int alt14=6;
            switch ( input.LA(1) ) {
            case COLON:
                {
                alt14=1;
                }
                break;
            case PERIOD:
                {
                switch ( input.LA(2) ) {
                case CONTAINS:
                    {
                    alt14=2;
                    }
                    break;
                case IS:
                    {
                    alt14=3;
                    }
                    break;
                case HAS:
                    {
                    alt14=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }

                }
                break;
            case ATTRIBUTES:
                {
                alt14=5;
                }
                break;
            case EOF:
            case AND:
            case AS:
            case COMMA:
            case COMPOUND_ADD:
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
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:4: COLON attr
                    {
                    COLON91=(Token)match(input,COLON,FOLLOW_COLON_in_attr1105);  
                    stream_COLON.add(COLON91);


                    pushFollow(FOLLOW_attr_in_attr1107);
                    attr92=attr();

                    state._fsp--;

                    stream_attr.add(attr92.getTree());

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
                    // 112:20: -> ^( ATTRIBUTES attr )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:24: ^( ATTRIBUTES attr )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:4: PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD93=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1126);  
                    stream_PERIOD.add(PERIOD93);


                    CONTAINS94=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_attr1128);  
                    stream_CONTAINS.add(CONTAINS94);


                    LEFT_PAREN95=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1130);  
                    stream_LEFT_PAREN.add(LEFT_PAREN95);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1132);
                    keyword_nodes96=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes96.getTree());

                    RIGHT_PAREN97=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1134);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN97);


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
                    // 113:58: -> ^( CONTAINS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:61: ^( CONTAINS keyword_nodes )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:114:4: PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD98=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1148);  
                    stream_PERIOD.add(PERIOD98);


                    IS99=(Token)match(input,IS,FOLLOW_IS_in_attr1150);  
                    stream_IS.add(IS99);


                    LEFT_PAREN100=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1152);  
                    stream_LEFT_PAREN.add(LEFT_PAREN100);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1154);
                    keyword_nodes101=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes101.getTree());

                    RIGHT_PAREN102=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1156);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN102);


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
                    // 114:53: -> ^( IS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:114:56: ^( IS keyword_nodes )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:115:4: PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD103=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1171);  
                    stream_PERIOD.add(PERIOD103);


                    HAS104=(Token)match(input,HAS,FOLLOW_HAS_in_attr1173);  
                    stream_HAS.add(HAS104);


                    LEFT_PAREN105=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1175);  
                    stream_LEFT_PAREN.add(LEFT_PAREN105);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1177);
                    keyword_nodes106=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes106.getTree());

                    RIGHT_PAREN107=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1179);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN107);


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
                    // 115:53: -> ^( HAS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:115:56: ^( HAS keyword_nodes )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:116:4: ATTRIBUTES attr
                    {
                    ATTRIBUTES108=(Token)match(input,ATTRIBUTES,FOLLOW_ATTRIBUTES_in_attr1193);  
                    stream_ATTRIBUTES.add(ATTRIBUTES108);


                    pushFollow(FOLLOW_attr_in_attr1195);
                    attr109=attr();

                    state._fsp--;

                    stream_attr.add(attr109.getTree());

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
                    // 116:24: -> ^( ATTRIBUTES attr )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:116:27: ^( ATTRIBUTES attr )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:117:4: 
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
                    // 117:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:119:1: property : ( ID -> ^( VAR_NAME ID ) | ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) ) );
    public final QueryLanguageParser.property_return property() throws RecognitionException {
        QueryLanguageParser.property_return retval = new QueryLanguageParser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID110=null;
        Token ID111=null;
        Token PERIOD112=null;
        Token CONTAINS113=null;
        Token LEFT_PAREN114=null;
        Token RIGHT_PAREN116=null;
        QueryLanguageParser.keyword_nodes_return keyword_nodes115 =null;


        Object ID110_tree=null;
        Object ID111_tree=null;
        Object PERIOD112_tree=null;
        Object CONTAINS113_tree=null;
        Object LEFT_PAREN114_tree=null;
        Object RIGHT_PAREN116_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:2: ( ID -> ^( VAR_NAME ID ) | ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==PERIOD) ) {
                    alt15=2;
                }
                else if ( (LA15_1==EOF||(LA15_1 >= AND && LA15_1 <= AS)||(LA15_1 >= COMMA && LA15_1 <= COMPOUND_ADD)||LA15_1==DIVIDE||LA15_1==EQUALS||LA15_1==FOREACH||(LA15_1 >= GT && LA15_1 <= GTE)||(LA15_1 >= ID && LA15_1 <= IF)||LA15_1==IN||(LA15_1 >= INCREMENT && LA15_1 <= INTEGER)||LA15_1==LEFT_BRACKET||(LA15_1 >= LEFT_SQ_BRACKET && LA15_1 <= LOGIC_EQUALS)||(LA15_1 >= LT && LA15_1 <= LTE)||LA15_1==MINUS||LA15_1==NOT_EQUAL||LA15_1==OR||(LA15_1 >= PLUS && LA15_1 <= PRINT)||(LA15_1 >= REPEATER && LA15_1 <= RIGHT_PAREN)||LA15_1==SELECT||(LA15_1 >= SEMICOLON && LA15_1 <= SET)||LA15_1==STAR||LA15_1==STRING) ) {
                    alt15=1;
                }
                else {
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:4: ID
                    {
                    ID110=(Token)match(input,ID,FOLLOW_ID_in_property1224);  
                    stream_ID.add(ID110);


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
                    // 120:18: -> ^( VAR_NAME ID )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:21: ^( VAR_NAME ID )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:121:4: ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    ID111=(Token)match(input,ID,FOLLOW_ID_in_property1248);  
                    stream_ID.add(ID111);


                    PERIOD112=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1250);  
                    stream_PERIOD.add(PERIOD112);


                    CONTAINS113=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_property1252);  
                    stream_CONTAINS.add(CONTAINS113);


                    LEFT_PAREN114=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1254);  
                    stream_LEFT_PAREN.add(LEFT_PAREN114);


                    pushFollow(FOLLOW_keyword_nodes_in_property1256);
                    keyword_nodes115=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes115.getTree());

                    RIGHT_PAREN116=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1258);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN116);


                    // AST REWRITE
                    // elements: ID, keyword_nodes, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:60: -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:121:63: ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:121:77: ^( CONTAINS keyword_nodes )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:124:1: variable : ( ID COLON attr -> ^( VAR_NAME ID attr ) | node_chain -> ^( NODE_CHAIN node_chain ) | INTEGER -> INTEGER | STRING -> STRING | RESERVED_TYPES -> RESERVED_TYPES );
    public final QueryLanguageParser.variable_return variable() throws RecognitionException {
        QueryLanguageParser.variable_return retval = new QueryLanguageParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID117=null;
        Token COLON118=null;
        Token INTEGER121=null;
        Token STRING122=null;
        Token RESERVED_TYPES123=null;
        QueryLanguageParser.attr_return attr119 =null;

        QueryLanguageParser.node_chain_return node_chain120 =null;


        Object ID117_tree=null;
        Object COLON118_tree=null;
        Object INTEGER121_tree=null;
        Object STRING122_tree=null;
        Object RESERVED_TYPES123_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RESERVED_TYPES=new RewriteRuleTokenStream(adaptor,"token RESERVED_TYPES");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:125:2: ( ID COLON attr -> ^( VAR_NAME ID attr ) | node_chain -> ^( NODE_CHAIN node_chain ) | INTEGER -> INTEGER | STRING -> STRING | RESERVED_TYPES -> RESERVED_TYPES )
            int alt16=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==COLON) ) {
                    alt16=1;
                }
                else if ( (LA16_1==EOF||(LA16_1 >= AND && LA16_1 <= AS)||(LA16_1 >= COMMA && LA16_1 <= COMPOUND_ADD)||LA16_1==DIVIDE||LA16_1==EQUALS||LA16_1==FOREACH||(LA16_1 >= GT && LA16_1 <= GTE)||(LA16_1 >= ID && LA16_1 <= IF)||(LA16_1 >= INCREMENT && LA16_1 <= INTEGER)||LA16_1==LEFT_BRACKET||(LA16_1 >= LEFT_SQ_BRACKET && LA16_1 <= LOGIC_EQUALS)||(LA16_1 >= LT && LA16_1 <= LTE)||LA16_1==MINUS||LA16_1==NOT_EQUAL||(LA16_1 >= OR && LA16_1 <= PRINT)||(LA16_1 >= RESERVED_TYPES && LA16_1 <= RIGHT_PAREN)||LA16_1==SELECT||(LA16_1 >= SEMICOLON && LA16_1 <= SET)||LA16_1==STRING) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
                }
                break;
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case LT:
                {
                alt16=2;
                }
                break;
            case INTEGER:
                {
                alt16=3;
                }
                break;
            case STRING:
                {
                alt16=4;
                }
                break;
            case RESERVED_TYPES:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:125:4: ID COLON attr
                    {
                    ID117=(Token)match(input,ID,FOLLOW_ID_in_variable1285);  
                    stream_ID.add(ID117);


                    COLON118=(Token)match(input,COLON,FOLLOW_COLON_in_variable1287);  
                    stream_COLON.add(COLON118);


                    pushFollow(FOLLOW_attr_in_variable1289);
                    attr119=attr();

                    state._fsp--;

                    stream_attr.add(attr119.getTree());

                    // AST REWRITE
                    // elements: ID, attr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:21: -> ^( VAR_NAME ID attr )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:125:24: ^( VAR_NAME ID attr )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:126:4: node_chain
                    {
                    pushFollow(FOLLOW_node_chain_in_variable1307);
                    node_chain120=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain120.getTree());

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
                    // 126:19: -> ^( NODE_CHAIN node_chain )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:126:22: ^( NODE_CHAIN node_chain )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:127:4: INTEGER
                    {
                    INTEGER121=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_variable1324);  
                    stream_INTEGER.add(INTEGER121);


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
                    // 127:16: -> INTEGER
                    {
                        adaptor.addChild(root_0, 
                        stream_INTEGER.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:128:10: STRING
                    {
                    STRING122=(Token)match(input,STRING,FOLLOW_STRING_in_variable1343);  
                    stream_STRING.add(STRING122);


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
                    // 128:50: -> STRING
                    {
                        adaptor.addChild(root_0, 
                        stream_STRING.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:129:4: RESERVED_TYPES
                    {
                    RESERVED_TYPES123=(Token)match(input,RESERVED_TYPES,FOLLOW_RESERVED_TYPES_in_variable1385);  
                    stream_RESERVED_TYPES.add(RESERVED_TYPES123);


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
                    // 129:22: -> RESERVED_TYPES
                    {
                        adaptor.addChild(root_0, 
                        stream_RESERVED_TYPES.nextNode()
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
    // $ANTLR end "variable"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:132:1: block : ( LEFT_BRACKET block_statements RIGHT_BRACKET -> ^( BLOCK_STATEMENTS block_statements ) | -> EPSILON );
    public final QueryLanguageParser.block_return block() throws RecognitionException {
        QueryLanguageParser.block_return retval = new QueryLanguageParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET124=null;
        Token RIGHT_BRACKET126=null;
        QueryLanguageParser.block_statements_return block_statements125 =null;


        Object LEFT_BRACKET124_tree=null;
        Object RIGHT_BRACKET126_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_block_statements=new RewriteRuleSubtreeStream(adaptor,"rule block_statements");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:133:2: ( LEFT_BRACKET block_statements RIGHT_BRACKET -> ^( BLOCK_STATEMENTS block_statements ) | -> EPSILON )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LEFT_BRACKET) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==ID) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==ID||LA17_3==LEFT_BRACKET||LA17_3==LEFT_SQ_BRACKET||LA17_3==LT||LA17_3==PERIOD||LA17_3==REPEATER||LA17_3==RIGHT_BRACKET||LA17_3==STAR) ) {
                        alt17=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA17_1==LEFT_BRACKET||LA17_1==LEFT_SQ_BRACKET||LA17_1==LT||LA17_1==REPEATER||LA17_1==RIGHT_BRACKET||LA17_1==STAR) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA17_0==ID||LA17_0==IN||LA17_0==LEFT_SQ_BRACKET||LA17_0==LT||LA17_0==REPEATER||(LA17_0 >= RIGHT_BRACKET && LA17_0 <= RIGHT_PAREN)||LA17_0==STAR) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:133:4: LEFT_BRACKET block_statements RIGHT_BRACKET
                    {
                    LEFT_BRACKET124=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_block1405);  
                    stream_LEFT_BRACKET.add(LEFT_BRACKET124);


                    pushFollow(FOLLOW_block_statements_in_block1407);
                    block_statements125=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements125.getTree());

                    RIGHT_BRACKET126=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_block1409);  
                    stream_RIGHT_BRACKET.add(RIGHT_BRACKET126);


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
                    // 133:48: -> ^( BLOCK_STATEMENTS block_statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:133:51: ^( BLOCK_STATEMENTS block_statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:134:4: 
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
                    // 134:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:136:1: block_statements : ( STAR block_statements -> ^( STAR block_statements ) | REPEATER block_statements -> ^( REPEATER block_statements ) | node_chain block block_statements -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) ) | -> EPSILON );
    public final QueryLanguageParser.block_statements_return block_statements() throws RecognitionException {
        QueryLanguageParser.block_statements_return retval = new QueryLanguageParser.block_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR127=null;
        Token REPEATER129=null;
        QueryLanguageParser.block_statements_return block_statements128 =null;

        QueryLanguageParser.block_statements_return block_statements130 =null;

        QueryLanguageParser.node_chain_return node_chain131 =null;

        QueryLanguageParser.block_return block132 =null;

        QueryLanguageParser.block_statements_return block_statements133 =null;


        Object STAR127_tree=null;
        Object REPEATER129_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_REPEATER=new RewriteRuleTokenStream(adaptor,"token REPEATER");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_block_statements=new RewriteRuleSubtreeStream(adaptor,"rule block_statements");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:137:2: ( STAR block_statements -> ^( STAR block_statements ) | REPEATER block_statements -> ^( REPEATER block_statements ) | node_chain block block_statements -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) ) | -> EPSILON )
            int alt18=4;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt18=1;
                }
                break;
            case REPEATER:
                {
                alt18=2;
                }
                break;
            case ID:
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case LT:
                {
                alt18=3;
                }
                break;
            case RIGHT_BRACKET:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:137:4: STAR block_statements
                    {
                    STAR127=(Token)match(input,STAR,FOLLOW_STAR_in_block_statements1434);  
                    stream_STAR.add(STAR127);


                    pushFollow(FOLLOW_block_statements_in_block_statements1436);
                    block_statements128=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements128.getTree());

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
                    // 137:29: -> ^( STAR block_statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:137:32: ^( STAR block_statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:138:4: REPEATER block_statements
                    {
                    REPEATER129=(Token)match(input,REPEATER,FOLLOW_REPEATER_in_block_statements1452);  
                    stream_REPEATER.add(REPEATER129);


                    pushFollow(FOLLOW_block_statements_in_block_statements1454);
                    block_statements130=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements130.getTree());

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
                    // 138:32: -> ^( REPEATER block_statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:138:35: ^( REPEATER block_statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:139:4: node_chain block block_statements
                    {
                    pushFollow(FOLLOW_node_chain_in_block_statements1469);
                    node_chain131=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain131.getTree());

                    pushFollow(FOLLOW_block_in_block_statements1471);
                    block132=block();

                    state._fsp--;

                    stream_block.add(block132.getTree());

                    pushFollow(FOLLOW_block_statements_in_block_statements1473);
                    block_statements133=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements133.getTree());

                    // AST REWRITE
                    // elements: block, node_chain, block_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:38: -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:139:41: ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NESTED, "NESTED")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:139:50: ^( node_chain )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_node_chain.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:139:70: ^( BLOCK_STATEMENTS block_statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:140:4: 
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
                    // 140:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:143:1: print_stmt : ( PRINT variable_stmt SEMICOLON -> variable_stmt | -> EPSILON );
    public final QueryLanguageParser.print_stmt_return print_stmt() throws RecognitionException {
        QueryLanguageParser.print_stmt_return retval = new QueryLanguageParser.print_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT134=null;
        Token SEMICOLON136=null;
        QueryLanguageParser.variable_stmt_return variable_stmt135 =null;


        Object PRINT134_tree=null;
        Object SEMICOLON136_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_variable_stmt=new RewriteRuleSubtreeStream(adaptor,"rule variable_stmt");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:144:2: ( PRINT variable_stmt SEMICOLON -> variable_stmt | -> EPSILON )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==PRINT) ) {
                alt19=1;
            }
            else if ( (LA19_0==EOF||LA19_0==FOREACH||(LA19_0 >= ID && LA19_0 <= IF)||LA19_0==INTEGER||LA19_0==LEFT_BRACKET||LA19_0==LEFT_SQ_BRACKET||LA19_0==LT||(LA19_0 >= RESERVED_TYPES && LA19_0 <= RIGHT_BRACKET)||LA19_0==SELECT||LA19_0==SET||LA19_0==STRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:144:4: PRINT variable_stmt SEMICOLON
                    {
                    PRINT134=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stmt1509);  
                    stream_PRINT.add(PRINT134);


                    pushFollow(FOLLOW_variable_stmt_in_print_stmt1511);
                    variable_stmt135=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt135.getTree());

                    SEMICOLON136=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print_stmt1513);  
                    stream_SEMICOLON.add(SEMICOLON136);


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
                    // 144:34: -> variable_stmt
                    {
                        adaptor.addChild(root_0, stream_variable_stmt.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:145:4: 
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
                    // 145:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:148:1: stat_statements : ( LEFT_BRACKET statements RIGHT_BRACKET -> statements | -> EPSILON );
    public final QueryLanguageParser.stat_statements_return stat_statements() throws RecognitionException {
        QueryLanguageParser.stat_statements_return retval = new QueryLanguageParser.stat_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET137=null;
        Token RIGHT_BRACKET139=null;
        QueryLanguageParser.statements_return statements138 =null;


        Object LEFT_BRACKET137_tree=null;
        Object RIGHT_BRACKET139_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:149:2: ( LEFT_BRACKET statements RIGHT_BRACKET -> statements | -> EPSILON )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LEFT_BRACKET) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==ID) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==RIGHT_BRACKET) ) {
                        alt20=2;
                    }
                    else if ( (LA20_3==COLON||LA20_3==COMPOUND_ADD||LA20_3==EQUALS||LA20_3==FILTER||LA20_3==INCREMENT||LA20_3==PERIOD) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA20_1==FOREACH||LA20_1==IF||LA20_1==INTEGER||LA20_1==LEFT_BRACKET||LA20_1==LEFT_SQ_BRACKET||LA20_1==LT||(LA20_1 >= RESERVED_TYPES && LA20_1 <= RIGHT_BRACKET)||LA20_1==SELECT||LA20_1==SET||LA20_1==STRING) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA20_0==EOF||LA20_0==FOREACH||(LA20_0 >= ID && LA20_0 <= IF)||LA20_0==INTEGER||LA20_0==LEFT_SQ_BRACKET||LA20_0==LT||LA20_0==PRINT||(LA20_0 >= RESERVED_TYPES && LA20_0 <= RIGHT_BRACKET)||LA20_0==SELECT||LA20_0==SET||LA20_0==STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:149:4: LEFT_BRACKET statements RIGHT_BRACKET
                    {
                    LEFT_BRACKET137=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_stat_statements1535);  
                    stream_LEFT_BRACKET.add(LEFT_BRACKET137);


                    pushFollow(FOLLOW_statements_in_stat_statements1537);
                    statements138=statements();

                    state._fsp--;

                    stream_statements.add(statements138.getTree());

                    RIGHT_BRACKET139=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_stat_statements1539);  
                    stream_RIGHT_BRACKET.add(RIGHT_BRACKET139);


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
                    // 149:42: -> statements
                    {
                        adaptor.addChild(root_0, stream_statements.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:150:4: 
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
                    // 150:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:153:1: statements : ( variable_assn statements -> ^( STATEMENT variable_assn statements ) | if_statement statements -> ^( STATEMENT if_statement statements ) | query statements -> ^( QUERY query ) statements | SET variable_assn WHERE boolean_exp SEMICOLON -> ^( SET_TABLE variable_assn boolean_exp ) | -> EPSILON );
    public final QueryLanguageParser.statements_return statements() throws RecognitionException {
        QueryLanguageParser.statements_return retval = new QueryLanguageParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SET146=null;
        Token WHERE148=null;
        Token SEMICOLON150=null;
        QueryLanguageParser.variable_assn_return variable_assn140 =null;

        QueryLanguageParser.statements_return statements141 =null;

        QueryLanguageParser.if_statement_return if_statement142 =null;

        QueryLanguageParser.statements_return statements143 =null;

        QueryLanguageParser.query_return query144 =null;

        QueryLanguageParser.statements_return statements145 =null;

        QueryLanguageParser.variable_assn_return variable_assn147 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp149 =null;


        Object SET146_tree=null;
        Object WHERE148_tree=null;
        Object SEMICOLON150_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_variable_assn=new RewriteRuleSubtreeStream(adaptor,"rule variable_assn");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        RewriteRuleSubtreeStream stream_if_statement=new RewriteRuleSubtreeStream(adaptor,"rule if_statement");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:154:2: ( variable_assn statements -> ^( STATEMENT variable_assn statements ) | if_statement statements -> ^( STATEMENT if_statement statements ) | query statements -> ^( QUERY query ) statements | SET variable_assn WHERE boolean_exp SEMICOLON -> ^( SET_TABLE variable_assn boolean_exp ) | -> EPSILON )
            int alt21=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case COLON:
                    {
                    int LA21_7 = input.LA(3);

                    if ( (LA21_7==ATTRIBUTES||LA21_7==COLON||LA21_7==COMPOUND_ADD||LA21_7==EQUALS||LA21_7==INCREMENT||LA21_7==PERIOD) ) {
                        alt21=1;
                    }
                    else if ( (LA21_7==FOREACH||LA21_7==ID||LA21_7==SELECT) ) {
                        alt21=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                case COMPOUND_ADD:
                case EQUALS:
                case INCREMENT:
                case PERIOD:
                    {
                    alt21=1;
                    }
                    break;
                case FILTER:
                    {
                    alt21=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }

                }
                break;
            case INTEGER:
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
            case LT:
            case RESERVED_TYPES:
            case STRING:
                {
                alt21=1;
                }
                break;
            case IF:
                {
                alt21=2;
                }
                break;
            case FOREACH:
            case SELECT:
                {
                alt21=3;
                }
                break;
            case SET:
                {
                alt21=4;
                }
                break;
            case RIGHT_BRACKET:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:154:4: variable_assn statements
                    {
                    pushFollow(FOLLOW_variable_assn_in_statements1562);
                    variable_assn140=variable_assn();

                    state._fsp--;

                    stream_variable_assn.add(variable_assn140.getTree());

                    pushFollow(FOLLOW_statements_in_statements1564);
                    statements141=statements();

                    state._fsp--;

                    stream_statements.add(statements141.getTree());

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
                    // 154:29: -> ^( STATEMENT variable_assn statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:154:32: ^( STATEMENT variable_assn statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:155:4: if_statement statements
                    {
                    pushFollow(FOLLOW_if_statement_in_statements1579);
                    if_statement142=if_statement();

                    state._fsp--;

                    stream_if_statement.add(if_statement142.getTree());

                    pushFollow(FOLLOW_statements_in_statements1581);
                    statements143=statements();

                    state._fsp--;

                    stream_statements.add(statements143.getTree());

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
                    // 155:29: -> ^( STATEMENT if_statement statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:155:32: ^( STATEMENT if_statement statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:156:4: query statements
                    {
                    pushFollow(FOLLOW_query_in_statements1597);
                    query144=query();

                    state._fsp--;

                    stream_query.add(query144.getTree());

                    pushFollow(FOLLOW_statements_in_statements1599);
                    statements145=statements();

                    state._fsp--;

                    stream_statements.add(statements145.getTree());

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
                    // 156:22: -> ^( QUERY query ) statements
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:156:25: ^( QUERY query )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:157:4: SET variable_assn WHERE boolean_exp SEMICOLON
                    {
                    SET146=(Token)match(input,SET,FOLLOW_SET_in_statements1615);  
                    stream_SET.add(SET146);


                    pushFollow(FOLLOW_variable_assn_in_statements1617);
                    variable_assn147=variable_assn();

                    state._fsp--;

                    stream_variable_assn.add(variable_assn147.getTree());

                    WHERE148=(Token)match(input,WHERE,FOLLOW_WHERE_in_statements1619);  
                    stream_WHERE.add(WHERE148);


                    pushFollow(FOLLOW_boolean_exp_in_statements1621);
                    boolean_exp149=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp149.getTree());

                    SEMICOLON150=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1623);  
                    stream_SEMICOLON.add(SEMICOLON150);


                    // AST REWRITE
                    // elements: boolean_exp, variable_assn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:50: -> ^( SET_TABLE variable_assn boolean_exp )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:157:53: ^( SET_TABLE variable_assn boolean_exp )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:158:4: 
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
                    // 158:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:161:1: variable_stmt : ( variable binary_op -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) ) | MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAX variable variable ) );
    public final QueryLanguageParser.variable_stmt_return variable_stmt() throws RecognitionException {
        QueryLanguageParser.variable_stmt_return retval = new QueryLanguageParser.variable_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MAX153=null;
        Token LEFT_PAREN154=null;
        Token COMMA156=null;
        Token RIGHT_PAREN158=null;
        QueryLanguageParser.variable_return variable151 =null;

        QueryLanguageParser.binary_op_return binary_op152 =null;

        QueryLanguageParser.variable_return variable155 =null;

        QueryLanguageParser.variable_return variable157 =null;


        Object MAX153_tree=null;
        Object LEFT_PAREN154_tree=null;
        Object COMMA156_tree=null;
        Object RIGHT_PAREN158_tree=null;
        RewriteRuleTokenStream stream_MAX=new RewriteRuleTokenStream(adaptor,"token MAX");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_binary_op=new RewriteRuleSubtreeStream(adaptor,"rule binary_op");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:2: ( variable binary_op -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) ) | MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAX variable variable ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||LA22_0==INTEGER||LA22_0==LEFT_BRACKET||LA22_0==LEFT_SQ_BRACKET||LA22_0==LT||LA22_0==RESERVED_TYPES||LA22_0==STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==MAX) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:4: variable binary_op
                    {
                    pushFollow(FOLLOW_variable_in_variable_stmt1652);
                    variable151=variable();

                    state._fsp--;

                    stream_variable.add(variable151.getTree());

                    pushFollow(FOLLOW_binary_op_in_variable_stmt1654);
                    binary_op152=binary_op();

                    state._fsp--;

                    stream_binary_op.add(binary_op152.getTree());

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
                    // 162:25: -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:28: ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_STMT, "VAR_STMT")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:39: ^( VAR variable )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_2);

                        adaptor.addChild(root_2, stream_variable.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:55: ^( BIN_OP binary_op )
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
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:163:4: MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN
                    {
                    MAX153=(Token)match(input,MAX,FOLLOW_MAX_in_variable_stmt1680);  
                    stream_MAX.add(MAX153);


                    LEFT_PAREN154=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_variable_stmt1682);  
                    stream_LEFT_PAREN.add(LEFT_PAREN154);


                    pushFollow(FOLLOW_variable_in_variable_stmt1684);
                    variable155=variable();

                    state._fsp--;

                    stream_variable.add(variable155.getTree());

                    COMMA156=(Token)match(input,COMMA,FOLLOW_COMMA_in_variable_stmt1686);  
                    stream_COMMA.add(COMMA156);


                    pushFollow(FOLLOW_variable_in_variable_stmt1688);
                    variable157=variable();

                    state._fsp--;

                    stream_variable.add(variable157.getTree());

                    RIGHT_PAREN158=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_variable_stmt1690);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN158);


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
                    // 163:55: -> ^( MAX variable variable )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:163:58: ^( MAX variable variable )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:165:1: variable_assn : variable variable_assn_right -> ^( VAR variable ) variable_assn_right ;
    public final QueryLanguageParser.variable_assn_return variable_assn() throws RecognitionException {
        QueryLanguageParser.variable_assn_return retval = new QueryLanguageParser.variable_assn_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable159 =null;

        QueryLanguageParser.variable_assn_right_return variable_assn_right160 =null;


        RewriteRuleSubtreeStream stream_variable_assn_right=new RewriteRuleSubtreeStream(adaptor,"rule variable_assn_right");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:166:2: ( variable variable_assn_right -> ^( VAR variable ) variable_assn_right )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:166:4: variable variable_assn_right
            {
            pushFollow(FOLLOW_variable_in_variable_assn1710);
            variable159=variable();

            state._fsp--;

            stream_variable.add(variable159.getTree());

            pushFollow(FOLLOW_variable_assn_right_in_variable_assn1712);
            variable_assn_right160=variable_assn_right();

            state._fsp--;

            stream_variable_assn_right.add(variable_assn_right160.getTree());

            // AST REWRITE
            // elements: variable, variable_assn_right
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 166:33: -> ^( VAR variable ) variable_assn_right
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:166:36: ^( VAR variable )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:168:1: variable_assn_right : ( EQUALS variable_stmt SEMICOLON -> ^( VAR_ASSIGN variable_stmt ) | COMPOUND_ADD variable_stmt SEMICOLON -> ^( COMP_ADD variable_stmt ) | INCREMENT SEMICOLON -> INCR );
    public final QueryLanguageParser.variable_assn_right_return variable_assn_right() throws RecognitionException {
        QueryLanguageParser.variable_assn_right_return retval = new QueryLanguageParser.variable_assn_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS161=null;
        Token SEMICOLON163=null;
        Token COMPOUND_ADD164=null;
        Token SEMICOLON166=null;
        Token INCREMENT167=null;
        Token SEMICOLON168=null;
        QueryLanguageParser.variable_stmt_return variable_stmt162 =null;

        QueryLanguageParser.variable_stmt_return variable_stmt165 =null;


        Object EQUALS161_tree=null;
        Object SEMICOLON163_tree=null;
        Object COMPOUND_ADD164_tree=null;
        Object SEMICOLON166_tree=null;
        Object INCREMENT167_tree=null;
        Object SEMICOLON168_tree=null;
        RewriteRuleTokenStream stream_INCREMENT=new RewriteRuleTokenStream(adaptor,"token INCREMENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_COMPOUND_ADD=new RewriteRuleTokenStream(adaptor,"token COMPOUND_ADD");
        RewriteRuleSubtreeStream stream_variable_stmt=new RewriteRuleSubtreeStream(adaptor,"rule variable_stmt");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:169:2: ( EQUALS variable_stmt SEMICOLON -> ^( VAR_ASSIGN variable_stmt ) | COMPOUND_ADD variable_stmt SEMICOLON -> ^( COMP_ADD variable_stmt ) | INCREMENT SEMICOLON -> INCR )
            int alt23=3;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt23=1;
                }
                break;
            case COMPOUND_ADD:
                {
                alt23=2;
                }
                break;
            case INCREMENT:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:169:4: EQUALS variable_stmt SEMICOLON
                    {
                    EQUALS161=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_variable_assn_right1732);  
                    stream_EQUALS.add(EQUALS161);


                    pushFollow(FOLLOW_variable_stmt_in_variable_assn_right1734);
                    variable_stmt162=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt162.getTree());

                    SEMICOLON163=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right1736);  
                    stream_SEMICOLON.add(SEMICOLON163);


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
                    // 169:36: -> ^( VAR_ASSIGN variable_stmt )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:169:39: ^( VAR_ASSIGN variable_stmt )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:170:4: COMPOUND_ADD variable_stmt SEMICOLON
                    {
                    COMPOUND_ADD164=(Token)match(input,COMPOUND_ADD,FOLLOW_COMPOUND_ADD_in_variable_assn_right1750);  
                    stream_COMPOUND_ADD.add(COMPOUND_ADD164);


                    pushFollow(FOLLOW_variable_stmt_in_variable_assn_right1752);
                    variable_stmt165=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt165.getTree());

                    SEMICOLON166=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right1754);  
                    stream_SEMICOLON.add(SEMICOLON166);


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
                    // 170:41: -> ^( COMP_ADD variable_stmt )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:170:44: ^( COMP_ADD variable_stmt )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:171:4: INCREMENT SEMICOLON
                    {
                    INCREMENT167=(Token)match(input,INCREMENT,FOLLOW_INCREMENT_in_variable_assn_right1767);  
                    stream_INCREMENT.add(INCREMENT167);


                    SEMICOLON168=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right1769);  
                    stream_SEMICOLON.add(SEMICOLON168);


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
                    // 171:26: -> INCR
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:173:1: if_statement : IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) ) ;
    public final QueryLanguageParser.if_statement_return if_statement() throws RecognitionException {
        QueryLanguageParser.if_statement_return retval = new QueryLanguageParser.if_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF169=null;
        Token LEFT_PAREN170=null;
        Token RIGHT_PAREN172=null;
        Token LEFT_BRACKET173=null;
        Token RIGHT_BRACKET175=null;
        QueryLanguageParser.boolean_exp_return boolean_exp171 =null;

        QueryLanguageParser.statements_return statements174 =null;


        Object IF169_tree=null;
        Object LEFT_PAREN170_tree=null;
        Object RIGHT_PAREN172_tree=null;
        Object LEFT_BRACKET173_tree=null;
        Object RIGHT_BRACKET175_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:174:2: ( IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:174:4: IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET
            {
            IF169=(Token)match(input,IF,FOLLOW_IF_in_if_statement1785);  
            stream_IF.add(IF169);


            LEFT_PAREN170=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_if_statement1787);  
            stream_LEFT_PAREN.add(LEFT_PAREN170);


            pushFollow(FOLLOW_boolean_exp_in_if_statement1789);
            boolean_exp171=boolean_exp();

            state._fsp--;

            stream_boolean_exp.add(boolean_exp171.getTree());

            RIGHT_PAREN172=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_if_statement1791);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN172);


            LEFT_BRACKET173=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_if_statement1793);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET173);


            pushFollow(FOLLOW_statements_in_if_statement1795);
            statements174=statements();

            state._fsp--;

            stream_statements.add(statements174.getTree());

            RIGHT_BRACKET175=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_if_statement1797);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET175);


            // AST REWRITE
            // elements: statements, boolean_exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 174:80: -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:174:83: ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF_STATEMENT, "IF_STATEMENT")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:174:98: ^( BOOL_EXP boolean_exp )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                , root_2);

                adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:174:122: ^( STATEMENTS statements )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:177:1: boolean_stmt : variable boolean_right -> ^( VAR variable ) boolean_right ;
    public final QueryLanguageParser.boolean_stmt_return boolean_stmt() throws RecognitionException {
        QueryLanguageParser.boolean_stmt_return retval = new QueryLanguageParser.boolean_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable176 =null;

        QueryLanguageParser.boolean_right_return boolean_right177 =null;


        RewriteRuleSubtreeStream stream_boolean_right=new RewriteRuleSubtreeStream(adaptor,"rule boolean_right");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:178:2: ( variable boolean_right -> ^( VAR variable ) boolean_right )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:178:4: variable boolean_right
            {
            pushFollow(FOLLOW_variable_in_boolean_stmt1826);
            variable176=variable();

            state._fsp--;

            stream_variable.add(variable176.getTree());

            pushFollow(FOLLOW_boolean_right_in_boolean_stmt1828);
            boolean_right177=boolean_right();

            state._fsp--;

            stream_boolean_right.add(boolean_right177.getTree());

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
            // 178:27: -> ^( VAR variable ) boolean_right
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:178:30: ^( VAR variable )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:181:1: boolean_right : ( boolean_op variable -> ^( boolean_op variable ) | -> EPSILON );
    public final QueryLanguageParser.boolean_right_return boolean_right() throws RecognitionException {
        QueryLanguageParser.boolean_right_return retval = new QueryLanguageParser.boolean_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.boolean_op_return boolean_op178 =null;

        QueryLanguageParser.variable_return variable179 =null;


        RewriteRuleSubtreeStream stream_boolean_op=new RewriteRuleSubtreeStream(adaptor,"rule boolean_op");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:182:2: ( boolean_op variable -> ^( boolean_op variable ) | -> EPSILON )
            int alt24=2;
            switch ( input.LA(1) ) {
            case GT:
            case GTE:
            case LOGIC_EQUALS:
            case LTE:
            case NOT_EQUAL:
                {
                alt24=1;
                }
                break;
            case LT:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==NODE_TYPE) ) {
                    alt24=2;
                }
                else if ( (LA24_2==ID||LA24_2==INTEGER||LA24_2==LEFT_BRACKET||LA24_2==LEFT_SQ_BRACKET||LA24_2==LT||LA24_2==RESERVED_TYPES||LA24_2==STRING) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;

                }
                }
                break;
            case EOF:
            case AND:
            case FOREACH:
            case ID:
            case IF:
            case INTEGER:
            case LEFT_BRACKET:
            case LEFT_SQ_BRACKET:
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
                alt24=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:182:4: boolean_op variable
                    {
                    pushFollow(FOLLOW_boolean_op_in_boolean_right1849);
                    boolean_op178=boolean_op();

                    state._fsp--;

                    stream_boolean_op.add(boolean_op178.getTree());

                    pushFollow(FOLLOW_variable_in_boolean_right1851);
                    variable179=variable();

                    state._fsp--;

                    stream_variable.add(variable179.getTree());

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
                    // 182:24: -> ^( boolean_op variable )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:182:27: ^( boolean_op variable )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:183:4: 
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
                    // 183:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:186:1: boolean_exp : ( boolean_stmt boolean_exp_cont -> boolean_stmt ^( BOOL_EXP boolean_exp_cont ) | NOT boolean_exp -> ^( NOT ^( BOOL_EXP boolean_exp ) ) );
    public final QueryLanguageParser.boolean_exp_return boolean_exp() throws RecognitionException {
        QueryLanguageParser.boolean_exp_return retval = new QueryLanguageParser.boolean_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT182=null;
        QueryLanguageParser.boolean_stmt_return boolean_stmt180 =null;

        QueryLanguageParser.boolean_exp_cont_return boolean_exp_cont181 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp183 =null;


        Object NOT182_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_boolean_stmt=new RewriteRuleSubtreeStream(adaptor,"rule boolean_stmt");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_boolean_exp_cont=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp_cont");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:2: ( boolean_stmt boolean_exp_cont -> boolean_stmt ^( BOOL_EXP boolean_exp_cont ) | NOT boolean_exp -> ^( NOT ^( BOOL_EXP boolean_exp ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID||LA25_0==INTEGER||LA25_0==LEFT_BRACKET||LA25_0==LEFT_SQ_BRACKET||LA25_0==LT||LA25_0==RESERVED_TYPES||LA25_0==STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==NOT) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:4: boolean_stmt boolean_exp_cont
                    {
                    pushFollow(FOLLOW_boolean_stmt_in_boolean_exp1878);
                    boolean_stmt180=boolean_stmt();

                    state._fsp--;

                    stream_boolean_stmt.add(boolean_stmt180.getTree());

                    pushFollow(FOLLOW_boolean_exp_cont_in_boolean_exp1880);
                    boolean_exp_cont181=boolean_exp_cont();

                    state._fsp--;

                    stream_boolean_exp_cont.add(boolean_exp_cont181.getTree());

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
                    // 187:34: -> boolean_stmt ^( BOOL_EXP boolean_exp_cont )
                    {
                        adaptor.addChild(root_0, stream_boolean_stmt.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:50: ^( BOOL_EXP boolean_exp_cont )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:188:4: NOT boolean_exp
                    {
                    NOT182=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_exp1895);  
                    stream_NOT.add(NOT182);


                    pushFollow(FOLLOW_boolean_exp_in_boolean_exp1897);
                    boolean_exp183=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp183.getTree());

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
                    // 188:22: -> ^( NOT ^( BOOL_EXP boolean_exp ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:188:25: ^( NOT ^( BOOL_EXP boolean_exp ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_NOT.nextNode()
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:188:31: ^( BOOL_EXP boolean_exp )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:191:1: boolean_exp_cont : ( logical_op boolean_exp -> logical_op ^( BOOL_EXP boolean_exp ) | -> EPSILON );
    public final QueryLanguageParser.boolean_exp_cont_return boolean_exp_cont() throws RecognitionException {
        QueryLanguageParser.boolean_exp_cont_return retval = new QueryLanguageParser.boolean_exp_cont_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.logical_op_return logical_op184 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp185 =null;


        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_logical_op=new RewriteRuleSubtreeStream(adaptor,"rule logical_op");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:192:2: ( logical_op boolean_exp -> logical_op ^( BOOL_EXP boolean_exp ) | -> EPSILON )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==AND||LA26_0==OR) ) {
                alt26=1;
            }
            else if ( (LA26_0==EOF||LA26_0==FOREACH||(LA26_0 >= ID && LA26_0 <= IF)||LA26_0==INTEGER||LA26_0==LEFT_BRACKET||LA26_0==LEFT_SQ_BRACKET||LA26_0==LT||LA26_0==PRINT||(LA26_0 >= RESERVED_TYPES && LA26_0 <= RIGHT_PAREN)||LA26_0==SELECT||(LA26_0 >= SEMICOLON && LA26_0 <= SET)||LA26_0==STRING) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:192:4: logical_op boolean_exp
                    {
                    pushFollow(FOLLOW_logical_op_in_boolean_exp_cont1922);
                    logical_op184=logical_op();

                    state._fsp--;

                    stream_logical_op.add(logical_op184.getTree());

                    pushFollow(FOLLOW_boolean_exp_in_boolean_exp_cont1924);
                    boolean_exp185=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp185.getTree());

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
                    // 192:28: -> logical_op ^( BOOL_EXP boolean_exp )
                    {
                        adaptor.addChild(root_0, stream_logical_op.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:192:42: ^( BOOL_EXP boolean_exp )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:193:4: 
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
                    // 193:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:196:1: binary_op : ( PLUS variable -> PLUS ^( VAR variable ) | MINUS variable -> MINUS ^( VAR variable ) | DIVIDE variable -> DIVIDE ^( VAR variable ) | -> EPSILON );
    public final QueryLanguageParser.binary_op_return binary_op() throws RecognitionException {
        QueryLanguageParser.binary_op_return retval = new QueryLanguageParser.binary_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS186=null;
        Token MINUS188=null;
        Token DIVIDE190=null;
        QueryLanguageParser.variable_return variable187 =null;

        QueryLanguageParser.variable_return variable189 =null;

        QueryLanguageParser.variable_return variable191 =null;


        Object PLUS186_tree=null;
        Object MINUS188_tree=null;
        Object DIVIDE190_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:197:2: ( PLUS variable -> PLUS ^( VAR variable ) | MINUS variable -> MINUS ^( VAR variable ) | DIVIDE variable -> DIVIDE ^( VAR variable ) | -> EPSILON )
            int alt27=4;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt27=1;
                }
                break;
            case MINUS:
                {
                alt27=2;
                }
                break;
            case DIVIDE:
                {
                alt27=3;
                }
                break;
            case SEMICOLON:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:197:4: PLUS variable
                    {
                    PLUS186=(Token)match(input,PLUS,FOLLOW_PLUS_in_binary_op1953);  
                    stream_PLUS.add(PLUS186);


                    pushFollow(FOLLOW_variable_in_binary_op1955);
                    variable187=variable();

                    state._fsp--;

                    stream_variable.add(variable187.getTree());

                    // AST REWRITE
                    // elements: variable, PLUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:20: -> PLUS ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_PLUS.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:197:28: ^( VAR variable )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:198:4: MINUS variable
                    {
                    MINUS188=(Token)match(input,MINUS,FOLLOW_MINUS_in_binary_op1972);  
                    stream_MINUS.add(MINUS188);


                    pushFollow(FOLLOW_variable_in_binary_op1974);
                    variable189=variable();

                    state._fsp--;

                    stream_variable.add(variable189.getTree());

                    // AST REWRITE
                    // elements: variable, MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:21: -> MINUS ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_MINUS.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:198:30: ^( VAR variable )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:199:4: DIVIDE variable
                    {
                    DIVIDE190=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_binary_op1991);  
                    stream_DIVIDE.add(DIVIDE190);


                    pushFollow(FOLLOW_variable_in_binary_op1993);
                    variable191=variable();

                    state._fsp--;

                    stream_variable.add(variable191.getTree());

                    // AST REWRITE
                    // elements: DIVIDE, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:22: -> DIVIDE ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_DIVIDE.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:199:32: ^( VAR variable )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:200:4: 
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
                    // 200:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:202:1: boolean_op : ( GT -> GT | GTE -> GTE | LT -> LT | LTE -> LTE | NOT_EQUAL -> NOT_EQUAL | LOGIC_EQUALS -> LOGIC_EQUALS );
    public final QueryLanguageParser.boolean_op_return boolean_op() throws RecognitionException {
        QueryLanguageParser.boolean_op_return retval = new QueryLanguageParser.boolean_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GT192=null;
        Token GTE193=null;
        Token LT194=null;
        Token LTE195=null;
        Token NOT_EQUAL196=null;
        Token LOGIC_EQUALS197=null;

        Object GT192_tree=null;
        Object GTE193_tree=null;
        Object LT194_tree=null;
        Object LTE195_tree=null;
        Object NOT_EQUAL196_tree=null;
        Object LOGIC_EQUALS197_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_LOGIC_EQUALS=new RewriteRuleTokenStream(adaptor,"token LOGIC_EQUALS");
        RewriteRuleTokenStream stream_NOT_EQUAL=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL");
        RewriteRuleTokenStream stream_LTE=new RewriteRuleTokenStream(adaptor,"token LTE");
        RewriteRuleTokenStream stream_GTE=new RewriteRuleTokenStream(adaptor,"token GTE");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:203:2: ( GT -> GT | GTE -> GTE | LT -> LT | LTE -> LTE | NOT_EQUAL -> NOT_EQUAL | LOGIC_EQUALS -> LOGIC_EQUALS )
            int alt28=6;
            switch ( input.LA(1) ) {
            case GT:
                {
                alt28=1;
                }
                break;
            case GTE:
                {
                alt28=2;
                }
                break;
            case LT:
                {
                alt28=3;
                }
                break;
            case LTE:
                {
                alt28=4;
                }
                break;
            case NOT_EQUAL:
                {
                alt28=5;
                }
                break;
            case LOGIC_EQUALS:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:203:4: GT
                    {
                    GT192=(Token)match(input,GT,FOLLOW_GT_in_boolean_op2022);  
                    stream_GT.add(GT192);


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
                    // 203:8: -> GT
                    {
                        adaptor.addChild(root_0, 
                        stream_GT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:204:4: GTE
                    {
                    GTE193=(Token)match(input,GTE,FOLLOW_GTE_in_boolean_op2032);  
                    stream_GTE.add(GTE193);


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
                    // 204:9: -> GTE
                    {
                        adaptor.addChild(root_0, 
                        stream_GTE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:205:4: LT
                    {
                    LT194=(Token)match(input,LT,FOLLOW_LT_in_boolean_op2042);  
                    stream_LT.add(LT194);


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
                    // 205:8: -> LT
                    {
                        adaptor.addChild(root_0, 
                        stream_LT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:206:4: LTE
                    {
                    LTE195=(Token)match(input,LTE,FOLLOW_LTE_in_boolean_op2052);  
                    stream_LTE.add(LTE195);


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
                    // 206:9: -> LTE
                    {
                        adaptor.addChild(root_0, 
                        stream_LTE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:207:4: NOT_EQUAL
                    {
                    NOT_EQUAL196=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolean_op2062);  
                    stream_NOT_EQUAL.add(NOT_EQUAL196);


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
                    // 207:14: -> NOT_EQUAL
                    {
                        adaptor.addChild(root_0, 
                        stream_NOT_EQUAL.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:208:4: LOGIC_EQUALS
                    {
                    LOGIC_EQUALS197=(Token)match(input,LOGIC_EQUALS,FOLLOW_LOGIC_EQUALS_in_boolean_op2071);  
                    stream_LOGIC_EQUALS.add(LOGIC_EQUALS197);


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
                    // 208:17: -> LOGIC_EQUALS
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:210:1: logical_op : ( AND -> AND | OR -> OR );
    public final QueryLanguageParser.logical_op_return logical_op() throws RecognitionException {
        QueryLanguageParser.logical_op_return retval = new QueryLanguageParser.logical_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND198=null;
        Token OR199=null;

        Object AND198_tree=null;
        Object OR199_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:211:2: ( AND -> AND | OR -> OR )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==AND) ) {
                alt29=1;
            }
            else if ( (LA29_0==OR) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:211:4: AND
                    {
                    AND198=(Token)match(input,AND,FOLLOW_AND_in_logical_op2085);  
                    stream_AND.add(AND198);


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
                    // 211:9: -> AND
                    {
                        adaptor.addChild(root_0, 
                        stream_AND.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:212:4: OR
                    {
                    OR199=(Token)match(input,OR,FOLLOW_OR_in_logical_op2095);  
                    stream_OR.add(OR199);


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
                    // 212:8: -> OR
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


 

    public static final BitSet FOLLOW_queries_in_startrule269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_queries287 = new BitSet(new long[]{0x0000000208000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_query_in_queries289 = new BitSet(new long[]{0x0000000208000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_query_name_in_query300 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_foreach_query_in_query302 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_print_stmt_in_query304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_select_query_in_query337 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_print_stmt_in_query339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query370 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_query372 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_FILTER_in_query374 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_query376 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_print_stmt_in_query378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_query_name420 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_query_name422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_in_foreach_query444 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_foreach_query446 = new BitSet(new long[]{0x0000940200000000L});
    public static final BitSet FOLLOW_node_chain_in_foreach_query448 = new BitSet(new long[]{0x0000001200000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_foreach_query450 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_in_clause_in_foreach_query453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_foreach_query455 = new BitSet(new long[]{0x0000040000000000L,0x0000000005000000L});
    public static final BitSet FOLLOW_with_clause_in_foreach_query457 = new BitSet(new long[]{0x0000040000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_foreach_where_in_foreach_query459 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_stat_statements_in_foreach_query461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_foreach_where502 = new BitSet(new long[]{0x0100948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_boolean_exp_in_foreach_where504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_query530 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_select_query532 = new BitSet(new long[]{0x0000940200000000L});
    public static final BitSet FOLLOW_node_chain_in_select_query534 = new BitSet(new long[]{0x0000041200000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_select_query536 = new BitSet(new long[]{0x0000001200000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_select_query538 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_in_clause_in_select_query541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_select_query543 = new BitSet(new long[]{0x0000000000000000L,0x0000000005000000L});
    public static final BitSet FOLLOW_with_clause_in_select_query545 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_select_where_in_select_query547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_select_where588 = new BitSet(new long[]{0x0100948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_boolean_exp_in_select_where590 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_stat_statements_in_select_where592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_in_clause627 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_in_clause629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_with_clause651 = new BitSet(new long[]{0x0000948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_in_with_clause653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AS_in_with_clause655 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_with_clause657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain692 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain694 = new BitSet(new long[]{0x0000940200000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain719 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_node_chain721 = new BitSet(new long[]{0x1000000000002100L});
    public static final BitSet FOLLOW_attr_in_node_chain723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_node_chain775 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain777 = new BitSet(new long[]{0x0000940200000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_node_chain815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain847 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_keywords_in_node_chain849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_node_chain872 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain874 = new BitSet(new long[]{0x0000940200000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_node_chain899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_node922 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NODE_TYPE_in_node924 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_GT_in_node926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQ_BRACKET_in_node936 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_node938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RIGHT_SQ_BRACKET_in_node940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_ast_child958 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_ast_child960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_ast_child962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords976 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CONTAINS_in_keywords978 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords980 = new BitSet(new long[]{0x0800940200000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords998 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IS_in_keywords1000 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1002 = new BitSet(new long[]{0x0800940200000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1021 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_HAS_in_keywords1023 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1025 = new BitSet(new long[]{0x0800940200000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_keyword_nodes1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_keyword_nodes1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_op_in_keyword_nodes1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_keyword_nodes1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_attr1105 = new BitSet(new long[]{0x1000000000002100L});
    public static final BitSet FOLLOW_attr_in_attr1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1126 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CONTAINS_in_attr1128 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1130 = new BitSet(new long[]{0x0800940200000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1148 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IS_in_attr1150 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1152 = new BitSet(new long[]{0x0800940200000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1171 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_HAS_in_attr1173 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1175 = new BitSet(new long[]{0x0800940200000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTES_in_attr1193 = new BitSet(new long[]{0x1000000000002100L});
    public static final BitSet FOLLOW_attr_in_attr1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1248 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_property1250 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CONTAINS_in_property1252 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1254 = new BitSet(new long[]{0x0800940200000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_property1256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable1285 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_variable1287 = new BitSet(new long[]{0x1000000000002100L});
    public static final BitSet FOLLOW_attr_in_variable1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_chain_in_variable1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_variable1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_variable1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESERVED_TYPES_in_variable1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_block1405 = new BitSet(new long[]{0x0000940200000000L,0x0000000000004028L});
    public static final BitSet FOLLOW_block_statements_in_block1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_block1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_block_statements1434 = new BitSet(new long[]{0x0000940200000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATER_in_block_statements1452 = new BitSet(new long[]{0x0000940200000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_chain_in_block_statements1469 = new BitSet(new long[]{0x0000940200000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_block_in_block_statements1471 = new BitSet(new long[]{0x0000940200000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt1509 = new BitSet(new long[]{0x0002948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_stmt_in_print_stmt1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_print_stmt1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_stat_statements1535 = new BitSet(new long[]{0x0000948608000000L,0x0000000000020930L});
    public static final BitSet FOLLOW_statements_in_stat_statements1537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_stat_statements1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_assn_in_statements1562 = new BitSet(new long[]{0x0000948608000000L,0x0000000000020910L});
    public static final BitSet FOLLOW_statements_in_statements1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statements1579 = new BitSet(new long[]{0x0000948608000000L,0x0000000000020910L});
    public static final BitSet FOLLOW_statements_in_statements1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_statements1597 = new BitSet(new long[]{0x0000948608000000L,0x0000000000020910L});
    public static final BitSet FOLLOW_statements_in_statements1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_statements1615 = new BitSet(new long[]{0x0000948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_assn_in_statements1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_WHERE_in_statements1619 = new BitSet(new long[]{0x0100948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_boolean_exp_in_statements1621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_statements1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_stmt1652 = new BitSet(new long[]{0x2004000000040000L});
    public static final BitSet FOLLOW_binary_op_in_variable_stmt1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_variable_stmt1680 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_variable_stmt1682 = new BitSet(new long[]{0x0000948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_in_variable_stmt1684 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_variable_stmt1686 = new BitSet(new long[]{0x0000948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_in_variable_stmt1688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_variable_stmt1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_assn1710 = new BitSet(new long[]{0x0000004000208000L});
    public static final BitSet FOLLOW_variable_assn_right_in_variable_assn1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_variable_assn_right1732 = new BitSet(new long[]{0x0002948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_stmt_in_variable_assn_right1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPOUND_ADD_in_variable_assn_right1750 = new BitSet(new long[]{0x0002948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_stmt_in_variable_assn_right1752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCREMENT_in_variable_assn_right1767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1785 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_if_statement1787 = new BitSet(new long[]{0x0100948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_boolean_exp_in_if_statement1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_if_statement1791 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_if_statement1793 = new BitSet(new long[]{0x0000948608000000L,0x0000000000020930L});
    public static final BitSet FOLLOW_statements_in_if_statement1795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_if_statement1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_boolean_stmt1826 = new BitSet(new long[]{0x0201A00060000000L});
    public static final BitSet FOLLOW_boolean_right_in_boolean_stmt1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_op_in_boolean_right1849 = new BitSet(new long[]{0x0000948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_in_boolean_right1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_stmt_in_boolean_exp1878 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_boolean_exp_cont_in_boolean_exp1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_boolean_exp1895 = new BitSet(new long[]{0x0100948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_boolean_exp_in_boolean_exp1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_op_in_boolean_exp_cont1922 = new BitSet(new long[]{0x0100948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_boolean_exp_in_boolean_exp_cont1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_binary_op1953 = new BitSet(new long[]{0x0000948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_in_binary_op1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_binary_op1972 = new BitSet(new long[]{0x0000948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_in_binary_op1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_binary_op1991 = new BitSet(new long[]{0x0000948200000000L,0x0000000000020010L});
    public static final BitSet FOLLOW_variable_in_binary_op1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_boolean_op2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_boolean_op2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_boolean_op2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_boolean_op2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolean_op2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGIC_EQUALS_in_boolean_op2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_logical_op2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_op2095 = new BitSet(new long[]{0x0000000000000002L});

}