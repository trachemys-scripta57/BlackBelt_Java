package JUnit_testing.test_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTest1 {
    @Test
    public void testFindMax () {
        assertEquals(4, Test1.findMax(new int[]{1, 3, 4, 2}));
        assertEquals(-1, Test1.findMax(new int[]{-12, -1, -3, -4, -2}));
    }
}
