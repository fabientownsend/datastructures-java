package test.java.datastructures;

import main.java.datastructures.ArrayStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayStackTest {
    @Test
    public void canCreateNewArrayStack() throws Exception {
        ArrayStack c = new ArrayStack(4);
    }

    @Test
    public void testCoucou() throws Exception {
        ArrayStack c = new ArrayStack(4);
        assertEquals(c.coucou(), 5);
    }
}
