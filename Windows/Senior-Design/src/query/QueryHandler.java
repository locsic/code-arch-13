package query;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedList;

import main.Controller;
import objects.NodeChain;
import objects.Query;
import objects.ResultTree;
import objects.SelectorNode;
import objects.Statement;
import objects.NodeChain.VarResult;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jdt.core.dom.ASTNode;

import java.util.Properties;

public class QueryHandler {
	public static boolean getParent = false;
	public static boolean printSum = false;
	static public LinkedList<Query> queries = null;
	static public LinkedList <NodeChain> localVars = new LinkedList <NodeChain> ();
	static String queryFileName = null;
	
	public static void printQueries()
	{
		for(Query q: queries)
		{
			System.out.println(q.print());
		}
	}
	
	public static LinkedList <ResultTree> executeQuery(Query query, Query parent, LinkedList <ResultTree> inputTrees)
	{
		LinkedList <ResultTree> resultTrees;
		
		if (query.nullQuery)
		{
			resultTrees = inputTrees;
			ResultTree dummyTree = new ResultTree((ASTNode)null);
			LinkedList <ResultTree> dummyTrees = new LinkedList <ResultTree> ();
			dummyTrees.add(dummyTree);
			QueryHandler.applyStatements(query, dummyTrees);
		}
		else
		{
			if (query.inClause != null)
			{
				VarResult result = NodeChain.evaluateVar(query.inClause, parent.nodeChains, localVars, true);
				if (result.ASTNodeResultFound != true)
				{
					Assert.isTrue(false, "In clause evaluation did not result in a node chain");
				}
				inputTrees = new LinkedList <ResultTree> ();
				inputTrees.add(new ResultTree(result.ASTNodeResult));
				
				resultTrees = algorithm.Search.SearchTrees(query, inputTrees);
			}
			else
			{
				if (inputTrees == null)
				{
					resultTrees = algorithm.Search.SearchTrees(query, Controller.projectsList);
				}
				else
				{
					resultTrees = algorithm.Search.SearchTrees(query, inputTrees);
				}
			}
			
			if (parent != null) 
			{
				if (!query.nodeChains.containsAll(parent.nodeChains))
				{
					query.nodeChains.addAll(parent.nodeChains);
				}
			}
			
			resultTrees = QueryHandler.applyWhere(resultTrees, query);
			
			query.resultTrees = resultTrees;
			
			// Apply the STATEMENTS in the query body to the remaining results
			QueryHandler.applyStatements(query, resultTrees);
			
			QueryHandler.writeLocals(Controller.ROOT + "locals.properties");
		}
		
		return resultTrees;
	}

	public static void ReadUserQuery (String queryFile) throws IOException, RecognitionException
	{
		String file = Controller.ROOT + queryFile;
		queryFileName = new String(queryFile);
		CharStream cs = null;
		try
		{
			cs = new ANTLRFileStream(file);
		}
		catch (Exception e)
		{
			System.out.println("Couldn't open query file " + queryFile + ". Exception: " + e.getMessage());
			System.exit(0);
		}
		System.out.println(cs);
		QueryLanguageLexer lexer = new QueryLanguageLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		QueryLanguageParser parser = new QueryLanguageParser(tokens);
		CommonTree tree = (CommonTree)parser.startrule().getTree();

		System.out.println("----------------------------");
		reallySimplePrintTree(tree, 4);
		System.out.println("----------------------------");

		// Note -- strangely, this simplePrintTree is where the QueryBuilder gets executed
		
		simplePrintTree(tree, 4);
		
		System.out.println("Begin processing.");
		printTree(tree,4);
		System.out.println("Searching For: " + queries.getFirst().searchNodeType);

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

	public static void reallySimplePrintTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);

			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
					reallySimplePrintTree((CommonTree)t.getChild(i), indent+1);
			}
		}
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

			if (t.getParent() != null){
				if(t.getText() != null){
					String node = t.getParent().getText().toString();
					System.out.println(sb.toString() + t.getParent().getText().toString());	
					if (node.equals("QUERIES"))
					{
						queries = new LinkedList<Query>();
					}
					else
					{
						//System.out.println("here2: " + t.getParent().getText().toString());
					}
					
				}
			}
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				if (t.getChild(i).getText().toString().equals("QUERY"))
				{
					QueryBuilder((CommonTree)t.getChild(i), indent+1, true);
					//printTree((CommonTree)t.getChild(i), indent+1);
				}
				else if (t.getChild(i).getText().toString().equals("STATEMENTS"))
				{
					// Make sure this STATEMENTS isn't part of a query
					boolean processThisStatements = true;
					CommonTree parent = (CommonTree)t.getChild(i).getParent();
					if (parent != null)
					{
						if (!parent.getText().toString().equals("QUERIES"))
						{
							processThisStatements = false;
						}	
						
						if (t.getChild(i).getChildIndex() != 0)
						{
							int index = t.getChild(i).getChildIndex();
							CommonTree olderSibling = (CommonTree)t.getChild(i).getParent().getChild(index - 1);
							
							if (!olderSibling.getText().toString().equals("QUERY") ||
									!parent.getText().toString().equals("QUERIES"))
							{
								processThisStatements = false;
							}								
						}
					}
					
					if (processThisStatements == true)
					{
						Query dummyQuery = new Query();
						
						dummyQuery.nodeChains = new LinkedList <NodeChain> ();
						dummyQuery.addStatements((CommonTree)t.getChild(i));
						dummyQuery.nullQuery = true;
						dummyQuery.isTopLevel = true;
						
						ResultTree result = new ResultTree((ResultTree)null);

						if (!dummyQuery.statements.isEmpty())
						{
							queries.addLast(dummyQuery);
						}
					}
					//QueryHandler.applyStatements(dummyQuery, result);
				}
			}
		}
	}

	public static void QueryBuilder(CommonTree t, int indent, boolean isTopLevel)
	{
		StringBuffer sb = new StringBuffer(indent);
		for ( int i = 0; i < indent; i++ )
			sb = sb.append("   ");
		
		Query query = new Query();

		query.isTopLevel = isTopLevel;
		
		queries.addLast(query);
		
		for ( int i = 0; i < t.getChildCount(); i++ ) {
			System.out.println(sb.toString() + t.getChild(i).toString());
			if (t.getChild(i).getText().toString().equals("QUERY_NAME"))
			{
				query.setQueryName(((CommonTree)t.getChild(i).getChild(0)).getText().toString());
				System.out.println(sb.toString() + query.queryName);
			}
			if (t.getChild(i).getText().toString().equals("FOR_QUERY"))
			{
				//ForQueryBuilder((CommonTree)t.getChild(i), indent+1, query);
			}
			else if (t.getChild(i).getText().toString().equals("SELECT_QUERY"))
			{
				SelectQueryBuilder((CommonTree)t.getChild(i), indent+1, query);
			}
			else if ((t.getChild(i).getText().toString().equals("PRINT")))
			{
			}
		}
	}

//	public static void ForQueryBuilder(CommonTree t, int indent, Query query) {
//		if ( t != null ) {
//			StringBuffer sb = new StringBuffer(indent);
//
//			for ( int i = 0; i < indent; i++ )
//				sb = sb.append("   ");
//			for ( int i = 0; i < t.getChildCount(); i++ ) {
//				System.out.println(sb.toString() + t.getChild(i).toString());
//				if (t.getChild(i).getText().toString().equals("NODE_CHAIN"))
//				{
//					GetSearchNode((CommonTree)t.getChild(i),indent+1, query);
//				}
//				else if (t.getChild(i).getText().toString().equals("CHAIN_ID"))
//				{
//					query.setNodeChainName(((CommonTree)t.getChild(i).getChild(0)).getText().toString());
//					System.out.println(sb.toString() + query.nodeChains.getLast().name);
//				}
//				else if (t.getChild(i).getText().toString().equals("WHERE_BLOCK"))
//				{
//					CommonTree sw = (CommonTree)t.getChild(i);
//					
//					for (CommonTree whereChild : (Collection <CommonTree>)(sw.getChildren()))
//					{
//						if (whereChild.getText().toString().equals("BOOL_EXP"))
//						{
//							query.addWhereClause(whereChild);						
//						}
//						if (whereChild.getText().toString().equals("STATEMENTS"))
//						{
//							query.addStatements(whereChild);
//						}
//					}
//				}				
//				else
//					printTree((CommonTree)t.getChild(i), indent+1);
//			}
//		}
//	}

	public static void SelectQueryBuilder(CommonTree t, int indent, Query query) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);

			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				if (t.getChild(i).getText().toString().equals("IN_CLAUSE"))
				{
					CommonTree in_clause = (CommonTree)t.getChild(i);
					if (in_clause.getChild(0).getType() != QueryLanguageLexer.EPSILON)
					{
						query.inClause = (CommonTree)in_clause.getChild(0);
					}
				}
				else if (t.getChild(i).getText().toString().equals("NODE_CHAIN"))
				{
					GetSearchNode((CommonTree)t.getChild(i),indent+1, query);
				}
				else if (t.getChild(i).getText().toString().equals("NODE_CHAIN_OP"))
				{					
					int opType = t.getChild(i).getChild(0).getType();
					
					if (opType != QueryLanguageLexer.EPSILON)
					{					
						if (opType == QueryLanguageLexer.STAR)
						{
							query.searchOp = "*";
							query.searchNodeOp = "*";
						}
						else
						{
							query.searchOp = "...";
							query.searchNodeOp = "...";
						}
						
						String tempSearchNodeType = query.searchNodeType;
						query.searchOperand = GetSearchNode((CommonTree)t.getChild(i).getChild(0),indent+1);
						query.searchOperand.name = t.getChild(i).getChild(0).getChild(1).getChild(0).getText().toString();
						query.searchNodeType = tempSearchNodeType;
						query.searchNodeOperand = query.searchOperand.nodeList.getFirst().nodeText;
						query.nodeChains.add(query.searchOperand);
					}
				}
				else if (t.getChild(i).getText().toString().equals("CHAIN_ID"))
				{
					query.setNodeChainName(((CommonTree)t.getChild(i).getChild(0)).getText().toString());
					System.out.println(sb.toString() + query.nodeChains.getLast().name);
				}
				else if (t.getChild(i).getText().toString().equals("WHERE_BLOCK"))
				{
					CommonTree sw = (CommonTree)t.getChild(i);
					//query.addWhereClause((CommonTree)sw.getChild(0));
					
					System.out.println("(Where Block)");
					printTree((CommonTree)t.getChild(i), indent+1);
					
					if (sw.getChildren() != null)
					{
						for (CommonTree whereChild : (Collection <CommonTree>)(sw.getChildren()))
						{
							if (whereChild.getText().toString().equals("BOOL_EXP"))
							{
								query.addWhereClause(whereChild);						
							}
							else if (whereChild.getText().toString().equals("STATEMENTS"))
							{
								query.addStatements(whereChild);
							}
						}
					}
				}
				else
				{
					printTree((CommonTree)t.getChild(i), indent+1);
				}
			}
		}
	}

	public static NodeChain GetSearchNode(CommonTree t, int indent)
	{
		Query dummyQuery = new Query();
		return GetSearchNode(t, indent, dummyQuery);
	}
	
	static public int dummy1()
	{
		int i = 0;
		int j = 1;
		for (i = 0; i < 10000000; i++)
		{
			j = j+1;
		}
		return j;
	}
	static public int dummy2()
	{
		int i = 0;
		int j = 1;
		for (i = 0; i < 10000000; i++)
		{
			j = j+1;
		}
		return j;
	}
	static public int dummy3()
	{
		int i = 0;
		int j = 1;
		for (i = 0; i < 10000000; i++)
		{
			j = j+1;
		}
		return j;
	}
	static public int dummy4()
	{
		int i = 0;
		int j = 1;
		for (i = 0; i < 10000000; i++)
		{
			j = j+1;
		}
		return j;
	}
	static public int dummy5()
	{
		int i = 0;
		int j = 1;
		for (i = 0; i < 10000000; i++)
		{
			j = j+1;
		}
		return j;
	}
	static public int dummy6()
	{
		int i = 0;
		int j = 1;
		for (i = 0; i < 10000000; i++)
		{
			j = j+1;
		}
		return j;
	}
	static public int dummy7()
	{
		int i = 0;
		int j = 1;
		for (i = 0; i < 10000000; i++)
		{
			j = j+1;
		}
		return j;
	}
	
	public static NodeChain GetSearchNode(CommonTree t, int indent, Query query)
	{
		if ( t != null ) {
			//StringBuffer sb = new StringBuffer(indent);

			//if (t.getParent() == null){
			//	if(t.getText()!=null){
					//String node = t.getText().toString();
					//System.out.println(sb.toString() + t.getText().toString());	
			//	}
			//}
			//for ( int i = 0; i < indent; i++ )
				//sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				//System.out.println(sb.toString() + t.getChild(i).toString());
				String childStr = t.getChild(i).getText().toString(); 
				if(childStr.equals("NODE_NAME"))
				{
					//dummy1();
					query.newNodeChain();
					//searchNodeType = t.getChild(i).getChild(0).getText().toString();
					query.addSelectorNode(query.searchNodeType, SelectorNode.NODE);
					//System.out.println(sb.toString() + "node: " + query.searchNodeType);
				}
				else if (childStr.equals("AST_CHILD"))
				{
					//dummy2();
					if (query.nodeChains.size() == 0) query.newNodeChain();
					query.searchNodeType = t.getChild(i).getChild(0).getText().toString();
					query.addSelectorNode(query.searchNodeType, SelectorNode.AST_CHILD);
					//System.out.println(sb.toString() + "ast_child: " + query.searchNodeType);					
				}
				else if (childStr.equals("contains") ||
						 childStr.equals("isparent") ||
						 childStr.equals("isnodetype"))
				{
					//dummy3();
					// "Contains" only implemented for AST child right now
					CommonTree contains = (CommonTree)t.getChild(i);
					int containsType = 0;
					
					if (childStr.equals("contains"))
					{
						containsType = NodeChain.CONTAINS;
					}
					else if (childStr.equals("isparent"))
					{
						containsType = NodeChain.ISPARENT;
					}
					else if (childStr.equals("isnodetype"))
					{
						containsType = NodeChain.ISNODETYPE;
					}
					else
					{
						Assert.isTrue(false, "Invalid contains type:" + childStr);
					}
					//CommonTree containsAstChild = (CommonTree)contains.getChild(0);
					//String containsAstChildString = containsAstChild.getText().toString();
					if (query.nodeChains.size() == 0) query.newNodeChain();
					NodeChain containsNC = GetSearchNode(contains, 0);
					query.addContains(containsNC, containsType);
					//query.addContains(n)
				}
				else 
				{
					if (query.nodeChains.size() == 0) query.newNodeChain();
					if (childStr.equals("ATTRIBUTE"))				
					{
						//dummy4();
						String node = t.getChild(i).getChild(0).getText().toString();
						query.addSelectorNode(node, SelectorNode.ATTR);
						//System.out.println(sb.toString() + "attr: " + node);
					}
					else if (childStr.equals("VAR_NAME"))
					{
						//dummy5();
						String node = t.getChild(i).getChild(0).getText().toString();
						
						query.setNodeChainName(node);
						//System.out.println(sb.toString() + "var_name: " + node);
						
						GetSearchNode((CommonTree)t.getChild(i), indent+1, query);
					}
					else if (childStr.equals("PROPERTY"))
					{
						//dummy6();
						String node = t.getChild(i).getChild(0).getText().toString();
						if (node == "VAR_NAME")
						{
							node = t.getChild(i).getChild(0).getChild(0).getText().toString();
							query.setNodeChainName(node);
						}
						query.addSelectorNode(node, SelectorNode.PROP);
						
						GetSearchNode((CommonTree)t.getChild(i), indent+1, query);

						//System.out.println(sb.toString() + "prop: " + node);
					}
 					else if (childStr.startsWith("NODE"))//if  (t.getChild(i).getText().toString().equals("NODE"))
					{
 						//dummy7();
						GetSearchNode((CommonTree)t.getChild(i), indent+1, query);
					}
 					else 
 					{
 						//GetSearchNode((CommonTree)t.getChild(i), indent+1, query);
 					}
 					
				}
			}
		}
		
		return query.nodeChains.getLast();		
	}
	
	public static void applyStatements(Query q, LinkedList<ResultTree> resultTrees)
	{
		for(ResultTree r: resultTrees)
		{
			applyStatements(q, r);
		}
	}

	public static void applyStatements(Query q, ResultTree r)
	{
		q.bindVars(r);
		for (Statement s: q.statements)
		{
			if (s.isQueryStatement)
			{
				executeQuery(s.query, q, null);
			}
			else
			{
				s.evaluate(r, q.nodeChains, localVars);
			}
		}
	}

	public static LinkedList<ResultTree> applyWhere(
			LinkedList<ResultTree> resultTrees,
			Query q) {

		LinkedList<ResultTree> passedResultTrees = new LinkedList<ResultTree>();
		
		for(ResultTree r: resultTrees)
		{
			q.bindVars(r);
			boolean passed = true;
			if (q.whereClause != null)
			{
				passed = q.whereClause.evaluate(r, q.nodeChains, localVars);					
			}
			if (passed == true)
			{
				passedResultTrees.add(r);
				//System.out.println("Where clause passed!");					
			}
			else
			{
				//System.out.println("Where clause failed.");
			}
		}

		return passedResultTrees;
	}

	public static void readLocals(String filename) {
		try
		{
			FileReader fr = new FileReader(filename);
			Properties p = new Properties();
			p.load(fr);

			for (Enumeration<?> e = p.propertyNames(); e.hasMoreElements();)
			{
				String key = (String)(e.nextElement());
				String value = p.getProperty(key);

				NodeChain nc = new NodeChain();
				nc.nodeList = new LinkedList<SelectorNode>();
				nc.localVarValue = new NodeChain.VarResult();
				nc.name = new String(key);
				
				try
				{
				   Integer i = new Integer(value);				  

				   nc.localVarValue.intResultFound = true;
				   nc.localVarValue.intResult = i;
				   nc.localVarValue.stringResultFound = false;
				   nc.localVarValue.stringResult = null;
				}
				catch (NumberFormatException nfe)
				{
				   nc.localVarValue.intResultFound = false;
				   nc.localVarValue.intResult = 0;
				   nc.localVarValue.stringResultFound = true;
				   nc.localVarValue.stringResult = new String(value);
				}
				
				localVars.add(nc);
			}
			fr.close();
		}
		catch (Exception e)
		{
			System.out.println("Couldn't read properties file " + filename + ". Exception: " + e.toString());
			
			// not a fatal error -- continue on		
		}
		
	}

	public static void writeLocals(String filename) {
		
		// add the query name to the locals
		try
		{
			FileWriter fw = new FileWriter(filename);
			Properties p = new Properties();
			for (NodeChain nc : localVars)
			{
				String key = nc.name,
				       value = nc.localVarValue.toString();
				p.setProperty(key, value);
			}
			p.setProperty("query", queryFileName); 
			p.store(fw, "Persistent local query variables");
			fw.close();
		}
		catch (Exception e)
		{
			System.out.println("Couldn't write properties file " + filename + ". Exception: " + e.toString());
			
			// not a fatal error -- continue on		
		}
		
		
	}
}
