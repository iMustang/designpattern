package singleton;

/**
 * @Title: LazySercureSingleton
 * 懒汉式，线程安全，通过synchronized方法实现线程安全
 */
public class LazySercureSingleton {
	private static LazySercureSingleton instance;

	private LazySercureSingleton() {
	}

	public static synchronized LazySercureSingleton getInstance() {
		if (instance == null) {
			instance = new LazySercureSingleton();
		}
		return instance;
	}
}
