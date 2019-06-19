package command;

/**
 * Invoker：持有命令对象，要求命令对象执行请求。
 */
public class Invoker {
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void excuteCommand() {
        this.command.excute();
    }
}
