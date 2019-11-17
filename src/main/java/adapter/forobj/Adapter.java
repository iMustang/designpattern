package adapter.forobj;

/**
 * 适配器类，在内部包装一个Adaptee对象，把源接口转换成目标接口
 */
public class Adapter implements ITarget {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
