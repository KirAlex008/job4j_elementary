package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MethodsTest {

    @Test
    public void whenHasMonoHorizontal() {
        int[][] input = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        boolean result = Methods.monoHorizontal(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        int[][] input = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        boolean result = Methods.monoHorizontal(input, 2);
        assertThat(result, is(false));
    }

     @Test
     public void whenHasMonoVertical() {
        int[][] input = {
             {1, 1, 0, 0, 0},
             {1, 0, 0, 0, 0},
             {1, 0, 0, 0, 0},
             {1, 0, 0, 0, 0},
             {1, 0, 0, 0, 0},
        };
        boolean result = Methods.monoVertical(input, 0);
        assertThat(result, is(true));
    }
    @Test
    public void whenHasNotMonoVertical() {
        int[][] input = {
                {0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
        };
        boolean result = Methods.monoVertical(input, 0);
        assertThat(result, is(false));
    }
}