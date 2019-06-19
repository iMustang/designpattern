package strategy;

/**
 * Context类：上下文角色，负责和具体的策略实现交互。
 */
public class ChooseStrategy {
    private IStrategy strategy;

    public ChooseStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void getStrategy() {
        strategy.doSomething();
    }
}
