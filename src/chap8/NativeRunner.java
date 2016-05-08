package chap8;
import javassist.gluonj.util.Loader;
import chap7.ClosureEvaluator;

/**
 * Created by shinriyo on 5/8/16.
 */
public class NativeRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(NativeInterpreter.class, args, NativeEvaluator.class,
                ClosureEvaluator.class);
    }
}
