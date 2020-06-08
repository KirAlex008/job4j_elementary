package job4j.collection;

import org.junit.Test;
import ru.job4j.collection.*;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorByPriorityHight() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityHight();
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByPriorityLow() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityLow();
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenCompatorByNameLow() {
        Comparator<Job> cmpNamePriority = new JobDescByNameLow();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameHight                                                                                                                            () {
        Comparator<Job> cmpNamePriority = new JobDescByNameHight();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }


    @Test
    public void whenCompatorByNameAndProrityLow() {
        Comparator<Job> cmpNamePriority = new JobDescByNameLow().thenComparing(new JobDescByPriorityLow());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }


    @Test
    public void whenCompatorByNameAndProrityHight() {
        Comparator<Job> cmpNamePriority = new JobDescByNameHight().thenComparing(new JobDescByPriorityHight());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
            );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameHightAndProrityLow() {
        Comparator<Job> cmpNamePriority = new JobDescByNameHight().thenComparing(new JobDescByPriorityLow());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameLowAndProrityHight() {
        Comparator<Job> cmpNamePriority = new JobDescByNameLow().thenComparing(new JobDescByPriorityHight());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}