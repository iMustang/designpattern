package strategy;

public class Main {
    public static void main(String[] args) {
        ChooseStrategy chooseStrategy = new ChooseStrategy(new ConcreteStrategyA());
        chooseStrategy.getStrategy();
    }
}
