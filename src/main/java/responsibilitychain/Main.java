package responsibilitychain;

/**
 * Main
 * Client：客户类角色：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。
 */
public class Main {
	public static void main(String[] args) {
		ClassAdviser classAdviser = new ClassAdviser();
		DepartmentHead departmentHead = new DepartmentHead();
		Dean dean = new Dean();

		classAdviser.setNext(departmentHead);
		departmentHead.setNext(dean);

		int leaveDays = 8;
		classAdviser.handleRequest(leaveDays);
	}
}
