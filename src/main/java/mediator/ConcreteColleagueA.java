package mediator;

/**
 * ConcreteColleagueA
 * 具体同事A
 */
public class ConcreteColleagueA extends Colleague {
	@Override
	public void receive() {
		System.out.println("具体同事A收到请求。");
	}

	@Override
	public void send() {
		System.out.println("具体同事A发出请求。");
		// 请求中介者转发
		mediator.relay(this);
	}
}
