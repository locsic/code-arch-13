package algorithm;

import org.eclipse.core.runtime.Assert;

import query.QueryHandler;

// The SearchCriteria class is intended to abstract away the decision about which result trees match and
// which don't. The current implementation is a stub which can only support either a single node type or
// two node types connected with the ... or * operators.
public class SearchCriteria {

	Class searchClass;
	String op;
	Class operandClass;
	
	public SearchCriteria()
	{
		try
		{
			searchClass = Class.forName("org.eclipse.jdt.core.dom." + QueryHandler.searchNodeType);
				
			if (!(Class.forName("org.eclipse.jdt.core.dom.ASTNode").isAssignableFrom(searchClass)))
			{
				System.out.println(QueryHandler.searchNodeType + " is not an ASTNode.");
				Assert.isTrue(false);
			}
			// System.out.println(nodetype);
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("Class " + QueryHandler.searchNodeType + " not found.");
			Assert.isTrue(false);			
		}

		try
		{
			operandClass = Class.forName("org.eclipse.jdt.core.dom." + QueryHandler.searchNodeOperand);
				
			if (!(Class.forName("org.eclipse.jdt.core.dom.ASTNode").isAssignableFrom(operandClass)))
			{
				System.out.println(QueryHandler.searchNodeOperand + " is not an ASTNode.");
				Assert.isTrue(false);
			}
			// System.out.println(nodetype);
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("Class " + QueryHandler.searchNodeOperand + " not found.");
			//Assert.isTrue(false);			
		}
		
		op = QueryHandler.searchNodeOp;
	}
	
}
