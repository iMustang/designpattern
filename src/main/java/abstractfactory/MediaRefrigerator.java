package abstractfactory;

public class MediaRefrigerator implements Refrigerator {
    @Override
    public void run() {
        System.out.println("我是美的冰箱");
    }
}
