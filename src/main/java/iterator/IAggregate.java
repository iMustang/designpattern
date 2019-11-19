package iterator;

/**
 * 抽象聚合
 */
public interface IAggregate {
    void add(Object obj);

    Iterator createIterator();
}
