package assign5.parser;

import assign5.visitor.*;
import assign5.lexer.*;

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
