package collections.Lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    static int someData;
    static int someNext;
    @BeforeAll
    static void setup(){
        someData = 1;
        someNext = 2;
    }

    @Test
    void getData() {
        Node<Integer> node = new Node<>(someData);
        assertEquals(someData, node.getData());
    }

    @Test
    void setData() {
        Node<Integer> node = new Node<>(someData);
        node.setData(10);
        Assertions.assertEquals(10, node.getData());
    }

    @Test
    void getNext() {
        Node<Integer> node = new Node<>(someData);
        assertNull(node.getNext());

    }

    @Test
    void setNext() {
        Node<Integer> node = new Node<>(someData);
        assertNull(node.getNext());
        Node<Integer> next = new Node<>(someNext);
        node.setNext(next);
        assertEquals(next, node.getNext());
    }
}