package objects;

import java.util.LinkedList;

import org.antlr.runtime.tree.CommonTree;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import query.QueryHandler;
import query.QueryLanguageParser;

public class BooleanStatement {

	public CommonTree booleanTree;
	
	BooleanStatement(CommonTree ct)
	{
		booleanTree = ct;
	}
	
	public boolean evaluate(ResultTree result, LinkedList <NodeChain> bindings)
	{
		return evaluate(booleanTree, result, bindings);
	}	
	
	boolean evaluate(CommonTree ct, ResultTree result, LinkedList <NodeChain> bindings)
	{
		if (bindings == null) bindings = new LinkedList <NodeChain>();
		
		// The first child of a BOOL_EXP is always a VAR or epsilon
		
		CommonTree varTree;
		int varResult;
		
		if (ct.getChild(0).getText().toString() == "EPSILON")
		{
			varResult = 1; // return true
		}
		else
		{
			varTree = (CommonTree)ct.getChild(0);
			varResult = evaluateVar((CommonTree) varTree.getChild(0), result, bindings);
		
			// The second child is always a BOOLEAN_OP variable or EPSILON
			if (ct.getChild(1).getText() != "EPSILON")
			{
				CommonTree booleanOp = (CommonTree) ct.getChild(1);
				CommonTree innerVarTree = (CommonTree)booleanOp.getChild(0);
				int innerVarResult = evaluateVar(innerVarTree, result, bindings);
				
				String operation = booleanOp.getText().toString();
				varResult = applyOperation(varResult, innerVarResult, operation);
			}
	
			// The third child is always a phony BOOL_EXPR containing a LOGICAL_OP BOOL_EXP or EPSILON
			if (ct.getChild(2).getChild(0).getText() != "EPSILON")
			{
				CommonTree phonyBoolExp = (CommonTree)ct.getChild(2);
				String logicalOp = phonyBoolExp.getChild(0).getText().toString();
				CommonTree innerBoolExp = (CommonTree)phonyBoolExp.getChild(1);
				boolean boolExpResult = evaluate(innerBoolExp, result, bindings); 
				varResult = applyOperation(varResult, boolExpResult == false ? 0 : 1, logicalOp);
			}
		}

		System.out.println("BOOL EXP evaluated, returning " + varResult);
		return varResult == 0 ? false : true;		
	}
	
	int evaluateVar(CommonTree ct, ResultTree result, LinkedList <NodeChain> bindings)
	{
//		variable	
//		:	ID COLON attr				-> ^(VAR_NAME ID attr)
//		|	node_chain 				-> ^(NODE_CHAIN node_chain)
//		|	INTEGER 				-> INTEGER
//		|	RESERVED_TYPES				-> RESERVED_TYPES	
//		;
		if (ct.getType() == QueryLanguageParser.INTEGER)
		{
			Integer intVal = new Integer(ct.getText());
			return intVal.intValue();
		}
		else if (ct.getText() == "NODE_CHAIN")
		{
			CommonTree node_chain_ct = (CommonTree)ct;
			NodeChain nodeChain = QueryHandler.GetSearchNode(node_chain_ct, 0);
			// find a matching variable in the bindings
			for (NodeChain nc : bindings)
			{
				if (nc.name != null && nc.name.equals(nodeChain.name))
				{
					String stringResult = null;
					boolean stringResultFound = false;
					int intResult = 0;
					boolean intResultFound = false;
					ASTNode currentResult = result.root; 
					
					if (currentResult instanceof VariableDeclarationFragment)
					{
						stringResultFound = true;
						stringResult = ((VariableDeclarationFragment)currentResult).getName().getIdentifier();
					}
					else if (currentResult instanceof NumberLiteral)
					{
						intResultFound = true;
						try
						{
							intResult = (new Integer(((NumberLiteral)currentResult).getToken())).intValue();
						}
						catch (NumberFormatException nfe)
						{
							System.out.println("Couldn't resolve variable " + nodeChain.name + " to boolean/integer, will return 0");							
						}
						return intResult;
					}
					// still here, haven't found anything usable
					System.out.println("Couldn't resolve variable " + nodeChain.name + " to boolean/integer, will return 0");
				}
			}
			// we failed to find a matching variable, report error
			System.out.println("Couldn't match variable " + nodeChain.name + ", will return 0");
			
		}
		
		return 0;
	}
		
	int applyOperation(int l, int r, String operation)
	{
		int out = 0;
		
		if (operation.matches("=="))			
		{
			out = (l == r) == false ? 0 : 1; 
		}
		else if (operation.matches("||"))			
		{
			out = ((l == 0 ? false : true) || (r == 0 ? false : true)) == false ? 0 : 1; 
		}
		else if (operation.matches("&&"))			
		{
			out = ((l == 0 ? false : true) && (r == 0 ? false : true)) == false ? 0 : 1; 
		}
		else if (operation.matches("!="))			
		{
			out = (l != r) == false ? 0 : 1; 
		}
		else if (operation.matches(">"))			
		{
			out = (l > r) == false ? 0 : 1; 
		}
		else if (operation.matches(">="))			
		{
			out = (l >= r) == false ? 0 : 1; 
		}
		else if (operation.matches("<"))			
		{
			out = (l < r) == false ? 0 : 1; 
		}
		else if (operation.matches("<="))		
		{
			out = (l <= r) == false ? 0 : 1; 
		}				
		return out; 
	}
}