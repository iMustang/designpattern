package command;

/**
 * @Title: ConcreteCommandB
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/19 12:37
 */
public class ConcreteCommandB implements ICommand {
    private Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        this.receiver.doSomethingB();
    }
}
