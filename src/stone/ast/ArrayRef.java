package stone.ast;
import java.util.List;

/**
 * Created by shinriyo on 5/11/16.
 */
public class ArrayRef extends Postfix {
    public ArrayRef(List<ASTree> c) { super(c); }
    public ASTree index() { return child(0); }
    public String toString() { return "[" + "]";}
}
