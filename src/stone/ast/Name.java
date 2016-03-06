package stone.ast;
import stone.Token;

/**
 * Created by shinriyo on 3/2/16.
 */
public class Name extends ASTLeaf {
    public Name(Token t) { super(t); }
    public String name() { return token().getText(); }
}
