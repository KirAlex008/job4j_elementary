package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] firstPartO1 = o1.split("/");
        String[] firstPartO2 = o2.split("/");
        int rsl = firstPartO2[0].compareTo(firstPartO1[0]);
        if (rsl == 0) {
            rsl = o1.compareTo(o2);
        }
        return rsl;
    }
}