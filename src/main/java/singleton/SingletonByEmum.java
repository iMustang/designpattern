package singleton;

/**
 * @Title: SingletonByEmum
 * 是实现单例模式的最佳方法，但未被广泛使用，。自动支持序列化机制，防止反序列化重新创建新的对象
 */
public enum SingletonByEmum {
	INSTANCE;
}
