package chap7;
import stone.ClosureParser;
import stone.ParseException;
import chap6.BasicInterpreter;

/**
 * Created by shinriyo on 5/7/16.
 */
public class ClosureInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException    {
        run(new ClosureParser(), new NestedEnv());
    }
}
