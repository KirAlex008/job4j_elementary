
package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenArea16() {
        double expected = 16;
        Point ap = new Point(0, 0);
        Point bp = new Point(4, 0);
        Point cp = new Point(0, 8);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenArea12() {
        double expected = 12;
        Point ap = new Point(0, 0);
        Point bp = new Point(4, 0);
        Point cp = new Point(0, 6);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
        Assert.assertEquals(expected, result, 0.01);
    }


}
