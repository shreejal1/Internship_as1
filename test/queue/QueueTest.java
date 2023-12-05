package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void isEmptyTest(){
        queue q = new queue(0);
        assertTrue(q.isEmpty());
    }

    @Test
    void enqueuetest(){
        queue q = new queue(3);
        assertTrue(q.enqueue(1));
        assertTrue(q.enqueue(2));
        assertTrue(q.enqueue(3));
    }

    @Test
    void dequeueTest(){
        queue q = new queue(2);
        q.enqueue(1);
        q.enqueue(2);
        assertEquals(1,q.dequeue());
        assertEquals(2, q.dequeue());

        assertEquals(-1, q.dequeue());
    }

    @Test
    void peekfirstTest(){
        queue q = new queue(2);
        q.enqueue(1);
        q.enqueue(2);
        assertEquals(1, q.peekFirst());

        q.dequeue();
        q.dequeue();

        assertEquals(-1, q.peekFirst());
    }

}