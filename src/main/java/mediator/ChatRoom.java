package mediator;

public class ChatRoom {
    public static IUser buyer = new Buyer();
    public static IUser seller = new Seller();

    public static void sendMsg(IUser user, String msg) {
        if ("Buyer".equals(user.getClass().getSimpleName())) {
            seller.receiveMsg(msg);
        }
        if ("Seller".equals(user.getClass().getSimpleName())) {
            buyer.receiveMsg(msg);
        }
    }
}
