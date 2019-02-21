package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzerTest {

    @Test
    public void whenNumberIs1ThenFizzBuzzer1() {
        int input = 1;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected, "1");
    }

    @Test
    public void whenNumberIs2ThenFizzBuzzer2() {
        int input = 2;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected, "2");
    }

    @Test
    public void whenNumberIs3ThenFizzBuzzerFizz() {
        int input = 3;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected, "Fizz");
    }

    @Test
    public void whenNumberIs5ThenFizzBuzzerBuzz() {
        int input = 5;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected, "Buzz");
    }

    @Test
    public void whenNumberIs6ThenFizzBuzzerFizz() {
        int input = 6;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected, "Fizz");
    }

    @Test
    public void whenNumberIs10ThenFizzBuzzerBuzz() {
        int input = 10;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected, "Buzz");
    }

    @Test
    public void whenNumberIs15ThenFizzBuzzerFizzBuzz() {
        int input = 15;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected, "FizzBuzz");
    }
}
