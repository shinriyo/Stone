package stone;
import stone.ast.ASTree;

/**
 * Created by shinriyo on 2/26/16.
 */
public class StoneException extends RuntimeException {
    public StoneException(String m) { super(m); }
    public StoneException(String m, ASTree t) {
        super(m + "" + t.location());
    }
}
