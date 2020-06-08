package job4j.stream;

import org.junit.Test;
import ru.job4j.stream.MatrixToListOfNumbers;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixToListOfNumbersTest {
    @Test
    public void whenListOfListIntegerToList() {
        Integer[][] matrix = {{1, 2}, {3, 4}};
 /*       List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );*/
        List<Integer> result = MatrixToListOfNumbers.collect(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertThat(result, is(expected));
    }
}