
package assign4.visitor;
import assign4.parser.*;
public class ASTVisitor{
    public void visit(CompilationUnit n){
        n.block.accept(this);
    }
    public void visit(BlockStatementNode n){
        n.stmts.accept(this);
    }
    public void visit(StatementsNode n){
        n.stmt.accept(this);
    }
    public void visit(StatementNode n){
        n.assign.accept(this);
    }
    public void visit(AssignmentNode n){
        n.left.accept(this);
        n.right.accept(this);
    }
    public void visit(ExpressionNode n){
        n.left.accept(this);
        n.right.accept(this);
    }
  
    public void visit (IdentifierNode n){
       
    }
 }
