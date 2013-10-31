package algorithm;

import java.util.LinkedList;

import main.Controller;
import objects.*;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTMatcher;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.*;

public class TreeSearchAlgorithm extends ASTVisitor{

	// During tree traversal, keep track of the source tree we are searching and the
	// tree containing the search string 
	private ASTNode treeToSearch;
	private int nodeType;
	public static LinkedList<ResultTree> matches;

	public static void HasSubTree(ASTNode tree, int search)
	{ 
		// perform search using AST visitor -- as we visit each node, compare to the search string
		//matches = new LinkedList<ResultTree>();
		matches = new LinkedList<ResultTree>();
		TreeSearchAlgorithm staticSearchVisitor = new TreeSearchAlgorithm(tree, search);
		tree.accept(staticSearchVisitor);
		//return matches;
	}

	// Constructor
	public TreeSearchAlgorithm(ASTNode sourceToSearch, int nodeType)
	{
		this.treeToSearch = sourceToSearch;
		this.nodeType = nodeType;
	}

	// Visits each node in source file during tree traversal and compares against
	// search tree
	public void preVisit(ASTNode node)
	{	
		if(Controller.DEBUG)
			System.out.print(".");
		// Use ASTMatcher to compare this node against the search tree
		if (node.getNodeType() == nodeType)
		{
			//if(Controller.DEBUG)
			//System.out.println(treeToSearch.getLineNumber(node.getStartPosition()));
			if(!query.QueryHandler.getParent)
				matches.add(new ResultTree(node));
			else
				matches.add(new ResultTree(node.getParent()));
			
			// Add checks for attr/prop
			
			//if(testAttribute(node))
			//	matches.add(new ResultTree(node));

		}
	}

	public boolean testAttribute(ASTNode node)
	{
		boolean isFound = false;
		TypeDeclaration t = (TypeDeclaration) node;
		//System.out.println(t.getName());
		if(!t.isInterface()){
			//System.out.println(t.isInterface());
			System.out.println("test");
			for(Object o: t.superInterfaceTypes())
			{
				if (o.toString().equals("Comparable"))
					isFound=true;
			}
		}
		return isFound;
	}





}
