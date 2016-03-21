package chap6;
import java.util.HashMap;

/**
 * Created by shinriyo on 3/21/16.
 */
public class BasicEnv implements Environment {
    protected HashMap<String,Object> values;
    public BasicEnv() {}
    public void put(String name, Object value) { values.put(name, value); }
    public Object get(String name) { return values.get(name); }
}
