package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        IGamePlayer concreteGamePlayer = new ConcreteGamePlayer();
        InvocationHandler gamePlayerProxy = new GamePlayerProxy(concreteGamePlayer);
        IGamePlayer gamePlayer = (IGamePlayer) Proxy.newProxyInstance(
                // 第一个参数是指定代理类的类加载器
                concreteGamePlayer.getClass().getClassLoader(),
                // 第二个参数是代理类需要实现的接口（传入被代理类实现的接口，这样生成的代理类和被代理类就实现了相同的接口）
                concreteGamePlayer.getClass().getInterfaces(),
                // 第三个参数是invocation handler，用来处理方法的调用。这里传入我们自己实现的handler
                gamePlayerProxy);
        gamePlayer.playGame();
    }
}
