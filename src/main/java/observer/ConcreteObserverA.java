package observer;

/**
 * 具体观察者
 */
public class ConcreteObserverA implements IObserver {
    @Override
    public void update(String msg) {
        System.out.println("ConcreteObserverA收到消息：" + msg);
    }
}
