package assign5.parser;
import assign5.visitor.*;
import assign5.lexer.*;

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
  
  
