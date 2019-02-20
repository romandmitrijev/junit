package assertion;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialPositiveIntegerReturnsResult() {
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test(expected = RuntimeException.class)
    public void whenCalculateFactorialNegativeIntegerThrowException() {
        Factorial.calculateFactorial(-1);
    }


    @Test(expected = RuntimeException.class)
    public void whenCalculateFactorialZeroIntegerThrowException() {
        Factorial.calculateFactorial(0);
    }

    @Test(expected = RuntimeException.class)
    public void whenCalculateFactorialBigInteger() {
        Factorial.calculateFactorial(25);
    }

}