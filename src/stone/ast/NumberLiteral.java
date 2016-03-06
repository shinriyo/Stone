package stone.ast;
import stone.Token;

/**
 * Created by shinriyo on 3/2/16.
 */
public class NumberLiteral extends ASTLeaf {
    public NumberLiteral(Token t) { super(t); }
    public int value() { return token().getNumber(); }
}
