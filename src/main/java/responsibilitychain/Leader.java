package responsibilitychain;

import lombok.Data;

/**
 * Leader
 * Handler：抽象处理者，定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 */
@Data
public abstract class Leader {
	private Leader next;

	public abstract void handleRequest(int leaveDays);
}
