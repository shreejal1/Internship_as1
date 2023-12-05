package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackImplementationTest {

    @Test
    void testisEmpty() throws Exception {
        StackImplementation stackImplementation = new StackImplementation(5);
        assertTrue(stackImplementation.isEmpty());
        stackImplementation.push(3);
        assertFalse(stackImplementation.isEmpty());
    }

    @Test
    void testpush() {
        StackImplementation stackImplementation = new StackImplementation(4);
        assertTrue(stackImplementation.push(1));
        assertTrue(stackImplementation.push(2));
        assertTrue(stackImplementation.push(3));
        assertTrue(stackImplementation.push(4));
        assertFalse(stackImplementation.push(5));

    }

    @Test
    void testpop() {
        StackImplementation stackImplementation = new StackImplementation(4);
        stackImplementation.push(2);
        stackImplementation.push(3);
        stackImplementation.push(4);
        stackImplementation.push(5);

        assertTrue(stackImplementation.pop());
        assertTrue(stackImplementation.pop());
        assertTrue(stackImplementation.pop());
        assertTrue(stackImplementation.pop());
    }

    @Test
    void emptyPop(){
        StackImplementation stackImplementation = new StackImplementation(0);
        assertFalse(stackImplementation.pop());
    }

    @Test
    void testpeek() {
        StackImplementation stackImplementation = new StackImplementation(3);
        stackImplementation.push(2);
        stackImplementation.push(3);
        stackImplementation.push(4);

        assertEquals(4, stackImplementation.peek());
    }

    @Test
    void emptyPeek(){
        StackImplementation stackImplementation = new StackImplementation(0);
        assertEquals(0,stackImplementation.peek());
    }


}