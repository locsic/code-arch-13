package objects;
import java.util.*;

import org.antlr.runtime.tree.CommonTree;

public class Query {
	public String queryName;
	public LinkedList <NodeChain> nodeChains;
	public LinkedList<Query> nestedQueries;
	public BooleanStatement whereClause;
	public LinkedList<Statement> statements;	
	public String searchOp;
	public NodeChain searchOperand;
	//private LinkedList<SelectorNode> printNodeChain;
	//public LinkedList<>

	public Query()
	{
		nodeChains = new LinkedList <NodeChain>();
		queryName = null;
		nestedQueries = null;
		whereClause = null;
		statements = new LinkedList <Statement>();
		searchOp = null;
		searchOperand = null;
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

	public void addContains(NodeChain n)
	{
		nodeChains.getLast().contains = n.nodeList.getFirst();		
	}
	
	public void addWhereClause(CommonTree ct)
	{
		if (ct != null)	whereClause = new BooleanStatement(ct);
	}
	
	public void addStatements(CommonTree ct)
	{
		for (CommonTree child : (Collection <CommonTree>)(ct.getChildren()))
		{
			if (child.getText().toString().equals("STATEMENT"))
			{
				addStatement(child);
				addStatements(child);
			}
		}
	}
	
	public void addStatement(CommonTree ct)
	{
		if (ct != null) statements.add(new Statement(ct));
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
		nodeChains.getFirst().setBinding(r);		
	}
}
