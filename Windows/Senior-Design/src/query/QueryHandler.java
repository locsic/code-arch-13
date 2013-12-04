package query;

import java.io.IOException;
import java.util.LinkedList;

import main.Controller;
import objects.NodeChain;
import objects.Query;
import objects.ResultTree;
import objects.SelectorNode;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

public class QueryHandler {

	static public String searchNodeType = null;
	static public String searchNodeNumber = null;
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

	public static void ReadUserQuery () throws IOException, RecognitionException
	{
		String file = Controller.ROOT + "input.txt";
		CharStream cs = new ANTLRFileStream(file);
		System.out.println(cs);
		QueryLanguageLexer lexer = new QueryLanguageLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		QueryLanguageParser parser = new QueryLanguageParser(tokens);
		CommonTree tree = (CommonTree)parser.startrule().getTree();
		
		simplePrintTree(tree, 4);
		
		System.out.println("Begin processing.");
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

	public static void simplePrintTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);

			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
					printTree((CommonTree)t.getChild(i), indent+1);
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
					System.out.println(sb.toString() + query.nodeChains.getLast().name);
				}
				else if (t.getChild(i).getText().toString().equals("WHERE_BLOCK"))
				{
					CommonTree sw = (CommonTree)t.getChild(0);
					query.addWhereClause(sw);
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
					System.out.println(sb.toString() + query.nodeChains.getLast().name);
				}
				else if (t.getChild(i).getText().toString().equals("WHERE_BLOCK"))
				{
					CommonTree sw = (CommonTree)t.getChild(i).getChild(0);
					query.addWhereClause(sw);
					
					System.out.println("(Where Block)");
					printTree((CommonTree)t.getChild(i), indent+1);
				}
				else
					printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}

	//public static void GetSearchNode(CommonTree t, int indent) 
	//{
		 //= GetSearchNode(t, indent);
	//}
	public static NodeChain GetSearchNode(CommonTree t, int indent)
	{
		Query dummyQuery = new Query();
		return GetSearchNode(t, indent, dummyQuery);
	}
	
	public static NodeChain GetSearchNode(CommonTree t, int indent, Query query)
	{
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
					query.newNodeChain();
					searchNodeType = t.getChild(i).getChild(0).getText().toString();
					query.addSelectorNode(searchNodeType, SelectorNode.NODE);
					System.out.println(sb.toString() + "node: " + searchNodeType);
				}
				else 
				{
					if (query.nodeChains.size() == 0) query.newNodeChain();
					if (t.getChild(i).getText().toString().equals("ATTRIBUTE"))				
					{
						String node = t.getChild(i).getChild(0).getText().toString();
						query.addSelectorNode(node, SelectorNode.ATTR);
						System.out.println(sb.toString() + "attr: " + node);
					}
					else if (t.getChild(i).getText().toString().equals("PROPERTY"))
					{
						String node = t.getChild(i).getChild(0).getText().toString();
						if (node == "VAR_NAME")
						{
							node = t.getChild(i).getChild(0).getChild(0).getText().toString();
							query.setNodeChainName(node);
						}
						query.addSelectorNode(node, SelectorNode.PROP);
						System.out.println(sb.toString() + "prop: " + node);
					}
					else //if  (t.getChild(i).getText().toString().equals("NODE"))
					{
						GetSearchNode((CommonTree)t.getChild(i), indent+1, query);
					}
				}
			}
		}
		
		return query.nodeChains.getLast();		
	}

	public static LinkedList<ResultTree> applyWhere(
			LinkedList<ResultTree> resultTrees) {

	LinkedList<ResultTree> passedResultTrees = new LinkedList<ResultTree>();
		
		for(Query q: queries)
		{
			for(ResultTree r: resultTrees)
			{
				q.bindVars(r);
				boolean passed = true;
				if (q.whereClause != null)
				{
					passed = q.whereClause.evaluate(r, q.nodeChains);					
				}
				if (passed == true)
				{
					passedResultTrees.add(r);
					System.out.println("Where clause passed!");					
				}
				else
				{
					System.out.println("Where clause failed.");
				}
			}
		}

		return passedResultTrees;
	}
}
