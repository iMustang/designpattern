package singleton;

/**
 * 双重校验加锁，线程安全
 * 相比LazySercureSingleton，性能高
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
