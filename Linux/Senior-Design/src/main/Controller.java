package main;
import results.ResultsHandler;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.RecognitionException;

import projects.ProjectProcessor;
import query.QueryHandler;
import query.QueryNodeTypeClassifier;
import objects.ProjectTree;
import objects.ResultTree;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Controller {
	//public static String ROOT = "C:\\Users\\Sara\\Documents\\Java\\Senior-Design\\src\\";
	//public static String ROOT = "C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\data_area\\";
	public static String ROOT = "C:\\Users\\Chervil\\Desktop\\gw\\program_comprehension\\code_archaeology\\data_area\\";
	//public static String ROOT = "/home/nocsi/Working/REPO/code-arch-13/Data/";
	//public static String ROOT = "";
	public static boolean DEBUG = false;
	public static boolean DOWNLOAD = false;
	//public static boolean DOWNLOAD = true;
	public static LinkedList<ProjectTree> projectsList = new LinkedList<ProjectTree>(); 
	// Java won't let us use an array of lists "features"
	
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
		objects.FileTree t = new objects.FileTree(new File(ROOT + "projects\\ProjectProcessor.java"),"Senior-Design");

		algorithm.TreeSearch.HasSubTree(t.root, "InputStream is = process.getInputStream();			InputStreamReader isr = new InputStreamReader(is);");

	}

	public static void TestTreeSearchAlgorithm()
	{
		objects.FileTree t = new objects.FileTree(new File(ROOT + "projects\\ProjectProcessor.java"),"Senior-Design");
		Class nodetype = QueryNodeTypeClassifier.ClassifyNodeC(QueryHandler.searchNodeType);
		//int nodetype = QueryNodeTypeClassifier.ClassifyNode(QueryHandler.searchNodeType);
		System.out.println(nodetype);
		algorithm.TreeSearchAlgorithm.HasSubTree(t.root, nodetype);	
	}

	public static void TestProjectTreeSearchAlgorithm()
	{
		LinkedList<ResultTree> resultTrees;
		if(QueryHandler.queryName.equals("EPSILON")){
			QueryHandler.queryName = "Q3";
			query.QueryHandler.searchNodeType = "type_declaration";
			resultTrees = algorithm.Search.SearchTrees(projectsList, 0);
			//LinkedList<ResultTree> resultTrees1 = algorithm.Search.SearchTrees(projectsList);
			//query.QueryHandler.searchNodeType = "interface_declaration";
			//resultTrees = algorithm.Search.SearchResultTrees(resultTrees1);
		}
		else{
			query.QueryHandler.getParent = true;
			resultTrees = algorithm.Search.SearchTrees(projectsList, 0);
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
		
		final File folder = new File(ROOT+"input/");
		QueryHandler.DirectoryTree(folder);
		QueryHandler.ReadUserQuery();
	}

	public static void SearchAlgorithm()
	{
		//if commandLine.getOptionValue("A") is not None
		//for query in queries
		// algorithm.Search.SearchTree(prev result)
		//if result is NULL, we use the whole project tree
		LinkedList<ResultTree> resultTrees = null;
		for(int i = 0; i < QueryHandler.queryNum(); i++){
			if(i == 0){
				// First run
				resultTrees = algorithm.Search.SearchTrees(projectsList, i);
			}
			else{
				resultTrees = algorithm.Search.SearchResultTrees(ResultsHandler.resultTreeList.get(i-1)); //Get last result as input to next
			}
			ResultsHandler.resultTreeList.add(resultTrees);
		}
		//resultTrees = algorithm.Search.SearchTrees(projectsList, i);
		//ResultsHandler.resultTreeList.add(resultTrees);
		//for(ResultTree Tree: resultTrees){
		//	ResultsHandler.resultTreeList.add(algorithm.Search.SearchTree(Tree));
		//}
		if (QueryHandler.printSum)
			ResultsHandler.PrintNumResults(resultTrees);
		else
			ResultsHandler.PrintResults(resultTrees);
			//ResultsHandler.PrintResultsList(resultsTree);
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
		System.out.println(QueryHandler.queryNum());
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
		CommandLine commandLine;
		Option option_A = OptionBuilder.withArgName("opt3").hasArg().withDescription("The A option").create("A");
        Option option_r = OptionBuilder.withArgName("opt1").hasArg().withDescription("The r option").create("r");
        Option option_S = OptionBuilder.withArgName("opt2").hasArg().withDescription("The S option").create("S");
        Option option_test = new Option("test", "The test option");
        Options options = new Options();
        CommandLineParser parser = new GnuParser();

        String[] testArgs =
        { "-r", "opt1", "-S", "opt2", "arg1", "arg2",
          "arg3", "arg4", "--test", "-A", "opt3", };

        options.addOption(option_A);
        options.addOption(option_r);
        options.addOption(option_S);
        options.addOption(option_test);
        String A = "";
        try
        {
            commandLine = parser.parse(options, testArgs);

            if (commandLine.hasOption("A"))
            {
                System.out.print("Option A is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("A"));
                A = commandLine.getOptionValue("A");
            }

            if (commandLine.hasOption("r"))
            {
                System.out.print("Option r is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("r"));
            }

            if (commandLine.hasOption("S"))
            {
                System.out.print("Option S is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("S"));
            }

            if (commandLine.hasOption("test"))
            {
                System.out.println("Option test is present.  This is a flag option.");
            }

            {
                String[] remainder = commandLine.getArgs();
                System.out.print("Remaining arguments: ");
                for (String argument : remainder)
                {
                    System.out.print(argument);
                    System.out.print(" ");
                }

                System.out.println();
            }

        }
        catch (ParseException exception)
        {
            System.out.print("Parse error: ");
            System.out.println(exception.getMessage());
        }
		getProjectDir();
		System.out.println(ROOT);
		//TestProjects();
		//TestQuery();
		//TestFileTreeCreation();
		//TestTreeSearchAlgorithm();

		Run();
		System.out.println(A);
	}

}
