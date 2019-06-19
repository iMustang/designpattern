package command;

/**
 * ConcreteCommand：持有具体的接受者对象，完成具体的具体的命令。
 */
public class ConcreteCommandA implements ICommand {
    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        this.receiver.doSomethingA();
    }
}
