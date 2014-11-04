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
		public ASTNode ASTNodeResult;
		public boolean ASTNodeResultFound;
		
		public VarResult()
		{
			stringResult = null;
			stringResultFound = false;
			intResult = 0;
			intResultFound = false;
			ASTNodeResult = null;
			ASTNodeResultFound = false;
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
	public int containsType;
	
	public static final int CONTAINS = 0;
	public static final int ISPARENT = 1;	
	public static final int ISNODETYPE = 2;	
	
	public NodeChain(NodeChain source)
	{
		nodeList = source.nodeList;
		name = source.name;
		resultTree = source.resultTree;
		localVarValue = source.localVarValue;
	}
	
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
		
		if ((l.intResultFound && r.intResultFound) ||
			(l.intResultFound && !r.stringResultFound) ||
			(r.intResultFound && !l.stringResultFound))
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
		else if (operation.equals("||"))			
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
	
	static VarResult evaluateFunction(CommonTree ct, LinkedList <NodeChain> bindings, LinkedList <NodeChain> locals)
	{
		VarResult varResult = new VarResult();

		CommonTree functionNode = (CommonTree)ct;
		String functionName = functionNode.getText().toString();
		
		if (functionName.equals("depth"))
		{
			CommonTree arg_node_chain_ct = (CommonTree)functionNode.getChild(0);
			NodeChain argNodeChain = QueryHandler.GetSearchNode(arg_node_chain_ct, 0);
			NodeChain nc = findNodeChain(bindings, argNodeChain.name);
			
			if (nc == null)
			{
				nc = findNodeChain(locals, argNodeChain.name);			
			}
			
			ASTNode currentResult = descendNodeChain(argNodeChain, nc.resultTree.root);
			
			varResult.intResultFound = true;
			varResult.intResult =  ResultTree.depth(currentResult);			
		}
		else if (functionName.equals("max") || functionName.equals("min"))
		{
			VarResult vr1 = evaluateVar((CommonTree)functionNode.getChild(0), bindings, new LinkedList <NodeChain> (), false);
			VarResult vr2 = evaluateVar((CommonTree)functionNode.getChild(1), bindings, new LinkedList <NodeChain> (), false);
			
			if (vr1.intResultFound == false)
			{
				vr1 = evaluateVar((CommonTree)functionNode.getChild(0), locals, new LinkedList <NodeChain> (), false); 
			}

			if (vr2.intResultFound == false)
			{
				vr2 = evaluateVar((CommonTree)functionNode.getChild(1), locals, new LinkedList <NodeChain> (), false); 
			}

			varResult.intResultFound = true;
			
			if (functionName.equals("max"))
			{
				varResult.intResult = Math.max(vr1.intResult, vr2.intResult);
			}
			else
			{
				varResult.intResult = Math.min(vr1.intResult, vr2.intResult);
			}
		}
		else
		{		
		
		}
		
		return varResult;
	}

	public static VarResult evaluateVar(CommonTree ct, LinkedList <NodeChain> bindings, LinkedList <NodeChain> locals, boolean ASTResultOK)
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
			else if (ct.getText().equals("FUNCTION"))
			{
				varResult = evaluateFunction((CommonTree)ct.getChild(0), bindings, locals);
			}
			else if (ct.getText().equals("NODE_CHAIN"))
			{
				CommonTree node_chain_ct = (CommonTree)ct;
				NodeChain nodeChain = QueryHandler.GetSearchNode(node_chain_ct, 0);
				// find a matching variable in the bindings
				
				NodeChain nc = findNodeChain(bindings, nodeChain.name);
				
				if (nc == null)
				{
					nc = findNodeChain(locals, nodeChain.name);
				}
				
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
							switch (nodeChain.contains.nodeType)
							{
								case SelectorNode.AST_CHILD : {
									Class searchClass = Search.getClassFromSearchNodeType(nodeChain.contains.nodeText);
									
									if (nodeChain.containsType == ISNODETYPE)
									{
										if (searchClass.isInstance(currentResult))
										{
											varResult.intResultFound = true;
											varResult.intResult = 1;											
										}
										else
										{											
											varResult.intResultFound = true;
											varResult.intResult = 0;
										}
									}
									else if (nodeChain.containsType == CONTAINS)
									{
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
			
									}
									else // ISPARENT has no meaning for an AST_CHILD
									{
										Assert.isTrue(false, "Inappropriate contains type with AST_CHILD");
									}
								} break;
								case SelectorNode.PROP : {
									NodeChain containsNC = findNodeChain(bindings, nodeChain.contains.nodeText);
									
									if (containsNC == null)
									{
										containsNC = findNodeChain(locals, nodeChain.contains.nodeText);
									}
									
									if (containsNC == null)
									{
										Assert.isTrue(false, "Can't find variable within contains");										
									}
									
									ASTNode NCResult = containsNC.resultTree.getRoot();
									
									varResult.stringResultFound = false;
									varResult.stringResult = null;
									varResult.intResultFound = true;
									varResult.intResult = 0;
									
									while (NCResult != null)
									{
										NCResult = NCResult.getParent();
										if (NCResult != null && NCResult.equals(currentResult))
										{
											varResult.intResult = 1;
											break;
										}
										if (nodeChain.containsType == ISPARENT)
										{
											// if this operation is ISPARENT rather than CONTAINS, we
											// should only check the first level up
											break;
										}
									}
								} break;
							}
							return varResult;
						}
						else if (ASTResultOK)
						{
							varResult.ASTNodeResultFound = true;
							varResult.ASTNodeResult = currentResult;
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
						else
						{
							varResult.stringResultFound = true;
							varResult.stringResult = currentResult.toString();
							return varResult;						
						}
					}
					// still here, haven't found anything usable
					//System.out.println("Couldn't resolve variable " + nodeChain.name + " to boolean/integer, will return 0");
				}
				// we failed to find a matching variable, report error
				//System.out.println("Couldn't match variable " + nodeChain.name + ", will return 0");
				
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
				if (currentNode.nodeText.equals(new String("parent")))
				{
					currentResult = currentResult.getParent();
				}
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
