package svArrList;

import java.util.Iterator;

public class ArraySvoiIterator<E> implements Iterator<E> {

    private final E[] values;
    private int index = 0;

    ArraySvoiIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
