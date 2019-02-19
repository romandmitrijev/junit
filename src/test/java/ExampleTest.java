import assertation.Calculator;
import org.junit.Test;



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

}
