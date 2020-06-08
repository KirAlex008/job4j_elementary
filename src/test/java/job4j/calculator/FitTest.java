package job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void whenMenHeight188ThenWeght101and19() {
        int in = 188;
        double expected = 101.19;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight178ThenWeight78and19() {
        int in = 178;
        double expected = 78.19;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}