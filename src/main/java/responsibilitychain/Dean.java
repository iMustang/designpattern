package responsibilitychain;

/**
 * Dean
 * 院长
 */
public class Dean extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays < 10) {
            System.out.println("院长批准假期，假期为：" + leaveDays + "天");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("您请假天数过多，没有人能处理此请假条。");
            }
        }
    }
}
