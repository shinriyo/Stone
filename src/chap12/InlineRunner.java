package chap12;
import javassist.gluonj.util.Loader;
import chap8.NativeEvaluator;

/**
 * Created by shinriyo on 5/15/16.
 */
public class InlineRunner {
    public static void main(String[] args)  throws Throwable {
    Loader.run(ObjOptInterpreter.class, args, InlineCache.class,
                                           NativeEvaluator.class);
    }
}
