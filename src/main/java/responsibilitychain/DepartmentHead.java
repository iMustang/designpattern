package responsibilitychain;

/**
 * DepartmentHead
 * 系主任
 */
public class DepartmentHead extends Leader {
	@Override
	public void handleRequest(int leaveDays) {
		if (leaveDays < 7) {
			System.out.println("系主任批准假期，假期为：" + leaveDays + "天");
		} else {
			if (getNext() != null) {
				getNext().handleRequest(leaveDays);
			} else {
				System.out.println("您请假天数过多，没有人能处理此请假条。");
			}
		}
	}
}
