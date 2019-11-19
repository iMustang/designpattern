package mediator;

/**
 * ConcreteColleagueB
 * 具体同事B
 */
public class ConcreteColleagueB extends Colleague {
	@Override
	public void receive() {
		System.out.println("具体同事B收到请求。");
	}

	@Override
	public void send() {
		System.out.println("具体同事B发出请求。");
		// 请求中介者转发
		mediator.relay(this);
	}
}
