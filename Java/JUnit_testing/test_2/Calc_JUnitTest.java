package JUnit_testing.test_2;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Calc_JUnitTest {
    @BeforeClass // that method will be invoked only once, before starting all the tests
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    @Before // that method will be invoked before each test
    public void setUp() throws Exception {
        System.out.println("before");
    }
    @Test // that method is the test method
    public void testFindMax() {
        System.out.println("test case find max");
        assertEquals(4, Calculator.findMax(new int[]{1, 3, 4, 2}));
        assertEquals(-2, Calculator.findMax(new int[]{-12, -3, -4, -2}));
    }
    @Test
    public void testCube() {
        System.out.println("test case cube");
        assertEquals(27, Calculator.cube(3));
    }
    @Test
    public void testReverseWord() {
        System.out.println("test case reverse word");
        assertEquals("ym eman si nahK ", Calculator.reverseWord("my name is Khan"));
    }
    @After // that method will be invoked after each test
    public void tearDown() throws Exception {
        System.out.println("after");
    }
    @AfterClass // that method will be invoked only once, after finishing all the tests
    public static void tearDownAfterClass() throws Exception {
        System.out.println("after class");
    }
}
