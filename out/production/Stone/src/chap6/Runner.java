package chap6;
import javassist.gluonj.util.Loader;


/**
 * Created by shinriyo on 3/21/16.
 */
public class Runner {
    public static void main(String[] args) throws Throwable {
        Loader.run(BasicInterpreter.class, args, BasicEvaluator.class);
    }
}
