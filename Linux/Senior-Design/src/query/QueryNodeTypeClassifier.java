package query;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.*;
import java.lang.*;
public class QueryNodeTypeClassifier {

	public static int ClassifyNode(String nodeType)
	{
		if(nodeType.equals("package_declaration"))
			return ASTNode.PACKAGE_DECLARATION;
		else if(nodeType.equals("body_declaration"))
			return 0;
		else if(nodeType.equals("variable_declaration"))
			return ASTNode.VARIABLE_DECLARATION_EXPRESSION;
		else if(nodeType.equals("import_declaration"))
			return ASTNode.IMPORT_DECLARATION;
		else if(nodeType.equals("type_declaration"))
			return ASTNode.TYPE_DECLARATION;
		else if(nodeType.equals("field_declaration"))
			return ASTNode.FIELD_DECLARATION;
		else if(nodeType.equals("method_declaration"))
			return ASTNode.METHOD_DECLARATION;
		else if(nodeType.equals("interface_declaration"))
			//return ASTNode.TYPE_DECLARATION_STATEMENT;
			return 100;
		else if(nodeType.equals("constructor_declaration"))
			return 0;
		else if(nodeType.equals("class_declaration"))
			return ASTNode.CLASS_INSTANCE_CREATION;
		else if(nodeType.equals("variable_declaration_fragment"))
			return ASTNode.VARIABLE_DECLARATION_FRAGMENT;
		else if(nodeType.equals("variable_declaration_statement"))
			return ASTNode.VARIABLE_DECLARATION_STATEMENT;
		else if(nodeType.equals("thrown_exceptions"))
			return ASTNode.THROW_STATEMENT;
		else if(nodeType.equals("initializer"))
			return ASTNode.INITIALIZER;
		else if(nodeType.equals("method_invocation"))
			return ASTNode.METHOD_INVOCATION;
		else if(nodeType.equals("if_statement"))
			return ASTNode.IF_STATEMENT;
		else if(nodeType.equals("expression"))
			return ASTNode.EXPRESSION_STATEMENT;
		else if(nodeType.equals("operator"))
			return 0;
		else if(nodeType.equals("conditional_expression"))
			return ASTNode.CONDITIONAL_EXPRESSION;
		else if(nodeType.equals("continue_expression"))
			return ASTNode.CONTINUE_STATEMENT;
		else if(nodeType.equals("assignment"))
			return ASTNode.ASSIGNMENT;
		else if(nodeType.equals("this_expression"))
			return ASTNode.THIS_EXPRESSION;
		else if(nodeType.equals("class_instance_creation"))
			return ASTNode.CLASS_INSTANCE_CREATION;
		else if(nodeType.equals("field_access"))
			return ASTNode.FIELD_ACCESS;
		else if(nodeType.equals("instance_of_expression"))
			return ASTNode.INSTANCEOF_EXPRESSION;
		else if(nodeType.equals("cast_expression"))
			return ASTNode.CAST_EXPRESSION;
		else if(nodeType.equals("super_field_access"))
			return ASTNode.SUPER_FIELD_ACCESS;
		else if(nodeType.equals("statement"))
			return 0;
		else if(nodeType.equals("then_statement"))
			return 0;
		else if(nodeType.equals("else_statement"))
			return 0;
		else if(nodeType.equals("do_statement"))
			return ASTNode.DO_STATEMENT;
		else if(nodeType.equals("parameter"))
			return ASTNode.PARAMETERIZED_TYPE;
		else if(nodeType.equals("body"))
			return 0;
		else if(nodeType.equals("for_statement"))
			return ASTNode.FOR_STATEMENT;
		else if(nodeType.equals("enhanced_for_statement"))
			return ASTNode.ENHANCED_FOR_STATEMENT;
		else if(nodeType.equals("while_statement"))
			return ASTNode.WHILE_STATEMENT;
		else if(nodeType.equals("null_literal"))
			return ASTNode.NULL_LITERAL;
		else if(nodeType.equals("integer_literal"))
			return 0;
		else if(nodeType.equals("character_literal"))
			return ASTNode.CHARACTER_LITERAL;
		else if(nodeType.equals("string_literal"))
			return ASTNode.STRING_LITERAL;
		else if(nodeType.equals("boolean_literal"))
			return ASTNode.BOOLEAN_LITERAL;
		return 0;
	}
	
	public static java.lang.Class ClassifyNodeC(String nodeType)
	{
		if(nodeType.equals("package_declaration"))
			return ASTNode.nodeClassForType(ASTNode.PACKAGE_DECLARATION);
		else if(nodeType.equals("body_declaration"))
			return org.eclipse.jdt.core.dom.BodyDeclaration.class;
		else if(nodeType.equals("variable_declaration"))
			return ASTNode.nodeClassForType(ASTNode.VARIABLE_DECLARATION_EXPRESSION);
		else if(nodeType.equals("import_declaration"))
			return ASTNode.nodeClassForType(ASTNode.IMPORT_DECLARATION);
		else if(nodeType.equals("type_declaration"))
			return ASTNode.nodeClassForType(ASTNode.TYPE_DECLARATION);
		else if(nodeType.equals("field_declaration"))
			return ASTNode.nodeClassForType(ASTNode.FIELD_DECLARATION);
		else if(nodeType.equals("method_declaration"))
			return ASTNode.nodeClassForType(ASTNode.METHOD_DECLARATION);
		else if(nodeType.equals("interface_declaration"))
			//return ASTNode.nodeClassForType(ASTNode.TYPE_DECLARATION_STATEMENT);
			return null;
		else if(nodeType.equals("constructor_declaration"))
			return null;
		else if(nodeType.equals("class_declaration"))
			return ASTNode.nodeClassForType(ASTNode.CLASS_INSTANCE_CREATION);
		else if(nodeType.equals("variable_declaration_fragment"))
			return ASTNode.nodeClassForType(ASTNode.VARIABLE_DECLARATION_FRAGMENT);
		else if(nodeType.equals("variable_declaration_statement"))
			return ASTNode.nodeClassForType(ASTNode.VARIABLE_DECLARATION_STATEMENT);
		else if(nodeType.equals("thrown_exceptions"))
			return ASTNode.nodeClassForType(ASTNode.THROW_STATEMENT);
		else if(nodeType.equals("initializer"))
			return ASTNode.nodeClassForType(ASTNode.INITIALIZER);
		else if(nodeType.equals("method_invocation"))
			return ASTNode.nodeClassForType(ASTNode.METHOD_INVOCATION);
		else if(nodeType.equals("if_statement"))
			return ASTNode.nodeClassForType(ASTNode.IF_STATEMENT);
		else if(nodeType.equals("expression"))
			return ASTNode.nodeClassForType(ASTNode.EXPRESSION_STATEMENT);
		else if(nodeType.equals("operator"))
			return null;
		else if(nodeType.equals("conditional_expression"))
			return ASTNode.nodeClassForType(ASTNode.CONDITIONAL_EXPRESSION);
		else if(nodeType.equals("continue_expression"))
			return ASTNode.nodeClassForType(ASTNode.CONTINUE_STATEMENT);
		else if(nodeType.equals("assignment"))
			return ASTNode.nodeClassForType(ASTNode.ASSIGNMENT);
		else if(nodeType.equals("this_expression"))
			return ASTNode.nodeClassForType(ASTNode.THIS_EXPRESSION);
		else if(nodeType.equals("class_instance_creation"))
			return ASTNode.nodeClassForType(ASTNode.CLASS_INSTANCE_CREATION);
		else if(nodeType.equals("field_access"))
			return ASTNode.nodeClassForType(ASTNode.FIELD_ACCESS);
		else if(nodeType.equals("instance_of_expression"))
			return ASTNode.nodeClassForType(ASTNode.INSTANCEOF_EXPRESSION);
		else if(nodeType.equals("cast_expression"))
			return ASTNode.nodeClassForType(ASTNode.CAST_EXPRESSION);
		else if(nodeType.equals("super_field_access"))
			return ASTNode.nodeClassForType(ASTNode.SUPER_FIELD_ACCESS);
		else if(nodeType.equals("statement"))
			return null;
		else if(nodeType.equals("then_statement"))
			return null;
		else if(nodeType.equals("else_statement"))
			return null;
		else if(nodeType.equals("do_statement"))
			return ASTNode.nodeClassForType(ASTNode.DO_STATEMENT);
		else if(nodeType.equals("parameter"))
			return ASTNode.nodeClassForType(ASTNode.PARAMETERIZED_TYPE);
		else if(nodeType.equals("body"))
			return null;
		else if(nodeType.equals("for_statement"))
			return ASTNode.nodeClassForType(ASTNode.FOR_STATEMENT);
		else if(nodeType.equals("enhanced_for_statement"))
			return ASTNode.nodeClassForType(ASTNode.ENHANCED_FOR_STATEMENT);
		else if(nodeType.equals("while_statement"))
			return ASTNode.nodeClassForType(ASTNode.WHILE_STATEMENT);
		else if(nodeType.equals("null_literal"))
			return ASTNode.nodeClassForType(ASTNode.NULL_LITERAL);
		else if(nodeType.equals("integer_literal"))
			return null;
		else if(nodeType.equals("character_literal"))
			return ASTNode.nodeClassForType(ASTNode.CHARACTER_LITERAL);
		else if(nodeType.equals("string_literal"))
			return ASTNode.nodeClassForType(ASTNode.STRING_LITERAL);
		else if(nodeType.equals("boolean_literal"))
			return ASTNode.nodeClassForType(ASTNode.BOOLEAN_LITERAL);
		return null;
	}
	
}
