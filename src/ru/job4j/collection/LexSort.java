package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        List<String> list = List.of("1", "2", "3", "4", "5", "6", "7", "9", "0");
        String lineLeft = "";
        String lineRight = "";
        for (int i = 0; i <= left.length() - 1; i++) {
            if (list.contains("" + left.charAt(i))) {
                lineLeft = lineLeft + left.charAt(i);
            }
        }
        for (int i = 0; i <= right.length() - 1; i++) {
            if (list.contains("" + right.charAt(i))) {
                lineRight = lineRight + right.charAt(i);
            }
        }
        return Integer.compare(Integer.valueOf(lineLeft), Integer.valueOf(lineRight));
    }
}