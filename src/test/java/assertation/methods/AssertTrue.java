package assertation.methods;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AssertTrue {

    @Test
    public void shouldAssertTrueThrowAssertionError() {
        assertTrue(5==5);

    }

    @Test
    public void shouldAssertTruePass() {
        assertTrue(2==2);
        assertTrue("my name".equals(new String("my name")));
    }
}
