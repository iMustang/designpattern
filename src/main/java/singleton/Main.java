package singleton;

public class Main {
	/**
	 * 一般情况下，不建议使用LazySingleton，LazySercureSingleton，建议使用HungrySingletom
	 * 在要明确实现 lazy loading 效果时，使用StaticInnerClassSingleton
	 * 涉及到反序列化创建对象时，可以尝试使用SingletonByEmum
	 * 如果有其他特殊的需求，可以考虑使用LazyDoubleCheckSingleton
	 */

	public static void main(String[] args) {
		new Thread(new TestSingletonSafeThread()).start();
		new Thread(new TestSingletonSafeThread()).start();
	}

	static class TestSingletonSafeThread implements Runnable {
		@Override
		public void run() {
			LazySingleton instance = LazySingleton.getInstance();
			System.out.println(instance);
		}
	}
}
