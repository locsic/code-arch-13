package algorithm;
import java.util.LinkedList;
import java.util.List;

import objects.*;
import query.QueryHandler;
import query.QueryNodeTypeClassifier;
public class Search {

	public static LinkedList<ResultTree> SearchTrees (List<ProjectTree> trees)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();
		
		for(ProjectTree proj: trees)
			results.addAll(SearchTree(proj.projectTree));
		return results;
	}

	
	public static LinkedList<ResultTree> SearchTree(DirectoryTree tree)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();
		
		//int nodetype = QueryNodeTypeClassifier.ClassifyNode(QueryHandler.searchNodeType);
		Class nodetype = QueryNodeTypeClassifier.ClassifyNodeC(QueryHandler.searchNodeType);
		//System.out.println(nodetype);
		
		for(DirectoryTree dir: tree.dirs)
			results.addAll(SearchTree(dir));
		
		for(FileTree fileTree: tree.files){
			algorithm.TreeSearchAlgorithm.HasSubTree(fileTree.root, nodetype);	
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
		
		//int nodetype = QueryNodeTypeClassifier.ClassifyNode(QueryHandler.searchNodeType);
		Class nodetype = QueryNodeTypeClassifier.ClassifyNodeC(QueryHandler.searchNodeType);

		for(ResultTree proj: trees)
			results.addAll(SearchResultTree(proj));
		return results;
	}
	
	public static LinkedList<ResultTree> SearchResultTree(ResultTree tree)
	{
		LinkedList<ResultTree> results = new LinkedList<ResultTree>();
		Class nodetype = QueryNodeTypeClassifier.ClassifyNodeC(QueryHandler.searchNodeType);
		//int nodetype = QueryNodeTypeClassifier.ClassifyNode(QueryHandler.searchNodeType);
		//System.out.println(nodetype);

			algorithm.TreeSearchAlgorithm.HasSubTree(tree.root, nodetype);
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
