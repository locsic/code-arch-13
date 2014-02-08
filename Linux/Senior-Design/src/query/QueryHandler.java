package query;

import java.io.IOException;
import java.util.LinkedList;

import main.Controller;
import objects.Query;
import objects.SelectorNode;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

public class QueryHandler {

	static public String searchNodeType = null;
	static public String[] searchNodeTypeArray = null;
	static public String queryName = null;
	static public boolean printSum = false;
	static public boolean getParent = false;

	static public LinkedList<Query> queries = null;
	
	public static void printQueries()
	{
		for(Query q: queries)
		{
			System.out.println(q.print());
		}
	}
	
	public static int queryNum()
	{
		return queries.size();
	}

	public static void ReadUserQuery () throws IOException, RecognitionException
	{
		searchNodeTypeArray = new String[10];
		String file = Controller.ROOT + "input.txt";
		CharStream cs = new ANTLRFileStream(file);
		System.out.println(cs);
		QueryLanguageLexer lexer = new QueryLanguageLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		QueryLanguageParser parser = new QueryLanguageParser(tokens);
		CommonTree tree = (CommonTree)parser.startrule().getTree();
		printTree(tree,4);
		System.out.println("Searching For: " + searchNodeType);

		/*// Prints
	    DOTTreeGenerator gen = new DOTTreeGenerator();

	    StringTemplate st = gen.toDOT(tree);
	    System.out.println(st);
		 */

		/*
		System.out.println(parser.startrule());
		RuleReturnScope result = parser.startrule();
		System.out.println(result.toString());*/

		/*String src = "true && (false || true && (true || false))";
	    ASTDemoLexer lexer = new ASTDemoLexer(new ANTLRStringStream(src));
	    ASTDemoParser parser = new ASTDemoParser(new CommonTokenStream(lexer));
	    CommonTree tree = (CommonTree)parser.parse().getTree();
	    DOTTreeGenerator gen = new DOTTreeGenerator();
	    StringTemplate st = gen.toDOT(tree);
	    System.out.println(st);*/
	}
	
	public static void parseQuery(CommonTree t, int indent){
		if (t != null){
			StringBuffer sb = new StringBuffer(indent);
			
			if(t.getParent() != null){
				if(t.getText()!= null){
					String node = t.getText().toString();
					//Start of query
					if(node.equals("QUERIES"))
					{
						queries = new LinkedList<Query>();
					}
					else
					{
						System.out.println("here2: " + t.getText().toString());
					}
				}
			}
			for (int i = 0; i < indent; i++)
				sb = sb.append("   ");
			for(int i = 0; i < t.getChildCount(); i++){
				//Build Query
				if(t.getChild(i).getText().toString().equals("QUERY"))
				{
					QueryBuilder((CommonTree)t.getChild(i), indent+1);
				}
				//Recurse
				else{
					parseQuery((CommonTree)t.getChild(i), indent+1);
				}
			}
		}
	}

	public static void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);

			if (t.getParent() == null){
				if(t.getText() != null){
					String node = t.getText().toString();
					System.out.println(sb.toString() + t.getText().toString());	
					if (node.equals("QUERIES"))
					{
						queries = new LinkedList<Query>();
					}
					else
					{
						System.out.println("here2: " + t.getText().toString());
					}
				}
			}
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				if (t.getChild(i).getText().toString().equals("QUERY"))
				{
					QueryBuilder((CommonTree)t.getChild(i), indent+1);
					//printTree((CommonTree)t.getChild(i), indent+1);
				}
				else{
					//System.out.println("here: " + t.getChild(i).getText().toString());
					printTree((CommonTree)t.getChild(i), indent+1);
				}
			}
		}
	}

	public static void QueryBuilder(CommonTree t, int indent)
	{
		StringBuffer sb = new StringBuffer(indent);
		for ( int i = 0; i < indent; i++ )
			sb = sb.append("   ");
		
		Query query = new Query();
		for ( int i = 0; i < t.getChildCount(); i++ ) {
			System.out.println(sb.toString() + t.getChild(i).toString());
			if (t.getChild(i).getText().toString().equals("QUERY_NAME"))
			{
				queryName = ((CommonTree)t.getChild(i).getChild(0)).getText().toString();
				System.out.println(sb.toString() + queryName);
				query.setQueryName(queryName);
			}
			if (t.getChild(i).getText().toString().equals("FOR_QUERY"))
			{
				ForQueryBuilder((CommonTree)t.getChild(i), indent+1, query);
			}
			else if (t.getChild(i).getText().toString().equals("SELECT_QUERY"))
			{
				SelectQueryBuilder((CommonTree)t.getChild(i), indent+1, query);
			}
			else if ((t.getChild(i).getText().toString().equals("PRINT")))
			{
				queries.add(query);
			}
		}
	}

	public static void ForQueryBuilder(CommonTree t, int indent, Query query) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);

			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				if (t.getChild(i).getText().toString().equals("NODE_CHAIN"))
				{
					GetSearchNode((CommonTree)t.getChild(i),indent+1, query);
				}
				else if (t.getChild(i).getText().toString().equals("CHAIN_ID"))
				{
					query.setNodeChainName(((CommonTree)t.getChild(i).getChild(0)).getText().toString());
					System.out.println(sb.toString() + query.nodeChainName);
				}
				else
					printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}

	public static void SelectQueryBuilder(CommonTree t, int indent, Query query) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);

			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				if (t.getChild(i).getText().toString().equals("NODE_CHAIN"))
				{
					GetSearchNode((CommonTree)t.getChild(i),indent+1, query);
				}
				else if (t.getChild(i).getText().toString().equals("CHAIN_ID"))
				{
					query.setNodeChainName(((CommonTree)t.getChild(i).getChild(0)).getText().toString());
					System.out.println(sb.toString() + query.nodeChainName);
				}
				else
					printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}

	public static void GetSearchNode(CommonTree t, int indent, Query query) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);

			if (t.getParent() == null){
				if(t.getText()!=null){
					String node = t.getText().toString();
					System.out.println(sb.toString() + t.getText().toString());	
				}
			}
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				if(t.getChild(i).getText().toString().equals("NODE_NAME"))
				{
					searchNodeType = t.getChild(i).getChild(0).getText().toString();
					searchNodeTypeArray[queryNum()] = t.getChild(i).getChild(0).getText().toString();
					query.addSelectorNode(searchNodeType, SelectorNode.NODE);
					System.out.println(sb.toString() + "node: " + searchNodeType);
				}
				else if (t.getChild(i).getText().toString().equals("ATTRIBUTE"))
				{
					String node = t.getChild(i).getChild(0).getText().toString();
					query.addSelectorNode(node, SelectorNode.ATTR);
					System.out.println(sb.toString() + "attr: " + node);
				}
				else if (t.getChild(i).getText().toString().equals("PROPERTY"))
				{
					String node = t.getChild(i).getChild(0).getText().toString();
					query.addSelectorNode(node, SelectorNode.PROP);
					System.out.println(sb.toString() + "prop: " + node);
				}
				else //if  (t.getChild(i).getText().toString().equals("NODE"))
					GetSearchNode((CommonTree)t.getChild(i), indent+1, query);
			}
		}
	}
}
