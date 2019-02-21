package assertj;

import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

public class ExamplesTest {

    @Test
    public void testAssertThatWithStringArray() {
        String[] stringArray = {"abc", "cde", "efg"};
        assertThat(stringArray).hasSize(3).contains("cde").doesNotContain("xyz");
    }

    @Test
    public void testAssertThatWithUnicode() {
        assertThat('d').isNotEqualTo('a').inUnicode().isGreaterThan('b').isLowerCase();
    }

    @Test
    public void testAssertThatWithFile() {
        assertThat(new File("c:\\test.txt")).exists().isFile().canRead().canWrite();
    }

    @Test
    public void testAssertThatWithMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(2,"a");
        assertThat(map).isNotEmpty().containsKeys().doesNotContainKeys(10).containsAnyOf(entry(2, "a"));
    }
}
