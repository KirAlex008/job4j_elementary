package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int l = Math.min(right.length(), left.length());
        int rsl = -1;
        for (int i = 0; i <= l - 1; i++) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                break;
            }
        }
        return (rsl == 0) ? Integer.compare(left.length(), right.length()) : rsl;
    }
}