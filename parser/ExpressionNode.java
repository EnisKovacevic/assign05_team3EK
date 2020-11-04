package assign4.parser;

import assign4.lexer.*;
import assign4.visitor.*;

public class ExpressionNode extends Node {
  public IdentifierNode left = null;
  public ExpressionNode right = null;
  public String id;
  public ExpressionNode(){}
  public ExpressionNode(IdentifierNode left, ExpressionNode right,String id){
    this.left = left;
    this.right = right;
    this.id = id;
  }
  public void accept(ASTVisitor v){
    v.visit(this);
  }
}
  
