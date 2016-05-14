package chap11;
import stone.ast.BlockStmnt;
import stone.ast.ParameterList;
import chap6.Environment;
import chap7.Function;

/**
 * Created by shinriyo on 5/12/16.
 */
public class OptFunction extends Function {
    protected int size;
    public OptFunction(ParameterList parameters, BlockStmnt body,
                       Environment env, int memorySize)
    {
        super(parameters, body, env);
        size = memorySize;
    }
    @Override public Environment makeEnv() { return new ArrayEnv(size, env); }
}
