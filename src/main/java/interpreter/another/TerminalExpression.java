package interpreter.another;

import java.util.HashSet;
import java.util.Set;

/**
 * TerminalExpression
 * 终结符表达式
 *
 * @author: xMustang
 * @since: 1.0
 */
public class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        for (String tmp : data) {
            set.add(tmp);
        }
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
