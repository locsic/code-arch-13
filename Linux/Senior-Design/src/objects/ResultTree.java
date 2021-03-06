package objects;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class ResultTree extends FileTree {
	
	public ASTNode root;
	private String flat;
	
	public ResultTree(ASTNode root)
	{
		this.root = root;
	}
	
	public ResultTree(ASTNode root, String flat)
	{
		this.root = root;
		this.flat = flat;
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
		return super.project + "\n" + super.origin.toString().split("ProjectSource/")[1] + "\n\n" + root.toString();

		//return super.project + "\n" + super.origin.toString().split("ProjectSource/")[1] + "\n\n" + root.toString();
	}
	
	public String TreeFlattener()
	{
		return "";
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
	
	public boolean saveToFile()
	{
		String destFile = "";
		try{
			FileWriter fstream = new FileWriter(destFile);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(PrintTree());
			out.close();
		} catch (Exception e){
			System.err.println("Error: " + e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean reconstructFromFile()
	{
		return false;
	}
}
