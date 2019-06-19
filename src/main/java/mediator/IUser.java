package mediator;

public interface IUser {
    void sendMsg(String msg);

    void receiveMsg(String msg);

    void processMsg(String receiveMsg);
}
