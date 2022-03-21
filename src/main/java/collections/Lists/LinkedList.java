package collections.Lists;

import collections.Exceptions.EmptyListException;

public class  LinkedList<T> implements List<T> {

    private Node<T> head;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
        if (head == null)
            head = new Node<>(data);
        else {
            Node<T> tmp = new Node<>(data);
            tmp.setNext(head);
            head = tmp;
        }
        size++;
    }

    @Override
    public T removeFirst() throws EmptyListException {
       if (isEmpty())
           throw new EmptyListException("List is empty!");

       var next = head.getNext();
       var data = head.getData();
       head = next;
       size--;
       return data;
    }
}
