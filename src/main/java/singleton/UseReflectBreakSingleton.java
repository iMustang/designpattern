package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射打破单例模式
 */
public class UseReflectBreakSingleton {
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		/**
		 * 反射可以打破除枚举实现的单例模式外的其他单例模式
		 */
		Constructor<LazyDoubleCheckSingleton> constructor = LazyDoubleCheckSingleton.class.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		LazyDoubleCheckSingleton singleton1 = constructor.newInstance(null);
		LazyDoubleCheckSingleton singleton2 = constructor.newInstance(null);

		System.out.println(singleton1 == singleton2);

		/**
		 * enum语法糖，JVM会阻止反射获取枚举类的私有构造方法
		 */
		Constructor<SingletonByEmum> declaredConstructor = SingletonByEmum.class.getDeclaredConstructor(null);
		declaredConstructor.setAccessible(true);
		SingletonByEmum singletonByEmum = declaredConstructor.newInstance(null);
		SingletonByEmum singletonByEmum1 = declaredConstructor.newInstance(null);
		System.out.println(singletonByEmum == singletonByEmum1);
	}
}
