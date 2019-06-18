package proxy.cglib;

/**
 * Cglib代理，需要先导包：cglib、asm-all
 */
public class Main {
    public static void main(String[] args) {
        IGamePlayer concreteGamePlayer = new ConcreteGamePlayer();
        IGamePlayer proxy = (IGamePlayer) new GamePlayerProxy(concreteGamePlayer).getProxy();
        proxy.playGame();
    }
}
