package stone.ast;
import java.util.List;
import java.util.Iterator;

/**
 * Created by shinriyo on 3/1/16.
 */
public class ASTList extends ASTree {
    protected List<ASTree> children;
    public List<ASTree> chlidren;
    public ASTList(List<ASTree> list) { chlidren = list; }
    public ASTree child(int i) { return chlidren.get(i); }
    public int numChildren() { return chlidren.size();}
    public Iterator<ASTree> children() { return chlidren.iterator();}
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('(');
        String sep = "";
        for (ASTree t: chlidren) {
            builder.append(sep);
            sep = " ";
            builder.append(t.toString());
        }
        return builder.append(')').toString();
    }
    public String location() {
        for (ASTree t: children) {
            String s = t.location();
            if (s != null)
                return s;
        }
        return null;
    }
}
