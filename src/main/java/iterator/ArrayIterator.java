package iterator;

public class ArrayIterator implements IIterator {
    private Object[] obj;
    private Integer index = -1;

    public ArrayIterator(Object[] obj) {
        this.obj = obj;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return obj[++index];
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < obj.length - 1;
    }
}
