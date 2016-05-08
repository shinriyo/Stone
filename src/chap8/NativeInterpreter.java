package chap8;
import stone.ClosureParser;
import stone.ParseException;
import chap6.BasicInterpreter;
import chap7.NestedEnv;

/**
 * Created by shinriyo on 5/8/16.
 */
public class NativeInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClosureParser(),
            new Natives().environment(new NestedEnv()));
    }
}
