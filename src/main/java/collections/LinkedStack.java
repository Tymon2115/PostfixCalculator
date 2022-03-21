package collections;

import collections.Exceptions.EmptyStackException;
import collections.Lists.LinkedList;
import collections.Lists.List;

public class LinkedStack<T> implements Stack<T> {

    private List<T> linkedList;

    public LinkedStack(){
        linkedList = new LinkedList<>();
    }


    @Override
    public boolean isEmpty() {
        return this.linkedList.isEmpty();
    }

    @Override
    public void push(T data) {
        linkedList.addToFront(data);
    }

    @Override
    public T pop() throws EmptyStackException {
        try{
            return linkedList.removeFirst();
        } catch (Exception e){
            throw new EmptyStackException("Stack is empty!");
        }
    }
}
