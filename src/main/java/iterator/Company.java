package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合
 */
public class Company implements IAggregate {
    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(this.list);
    }
}
