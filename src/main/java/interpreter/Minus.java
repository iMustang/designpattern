package interpreter;

/**
 * Minus
 */
public class Minus implements IExpression {
	@Override
	public int interpret(Context context) {
		return context.getNumberA() - context.getNumberB();
	}
}
