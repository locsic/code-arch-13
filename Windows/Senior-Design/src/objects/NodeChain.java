package objects;

import java.util.LinkedList;

import org.eclipse.core.runtime.Assert;

public class NodeChain {
	public LinkedList <SelectorNode> nodeList;
	public String name;
	public ResultTree resultTree;
	
	public NodeChain()
	{
		nodeList = new LinkedList <SelectorNode> ();
	}

	public boolean isEmpty() {
		return nodeList.isEmpty();
	}

	public SelectorNode remove() {		
		return nodeList.remove();
	}

	public void add(SelectorNode selectorNode) {
		nodeList.add(selectorNode);		
	}

	public void setBinding(ResultTree r) {
		resultTree = r;		
	}
	
	
}
