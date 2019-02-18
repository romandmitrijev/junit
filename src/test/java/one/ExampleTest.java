package one;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertSame;


public class ExampleTest {

    @Test
    public void test(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(5,3);
        //then
        assert result == 8;

    }

    @Test
    public void testTrue() {
        assertTrue(5==5);

    }

    @Test
    public void testObjects() {
        Integer integer1 = 1;
        Integer integer2 = 1;

        assertSame(integer1,integer2);

    }
}
