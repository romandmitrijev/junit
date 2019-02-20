package assertion.methods;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class AssertThatMatchers {

    //from hamcrest
    //assertThat ([value], [matcher statement])
    @Test
    public void assertTat1() {
        int a = 1, b = 2;
        assertThat(a, is(b));
        assertThat(a, equalTo(b));
        assertThat(a, is(equalTo(b)));
    }

    @Test
    public void assertThat2() {
        int a=1, b=2, c=3;
        assertThat(a, anyOf(is(b), is(c)));
        assertThat("test", anyOf(is("testing"), containsString("est")));
    }

    @Test
    public void testAssertThatHasItems() {
        assertThat(Arrays.asList("Java", "Kotlin", "Scala"), hasItems("Java", "Kotlin"));
    }
}
