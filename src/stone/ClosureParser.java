package stone;
import static stone.Parser.rule;
import stone.ast.Fun;

/**
 * Created by shinriyo on 5/7/16.
 */
public class ClosureParser extends FuncParser {
    public ClosureParser() {
        primary.insertChoice(rule(Fun.class)
                    .sep("fun").ast(paramList).ast(block));
    }
}
