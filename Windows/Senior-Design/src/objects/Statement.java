package objects;

import java.util.LinkedList;

import objects.NodeChain.VarResult;

import org.antlr.runtime.tree.CommonTree;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.NumberLiteral;

import query.QueryHandler;

public class Statement {
	CommonTree statementTree;
	
	Statement(CommonTree ct)
	{
		statementTree = ct;
	}

	public void evaluate(ResultTree result, LinkedList <NodeChain> bindings, LinkedList <NodeChain> locals)
	{
		evaluate(statementTree, result, bindings, locals);
	}	
	
	public static void evaluate(CommonTree ct, ResultTree result, LinkedList <NodeChain> bindings, LinkedList <NodeChain> locals)
	{
		// Only kind of statement currently supported: VAR = EXPR
		
		if (ct.getChild(0).getText().equals("VAR") && ct.getChild(1).getText().equals("VAR_ASSIGN"))
		{
			boolean newVar = false;
			CommonTree varCt = (CommonTree)ct.getChild(0);
			CommonTree varAsnCt = (CommonTree)ct.getChild(1);
			
			NodeChain lvalue = 	QueryHandler.GetSearchNode(varCt, 0);
			
			NodeChain boundNC = NodeChain.findNodeChain(locals, lvalue.name);
			
			if (boundNC == null)
			{
				boundNC = new NodeChain();
				boundNC.name = lvalue.name;
				boundNC.nodeList = new LinkedList<SelectorNode>();
				newVar = true;
			}
			
			// now evaluate the right side of the assignment
			CommonTree varStmt = (CommonTree)varAsnCt.getChild(0);
			CommonTree varVar = (CommonTree)varStmt.getChild(0);
			CommonTree varBinOp = (CommonTree)varStmt.getChild(1);
			
			VarResult v = NodeChain.evaluateVar((CommonTree)varVar.getChild(0), bindings, locals);
			
			if (v.intResultFound == false && v.stringResultFound == false)
			{
				v = NodeChain.evaluateVar((CommonTree)varVar.getChild(0), locals, new LinkedList <NodeChain> ());
			}
			
			if (!((CommonTree)varBinOp.getChild(0)).getText().equals("EPSILON"))
			{
				String operation = varBinOp.getChild(0).getText();
				CommonTree varRVar = (CommonTree)varBinOp.getChild(1); 
				
				VarResult vr = NodeChain.evaluateVar((CommonTree)varRVar.getChild(0), bindings, new LinkedList <NodeChain> ());
				
				if (vr.intResultFound == false && vr.stringResultFound == false)
				{
					vr = NodeChain.evaluateVar((CommonTree)varRVar.getChild(0), locals, new LinkedList <NodeChain> ());
				}
				v = NodeChain.applyOperation(v, vr, operation);
				
				if (vr.intResultFound && !v.intResultFound)
				{
					v.intResultFound = true;
					v.intResult = 0;
				}

				if (vr.stringResultFound && !v.stringResultFound)
				{
					v.stringResultFound = true;
					v.stringResult = "";
				}
			}
			
			boundNC.localVarValue = v;
			if (newVar) locals.add(boundNC);
			System.out.println("Assigning value " + v.toString() + " to variable " + boundNC.name);
		}
		else
		{
			System.out.println("Couldn't evaluate Statement.");
			Assert.isTrue(false);
		}	
	}
}
