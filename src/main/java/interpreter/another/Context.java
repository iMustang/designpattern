package interpreter.another;

/**
 * Context
 * 环境类
 *
 * @author: xMustang
 * @since: 1.0
 */
public class Context {
    private String[] citys = {"北京", "上海"};
    private String[] persons = {"老人", "妇女", "儿童"};
    private Expression cityPerson;

    public Context() {
        cityPerson = new AndExpression(new TerminalExpression(citys),
                new TerminalExpression(persons));
    }

    public void freeRide(String info) {
        boolean flag = cityPerson.interpret(info);
        if (flag){
            System.out.println("您是"+info+"，可以免费乘车");
        }else{
            System.out.println("您是"+info+"，不满足免费乘车条件");
        }
    }
}
