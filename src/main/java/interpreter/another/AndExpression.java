package interpreter.another;

import com.sun.tools.corba.se.idl.constExpr.And;
import lombok.AllArgsConstructor;

/**
 * AndExpression
 * 非终结符表达式
 *
 * @author: xMustang
 * @since: 1.0
 */
@AllArgsConstructor
public class AndExpression implements Expression {
    private Expression city;
    private Expression person;

    @Override
    public boolean interpret(String info) {
        String[] content = info.split("的");
        return city.interpret(content[0]) && person.interpret(content[1]);
    }
}
