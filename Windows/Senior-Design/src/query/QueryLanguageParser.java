// $ANTLR 3.4 C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g 2013-05-01 17:13:00
package query;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryLanguageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AS", "ATTRIBUTE", "ATTRIBUTES", "BIN_OP", "BLOCK_STATEMENTS", "BOOL_EXP", "CHAIN_ID", "COLON", "COMMA", "COMPOUND_ADD", "COMP_ADD", "CONTAINS", "DIVIDE", "EPSILON", "EQUALS", "ESC_SEQ", "EXPONENT", "FILTER", "FILTER_QUERY", "FLOAT", "FOREACH", "FOR_QUERY", "GT", "GTE", "HAS", "HEX_DIGIT", "ID", "IF", "IF_STATEMENT", "IN", "INCR", "INCREMENT", "INTEGER", "IN_CLAUSE", "IS", "LEFT_BRACKET", "LEFT_PAREN", "LEFT_SQ_BRACKET", "LOGIC_EQUALS", "LOGIC_OP", "LT", "LTE", "MAX", "MINUS", "NESTED", "NODE", "NODE_CHAIN", "NODE_NAME", "NODE_TYPE", "NOT", "NOT_EQUAL", "OCTAL_ESC", "OR", "PERIOD", "PLUS", "PRINT", "PROPERTY", "QUERIES", "QUERY", "QUERY_NAME", "REPEATER", "RESERVED_TYPES", "RIGHT_BRACKET", "RIGHT_PAREN", "RIGHT_SQ_BRACKET", "SELECT", "SELECT_QUERY", "SEMICOLON", "SET", "SET_TABLE", "SPACE", "STAR", "STATEMENT", "STATEMENTS", "TABLE", "UNICODE_ESC", "VAR", "VAR_ASSIGN", "VAR_NAME", "VAR_STMT", "WHERE", "WHERE_BLOCK", "WITH", "WITH_CLAUSE"
    };

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
    public String getGrammarFileName() { return "C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g"; }


    public static class startrule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "startrule"
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:42:1: startrule : queries -> ^( QUERIES queries ) ;
    public final QueryLanguageParser.startrule_return startrule() throws RecognitionException {
        QueryLanguageParser.startrule_return retval = new QueryLanguageParser.startrule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.queries_return queries1 =null;


        RewriteRuleSubtreeStream stream_queries=new RewriteRuleSubtreeStream(adaptor,"rule queries");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:43:2: ( queries -> ^( QUERIES queries ) )
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:43:4: queries
            {
            pushFollow(FOLLOW_queries_in_startrule262);
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
            // 43:12: -> ^( QUERIES queries )
            {
                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:43:15: ^( QUERIES queries )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:46:1: queries : query ( query )* ;
    public final QueryLanguageParser.queries_return queries() throws RecognitionException {
        QueryLanguageParser.queries_return retval = new QueryLanguageParser.queries_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.query_return query2 =null;

        QueryLanguageParser.query_return query3 =null;



        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:46:9: ( query ( query )* )
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:46:11: query ( query )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_query_in_queries280);
            query2=query();

            state._fsp--;

            adaptor.addChild(root_0, query2.getTree());

            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:46:17: ( query )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FOREACH||LA1_0==ID||LA1_0==SELECT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:46:17: query
            	    {
            	    pushFollow(FOLLOW_query_in_queries282);
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:49:1: query : ( query_name foreach_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) ) | query_name select_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) ) | query_name ID FILTER ID print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) ) );
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
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:49:7: ( query_name foreach_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) ) | query_name select_query print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) ) | query_name ID FILTER ID print_stmt -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) ) )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:49:9: query_name foreach_query print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query293);
                    query_name4=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name4.getTree());

                    pushFollow(FOLLOW_foreach_query_in_query295);
                    foreach_query5=foreach_query();

                    state._fsp--;

                    stream_foreach_query.add(foreach_query5.getTree());

                    pushFollow(FOLLOW_print_stmt_in_query297);
                    print_stmt6=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt6.getTree());

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
                    // 49:45: -> ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:49:48: ^( QUERY ^( QUERY_NAME query_name ) ^( FOR_QUERY foreach_query ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:49:56: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:49:81: ^( FOR_QUERY foreach_query )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_QUERY, "FOR_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, stream_foreach_query.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:49:108: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:49:116: ( print_stmt )?
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:50:4: query_name select_query print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query328);
                    query_name7=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name7.getTree());

                    pushFollow(FOLLOW_select_query_in_query330);
                    select_query8=select_query();

                    state._fsp--;

                    stream_select_query.add(select_query8.getTree());

                    pushFollow(FOLLOW_print_stmt_in_query332);
                    print_stmt9=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt9.getTree());

                    // AST REWRITE
                    // elements: select_query, query_name, print_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:39: -> ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:50:42: ^( QUERY ^( QUERY_NAME query_name ) ^( SELECT_QUERY select_query ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:50:50: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:50:75: ^( SELECT_QUERY select_query )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SELECT_QUERY, "SELECT_QUERY")
                        , root_2);

                        adaptor.addChild(root_2, stream_select_query.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:50:104: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:50:112: ( print_stmt )?
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:51:4: query_name ID FILTER ID print_stmt
                    {
                    pushFollow(FOLLOW_query_name_in_query363);
                    query_name10=query_name();

                    state._fsp--;

                    stream_query_name.add(query_name10.getTree());

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_query365);  
                    stream_ID.add(ID11);


                    FILTER12=(Token)match(input,FILTER,FOLLOW_FILTER_in_query367);  
                    stream_FILTER.add(FILTER12);


                    ID13=(Token)match(input,ID,FOLLOW_ID_in_query369);  
                    stream_ID.add(ID13);


                    pushFollow(FOLLOW_print_stmt_in_query371);
                    print_stmt14=print_stmt();

                    state._fsp--;

                    stream_print_stmt.add(print_stmt14.getTree());

                    // AST REWRITE
                    // elements: query_name, FILTER, ID, print_stmt, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 51:39: -> ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:51:42: ^( QUERY ^( QUERY_NAME query_name ) ^( FILTER_QUERY ID FILTER ID ) ^( PRINT ( print_stmt )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:51:50: ^( QUERY_NAME query_name )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_query_name.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:51:75: ^( FILTER_QUERY ID FILTER ID )
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

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:51:104: ^( PRINT ( print_stmt )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PRINT, "PRINT")
                        , root_2);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:51:112: ( print_stmt )?
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:54:1: query_name : ( ID COLON -> ID | -> EPSILON );
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
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:55:2: ( ID COLON -> ID | -> EPSILON )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:55:4: ID COLON
                    {
                    ID15=(Token)match(input,ID,FOLLOW_ID_in_query_name413);  
                    stream_ID.add(ID15);


                    COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_query_name415);  
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
                    // 55:13: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:56:4: 
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
                    // 56:4: -> EPSILON
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:59:1: foreach_query : FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements ) ;
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
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:60:2: ( FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements ) )
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:60:4: FOREACH LEFT_PAREN node_chain ( ID )? in_clause RIGHT_PAREN with_clause foreach_where stat_statements
            {
            FOREACH17=(Token)match(input,FOREACH,FOLLOW_FOREACH_in_foreach_query437);  
            stream_FOREACH.add(FOREACH17);


            LEFT_PAREN18=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_foreach_query439);  
            stream_LEFT_PAREN.add(LEFT_PAREN18);


            pushFollow(FOLLOW_node_chain_in_foreach_query441);
            node_chain19=node_chain();

            state._fsp--;

            stream_node_chain.add(node_chain19.getTree());

            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:60:34: ( ID )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:60:34: ID
                    {
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_foreach_query443);  
                    stream_ID.add(ID20);


                    }
                    break;

            }


            pushFollow(FOLLOW_in_clause_in_foreach_query446);
            in_clause21=in_clause();

            state._fsp--;

            stream_in_clause.add(in_clause21.getTree());

            RIGHT_PAREN22=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_foreach_query448);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN22);


            pushFollow(FOLLOW_with_clause_in_foreach_query450);
            with_clause23=with_clause();

            state._fsp--;

            stream_with_clause.add(with_clause23.getTree());

            pushFollow(FOLLOW_foreach_where_in_foreach_query452);
            foreach_where24=foreach_where();

            state._fsp--;

            stream_foreach_where.add(foreach_where24.getTree());

            pushFollow(FOLLOW_stat_statements_in_foreach_query454);
            stat_statements25=stat_statements();

            state._fsp--;

            stream_stat_statements.add(stat_statements25.getTree());

            // AST REWRITE
            // elements: in_clause, stat_statements, node_chain, with_clause, foreach_where, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:102: -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) with_clause foreach_where ^( STATEMENTS stat_statements )
            {
                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:60:105: ^( NODE_CHAIN node_chain )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:60:130: ^( CHAIN_ID ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                , root_1);

                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:60:141: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:60:146: ^( IN_CLAUSE in_clause )
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

                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:60:195: ^( STATEMENTS stat_statements )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:62:1: foreach_where : ( WHERE boolean_exp -> ^( WHERE_BLOCK boolean_exp ) | -> WHERE_BLOCK );
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
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:63:2: ( WHERE boolean_exp -> ^( WHERE_BLOCK boolean_exp ) | -> WHERE_BLOCK )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WHERE) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==FOREACH||(LA5_0 >= ID && LA5_0 <= IF)||LA5_0==INTEGER||LA5_0==LEFT_BRACKET||LA5_0==LEFT_SQ_BRACKET||LA5_0==LT||LA5_0==PRINT||(LA5_0 >= RESERVED_TYPES && LA5_0 <= RIGHT_BRACKET)||LA5_0==SELECT||LA5_0==SET) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:63:4: WHERE boolean_exp
                    {
                    WHERE26=(Token)match(input,WHERE,FOLLOW_WHERE_in_foreach_where495);  
                    stream_WHERE.add(WHERE26);


                    pushFollow(FOLLOW_boolean_exp_in_foreach_where497);
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
                    // 63:22: -> ^( WHERE_BLOCK boolean_exp )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:63:25: ^( WHERE_BLOCK boolean_exp )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:64:4: 
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
                    // 64:4: -> WHERE_BLOCK
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:67:1: select_query : SELECT LEFT_PAREN node_chain block ( ID )? in_clause RIGHT_PAREN with_clause select_where -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where ;
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
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:68:2: ( SELECT LEFT_PAREN node_chain block ( ID )? in_clause RIGHT_PAREN with_clause select_where -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where )
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:68:4: SELECT LEFT_PAREN node_chain block ( ID )? in_clause RIGHT_PAREN with_clause select_where
            {
            SELECT28=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_query523);  
            stream_SELECT.add(SELECT28);


            LEFT_PAREN29=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_select_query525);  
            stream_LEFT_PAREN.add(LEFT_PAREN29);


            pushFollow(FOLLOW_node_chain_in_select_query527);
            node_chain30=node_chain();

            state._fsp--;

            stream_node_chain.add(node_chain30.getTree());

            pushFollow(FOLLOW_block_in_select_query529);
            block31=block();

            state._fsp--;

            stream_block.add(block31.getTree());

            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:68:39: ( ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:68:39: ID
                    {
                    ID32=(Token)match(input,ID,FOLLOW_ID_in_select_query531);  
                    stream_ID.add(ID32);


                    }
                    break;

            }


            pushFollow(FOLLOW_in_clause_in_select_query534);
            in_clause33=in_clause();

            state._fsp--;

            stream_in_clause.add(in_clause33.getTree());

            RIGHT_PAREN34=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_select_query536);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN34);


            pushFollow(FOLLOW_with_clause_in_select_query538);
            with_clause35=with_clause();

            state._fsp--;

            stream_with_clause.add(with_clause35.getTree());

            pushFollow(FOLLOW_select_where_in_select_query540);
            select_where36=select_where();

            state._fsp--;

            stream_select_where.add(select_where36.getTree());

            // AST REWRITE
            // elements: node_chain, select_where, with_clause, in_clause, block, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:90: -> ^( NODE_CHAIN node_chain ) ^( CHAIN_ID ( ID )? ) ^( IN_CLAUSE in_clause ) ^( BLOCK_STATEMENTS block ) with_clause select_where
            {
                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:68:93: ^( NODE_CHAIN node_chain )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NODE_CHAIN, "NODE_CHAIN")
                , root_1);

                adaptor.addChild(root_1, stream_node_chain.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:68:118: ^( CHAIN_ID ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHAIN_ID, "CHAIN_ID")
                , root_1);

                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:68:129: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:68:134: ^( IN_CLAUSE in_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IN_CLAUSE, "IN_CLAUSE")
                , root_1);

                adaptor.addChild(root_1, stream_in_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:68:157: ^( BLOCK_STATEMENTS block )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:70:1: select_where : ( WHERE boolean_exp stat_statements -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) ) | -> WHERE_BLOCK );
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
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:71:2: ( WHERE boolean_exp stat_statements -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) ) | -> WHERE_BLOCK )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WHERE) ) {
                alt7=1;
            }
            else if ( (LA7_0==EOF||LA7_0==FOREACH||(LA7_0 >= ID && LA7_0 <= IF)||LA7_0==INTEGER||LA7_0==LEFT_SQ_BRACKET||LA7_0==LT||LA7_0==PRINT||(LA7_0 >= RESERVED_TYPES && LA7_0 <= RIGHT_BRACKET)||LA7_0==SELECT||LA7_0==SET) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:71:4: WHERE boolean_exp stat_statements
                    {
                    WHERE37=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_where581);  
                    stream_WHERE.add(WHERE37);


                    pushFollow(FOLLOW_boolean_exp_in_select_where583);
                    boolean_exp38=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp38.getTree());

                    pushFollow(FOLLOW_stat_statements_in_select_where585);
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
                    // 71:38: -> ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:71:41: ^( WHERE_BLOCK ^( BOOL_EXP boolean_exp ) ^( STATEMENTS stat_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHERE_BLOCK, "WHERE_BLOCK")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:71:55: ^( BOOL_EXP boolean_exp )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                        , root_2);

                        adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:71:79: ^( STATEMENTS stat_statements )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:72:4: 
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
    // $ANTLR end "select_where"


    public static class in_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "in_clause"
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:74:1: in_clause : ( IN ID -> ID | -> EPSILON );
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
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:75:2: ( IN ID -> ID | -> EPSILON )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:75:4: IN ID
                    {
                    IN40=(Token)match(input,IN,FOLLOW_IN_in_in_clause620);  
                    stream_IN.add(IN40);


                    ID41=(Token)match(input,ID,FOLLOW_ID_in_in_clause622);  
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
                    // 75:10: -> ID
                    {
                        adaptor.addChild(root_0, 
                        stream_ID.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:76:4: 
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
                    // 76:4: -> EPSILON
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:78:1: with_clause : ( WITH variable AS ID -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) ) | -> WITH_CLAUSE );
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
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:79:2: ( WITH variable AS ID -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) ) | -> WITH_CLAUSE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WITH) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||LA9_0==FOREACH||(LA9_0 >= ID && LA9_0 <= IF)||LA9_0==INTEGER||LA9_0==LEFT_BRACKET||LA9_0==LEFT_SQ_BRACKET||LA9_0==LT||LA9_0==PRINT||(LA9_0 >= RESERVED_TYPES && LA9_0 <= RIGHT_BRACKET)||LA9_0==SELECT||LA9_0==SET||LA9_0==WHERE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:79:4: WITH variable AS ID
                    {
                    WITH42=(Token)match(input,WITH,FOLLOW_WITH_in_with_clause644);  
                    stream_WITH.add(WITH42);


                    pushFollow(FOLLOW_variable_in_with_clause646);
                    variable43=variable();

                    state._fsp--;

                    stream_variable.add(variable43.getTree());

                    AS44=(Token)match(input,AS,FOLLOW_AS_in_with_clause648);  
                    stream_AS.add(AS44);


                    ID45=(Token)match(input,ID,FOLLOW_ID_in_with_clause650);  
                    stream_ID.add(ID45);


                    // AST REWRITE
                    // elements: variable, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:24: -> ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:79:27: ^( WITH_CLAUSE ^( VAR variable ) ^( CHAIN_ID ID ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WITH_CLAUSE, "WITH_CLAUSE")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:79:41: ^( VAR variable )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_2);

                        adaptor.addChild(root_2, stream_variable.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:79:57: ^( CHAIN_ID ID )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:80:4: 
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
                    // 80:4: -> WITH_CLAUSE
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:82:1: node_chain : ( node PERIOD node_chain -> ^( NODE ^( NODE_NAME node ) node_chain ) | node COLON attr -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) ) | node -> ^( NODE ^( NODE_NAME node ) ) | node keywords -> ^( NODE ^( NODE_NAME node ) keywords ) | ID PERIOD node_chain -> ^( VAR_NAME ID ^( node_chain ) ) | property -> ^( PROPERTY property ) );
    public final QueryLanguageParser.node_chain_return node_chain() throws RecognitionException {
        QueryLanguageParser.node_chain_return retval = new QueryLanguageParser.node_chain_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD47=null;
        Token COLON50=null;
        Token ID55=null;
        Token PERIOD56=null;
        QueryLanguageParser.node_return node46 =null;

        QueryLanguageParser.node_chain_return node_chain48 =null;

        QueryLanguageParser.node_return node49 =null;

        QueryLanguageParser.attr_return attr51 =null;

        QueryLanguageParser.node_return node52 =null;

        QueryLanguageParser.node_return node53 =null;

        QueryLanguageParser.keywords_return keywords54 =null;

        QueryLanguageParser.node_chain_return node_chain57 =null;

        QueryLanguageParser.property_return property58 =null;


        Object PERIOD47_tree=null;
        Object COLON50_tree=null;
        Object ID55_tree=null;
        Object PERIOD56_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_node=new RewriteRuleSubtreeStream(adaptor,"rule node");
        RewriteRuleSubtreeStream stream_keywords=new RewriteRuleSubtreeStream(adaptor,"rule keywords");
        RewriteRuleSubtreeStream stream_property=new RewriteRuleSubtreeStream(adaptor,"rule property");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:83:2: ( node PERIOD node_chain -> ^( NODE ^( NODE_NAME node ) node_chain ) | node COLON attr -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) ) | node -> ^( NODE ^( NODE_NAME node ) ) | node keywords -> ^( NODE ^( NODE_NAME node ) keywords ) | ID PERIOD node_chain -> ^( VAR_NAME ID ^( node_chain ) ) | property -> ^( PROPERTY property ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case LT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==NODE_TYPE) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==GT) ) {
                        switch ( input.LA(4) ) {
                        case PERIOD:
                            {
                            int LA10_11 = input.LA(5);

                            if ( (LA10_11==CONTAINS||LA10_11==HAS||LA10_11==IS) ) {
                                alt10=4;
                            }
                            else if ( (LA10_11==ID||LA10_11==LEFT_SQ_BRACKET||LA10_11==LT) ) {
                                alt10=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 11, input);

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
                            {
                            alt10=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 8, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

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
                    int LA10_5 = input.LA(3);

                    if ( (LA10_5==RIGHT_SQ_BRACKET) ) {
                        switch ( input.LA(4) ) {
                        case PERIOD:
                            {
                            int LA10_11 = input.LA(5);

                            if ( (LA10_11==CONTAINS||LA10_11==HAS||LA10_11==IS) ) {
                                alt10=4;
                            }
                            else if ( (LA10_11==ID||LA10_11==LEFT_SQ_BRACKET||LA10_11==LT) ) {
                                alt10=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 11, input);

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
                            {
                            alt10=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 9, input);

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
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==PERIOD) ) {
                    int LA10_6 = input.LA(3);

                    if ( (LA10_6==CONTAINS) ) {
                        alt10=6;
                    }
                    else if ( (LA10_6==ID||LA10_6==LEFT_SQ_BRACKET||LA10_6==LT) ) {
                        alt10=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 6, input);

                        throw nvae;

                    }
                }
                else if ( (LA10_3==EOF||(LA10_3 >= AND && LA10_3 <= AS)||(LA10_3 >= COMMA && LA10_3 <= COMPOUND_ADD)||LA10_3==DIVIDE||LA10_3==EQUALS||LA10_3==FOREACH||(LA10_3 >= GT && LA10_3 <= GTE)||(LA10_3 >= ID && LA10_3 <= IF)||LA10_3==IN||(LA10_3 >= INCREMENT && LA10_3 <= INTEGER)||LA10_3==LEFT_BRACKET||(LA10_3 >= LEFT_SQ_BRACKET && LA10_3 <= LOGIC_EQUALS)||(LA10_3 >= LT && LA10_3 <= LTE)||LA10_3==MINUS||LA10_3==NOT_EQUAL||LA10_3==OR||(LA10_3 >= PLUS && LA10_3 <= PRINT)||(LA10_3 >= REPEATER && LA10_3 <= RIGHT_PAREN)||LA10_3==SELECT||(LA10_3 >= SEMICOLON && LA10_3 <= SET)||LA10_3==STAR) ) {
                    alt10=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:83:4: node PERIOD node_chain
                    {
                    pushFollow(FOLLOW_node_in_node_chain685);
                    node46=node();

                    state._fsp--;

                    stream_node.add(node46.getTree());

                    PERIOD47=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain687);  
                    stream_PERIOD.add(PERIOD47);


                    pushFollow(FOLLOW_node_chain_in_node_chain689);
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
                    // 83:31: -> ^( NODE ^( NODE_NAME node ) node_chain )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:83:34: ^( NODE ^( NODE_NAME node ) node_chain )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:83:41: ^( NODE_NAME node )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_node.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_node_chain.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:84:4: node COLON attr
                    {
                    pushFollow(FOLLOW_node_in_node_chain712);
                    node49=node();

                    state._fsp--;

                    stream_node.add(node49.getTree());

                    COLON50=(Token)match(input,COLON,FOLLOW_COLON_in_node_chain714);  
                    stream_COLON.add(COLON50);


                    pushFollow(FOLLOW_attr_in_node_chain716);
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
                    // 84:24: -> ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:84:27: ^( NODE ^( NODE_NAME node ) ^( ATTRIBUTE attr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:84:34: ^( NODE_NAME node )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE_NAME, "NODE_NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_node.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:84:52: ^( ATTRIBUTE attr )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:85:4: node
                    {
                    pushFollow(FOLLOW_node_in_node_chain743);
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
                    // 85:15: -> ^( NODE ^( NODE_NAME node ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:85:18: ^( NODE ^( NODE_NAME node ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:85:25: ^( NODE_NAME node )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:86:4: node keywords
                    {
                    pushFollow(FOLLOW_node_in_node_chain766);
                    node53=node();

                    state._fsp--;

                    stream_node.add(node53.getTree());

                    pushFollow(FOLLOW_keywords_in_node_chain768);
                    keywords54=keywords();

                    state._fsp--;

                    stream_keywords.add(keywords54.getTree());

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
                    // 86:22: -> ^( NODE ^( NODE_NAME node ) keywords )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:86:25: ^( NODE ^( NODE_NAME node ) keywords )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NODE, "NODE")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:86:32: ^( NODE_NAME node )
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
                case 5 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:87:4: ID PERIOD node_chain
                    {
                    ID55=(Token)match(input,ID,FOLLOW_ID_in_node_chain791);  
                    stream_ID.add(ID55);


                    PERIOD56=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_node_chain793);  
                    stream_PERIOD.add(PERIOD56);


                    pushFollow(FOLLOW_node_chain_in_node_chain795);
                    node_chain57=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain57.getTree());

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
                    // 87:29: -> ^( VAR_NAME ID ^( node_chain ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:87:32: ^( VAR_NAME ID ^( node_chain ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:87:46: ^( node_chain )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_node_chain.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:88:4: property
                    {
                    pushFollow(FOLLOW_property_in_node_chain816);
                    property58=property();

                    state._fsp--;

                    stream_property.add(property58.getTree());

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
                    // 88:17: -> ^( PROPERTY property )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:88:20: ^( PROPERTY property )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:90:1: node : ( LT NODE_TYPE GT -> NODE_TYPE | LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^( TABLE ID ) );
    public final QueryLanguageParser.node_return node() throws RecognitionException {
        QueryLanguageParser.node_return retval = new QueryLanguageParser.node_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT59=null;
        Token NODE_TYPE60=null;
        Token GT61=null;
        Token LEFT_SQ_BRACKET62=null;
        Token ID63=null;
        Token RIGHT_SQ_BRACKET64=null;

        Object LT59_tree=null;
        Object NODE_TYPE60_tree=null;
        Object GT61_tree=null;
        Object LEFT_SQ_BRACKET62_tree=null;
        Object ID63_tree=null;
        Object RIGHT_SQ_BRACKET64_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NODE_TYPE=new RewriteRuleTokenStream(adaptor,"token NODE_TYPE");
        RewriteRuleTokenStream stream_RIGHT_SQ_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_SQ_BRACKET");
        RewriteRuleTokenStream stream_LEFT_SQ_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_SQ_BRACKET");

        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:91:2: ( LT NODE_TYPE GT -> NODE_TYPE | LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^( TABLE ID ) )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:91:4: LT NODE_TYPE GT
                    {
                    LT59=(Token)match(input,LT,FOLLOW_LT_in_node839);  
                    stream_LT.add(LT59);


                    NODE_TYPE60=(Token)match(input,NODE_TYPE,FOLLOW_NODE_TYPE_in_node841);  
                    stream_NODE_TYPE.add(NODE_TYPE60);


                    GT61=(Token)match(input,GT,FOLLOW_GT_in_node843);  
                    stream_GT.add(GT61);


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
                    // 91:20: -> NODE_TYPE
                    {
                        adaptor.addChild(root_0, 
                        stream_NODE_TYPE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:92:4: LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET
                    {
                    LEFT_SQ_BRACKET62=(Token)match(input,LEFT_SQ_BRACKET,FOLLOW_LEFT_SQ_BRACKET_in_node852);  
                    stream_LEFT_SQ_BRACKET.add(LEFT_SQ_BRACKET62);


                    ID63=(Token)match(input,ID,FOLLOW_ID_in_node854);  
                    stream_ID.add(ID63);


                    RIGHT_SQ_BRACKET64=(Token)match(input,RIGHT_SQ_BRACKET,FOLLOW_RIGHT_SQ_BRACKET_in_node856);  
                    stream_RIGHT_SQ_BRACKET.add(RIGHT_SQ_BRACKET64);


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
                    // 92:40: -> ^( TABLE ID )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:92:43: ^( TABLE ID )
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


    public static class keywords_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keywords"
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:94:1: keywords : ( PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) );
    public final QueryLanguageParser.keywords_return keywords() throws RecognitionException {
        QueryLanguageParser.keywords_return retval = new QueryLanguageParser.keywords_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD65=null;
        Token CONTAINS66=null;
        Token LEFT_PAREN67=null;
        Token RIGHT_PAREN69=null;
        Token PERIOD70=null;
        Token IS71=null;
        Token LEFT_PAREN72=null;
        Token RIGHT_PAREN74=null;
        Token PERIOD75=null;
        Token HAS76=null;
        Token LEFT_PAREN77=null;
        Token RIGHT_PAREN79=null;
        QueryLanguageParser.keyword_nodes_return keyword_nodes68 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes73 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes78 =null;


        Object PERIOD65_tree=null;
        Object CONTAINS66_tree=null;
        Object LEFT_PAREN67_tree=null;
        Object RIGHT_PAREN69_tree=null;
        Object PERIOD70_tree=null;
        Object IS71_tree=null;
        Object LEFT_PAREN72_tree=null;
        Object RIGHT_PAREN74_tree=null;
        Object PERIOD75_tree=null;
        Object HAS76_tree=null;
        Object LEFT_PAREN77_tree=null;
        Object RIGHT_PAREN79_tree=null;
        RewriteRuleTokenStream stream_HAS=new RewriteRuleTokenStream(adaptor,"token HAS");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:95:2: ( PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:95:4: PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD65=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords874);  
                    stream_PERIOD.add(PERIOD65);


                    CONTAINS66=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_keywords876);  
                    stream_CONTAINS.add(CONTAINS66);


                    LEFT_PAREN67=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords878);  
                    stream_LEFT_PAREN.add(LEFT_PAREN67);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords880);
                    keyword_nodes68=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes68.getTree());

                    RIGHT_PAREN69=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords882);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN69);


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
                    // 95:58: -> ^( CONTAINS keyword_nodes )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:95:61: ^( CONTAINS keyword_nodes )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:96:4: PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD70=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords896);  
                    stream_PERIOD.add(PERIOD70);


                    IS71=(Token)match(input,IS,FOLLOW_IS_in_keywords898);  
                    stream_IS.add(IS71);


                    LEFT_PAREN72=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords900);  
                    stream_LEFT_PAREN.add(LEFT_PAREN72);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords902);
                    keyword_nodes73=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes73.getTree());

                    RIGHT_PAREN74=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords904);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN74);


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
                    // 96:53: -> ^( IS keyword_nodes )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:96:56: ^( IS keyword_nodes )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:97:4: PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD75=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_keywords919);  
                    stream_PERIOD.add(PERIOD75);


                    HAS76=(Token)match(input,HAS,FOLLOW_HAS_in_keywords921);  
                    stream_HAS.add(HAS76);


                    LEFT_PAREN77=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keywords923);  
                    stream_LEFT_PAREN.add(LEFT_PAREN77);


                    pushFollow(FOLLOW_keyword_nodes_in_keywords925);
                    keyword_nodes78=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes78.getTree());

                    RIGHT_PAREN79=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keywords927);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN79);


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
                    // 97:53: -> ^( HAS keyword_nodes )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:97:56: ^( HAS keyword_nodes )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:99:1: keyword_nodes : ( node -> ^( NODE_NAME node ) | ID -> ^( VAR_NAME ID ) | logical_op -> ^( LOGIC_OP logical_op ) );
    public final QueryLanguageParser.keyword_nodes_return keyword_nodes() throws RecognitionException {
        QueryLanguageParser.keyword_nodes_return retval = new QueryLanguageParser.keyword_nodes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID81=null;
        QueryLanguageParser.node_return node80 =null;

        QueryLanguageParser.logical_op_return logical_op82 =null;


        Object ID81_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_node=new RewriteRuleSubtreeStream(adaptor,"rule node");
        RewriteRuleSubtreeStream stream_logical_op=new RewriteRuleSubtreeStream(adaptor,"rule logical_op");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:100:2: ( node -> ^( NODE_NAME node ) | ID -> ^( VAR_NAME ID ) | logical_op -> ^( LOGIC_OP logical_op ) )
            int alt13=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:100:4: node
                    {
                    pushFollow(FOLLOW_node_in_keyword_nodes946);
                    node80=node();

                    state._fsp--;

                    stream_node.add(node80.getTree());

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
                    // 100:9: -> ^( NODE_NAME node )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:100:12: ^( NODE_NAME node )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:101:4: ID
                    {
                    ID81=(Token)match(input,ID,FOLLOW_ID_in_keyword_nodes959);  
                    stream_ID.add(ID81);


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
                    // 101:7: -> ^( VAR_NAME ID )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:101:10: ^( VAR_NAME ID )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:102:4: logical_op
                    {
                    pushFollow(FOLLOW_logical_op_in_keyword_nodes972);
                    logical_op82=logical_op();

                    state._fsp--;

                    stream_logical_op.add(logical_op82.getTree());

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
                    // 102:15: -> ^( LOGIC_OP logical_op )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:102:18: ^( LOGIC_OP logical_op )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:104:1: attr : ( COLON attr -> ^( ATTRIBUTES attr ) | PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | ATTRIBUTES attr -> ^( ATTRIBUTES attr ) | -> EPSILON );
    public final QueryLanguageParser.attr_return attr() throws RecognitionException {
        QueryLanguageParser.attr_return retval = new QueryLanguageParser.attr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON83=null;
        Token PERIOD85=null;
        Token CONTAINS86=null;
        Token LEFT_PAREN87=null;
        Token RIGHT_PAREN89=null;
        Token PERIOD90=null;
        Token IS91=null;
        Token LEFT_PAREN92=null;
        Token RIGHT_PAREN94=null;
        Token PERIOD95=null;
        Token HAS96=null;
        Token LEFT_PAREN97=null;
        Token RIGHT_PAREN99=null;
        Token ATTRIBUTES100=null;
        QueryLanguageParser.attr_return attr84 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes88 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes93 =null;

        QueryLanguageParser.keyword_nodes_return keyword_nodes98 =null;

        QueryLanguageParser.attr_return attr101 =null;


        Object COLON83_tree=null;
        Object PERIOD85_tree=null;
        Object CONTAINS86_tree=null;
        Object LEFT_PAREN87_tree=null;
        Object RIGHT_PAREN89_tree=null;
        Object PERIOD90_tree=null;
        Object IS91_tree=null;
        Object LEFT_PAREN92_tree=null;
        Object RIGHT_PAREN94_tree=null;
        Object PERIOD95_tree=null;
        Object HAS96_tree=null;
        Object LEFT_PAREN97_tree=null;
        Object RIGHT_PAREN99_tree=null;
        Object ATTRIBUTES100_tree=null;
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
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:105:2: ( COLON attr -> ^( ATTRIBUTES attr ) | PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( CONTAINS keyword_nodes ) | PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( IS keyword_nodes ) | PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( HAS keyword_nodes ) | ATTRIBUTES attr -> ^( ATTRIBUTES attr ) | -> EPSILON )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:105:4: COLON attr
                    {
                    COLON83=(Token)match(input,COLON,FOLLOW_COLON_in_attr990);  
                    stream_COLON.add(COLON83);


                    pushFollow(FOLLOW_attr_in_attr992);
                    attr84=attr();

                    state._fsp--;

                    stream_attr.add(attr84.getTree());

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
                    // 105:20: -> ^( ATTRIBUTES attr )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:105:24: ^( ATTRIBUTES attr )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:106:4: PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD85=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1011);  
                    stream_PERIOD.add(PERIOD85);


                    CONTAINS86=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_attr1013);  
                    stream_CONTAINS.add(CONTAINS86);


                    LEFT_PAREN87=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1015);  
                    stream_LEFT_PAREN.add(LEFT_PAREN87);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1017);
                    keyword_nodes88=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes88.getTree());

                    RIGHT_PAREN89=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1019);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN89);


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
                    // 106:58: -> ^( CONTAINS keyword_nodes )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:106:61: ^( CONTAINS keyword_nodes )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:107:4: PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD90=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1033);  
                    stream_PERIOD.add(PERIOD90);


                    IS91=(Token)match(input,IS,FOLLOW_IS_in_attr1035);  
                    stream_IS.add(IS91);


                    LEFT_PAREN92=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1037);  
                    stream_LEFT_PAREN.add(LEFT_PAREN92);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1039);
                    keyword_nodes93=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes93.getTree());

                    RIGHT_PAREN94=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1041);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN94);


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
                    // 107:53: -> ^( IS keyword_nodes )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:107:56: ^( IS keyword_nodes )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:108:4: PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    PERIOD95=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_attr1056);  
                    stream_PERIOD.add(PERIOD95);


                    HAS96=(Token)match(input,HAS,FOLLOW_HAS_in_attr1058);  
                    stream_HAS.add(HAS96);


                    LEFT_PAREN97=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_attr1060);  
                    stream_LEFT_PAREN.add(LEFT_PAREN97);


                    pushFollow(FOLLOW_keyword_nodes_in_attr1062);
                    keyword_nodes98=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes98.getTree());

                    RIGHT_PAREN99=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_attr1064);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN99);


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
                    // 108:53: -> ^( HAS keyword_nodes )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:108:56: ^( HAS keyword_nodes )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:109:4: ATTRIBUTES attr
                    {
                    ATTRIBUTES100=(Token)match(input,ATTRIBUTES,FOLLOW_ATTRIBUTES_in_attr1078);  
                    stream_ATTRIBUTES.add(ATTRIBUTES100);


                    pushFollow(FOLLOW_attr_in_attr1080);
                    attr101=attr();

                    state._fsp--;

                    stream_attr.add(attr101.getTree());

                    // AST REWRITE
                    // elements: attr, ATTRIBUTES
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:24: -> ^( ATTRIBUTES attr )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:109:27: ^( ATTRIBUTES attr )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:110:4: 
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
                    // 110:4: -> EPSILON
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:112:1: property : ( ID -> ^( VAR_NAME ID ) | ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) ) );
    public final QueryLanguageParser.property_return property() throws RecognitionException {
        QueryLanguageParser.property_return retval = new QueryLanguageParser.property_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID102=null;
        Token ID103=null;
        Token PERIOD104=null;
        Token CONTAINS105=null;
        Token LEFT_PAREN106=null;
        Token RIGHT_PAREN108=null;
        QueryLanguageParser.keyword_nodes_return keyword_nodes107 =null;


        Object ID102_tree=null;
        Object ID103_tree=null;
        Object PERIOD104_tree=null;
        Object CONTAINS105_tree=null;
        Object LEFT_PAREN106_tree=null;
        Object RIGHT_PAREN108_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_keyword_nodes=new RewriteRuleSubtreeStream(adaptor,"rule keyword_nodes");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:113:2: ( ID -> ^( VAR_NAME ID ) | ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==PERIOD) ) {
                    alt15=2;
                }
                else if ( (LA15_1==EOF||(LA15_1 >= AND && LA15_1 <= AS)||(LA15_1 >= COMMA && LA15_1 <= COMPOUND_ADD)||LA15_1==DIVIDE||LA15_1==EQUALS||LA15_1==FOREACH||(LA15_1 >= GT && LA15_1 <= GTE)||(LA15_1 >= ID && LA15_1 <= IF)||LA15_1==IN||(LA15_1 >= INCREMENT && LA15_1 <= INTEGER)||LA15_1==LEFT_BRACKET||(LA15_1 >= LEFT_SQ_BRACKET && LA15_1 <= LOGIC_EQUALS)||(LA15_1 >= LT && LA15_1 <= LTE)||LA15_1==MINUS||LA15_1==NOT_EQUAL||LA15_1==OR||(LA15_1 >= PLUS && LA15_1 <= PRINT)||(LA15_1 >= REPEATER && LA15_1 <= RIGHT_PAREN)||LA15_1==SELECT||(LA15_1 >= SEMICOLON && LA15_1 <= SET)||LA15_1==STAR) ) {
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:113:4: ID
                    {
                    ID102=(Token)match(input,ID,FOLLOW_ID_in_property1109);  
                    stream_ID.add(ID102);


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
                    // 113:18: -> ^( VAR_NAME ID )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:113:21: ^( VAR_NAME ID )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:114:4: ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN
                    {
                    ID103=(Token)match(input,ID,FOLLOW_ID_in_property1133);  
                    stream_ID.add(ID103);


                    PERIOD104=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_property1135);  
                    stream_PERIOD.add(PERIOD104);


                    CONTAINS105=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_property1137);  
                    stream_CONTAINS.add(CONTAINS105);


                    LEFT_PAREN106=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_property1139);  
                    stream_LEFT_PAREN.add(LEFT_PAREN106);


                    pushFollow(FOLLOW_keyword_nodes_in_property1141);
                    keyword_nodes107=keyword_nodes();

                    state._fsp--;

                    stream_keyword_nodes.add(keyword_nodes107.getTree());

                    RIGHT_PAREN108=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_property1143);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN108);


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
                    // 114:60: -> ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:114:63: ^( VAR_NAME ID ^( CONTAINS keyword_nodes ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_NAME, "VAR_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:114:77: ^( CONTAINS keyword_nodes )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:117:1: variable : ( ID COLON attr -> ^( VAR_NAME ID attr ) | node_chain -> ^( NODE_CHAIN node_chain ) | INTEGER -> INTEGER | RESERVED_TYPES -> RESERVED_TYPES );
    public final QueryLanguageParser.variable_return variable() throws RecognitionException {
        QueryLanguageParser.variable_return retval = new QueryLanguageParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID109=null;
        Token COLON110=null;
        Token INTEGER113=null;
        Token RESERVED_TYPES114=null;
        QueryLanguageParser.attr_return attr111 =null;

        QueryLanguageParser.node_chain_return node_chain112 =null;


        Object ID109_tree=null;
        Object COLON110_tree=null;
        Object INTEGER113_tree=null;
        Object RESERVED_TYPES114_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RESERVED_TYPES=new RewriteRuleTokenStream(adaptor,"token RESERVED_TYPES");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_attr=new RewriteRuleSubtreeStream(adaptor,"rule attr");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:118:2: ( ID COLON attr -> ^( VAR_NAME ID attr ) | node_chain -> ^( NODE_CHAIN node_chain ) | INTEGER -> INTEGER | RESERVED_TYPES -> RESERVED_TYPES )
            int alt16=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==COLON) ) {
                    alt16=1;
                }
                else if ( (LA16_1==EOF||(LA16_1 >= AND && LA16_1 <= AS)||(LA16_1 >= COMMA && LA16_1 <= COMPOUND_ADD)||LA16_1==DIVIDE||LA16_1==EQUALS||LA16_1==FOREACH||(LA16_1 >= GT && LA16_1 <= GTE)||(LA16_1 >= ID && LA16_1 <= IF)||(LA16_1 >= INCREMENT && LA16_1 <= INTEGER)||LA16_1==LEFT_BRACKET||(LA16_1 >= LEFT_SQ_BRACKET && LA16_1 <= LOGIC_EQUALS)||(LA16_1 >= LT && LA16_1 <= LTE)||LA16_1==MINUS||LA16_1==NOT_EQUAL||(LA16_1 >= OR && LA16_1 <= PRINT)||(LA16_1 >= RESERVED_TYPES && LA16_1 <= RIGHT_PAREN)||LA16_1==SELECT||(LA16_1 >= SEMICOLON && LA16_1 <= SET)) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
                }
                break;
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
            case RESERVED_TYPES:
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:118:4: ID COLON attr
                    {
                    ID109=(Token)match(input,ID,FOLLOW_ID_in_variable1170);  
                    stream_ID.add(ID109);


                    COLON110=(Token)match(input,COLON,FOLLOW_COLON_in_variable1172);  
                    stream_COLON.add(COLON110);


                    pushFollow(FOLLOW_attr_in_variable1174);
                    attr111=attr();

                    state._fsp--;

                    stream_attr.add(attr111.getTree());

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
                    // 118:21: -> ^( VAR_NAME ID attr )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:118:24: ^( VAR_NAME ID attr )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:119:4: node_chain
                    {
                    pushFollow(FOLLOW_node_chain_in_variable1192);
                    node_chain112=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain112.getTree());

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
                    // 119:19: -> ^( NODE_CHAIN node_chain )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:119:22: ^( NODE_CHAIN node_chain )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:120:4: INTEGER
                    {
                    INTEGER113=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_variable1209);  
                    stream_INTEGER.add(INTEGER113);


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
                    // 120:16: -> INTEGER
                    {
                        adaptor.addChild(root_0, 
                        stream_INTEGER.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:121:4: RESERVED_TYPES
                    {
                    RESERVED_TYPES114=(Token)match(input,RESERVED_TYPES,FOLLOW_RESERVED_TYPES_in_variable1222);  
                    stream_RESERVED_TYPES.add(RESERVED_TYPES114);


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
                    // 121:22: -> RESERVED_TYPES
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:124:1: block : ( LEFT_BRACKET block_statements RIGHT_BRACKET -> ^( BLOCK_STATEMENTS block_statements ) | -> EPSILON );
    public final QueryLanguageParser.block_return block() throws RecognitionException {
        QueryLanguageParser.block_return retval = new QueryLanguageParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET115=null;
        Token RIGHT_BRACKET117=null;
        QueryLanguageParser.block_statements_return block_statements116 =null;


        Object LEFT_BRACKET115_tree=null;
        Object RIGHT_BRACKET117_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_block_statements=new RewriteRuleSubtreeStream(adaptor,"rule block_statements");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:125:2: ( LEFT_BRACKET block_statements RIGHT_BRACKET -> ^( BLOCK_STATEMENTS block_statements ) | -> EPSILON )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LEFT_BRACKET) ) {
                alt17=1;
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:125:4: LEFT_BRACKET block_statements RIGHT_BRACKET
                    {
                    LEFT_BRACKET115=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_block1242);  
                    stream_LEFT_BRACKET.add(LEFT_BRACKET115);


                    pushFollow(FOLLOW_block_statements_in_block1244);
                    block_statements116=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements116.getTree());

                    RIGHT_BRACKET117=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_block1246);  
                    stream_RIGHT_BRACKET.add(RIGHT_BRACKET117);


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
                    // 125:48: -> ^( BLOCK_STATEMENTS block_statements )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:125:51: ^( BLOCK_STATEMENTS block_statements )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:126:4: 
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
                    // 126:4: -> EPSILON
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:128:1: block_statements : ( STAR block_statements -> ^( STAR block_statements ) | REPEATER block_statements -> ^( REPEATER block_statements ) | node_chain block block_statements -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) ) | -> EPSILON );
    public final QueryLanguageParser.block_statements_return block_statements() throws RecognitionException {
        QueryLanguageParser.block_statements_return retval = new QueryLanguageParser.block_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR118=null;
        Token REPEATER120=null;
        QueryLanguageParser.block_statements_return block_statements119 =null;

        QueryLanguageParser.block_statements_return block_statements121 =null;

        QueryLanguageParser.node_chain_return node_chain122 =null;

        QueryLanguageParser.block_return block123 =null;

        QueryLanguageParser.block_statements_return block_statements124 =null;


        Object STAR118_tree=null;
        Object REPEATER120_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_REPEATER=new RewriteRuleTokenStream(adaptor,"token REPEATER");
        RewriteRuleSubtreeStream stream_node_chain=new RewriteRuleSubtreeStream(adaptor,"rule node_chain");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_block_statements=new RewriteRuleSubtreeStream(adaptor,"rule block_statements");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:129:2: ( STAR block_statements -> ^( STAR block_statements ) | REPEATER block_statements -> ^( REPEATER block_statements ) | node_chain block block_statements -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) ) | -> EPSILON )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:129:4: STAR block_statements
                    {
                    STAR118=(Token)match(input,STAR,FOLLOW_STAR_in_block_statements1271);  
                    stream_STAR.add(STAR118);


                    pushFollow(FOLLOW_block_statements_in_block_statements1273);
                    block_statements119=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements119.getTree());

                    // AST REWRITE
                    // elements: block_statements, STAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:29: -> ^( STAR block_statements )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:129:32: ^( STAR block_statements )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:130:4: REPEATER block_statements
                    {
                    REPEATER120=(Token)match(input,REPEATER,FOLLOW_REPEATER_in_block_statements1289);  
                    stream_REPEATER.add(REPEATER120);


                    pushFollow(FOLLOW_block_statements_in_block_statements1291);
                    block_statements121=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements121.getTree());

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
                    // 130:32: -> ^( REPEATER block_statements )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:130:35: ^( REPEATER block_statements )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:131:4: node_chain block block_statements
                    {
                    pushFollow(FOLLOW_node_chain_in_block_statements1306);
                    node_chain122=node_chain();

                    state._fsp--;

                    stream_node_chain.add(node_chain122.getTree());

                    pushFollow(FOLLOW_block_in_block_statements1308);
                    block123=block();

                    state._fsp--;

                    stream_block.add(block123.getTree());

                    pushFollow(FOLLOW_block_statements_in_block_statements1310);
                    block_statements124=block_statements();

                    state._fsp--;

                    stream_block_statements.add(block_statements124.getTree());

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
                    // 131:38: -> ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:131:41: ^( NESTED ^( node_chain ) block ^( BLOCK_STATEMENTS block_statements ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NESTED, "NESTED")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:131:50: ^( node_chain )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_node_chain.nextNode(), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_block.nextTree());

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:131:70: ^( BLOCK_STATEMENTS block_statements )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:132:4: 
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
                    // 132:4: -> EPSILON
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:135:1: print_stmt : ( PRINT variable_stmt SEMICOLON -> variable_stmt | -> EPSILON );
    public final QueryLanguageParser.print_stmt_return print_stmt() throws RecognitionException {
        QueryLanguageParser.print_stmt_return retval = new QueryLanguageParser.print_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT125=null;
        Token SEMICOLON127=null;
        QueryLanguageParser.variable_stmt_return variable_stmt126 =null;


        Object PRINT125_tree=null;
        Object SEMICOLON127_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_variable_stmt=new RewriteRuleSubtreeStream(adaptor,"rule variable_stmt");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:136:2: ( PRINT variable_stmt SEMICOLON -> variable_stmt | -> EPSILON )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==PRINT) ) {
                alt19=1;
            }
            else if ( (LA19_0==EOF||LA19_0==FOREACH||(LA19_0 >= ID && LA19_0 <= IF)||LA19_0==INTEGER||LA19_0==LEFT_SQ_BRACKET||LA19_0==LT||(LA19_0 >= RESERVED_TYPES && LA19_0 <= RIGHT_BRACKET)||LA19_0==SELECT||LA19_0==SET) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:136:4: PRINT variable_stmt SEMICOLON
                    {
                    PRINT125=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stmt1346);  
                    stream_PRINT.add(PRINT125);


                    pushFollow(FOLLOW_variable_stmt_in_print_stmt1348);
                    variable_stmt126=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt126.getTree());

                    SEMICOLON127=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print_stmt1350);  
                    stream_SEMICOLON.add(SEMICOLON127);


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
                    // 136:34: -> variable_stmt
                    {
                        adaptor.addChild(root_0, stream_variable_stmt.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:137:4: 
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
                    // 137:4: -> EPSILON
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:140:1: stat_statements : ( LEFT_BRACKET statements RIGHT_BRACKET -> statements | -> EPSILON );
    public final QueryLanguageParser.stat_statements_return stat_statements() throws RecognitionException {
        QueryLanguageParser.stat_statements_return retval = new QueryLanguageParser.stat_statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_BRACKET128=null;
        Token RIGHT_BRACKET130=null;
        QueryLanguageParser.statements_return statements129 =null;


        Object LEFT_BRACKET128_tree=null;
        Object RIGHT_BRACKET130_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:141:2: ( LEFT_BRACKET statements RIGHT_BRACKET -> statements | -> EPSILON )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LEFT_BRACKET) ) {
                alt20=1;
            }
            else if ( (LA20_0==EOF||LA20_0==FOREACH||(LA20_0 >= ID && LA20_0 <= IF)||LA20_0==INTEGER||LA20_0==LEFT_SQ_BRACKET||LA20_0==LT||LA20_0==PRINT||(LA20_0 >= RESERVED_TYPES && LA20_0 <= RIGHT_BRACKET)||LA20_0==SELECT||LA20_0==SET) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:141:4: LEFT_BRACKET statements RIGHT_BRACKET
                    {
                    LEFT_BRACKET128=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_stat_statements1372);  
                    stream_LEFT_BRACKET.add(LEFT_BRACKET128);


                    pushFollow(FOLLOW_statements_in_stat_statements1374);
                    statements129=statements();

                    state._fsp--;

                    stream_statements.add(statements129.getTree());

                    RIGHT_BRACKET130=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_stat_statements1376);  
                    stream_RIGHT_BRACKET.add(RIGHT_BRACKET130);


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
                    // 141:42: -> statements
                    {
                        adaptor.addChild(root_0, stream_statements.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:142:4: 
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
                    // 142:4: -> EPSILON
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:145:1: statements : ( variable_assn statements -> ^( STATEMENT variable_assn statements ) | if_statement statements -> ^( STATEMENT if_statement statements ) | query statements -> ^( QUERY query ) statements | SET variable_assn WHERE boolean_exp SEMICOLON -> ^( SET_TABLE variable_assn boolean_exp ) | -> EPSILON );
    public final QueryLanguageParser.statements_return statements() throws RecognitionException {
        QueryLanguageParser.statements_return retval = new QueryLanguageParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SET137=null;
        Token WHERE139=null;
        Token SEMICOLON141=null;
        QueryLanguageParser.variable_assn_return variable_assn131 =null;

        QueryLanguageParser.statements_return statements132 =null;

        QueryLanguageParser.if_statement_return if_statement133 =null;

        QueryLanguageParser.statements_return statements134 =null;

        QueryLanguageParser.query_return query135 =null;

        QueryLanguageParser.statements_return statements136 =null;

        QueryLanguageParser.variable_assn_return variable_assn138 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp140 =null;


        Object SET137_tree=null;
        Object WHERE139_tree=null;
        Object SEMICOLON141_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_variable_assn=new RewriteRuleSubtreeStream(adaptor,"rule variable_assn");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        RewriteRuleSubtreeStream stream_if_statement=new RewriteRuleSubtreeStream(adaptor,"rule if_statement");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:146:2: ( variable_assn statements -> ^( STATEMENT variable_assn statements ) | if_statement statements -> ^( STATEMENT if_statement statements ) | query statements -> ^( QUERY query ) statements | SET variable_assn WHERE boolean_exp SEMICOLON -> ^( SET_TABLE variable_assn boolean_exp ) | -> EPSILON )
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
            case LEFT_SQ_BRACKET:
            case LT:
            case RESERVED_TYPES:
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:146:4: variable_assn statements
                    {
                    pushFollow(FOLLOW_variable_assn_in_statements1399);
                    variable_assn131=variable_assn();

                    state._fsp--;

                    stream_variable_assn.add(variable_assn131.getTree());

                    pushFollow(FOLLOW_statements_in_statements1401);
                    statements132=statements();

                    state._fsp--;

                    stream_statements.add(statements132.getTree());

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
                    // 146:29: -> ^( STATEMENT variable_assn statements )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:146:32: ^( STATEMENT variable_assn statements )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:147:4: if_statement statements
                    {
                    pushFollow(FOLLOW_if_statement_in_statements1416);
                    if_statement133=if_statement();

                    state._fsp--;

                    stream_if_statement.add(if_statement133.getTree());

                    pushFollow(FOLLOW_statements_in_statements1418);
                    statements134=statements();

                    state._fsp--;

                    stream_statements.add(statements134.getTree());

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
                    // 147:29: -> ^( STATEMENT if_statement statements )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:147:32: ^( STATEMENT if_statement statements )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:148:4: query statements
                    {
                    pushFollow(FOLLOW_query_in_statements1434);
                    query135=query();

                    state._fsp--;

                    stream_query.add(query135.getTree());

                    pushFollow(FOLLOW_statements_in_statements1436);
                    statements136=statements();

                    state._fsp--;

                    stream_statements.add(statements136.getTree());

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
                    // 148:22: -> ^( QUERY query ) statements
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:148:25: ^( QUERY query )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:149:4: SET variable_assn WHERE boolean_exp SEMICOLON
                    {
                    SET137=(Token)match(input,SET,FOLLOW_SET_in_statements1452);  
                    stream_SET.add(SET137);


                    pushFollow(FOLLOW_variable_assn_in_statements1454);
                    variable_assn138=variable_assn();

                    state._fsp--;

                    stream_variable_assn.add(variable_assn138.getTree());

                    WHERE139=(Token)match(input,WHERE,FOLLOW_WHERE_in_statements1456);  
                    stream_WHERE.add(WHERE139);


                    pushFollow(FOLLOW_boolean_exp_in_statements1458);
                    boolean_exp140=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp140.getTree());

                    SEMICOLON141=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements1460);  
                    stream_SEMICOLON.add(SEMICOLON141);


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
                    // 149:50: -> ^( SET_TABLE variable_assn boolean_exp )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:149:53: ^( SET_TABLE variable_assn boolean_exp )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:150:4: 
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
    // $ANTLR end "statements"


    public static class variable_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_stmt"
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:153:1: variable_stmt : ( variable binary_op -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) ) | MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAX variable variable ) );
    public final QueryLanguageParser.variable_stmt_return variable_stmt() throws RecognitionException {
        QueryLanguageParser.variable_stmt_return retval = new QueryLanguageParser.variable_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MAX144=null;
        Token LEFT_PAREN145=null;
        Token COMMA147=null;
        Token RIGHT_PAREN149=null;
        QueryLanguageParser.variable_return variable142 =null;

        QueryLanguageParser.binary_op_return binary_op143 =null;

        QueryLanguageParser.variable_return variable146 =null;

        QueryLanguageParser.variable_return variable148 =null;


        Object MAX144_tree=null;
        Object LEFT_PAREN145_tree=null;
        Object COMMA147_tree=null;
        Object RIGHT_PAREN149_tree=null;
        RewriteRuleTokenStream stream_MAX=new RewriteRuleTokenStream(adaptor,"token MAX");
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_binary_op=new RewriteRuleSubtreeStream(adaptor,"rule binary_op");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:154:2: ( variable binary_op -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) ) | MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^( MAX variable variable ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||LA22_0==INTEGER||LA22_0==LEFT_SQ_BRACKET||LA22_0==LT||LA22_0==RESERVED_TYPES) ) {
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:154:4: variable binary_op
                    {
                    pushFollow(FOLLOW_variable_in_variable_stmt1489);
                    variable142=variable();

                    state._fsp--;

                    stream_variable.add(variable142.getTree());

                    pushFollow(FOLLOW_binary_op_in_variable_stmt1491);
                    binary_op143=binary_op();

                    state._fsp--;

                    stream_binary_op.add(binary_op143.getTree());

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
                    // 154:25: -> ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:154:28: ^( VAR_STMT ^( VAR variable ) ^( BIN_OP binary_op ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_STMT, "VAR_STMT")
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:154:39: ^( VAR variable )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_2);

                        adaptor.addChild(root_2, stream_variable.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:154:55: ^( BIN_OP binary_op )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:155:4: MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN
                    {
                    MAX144=(Token)match(input,MAX,FOLLOW_MAX_in_variable_stmt1517);  
                    stream_MAX.add(MAX144);


                    LEFT_PAREN145=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_variable_stmt1519);  
                    stream_LEFT_PAREN.add(LEFT_PAREN145);


                    pushFollow(FOLLOW_variable_in_variable_stmt1521);
                    variable146=variable();

                    state._fsp--;

                    stream_variable.add(variable146.getTree());

                    COMMA147=(Token)match(input,COMMA,FOLLOW_COMMA_in_variable_stmt1523);  
                    stream_COMMA.add(COMMA147);


                    pushFollow(FOLLOW_variable_in_variable_stmt1525);
                    variable148=variable();

                    state._fsp--;

                    stream_variable.add(variable148.getTree());

                    RIGHT_PAREN149=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_variable_stmt1527);  
                    stream_RIGHT_PAREN.add(RIGHT_PAREN149);


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
                    // 155:55: -> ^( MAX variable variable )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:155:58: ^( MAX variable variable )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:157:1: variable_assn : variable variable_assn_right -> ^( VAR variable ) variable_assn_right ;
    public final QueryLanguageParser.variable_assn_return variable_assn() throws RecognitionException {
        QueryLanguageParser.variable_assn_return retval = new QueryLanguageParser.variable_assn_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable150 =null;

        QueryLanguageParser.variable_assn_right_return variable_assn_right151 =null;


        RewriteRuleSubtreeStream stream_variable_assn_right=new RewriteRuleSubtreeStream(adaptor,"rule variable_assn_right");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:158:2: ( variable variable_assn_right -> ^( VAR variable ) variable_assn_right )
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:158:4: variable variable_assn_right
            {
            pushFollow(FOLLOW_variable_in_variable_assn1547);
            variable150=variable();

            state._fsp--;

            stream_variable.add(variable150.getTree());

            pushFollow(FOLLOW_variable_assn_right_in_variable_assn1549);
            variable_assn_right151=variable_assn_right();

            state._fsp--;

            stream_variable_assn_right.add(variable_assn_right151.getTree());

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
            // 158:33: -> ^( VAR variable ) variable_assn_right
            {
                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:158:36: ^( VAR variable )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:160:1: variable_assn_right : ( EQUALS variable_stmt SEMICOLON -> ^( VAR_ASSIGN variable_stmt ) | COMPOUND_ADD variable_stmt SEMICOLON -> ^( COMP_ADD variable_stmt ) | INCREMENT SEMICOLON -> INCR );
    public final QueryLanguageParser.variable_assn_right_return variable_assn_right() throws RecognitionException {
        QueryLanguageParser.variable_assn_right_return retval = new QueryLanguageParser.variable_assn_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS152=null;
        Token SEMICOLON154=null;
        Token COMPOUND_ADD155=null;
        Token SEMICOLON157=null;
        Token INCREMENT158=null;
        Token SEMICOLON159=null;
        QueryLanguageParser.variable_stmt_return variable_stmt153 =null;

        QueryLanguageParser.variable_stmt_return variable_stmt156 =null;


        Object EQUALS152_tree=null;
        Object SEMICOLON154_tree=null;
        Object COMPOUND_ADD155_tree=null;
        Object SEMICOLON157_tree=null;
        Object INCREMENT158_tree=null;
        Object SEMICOLON159_tree=null;
        RewriteRuleTokenStream stream_INCREMENT=new RewriteRuleTokenStream(adaptor,"token INCREMENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_COMPOUND_ADD=new RewriteRuleTokenStream(adaptor,"token COMPOUND_ADD");
        RewriteRuleSubtreeStream stream_variable_stmt=new RewriteRuleSubtreeStream(adaptor,"rule variable_stmt");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:161:2: ( EQUALS variable_stmt SEMICOLON -> ^( VAR_ASSIGN variable_stmt ) | COMPOUND_ADD variable_stmt SEMICOLON -> ^( COMP_ADD variable_stmt ) | INCREMENT SEMICOLON -> INCR )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:161:4: EQUALS variable_stmt SEMICOLON
                    {
                    EQUALS152=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_variable_assn_right1569);  
                    stream_EQUALS.add(EQUALS152);


                    pushFollow(FOLLOW_variable_stmt_in_variable_assn_right1571);
                    variable_stmt153=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt153.getTree());

                    SEMICOLON154=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right1573);  
                    stream_SEMICOLON.add(SEMICOLON154);


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
                    // 161:36: -> ^( VAR_ASSIGN variable_stmt )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:161:39: ^( VAR_ASSIGN variable_stmt )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:162:4: COMPOUND_ADD variable_stmt SEMICOLON
                    {
                    COMPOUND_ADD155=(Token)match(input,COMPOUND_ADD,FOLLOW_COMPOUND_ADD_in_variable_assn_right1587);  
                    stream_COMPOUND_ADD.add(COMPOUND_ADD155);


                    pushFollow(FOLLOW_variable_stmt_in_variable_assn_right1589);
                    variable_stmt156=variable_stmt();

                    state._fsp--;

                    stream_variable_stmt.add(variable_stmt156.getTree());

                    SEMICOLON157=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right1591);  
                    stream_SEMICOLON.add(SEMICOLON157);


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
                    // 162:41: -> ^( COMP_ADD variable_stmt )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:162:44: ^( COMP_ADD variable_stmt )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:163:4: INCREMENT SEMICOLON
                    {
                    INCREMENT158=(Token)match(input,INCREMENT,FOLLOW_INCREMENT_in_variable_assn_right1604);  
                    stream_INCREMENT.add(INCREMENT158);


                    SEMICOLON159=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable_assn_right1606);  
                    stream_SEMICOLON.add(SEMICOLON159);


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
                    // 163:26: -> INCR
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:165:1: if_statement : IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) ) ;
    public final QueryLanguageParser.if_statement_return if_statement() throws RecognitionException {
        QueryLanguageParser.if_statement_return retval = new QueryLanguageParser.if_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF160=null;
        Token LEFT_PAREN161=null;
        Token RIGHT_PAREN163=null;
        Token LEFT_BRACKET164=null;
        Token RIGHT_BRACKET166=null;
        QueryLanguageParser.boolean_exp_return boolean_exp162 =null;

        QueryLanguageParser.statements_return statements165 =null;


        Object IF160_tree=null;
        Object LEFT_PAREN161_tree=null;
        Object RIGHT_PAREN163_tree=null;
        Object LEFT_BRACKET164_tree=null;
        Object RIGHT_BRACKET166_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:166:2: ( IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) ) )
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:166:4: IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET
            {
            IF160=(Token)match(input,IF,FOLLOW_IF_in_if_statement1622);  
            stream_IF.add(IF160);


            LEFT_PAREN161=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_if_statement1624);  
            stream_LEFT_PAREN.add(LEFT_PAREN161);


            pushFollow(FOLLOW_boolean_exp_in_if_statement1626);
            boolean_exp162=boolean_exp();

            state._fsp--;

            stream_boolean_exp.add(boolean_exp162.getTree());

            RIGHT_PAREN163=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_if_statement1628);  
            stream_RIGHT_PAREN.add(RIGHT_PAREN163);


            LEFT_BRACKET164=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_if_statement1630);  
            stream_LEFT_BRACKET.add(LEFT_BRACKET164);


            pushFollow(FOLLOW_statements_in_if_statement1632);
            statements165=statements();

            state._fsp--;

            stream_statements.add(statements165.getTree());

            RIGHT_BRACKET166=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_if_statement1634);  
            stream_RIGHT_BRACKET.add(RIGHT_BRACKET166);


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
            // 166:80: -> ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) )
            {
                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:166:83: ^( IF_STATEMENT ^( BOOL_EXP boolean_exp ) ^( STATEMENTS statements ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF_STATEMENT, "IF_STATEMENT")
                , root_1);

                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:166:98: ^( BOOL_EXP boolean_exp )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BOOL_EXP, "BOOL_EXP")
                , root_2);

                adaptor.addChild(root_2, stream_boolean_exp.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:166:122: ^( STATEMENTS statements )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:169:1: boolean_stmt : variable boolean_right -> ^( VAR variable ) boolean_right ;
    public final QueryLanguageParser.boolean_stmt_return boolean_stmt() throws RecognitionException {
        QueryLanguageParser.boolean_stmt_return retval = new QueryLanguageParser.boolean_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.variable_return variable167 =null;

        QueryLanguageParser.boolean_right_return boolean_right168 =null;


        RewriteRuleSubtreeStream stream_boolean_right=new RewriteRuleSubtreeStream(adaptor,"rule boolean_right");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:170:2: ( variable boolean_right -> ^( VAR variable ) boolean_right )
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:170:4: variable boolean_right
            {
            pushFollow(FOLLOW_variable_in_boolean_stmt1663);
            variable167=variable();

            state._fsp--;

            stream_variable.add(variable167.getTree());

            pushFollow(FOLLOW_boolean_right_in_boolean_stmt1665);
            boolean_right168=boolean_right();

            state._fsp--;

            stream_boolean_right.add(boolean_right168.getTree());

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
            // 170:27: -> ^( VAR variable ) boolean_right
            {
                // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:170:30: ^( VAR variable )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:173:1: boolean_right : ( boolean_op variable -> ^( boolean_op variable ) | -> EPSILON );
    public final QueryLanguageParser.boolean_right_return boolean_right() throws RecognitionException {
        QueryLanguageParser.boolean_right_return retval = new QueryLanguageParser.boolean_right_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.boolean_op_return boolean_op169 =null;

        QueryLanguageParser.variable_return variable170 =null;


        RewriteRuleSubtreeStream stream_boolean_op=new RewriteRuleSubtreeStream(adaptor,"rule boolean_op");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:174:2: ( boolean_op variable -> ^( boolean_op variable ) | -> EPSILON )
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
                else if ( (LA24_2==ID||LA24_2==INTEGER||LA24_2==LEFT_SQ_BRACKET||LA24_2==LT||LA24_2==RESERVED_TYPES) ) {
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:174:4: boolean_op variable
                    {
                    pushFollow(FOLLOW_boolean_op_in_boolean_right1686);
                    boolean_op169=boolean_op();

                    state._fsp--;

                    stream_boolean_op.add(boolean_op169.getTree());

                    pushFollow(FOLLOW_variable_in_boolean_right1688);
                    variable170=variable();

                    state._fsp--;

                    stream_variable.add(variable170.getTree());

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
                    // 174:24: -> ^( boolean_op variable )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:174:27: ^( boolean_op variable )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:175:4: 
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
    // $ANTLR end "boolean_right"


    public static class boolean_exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_exp"
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:178:1: boolean_exp : ( boolean_stmt boolean_exp_cont -> boolean_stmt ^( BOOL_EXP boolean_exp_cont ) | NOT boolean_exp -> ^( NOT ^( BOOL_EXP boolean_exp ) ) );
    public final QueryLanguageParser.boolean_exp_return boolean_exp() throws RecognitionException {
        QueryLanguageParser.boolean_exp_return retval = new QueryLanguageParser.boolean_exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT173=null;
        QueryLanguageParser.boolean_stmt_return boolean_stmt171 =null;

        QueryLanguageParser.boolean_exp_cont_return boolean_exp_cont172 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp174 =null;


        Object NOT173_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_boolean_stmt=new RewriteRuleSubtreeStream(adaptor,"rule boolean_stmt");
        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_boolean_exp_cont=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp_cont");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:179:2: ( boolean_stmt boolean_exp_cont -> boolean_stmt ^( BOOL_EXP boolean_exp_cont ) | NOT boolean_exp -> ^( NOT ^( BOOL_EXP boolean_exp ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID||LA25_0==INTEGER||LA25_0==LEFT_SQ_BRACKET||LA25_0==LT||LA25_0==RESERVED_TYPES) ) {
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:179:4: boolean_stmt boolean_exp_cont
                    {
                    pushFollow(FOLLOW_boolean_stmt_in_boolean_exp1715);
                    boolean_stmt171=boolean_stmt();

                    state._fsp--;

                    stream_boolean_stmt.add(boolean_stmt171.getTree());

                    pushFollow(FOLLOW_boolean_exp_cont_in_boolean_exp1717);
                    boolean_exp_cont172=boolean_exp_cont();

                    state._fsp--;

                    stream_boolean_exp_cont.add(boolean_exp_cont172.getTree());

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
                    // 179:34: -> boolean_stmt ^( BOOL_EXP boolean_exp_cont )
                    {
                        adaptor.addChild(root_0, stream_boolean_stmt.nextTree());

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:179:50: ^( BOOL_EXP boolean_exp_cont )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:180:4: NOT boolean_exp
                    {
                    NOT173=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_exp1732);  
                    stream_NOT.add(NOT173);


                    pushFollow(FOLLOW_boolean_exp_in_boolean_exp1734);
                    boolean_exp174=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp174.getTree());

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
                    // 180:22: -> ^( NOT ^( BOOL_EXP boolean_exp ) )
                    {
                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:180:25: ^( NOT ^( BOOL_EXP boolean_exp ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_NOT.nextNode()
                        , root_1);

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:180:31: ^( BOOL_EXP boolean_exp )
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:183:1: boolean_exp_cont : ( logical_op boolean_exp -> logical_op ^( BOOL_EXP boolean_exp ) | -> EPSILON );
    public final QueryLanguageParser.boolean_exp_cont_return boolean_exp_cont() throws RecognitionException {
        QueryLanguageParser.boolean_exp_cont_return retval = new QueryLanguageParser.boolean_exp_cont_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        QueryLanguageParser.logical_op_return logical_op175 =null;

        QueryLanguageParser.boolean_exp_return boolean_exp176 =null;


        RewriteRuleSubtreeStream stream_boolean_exp=new RewriteRuleSubtreeStream(adaptor,"rule boolean_exp");
        RewriteRuleSubtreeStream stream_logical_op=new RewriteRuleSubtreeStream(adaptor,"rule logical_op");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:184:2: ( logical_op boolean_exp -> logical_op ^( BOOL_EXP boolean_exp ) | -> EPSILON )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==AND||LA26_0==OR) ) {
                alt26=1;
            }
            else if ( (LA26_0==EOF||LA26_0==FOREACH||(LA26_0 >= ID && LA26_0 <= IF)||LA26_0==INTEGER||LA26_0==LEFT_BRACKET||LA26_0==LEFT_SQ_BRACKET||LA26_0==LT||LA26_0==PRINT||(LA26_0 >= RESERVED_TYPES && LA26_0 <= RIGHT_PAREN)||LA26_0==SELECT||(LA26_0 >= SEMICOLON && LA26_0 <= SET)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:184:4: logical_op boolean_exp
                    {
                    pushFollow(FOLLOW_logical_op_in_boolean_exp_cont1759);
                    logical_op175=logical_op();

                    state._fsp--;

                    stream_logical_op.add(logical_op175.getTree());

                    pushFollow(FOLLOW_boolean_exp_in_boolean_exp_cont1761);
                    boolean_exp176=boolean_exp();

                    state._fsp--;

                    stream_boolean_exp.add(boolean_exp176.getTree());

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
                    // 184:28: -> logical_op ^( BOOL_EXP boolean_exp )
                    {
                        adaptor.addChild(root_0, stream_logical_op.nextTree());

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:184:42: ^( BOOL_EXP boolean_exp )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:185:4: 
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
                    // 185:4: -> EPSILON
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:188:1: binary_op : ( PLUS variable -> PLUS ^( VAR variable ) | MINUS variable -> MINUS ^( VAR variable ) | DIVIDE variable -> DIVIDE ^( VAR variable ) | -> EPSILON );
    public final QueryLanguageParser.binary_op_return binary_op() throws RecognitionException {
        QueryLanguageParser.binary_op_return retval = new QueryLanguageParser.binary_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS177=null;
        Token MINUS179=null;
        Token DIVIDE181=null;
        QueryLanguageParser.variable_return variable178 =null;

        QueryLanguageParser.variable_return variable180 =null;

        QueryLanguageParser.variable_return variable182 =null;


        Object PLUS177_tree=null;
        Object MINUS179_tree=null;
        Object DIVIDE181_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:189:2: ( PLUS variable -> PLUS ^( VAR variable ) | MINUS variable -> MINUS ^( VAR variable ) | DIVIDE variable -> DIVIDE ^( VAR variable ) | -> EPSILON )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:189:4: PLUS variable
                    {
                    PLUS177=(Token)match(input,PLUS,FOLLOW_PLUS_in_binary_op1790);  
                    stream_PLUS.add(PLUS177);


                    pushFollow(FOLLOW_variable_in_binary_op1792);
                    variable178=variable();

                    state._fsp--;

                    stream_variable.add(variable178.getTree());

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
                    // 189:20: -> PLUS ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_PLUS.nextNode()
                        );

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:189:28: ^( VAR variable )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:190:4: MINUS variable
                    {
                    MINUS179=(Token)match(input,MINUS,FOLLOW_MINUS_in_binary_op1809);  
                    stream_MINUS.add(MINUS179);


                    pushFollow(FOLLOW_variable_in_binary_op1811);
                    variable180=variable();

                    state._fsp--;

                    stream_variable.add(variable180.getTree());

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
                    // 190:21: -> MINUS ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_MINUS.nextNode()
                        );

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:190:30: ^( VAR variable )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:191:4: DIVIDE variable
                    {
                    DIVIDE181=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_binary_op1828);  
                    stream_DIVIDE.add(DIVIDE181);


                    pushFollow(FOLLOW_variable_in_binary_op1830);
                    variable182=variable();

                    state._fsp--;

                    stream_variable.add(variable182.getTree());

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
                    // 191:22: -> DIVIDE ^( VAR variable )
                    {
                        adaptor.addChild(root_0, 
                        stream_DIVIDE.nextNode()
                        );

                        // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:191:32: ^( VAR variable )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:192:4: 
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
                    // 192:4: -> EPSILON
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:194:1: boolean_op : ( GT -> GT | GTE -> GTE | LT -> LT | LTE -> LTE | NOT_EQUAL -> NOT_EQUAL | LOGIC_EQUALS -> LOGIC_EQUALS );
    public final QueryLanguageParser.boolean_op_return boolean_op() throws RecognitionException {
        QueryLanguageParser.boolean_op_return retval = new QueryLanguageParser.boolean_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GT183=null;
        Token GTE184=null;
        Token LT185=null;
        Token LTE186=null;
        Token NOT_EQUAL187=null;
        Token LOGIC_EQUALS188=null;

        Object GT183_tree=null;
        Object GTE184_tree=null;
        Object LT185_tree=null;
        Object LTE186_tree=null;
        Object NOT_EQUAL187_tree=null;
        Object LOGIC_EQUALS188_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_LOGIC_EQUALS=new RewriteRuleTokenStream(adaptor,"token LOGIC_EQUALS");
        RewriteRuleTokenStream stream_NOT_EQUAL=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL");
        RewriteRuleTokenStream stream_LTE=new RewriteRuleTokenStream(adaptor,"token LTE");
        RewriteRuleTokenStream stream_GTE=new RewriteRuleTokenStream(adaptor,"token GTE");

        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:195:2: ( GT -> GT | GTE -> GTE | LT -> LT | LTE -> LTE | NOT_EQUAL -> NOT_EQUAL | LOGIC_EQUALS -> LOGIC_EQUALS )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:195:4: GT
                    {
                    GT183=(Token)match(input,GT,FOLLOW_GT_in_boolean_op1859);  
                    stream_GT.add(GT183);


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
                    // 195:8: -> GT
                    {
                        adaptor.addChild(root_0, 
                        stream_GT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:196:4: GTE
                    {
                    GTE184=(Token)match(input,GTE,FOLLOW_GTE_in_boolean_op1869);  
                    stream_GTE.add(GTE184);


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
                    // 196:9: -> GTE
                    {
                        adaptor.addChild(root_0, 
                        stream_GTE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:197:4: LT
                    {
                    LT185=(Token)match(input,LT,FOLLOW_LT_in_boolean_op1879);  
                    stream_LT.add(LT185);


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
                    // 197:8: -> LT
                    {
                        adaptor.addChild(root_0, 
                        stream_LT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:198:4: LTE
                    {
                    LTE186=(Token)match(input,LTE,FOLLOW_LTE_in_boolean_op1889);  
                    stream_LTE.add(LTE186);


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
                    // 198:9: -> LTE
                    {
                        adaptor.addChild(root_0, 
                        stream_LTE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:199:4: NOT_EQUAL
                    {
                    NOT_EQUAL187=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolean_op1899);  
                    stream_NOT_EQUAL.add(NOT_EQUAL187);


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
                    // 199:14: -> NOT_EQUAL
                    {
                        adaptor.addChild(root_0, 
                        stream_NOT_EQUAL.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:200:4: LOGIC_EQUALS
                    {
                    LOGIC_EQUALS188=(Token)match(input,LOGIC_EQUALS,FOLLOW_LOGIC_EQUALS_in_boolean_op1908);  
                    stream_LOGIC_EQUALS.add(LOGIC_EQUALS188);


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
                    // 200:17: -> LOGIC_EQUALS
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
    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:202:1: logical_op : ( AND -> AND | OR -> OR );
    public final QueryLanguageParser.logical_op_return logical_op() throws RecognitionException {
        QueryLanguageParser.logical_op_return retval = new QueryLanguageParser.logical_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND189=null;
        Token OR190=null;

        Object AND189_tree=null;
        Object OR190_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");

        try {
            // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:203:2: ( AND -> AND | OR -> OR )
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
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:203:4: AND
                    {
                    AND189=(Token)match(input,AND,FOLLOW_AND_in_logical_op1922);  
                    stream_AND.add(AND189);


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
                    // 203:9: -> AND
                    {
                        adaptor.addChild(root_0, 
                        stream_AND.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\query\\QueryLanguage.g:204:4: OR
                    {
                    OR190=(Token)match(input,OR,FOLLOW_OR_in_logical_op1932);  
                    stream_OR.add(OR190);


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
                    // 204:8: -> OR
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


 

    public static final BitSet FOLLOW_queries_in_startrule262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_queries280 = new BitSet(new long[]{0x0000000082000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_query_in_queries282 = new BitSet(new long[]{0x0000000082000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_query_name_in_query293 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_foreach_query_in_query295 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_print_stmt_in_query297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_select_query_in_query330 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_print_stmt_in_query332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_name_in_query363 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_query365 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_FILTER_in_query367 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_query369 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_print_stmt_in_query371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_query_name413 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_query_name415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_in_foreach_query437 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_foreach_query439 = new BitSet(new long[]{0x0000240080000000L});
    public static final BitSet FOLLOW_node_chain_in_foreach_query441 = new BitSet(new long[]{0x0000000480000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_foreach_query443 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_in_clause_in_foreach_query446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_foreach_query448 = new BitSet(new long[]{0x0000010000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_with_clause_in_foreach_query450 = new BitSet(new long[]{0x0000010000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_foreach_where_in_foreach_query452 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_stat_statements_in_foreach_query454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_foreach_where495 = new BitSet(new long[]{0x0040242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_boolean_exp_in_foreach_where497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_query523 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_select_query525 = new BitSet(new long[]{0x0000240080000000L});
    public static final BitSet FOLLOW_node_chain_in_select_query527 = new BitSet(new long[]{0x0000010480000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_select_query529 = new BitSet(new long[]{0x0000000480000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_select_query531 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_in_clause_in_select_query534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_select_query536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_with_clause_in_select_query538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_select_where_in_select_query540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_select_where581 = new BitSet(new long[]{0x0040242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_boolean_exp_in_select_where583 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_stat_statements_in_select_where585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_in_clause620 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_in_clause622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_with_clause644 = new BitSet(new long[]{0x0000242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_with_clause646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AS_in_with_clause648 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_with_clause650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain685 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain687 = new BitSet(new long[]{0x0000240080000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain712 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_node_chain714 = new BitSet(new long[]{0x0400000000001080L});
    public static final BitSet FOLLOW_attr_in_node_chain716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_node_chain766 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_keywords_in_node_chain768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_node_chain791 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_node_chain793 = new BitSet(new long[]{0x0000240080000000L});
    public static final BitSet FOLLOW_node_chain_in_node_chain795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_node_chain816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_node839 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NODE_TYPE_in_node841 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_GT_in_node843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQ_BRACKET_in_node852 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_node854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RIGHT_SQ_BRACKET_in_node856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords874 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CONTAINS_in_keywords876 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords878 = new BitSet(new long[]{0x0200240080000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords896 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IS_in_keywords898 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords900 = new BitSet(new long[]{0x0200240080000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_keywords919 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_HAS_in_keywords921 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keywords923 = new BitSet(new long[]{0x0200240080000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_keywords925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keywords927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_keyword_nodes946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_keyword_nodes959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_op_in_keyword_nodes972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_attr990 = new BitSet(new long[]{0x0400000000001080L});
    public static final BitSet FOLLOW_attr_in_attr992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1011 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CONTAINS_in_attr1013 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1015 = new BitSet(new long[]{0x0200240080000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1033 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IS_in_attr1035 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1037 = new BitSet(new long[]{0x0200240080000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_attr1056 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_HAS_in_attr1058 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_attr1060 = new BitSet(new long[]{0x0200240080000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_attr1062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_attr1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTES_in_attr1078 = new BitSet(new long[]{0x0400000000001080L});
    public static final BitSet FOLLOW_attr_in_attr1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_property1133 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_PERIOD_in_property1135 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CONTAINS_in_property1137 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_property1139 = new BitSet(new long[]{0x0200240080000010L});
    public static final BitSet FOLLOW_keyword_nodes_in_property1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_property1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable1170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLON_in_variable1172 = new BitSet(new long[]{0x0400000000001080L});
    public static final BitSet FOLLOW_attr_in_variable1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_chain_in_variable1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_variable1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESERVED_TYPES_in_variable1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_block1242 = new BitSet(new long[]{0x0000240080000000L,0x000000000000100AL});
    public static final BitSet FOLLOW_block_statements_in_block1244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_block1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_block_statements1271 = new BitSet(new long[]{0x0000240080000000L,0x0000000000001002L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATER_in_block_statements1289 = new BitSet(new long[]{0x0000240080000000L,0x0000000000001002L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_chain_in_block_statements1306 = new BitSet(new long[]{0x0000250080000000L,0x0000000000001002L});
    public static final BitSet FOLLOW_block_in_block_statements1308 = new BitSet(new long[]{0x0000240080000000L,0x0000000000001002L});
    public static final BitSet FOLLOW_block_statements_in_block_statements1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt1346 = new BitSet(new long[]{0x0000A42080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_stmt_in_print_stmt1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SEMICOLON_in_print_stmt1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_stat_statements1372 = new BitSet(new long[]{0x0000242182000000L,0x000000000000024CL});
    public static final BitSet FOLLOW_statements_in_stat_statements1374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_stat_statements1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_assn_in_statements1399 = new BitSet(new long[]{0x0000242182000000L,0x0000000000000244L});
    public static final BitSet FOLLOW_statements_in_statements1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statements1416 = new BitSet(new long[]{0x0000242182000000L,0x0000000000000244L});
    public static final BitSet FOLLOW_statements_in_statements1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_in_statements1434 = new BitSet(new long[]{0x0000242182000000L,0x0000000000000244L});
    public static final BitSet FOLLOW_statements_in_statements1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_statements1452 = new BitSet(new long[]{0x0000242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_assn_in_statements1454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_WHERE_in_statements1456 = new BitSet(new long[]{0x0040242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_boolean_exp_in_statements1458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SEMICOLON_in_statements1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_stmt1489 = new BitSet(new long[]{0x0801000000020000L});
    public static final BitSet FOLLOW_binary_op_in_variable_stmt1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_variable_stmt1517 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_variable_stmt1519 = new BitSet(new long[]{0x0000242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_variable_stmt1521 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_variable_stmt1523 = new BitSet(new long[]{0x0000242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_variable_stmt1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_variable_stmt1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_assn1547 = new BitSet(new long[]{0x0000001000084000L});
    public static final BitSet FOLLOW_variable_assn_right_in_variable_assn1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_variable_assn_right1569 = new BitSet(new long[]{0x0000A42080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_stmt_in_variable_assn_right1571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPOUND_ADD_in_variable_assn_right1587 = new BitSet(new long[]{0x0000A42080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_stmt_in_variable_assn_right1589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCREMENT_in_variable_assn_right1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable_assn_right1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1622 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_if_statement1624 = new BitSet(new long[]{0x0040242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_boolean_exp_in_if_statement1626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_if_statement1628 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_if_statement1630 = new BitSet(new long[]{0x0000242182000000L,0x000000000000024CL});
    public static final BitSet FOLLOW_statements_in_if_statement1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_if_statement1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_boolean_stmt1663 = new BitSet(new long[]{0x0080680018000000L});
    public static final BitSet FOLLOW_boolean_right_in_boolean_stmt1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_op_in_boolean_right1686 = new BitSet(new long[]{0x0000242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_boolean_right1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_stmt_in_boolean_exp1715 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_boolean_exp_cont_in_boolean_exp1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_boolean_exp1732 = new BitSet(new long[]{0x0040242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_boolean_exp_in_boolean_exp1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_op_in_boolean_exp_cont1759 = new BitSet(new long[]{0x0040242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_boolean_exp_in_boolean_exp_cont1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_binary_op1790 = new BitSet(new long[]{0x0000242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_binary_op1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_binary_op1809 = new BitSet(new long[]{0x0000242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_binary_op1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_binary_op1828 = new BitSet(new long[]{0x0000242080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_binary_op1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_boolean_op1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_boolean_op1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_boolean_op1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_boolean_op1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolean_op1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGIC_EQUALS_in_boolean_op1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_logical_op1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_op1932 = new BitSet(new long[]{0x0000000000000002L});

}