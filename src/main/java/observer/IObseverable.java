package observer;

/**
 * Subject：被观察者
 */
public interface IObseverable {
    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObserver();
}
