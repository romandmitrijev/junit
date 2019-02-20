package mockito.methods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ListExample {

    @Test
    public void testMockWithDoAnswer() {
        List<String> listMock = Mockito.mock(ArrayList.class);
        doAnswer(invocation -> "Always the same").when(listMock).get(anyInt());

        String element = listMock.get(1);
        assertThat(element, is(equalTo("Always the same")));
    }

    @Test(expected = IllegalStateException.class)
    public void testMockBehaviourWithDifferentCalls() {
        List<String> listMock = Mockito.mock(ArrayList.class);
        when(listMock.add(anyString())).thenReturn(false).thenThrow(IllegalStateException.class);
        listMock.add(anyString());
        listMock.add(anyString()); //will throw an exception
    }
}
