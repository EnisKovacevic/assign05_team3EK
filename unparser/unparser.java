package assign5.unparser;

import assign5.visitor.*;
import assign5.parser.*;
import assign5.lexer.*;
import java.util.*;
import java.io.*;
import assign5.symbols.*;

public class unparser extends ASTVisitor {
  public Parser parser = null;
  File file;
  FileWriter pp;
  public Token lookahead;

  public unparser(Parser parser) {
    this.parser = parser;

    file = new File("Output.txt");
    try {
      if (!file.exists()) {
        file.createNewFile();
      }
    } catch (IOException e) {
      System.out.println("File could not be found.");
    }

    try {
      pp = new FileWriter(file);
    } catch (IOException e) {
      System.out.println("File could not be found.");
    }
    System.out.println(parser.top);
    visit(this.parser.cu);
  }

  public unparser() {
    visit(this.parser.cu);
  }

  int indexlvl = 0;

//   void printTab() {
//     for (int x = 0; x < indexlvl; x++) {
//       this.pp.write("\t");
//     }
//   }

  void print(String s) {
    try{
      this.pp.append(s);
    }
    catch(IOException e){
      System.out.println("Not able to write to file.");
    }
  }

  void println(String s) {
    try{
      this.pp.append("\n" + s + "\n");
    }
    catch(IOException e){
      System.out.println("Not able to write to file.");
    }
  }

  void indexUp() {
    indexlvl++;
  }

  void indexDown() {
    indexlvl--;
  }

  void printIndent() {
    String s = "";
    for (int i = 0; i < indexlvl; i++) {
      s += " ";
    }
    print(s);
  }

  public void visit(CompilationUnit n) {
    n.block.accept(this);
    try{
      pp.close();
    }
    catch(IOException e){
    }
  }

  public void visit(BlockStatementNode n) {
    println("{");
    indexUp();
    n.stmts.accept(this);
    indexDown();
    println("}");
    
  }

  public void visit(StatementsNode n) {
    printIndent();
    //println("StatementsNode");
    //indexUp();
    n.stmt.accept(this);
    //indexDown();
  }

  public void visit(StatementNode n) {
    //printIndent();
    //println("StatementNode from Line: " + n.loc);
    indexUp();
    n.assign.accept(this);
    print(" ; ");
    indexDown();
  }

  public void visit(AssignmentNode n) {
    //printIndent();
   // println("AssignmentNode: =");
    indexUp();
    n.left.accept(this);
    indexDown();
    indexUp();
    //printIndent();
    print(" = ");
    n.right.accept(this);
    indexDown();
  }

  public void visit(ExpressionNode n) {
    
    indexUp();
    n.left.accept(this);
    indexDown();
    
    try{
      indexUp();
      if(n.id != null) print(" " + n.id +" ");
      n.right.accept(this);
      
       indexDown();
    }
    catch(NullPointerException e){
    }
   
  }

  public void visit(IdentifierNode n) {
    //printIndent();
    print(n.id);
    System.out.println(n.id);
    

  }
}
