// Minimal driver template for compiler/parser generated by Coco/R for Java
// Modify this to suit your application, by adding appropriate calls to
// initialize other classes used by the parser.

package GrammarName; // change to suit application

public class Comp {

	static ErrorStream ErrorHandler;

	public static void main (String[] args) {
		if (args.length == 0) {
		System.out.println("Parameter missing");
		} else {
			ErrorHandler = new ErrorStream();
			Scanner.Init(args[0], ErrorHandler);
			Parser.Parse();
			ErrorHandler.Summarize("");
		}
		System.exit(0);
	}

}
