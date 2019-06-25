package singleton;

/**
 * 内部类实现单例模式，延迟加载，线程安全
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
    }

    private static class LazyHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
