package mockito.methods;

import assertion.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculetorMockitoTest {

    @Mock
    Calculator calculator;

    @Test
    public void testAddWithPositiveIntegerReturnResult() {
        when(calculator.add(3,5)).thenReturn(8);
    }

    @Test
    public void testAddWithNegativeIntegerReturnResult() {
        when(calculator.add(-3,-5)).thenReturn(-8);
    }

    //!Important what does this mean?
    @Test
    public void testAddWithAnyIntegerReturnAny() {
        when(calculator.add(anyInt(), anyInt())).thenReturn(120);
    }
    
}
