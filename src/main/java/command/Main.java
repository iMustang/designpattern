package command;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        invoker.setCommand(new ConcreteCommandA(receiver));
        invoker.excuteCommand();

        invoker.setCommand(new ConcreteCommandB(receiver));
        invoker.excuteCommand();
    }
}
