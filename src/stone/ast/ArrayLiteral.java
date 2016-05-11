package stone.ast;
import java.util.List;

/**
 * Created by shinriyo on 5/11/16.
 */
public class ArrayLiteral extends ASTList {
    public ArrayLiteral(List<ASTree> list) { super(list); }
    public int size() { return numChildren(); }
}
