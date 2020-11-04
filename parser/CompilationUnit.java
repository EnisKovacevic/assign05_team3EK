package assign4.parser;
import assign4.visitor.*;
import assign4.lexer.*;

public class CompilationUnit extends Node {
  public BlockStatementNode block;  
  public CompilationUnit(){
    block = new BlockStatementNode();
  }
  public CompilationUnit(BlockStatementNode block){
    this.block = block;
  }
  public void accept(ASTVisitor v){
        v.visit(this);
  }
}
  
  
