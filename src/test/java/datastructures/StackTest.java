package test.java.datastructures;

import main.java.datastructures.ArrayStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {
    @Test
    public void testResize_whenEmptyArray() throws Exception {
        ArrayStack c = new ArrayStack();
        c.resize();
        assertEquals(c.getSize(), 20);
    }

    @Test
    public void testResize() throws Exception {
        ArrayStack c = new ArrayStack(4);
        c.resize();
        assertEquals(c.getSize(), 8);
    }

    @Test
    public void testPush() throws Exception {
        ArrayStack c = new ArrayStack();
        c.push(1);
        int peek = c.peek();
        assertEquals(peek, 1);
    }

    @Test
    public void testPush_haveToResize() throws Exception {
        ArrayStack c = new ArrayStack(2);
        c.push(1);
        c.push(1);
        c.push(1);
        assertEquals(c.getSize(), 4);
    }

    @Test
    public void testPop() throws Exception {
        ArrayStack c = new ArrayStack();
        c.push(1);
        c.push(2);
        c.pop();
        int peek = c.peek();
        assertEquals(peek, 1);
    }

    @Test
    public void testToString() throws Exception {
        ArrayStack c = new ArrayStack();
        c.push(1);
        c.push(2);
        String temp = c.toString();
        assertTrue(temp.equals("21"));
    }
}
