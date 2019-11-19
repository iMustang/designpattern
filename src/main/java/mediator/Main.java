package mediator;

/**
 * Main
 *
 */
public class Main {
	public static void main(String[] args) {
		ConcreteMediator concreteMediator = new ConcreteMediator();

		ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA();
		concreteMediator.register(concreteColleagueA);

		ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB();
		concreteMediator.register(concreteColleagueB);

		concreteColleagueA.send();

		System.out.println("-------------------");

		concreteColleagueB.send();
	}
}
