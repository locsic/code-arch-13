package objects;
import java.util.*;

import org.antlr.runtime.tree.CommonTree;

import query.QueryHandler;

public class Query {
	public boolean nullQuery; // A null query has statements but no actual query
	public boolean isTopLevel;
	public String queryName;
	public LinkedList <NodeChain> nodeChains;
	public LinkedList<Query> nestedQueries;
	public BooleanStatement whereClause;
	public CommonTree inClause;
	public LinkedList<Statement> statements;	
	public String searchOp;
	public NodeChain searchOperand;
	public String searchNodeOperand = null;
	public String searchNodeOp = null;
	//private LinkedList<SelectorNode> printNodeChain;
	//public LinkedList<>
	public String searchNodeType = null;
	public LinkedList<ResultTree> resultTrees = null;

	public Query()
	{
		nodeChains = new LinkedList <NodeChain>();
		isTopLevel = false;
		queryName = null;
		nestedQueries = null;
		whereClause = null;
		statements = new LinkedList <Statement>();
		searchOp = null;
		searchOperand = null;
		nullQuery = false;
		inClause = null;
		//printNodeChain = null;
	}

	public void setQueryName(String name)
	{
		queryName = name;
	}
	
	public void newNodeChain()
	{
		nodeChains.add(new NodeChain());
	}

	public void setNodeChainName(String name)
	{
		nodeChains.getLast().name = name;
	}

	public void addSelectorNode(String node, int type)
	{
		nodeChains.getLast().add(new SelectorNode(node, type));
	}

	public SelectorNode nextSelectorNode()
	{
		return nodeChains.getLast().isEmpty() ? null : nodeChains.getLast().remove();
	}

	public void addContains(NodeChain n, int containsType)
	{
		if (n.nodeList.isEmpty())
		{
			nodeChains.getLast().contains = new SelectorNode(n.name, SelectorNode.PROP);
		}
		else
		{
			nodeChains.getLast().contains = n.nodeList.getFirst();
		}
		
		nodeChains.getLast().containsType = containsType;
	}
	
	public void addWhereClause(CommonTree ct)
	{
		if (ct != null)	whereClause = new BooleanStatement(ct);
	}
	
	public void addStatements(CommonTree ct)
	{
		for (CommonTree child : (Collection <CommonTree>)(ct.getChildren()))
		{
			if (child.getText().toString().equals("QUERY"))
			{
				// For normal statements, add to the statement list of this query.
				// For Query statements, insert a dummy statement to indicate when to
				// process the second query								
				QueryHandler.QueryBuilder((CommonTree)(child.getChild(0)), 0, false);
				addStatement((CommonTree)child);
			}
			else if (child.getText().toString().equals("STATEMENT"))
			{
				addStatement(child);
				addStatements(child);
			}
		}
	}
	
	public void addStatement(CommonTree ct)
	{
		if (ct != null && ct.getChild(0) != null && !ct.getChild(0).getText().toString().equals("EPSILON")) 
			statements.add(new Statement(ct));
	}

	public String print()
	{
		String out = "";
//		out += this.queryName + "\n";
		out += "selector: ";
		for(SelectorNode n : (this.nodeChains.getLast().nodeList))
		{
			out += n.nodeText + " ";
		}
		out += "\n" + this.nodeChains.getLast().name;
		out += "\nwhere: ";
		//if (whereClause != null)
//			for(BooleanStatement b: this.whereClause)
			//{
//				out +=   " ";
			//}

		return out;
	}

	public void bindVars(ResultTree r) {
		if (r != null && !nodeChains.isEmpty())
		{
			nodeChains.getFirst().setBinding(r);
			if (r.operandRoot != null)
			{
				ResultTree innerResultTree = new ResultTree(r.operandRoot);
				searchOperand.resultTree = innerResultTree;
			}
		}
	}
}
