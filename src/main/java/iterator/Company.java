package iterator;

import java.util.ArrayList;
import java.util.List;

public class Company implements IOperation {
    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public IIterator createIterator() {
        return new ListIterator(this.list);
    }
}
