package main;
import results.ResultsHandler;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedList;

import org.antlr.runtime.RecognitionException;

import projects.ProjectProcessor;
import query.QueryHandler;
import query.QueryNodeTypeClassifier;
import objects.ProjectTree;
import objects.ResultTree;

public class Controller {
	//public static String ROOT = "C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\";
	//public static String ROOT = "C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\data_area\\";
	public static String ROOT = "/home/nocsi/Working/REPO/code-arch-13/Data/";
	//public static String ROOT = "";
	public static boolean DEBUG = false;
	public static boolean DOWNLOAD = false;
	//public static boolean DOWNLOAD = true;
	public static LinkedList<ProjectTree> projectsList = new LinkedList<ProjectTree>(); 

	public static void getProjectDir()
	{
		String s = Controller.class.getProtectionDomain().getCodeSource().getLocation().getPath().toString();
		try {
			String s1 = URLDecoder.decode(s,"UTF-8");
			String s2 = new File(s1).getPath().toString();
			//ROOT = s2.substring(0,s2.length()-3)+ "src\\";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void TestProjects()
	{
		if(DEBUG) System.out.println("before download");
		ProjectProcessor.DownloadProjects(false);
		//ProjectProcessor.DownloadProjects(true);
		if(DEBUG) System.out.println("post download");
		if(!DEBUG)
			ProjectProcessor.UnZipProjects();
		ProjectProcessor.BuildProjectTrees();
		if(DEBUG) System.out.println("build trees");

		if(DEBUG)
			for (ProjectTree p : projectsList)
			{
				System.out.println("print: " + p.projectName);
				p.print();
			}
	}

	public static void TestQuery()
	{

		try {
			QueryHandler.ReadUserQuery();
			QueryHandler.printQueries();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public static void TestFileTreeCreation()
	{
		objects.FileTree t = new objects.FileTree(new File(ROOT + "projects//ProjectProcessor.java"),"Senior-Design");

		algorithm.TreeSearch.HasSubTree(t.root, "InputStream is = process.getInputStream();			InputStreamReader isr = new InputStreamReader(is);");

	}

	public static void TestTreeSearchAlgorithm()
	{
		objects.FileTree t = new objects.FileTree(new File(ROOT + "projects\\ProjectProcessor.java"),"Senior-Design");
		int nodetype = QueryNodeTypeClassifier.ClassifyNode(QueryHandler.searchNodeType);
		System.out.println(nodetype);
		algorithm.TreeSearchAlgorithm.HasSubTree(t.root, nodetype);	
	}

	public static void TestProjectTreeSearchAlgorithm()
	{
		LinkedList<ResultTree> resultTrees;
		if(QueryHandler.queryName.equals("EPSILON")){
			QueryHandler.queryName = "Q3";
			query.QueryHandler.searchNodeType = "type_declaration";
			resultTrees = algorithm.Search.SearchTrees(projectsList);
			//LinkedList<ResultTree> resultTrees1 = algorithm.Search.SearchTrees(projectsList);
			//query.QueryHandler.searchNodeType = "interface_declaration";
			//resultTrees = algorithm.Search.SearchResultTrees(resultTrees1);
		}
		else{
			query.QueryHandler.getParent = true;
			resultTrees = algorithm.Search.SearchTrees(projectsList);
		}


		if (QueryHandler.printSum)
			ResultsHandler.PrintNumResults(resultTrees);
		else
			ResultsHandler.PrintResults(resultTrees);		
	}

	public static void GetProjects()
	{
		ProjectProcessor.DownloadProjects(DOWNLOAD);
		if(DOWNLOAD)
			ProjectProcessor.UnZipProjects();
		ProjectProcessor.BuildProjectTrees();
	}

	public static void InterpretQuery() throws Exception
	{
		QueryHandler.ReadUserQuery();
	}

	public static void SearchAlgorithm()
	{
		LinkedList<ResultTree> resultTrees;
		resultTrees = algorithm.Search.SearchTrees(projectsList);

		if (QueryHandler.printSum)
			ResultsHandler.PrintNumResults(resultTrees);
		else
			ResultsHandler.PrintResults(resultTrees);
	}


	public static void Run()
	{
		try{
			GetProjects();
			
			try{
				InterpretQuery();
				
				try{
					SearchAlgorithm();
				}
				catch (Exception e)
				{
					System.out.println("Error during Search");
					e.printStackTrace();
				}
			}catch (Exception e)
			{
				System.out.println("Error during query interpretation:");
				e.printStackTrace();
			}
		}
		catch (Exception e)
		{
			System.out.println("Error during project download");
			e.printStackTrace();
		}

	}

	public static void Test()
	{
		try{
			TestProjects();
			TestQuery();
			TestProjectTreeSearchAlgorithm();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		getProjectDir();
		System.out.println(ROOT);
		//TestProjects();
		//TestQuery();
		//TestFileTreeCreation();
		//TestTreeSearchAlgorithm();

		Run();
	}

}
