package mediator;

/**
 * Mediator
 * 抽象中介者
 */
public abstract class Mediator {
	public abstract void register(Colleague colleague);

	// 转发
	public abstract void relay(Colleague colleague);
}
