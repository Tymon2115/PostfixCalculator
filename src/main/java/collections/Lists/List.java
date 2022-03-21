package collections.Lists;

import collections.Exceptions.EmptyListException;

public interface List<T> {
    boolean isEmpty();
    int size();
    void addToFront(T data);
    T removeFirst() throws EmptyListException;
}
