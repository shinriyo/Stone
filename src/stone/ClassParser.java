package stone;
import static stone.Parser.rule;
import stone.ast.ClassBody;
import stone.ast.ClassStmnt;
import stone.ast.Dot;

/**
 * Created by shinriyo on 5/8/16.
 */
public class ClassParser extends ClosureParser {
    Parser member = rule().or(def, simple);
    Parser class_body = rule(ClassBody.class).sep("{").option(member)
                        .repeat(rule().sep(";", Token.EOL).option(member))
                        .sep("}");
    Parser defclass = rule(ClassBody.class).sep("class").option(member)
                          .option(rule().sep("extends").identifier(reserved))
                          .ast(class_body);
    public ClassParser() {
        postfix.insertChoice(rule(Dot.class).sep(".").identifier(reserved));
        program.insertChoice(defclass);
    }
}
