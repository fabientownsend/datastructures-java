package datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    private LinkedList c;

    @Before
    public void setUp() {
        c = new LinkedList();
    }
    @Test
    public void testPrepend() throws Exception {
        c.prepend(1);
        c.prepend(2);
        String linkedList = c.toString();
        assertEquals(linkedList, "21");
    }

    @Test
    public void testAppend() throws Exception {
        c.append(1);
        c.append(2);
        String linkedList = c.toString();
        assertEquals(linkedList, "12");
    }

    @Test
    public void testSize() throws Exception {
        c.append(1);
        c.append(2);
        int temp = c.getSize();
        assertEquals(temp, 2);
    }

    @Test
    public void testRemoveFirst() throws Exception {
        c.append(1);
        c.append(2);
        c.removeFirst();
        String linkedList = c.toString();
        int temp = c.getSize();
        assertEquals(temp, 1);
        assertEquals(linkedList, "2");
    }
}
