package datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BSTNodeTest {
    private  BSTNode<Integer> c;

    @Before
    public void setUp() {
        c = new BSTNode<Integer>(1);
    }

    @Test
    public void testGetMinValue() throws Exception {
        c.insert(5);
        c.insert(1);
        int minValue = c.getMinValue();
        assertEquals(1, minValue);
    }

    @Test
    public void testGetMaxValue() throws Exception {
        c.insert(5);
        c.insert(1);
        int maxValue = c.getMaxValue();
        assertEquals(5, maxValue);
    }

    @Test
    public void testRemove() throws Exception {
        c = new BSTNode<Integer>(6);
        c.insert(5);
        c.insert(1);
        c.insert(4);
        c.remove(1, c);
        int minValue = c.getMinValue();
        assertEquals(4, minValue);
    }
}
