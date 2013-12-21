package objects;

public class SelectorNode
{
	public static int NODE = 0;
	public static int ATTR = 1;
	public static int PROP = 2;
	public static int AST_CHILD = 3;
	
	public int nodeType;
	public String nodeText;
	
	public SelectorNode(String text, int type)
	{
		nodeType = type;
		nodeText = text;
	}
}