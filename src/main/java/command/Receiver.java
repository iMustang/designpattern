package command;

/**
 * Receiver：接受者对象，真正执行命令的对象。
 */
public class Receiver {
    public void doSomethingA() {
        System.out.println("做完A事情");
    }

    public void doSomethingB() {
        System.out.println("做完B事情");
    }
}
