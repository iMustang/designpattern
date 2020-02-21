package singleton;

/**
 * 是实现单例模式的最佳方法。自动支持序列化机制，防止反序列化重新创建新的对象
 * <p>
 * 使用枚举实现的单例模式，线程安全，而且可以防止反射构造对象。
 * 枚举类对象被反序列化时，保证反序列化返回结果是同一对象。
 * 使用其他方式实现的单例模式，想要反序列化为同一对象，必须实现readResolve方法
 * <p>
 * JVM会保证enum不能被反射并且构造器方法只执行一次
 */
public class EnumSingleton {
    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private EnumSingleton singleton;

        // JVM会保证此方法绝对只调用一次
        Singleton() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return singleton;
        }
    }
}
