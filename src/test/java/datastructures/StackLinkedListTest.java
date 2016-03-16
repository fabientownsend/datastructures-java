package datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackLinkedListTest {
    @Test
    public void testPush() throws Exception {
        StackLinkedList c = new StackLinkedList<Integer>();
        c.push(1);
        c.push(2);
        assertEquals(c.getSize(), 2);
        assertEquals(c.peek(), 2);
    }

    @Test
    public void testPop() throws Exception {
        StackLinkedList c = new StackLinkedList<Integer>();
        c.push(1);
        c.push(2);
        c.pop();
        assertEquals(c.getSize(), 1);
        assertEquals(c.peek(), 1);
    }

    @Test
    public void testIsEmpty() throws Exception {
        StackLinkedList c = new StackLinkedList<Integer>();
        assertTrue(c.isEmpty());
    }
}
