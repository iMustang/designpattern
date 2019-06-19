package observer;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements IObseverable {
    private List<IObserver> list = new ArrayList<>();
    private String msg;

    @Override
    public void registerObserver(IObserver o) {
        list.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : list) {
            observer.update(msg);
        }
    }

    public void publishInformation(String msg) {
        this.msg = msg;
        System.out.println("发布消息：" + msg);
        notifyObserver();
    }
}
