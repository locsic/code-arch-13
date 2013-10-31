package objects;
import java.util.*;

public class Query {
	public String queryName;
	private LinkedList<SelectorNode> nodeChain;
	public String nodeChainName;
	public LinkedList<Query> nestedQueries;
	public LinkedList<BooleanStatement> whereClause;
	public LinkedList<Statement> statements;
	private LinkedList<SelectorNode> printNodeChain;
	//public LinkedList<>

	public Query()
	{
		nodeChain = new LinkedList<SelectorNode>();
		queryName = null;
		nestedQueries = null;
		whereClause = null;
		printNodeChain = null;
	}

	public void setQueryName(String name)
	{
		queryName = name;
	}

	public void setNodeChainName(String name)
	{
		nodeChainName = name;
	}

	public void addSelectorNode(String node, int type)
	{
		nodeChain.add(new SelectorNode(node, type));
	}

	public SelectorNode nextSelectorNode()
	{
		return nodeChain.isEmpty() ? null : nodeChain.remove();
	}

	public void addBooleanStatement()
	{

	}


	public String print()
	{
		String out = "";
		out += this.queryName + "\n";
		out += "selector: ";
		for(SelectorNode n : this.nodeChain)
		{
			out += n.nodeText + " ";
		}
		out += "\n" + this.nodeChainName;
		out += "\nwhere: ";
		if (whereClause != null)
			for(BooleanStatement b: this.whereClause)
			{
				out +=   " ";
			}

		return out;
	}
}
