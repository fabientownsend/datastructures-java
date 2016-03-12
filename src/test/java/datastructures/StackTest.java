package test.java.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {
    @Test
    public void testResize_whenEmptyArray() throws Exception {
        main.java.datastructures.Stack c = new main.java.datastructures.Stack();
        c.resize();
        assertEquals(c.getSize(), 20);
    }

    @Test
    public void testResize() throws Exception {
        main.java.datastructures.Stack c = new main.java.datastructures.Stack(4);
        c.resize();
        assertEquals(c.getSize(), 8);
    }

    @Test
    public void testPush() throws Exception {
        main.java.datastructures.Stack c = new main.java.datastructures.Stack();
        c.push(1);
        int peek = c.peek();
        assertEquals(peek, 1);
    }

    @Test
    public void testPush_haveToResize() throws Exception {
        main.java.datastructures.Stack c = new main.java.datastructures.Stack(2);
        c.push(1);
        c.push(1);
        c.push(1);
        assertEquals(c.getSize(), 4);
    }

    @Test
    public void testPop() throws Exception {
        main.java.datastructures.Stack c = new main.java.datastructures.Stack();
        c.push(1);
        c.push(2);
        c.pop();
        int peek = c.peek();
        assertEquals(peek, 1);
    }

    @Test
    public void testToString() throws Exception {
        main.java.datastructures.Stack c = new main.java.datastructures.Stack();
        c.push(1);
        c.push(2);
        String temp = c.toString();
        assertTrue(temp.equals("21"));
    }
}
