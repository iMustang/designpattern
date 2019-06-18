package singleton;

/**
 * 内部类实现单例模式，延迟加载，线程安全
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
    }

    private static class InnerClass {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
