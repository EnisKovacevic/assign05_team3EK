package assign4.parser;

import assign4.lexer.*;
import assign4.visitor.*;

public class StatementsNode extends Node{
  public StatementNode stmt;

  public StatementsNode(){}
 
  public void accept (ASTVisitor v){
    v.visit(this);
  }
}
