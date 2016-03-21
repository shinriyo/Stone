package stone.ast;
import stone.Token;

/**
 * Created by shinriyo on 3/6/16.
 */
public class StringLiteral extends ASTLeaf {
    public StringLiteral(Token t) { super(t); }
    public String value() { return token().getText(); }
}
