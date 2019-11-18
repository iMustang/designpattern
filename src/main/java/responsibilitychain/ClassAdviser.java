package responsibilitychain;

/**
 * ClassAdviser
 * 班主任
 * <p>
 * <p>
 * Concrete Handler：具体处理者，实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 */
public class ClassAdviser extends Leader {
	@Override
	public void handleRequest(int leaveDays) {
		if (leaveDays < 7) {
			System.out.println("班主任批准假期，假期为：" + leaveDays + "天");
		} else {
			if (getNext() != null) {
				getNext().handleRequest(leaveDays);
			} else {
				System.out.println("您请假天数过多，没有人能处理此请假条。");
			}
		}
	}
}
