package datastructures;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {
    private ArrayStack stack;

    @Before
    public void setUp() throws Exception {
        stack = new ArrayStack(2);
    }

    @Test
    public void newlyCreatedStack_ShouldBeEmpty() throws Exception {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void afterOnePush_StackShouldBeONe() throws Exception {
        stack.push(1);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());
    }

    @Test
    public void afterOnePushAndOnePop_ShouldBeEmpty() throws Exception {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test(expected = ArrayStack.Overflow.class)
    public void whenPushPastLimit_StackShouldOverflow() throws Exception {
        stack.push(1);
        stack.push(1);
        stack.push(1);
    }

    @Test(expected = ArrayStack.Underflow.class)
    public void whenEmptyStackIsPopped_StackShouldUnderflow() throws Exception {
       stack.pop();
    }

    @Test
    public void testResize_whenEmptyArray() throws Exception {
        ArrayStack c = new ArrayStack();
        c.resize();
        assertEquals(0, c.getSize());
    }

    @Test
    public void testResize() throws Exception {
        ArrayStack c = new ArrayStack(4);
        c.resize();
        assertEquals(0, c.getSize());
    }

    @Test
    public void testPush() throws Exception {
        ArrayStack c = new ArrayStack(1);
        c.push(1);
        int peek = c.peek();
        assertEquals(1, peek);
    }

    @Test
    public void testPush_haveToResize() throws Exception {
        ArrayStack c = new ArrayStack(3);
        c.push(1);
        c.push(1);
        c.push(1);
        assertEquals(3, c.getSize());
    }

    @Test
    public void testPop() throws Exception {
        ArrayStack c = new ArrayStack(2);
        c.push(1);
        c.push(2);
        c.pop();
        int peek = c.peek();
        assertEquals(1, peek);
    }

    @Test
    public void testToString() throws Exception {
        ArrayStack c = new ArrayStack(2);
        c.push(1);
        c.push(2);
        String temp = c.toString();
        assertTrue(temp.equals("21"));
    }
}
