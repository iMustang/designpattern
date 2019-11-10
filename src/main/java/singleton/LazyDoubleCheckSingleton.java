package singleton;

/**
 * 双重校验加锁，线程安全
 * 双重检验指的是两次判空
 *
 * 相比LazySercureSingleton，性能高
 */
public class LazyDoubleCheckSingleton {

    /**
     * instance = new Singleton，会被编译器编译成如下JVM指令：
     *      memory = allocate();    //1：分配对象的内存空间
     *      ctorInstance(memory);   //2：初始化对象
     *      instance = memory;      //3：设置instance指向刚分配的内存地址
     *
     * 这些指令顺序并非一成不变，有可能会经过JVM和CPU的优化，指令重排成下面的顺序：
     *      memory = allocate();    //1：分配对象的内存空间
     *      instance = memory;      //3：设置instance指向刚分配的内存地址
     *      ctorInstance(memory);   //2：初始化对象
     *
     *  这样如果线程A进入临界区，创建instance对象，但未初始化完成。
     *  此时线程B抢占到CPU资源，执行if(instance==null)为false，直接返回instance，但是此时的instance未初始化完成。
     *
     *  经过volatile的修饰，当线程A执行instance = new Singleton的时候，始终保证是下面的顺序：
     *      memory = allocate();    //1：分配对象的内存空间
     *      ctorInstance(memory);   //2：初始化对象
     *      instance = memory;      //3：设置instance指向刚分配的内存地址
     *  如此在线程B看来，instance对象的引用要么null，要么指向一个初始化完毕的Instance，而不会出现某个中间态，保证了安全。
     *
     */
    private volatile static LazyDoubleCheckSingleton instance; // volatile防止指令重排序，volatile阻止了被修饰变量的访问前后指令重排，保证了指令执行顺序。详见上面分析。

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) { // 刚开始，线程A、B都判断为空，假设线程A先进入临界区
            synchronized (LazyDoubleCheckSingleton.class) {
                // 线程A创建完对象，instance不为空了。
                // 进行第二次判空是为了，线程B之前在外层if判断为true也会进入临界区，此时instance已经由线程A构建，不再为空，instance是静态变量，线程B再访问一次，判断不为空，不再构建instance
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
