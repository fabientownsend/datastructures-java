package datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    @Test
    public void testPrepend() throws Exception {
        LinkedList c = new LinkedList();
        c.prepend(1);
        c.prepend(2);
        String linkedList = c.toString();
        assertEquals(linkedList, "21");
    }

    @Test
    public void testAppend() throws Exception {
        LinkedList c = new LinkedList();
        c.append(1);
        c.append(2);
        String linkedList = c.toString();
        assertEquals(linkedList, "12");
    }

    @Test
    public void testSize() throws Exception {
        LinkedList c = new LinkedList();
        c.append(1);
        c.append(2);
        int temp = c.getSize();
        assertEquals(temp, 2);
    }
}
