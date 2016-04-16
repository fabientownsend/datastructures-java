package datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreesTest {
    @Test
    public void testGetMaxValue() throws Exception {
        BinarySearchTrees<Integer> b = new BinarySearchTrees();
        b.instert(1);
        b.instert(11);
        b.instert(15);
        int maxValue = b.getMax();
        assertEquals(maxValue, 15);
    }

    @Test
    public void testGetMaxValueAfterRemove() throws Exception {
        BinarySearchTrees<Integer> b = new BinarySearchTrees();
        b.instert(1);
        b.instert(11);
        b.instert(15);
        b.remove(15);
        int maxValue = b.getMax();
        assertEquals(maxValue, 11);
    }

    @Test
    public void testGetMinValue() throws Exception {
        BinarySearchTrees<Integer> b = new BinarySearchTrees();
        b.instert(1);
        b.instert(11);
        b.instert(15);
        int minValue = b.getMin();
        assertEquals(minValue, 1);
    }

    @Test
    public void testGetMinValueAfterRemove() throws Exception {
        BinarySearchTrees<Integer> b = new BinarySearchTrees();
        b.instert(1);
        b.instert(11);
        b.instert(15);
        b.remove(1);
        int minValue = b.getMin();
        assertEquals(minValue, 11);
    }
}
