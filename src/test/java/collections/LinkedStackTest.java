package collections;

import collections.Exceptions.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {

    static LinkedStack<Integer> ints;

    @BeforeEach
    void setUp() {
        ints = new LinkedStack<>();
    }

    @Test
    void isEmpty() {
        assertTrue(ints.isEmpty());
    }

    @Test
    void push() {
        ints.push(10);
        assertFalse(ints.isEmpty());
    }

    @Test
    void pop() throws EmptyStackException {
        ints.push(10);
        assertEquals(10, ints.pop());
    }
    @Test
    void throwsEmptyStack() throws EmptyStackException{
        assertThrows(EmptyStackException.class, ()->{
            ints.pop();
        });
    }
}