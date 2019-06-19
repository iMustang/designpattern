package observer;

public interface IObseverable {
    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObserver();
}
