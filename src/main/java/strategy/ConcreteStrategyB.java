package strategy;

public class ConcreteStrategyB implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("B策略");
    }
}
