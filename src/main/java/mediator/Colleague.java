package mediator;

import lombok.Setter;

/**
 * Colleague
 * 抽象同事类
 */
@Setter
public abstract class Colleague {
	protected Mediator mediator;

	public abstract void receive();

	public abstract void send();
}
