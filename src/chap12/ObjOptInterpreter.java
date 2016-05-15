package chap12;
import stone.ClassParser;
import stone.ParseException;
import chap11.EnvOptInterpreter;
import chap11.ResizableArrayEnv;
import chap8.Natives;

/**
 * Created by shinriyo on 5/15/16.
 */
public class ObjOptInterpreter extends EnvOptInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClassParser(),
            new Natives().environment(new ResizableArrayEnv()));
    }
}
