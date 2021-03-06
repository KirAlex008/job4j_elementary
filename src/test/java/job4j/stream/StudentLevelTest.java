package job4j.stream;

import org.junit.Test;
import ru.job4j.stream.Student;
import ru.job4j.stream.StudentLevel;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student("Pety",128));
        input.add(new Student("Masha",28));
        List<Student> expected = List.of(
                new Student("Pety",128),
                new Student("Masha",28)

        );
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student("Pety",28));
        List<Student> expected = List.of(new Student("Pety",28));
        assertThat(StudentLevel.levelOf(input, 10), is(expected));
    }

    @Test
    public void whenBoundIs30() {
        List<Student> input = new ArrayList<>();
        input.add(new Student("Pety",128));
        input.add(new Student("Masha",28));
        List<Student> expected = List.of(new Student("Pety",128));
        assertThat(StudentLevel.levelOf(input, 30), is(expected));
    }

    @Test
    public void whenBoundIs130() {
        List<Student> input = new ArrayList<>();
        input.add(new Student("Pety",128));
        input.add(new Student("Masha",28));
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 130), is(expected));
    }
}