package mockito.annotation;

import assertion.Calculator;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {
    //if we want to run class with mockito, we need to use
    //@RunWith annotation

    @Mock
    Calculator calculator;
    //this is how we mock the object

    Calculator calculator2 = mock(Calculator.class);

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
}
