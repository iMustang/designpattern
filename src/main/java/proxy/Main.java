package proxy;

public class Main {
    public static void main(String[] args) {
        IGamePlayer concreteGamePlayer = new ConcreteGamePlayer();
        IGamePlayer gamePlayerProxy = new GamePlayerProxy(concreteGamePlayer);
        gamePlayerProxy.playGame();
    }
}
