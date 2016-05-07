package stone.ast;
import java.util.List;

/**
 * Created by shinriyo on 5/6/16.
 */
public class ParameterList extends ASTList {
    public ParameterList(List<ASTree> c) { super(c); }
    public String name(int i){ return ((ASTLeaf)child(i)).token().getText(); }
    public int size() { return numChildren(); }
}
