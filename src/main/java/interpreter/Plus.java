package interpreter;

public class Plus implements IExpression {
    @Override
    public int interpret(Context context) {
        return context.getNumberA() + context.getNumberB();
    }
}
