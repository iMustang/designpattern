package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        IGamePlayer concreteGamePlayer = new ConcreteGamePlayer();
        InvocationHandler gamePlayerProxy = new GamePlayerProxy(concreteGamePlayer);
        IGamePlayer gamePlayer = (IGamePlayer) Proxy.newProxyInstance(
                concreteGamePlayer.getClass().getClassLoader(),
                concreteGamePlayer.getClass().getInterfaces(),
                gamePlayerProxy);
        gamePlayer.playGame();
    }
}
