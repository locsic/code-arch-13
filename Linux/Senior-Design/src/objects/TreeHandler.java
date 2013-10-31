package objects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.jdt.core.*;
import org.eclipse.jdt.core.dom.*;

public class TreeHandler {

	public String project;
	public File origin;
	public CompilationUnit root = null; // root node of AST of origin file
	public File treeFile; 
	
	//Generate the tree from source
	public void GenerateInitialTree() throws IOException
	{		
		int fileLength = (int)origin.length();
		FileReader fr = new FileReader(origin);
		char source[] = new char[fileLength];

		fr.read(source, 0, fileLength);
		fr.close();
		
		// Set up parsing		
		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setSource(source);

		// Perform parse
		root = (CompilationUnit) parser.createAST(null);
	}
	
	public boolean saveToFile()
	{
		return false;
	}
	
	public boolean reconstructFromFile()
	{
		return false;
	}

}
