package adapter;

/**
 * 适配器类
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void targetMethod() {
        super.targetMethod();
    }
}
