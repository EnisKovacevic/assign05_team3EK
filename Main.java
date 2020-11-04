package assign5 ;

import assign5.lexer.* ;
import assign5.parser.* ;
import assign5.pretty.*;
    
public class Main {

    public static void main (String[] args) {

        Lexer lexer = new Lexer() ;
        Parser parser = new Parser(lexer) ;
        PrettyPrinter pretty = new PrettyPrinter(parser) ;
	
    }
}
