package singleton;

/**
 * 饿汉式单例，线程安全
 */
public class HungrySingletom {
    private static final HungrySingletom INSTANCE = new HungrySingletom();

    private HungrySingletom() {
    }

    public static HungrySingletom getInstance() {
        return INSTANCE;
    }
}
