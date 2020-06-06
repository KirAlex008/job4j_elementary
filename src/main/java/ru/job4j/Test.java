package ru.job4j;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> rsl = List.of(5, 1, 2);
        List<Integer> expect = Arrays.asList(1, 2, 3);
        //rsl.add(0);
        expect.add(0);
    }
}
