package assertion.lifecycle;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class JUnitLifeCycle {
    @Before
    public void setUp() throws Exception {
        System.out.println("Run before each test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Run after each method");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Run before the first test method");
    }

    @AfterClass
    public static void tearDownBeforeClass() throws Exception {
        System.out.println("Run after the last test method");
    }

    @Test
    public void nameMe() {
        assertTrue(true);
    }

    @Test
    public void assertEquals() {

    }
}
