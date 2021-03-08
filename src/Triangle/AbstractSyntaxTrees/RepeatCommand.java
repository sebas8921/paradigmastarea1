package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RepeatCommand extends Command {
	
	public Expression E;
	public Command C;
	
	public RepeatCommand(Command cAST,Expression eAST, SourcePosition sourceposition) {
		super(sourceposition);
		E = eAST;
		C = cAST;
	}
	
	public Object visit(Visitor v, Object o) {
		return v.visitRepeatCommand(this,o);
	}
}
