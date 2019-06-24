package command;

/**
 * @Title: ConcreteCommandB
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
