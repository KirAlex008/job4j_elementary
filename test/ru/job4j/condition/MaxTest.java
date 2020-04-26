package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax10To20Then20() {
        int result = Max.max(10, 20);
        assertThat(result, is(20));
    }
    @Test
    public void whenMax20To10To5Then20() {
        int result = Max.max(20, 10,5);
        assertThat(result, is(20));
    }
    @Test
    public void whenMax20To10To5To12Then20() {
        int result = Max.max(20, 10, 5, 12);
        assertThat(result, is(20));
    }
    @Test
    public void whenMax10To10To10Then10() {
        int result = Max.max(10, 10, 10);
        assertThat(result, is(10));
    }
}