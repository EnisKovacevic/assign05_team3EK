package assign5.parser;

import assign5.lexer.*;
import assign5.visitor.*;

public class StatementsNode extends Node{
  public StatementNode stmt;

  public StatementsNode(){}
 
  public void accept (ASTVisitor v){
    v.visit(this);
  }
}
