package assertation.methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AssertEquals {
    @Test
    public void whenAssertingEquility_thenEqual() {
        String expected = "Feride";
        String actual = new String("Feride");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAssertEqualsPass() {
        assertEquals(64, 2*32);
    }

    @Test
    public void whenAssertEqualsAssertionErrorWithComment() {
        assertEquals("Values are not equal", 1,2);
    }
}
