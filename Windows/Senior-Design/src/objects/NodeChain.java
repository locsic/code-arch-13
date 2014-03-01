package objects;

import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.StructuralPropertyDescriptor;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import algorithm.Search;
import algorithm.TreeSearchAlgorithm;

import query.QueryHandler;
import query.QueryLanguageParser;

public class NodeChain {
	
	public static class VarResult
	{
		public int intResult;
		public boolean intResultFound;
		public String stringResult;
		public boolean stringResultFound;
		
		public VarResult()
		{
			stringResult = null;
			stringResultFound = false;
			intResult = 0;
			intResultFound = false;
		}
		
		public String toString()
		{
			if (intResultFound) return "" + intResult;
			else if (stringResultFound) return stringResult;
			else return "[no value]";					
		}
	}

	public LinkedList <SelectorNode> nodeList;
	public String name;
	public ResultTree resultTree;
	public VarResult localVarValue;
	
	public SelectorNode contains;
	
	public NodeChain()
	{
		nodeList = new LinkedList <SelectorNode> ();
		localVarValue = null;
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

	static VarResult applyOperation(VarResult l, VarResult r, String operation)
	{
		VarResult vr = new VarResult();
		vr.intResultFound = true;
		
		if (l.intResultFound && r.intResultFound)
		{
			vr = applyIntOperation(l.intResult, r.intResult, operation);
		}
		else if (l.stringResultFound && r.stringResultFound)
		{
			vr = applyStringOperation(l.stringResult, r.stringResult, operation);
		}
		else
		{
			System.out.println("Missing variable result or type mismatch, will return 0");
		}
		return vr;
	}

	static VarResult applyBoolOperation(VarResult l, VarResult r, String operation)
	{
		VarResult vr = applyOperation(l, r, operation);
		
		if (vr.stringResultFound)
		{
			if (vr.stringResult == null || vr.stringResult.equals(""))
			{
				vr.stringResultFound = false;
				vr.stringResult = null;
				vr.intResultFound = true;
				vr.intResult = 0;
			}
			else
			{
				vr.stringResultFound = false;
				vr.stringResult = null;
				vr.intResultFound = true;
				vr.intResult = 1;			
			}
		}
		return vr;
	}

	static VarResult applyStringOperation(String l, String r, String operation)
	{
		VarResult out = new VarResult();
		
		if (operation.matches("=="))			
		{
			out.intResult = (l.equals(r) == false) ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("||"))			
		{
			out.intResult = ((l == null ? false : true) || (r == null ? false : true)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("&&"))			
		{
			out.intResult = ((l == null ? false : true) && (r == null ? false : true)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("!="))			
		{
			out.intResult = !(l.equals(r)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.equals("+"))
		{
			out.stringResult = l.concat(r);
			out.stringResultFound = true;
		}
		else if (operation.equals("-"))
		{
			System.out.println("Invalid string operation, will return 0."); 
		}
		else if (operation.equals("*"))
		{
			System.out.println("Invalid string operation, will return 0."); 
		}
		else if (operation.equals("/"))
		{
			System.out.println("Invalid string operation, will return 0."); 
		}		
		else if (operation.matches(">"))			
		{
			System.out.println("Invalid string operation, will return 0."); 
		}
		else if (operation.matches(">="))			
		{
			System.out.println("Invalid string operation, will return 0."); 
		}
		else if (operation.matches("<"))			
		{
			System.out.println("Invalid string operation, will return 0."); 
		}
		else if (operation.matches("<="))		
		{
			System.out.println("Invalid string operation, will return 0."); 
		}				
		return out;		
	}

	static VarResult applyIntOperation(int l, int r, String operation)
	{
		VarResult out = new VarResult();
		
		if (operation.matches("=="))			
		{
			out.intResult = (l == r) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("||"))			
		{
			out.intResult = ((l == 0 ? false : true) || (r == 0 ? false : true)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("&&"))			
		{
			out.intResult = ((l == 0 ? false : true) && (r == 0 ? false : true)) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("!="))			
		{
			out.intResult = (l != r) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches(">"))			
		{
			out.intResult = (l > r) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches(">="))			
		{
			out.intResult = (l >= r) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("<"))			
		{
			out.intResult = (l < r) == false ? 0 : 1;
			out.intResultFound = true;
		}
		else if (operation.matches("<="))		
		{
			out.intResult = (l <= r) == false ? 0 : 1;
			out.intResultFound = true;
		}				
		else if (operation.equals("+"))		
		{
			out.intResult = l + r;
			out.intResultFound = true;
		}				
		else if (operation.equals("-"))		
		{
			out.intResult = l - r;
			out.intResultFound = true;
		}				
		else if (operation.equals("*"))		
		{
			out.intResult = l * r;
			out.intResultFound = true;
		}				
		else if (operation.equals("/"))		
		{
			out.intResult = l / r;
			out.intResultFound = true;
		}				
		return out; 
	}

	static VarResult evaluateVar(CommonTree ct, LinkedList <NodeChain> bindings)
		{
	//		variable	
	//		:	ID COLON attr				-> ^(VAR_NAME ID attr)
	//		|	node_chain 				-> ^(NODE_CHAIN node_chain)
	//		|	INTEGER 				-> INTEGER
	//		|	RESERVED_TYPES				-> RESERVED_TYPES	
	//		;
			VarResult varResult = new VarResult();
			
			if (ct.getType() == QueryLanguageParser.INTEGER)
			{
				Integer intVal = new Integer(ct.getText());
	
				varResult.intResult = intVal.intValue();
				varResult.intResultFound = true;			
			}
			else if (ct.getType() == QueryLanguageParser.STRING)
			{
				String strVal = new String(ct.getText());
				
				varResult.stringResult = strVal.substring(1, strVal.length()-1);
				varResult.stringResultFound = true;
			}
			else if (ct.getText() == "NODE_CHAIN")
			{
				CommonTree node_chain_ct = (CommonTree)ct;
				NodeChain nodeChain = QueryHandler.GetSearchNode(node_chain_ct, 0);
				// find a matching variable in the bindings
				
				NodeChain nc = findNodeChain(bindings, nodeChain.name);
				
				if (nc != null)
				{
					if (nc.localVarValue != null)
					{
						return nc.localVarValue;
					}
					else // the value of this variable is an AST tree
					{
						ASTNode currentResult = descendNodeChain(nodeChain, nc.resultTree.root);
						
						if (nodeChain.contains != null)
						{
							Class searchClass = Search.getClassFromSearchNodeType(nodeChain.contains.nodeText);

							if (TreeSearchAlgorithm.HasSubTree(currentResult, searchClass))
							{
								varResult.intResultFound = true;
								varResult.intResult = 1;
							}
							else
							{
								varResult.intResultFound = true;
								varResult.intResult = 0;								
							}
							return varResult;
						}						
						else if (currentResult instanceof VariableDeclarationFragment)
						{
							varResult.stringResultFound = true;
							varResult.stringResult = ((VariableDeclarationFragment)currentResult).getName().getIdentifier();
							return varResult;
						}
						else if (currentResult instanceof NumberLiteral)
						{
							varResult.intResultFound = true;
							try
							{
								varResult.intResult = (new Integer(((NumberLiteral)currentResult).getToken())).intValue();							
							}
							catch (NumberFormatException nfe)
							{
								System.out.println("Couldn't resolve variable " + nodeChain.name + " to boolean/integer, will return 0");							
							}
							return varResult;
						}
						else if (currentResult instanceof SimpleName)
						{
							varResult.stringResultFound = true;
							varResult.stringResult = ((SimpleName)currentResult).getIdentifier();
							return varResult;
						}
					}
					// still here, haven't found anything usable
					System.out.println("Couldn't resolve variable " + nodeChain.name + " to boolean/integer, will return 0");
				}
				// we failed to find a matching variable, report error
				System.out.println("Couldn't match variable " + nodeChain.name + ", will return 0");
				
			}
			
			return varResult;
		}

	public static NodeChain findNodeChain(LinkedList <NodeChain> bindings, String name)
	{
		for (NodeChain nc : bindings)
		{
			if (nc.name != null && nc.name.equals(name))
			{
				return nc;
			}
		}
		return null;
	}

	public static ASTNode descendNodeChain(NodeChain nodeChain, ASTNode currentResult)
	{
		// now dive through the chain as necessary
		for (int i = 0; i < nodeChain.nodeList.size(); i++)
		{
			SelectorNode currentNode = nodeChain.nodeList.get(i);

			if (currentNode.nodeType == SelectorNode.AST_CHILD)
			{
				// try to find the matching child name in the result
				List <StructuralPropertyDescriptor> structuralProperties = currentResult.structuralPropertiesForType();
				
				for (StructuralPropertyDescriptor spd : structuralProperties)
				{
					String id = spd.getId();
					
					if (currentNode.nodeText.toLowerCase().equals(id))									
					{
						currentResult = (ASTNode)currentResult.getStructuralProperty(spd);
						break;
					}
				}
			}
		}		
		return currentResult;
	}
	
	
}
