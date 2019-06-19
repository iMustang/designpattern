package observer;

/**
 * @Title: ConcreteObserverB
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/19 17:26
 */
public class ConcreteObserverB implements IObserver {
    @Override
    public void update(String msg) {
        System.out.println("ConcreteObserverB收到消息：" + msg);
    }
}
