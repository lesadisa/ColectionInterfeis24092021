package svLinkedlist;

public interface Linked<E> {
void addLast(E e); //добавить в конец
void addFirst(E e); // добавить в начало
int size(); // размер
E getElementIndex(int counter);//возврат элемента по индексу


}
