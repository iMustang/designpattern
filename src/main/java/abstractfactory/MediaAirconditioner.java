package abstractfactory;

public class MediaAirconditioner implements IAirconditioner {
    @Override
    public void run() {
        System.out.println("我是美的空调");
    }
}
