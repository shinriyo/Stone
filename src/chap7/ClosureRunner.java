package chap7;
import javassist.gluonj.util.Loader;

/**
 * Created by shinriyo on 5/7/16.
 */
public class ClosureRunner {
    public static void main(String[] args) throws Throwable{
        Loader.run(ClosureInterpreter.class, args, ClosureEvaluator.class);
    }
}
