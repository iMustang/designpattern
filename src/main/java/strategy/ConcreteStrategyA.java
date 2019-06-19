package strategy;

/**
 * 具体策略的实现
 */
public class ConcreteStrategyA implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("策略A");
    }
}
