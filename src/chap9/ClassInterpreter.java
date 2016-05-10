package chap9;
import stone.ClassParser;
import stone.ParseException;
import chap6.BasicInterpreter;
import chap7.NestedEnv;
import chap8.Natives;

/**
 * Created by shinriyo on 5/8/16.
 */
public class ClassInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClassParser(), new Natives().environment(new NestedEnv()));
    }
}
