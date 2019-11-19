package iterator;

/**
 * 具体聚合
 */
public class Management implements IAggregate {
    private static final Integer MAX_LENGTH = 100;
    private Object[] array = new Object[MAX_LENGTH];
    private Integer index = -1;

    @Override
    public void add(Object obj) {
        ++index;
        if (index != MAX_LENGTH) {
            array[index] = obj;
        } else {
            System.out.println("达到容器最大长度");
        }
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this.array);
    }
}
