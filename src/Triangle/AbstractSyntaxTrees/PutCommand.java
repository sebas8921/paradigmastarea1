package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class PutCommand extends Command{
	
	public Expression E1, E2;
	public Vname V;

	public PutCommand(Vname vAST, Expression e1AST, Expression e2AST, SourcePosition thePosition) {
		super(thePosition);
		V = vAST;
		E1 = e1AST;
		E2 = e2AST;
	}


	public Object visit(Visitor v, Object o) {
		
		return v.visitPutCommand(this, o);
	}
	
}
