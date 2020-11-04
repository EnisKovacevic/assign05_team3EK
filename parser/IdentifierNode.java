package assign5.parser;
import assign5.lexer.*;
import assign5.visitor.*;
public class IdentifierNode extends Node {
    public String id;
    public Word w;
    
    public IdentifierNode(){
    
    }
    public IdentifierNode(Word w){
        this.id = w.lexeme;
        this.w = w;
    }
    
    public void accept(ASTVisitor v){
        v.visit(this);
    }
    void printNode(){
        System.out.println("IdentifierNode: " + id);
    }
}
