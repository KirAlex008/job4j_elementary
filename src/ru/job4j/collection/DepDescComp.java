package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] firstPartO1 = o1.split("/");
        String[] firstPartO2 = o2.split("/");
        int rsl = firstPartO2[0].compareTo(firstPartO1[0]);
        firstPartO2[0] = "";
        firstPartO1[0] = "";
        String secondPartO1 = "";
        for (String el : firstPartO1) {
            secondPartO1 = secondPartO1 + el;
        }
        String secondPartO2 = "";
        for (String el : firstPartO2) {
            secondPartO2 = secondPartO2 + el;
        }
        if (secondPartO1 == "") {
            rsl = -1;
        }
        if (rsl == 0) {
        rsl = secondPartO1.compareTo(secondPartO2);
        }
        return rsl;
    }
}