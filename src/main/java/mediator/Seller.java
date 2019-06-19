package mediator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Seller implements IUser {

    @Override
    public void sendMsg(String msg) {
        ChatRoom.sendMsg(this, msg);
    }

    @Override
    public void receiveMsg(String msg) {
        processMsg(msg);
        String resp = "现在不在，稍后联系";
        this.sendMsg(resp);
    }

    @Override
    public void processMsg(String receiveMsg) {
        System.out.println(new SimpleDateFormat("mm:SS").format(new Date()) + " " + receiveMsg);
    }
}
