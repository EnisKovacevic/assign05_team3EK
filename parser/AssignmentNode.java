package assign4.parser;

import assign4.visitor.*;
import assign4.lexer.*;

public class AssignmentNode extends Node {
  public IdentifierNode left;
  public ExpressionNode right;
  public AssignmentNode() {
  }
  public AssignmentNode(IdentifierNode left, ExpressionNode right){
    this.left = left;
    this.right = right;
  }
  public void accept(ASTVisitor v) {
    v.visit(this);
  }
}
