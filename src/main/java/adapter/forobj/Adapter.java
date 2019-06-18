package adapter.forobj;

public class Adapter implements ITarget {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void targetMethod() {
        adaptee.targetMethod();
    }
}
