package mediator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Buyer implements IUser {

    @Override
    public void sendMsg(String msg) {
        ChatRoom.sendMsg(this, msg);
    }

    @Override
    public void receiveMsg(String msg) {
        processMsg(msg);
//        this.sendMsg("新的消息");
    }

    @Override
    public void processMsg(String receiveMsg) {
        System.out.println(new SimpleDateFormat("mm:ss").format(new Date()) + " " + receiveMsg);
    }
}
