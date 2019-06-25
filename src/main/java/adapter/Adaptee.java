package adapter;

/**
 * 已经存在的要被适配的类
 */
public class Adaptee {
	public void targetMethod() {
		System.out.println("被适配的类的方法");
	}
}
