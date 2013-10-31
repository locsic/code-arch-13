package objects;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class ResultTree extends FileTree {
	
	public ASTNode root;
	
	public ResultTree(ASTNode root)
	{
		this.root = root;
	}

	public ResultTree(ASTNode root, FileTree originTree)
	{
		this.root =  root;
		super.origin = originTree.origin;
		super.project = originTree.project;
	}
	
	public ResultTree(ASTNode root, ResultTree originTree)
	{
		this.root =  root;
		super.origin = originTree.origin;
		super.project = originTree.project;
	}
	
	public String PrintTree()
	{
		return super.project + "\n" + super.origin.toString().split("ProjectSource\\\\")[1] + "\n\n" + root.toString();
	}
	
	public void saveTree()
	{
		// write to file
	}
	
	public ASTNode getRoot()
	{
		if (this.root == null)
		{
			//read from file
		}
		
		return this.root;
	}
}
