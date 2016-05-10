package chap9;
import javassist.gluonj.util.Loader;
import chap7.ClosureEvaluator;
import chap8.NativeEvaluator;

/**
 * Created by shinriyo on 5/8/16.
 */
public class ClassRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(ClassInterpreter.class, args, ClassEvaluator.class,
                NativeEvaluator.class, ClosureEvaluator.class);
    }
}
