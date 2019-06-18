package abstractfactory;

public class HaierAirconditioner implements IAirconditioner {
    @Override
    public void run() {
        System.out.println("我是海尔空调");
    }
}
