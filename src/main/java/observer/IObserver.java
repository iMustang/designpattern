package observer;

/**
 * IObserver：抽象观察者，提供一个接口，定义了观察者收到通知时更新自己的方法。
 */
public interface IObserver {
    void update(String msg);
}
