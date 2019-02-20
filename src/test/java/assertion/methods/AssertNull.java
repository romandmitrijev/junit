package assertion.methods;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class AssertNull {

    @Test
    public void whenAssertNullThenNull() {
        Object object = null;
        assertNull(object);
    }
}
