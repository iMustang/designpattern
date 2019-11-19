package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteMediator
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {
	private List<Colleague> colleagues = new ArrayList<>();

	@Override
	public void register(Colleague colleague) {
		if (!colleagues.contains(colleague)) {
			colleague.setMediator(this);
			colleagues.add(colleague);
		}
	}

	@Override
	public void relay(Colleague colleague) {
		for (Colleague cl : colleagues) {
			if (!cl.equals(colleague)) {
				cl.receive();
			}
		}
	}
}
