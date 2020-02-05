package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Proxy（代理角色）:实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来实现抽象方法，并可以附加自己的操作。
 */
public class GamePlayerProxy implements InvocationHandler {
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    // 其中proxy在动态代理生成的代理类字节码中看到是this，也即是代理对象的实例
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeGame();
        System.out.println("此处的方法参数proxy为：" + proxy.getClass().getName());
        Object object = method.invoke(gamePlayer, args);
        afterGame();
        return object;
    }

    private void beforeGame() {
        System.out.println("喝个咖啡");
    }

    private void afterGame() {
        System.out.println("洗咖啡杯子");
    }
}
