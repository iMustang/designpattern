package abstractfactory;

public class HaierRefrigerator implements IRefrigerator {
    @Override
    public void run() {
        System.out.println("我是海尔冰箱");
    }
}
