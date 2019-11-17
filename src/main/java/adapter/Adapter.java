package adapter;

/**
 * 适配器类
 */
public class Adapter extends Adaptee implements ITarget {
    @Override
    public void targetMethod() {
        super.originalMethod();
    }
}
