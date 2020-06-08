package job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void whenFirstPThenDistance26and62() {
        Point point1 = new Point(10, 20, -5);
        Point point2 = new Point(-20, 10, 30);
        double expected = 47.1;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.1);

    }
}