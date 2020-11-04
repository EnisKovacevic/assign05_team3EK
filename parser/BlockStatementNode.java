package assign4.parser;
import assign4.visitor.*;
public class BlockStatementNode extends Node {
    public StatementsNode stmts;
    public BlockStatementNode(){}
  
//     public BlockStatementNode(StatementsNode stmts){
//         this.stmts = stmts;
//     }
    public void accept(ASTVisitor v){
        v.visit(this);
    }
    void printNode(){
        System.out.println("BlockStatementNode: " );
    }
}
