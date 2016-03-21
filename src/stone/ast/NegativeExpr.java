package stone.ast;
import java.util.List;

/**
 * Created by shinriyo on 3/6/16.
 */
public class NegativeExpr extends ASTList {
    public NegativeExpr(List<ASTree> c) { super(c); }
    public ASTree operand() { return child(0); }
    public String toString() {
       return "-" + operand();
    }
}
