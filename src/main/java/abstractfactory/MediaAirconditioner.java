package abstractfactory;

public class MediaAirconditioner implements Airconditioner {
    @Override
    public void run() {
        System.out.println("我是美的空调");
    }
}
