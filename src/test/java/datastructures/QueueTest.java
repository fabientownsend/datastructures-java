package datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {
    @Test
    public void testEnqueue() throws Exception {
        Queue<Integer> c = new Queue<Integer>();
        c.enqueue(1);
        c.enqueue(2);
        int peek = c.peek();
        assertEquals(c.getSize(), 2);
        assertEquals(peek, 1);
    }

    @Test
    public void testDequeue() throws Exception {
        Queue<Integer> c = new Queue<Integer>();
        c.enqueue(1);
        c.enqueue(2);
        int dequeuResult = c.dequeu();
        int peek = c.peek();
        assertEquals(c.getSize(), 1);
        assertEquals(peek, 2);
        assertEquals(dequeuResult, 1);
    }
}
