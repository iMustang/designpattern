package proxy.dynamicproxy;

/**
 * RealSubject（目标角色）：实现抽象角色，定义目标角色所要实现的业务逻辑，供代理角色调用。
 */
public class ConcreteGamePlayer implements IGamePlayer {
    @Override
    public void playGame() {
        System.out.println("打游戏，升级");
    }
}
