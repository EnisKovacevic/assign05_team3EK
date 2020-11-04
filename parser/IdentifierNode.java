package assign4.parser;
import assign4.lexer.*;
import assign4.visitor.*;
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