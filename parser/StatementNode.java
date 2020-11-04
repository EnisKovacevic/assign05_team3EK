package assign4.parser;

import assign4.visitor.*;
import assign4.lexer.*;

public class StatementNode extends Node {
  public AssignmentNode assign;
  public static int loc;
  
  public StatementNode() {
  }
  public StatementNode(AssignmentNode assign, int id){
     this.assign = assign;
    this.loc = id;
   
   }
  public void accept(ASTVisitor v) {
    v.visit(this);
  }
}
