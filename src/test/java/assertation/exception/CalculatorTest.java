package assertation.exception;

import assertation.Calculator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Random;

public class CalculatorTest {

    //Exceptions

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDividingBy0() {
        // given
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();
        // when
        calculator.divide(number, 0);
        // then
        // should throw exception
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        Object nullObject = null;
        nullObject.equals(new Object());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldThrowExceptionWhenDividingBy0_2() {
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        // given
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();
        // when
        calculator.divide(number, 0);
        // then
        // should throw exception
    }
}
