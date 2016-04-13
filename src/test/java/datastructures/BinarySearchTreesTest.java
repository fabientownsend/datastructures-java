package datastructures;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class BinarySearchTreesTest {
    @Test
    public void testCretionClass() throws Exception {
        BinarySearchTrees<Integer> b = new BinarySearchTrees();
        assertTrue(b instanceof BinarySearchTrees);
    }
}
