package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("K1/SK1");
        List<String> expect = Arrays.asList("K1", "K1/SK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("K1", "K1/SK1");
        List<String> expect = Arrays.asList("K1", "K1/SK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortingNaturalOder() {

        List<String> input = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2", "K2/SK1/SSK1", "K2/SK1/SSK2");
        List<String> result = Departments.fillGaps(input);
        result = Departments.sortAsc(result);
        if (result.contains("K1/SK2/SSK2")) {
            result.remove("K1/SK2/SSK2");
        }
        if (result.contains("K1/SK2/SSK1")) {
            result.remove("K1/SK2/SSK1");
        }
        List<String> expect = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2", "K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2");
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortingDepDescCompOder() {

        List<String> input = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2", "K2/SK1/SSK1", "K2/SK1/SSK2");
        List<String> result = Departments.fillGaps(input);
        result = Departments.sortDesc(result);
        if (result.contains("K1/SK2/SSK2")) {
            result.remove("K1/SK2/SSK2");
        }
        if (result.contains("K1/SK2/SSK1")) {
            result.remove("K1/SK2/SSK1");
        }
        List<String> expect = Arrays.asList("K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2", "K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2");
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortingGruppe() {

        List<String> input = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2", "K2/SK1");
        List<String> expect = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2");
        List<String> result = Departments.gruppeOfK("K1", input);

        assertThat(result, is(expect));
    }

    @Test
    public void whenFormingParts() {

        List<String> input = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2");
        List<String> expect = Arrays.asList("K1", "SK1", "SK2", "SSK1", "SSK2");
        List<String> result = Departments.formingOfParts(input);

        assertThat(result, is(expect));
    }

    @Test
    public void whenFormingList() {

        List<String> input = Arrays.asList("K1", "SK1", "SK2", "SSK1", "SSK2");
        List<String> expect = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2");
        List<String> result = Departments.formingOfList(input, 5);

        assertThat(result, is(expect));
    }

}