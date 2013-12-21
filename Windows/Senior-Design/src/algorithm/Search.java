package algorithm;
import java.util.LinkedList;
import java.util.List;
import java.lang.reflect.*;

import org.eclipse.core.runtime.Assert;

import objects.*;
import query.QueryHandler;
public class Search {

	public static LinkedList<ResultTree> SearchTrees (List<ProjectTree> trees)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();
		LinkedList r = new LinkedList();
//		
		for(ProjectTree proj: trees)
			results.addAll(SearchTree(proj.projectTree));
		return results;
	}

	
	public static LinkedList<ResultTree> SearchTree(DirectoryTree tree)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();
		
		Class searchClass = null;
		
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
		
		for(DirectoryTree dir: tree.dirs)
			results.addAll(SearchTree(dir));
		
		for(FileTree fileTree: tree.files){
			algorithm.TreeSearchAlgorithm.HasSubTree(fileTree.root, searchClass);	
			for (ResultTree t: algorithm.TreeSearchAlgorithm.matches)
			{
				t.project = fileTree.project;
				t.origin = fileTree.origin;				
				results.add(t);
			}
			//results.addAll(algorithm.TreeSearchAlgorithm.matches);
		}
		
		return results;
	}
	
	public static LinkedList<ResultTree> SearchResultTrees (List<ResultTree> trees)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();
		
		for(ResultTree proj: trees)
			results.addAll(SearchTree(proj));
		return results;
	}
	
	public static LinkedList<ResultTree> SearchTree(ResultTree tree)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();

		Class searchClass = null;
		
		try
		{
			searchClass = Class.forName("org.eclipse.jdt.core.dom." + QueryHandler.searchNodeType);
			
			if (!(Class.forName("org.eclipse.jdt.core.dom.ASTNode").isAssignableFrom(searchClass)))
			{
				System.out.println(QueryHandler.searchNodeType + " is not an ASTNode.");
				Assert.isTrue(false);
			}
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("Class " + QueryHandler.searchNodeType + " not found.");
			Assert.isTrue(false);			
		}

		//System.out.println(nodetype);

			algorithm.TreeSearchAlgorithm.HasSubTree(tree.root, searchClass);
			for (ResultTree t: algorithm.TreeSearchAlgorithm.matches)
			{
				t.project = tree.project;
				t.origin = tree.origin;
				results.add(t);
			}
			//results.addAll(algorithm.TreeSearchAlgorithm.matches);
		
		return results;
	}
}
