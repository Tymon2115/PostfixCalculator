package collections.Lists;

import collections.Exceptions.EmptyListException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    static LinkedList<Integer> ints;
    @BeforeEach
    void setup() {
        ints = new LinkedList<>();
    }

    @Test
    void isEmpty() {
        assertTrue(ints.isEmpty());
    }

    @Test
    void size() {
        ints.addToFront(10);
        assertEquals(1, ints.size());
    }

    @Test
    void addToFront() {
        ints.addToFront(10);
        assertFalse(ints.isEmpty());
    }

    @Test
    void removeFirst() {
        ints.addToFront(10);
        try {
            assertEquals(10, ints.removeFirst());
        } catch (EmptyListException e) {
            e.printStackTrace();
        }
    }
    @Test
    void throwsEmptyList() throws EmptyListException {
        assertThrows(EmptyListException.class, ()->{
            ints.removeFirst();
        });
    }
}