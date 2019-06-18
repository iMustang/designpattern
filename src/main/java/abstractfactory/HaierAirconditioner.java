package abstractfactory;

public class HaierAirconditioner implements Airconditioner {
    @Override
    public void run() {
        System.out.println("我是海尔空调");
    }
}
