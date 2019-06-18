package adapter.forobj;

/**
 * @Title: Adapter
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/18 15:33
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void targetMethod() {
        adaptee.targetMethod();
    }
}
