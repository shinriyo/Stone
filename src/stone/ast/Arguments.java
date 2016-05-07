package stone.ast;
import java.util.List;

/**
 * Created by shinriyo on 5/6/16.
 */
public class Arguments extends Postfix {
    public Arguments(List<ASTree> c) { super(c); }
    public int size() { return numChildren(); }
}
