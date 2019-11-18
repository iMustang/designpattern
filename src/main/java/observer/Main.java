package observer;

public class Main {
    public static void main(String[] args) {
        IObseverable wechatServer = new WechatServer();

        IObserver concreteObserverA = new ConcreteObserverA();
        wechatServer.registerObserver(concreteObserverA);

        IObserver concreteObserverB = new ConcreteObserverB();
        wechatServer.registerObserver(concreteObserverB);

        ((WechatServer) wechatServer).publishInformation("大家好");
    }
}
