package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command {

	public IntegerLiteral I1, I2;
	public Command C;
	public Vname V;
	
	public ForCommand(Vname vAST, IntegerLiteral i1AST, IntegerLiteral i2AST,Command cAST,SourcePosition thePosition) {
		super(thePosition);
		I1 = i1AST;
		I2 = i2AST;
		C = cAST;
		V = vAST;
	}
	
	public Object visit(Visitor v, Object o) {
		return v.visitForCommand(this,o);
	}
	

}
