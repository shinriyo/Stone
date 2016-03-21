package chap6;

/**
 * Created by shinriyo on 3/21/16.
 */
public interface Environment {
    void put(String name, Object value);
    Object get(String name);
}
