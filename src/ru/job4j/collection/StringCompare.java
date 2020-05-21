package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int l = right.length();
        if (left.length() < right.length()) {
            l = left.length();
        }
        int rsl = -1;
        for (int i = 0; i <= l - 1; i++) {
            if (left.charAt(i) > right.charAt(i) && left.length() <= right.length()) {
                rsl = 1;
                break;
            }
            if (left.charAt(i) < right.charAt(i) && left.length() >= right.length()) {
                rsl = -1;
                break;
            }
            if (left.charAt(i) == right.charAt(i) && left.length() == right.length()) {
                rsl = 0;
            }
        }
        if (left.length() < right.length() && rsl == 0) {
            rsl = -1;
        }

        return rsl;
    }
}