package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftNummer = left.split("\\.");
        String[] rightNummer = right.split("\\.");
        return Integer.compare(Integer.valueOf(leftNummer[0]), Integer.valueOf(rightNummer[0]));
    }
}