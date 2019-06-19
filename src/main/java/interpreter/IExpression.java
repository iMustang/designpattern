package interpreter;

/**
 * Expression:抽象表达式角色，声明抽象解释操作，是所有终结符表达式、非终结符表达式的父类。
 */
public interface IExpression {
    int interpret(Context context);
}
