package iterator;

import java.util.List;

/**
 * 具体迭代器
 */
public class ListIterator implements Iterator {
    private List<Object> list;
    private Integer index = -1;

    public ListIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return list.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }
}
