package observer;

public class ConcreteObserverB implements IObserver {
    @Override
    public void update(String msg) {
        System.out.println("ConcreteObserverB收到消息：" + msg);
    }
}
