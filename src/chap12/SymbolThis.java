package chap12;
import stone.StoneException;
import chap11.Symbols;

/**
 * Created by shinriyo on 5/15/16.
 */
public class SymbolThis extends Symbols {
    public static final String NAME = "this";
    public SymbolThis(Symbols outer) {
        super(outer);
        add(NAME);
    }
    @Override public int putNew(String key) {
        throw new StoneException("final");
    }
    @Override public Location put(String key) {
        Location loc = outer.put(key);
        if (loc.nest >= 0)
            loc.nest++;
        return loc;
    }
}
