package svArrList;

import java.util.Iterator;

public class SvoiArraylist<E> implements SvoiArray<E> {

    private E[] values;

    public SvoiArraylist() {
        values = (E[]) new Object[0];

    }

    @Override
    public boolean add(E e) {

        try {
            E[] temp = values; //создаем копию
            values = (E[]) new Object[temp.length + 1]; //увеличиваем на 1 элемент
            System.arraycopy(temp, 0, values, 0, temp.length); //копируем обратно
            values[values.length - 1] = e; //вычли 1 (отсчет идет с нуля)
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {

        try {
            E[] temp = values; //создаем копию
            values = (E[]) new Object[temp.length - 1]; //уменьшаем на 1 элемент
            System.arraycopy(temp, 0, values, 0, index); //копируем обратно до удаляемого индекса
            int nextsizeindex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, nextsizeindex); //копируем обратно до удаляемого индекса
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArraySvoiIterator<>(values);
    }
}
