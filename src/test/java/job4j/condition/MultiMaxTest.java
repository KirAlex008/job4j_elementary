package job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenThidMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 2, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenAllEqualsMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 4, 4);
        assertThat(result, is(4));
    }
}