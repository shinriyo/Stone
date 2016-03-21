package stone.ast;
import java.util.List;

/**
 * Created by shinriyo on 3/6/16.
 */
public class WhileStmnt extends ASTList {
    public WhileStmnt(List<ASTree> c) { super(c); }
    public ASTree condition() { return child(0); }
    public ASTree body() { return child(1);}
    public String toString() {
        return "(While" + condition() + " " + body() + ")";
    }
}
