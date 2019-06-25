package adapter.forobj;

/**
 * 已经存在的要被适配的类，这个类的数据、行为都正确，但是与目标接口不一致
 * 与目标接口不一致，表明Adaptee没有实现目标接口，在本例中就是没有实现ITarget接口
 */
public class Adaptee {
	public void specificRequest() {
		System.out.println("被适配的类的方法");
	}
}
