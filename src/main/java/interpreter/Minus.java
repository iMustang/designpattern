package interpreter;

/**
 * @Title: Minus
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/19 17:55
 */
public class Minus implements IExpression {
    @Override
    public int interpret(Context context) {
        return context.getNumberA() - context.getNumberB();
    }
}
