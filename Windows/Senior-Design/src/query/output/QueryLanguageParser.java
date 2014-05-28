// $ANTLR 3.4 C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g 2014-05-18 09:56:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryLanguageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AS", "AST_CHILD", "ATTRIBUTE", "ATTRIBUTES", "BIN_OP", "BLOCK_STATEMENTS", "BOOL_EXP", "CHAIN_ID", "COLON", "COMMA", "COMPOUND_ADD", "COMP_ADD", "CONTAINS", "DEPTH", "DIVIDE", "DQOUTE", "EPSILON", "EQUALS", "ESC_SEQ", "EXPONENT", "FILTER", "FILTER_QUERY", "FLOAT", "FOREACH", "FOR_QUERY", "FUNCTION", "GT", "GTE", "HAS", "HEX_DIGIT", "ID", "IF", "IF_STATEMENT", "IN", "INCR", "INCREMENT", "INTEGER", "IN_CLAUSE", "IS", "ISNODETYPE", "ISPARENT", "LEFT_BRACKET", "LEFT_PAREN", "LEFT_SQ_BRACKET", "LOGIC_EQUALS", "LOGIC_OP", "LT", "LTE", "MAX", "MIN", "MINUS", "NESTED", "NODE", "NODE_CHAIN", "NODE_CHAIN_OP", "NODE_NAME", "NODE_TYPE", "NOT", "NOT_EQUAL", "OCTAL_ESC", "OR", "PERIOD", "PLUS", "PRINT", "PROPERTY", "QUERIES", "QUERY", "QUERY_NAME", "REPEATER", "RESERVED_TYPES", "RIGHT_BRACKET", "RIGHT_PAREN", "RIGHT_SQ_BRACKET", "SELECT", "SELECT_QUERY", "SEMICOLON", "SET", "SET_TABLE", "SPACE", "STAR", "STATEMENT", "STATEMENTS", "STRING", "TABLE", "UNICODE_ESC", "VAR", "VAR_ASSIGN", "VAR_NAME", "VAR_STMT", "WHERE", "WHERE_BLOCK", "WITH", "WITH_CLAUSE"
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:49:1: queries : ( blockquery )* ;
    public final QueryLanguageParser.queries_return queries() throws RecognitionException {
        QueryLanguageParser.queries_return retval = new QueryLanguageParser.queries_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.blockquery_return blockquery2 =null;



        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:49:9: ( ( blockquery )* )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:49:11: ( blockquery )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:49:11: ( blockquery )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==EPSILON||LA1_0==FOREACH||LA1_0==ID||LA1_0==LEFT_BRACKET||LA1_0==SELECT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:49:11: blockquery
            	    {
            	    pushFollow(FOLLOW_blockquery_in_queries301);
            	    blockquery2=blockquery();

            	    state._fsp--;

            	    adaptor.addChild(root_0, blockquery2.getTree());

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


    public static class blockquery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockquery"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:1: blockquery : stat_statements query stat_statements -> ^( STATEMENTS stat_statements ) query ^( STATEMENTS stat_statements ) ;
    public final QueryLanguageParser.blockquery_return blockquery() throws RecognitionException {
        QueryLanguageParser.blockquery_return retval = new QueryLanguageParser.blockquery_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.stat_statements_return stat_statements3 =null;

        QueryLanguageParser.query_return query4 =null;

        QueryLanguageParser.stat_statements_return stat_statements5 =null;


        RewriteRuleSubtreeStream stream_stat_statements=new RewriteRuleSubtreeStream(adaptor,"rule stat_statements");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:12: ( stat_statements query stat_statements -> ^( STATEMENTS stat_statements ) query ^( STATEMENTS stat_statements ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:14: stat_statements query stat_statements
            {
            pushFollow(FOLLOW_stat_statements_in_blockquery313);
            stat_statements3=stat_statements();

            state._fsp--;

            stream_stat_statements.add(stat_statements3.getTree());

            pushFollow(FOLLOW_query_in_blockquery315);
            query4=query();

            state._fsp--;

            stream_query.add(query4.getTree());

            pushFollow(FOLLOW_stat_statements_in_blockquery317);
            stat_statements5=stat_statements();

            state._fsp--;

            stream_stat_statements.add(stat_statements5.getTree());

            // AST REWRITE
            // elements: stat_statements, query, stat_statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:52: -> ^( STATEMENTS stat_statements ) query ^( STATEMENTS stat_statements )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:55: ^( STATEMENTS stat_statements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                adaptor.addChild(root_1, stream_stat_statements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_query.nextTree());

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:53:91: ^( STATEMENTS stat_statements )
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
    // $ANTLR end "blockquery"


    public static class query_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:1: query : ( query_name foreach_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) ) | query_name select_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) ) | query_name ID FILTER ID print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) ) | EPSILON );
    public final QueryLanguageParser.query_return query() throws RecognitionException {
        QueryLanguageParser.query_return retval = new QueryLanguageParser.query_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID13=null;
        Token FILTER14=null;
        Token ID15=null;
        Token EPSILON17=null;
        QueryLanguageParser.query_name_return query_name6 =null;

        QueryLanguageParser.foreach_query_return foreach_query7 =null;

        QueryLanguageParser.print_stmt_return print_stmt8 =null;

        QueryLanguageParser.query_name_return query_name9 =null;

        QueryLanguageParser.select_query_return select_query10 =null;

        QueryLanguageParser.print_stmt_return print_stmt11 =null;

        QueryLanguageParser.query_name_return query_name12 =null;

        QueryLanguageParser.print_stmt_return print_stmt16 =null;


        Object ID13_tree=null;
        Object FILTER14_tree=null;
        Object ID15_tree=null;
        Object EPSILON17_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_FILTER=new RewriteRuleTokenStream(adaptor,"token FILTER");
        RewriteRuleSubtreeStream stream_select_query=new RewriteRuleSubtreeStream(adaptor,"rule select_query");
        RewriteRuleSubtreeStream stream_print_stmt=new RewriteRuleSubtreeStream(adaptor,"rule print_stmt");
        RewriteRuleSubtreeStream stream_foreach_query=new RewriteRuleSubtreeStream(adaptor,"rule foreach_query");
        RewriteRuleSubtreeStream stream_query_name=new RewriteRuleSubtreeStream(adaptor,"rule query_name");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:7: ( query_name foreach_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) ) | query_name select_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) ) | query_name ID FILTER ID print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) ) | EPSILON )
            int alt2=4;
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
                            new NoViableAltException("", 2, 5, input);

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
            case EPSILON:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:9: query_name foreach_query print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query353);
                    query_name6=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name6.getTree());

                    pushFollow(FOLLOW_foreach_query_in_query355);
                    foreach_query7=foreach_query();

                    state._fsp--;

                    stream_foreach_query.add(foreach_query7.getTree());

                    pushFollow(FOLLOW_print_stmt_in_query357);
                    print_stmt8=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt8.getTree());

                    // AST REWRITE
                    // elements: foreach_query, query_name, print_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 56:45: -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:48: ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:56: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:81: ^( FOR_QUERY foreach_query )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_QUERY, "FOR_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, stream_foreach_query.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:108: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:56:116: ( print_stmt )?
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:57:4: query_name select_query print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query388);
                    query_name9=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name9.getTree());

                    pushFollow(FOLLOW_select_query_in_query390);
                    select_query10=select_query();

                    state._fsp--;

                    stream_select_query.add(select_query10.getTree());

                    pushFollow(FOLLOW_print_stmt_in_query392);
                    print_stmt11=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt11.getTree());

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
                    // 57:39: -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:57:42: ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:57:50: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:57:75: ^( SELECT_QUERY select_query )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SELECT_QUERY, "SELECT_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, stream_select_query.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:57:104: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:57:112: ( print_stmt )?
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:58:4: query_name ID FILTER ID print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query423);
                    query_name12=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name12.getTree());

                    ID13=(Token)match(input,ID,FOLLOW_ID_in_query425);  
                    stream_ID.add(ID13);


                    FILTER14=(Token)match(input,FILTER,FOLLOW_FILTER_in_query427);  
                    stream_FILTER.add(FILTER14);


                    ID15=(Token)match(input,ID,FOLLOW_ID_in_query429);  
                    stream_ID.add(ID15);


                    pushFollow(FOLLOW_print_stmt_in_query431);
                    print_stmt16=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt16.getTree());

                    // AST REWRITE
                    // elements: print_stmt, query_name, ID, FILTER, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 58:39: -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:58:42: ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:58:50: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:58:75: ^( FILTER_QUERY ID FILTER ID )
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

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:58:104: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:58:112: ( print_stmt )?
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
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:59:10: EPSILON
                    {
                    root_0 = (Object)adaptor.nil();


                    EPSILON17=(Token)match(input,EPSILON,FOLLOW_EPSILON_in_query472); 
                    EPSILON17_tree = 
                    (Object)adaptor.create(EPSILON17)
                    ;
                    adaptor.addChild(root_0, EPSILON17_tree);


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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:62:1: query_name : ( ID COLON -> ID | -> EPSILON );
    public final QueryLanguageParser.query_name_return query_name() throws RecognitionException {
        QueryLanguageParser.query_name_return retval = new QueryLanguageParser.query_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID18=null;
        Token COLON19=null;

        Object ID18_tree=null;
        Object COLON19_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:2: ( ID COLON -> ID | -> EPSILON )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:63:4: ID COLON
                    {
                    ID18=(Token)match(input,ID,FOLLOW_ID_in_query_name484);  
                    stream_ID.add(ID18);


                    COLON19=(Token)match(input,COLON,FOLLOW_COLON_in_query_name486);  
                    stream_COLON.add(COLON19);


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
                    // 63:13: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:64:4: 
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
                    // 64:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:67:1: foreach_query : FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements ) ;
    public final QueryLanguageParser.foreach_query_return foreach_query() throws RecognitionException {
        QueryLanguageParser.foreach_query_return retval = new QueryLanguageParser.foreach_query_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FOREACH20=null;
        Token LEFT_PAREN21=null;
        Token ID23=null;
        Token RIGHT_PAREN25=null;
        QueryLanguageParser.node_chain_return node_chain22 =null;

        QueryLanguageParser.in_clause_return in_clause24 =null;

        QueryLanguageParser.with_clause_return with_clause26 =null;

        QueryLanguageParser.foreach_where_return foreach_where27 =null;

        QueryLanguageParser.stat_statements_return stat_statements28 =null;


        Object FOREACH20_tree=null;
        Object LEFT_PAREN21_tree=null;
        Object ID23_tree=null;
        Object RIGHT_PAREN25_tree=null;
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:2: ( FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:4: FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements
            {
            FOREACH20=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_query508);  
            stream_FOREACH.add(FOREACH20);


            LEFT_PAREN21=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_foreach_query510);  
            stream_LEFT_PAREN.add(LEFT_PAREN21);


            pushFollow(FOLLOW_node_chain_in_foreach_query512);
            node_chain22=node_chain();

            state._fsp--;

            stream_node_chain.add(node_chain22.getTree());

            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:34: ( ID )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:34: ID
                    {
                    ID23=(Token)match(input,ID,FOLLOW_ID_in_foreach_query514);  
                    stream_ID.add(ID23);


                    }
                    break;

            }


            pushFollow(FOLLOW_in_clause_in_foreach_query517);
            in_clause24=in_clause();

            state._fsp--;

            stream_in_clause.add(in_clause24.getTree());

            RIGHT_PAREN25=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_foreach_query519);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN25);


            pushFollow(FOLLOW_with_clause_in_foreach_query521);
            with_clause26=with_clause();

            state._fsp--;

            stream_with_clause.add(with_clause26.getTree());

            pushFollow(FOLLOW_foreach_where_in_foreach_query523);
            foreach_where27=foreach_where();

            state._fsp--;

            stream_foreach_where.add(foreach_where27.getTree());

            pushFollow(FOLLOW_stat_statements_in_foreach_query525);
            stat_statements28=stat_statements();

            state._fsp--;

            stream_stat_statements.add(stat_statements28.getTree());

            // AST REWRITE
            // elements: stat_statements, with_clause, ID, node_chain, in_clause, foreach_where
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:102: -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:105: ^( NODE_CHAIN node_chain )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:130: ^( CHAIN_ID ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:141: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:146: ^( IN_CLAUSE in_clause )
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

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:68:195: ^( STATEMENTS stat_statements )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:70:1: foreach_where : ( WHERE boolean_exp -> ^( WHERE_BLOCK boolean_exp ) | -> WHERE_BLOCK );
    public final QueryLanguageParser.foreach_where_return foreach_where() throws RecognitionException {
        QueryLanguageParser.foreach_where_return retval = new QueryLanguageParser.foreach_where_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE29=null;
        QueryLanguageParser.boolean_exp_return boolean_exp30 =null;


        Object WHERE29_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:2: ( WHERE boolean_exp -> ^( WHERE_BLOCK boolean_exp ) | -> WHERE_BLOCK )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WHERE) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==DEPTH||LA5_0==EPSILON||LA5_0==FOREACH||(LA5_0 >= ID && LA5_0 <= IF)||LA5_0==INTEGER||LA5_0==LEFT_BRACKET||LA5_0==LEFT_SQ_BRACKET||LA5_0==LT||(LA5_0 >= MAX && LA5_0 <= MIN)||LA5_0==PRINT||(LA5_0 >= RESERVED_TYPES && LA5_0 <= RIGHT_BRACKET)||LA5_0==SELECT||LA5_0==SET||LA5_0==STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:4: WHERE boolean_exp
                    {
                    WHERE29=(Token)match(input,WHERE,FOLLOW_WHERE_in_foreach_where566);  
                    stream_WHERE.add(WHERE29);


                    pushFollow(FOLLOW_boolean_exp_in_foreach_where568);
                    boolean_exp30=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp30.getTree());

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
                    // 71:22: -> ^( WHERE_BLOCK boolean_exp )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:71:25: ^( WHERE_BLOCK boolean_exp )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:72:4: 
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
                    // 72:4: -> WHERE_BLOCK
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:75:1: select_query : SELECT LEFT_PAREN node_chain ( ID )? node_chain_op block in_clause RIGHT_PAREN with_clause select_where -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( NODE_CHAIN_OP node_chain_op ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where ;
    public final QueryLanguageParser.select_query_return select_query() throws RecognitionException {
        QueryLanguageParser.select_query_return retval = new QueryLanguageParser.select_query_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT31=null;
        Token LEFT_PAREN32=null;
        Token ID34=null;
        Token RIGHT_PAREN38=null;
        QueryLanguageParser.node_chain_return node_chain33 =null;

        QueryLanguageParser.node_chain_op_return node_chain_op35 =null;

        QueryLanguageParser.block_return block36 =null;

        QueryLanguageParser.in_clause_return in_clause37 =null;

        QueryLanguageParser.with_clause_return with_clause39 =null;

        QueryLanguageParser.select_where_return select_where40 =null;


        Object SELECT31_tree=null;
        Object LEFT_PAREN32_tree=null;
        Object ID34_tree=null;
        Object RIGHT_PAREN38_tree=null;
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:2: ( SELECT LEFT_PAREN node_chain ( ID )? node_chain_op block in_clause RIGHT_PAREN with_clause select_where -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( NODE_CHAIN_OP node_chain_op ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:4: SELECT LEFT_PAREN node_chain ( ID )? node_chain_op block in_clause RIGHT_PAREN with_clause select_where
            {
            SELECT31=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_query594);  
            stream_SELECT.add(SELECT31);


            LEFT_PAREN32=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_select_query596);  
            stream_LEFT_PAREN.add(LEFT_PAREN32);


            pushFollow(FOLLOW_node_chain_in_select_query598);
            node_chain33=node_chain();

            state._fsp--;

            stream_node_chain.add(node_chain33.getTree());

            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:33: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:33: ID
                    {
                    ID34=(Token)match(input,ID,FOLLOW_ID_in_select_query600);  
                    stream_ID.add(ID34);


                    }
                    break;

            }


            pushFollow(FOLLOW_node_chain_op_in_select_query603);
            node_chain_op35=node_chain_op();

            state._fsp--;

            stream_node_chain_op.add(node_chain_op35.getTree());

            pushFollow(FOLLOW_block_in_select_query605);
            block36=block();

            state._fsp--;

            stream_block.add(block36.getTree());

            pushFollow(FOLLOW_in_clause_in_select_query607);
            in_clause37=in_clause();

            state._fsp--;

            stream_in_clause.add(in_clause37.getTree());

            RIGHT_PAREN38=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_select_query609);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN38);


            pushFollow(FOLLOW_with_clause_in_select_query611);
            with_clause39=with_clause();

            state._fsp--;

            stream_with_clause.add(with_clause39.getTree());

            pushFollow(FOLLOW_select_where_in_select_query613);
            select_where40=select_where();

            state._fsp--;

            stream_select_where.add(select_where40.getTree());

            // AST REWRITE
            // elements: node_chain, block, select_where, ID, node_chain_op, with_clause, in_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:104: -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( NODE_CHAIN_OP node_chain_op ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:107: ^( NODE_CHAIN node_chain )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:132: ^( CHAIN_ID ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:143: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:148: ^( NODE_CHAIN_OP node_chain_op )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN_OP, "NODE_CHAIN_OP")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain_op.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:180: ^( IN_CLAUSE in_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IN_CLAUSE, "IN_CLAUSE")
                , root_1);

                adaptor.addChild(root_1, stream_in_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:76:203: ^( BLOCK_STATEMENTS block )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:78:1: select_where : ( WHERE boolean_exp stat_statements -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) ) | stat_statements -> ^( WHERE_BLOCK ^( STATEMENTS stat_statements ) ) );
    public final QueryLanguageParser.select_where_return select_where() throws RecognitionException {
        QueryLanguageParser.select_where_return retval = new QueryLanguageParser.select_where_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE41=null;
        QueryLanguageParser.boolean_exp_return boolean_exp42 =null;

        QueryLanguageParser.stat_statements_return stat_statements43 =null;

        QueryLanguageParser.stat_statements_return stat_statements44 =null;


        Object WHERE41_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_stat_statements=new RewriteRuleSubtreeStream(adaptor,"rule stat_statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:79:2: ( WHERE boolean_exp stat_statements -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) ) | stat_statements -> ^( WHERE_BLOCK ^( STATEMENTS stat_statements ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WHERE) ) {
                alt7=1;
            }
            else if ( (LA7_0==EOF||LA7_0==DEPTH||LA7_0==EPSILON||LA7_0==FOREACH||(LA7_0 >= ID && LA7_0 <= IF)||LA7_0==INTEGER||LA7_0==LEFT_BRACKET||LA7_0==LEFT_SQ_BRACKET||LA7_0==LT||(LA7_0 >= MAX && LA7_0 <= MIN)||LA7_0==PRINT||(LA7_0 >= RESERVED_TYPES && LA7_0 <= RIGHT_BRACKET)||LA7_0==SELECT||LA7_0==SET||LA7_0==STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:79:4: WHERE boolean_exp stat_statements
                    {
                    WHERE41=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_where661);  
                    stream_WHERE.add(WHERE41);


                    pushFollow(FOLLOW_boolean_exp_in_select_where663);
                    boolean_exp42=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp42.getTree());

                    pushFollow(FOLLOW_stat_statements_in_select_where665);
                    stat_statements43=stat_statements();

                    state._fsp--;

                    stream_stat_statements.add(stat_statements43.getTree());

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
                    // 79:38: -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:79:41: ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHERE_BLOCK, "WHERE_BLOCK")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:79:55: ^( BOOL_EXP boolean_exp )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_2);

                        adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:79:79: ^( STATEMENTS stat_statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:80:4: stat_statements
                    {
                    pushFollow(FOLLOW_stat_statements_in_select_where688);
                    stat_statements44=stat_statements();

                    state._fsp--;

                    stream_stat_statements.add(stat_statements44.getTree());

                    // AST REWRITE
                    // elements: stat_statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:20: -> ^( WHERE_BLOCK ^( STATEMENTS stat_statements ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:80:23: ^( WHERE_BLOCK ^( STATEMENTS stat_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHERE_BLOCK, "WHERE_BLOCK")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:80:37: ^( STATEMENTS stat_statements )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:82:1: in_clause : ( IN ID -> ID | -> EPSILON );
    public final QueryLanguageParser.in_clause_return in_clause() throws RecognitionException {
        QueryLanguageParser.in_clause_return retval = new QueryLanguageParser.in_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IN45=null;
        Token ID46=null;

        Object IN45_tree=null;
        Object ID46_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:83:2: ( IN ID -> ID | -> EPSILON )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:83:4: IN ID
                    {
                    IN45=(Token)match(input,IN,FOLLOW_IN_in_in_clause710);  
                    stream_IN.add(IN45);


                    ID46=(Token)match(input,ID,FOLLOW_ID_in_in_clause712);  
                    stream_ID.add(ID46);


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
                    // 83:10: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:84:4: 
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
                    // 84:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:86:1: with_clause : ( WITH variable AS ID -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) ) | -> WITH_CLAUSE );
    public final QueryLanguageParser.with_clause_return with_clause() throws RecognitionException {
        QueryLanguageParser.with_clause_return retval = new QueryLanguageParser.with_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WITH47=null;
        Token AS49=null;
        Token ID50=null;
        QueryLanguageParser.variable_return variable48 =null;


        Object WITH47_tree=null;
        Object AS49_tree=null;
        Object ID50_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:2: ( WITH variable AS ID -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) ) | -> WITH_CLAUSE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WITH) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||LA9_0==DEPTH||LA9_0==EPSILON||LA9_0==FOREACH||(LA9_0 >= ID && LA9_0 <= IF)||LA9_0==INTEGER||LA9_0==LEFT_BRACKET||LA9_0==LEFT_SQ_BRACKET||LA9_0==LT||(LA9_0 >= MAX && LA9_0 <= MIN)||LA9_0==PRINT||(LA9_0 >= RESERVED_TYPES && LA9_0 <= RIGHT_BRACKET)||LA9_0==SELECT||LA9_0==SET||LA9_0==STRING||LA9_0==WHERE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:4: WITH variable AS ID
                    {
                    WITH47=(Token)match(input,WITH,FOLLOW_WITH_in_with_clause734);  
                    stream_WITH.add(WITH47);


                    pushFollow(FOLLOW_variable_in_with_clause736);
                    variable48=variable();

                    state._fsp--;

                    stream_variable.add(variable48.getTree());

                    AS49=(Token)match(input,AS,FOLLOW_AS_in_with_clause738);  
                    stream_AS.add(AS49);


                    ID50=(Token)match(input,ID,FOLLOW_ID_in_with_clause740);  
                    stream_ID.add(ID50);


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
                    // 87:24: -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:27: ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WITH_CLAUSE, "WITH_CLAUSE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:41: ^( VAR variable )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_2);

                        adaptor.addChild(root_2, stream_variable.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:87:57: ^( CHAIN_ID ID )
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
                    // 88:4: -> WITH_CLAUSE
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:90:1: node_chain_op : ( STAR node_chain ( ID )? -> ^( STAR node_chain ^( CHAIN_ID ( ID )? ) ) | REPEATER node_chain ( ID )? -> ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) ) | -> EPSILON );
    public final QueryLanguageParser.node_chain_op_return node_chain_op() throws RecognitionException {
        QueryLanguageParser.node_chain_op_return retval = new QueryLanguageParser.node_chain_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR51=null;
        Token ID53=null;
        Token REPEATER54=null;
        Token ID56=null;
        QueryLanguageParser.node_chain_return node_chain52 =null;

        QueryLanguageParser.node_chain_return node_chain55 =null;


        Object STAR51_tree=null;
        Object ID53_tree=null;
        Object REPEATER54_tree=null;
        Object ID56_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_REPEATER=new RewriteRuleTokenStream(adaptor,"token REPEATER");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:2: ( STAR node_chain ( ID )? -> ^( STAR node_chain ^( CHAIN_ID ( ID )? ) ) | REPEATER node_chain ( ID )? -> ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) ) | -> EPSILON )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:4: STAR node_chain ( ID )?
                    {
                    STAR51=(Token)match(input,STAR,FOLLOW_STAR_in_node_chain_op775);  
                    stream_STAR.add(STAR51);


                    pushFollow(FOLLOW_node_chain_in_node_chain_op777);
                    node_chain52=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain52.getTree());

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:20: ( ID )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:20: ID
                            {
                            ID53=(Token)match(input,ID,FOLLOW_ID_in_node_chain_op779);  
                            stream_ID.add(ID53);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: STAR, node_chain, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:24: -> ^( STAR node_chain ^( CHAIN_ID ( ID )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:27: ^( STAR node_chain ^( CHAIN_ID ( ID )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:45: ^( CHAIN_ID ( ID )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:91:56: ( ID )?
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:4: REPEATER node_chain ( ID )?
                    {
                    REPEATER54=(Token)match(input,REPEATER,FOLLOW_REPEATER_in_node_chain_op800);  
                    stream_REPEATER.add(REPEATER54);


                    pushFollow(FOLLOW_node_chain_in_node_chain_op802);
                    node_chain55=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain55.getTree());

                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:24: ( ID )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:24: ID
                            {
                            ID56=(Token)match(input,ID,FOLLOW_ID_in_node_chain_op804);  
                            stream_ID.add(ID56);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: node_chain, REPEATER, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:28: -> ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:31: ^( REPEATER node_chain ^( CHAIN_ID ( ID )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_REPEATER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:53: ^( CHAIN_ID ( ID )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                        , root_2);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:92:64: ( ID )?
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:93:4: 
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
                    // 93:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:95:1: node_chain : ( node PERIOD node_chain -> ^( NODE node ) ^( NODE_CHAIN node_chain ) | node COLON attr -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) ) | node -> ^( NODE ^( NODE_NAME node ) ) | ast_child PERIOD node_chain -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) ) | ast_child -> ^( NODE ^( AST_CHILD ast_child ) ) | node keywords -> ^( NODE ^( NODE_NAME node ) keywords ) | ID PERIOD node_chain -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) ) | property -> ^( PROPERTY property ) );
    public final QueryLanguageParser.node_chain_return node_chain() throws RecognitionException {
        QueryLanguageParser.node_chain_return retval = new QueryLanguageParser.node_chain_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD58=null;
        Token COLON61=null;
        Token PERIOD65=null;
        Token ID70=null;
        Token PERIOD71=null;
        QueryLanguageParser.node_return node57 =null;

        QueryLanguageParser.node_chain_return node_chain59 =null;

        QueryLanguageParser.node_return node60 =null;

        QueryLanguageParser.attr_return attr62 =null;

        QueryLanguageParser.node_return node63 =null;

        QueryLanguageParser.ast_child_return ast_child64 =null;

        QueryLanguageParser.node_chain_return node_chain66 =null;

        QueryLanguageParser.ast_child_return ast_child67 =null;

        QueryLanguageParser.node_return node68 =null;

        QueryLanguageParser.keywords_return keywords69 =null;

        QueryLanguageParser.node_chain_return node_chain72 =null;

        QueryLanguageParser.property_return property73 =null;


        Object PERIOD58_tree=null;
        Object COLON61_tree=null;
        Object PERIOD65_tree=null;
        Object ID70_tree=null;
        Object PERIOD71_tree=null;
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
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:96:2: ( node PERIOD node_chain -> ^( NODE node ) ^( NODE_CHAIN node_chain ) | node COLON attr -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) ) | node -> ^( NODE ^( NODE_NAME node ) ) | ast_child PERIOD node_chain -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) ) | ast_child -> ^( NODE ^( AST_CHILD ast_child ) ) | node keywords -> ^( NODE ^( NODE_NAME node ) keywords ) | ID PERIOD node_chain -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) ) | property -> ^( PROPERTY property ) )
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

                            if ( (LA13_14==CONTAINS||LA13_14==HAS||(LA13_14 >= IS && LA13_14 <= ISPARENT)) ) {
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
                        case EPSILON:
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

                            if ( (LA13_14==CONTAINS||LA13_14==HAS||(LA13_14 >= IS && LA13_14 <= ISPARENT)) ) {
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
                        case EPSILON:
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
                        else if ( (LA13_12==EOF||(LA13_12 >= AND && LA13_12 <= AS)||(LA13_12 >= COMMA && LA13_12 <= COMPOUND_ADD)||(LA13_12 >= DEPTH && LA13_12 <= DIVIDE)||(LA13_12 >= EPSILON && LA13_12 <= EQUALS)||LA13_12==FOREACH||(LA13_12 >= GT && LA13_12 <= GTE)||(LA13_12 >= ID && LA13_12 <= IF)||LA13_12==IN||(LA13_12 >= INCREMENT && LA13_12 <= INTEGER)||LA13_12==LEFT_BRACKET||(LA13_12 >= LEFT_SQ_BRACKET && LA13_12 <= LOGIC_EQUALS)||(LA13_12 >= LT && LA13_12 <= MINUS)||LA13_12==NOT_EQUAL||LA13_12==OR||(LA13_12 >= PLUS && LA13_12 <= PRINT)||(LA13_12 >= REPEATER && LA13_12 <= RIGHT_PAREN)||LA13_12==SELECT||(LA13_12 >= SEMICOLON && LA13_12 <= SET)||LA13_12==STAR||LA13_12==STRING) ) {
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

                    if ( (LA13_8==CONTAINS||(LA13_8 >= ISNODETYPE && LA13_8 <= ISPARENT)) ) {
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
                else if ( (LA13_4==EOF||(LA13_4 >= AND && LA13_4 <= AS)||(LA13_4 >= COMMA && LA13_4 <= COMPOUND_ADD)||(LA13_4 >= DEPTH && LA13_4 <= DIVIDE)||(LA13_4 >= EPSILON && LA13_4 <= EQUALS)||LA13_4==FOREACH||(LA13_4 >= GT && LA13_4 <= GTE)||(LA13_4 >= ID && LA13_4 <= IF)||LA13_4==IN||(LA13_4 >= INCREMENT && LA13_4 <= INTEGER)||LA13_4==LEFT_BRACKET||(LA13_4 >= LEFT_SQ_BRACKET && LA13_4 <= LOGIC_EQUALS)||(LA13_4 >= LT && LA13_4 <= MINUS)||LA13_4==NOT_EQUAL||LA13_4==OR||(LA13_4 >= PLUS && LA13_4 <= PRINT)||(LA13_4 >= REPEATER && LA13_4 <= RIGHT_PAREN)||LA13_4==SELECT||(LA13_4 >= SEMICOLON && LA13_4 <= SET)||LA13_4==STAR||LA13_4==STRING) ) {
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:96:4: node PERIOD node_chain
                    {
                    pushFollow(FOLLOW_node_in_node_chain838);
                    node57=node();

                    state._fsp--;

                    stream_node.add(node57.getTree());

                    PERIOD58=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain840);  
                    stream_PERIOD.add(PERIOD58);


                    pushFollow(FOLLOW_node_chain_in_node_chain842);
                    node_chain59=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain59.getTree());

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
                    // 96:31: -> ^( NODE node ) ^( NODE_CHAIN node_chain )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:96:34: ^( NODE node )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        adaptor.addChild(root_1, stream_node.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:96:47: ^( NODE_CHAIN node_chain )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:97:4: node COLON attr
                    {
                    pushFollow(FOLLOW_node_in_node_chain865);
                    node60=node();

                    state._fsp--;

                    stream_node.add(node60.getTree());

                    COLON61=(Token)match(input,COLON,FOLLOW_COLON_in_node_chain867);  
                    stream_COLON.add(COLON61);


                    pushFollow(FOLLOW_attr_in_node_chain869);
                    attr62=attr();

                    state._fsp--;

                    stream_attr.add(attr62.getTree());

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
                    // 97:24: -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:97:27: ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:97:34: ^( NODE_NAME node )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_node.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:97:52: ^( ATTRIBUTE attr )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:98:4: node
                    {
                    pushFollow(FOLLOW_node_in_node_chain896);
                    node63=node();

                    state._fsp--;

                    stream_node.add(node63.getTree());

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
                    // 98:15: -> ^( NODE ^( NODE_NAME node ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:98:18: ^( NODE ^( NODE_NAME node ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:98:25: ^( NODE_NAME node )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:99:6: ast_child PERIOD node_chain
                    {
                    pushFollow(FOLLOW_ast_child_in_node_chain921);
                    ast_child64=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child64.getTree());

                    PERIOD65=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain923);  
                    stream_PERIOD.add(PERIOD65);


                    pushFollow(FOLLOW_node_chain_in_node_chain925);
                    node_chain66=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain66.getTree());

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
                    // 99:45: -> ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:99:48: ^( NODE ^( AST_CHILD ast_child ) ^( NODE_CHAIN node_chain ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:99:55: ^( AST_CHILD ast_child )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AST_CHILD, "AST_CHILD")
                        , root_2);

                        adaptor.addChild(root_2, stream_ast_child.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:99:78: ^( NODE_CHAIN node_chain )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:100:6: ast_child
                    {
                    pushFollow(FOLLOW_ast_child_in_node_chain961);
                    ast_child67=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child67.getTree());

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
                    // 100:31: -> ^( NODE ^( AST_CHILD ast_child ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:100:34: ^( NODE ^( AST_CHILD ast_child ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:100:41: ^( AST_CHILD ast_child )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:101:4: node keywords
                    {
                    pushFollow(FOLLOW_node_in_node_chain993);
                    node68=node();

                    state._fsp--;

                    stream_node.add(node68.getTree());

                    pushFollow(FOLLOW_keywords_in_node_chain995);
                    keywords69=keywords();

                    state._fsp--;

                    stream_keywords.add(keywords69.getTree());

                    // AST REWRITE
                    // elements: node, keywords
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:22: -> ^( NODE ^( NODE_NAME node ) keywords )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:101:25: ^( NODE ^( NODE_NAME node ) keywords )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:101:32: ^( NODE_NAME node )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:102:4: ID PERIOD node_chain
                    {
                    ID70=(Token)match(input,ID,FOLLOW_ID_in_node_chain1018);  
                    stream_ID.add(ID70);


                    PERIOD71=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain1020);  
                    stream_PERIOD.add(PERIOD71);


                    pushFollow(FOLLOW_node_chain_in_node_chain1022);
                    node_chain72=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain72.getTree());

                    // AST REWRITE
                    // elements: ID, node_chain
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:29: -> ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:102:32: ^( VAR_NAME ID ^( NODE_CHAIN node_chain ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:102:46: ^( NODE_CHAIN node_chain )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:103:4: property
                    {
                    pushFollow(FOLLOW_property_in_node_chain1045);
                    property73=property();

                    state._fsp--;

                    stream_property.add(property73.getTree());

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
                    // 103:17: -> ^( PROPERTY property )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:103:20: ^( PROPERTY property )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:105:1: node : ( LT NODE_TYPE GT -> NODE_TYPE | LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^( TABLE ID ) );
    public final QueryLanguageParser.node_return node() throws RecognitionException {
        QueryLanguageParser.node_return retval = new QueryLanguageParser.node_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT74=null;
        Token NODE_TYPE75=null;
        Token GT76=null;
        Token LEFT_SQ_BRACKET77=null;
        Token ID78=null;
        Token RIGHT_SQ_BRACKET79=null;

        Object LT74_tree=null;
        Object NODE_TYPE75_tree=null;
        Object GT76_tree=null;
        Object LEFT_SQ_BRACKET77_tree=null;
        Object ID78_tree=null;
        Object RIGHT_SQ_BRACKET79_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NODE_TYPE=new RewriteRuleTokenStream(adaptor,"token NODE_TYPE");
        RewriteRuleTokenStream stream_RIGHT_SQ_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQ_BRACKET");
        RewriteRuleTokenStream stream_LEFT_SQ_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_SQ_BRACKET");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:106:2: ( LT NODE_TYPE GT -> NODE_TYPE | LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^( TABLE ID ) )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:106:4: LT NODE_TYPE GT
                    {
                    LT74=(Token)match(input,LT,FOLLOW_LT_in_node1068);  
                    stream_LT.add(LT74);


                    NODE_TYPE75=(Token)match(input,NODE_TYPE,FOLLOW_NODE_TYPE_in_node1070);  
                    stream_NODE_TYPE.add(NODE_TYPE75);


                    GT76=(Token)match(input,GT,FOLLOW_GT_in_node1072);  
                    stream_GT.add(GT76);


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
                    // 106:20: -> NODE_TYPE
                    {
                        adaptor.addChild(root_0, 
                        stream_NODE_TYPE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:107:4: LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET
                    {
                    LEFT_SQ_BRACKET77=(Token)match(input,LEFT_SQ_BRACKET,FOLLOW_LEFT_SQ_BRACKET_in_node1082);  
                    stream_LEFT_SQ_BRACKET.add(LEFT_SQ_BRACKET77);


                    ID78=(Token)match(input,ID,FOLLOW_ID_in_node1084);  
                    stream_ID.add(ID78);


                    RIGHT_SQ_BRACKET79=(Token)match(input,RIGHT_SQ_BRACKET,FOLLOW_RIGHT_SQ_BRACKET_in_node1086);  
                    stream_RIGHT_SQ_BRACKET.add(RIGHT_SQ_BRACKET79);


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
                    // 107:40: -> ^( TABLE ID )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:107:43: ^( TABLE ID )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:109:1: ast_child : LEFT_BRACKET ID RIGHT_BRACKET -> ID ;
    public final QueryLanguageParser.ast_child_return ast_child() throws RecognitionException {
        QueryLanguageParser.ast_child_return retval = new QueryLanguageParser.ast_child_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET80=null;
        Token ID81=null;
        Token RIGHT_BRACKET82=null;

        Object LEFT_BRACKET80_tree=null;
        Object ID81_tree=null;
        Object RIGHT_BRACKET82_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:110:2: ( LEFT_BRACKET ID RIGHT_BRACKET -> ID )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:110:4: LEFT_BRACKET ID RIGHT_BRACKET
            {
            LEFT_BRACKET80=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_ast_child1104);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET80);


            ID81=(Token)match(input,ID,FOLLOW_ID_in_ast_child1106);  
            stream_ID.add(ID81);


            RIGHT_BRACKET82=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_ast_child1108);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET82);


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
            // 110:34: -> ID
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:112:1: keywords : ( PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISPARENT keyword_nodes ) | PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISNODETYPE keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) );
    public final QueryLanguageParser.keywords_return keywords() throws RecognitionException {
        QueryLanguageParser.keywords_return retval = new QueryLanguageParser.keywords_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD83=null;
        Token CONTAINS84=null;
        Token LEFT_PAREN85=null;
        Token RIGHT_PAREN87=null;
        Token PERIOD88=null;
        Token ISPARENT89=null;
        Token LEFT_PAREN90=null;
        Token RIGHT_PAREN92=null;
        Token PERIOD93=null;
        Token ISNODETYPE94=null;
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
        QueryLanguageParser.keyword_nodes_return keyword_nodes86 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes91 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes96 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes101 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes106 =null;


        Object PERIOD83_tree=null;
        Object CONTAINS84_tree=null;
        Object LEFT_PAREN85_tree=null;
        Object RIGHT_PAREN87_tree=null;
        Object PERIOD88_tree=null;
        Object ISPARENT89_tree=null;
        Object LEFT_PAREN90_tree=null;
        Object RIGHT_PAREN92_tree=null;
        Object PERIOD93_tree=null;
        Object ISNODETYPE94_tree=null;
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
        RewriteRuleTokenStream stream_ISPARENT=new RewriteRuleTokenStream(adaptor,"token ISPARENT");
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ISNODETYPE=new RewriteRuleTokenStream(adaptor,"token ISNODETYPE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:2: ( PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISPARENT keyword_nodes ) | PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISNODETYPE keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) )
            int alt15=5;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==PERIOD) ) {
                switch ( input.LA(2) ) {
                case CONTAINS:
                    {
                    alt15=1;
                    }
                    break;
                case ISPARENT:
                    {
                    alt15=2;
                    }
                    break;
                case ISNODETYPE:
                    {
                    alt15=3;
                    }
                    break;
                case IS:
                    {
                    alt15=4;
                    }
                    break;
                case HAS:
                    {
                    alt15=5;
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:113:4: PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD83=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1122);  
                    stream_PERIOD.add(PERIOD83);


                    CONTAINS84=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_keywords1124);  
                    stream_CONTAINS.add(CONTAINS84);


                    LEFT_PAREN85=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1126);  
                    stream_LEFT_PAREN.add(LEFT_PAREN85);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1128);
                    keyword_nodes86=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes86.getTree());

                    RIGHT_PAREN87=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1130);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN87);


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
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:114:4: PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD88=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1144);  
                    stream_PERIOD.add(PERIOD88);


                    ISPARENT89=(Token)match(input,ISPARENT,FOLLOW_ISPARENT_in_keywords1146);  
                    stream_ISPARENT.add(ISPARENT89);


                    LEFT_PAREN90=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1148);  
                    stream_LEFT_PAREN.add(LEFT_PAREN90);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1150);
                    keyword_nodes91=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes91.getTree());

                    RIGHT_PAREN92=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1152);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN92);


                    // AST REWRITE
                    // elements: keyword_nodes, ISPARENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:57: -> ^( ISPARENT keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:114:60: ^( ISPARENT keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISPARENT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:115:4: PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD93=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1165);  
                    stream_PERIOD.add(PERIOD93);


                    ISNODETYPE94=(Token)match(input,ISNODETYPE,FOLLOW_ISNODETYPE_in_keywords1167);  
                    stream_ISNODETYPE.add(ISNODETYPE94);


                    LEFT_PAREN95=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1169);  
                    stream_LEFT_PAREN.add(LEFT_PAREN95);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1171);
                    keyword_nodes96=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes96.getTree());

                    RIGHT_PAREN97=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1173);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN97);


                    // AST REWRITE
                    // elements: ISNODETYPE, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:59: -> ^( ISNODETYPE keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:115:62: ^( ISNODETYPE keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISNODETYPE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:116:4: PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD98=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1186);  
                    stream_PERIOD.add(PERIOD98);


                    IS99=(Token)match(input,IS,FOLLOW_IS_in_keywords1188);  
                    stream_IS.add(IS99);


                    LEFT_PAREN100=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1190);  
                    stream_LEFT_PAREN.add(LEFT_PAREN100);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1192);
                    keyword_nodes101=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes101.getTree());

                    RIGHT_PAREN102=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1194);  
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
                    // 116:53: -> ^( IS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:116:56: ^( IS keyword_nodes )
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
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:117:4: PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD103=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords1209);  
                    stream_PERIOD.add(PERIOD103);


                    HAS104=(Token)match(input,HAS,FOLLOW_HAS_in_keywords1211);  
                    stream_HAS.add(HAS104);


                    LEFT_PAREN105=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords1213);  
                    stream_LEFT_PAREN.add(LEFT_PAREN105);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords1215);
                    keyword_nodes106=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes106.getTree());

                    RIGHT_PAREN107=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords1217);  
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
                    // 117:53: -> ^( HAS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:117:56: ^( HAS keyword_nodes )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:119:1: keyword_nodes : ( node -> ^( NODE_NAME node ) | ID -> ^( VAR_NAME ID ) | logical_op -> ^( LOGIC_OP logical_op ) | ast_child -> ^( AST_CHILD ast_child ) );
    public final QueryLanguageParser.keyword_nodes_return keyword_nodes() throws RecognitionException {
        QueryLanguageParser.keyword_nodes_return retval = new QueryLanguageParser.keyword_nodes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID109=null;
        QueryLanguageParser.node_return node108 =null;

        QueryLanguageParser.logical_op_return logical_op110 =null;

        QueryLanguageParser.ast_child_return ast_child111 =null;


        Object ID109_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_ast_child=new RewriteRuleSubtreeStream(adaptor,"rule ast_child");
        RewriteRuleSubtreeStream stream_node=new RewriteRuleSubtreeStream(adaptor,"rule node");
        RewriteRuleSubtreeStream stream_logical_op=new RewriteRuleSubtreeStream(adaptor,"rule logical_op");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:2: ( node -> ^( NODE_NAME node ) | ID -> ^( VAR_NAME ID ) | logical_op -> ^( LOGIC_OP logical_op ) | ast_child -> ^( AST_CHILD ast_child ) )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:4: node
                    {
                    pushFollow(FOLLOW_node_in_keyword_nodes1236);
                    node108=node();

                    state._fsp--;

                    stream_node.add(node108.getTree());

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
                    // 120:9: -> ^( NODE_NAME node )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:120:12: ^( NODE_NAME node )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:121:4: ID
                    {
                    ID109=(Token)match(input,ID,FOLLOW_ID_in_keyword_nodes1249);  
                    stream_ID.add(ID109);


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
                    // 121:7: -> ^( VAR_NAME ID )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:121:10: ^( VAR_NAME ID )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:122:4: logical_op
                    {
                    pushFollow(FOLLOW_logical_op_in_keyword_nodes1262);
                    logical_op110=logical_op();

                    state._fsp--;

                    stream_logical_op.add(logical_op110.getTree());

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
                    // 122:15: -> ^( LOGIC_OP logical_op )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:122:18: ^( LOGIC_OP logical_op )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:123:4: ast_child
                    {
                    pushFollow(FOLLOW_ast_child_in_keyword_nodes1275);
                    ast_child111=ast_child();

                    state._fsp--;

                    stream_ast_child.add(ast_child111.getTree());

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
                    // 123:14: -> ^( AST_CHILD ast_child )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:123:17: ^( AST_CHILD ast_child )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:125:1: attr : ( COLON attr -> ^( ATTRIBUTES attr ) | PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISPARENT keyword_nodes ) | PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISNODETYPE keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | ATTRIBUTES attr -> ^( ATTRIBUTES attr ) | -> EPSILON );
    public final QueryLanguageParser.attr_return attr() throws RecognitionException {
        QueryLanguageParser.attr_return retval = new QueryLanguageParser.attr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON112=null;
        Token PERIOD114=null;
        Token CONTAINS115=null;
        Token LEFT_PAREN116=null;
        Token RIGHT_PAREN118=null;
        Token PERIOD119=null;
        Token ISPARENT120=null;
        Token LEFT_PAREN121=null;
        Token RIGHT_PAREN123=null;
        Token PERIOD124=null;
        Token ISNODETYPE125=null;
        Token LEFT_PAREN126=null;
        Token RIGHT_PAREN128=null;
        Token PERIOD129=null;
        Token IS130=null;
        Token LEFT_PAREN131=null;
        Token RIGHT_PAREN133=null;
        Token PERIOD134=null;
        Token HAS135=null;
        Token LEFT_PAREN136=null;
        Token RIGHT_PAREN138=null;
        Token ATTRIBUTES139=null;
        QueryLanguageParser.attr_return attr113 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes117 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes122 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes127 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes132 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes137 =null;

        QueryLanguageParser.attr_return attr140 =null;


        Object COLON112_tree=null;
        Object PERIOD114_tree=null;
        Object CONTAINS115_tree=null;
        Object LEFT_PAREN116_tree=null;
        Object RIGHT_PAREN118_tree=null;
        Object PERIOD119_tree=null;
        Object ISPARENT120_tree=null;
        Object LEFT_PAREN121_tree=null;
        Object RIGHT_PAREN123_tree=null;
        Object PERIOD124_tree=null;
        Object ISNODETYPE125_tree=null;
        Object LEFT_PAREN126_tree=null;
        Object RIGHT_PAREN128_tree=null;
        Object PERIOD129_tree=null;
        Object IS130_tree=null;
        Object LEFT_PAREN131_tree=null;
        Object RIGHT_PAREN133_tree=null;
        Object PERIOD134_tree=null;
        Object HAS135_tree=null;
        Object LEFT_PAREN136_tree=null;
        Object RIGHT_PAREN138_tree=null;
        Object ATTRIBUTES139_tree=null;
        RewriteRuleTokenStream stream_ISPARENT=new RewriteRuleTokenStream(adaptor,"token ISPARENT");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ISNODETYPE=new RewriteRuleTokenStream(adaptor,"token ISNODETYPE");
        RewriteRuleTokenStream stream_ATTRIBUTES=new RewriteRuleTokenStream(adaptor,"token ATTRIBUTES");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:126:2: ( COLON attr -> ^( ATTRIBUTES attr ) | PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISPARENT keyword_nodes ) | PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( ISNODETYPE keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | ATTRIBUTES attr -> ^( ATTRIBUTES attr ) | -> EPSILON )
            int alt17=8;
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
                case ISPARENT:
                    {
                    alt17=3;
                    }
                    break;
                case ISNODETYPE:
                    {
                    alt17=4;
                    }
                    break;
                case IS:
                    {
                    alt17=5;
                    }
                    break;
                case HAS:
                    {
                    alt17=6;
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
                alt17=7;
                }
                break;
            case EOF:
            case AND:
            case AS:
            case COMMA:
            case COMPOUND_ADD:
            case DEPTH:
            case DIVIDE:
            case EPSILON:
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
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:126:4: COLON attr
                    {
                    COLON112=(Token)match(input,COLON,FOLLOW_COLON_in_attr1293);  
                    stream_COLON.add(COLON112);


                    pushFollow(FOLLOW_attr_in_attr1295);
                    attr113=attr();

                    state._fsp--;

                    stream_attr.add(attr113.getTree());

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
                    // 126:20: -> ^( ATTRIBUTES attr )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:126:24: ^( ATTRIBUTES attr )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:127:4: PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD114=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1314);  
                    stream_PERIOD.add(PERIOD114);


                    CONTAINS115=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_attr1316);  
                    stream_CONTAINS.add(CONTAINS115);


                    LEFT_PAREN116=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1318);  
                    stream_LEFT_PAREN.add(LEFT_PAREN116);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1320);
                    keyword_nodes117=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes117.getTree());

                    RIGHT_PAREN118=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1322);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN118);


                    // AST REWRITE
                    // elements: keyword_nodes, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:58: -> ^( CONTAINS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:127:61: ^( CONTAINS keyword_nodes )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:128:4: PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD119=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1336);  
                    stream_PERIOD.add(PERIOD119);


                    ISPARENT120=(Token)match(input,ISPARENT,FOLLOW_ISPARENT_in_attr1338);  
                    stream_ISPARENT.add(ISPARENT120);


                    LEFT_PAREN121=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1340);  
                    stream_LEFT_PAREN.add(LEFT_PAREN121);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1342);
                    keyword_nodes122=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes122.getTree());

                    RIGHT_PAREN123=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1344);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN123);


                    // AST REWRITE
                    // elements: ISPARENT, keyword_nodes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:58: -> ^( ISPARENT keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:128:61: ^( ISPARENT keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISPARENT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:129:4: PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD124=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1358);  
                    stream_PERIOD.add(PERIOD124);


                    ISNODETYPE125=(Token)match(input,ISNODETYPE,FOLLOW_ISNODETYPE_in_attr1360);  
                    stream_ISNODETYPE.add(ISNODETYPE125);


                    LEFT_PAREN126=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1362);  
                    stream_LEFT_PAREN.add(LEFT_PAREN126);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1364);
                    keyword_nodes127=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes127.getTree());

                    RIGHT_PAREN128=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1366);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN128);


                    // AST REWRITE
                    // elements: keyword_nodes, ISNODETYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:60: -> ^( ISNODETYPE keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:129:63: ^( ISNODETYPE keyword_nodes )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISNODETYPE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_keyword_nodes.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:130:4: PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD129=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1380);  
                    stream_PERIOD.add(PERIOD129);


                    IS130=(Token)match(input,IS,FOLLOW_IS_in_attr1382);  
                    stream_IS.add(IS130);


                    LEFT_PAREN131=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1384);  
                    stream_LEFT_PAREN.add(LEFT_PAREN131);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1386);
                    keyword_nodes132=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes132.getTree());

                    RIGHT_PAREN133=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1388);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN133);


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
                    // 130:53: -> ^( IS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:130:56: ^( IS keyword_nodes )
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
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:131:4: PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD134=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1403);  
                    stream_PERIOD.add(PERIOD134);


                    HAS135=(Token)match(input,HAS,FOLLOW_HAS_in_attr1405);  
                    stream_HAS.add(HAS135);


                    LEFT_PAREN136=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1407);  
                    stream_LEFT_PAREN.add(LEFT_PAREN136);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1409);
                    keyword_nodes137=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes137.getTree());

                    RIGHT_PAREN138=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1411);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN138);


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
                    // 131:53: -> ^( HAS keyword_nodes )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:131:56: ^( HAS keyword_nodes )
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
                case 7 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:132:4: ATTRIBUTES attr
                    {
                    ATTRIBUTES139=(Token)match(input,ATTRIBUTES,FOLLOW_ATTRIBUTES_in_attr1425);  
                    stream_ATTRIBUTES.add(ATTRIBUTES139);


                    pushFollow(FOLLOW_attr_in_attr1427);
                    attr140=attr();

                    state._fsp--;

                    stream_attr.add(attr140.getTree());

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
                    // 132:24: -> ^( ATTRIBUTES attr )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:132:27: ^( ATTRIBUTES attr )
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
                case 8 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:133:4: 
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
                    // 133:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:135:1: property : ( ID -> ^( VAR_NAME ID ) | ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) ) | ID PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( ISPARENT keyword_nodes ) ) | ID PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( ISNODETYPE keyword_nodes ) ) );
    public final QueryLanguageParser.property_return property() throws RecognitionException {
        QueryLanguageParser.property_return retval = new QueryLanguageParser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID141=null;
        Token ID142=null;
        Token PERIOD143=null;
        Token CONTAINS144=null;
        Token LEFT_PAREN145=null;
        Token RIGHT_PAREN147=null;
        Token ID148=null;
        Token PERIOD149=null;
        Token ISPARENT150=null;
        Token LEFT_PAREN151=null;
        Token RIGHT_PAREN153=null;
        Token ID154=null;
        Token PERIOD155=null;
        Token ISNODETYPE156=null;
        Token LEFT_PAREN157=null;
        Token RIGHT_PAREN159=null;
        QueryLanguageParser.keyword_nodes_return keyword_nodes146 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes152 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes158 =null;


        Object ID141_tree=null;
        Object ID142_tree=null;
        Object PERIOD143_tree=null;
        Object CONTAINS144_tree=null;
        Object LEFT_PAREN145_tree=null;
        Object RIGHT_PAREN147_tree=null;
        Object ID148_tree=null;
        Object PERIOD149_tree=null;
        Object ISPARENT150_tree=null;
        Object LEFT_PAREN151_tree=null;
        Object RIGHT_PAREN153_tree=null;
        Object ID154_tree=null;
        Object PERIOD155_tree=null;
        Object ISNODETYPE156_tree=null;
        Object LEFT_PAREN157_tree=null;
        Object RIGHT_PAREN159_tree=null;
        RewriteRuleTokenStream stream_ISPARENT=new RewriteRuleTokenStream(adaptor,"token ISPARENT");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ISNODETYPE=new RewriteRuleTokenStream(adaptor,"token ISNODETYPE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:136:2: ( ID -> ^( VAR_NAME ID ) | ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) ) | ID PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( ISPARENT keyword_nodes ) ) | ID PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( ISNODETYPE keyword_nodes ) ) )
            int alt18=4;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==PERIOD) ) {
                    switch ( input.LA(3) ) {
                    case CONTAINS:
                        {
                        alt18=2;
                        }
                        break;
                    case ISPARENT:
                        {
                        alt18=3;
                        }
                        break;
                    case ISNODETYPE:
                        {
                        alt18=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;

                    }

                }
                else if ( (LA18_1==EOF||(LA18_1 >= AND && LA18_1 <= AS)||(LA18_1 >= COMMA && LA18_1 <= COMPOUND_ADD)||(LA18_1 >= DEPTH && LA18_1 <= DIVIDE)||(LA18_1 >= EPSILON && LA18_1 <= EQUALS)||LA18_1==FOREACH||(LA18_1 >= GT && LA18_1 <= GTE)||(LA18_1 >= ID && LA18_1 <= IF)||LA18_1==IN||(LA18_1 >= INCREMENT && LA18_1 <= INTEGER)||LA18_1==LEFT_BRACKET||(LA18_1 >= LEFT_SQ_BRACKET && LA18_1 <= LOGIC_EQUALS)||(LA18_1 >= LT && LA18_1 <= MINUS)||LA18_1==NOT_EQUAL||LA18_1==OR||(LA18_1 >= PLUS && LA18_1 <= PRINT)||(LA18_1 >= REPEATER && LA18_1 <= RIGHT_PAREN)||LA18_1==SELECT||(LA18_1 >= SEMICOLON && LA18_1 <= SET)||LA18_1==STAR||LA18_1==STRING) ) {
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:136:4: ID
                    {
                    ID141=(Token)match(input,ID,FOLLOW_ID_in_property1456);  
                    stream_ID.add(ID141);


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
                    // 136:18: -> ^( VAR_NAME ID )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:136:21: ^( VAR_NAME ID )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:137:4: ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    ID142=(Token)match(input,ID,FOLLOW_ID_in_property1480);  
                    stream_ID.add(ID142);


                    PERIOD143=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1482);  
                    stream_PERIOD.add(PERIOD143);


                    CONTAINS144=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_property1484);  
                    stream_CONTAINS.add(CONTAINS144);


                    LEFT_PAREN145=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1486);  
                    stream_LEFT_PAREN.add(LEFT_PAREN145);


                    pushFollow(FOLLOW_keyword_nodes_in_property1488);
                    keyword_nodes146=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes146.getTree());

                    RIGHT_PAREN147=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1490);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN147);


                    // AST REWRITE
                    // elements: keyword_nodes, CONTAINS, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:60: -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:137:63: ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:137:77: ^( CONTAINS keyword_nodes )
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
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:138:4: ID PERIOD ISPARENT LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    ID148=(Token)match(input,ID,FOLLOW_ID_in_property1509);  
                    stream_ID.add(ID148);


                    PERIOD149=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1511);  
                    stream_PERIOD.add(PERIOD149);


                    ISPARENT150=(Token)match(input,ISPARENT,FOLLOW_ISPARENT_in_property1513);  
                    stream_ISPARENT.add(ISPARENT150);


                    LEFT_PAREN151=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1515);  
                    stream_LEFT_PAREN.add(LEFT_PAREN151);


                    pushFollow(FOLLOW_keyword_nodes_in_property1517);
                    keyword_nodes152=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes152.getTree());

                    RIGHT_PAREN153=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1519);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN153);


                    // AST REWRITE
                    // elements: ID, keyword_nodes, ISPARENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 138:60: -> ^( VAR_NAME ID ^( ISPARENT keyword_nodes ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:138:63: ^( VAR_NAME ID ^( ISPARENT keyword_nodes ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:138:77: ^( ISPARENT keyword_nodes )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_ISPARENT.nextNode()
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
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:139:4: ID PERIOD ISNODETYPE LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    ID154=(Token)match(input,ID,FOLLOW_ID_in_property1538);  
                    stream_ID.add(ID154);


                    PERIOD155=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1540);  
                    stream_PERIOD.add(PERIOD155);


                    ISNODETYPE156=(Token)match(input,ISNODETYPE,FOLLOW_ISNODETYPE_in_property1542);  
                    stream_ISNODETYPE.add(ISNODETYPE156);


                    LEFT_PAREN157=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1544);  
                    stream_LEFT_PAREN.add(LEFT_PAREN157);


                    pushFollow(FOLLOW_keyword_nodes_in_property1546);
                    keyword_nodes158=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes158.getTree());

                    RIGHT_PAREN159=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1548);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN159);


                    // AST REWRITE
                    // elements: ID, keyword_nodes, ISNODETYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:62: -> ^( VAR_NAME ID ^( ISNODETYPE keyword_nodes ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:139:65: ^( VAR_NAME ID ^( ISNODETYPE keyword_nodes ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:139:79: ^( ISNODETYPE keyword_nodes )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_ISNODETYPE.nextNode()
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:142:1: variable : ( ID COLON attr -> ^( VAR_NAME ID attr ) | node_chain -> ^( NODE_CHAIN node_chain ) | INTEGER -> INTEGER | STRING -> STRING | RESERVED_TYPES -> RESERVED_TYPES | function -> ^( FUNCTION function ) );
    public final QueryLanguageParser.variable_return variable() throws RecognitionException {
        QueryLanguageParser.variable_return retval = new QueryLanguageParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID160=null;
        Token COLON161=null;
        Token INTEGER164=null;
        Token STRING165=null;
        Token RESERVED_TYPES166=null;
        QueryLanguageParser.attr_return attr162 =null;

        QueryLanguageParser.node_chain_return node_chain163 =null;

        QueryLanguageParser.function_return function167 =null;


        Object ID160_tree=null;
        Object COLON161_tree=null;
        Object INTEGER164_tree=null;
        Object STRING165_tree=null;
        Object RESERVED_TYPES166_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RESERVED_TYPES=new RewriteRuleTokenStream(adaptor,"token RESERVED_TYPES");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:143:2: ( ID COLON attr -> ^( VAR_NAME ID attr ) | node_chain -> ^( NODE_CHAIN node_chain ) | INTEGER -> INTEGER | STRING -> STRING | RESERVED_TYPES -> RESERVED_TYPES | function -> ^( FUNCTION function ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==COLON) ) {
                    alt19=1;
                }
                else if ( (LA19_1==EOF||(LA19_1 >= AND && LA19_1 <= AS)||(LA19_1 >= COMMA && LA19_1 <= COMPOUND_ADD)||(LA19_1 >= DEPTH && LA19_1 <= DIVIDE)||(LA19_1 >= EPSILON && LA19_1 <= EQUALS)||LA19_1==FOREACH||(LA19_1 >= GT && LA19_1 <= GTE)||(LA19_1 >= ID && LA19_1 <= IF)||(LA19_1 >= INCREMENT && LA19_1 <= INTEGER)||LA19_1==LEFT_BRACKET||(LA19_1 >= LEFT_SQ_BRACKET && LA19_1 <= LOGIC_EQUALS)||(LA19_1 >= LT && LA19_1 <= MINUS)||LA19_1==NOT_EQUAL||(LA19_1 >= OR && LA19_1 <= PRINT)||(LA19_1 >= RESERVED_TYPES && LA19_1 <= RIGHT_PAREN)||LA19_1==SELECT||(LA19_1 >= SEMICOLON && LA19_1 <= SET)||LA19_1==STRING) ) {
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:143:4: ID COLON attr
                    {
                    ID160=(Token)match(input,ID,FOLLOW_ID_in_variable1575);  
                    stream_ID.add(ID160);


                    COLON161=(Token)match(input,COLON,FOLLOW_COLON_in_variable1577);  
                    stream_COLON.add(COLON161);


                    pushFollow(FOLLOW_attr_in_variable1579);
                    attr162=attr();

                    state._fsp--;

                    stream_attr.add(attr162.getTree());

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
                    // 143:21: -> ^( VAR_NAME ID attr )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:143:24: ^( VAR_NAME ID attr )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:144:4: node_chain
                    {
                    pushFollow(FOLLOW_node_chain_in_variable1597);
                    node_chain163=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain163.getTree());

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
                    // 144:19: -> ^( NODE_CHAIN node_chain )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:144:22: ^( NODE_CHAIN node_chain )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:145:4: INTEGER
                    {
                    INTEGER164=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_variable1614);  
                    stream_INTEGER.add(INTEGER164);


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
                    // 145:16: -> INTEGER
                    {
                        adaptor.addChild(root_0, 
                        stream_INTEGER.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:146:10: STRING
                    {
                    STRING165=(Token)match(input,STRING,FOLLOW_STRING_in_variable1633);  
                    stream_STRING.add(STRING165);


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
                    // 146:50: -> STRING
                    {
                        adaptor.addChild(root_0, 
                        stream_STRING.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:147:4: RESERVED_TYPES
                    {
                    RESERVED_TYPES166=(Token)match(input,RESERVED_TYPES,FOLLOW_RESERVED_TYPES_in_variable1675);  
                    stream_RESERVED_TYPES.add(RESERVED_TYPES166);


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
                    // 147:22: -> RESERVED_TYPES
                    {
                        adaptor.addChild(root_0, 
                        stream_RESERVED_TYPES.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:148:4: function
                    {
                    pushFollow(FOLLOW_function_in_variable1688);
                    function167=function();

                    state._fsp--;

                    stream_function.add(function167.getTree());

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
                    // 148:16: -> ^( FUNCTION function )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:148:19: ^( FUNCTION function )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:151:1: function : ( MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAX variable variable ) | MIN LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MIN variable variable ) | DEPTH LEFT_PAREN variable RIGHT_PAREN -> ^( DEPTH variable ) );
    public final QueryLanguageParser.function_return function() throws RecognitionException {
        QueryLanguageParser.function_return retval = new QueryLanguageParser.function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MAX168=null;
        Token LEFT_PAREN169=null;
        Token COMMA171=null;
        Token RIGHT_PAREN173=null;
        Token MIN174=null;
        Token LEFT_PAREN175=null;
        Token COMMA177=null;
        Token RIGHT_PAREN179=null;
        Token DEPTH180=null;
        Token LEFT_PAREN181=null;
        Token RIGHT_PAREN183=null;
        QueryLanguageParser.variable_return variable170 =null;

        QueryLanguageParser.variable_return variable172 =null;

        QueryLanguageParser.variable_return variable176 =null;

        QueryLanguageParser.variable_return variable178 =null;

        QueryLanguageParser.variable_return variable182 =null;


        Object MAX168_tree=null;
        Object LEFT_PAREN169_tree=null;
        Object COMMA171_tree=null;
        Object RIGHT_PAREN173_tree=null;
        Object MIN174_tree=null;
        Object LEFT_PAREN175_tree=null;
        Object COMMA177_tree=null;
        Object RIGHT_PAREN179_tree=null;
        Object DEPTH180_tree=null;
        Object LEFT_PAREN181_tree=null;
        Object RIGHT_PAREN183_tree=null;
        RewriteRuleTokenStream stream_MAX=new RewriteRuleTokenStream(adaptor,"token MAX");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_MIN=new RewriteRuleTokenStream(adaptor,"token MIN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_DEPTH=new RewriteRuleTokenStream(adaptor,"token DEPTH");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:152:2: ( MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAX variable variable ) | MIN LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MIN variable variable ) | DEPTH LEFT_PAREN variable RIGHT_PAREN -> ^( DEPTH variable ) )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:152:4: MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN
                    {
                    MAX168=(Token)match(input,MAX,FOLLOW_MAX_in_function1710);  
                    stream_MAX.add(MAX168);


                    LEFT_PAREN169=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1712);  
                    stream_LEFT_PAREN.add(LEFT_PAREN169);


                    pushFollow(FOLLOW_variable_in_function1714);
                    variable170=variable();

                    state._fsp--;

                    stream_variable.add(variable170.getTree());

                    COMMA171=(Token)match(input,COMMA,FOLLOW_COMMA_in_function1716);  
                    stream_COMMA.add(COMMA171);


                    pushFollow(FOLLOW_variable_in_function1718);
                    variable172=variable();

                    state._fsp--;

                    stream_variable.add(variable172.getTree());

                    RIGHT_PAREN173=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1720);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN173);


                    // AST REWRITE
                    // elements: variable, MAX, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:55: -> ^( MAX variable variable )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:152:58: ^( MAX variable variable )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:153:4: MIN LEFT_PAREN variable COMMA variable RIGHT_PAREN
                    {
                    MIN174=(Token)match(input,MIN,FOLLOW_MIN_in_function1735);  
                    stream_MIN.add(MIN174);


                    LEFT_PAREN175=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1737);  
                    stream_LEFT_PAREN.add(LEFT_PAREN175);


                    pushFollow(FOLLOW_variable_in_function1739);
                    variable176=variable();

                    state._fsp--;

                    stream_variable.add(variable176.getTree());

                    COMMA177=(Token)match(input,COMMA,FOLLOW_COMMA_in_function1741);  
                    stream_COMMA.add(COMMA177);


                    pushFollow(FOLLOW_variable_in_function1743);
                    variable178=variable();

                    state._fsp--;

                    stream_variable.add(variable178.getTree());

                    RIGHT_PAREN179=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1745);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN179);


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
                    // 153:55: -> ^( MIN variable variable )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:153:58: ^( MIN variable variable )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:154:10: DEPTH LEFT_PAREN variable RIGHT_PAREN
                    {
                    DEPTH180=(Token)match(input,DEPTH,FOLLOW_DEPTH_in_function1766);  
                    stream_DEPTH.add(DEPTH180);


                    LEFT_PAREN181=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function1768);  
                    stream_LEFT_PAREN.add(LEFT_PAREN181);


                    pushFollow(FOLLOW_variable_in_function1770);
                    variable182=variable();

                    state._fsp--;

                    stream_variable.add(variable182.getTree());

                    RIGHT_PAREN183=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function1772);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN183);


                    // AST REWRITE
                    // elements: DEPTH, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:48: -> ^( DEPTH variable )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:154:51: ^( DEPTH variable )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:157:1: block : ( LEFT_BRACKET block_statements RIGHT_BRACKET -> ^( BLOCK_STATEMENTS block_statements ) | -> EPSILON );
    public final QueryLanguageParser.block_return block() throws RecognitionException {
        QueryLanguageParser.block_return retval = new QueryLanguageParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET184=null;
        Token RIGHT_BRACKET186=null;
        QueryLanguageParser.block_statements_return block_statements185 =null;


        Object LEFT_BRACKET184_tree=null;
        Object RIGHT_BRACKET186_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_block_statements=new RewriteRuleSubtreeStream(adaptor,"rule block_statements");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:158:2: ( LEFT_BRACKET block_statements RIGHT_BRACKET -> ^( BLOCK_STATEMENTS block_statements ) | -> EPSILON )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:158:4: LEFT_BRACKET block_statements RIGHT_BRACKET
                    {
                    LEFT_BRACKET184=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_block1792);  
                    stream_LEFT_BRACKET.add(LEFT_BRACKET184);


                    pushFollow(FOLLOW_block_statements_in_block1794);
                    block_statements185=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements185.getTree());

                    RIGHT_BRACKET186=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_block1796);  
                    stream_RIGHT_BRACKET.add(RIGHT_BRACKET186);


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
                    // 158:48: -> ^( BLOCK_STATEMENTS block_statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:158:51: ^( BLOCK_STATEMENTS block_statements )
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
    // $ANTLR end "block"


    public static class block_statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_statements"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:161:1: block_statements : ( STAR block_statements -> ^( STAR block_statements ) | REPEATER block_statements -> ^( REPEATER block_statements ) | node_chain block block_statements -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) ) | -> EPSILON );
    public final QueryLanguageParser.block_statements_return block_statements() throws RecognitionException {
        QueryLanguageParser.block_statements_return retval = new QueryLanguageParser.block_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR187=null;
        Token REPEATER189=null;
        QueryLanguageParser.block_statements_return block_statements188 =null;

        QueryLanguageParser.block_statements_return block_statements190 =null;

        QueryLanguageParser.node_chain_return node_chain191 =null;

        QueryLanguageParser.block_return block192 =null;

        QueryLanguageParser.block_statements_return block_statements193 =null;


        Object STAR187_tree=null;
        Object REPEATER189_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_REPEATER=new RewriteRuleTokenStream(adaptor,"token REPEATER");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_block_statements=new RewriteRuleSubtreeStream(adaptor,"rule block_statements");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:2: ( STAR block_statements -> ^( STAR block_statements ) | REPEATER block_statements -> ^( REPEATER block_statements ) | node_chain block block_statements -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) ) | -> EPSILON )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:4: STAR block_statements
                    {
                    STAR187=(Token)match(input,STAR,FOLLOW_STAR_in_block_statements1821);  
                    stream_STAR.add(STAR187);


                    pushFollow(FOLLOW_block_statements_in_block_statements1823);
                    block_statements188=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements188.getTree());

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
                    // 162:29: -> ^( STAR block_statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:162:32: ^( STAR block_statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:163:4: REPEATER block_statements
                    {
                    REPEATER189=(Token)match(input,REPEATER,FOLLOW_REPEATER_in_block_statements1839);  
                    stream_REPEATER.add(REPEATER189);


                    pushFollow(FOLLOW_block_statements_in_block_statements1841);
                    block_statements190=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements190.getTree());

                    // AST REWRITE
                    // elements: block_statements, REPEATER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:32: -> ^( REPEATER block_statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:163:35: ^( REPEATER block_statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:164:4: node_chain block block_statements
                    {
                    pushFollow(FOLLOW_node_chain_in_block_statements1856);
                    node_chain191=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain191.getTree());

                    pushFollow(FOLLOW_block_in_block_statements1858);
                    block192=block();

                    state._fsp--;

                    stream_block.add(block192.getTree());

                    pushFollow(FOLLOW_block_statements_in_block_statements1860);
                    block_statements193=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements193.getTree());

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
                    // 164:38: -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:164:41: ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NESTED, "NESTED")
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:164:50: ^( node_chain )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_node_chain.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:164:70: ^( BLOCK_STATEMENTS block_statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:165:4: 
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
                    // 165:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:168:1: print_stmt : ( PRINT variable_stmt SEMICOLON -> variable_stmt | -> EPSILON );
    public final QueryLanguageParser.print_stmt_return print_stmt() throws RecognitionException {
        QueryLanguageParser.print_stmt_return retval = new QueryLanguageParser.print_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT194=null;
        Token SEMICOLON196=null;
        QueryLanguageParser.variable_stmt_return variable_stmt195 =null;


        Object PRINT194_tree=null;
        Object SEMICOLON196_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_variable_stmt=new RewriteRuleSubtreeStream(adaptor,"rule variable_stmt");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:169:2: ( PRINT variable_stmt SEMICOLON -> variable_stmt | -> EPSILON )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==PRINT) ) {
                alt23=1;
            }
            else if ( (LA23_0==EOF||LA23_0==DEPTH||LA23_0==EPSILON||LA23_0==FOREACH||(LA23_0 >= ID && LA23_0 <= IF)||LA23_0==INTEGER||LA23_0==LEFT_BRACKET||LA23_0==LEFT_SQ_BRACKET||LA23_0==LT||(LA23_0 >= MAX && LA23_0 <= MIN)||(LA23_0 >= RESERVED_TYPES && LA23_0 <= RIGHT_BRACKET)||LA23_0==SELECT||LA23_0==SET||LA23_0==STRING) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:169:4: PRINT variable_stmt SEMICOLON
                    {
                    PRINT194=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stmt1896);  
                    stream_PRINT.add(PRINT194);


                    pushFollow(FOLLOW_variable_stmt_in_print_stmt1898);
                    variable_stmt195=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt195.getTree());

                    SEMICOLON196=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print_stmt1900);  
                    stream_SEMICOLON.add(SEMICOLON196);


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
                    // 169:34: -> variable_stmt
                    {
                        adaptor.addChild(root_0, stream_variable_stmt.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:170:4: 
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
                    // 170:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:173:1: stat_statements : ( LEFT_BRACKET statements RIGHT_BRACKET -> statements | -> EPSILON );
    public final QueryLanguageParser.stat_statements_return stat_statements() throws RecognitionException {
        QueryLanguageParser.stat_statements_return retval = new QueryLanguageParser.stat_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET197=null;
        Token RIGHT_BRACKET199=null;
        QueryLanguageParser.statements_return statements198 =null;


        Object LEFT_BRACKET197_tree=null;
        Object RIGHT_BRACKET199_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:174:2: ( LEFT_BRACKET statements RIGHT_BRACKET -> statements | -> EPSILON )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LEFT_BRACKET) ) {
                alt24=1;
            }
            else if ( (LA24_0==EOF||LA24_0==DEPTH||LA24_0==EPSILON||LA24_0==FOREACH||(LA24_0 >= ID && LA24_0 <= IF)||LA24_0==INTEGER||LA24_0==LEFT_SQ_BRACKET||LA24_0==LT||(LA24_0 >= MAX && LA24_0 <= MIN)||LA24_0==PRINT||(LA24_0 >= RESERVED_TYPES && LA24_0 <= RIGHT_BRACKET)||LA24_0==SELECT||LA24_0==SET||LA24_0==STRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:174:4: LEFT_BRACKET statements RIGHT_BRACKET
                    {
                    LEFT_BRACKET197=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_stat_statements1922);  
                    stream_LEFT_BRACKET.add(LEFT_BRACKET197);


                    pushFollow(FOLLOW_statements_in_stat_statements1924);
                    statements198=statements();

                    state._fsp--;

                    stream_statements.add(statements198.getTree());

                    RIGHT_BRACKET199=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_stat_statements1926);  
                    stream_RIGHT_BRACKET.add(RIGHT_BRACKET199);


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
                    // 174:42: -> statements
                    {
                        adaptor.addChild(root_0, stream_statements.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:175:4: 
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
                    // 175:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:178:1: statements : ( variable_assn statements -> ^( STATEMENT variable_assn statements ) | if_statement statements -> ^( STATEMENT if_statement statements ) | query statements -> ^( QUERY query ) statements | SET variable_assn WHERE boolean_exp SEMICOLON -> ^( SET_TABLE variable_assn boolean_exp ) | -> EPSILON );
    public final QueryLanguageParser.statements_return statements() throws RecognitionException {
        QueryLanguageParser.statements_return retval = new QueryLanguageParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SET206=null;
        Token WHERE208=null;
        Token SEMICOLON210=null;
        QueryLanguageParser.variable_assn_return variable_assn200 =null;

        QueryLanguageParser.statements_return statements201 =null;

        QueryLanguageParser.if_statement_return if_statement202 =null;

        QueryLanguageParser.statements_return statements203 =null;

        QueryLanguageParser.query_return query204 =null;

        QueryLanguageParser.statements_return statements205 =null;

        QueryLanguageParser.variable_assn_return variable_assn207 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp209 =null;


        Object SET206_tree=null;
        Object WHERE208_tree=null;
        Object SEMICOLON210_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_variable_assn=new RewriteRuleSubtreeStream(adaptor,"rule variable_assn");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        RewriteRuleSubtreeStream stream_if_statement=new RewriteRuleSubtreeStream(adaptor,"rule if_statement");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:179:2: ( variable_assn statements -> ^( STATEMENT variable_assn statements ) | if_statement statements -> ^( STATEMENT if_statement statements ) | query statements -> ^( QUERY query ) statements | SET variable_assn WHERE boolean_exp SEMICOLON -> ^( SET_TABLE variable_assn boolean_exp ) | -> EPSILON )
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
            case EPSILON:
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:179:4: variable_assn statements
                    {
                    pushFollow(FOLLOW_variable_assn_in_statements1949);
                    variable_assn200=variable_assn();

                    state._fsp--;

                    stream_variable_assn.add(variable_assn200.getTree());

                    pushFollow(FOLLOW_statements_in_statements1951);
                    statements201=statements();

                    state._fsp--;

                    stream_statements.add(statements201.getTree());

                    // AST REWRITE
                    // elements: statements, variable_assn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:29: -> ^( STATEMENT variable_assn statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:179:32: ^( STATEMENT variable_assn statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:180:4: if_statement statements
                    {
                    pushFollow(FOLLOW_if_statement_in_statements1966);
                    if_statement202=if_statement();

                    state._fsp--;

                    stream_if_statement.add(if_statement202.getTree());

                    pushFollow(FOLLOW_statements_in_statements1968);
                    statements203=statements();

                    state._fsp--;

                    stream_statements.add(statements203.getTree());

                    // AST REWRITE
                    // elements: if_statement, statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:29: -> ^( STATEMENT if_statement statements )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:180:32: ^( STATEMENT if_statement statements )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:181:4: query statements
                    {
                    pushFollow(FOLLOW_query_in_statements1984);
                    query204=query();

                    state._fsp--;

                    stream_query.add(query204.getTree());

                    pushFollow(FOLLOW_statements_in_statements1986);
                    statements205=statements();

                    state._fsp--;

                    stream_statements.add(statements205.getTree());

                    // AST REWRITE
                    // elements: statements, query
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:22: -> ^( QUERY query ) statements
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:181:25: ^( QUERY query )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:182:4: SET variable_assn WHERE boolean_exp SEMICOLON
                    {
                    SET206=(Token)match(input,SET,FOLLOW_SET_in_statements2002);  
                    stream_SET.add(SET206);


                    pushFollow(FOLLOW_variable_assn_in_statements2004);
                    variable_assn207=variable_assn();

                    state._fsp--;

                    stream_variable_assn.add(variable_assn207.getTree());

                    WHERE208=(Token)match(input,WHERE,FOLLOW_WHERE_in_statements2006);  
                    stream_WHERE.add(WHERE208);


                    pushFollow(FOLLOW_boolean_exp_in_statements2008);
                    boolean_exp209=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp209.getTree());

                    SEMICOLON210=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements2010);  
                    stream_SEMICOLON.add(SEMICOLON210);


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
                    // 182:50: -> ^( SET_TABLE variable_assn boolean_exp )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:182:53: ^( SET_TABLE variable_assn boolean_exp )
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
    // $ANTLR end "statements"


    public static class variable_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_stmt"
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:186:1: variable_stmt : variable binary_op -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) ) ;
    public final QueryLanguageParser.variable_stmt_return variable_stmt() throws RecognitionException {
        QueryLanguageParser.variable_stmt_return retval = new QueryLanguageParser.variable_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable211 =null;

        QueryLanguageParser.binary_op_return binary_op212 =null;


        RewriteRuleSubtreeStream stream_binary_op=new RewriteRuleSubtreeStream(adaptor,"rule binary_op");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:2: ( variable binary_op -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:4: variable binary_op
            {
            pushFollow(FOLLOW_variable_in_variable_stmt2039);
            variable211=variable();

            state._fsp--;

            stream_variable.add(variable211.getTree());

            pushFollow(FOLLOW_binary_op_in_variable_stmt2041);
            binary_op212=binary_op();

            state._fsp--;

            stream_binary_op.add(binary_op212.getTree());

            // AST REWRITE
            // elements: binary_op, variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:25: -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:28: ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR_STMT, "VAR_STMT")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:39: ^( VAR variable )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR, "VAR")
                , root_2);

                adaptor.addChild(root_2, stream_variable.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:187:55: ^( BIN_OP binary_op )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:190:1: variable_assn : variable variable_assn_right -> ^( VAR variable ) variable_assn_right ;
    public final QueryLanguageParser.variable_assn_return variable_assn() throws RecognitionException {
        QueryLanguageParser.variable_assn_return retval = new QueryLanguageParser.variable_assn_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable213 =null;

        QueryLanguageParser.variable_assn_right_return variable_assn_right214 =null;


        RewriteRuleSubtreeStream stream_variable_assn_right=new RewriteRuleSubtreeStream(adaptor,"rule variable_assn_right");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:191:2: ( variable variable_assn_right -> ^( VAR variable ) variable_assn_right )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:191:4: variable variable_assn_right
            {
            pushFollow(FOLLOW_variable_in_variable_assn2073);
            variable213=variable();

            state._fsp--;

            stream_variable.add(variable213.getTree());

            pushFollow(FOLLOW_variable_assn_right_in_variable_assn2075);
            variable_assn_right214=variable_assn_right();

            state._fsp--;

            stream_variable_assn_right.add(variable_assn_right214.getTree());

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
            // 191:33: -> ^( VAR variable ) variable_assn_right
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:191:36: ^( VAR variable )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:193:1: variable_assn_right : ( EQUALS variable_stmt SEMICOLON -> ^( VAR_ASSIGN variable_stmt ) | COMPOUND_ADD variable_stmt SEMICOLON -> ^( COMP_ADD variable_stmt ) | INCREMENT SEMICOLON -> INCR );
    public final QueryLanguageParser.variable_assn_right_return variable_assn_right() throws RecognitionException {
        QueryLanguageParser.variable_assn_right_return retval = new QueryLanguageParser.variable_assn_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS215=null;
        Token SEMICOLON217=null;
        Token COMPOUND_ADD218=null;
        Token SEMICOLON220=null;
        Token INCREMENT221=null;
        Token SEMICOLON222=null;
        QueryLanguageParser.variable_stmt_return variable_stmt216 =null;

        QueryLanguageParser.variable_stmt_return variable_stmt219 =null;


        Object EQUALS215_tree=null;
        Object SEMICOLON217_tree=null;
        Object COMPOUND_ADD218_tree=null;
        Object SEMICOLON220_tree=null;
        Object INCREMENT221_tree=null;
        Object SEMICOLON222_tree=null;
        RewriteRuleTokenStream stream_INCREMENT=new RewriteRuleTokenStream(adaptor,"token INCREMENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_COMPOUND_ADD=new RewriteRuleTokenStream(adaptor,"token COMPOUND_ADD");
        RewriteRuleSubtreeStream stream_variable_stmt=new RewriteRuleSubtreeStream(adaptor,"rule variable_stmt");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:194:2: ( EQUALS variable_stmt SEMICOLON -> ^( VAR_ASSIGN variable_stmt ) | COMPOUND_ADD variable_stmt SEMICOLON -> ^( COMP_ADD variable_stmt ) | INCREMENT SEMICOLON -> INCR )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:194:4: EQUALS variable_stmt SEMICOLON
                    {
                    EQUALS215=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_variable_assn_right2095);  
                    stream_EQUALS.add(EQUALS215);


                    pushFollow(FOLLOW_variable_stmt_in_variable_assn_right2097);
                    variable_stmt216=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt216.getTree());

                    SEMICOLON217=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right2099);  
                    stream_SEMICOLON.add(SEMICOLON217);


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
                    // 194:36: -> ^( VAR_ASSIGN variable_stmt )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:194:39: ^( VAR_ASSIGN variable_stmt )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:195:4: COMPOUND_ADD variable_stmt SEMICOLON
                    {
                    COMPOUND_ADD218=(Token)match(input,COMPOUND_ADD,FOLLOW_COMPOUND_ADD_in_variable_assn_right2113);  
                    stream_COMPOUND_ADD.add(COMPOUND_ADD218);


                    pushFollow(FOLLOW_variable_stmt_in_variable_assn_right2115);
                    variable_stmt219=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt219.getTree());

                    SEMICOLON220=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right2117);  
                    stream_SEMICOLON.add(SEMICOLON220);


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
                    // 195:41: -> ^( COMP_ADD variable_stmt )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:195:44: ^( COMP_ADD variable_stmt )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:196:4: INCREMENT SEMICOLON
                    {
                    INCREMENT221=(Token)match(input,INCREMENT,FOLLOW_INCREMENT_in_variable_assn_right2130);  
                    stream_INCREMENT.add(INCREMENT221);


                    SEMICOLON222=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right2132);  
                    stream_SEMICOLON.add(SEMICOLON222);


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
                    // 196:26: -> INCR
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:198:1: if_statement : IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) ) ;
    public final QueryLanguageParser.if_statement_return if_statement() throws RecognitionException {
        QueryLanguageParser.if_statement_return retval = new QueryLanguageParser.if_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF223=null;
        Token LEFT_PAREN224=null;
        Token RIGHT_PAREN226=null;
        Token LEFT_BRACKET227=null;
        Token RIGHT_BRACKET229=null;
        QueryLanguageParser.boolean_exp_return boolean_exp225 =null;

        QueryLanguageParser.statements_return statements228 =null;


        Object IF223_tree=null;
        Object LEFT_PAREN224_tree=null;
        Object RIGHT_PAREN226_tree=null;
        Object LEFT_BRACKET227_tree=null;
        Object RIGHT_BRACKET229_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:199:2: ( IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) ) )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:199:4: IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET
            {
            IF223=(Token)match(input,IF,FOLLOW_IF_in_if_statement2148);  
            stream_IF.add(IF223);


            LEFT_PAREN224=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_if_statement2150);  
            stream_LEFT_PAREN.add(LEFT_PAREN224);


            pushFollow(FOLLOW_boolean_exp_in_if_statement2152);
            boolean_exp225=boolean_exp();

            state._fsp--;

            stream_boolean_exp.add(boolean_exp225.getTree());

            RIGHT_PAREN226=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_if_statement2154);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN226);


            LEFT_BRACKET227=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_if_statement2156);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET227);


            pushFollow(FOLLOW_statements_in_if_statement2158);
            statements228=statements();

            state._fsp--;

            stream_statements.add(statements228.getTree());

            RIGHT_BRACKET229=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_if_statement2160);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET229);


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
            // 199:80: -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) )
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:199:83: ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF_STATEMENT, "IF_STATEMENT")
                , root_1);

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:199:98: ^( BOOL_EXP boolean_exp )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                , root_2);

                adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:199:122: ^( STATEMENTS statements )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:202:1: boolean_stmt : variable boolean_right -> ^( VAR variable ) boolean_right ;
    public final QueryLanguageParser.boolean_stmt_return boolean_stmt() throws RecognitionException {
        QueryLanguageParser.boolean_stmt_return retval = new QueryLanguageParser.boolean_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable230 =null;

        QueryLanguageParser.boolean_right_return boolean_right231 =null;


        RewriteRuleSubtreeStream stream_boolean_right=new RewriteRuleSubtreeStream(adaptor,"rule boolean_right");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:203:2: ( variable boolean_right -> ^( VAR variable ) boolean_right )
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:203:4: variable boolean_right
            {
            pushFollow(FOLLOW_variable_in_boolean_stmt2189);
            variable230=variable();

            state._fsp--;

            stream_variable.add(variable230.getTree());

            pushFollow(FOLLOW_boolean_right_in_boolean_stmt2191);
            boolean_right231=boolean_right();

            state._fsp--;

            stream_boolean_right.add(boolean_right231.getTree());

            // AST REWRITE
            // elements: variable, boolean_right
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 203:27: -> ^( VAR variable ) boolean_right
            {
                // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:203:30: ^( VAR variable )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:206:1: boolean_right : ( boolean_op variable -> ^( boolean_op variable ) | -> EPSILON );
    public final QueryLanguageParser.boolean_right_return boolean_right() throws RecognitionException {
        QueryLanguageParser.boolean_right_return retval = new QueryLanguageParser.boolean_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.boolean_op_return boolean_op232 =null;

        QueryLanguageParser.variable_return variable233 =null;


        RewriteRuleSubtreeStream stream_boolean_op=new RewriteRuleSubtreeStream(adaptor,"rule boolean_op");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:207:2: ( boolean_op variable -> ^( boolean_op variable ) | -> EPSILON )
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
            case EPSILON:
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:207:4: boolean_op variable
                    {
                    pushFollow(FOLLOW_boolean_op_in_boolean_right2212);
                    boolean_op232=boolean_op();

                    state._fsp--;

                    stream_boolean_op.add(boolean_op232.getTree());

                    pushFollow(FOLLOW_variable_in_boolean_right2214);
                    variable233=variable();

                    state._fsp--;

                    stream_variable.add(variable233.getTree());

                    // AST REWRITE
                    // elements: variable, boolean_op
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:24: -> ^( boolean_op variable )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:207:27: ^( boolean_op variable )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:208:4: 
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
                    // 208:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:211:1: boolean_exp : ( boolean_stmt boolean_exp_cont -> boolean_stmt ^( BOOL_EXP boolean_exp_cont ) | NOT boolean_exp -> ^( NOT ^( BOOL_EXP boolean_exp ) ) );
    public final QueryLanguageParser.boolean_exp_return boolean_exp() throws RecognitionException {
        QueryLanguageParser.boolean_exp_return retval = new QueryLanguageParser.boolean_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT236=null;
        QueryLanguageParser.boolean_stmt_return boolean_stmt234 =null;

        QueryLanguageParser.boolean_exp_cont_return boolean_exp_cont235 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp237 =null;


        Object NOT236_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_boolean_stmt=new RewriteRuleSubtreeStream(adaptor,"rule boolean_stmt");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_boolean_exp_cont=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp_cont");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:212:2: ( boolean_stmt boolean_exp_cont -> boolean_stmt ^( BOOL_EXP boolean_exp_cont ) | NOT boolean_exp -> ^( NOT ^( BOOL_EXP boolean_exp ) ) )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:212:4: boolean_stmt boolean_exp_cont
                    {
                    pushFollow(FOLLOW_boolean_stmt_in_boolean_exp2241);
                    boolean_stmt234=boolean_stmt();

                    state._fsp--;

                    stream_boolean_stmt.add(boolean_stmt234.getTree());

                    pushFollow(FOLLOW_boolean_exp_cont_in_boolean_exp2243);
                    boolean_exp_cont235=boolean_exp_cont();

                    state._fsp--;

                    stream_boolean_exp_cont.add(boolean_exp_cont235.getTree());

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
                    // 212:34: -> boolean_stmt ^( BOOL_EXP boolean_exp_cont )
                    {
                        adaptor.addChild(root_0, stream_boolean_stmt.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:212:50: ^( BOOL_EXP boolean_exp_cont )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:213:4: NOT boolean_exp
                    {
                    NOT236=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_exp2258);  
                    stream_NOT.add(NOT236);


                    pushFollow(FOLLOW_boolean_exp_in_boolean_exp2260);
                    boolean_exp237=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp237.getTree());

                    // AST REWRITE
                    // elements: NOT, boolean_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:22: -> ^( NOT ^( BOOL_EXP boolean_exp ) )
                    {
                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:213:25: ^( NOT ^( BOOL_EXP boolean_exp ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_NOT.nextNode()
                        , root_1);

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:213:31: ^( BOOL_EXP boolean_exp )
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:216:1: boolean_exp_cont : ( logical_op boolean_exp -> logical_op ^( BOOL_EXP boolean_exp ) | -> EPSILON );
    public final QueryLanguageParser.boolean_exp_cont_return boolean_exp_cont() throws RecognitionException {
        QueryLanguageParser.boolean_exp_cont_return retval = new QueryLanguageParser.boolean_exp_cont_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.logical_op_return logical_op238 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp239 =null;


        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_logical_op=new RewriteRuleSubtreeStream(adaptor,"rule logical_op");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:217:2: ( logical_op boolean_exp -> logical_op ^( BOOL_EXP boolean_exp ) | -> EPSILON )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==AND||LA29_0==OR) ) {
                alt29=1;
            }
            else if ( (LA29_0==EOF||LA29_0==DEPTH||LA29_0==EPSILON||LA29_0==FOREACH||(LA29_0 >= ID && LA29_0 <= IF)||LA29_0==INTEGER||LA29_0==LEFT_BRACKET||LA29_0==LEFT_SQ_BRACKET||LA29_0==LT||(LA29_0 >= MAX && LA29_0 <= MIN)||LA29_0==PRINT||(LA29_0 >= RESERVED_TYPES && LA29_0 <= RIGHT_PAREN)||LA29_0==SELECT||(LA29_0 >= SEMICOLON && LA29_0 <= SET)||LA29_0==STRING) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:217:4: logical_op boolean_exp
                    {
                    pushFollow(FOLLOW_logical_op_in_boolean_exp_cont2285);
                    logical_op238=logical_op();

                    state._fsp--;

                    stream_logical_op.add(logical_op238.getTree());

                    pushFollow(FOLLOW_boolean_exp_in_boolean_exp_cont2287);
                    boolean_exp239=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp239.getTree());

                    // AST REWRITE
                    // elements: logical_op, boolean_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:28: -> logical_op ^( BOOL_EXP boolean_exp )
                    {
                        adaptor.addChild(root_0, stream_logical_op.nextTree());

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:217:42: ^( BOOL_EXP boolean_exp )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:218:4: 
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
                    // 218:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:221:1: binary_op : ( PLUS variable -> PLUS ^( VAR variable ) | MINUS variable -> MINUS ^( VAR variable ) | DIVIDE variable -> DIVIDE ^( VAR variable ) | -> EPSILON );
    public final QueryLanguageParser.binary_op_return binary_op() throws RecognitionException {
        QueryLanguageParser.binary_op_return retval = new QueryLanguageParser.binary_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS240=null;
        Token MINUS242=null;
        Token DIVIDE244=null;
        QueryLanguageParser.variable_return variable241 =null;

        QueryLanguageParser.variable_return variable243 =null;

        QueryLanguageParser.variable_return variable245 =null;


        Object PLUS240_tree=null;
        Object MINUS242_tree=null;
        Object DIVIDE244_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:222:2: ( PLUS variable -> PLUS ^( VAR variable ) | MINUS variable -> MINUS ^( VAR variable ) | DIVIDE variable -> DIVIDE ^( VAR variable ) | -> EPSILON )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:222:4: PLUS variable
                    {
                    PLUS240=(Token)match(input,PLUS,FOLLOW_PLUS_in_binary_op2316);  
                    stream_PLUS.add(PLUS240);


                    pushFollow(FOLLOW_variable_in_binary_op2318);
                    variable241=variable();

                    state._fsp--;

                    stream_variable.add(variable241.getTree());

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
                    // 222:20: -> PLUS ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_PLUS.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:222:28: ^( VAR variable )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:223:4: MINUS variable
                    {
                    MINUS242=(Token)match(input,MINUS,FOLLOW_MINUS_in_binary_op2335);  
                    stream_MINUS.add(MINUS242);


                    pushFollow(FOLLOW_variable_in_binary_op2337);
                    variable243=variable();

                    state._fsp--;

                    stream_variable.add(variable243.getTree());

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
                    // 223:21: -> MINUS ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_MINUS.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:223:30: ^( VAR variable )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:224:4: DIVIDE variable
                    {
                    DIVIDE244=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_binary_op2354);  
                    stream_DIVIDE.add(DIVIDE244);


                    pushFollow(FOLLOW_variable_in_binary_op2356);
                    variable245=variable();

                    state._fsp--;

                    stream_variable.add(variable245.getTree());

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
                    // 224:22: -> DIVIDE ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_DIVIDE.nextNode()
                        );

                        // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:224:32: ^( VAR variable )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:225:4: 
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
                    // 225:4: -> EPSILON
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:227:1: boolean_op : ( GT -> GT | GTE -> GTE | LT -> LT | LTE -> LTE | NOT_EQUAL -> NOT_EQUAL | LOGIC_EQUALS -> LOGIC_EQUALS );
    public final QueryLanguageParser.boolean_op_return boolean_op() throws RecognitionException {
        QueryLanguageParser.boolean_op_return retval = new QueryLanguageParser.boolean_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GT246=null;
        Token GTE247=null;
        Token LT248=null;
        Token LTE249=null;
        Token NOT_EQUAL250=null;
        Token LOGIC_EQUALS251=null;

        Object GT246_tree=null;
        Object GTE247_tree=null;
        Object LT248_tree=null;
        Object LTE249_tree=null;
        Object NOT_EQUAL250_tree=null;
        Object LOGIC_EQUALS251_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_LOGIC_EQUALS=new RewriteRuleTokenStream(adaptor,"token LOGIC_EQUALS");
        RewriteRuleTokenStream stream_NOT_EQUAL=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL");
        RewriteRuleTokenStream stream_LTE=new RewriteRuleTokenStream(adaptor,"token LTE");
        RewriteRuleTokenStream stream_GTE=new RewriteRuleTokenStream(adaptor,"token GTE");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:228:2: ( GT -> GT | GTE -> GTE | LT -> LT | LTE -> LTE | NOT_EQUAL -> NOT_EQUAL | LOGIC_EQUALS -> LOGIC_EQUALS )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:228:4: GT
                    {
                    GT246=(Token)match(input,GT,FOLLOW_GT_in_boolean_op2385);  
                    stream_GT.add(GT246);


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
                    // 228:8: -> GT
                    {
                        adaptor.addChild(root_0, 
                        stream_GT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:229:4: GTE
                    {
                    GTE247=(Token)match(input,GTE,FOLLOW_GTE_in_boolean_op2395);  
                    stream_GTE.add(GTE247);


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
                    // 229:9: -> GTE
                    {
                        adaptor.addChild(root_0, 
                        stream_GTE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:230:4: LT
                    {
                    LT248=(Token)match(input,LT,FOLLOW_LT_in_boolean_op2405);  
                    stream_LT.add(LT248);


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
                    // 230:8: -> LT
                    {
                        adaptor.addChild(root_0, 
                        stream_LT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:231:4: LTE
                    {
                    LTE249=(Token)match(input,LTE,FOLLOW_LTE_in_boolean_op2415);  
                    stream_LTE.add(LTE249);


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
                    // 231:9: -> LTE
                    {
                        adaptor.addChild(root_0, 
                        stream_LTE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:232:4: NOT_EQUAL
                    {
                    NOT_EQUAL250=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolean_op2425);  
                    stream_NOT_EQUAL.add(NOT_EQUAL250);


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
                    // 232:14: -> NOT_EQUAL
                    {
                        adaptor.addChild(root_0, 
                        stream_NOT_EQUAL.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:233:4: LOGIC_EQUALS
                    {
                    LOGIC_EQUALS251=(Token)match(input,LOGIC_EQUALS,FOLLOW_LOGIC_EQUALS_in_boolean_op2434);  
                    stream_LOGIC_EQUALS.add(LOGIC_EQUALS251);


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
                    // 233:17: -> LOGIC_EQUALS
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
    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:235:1: logical_op : ( AND -> AND | OR -> OR );
    public final QueryLanguageParser.logical_op_return logical_op() throws RecognitionException {
        QueryLanguageParser.logical_op_return retval = new QueryLanguageParser.logical_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND252=null;
        Token OR253=null;

        Object AND252_tree=null;
        Object OR253_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");

        try {
            // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:236:2: ( AND -> AND | OR -> OR )
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
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:236:4: AND
                    {
                    AND252=(Token)match(input,AND,FOLLOW_AND_in_logical_op2448);  
                    stream_AND.add(AND252);


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
                    // 236:9: -> AND
                    {
                        adaptor.addChild(root_0, 
                        stream_AND.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\git\\code-arch-13\\Windows\\Senior-Design\\src\\query\\QueryLanguage.g:237:4: OR
                    {
                    OR253=(Token)match(input,OR,FOLLOW_OR_in_logical_op2458);  
                    stream_OR.add(OR253);


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
                    // 237:8: -> OR
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
    public static final BitSet FOLLOW_blockquery_in_queries301 = new BitSet(new long[]{0x0000400810200002L,0x0000000000004000L});
    public static final BitSet FOLLOW_stat_statements_in_blockquery313 = new BitSet(new long[]{0x0000000810200000L,0x0000000000004000L});
    public static final BitSet FOLLOW_query_in_blockquery315 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_stat_statements_in_blockquery317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query353 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_foreach_query_in_query355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_print_stmt_in_query357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_select_query_in_query390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_print_stmt_in_query392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query423 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_query425 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FILTER_in_query427 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_query429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_print_stmt_in_query431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EPSILON_in_query472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_query_name484 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_query_name486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_in_foreach_query508 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_foreach_query510 = new BitSet(new long[]{0x0009400800000000L});
    public static final BitSet FOLLOW_node_chain_in_foreach_query512 = new BitSet(new long[]{0x0000004800000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_foreach_query514 = new BitSet(new long[]{0x0000004000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_in_clause_in_foreach_query517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_foreach_query519 = new BitSet(new long[]{0x0000400000000000L,0x0000000140000000L});
    public static final BitSet FOLLOW_with_clause_in_foreach_query521 = new BitSet(new long[]{0x0000400000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_foreach_where_in_foreach_query523 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_stat_statements_in_foreach_query525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_foreach_where566 = new BitSet(new long[]{0x4069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_boolean_exp_in_foreach_where568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_query594 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_select_query596 = new BitSet(new long[]{0x0009400800000000L});
    public static final BitSet FOLLOW_node_chain_in_select_query598 = new BitSet(new long[]{0x0000404800000000L,0x0000000000101200L});
    public static final BitSet FOLLOW_ID_in_select_query600 = new BitSet(new long[]{0x0000404000000000L,0x0000000000101200L});
    public static final BitSet FOLLOW_node_chain_op_in_select_query603 = new BitSet(new long[]{0x0000404000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_select_query605 = new BitSet(new long[]{0x0000004000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_in_clause_in_select_query607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_select_query609 = new BitSet(new long[]{0x0000400000000000L,0x0000000140000000L});
    public static final BitSet FOLLOW_with_clause_in_select_query611 = new BitSet(new long[]{0x0000400000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_select_where_in_select_query613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_select_where661 = new BitSet(new long[]{0x4069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_boolean_exp_in_select_where663 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_stat_statements_in_select_where665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_statements_in_select_where688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_in_clause710 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_in_clause712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_with_clause734 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_in_with_clause736 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AS_in_with_clause738 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_with_clause740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_node_chain_op775 = new BitSet(new long[]{0x0009400800000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain_op777 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ID_in_node_chain_op779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATER_in_node_chain_op800 = new BitSet(new long[]{0x0009400800000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain_op802 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ID_in_node_chain_op804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain840 = new BitSet(new long[]{0x0009400800000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain865 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_node_chain867 = new BitSet(new long[]{0x0000000000002100L,0x0000000000000004L});
    public static final BitSet FOLLOW_attr_in_node_chain869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_node_chain921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain923 = new BitSet(new long[]{0x0009400800000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_node_chain961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_keywords_in_node_chain995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_node_chain1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain1020 = new BitSet(new long[]{0x0009400800000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_node_chain1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_node1068 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_NODE_TYPE_in_node1070 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_GT_in_node1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQ_BRACKET_in_node1082 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_node1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RIGHT_SQ_BRACKET_in_node1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_ast_child1104 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_ast_child1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_ast_child1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1122 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CONTAINS_in_keywords1124 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1126 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1144 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ISPARENT_in_keywords1146 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1148 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1165 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ISNODETYPE_in_keywords1167 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1169 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1186 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IS_in_keywords1188 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1190 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords1209 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_HAS_in_keywords1211 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords1213 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_keyword_nodes1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_keyword_nodes1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_op_in_keyword_nodes1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ast_child_in_keyword_nodes1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_attr1293 = new BitSet(new long[]{0x0000000000002100L,0x0000000000000004L});
    public static final BitSet FOLLOW_attr_in_attr1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1314 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CONTAINS_in_attr1316 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1318 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1336 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ISPARENT_in_attr1338 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1340 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1358 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ISNODETYPE_in_attr1360 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1362 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1380 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IS_in_attr1382 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1384 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1403 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_HAS_in_attr1405 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1407 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTES_in_attr1425 = new BitSet(new long[]{0x0000000000002100L,0x0000000000000004L});
    public static final BitSet FOLLOW_attr_in_attr1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PERIOD_in_property1482 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CONTAINS_in_property1484 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1486 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_property1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PERIOD_in_property1511 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ISPARENT_in_property1513 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1515 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_property1517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PERIOD_in_property1540 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ISNODETYPE_in_property1542 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1544 = new BitSet(new long[]{0x0009400800000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_nodes_in_property1546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable1575 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_variable1577 = new BitSet(new long[]{0x0000000000002100L,0x0000000000000004L});
    public static final BitSet FOLLOW_attr_in_variable1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_chain_in_variable1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_variable1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_variable1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESERVED_TYPES_in_variable1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_variable1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_function1710 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1712 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_in_function1714 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_function1716 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_in_function1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_function1735 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1737 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_in_function1739 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_function1741 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_in_function1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEPTH_in_function1766 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function1768 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_in_function1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_block1792 = new BitSet(new long[]{0x0009400800000000L,0x0000000000100A00L});
    public static final BitSet FOLLOW_block_statements_in_block1794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_block1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_block_statements1821 = new BitSet(new long[]{0x0009400800000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATER_in_block_statements1839 = new BitSet(new long[]{0x0009400800000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_chain_in_block_statements1856 = new BitSet(new long[]{0x0009400800000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_block_in_block_statements1858 = new BitSet(new long[]{0x0009400800000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt1896 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_stmt_in_print_stmt1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print_stmt1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_stat_statements1922 = new BitSet(new long[]{0x0069421810240000L,0x0000000000824C00L});
    public static final BitSet FOLLOW_statements_in_stat_statements1924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_stat_statements1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_assn_in_statements1949 = new BitSet(new long[]{0x0069421810240000L,0x0000000000824400L});
    public static final BitSet FOLLOW_statements_in_statements1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statements1966 = new BitSet(new long[]{0x0069421810240000L,0x0000000000824400L});
    public static final BitSet FOLLOW_statements_in_statements1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_statements1984 = new BitSet(new long[]{0x0069421810240000L,0x0000000000824400L});
    public static final BitSet FOLLOW_statements_in_statements1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_statements2002 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_assn_in_statements2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_WHERE_in_statements2006 = new BitSet(new long[]{0x4069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_boolean_exp_in_statements2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMICOLON_in_statements2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_stmt2039 = new BitSet(new long[]{0x0080000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_binary_op_in_variable_stmt2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_assn2073 = new BitSet(new long[]{0x0000010000408000L});
    public static final BitSet FOLLOW_variable_assn_right_in_variable_assn2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_variable_assn_right2095 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_stmt_in_variable_assn_right2097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPOUND_ADD_in_variable_assn_right2113 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_stmt_in_variable_assn_right2115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCREMENT_in_variable_assn_right2130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement2148 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_if_statement2150 = new BitSet(new long[]{0x4069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_boolean_exp_in_if_statement2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_if_statement2154 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_if_statement2156 = new BitSet(new long[]{0x0069421810240000L,0x0000000000824C00L});
    public static final BitSet FOLLOW_statements_in_if_statement2158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_if_statement2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_boolean_stmt2189 = new BitSet(new long[]{0x801A000180000000L});
    public static final BitSet FOLLOW_boolean_right_in_boolean_stmt2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_op_in_boolean_right2212 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_in_boolean_right2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_stmt_in_boolean_exp2241 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_exp_cont_in_boolean_exp2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_boolean_exp2258 = new BitSet(new long[]{0x4069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_boolean_exp_in_boolean_exp2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_op_in_boolean_exp_cont2285 = new BitSet(new long[]{0x4069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_boolean_exp_in_boolean_exp_cont2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_binary_op2316 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_in_binary_op2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_binary_op2335 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_in_binary_op2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_binary_op2354 = new BitSet(new long[]{0x0069420800040000L,0x0000000000800400L});
    public static final BitSet FOLLOW_variable_in_binary_op2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_boolean_op2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_boolean_op2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_boolean_op2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_boolean_op2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolean_op2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGIC_EQUALS_in_boolean_op2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_logical_op2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_op2458 = new BitSet(new long[]{0x0000000000000002L});

}