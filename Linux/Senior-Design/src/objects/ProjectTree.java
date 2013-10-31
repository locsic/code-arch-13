package objects;

import java.io.File;
import java.io.FileFilter;
import java.util.LinkedList;
import java.util.Queue;

public class ProjectTree extends DirectoryTree {
	
	public File sourceFolder;
	public DirectoryTree projectTree;

	public ProjectTree(File root, String name)
	{
		sourceFolder = root;
		projectName = name;
		
		System.out.println(projectName);
		projectTree = new DirectoryTree(root, name);
	}
	
	public void print()
	{
		System.out.println(projectName);
		System.out.println(sourceFolder.getAbsolutePath());
		projectTree.print(0);
	}
}

