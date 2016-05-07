package chap7;
import stone.FuncParser;
import stone.ParseException;
import chap6.BasicInterpreter;

/**
 * Created by shinriyo on 5/6/16.
 */
public class FuncInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new FuncParser(), new NestedEnv());
    }
}
