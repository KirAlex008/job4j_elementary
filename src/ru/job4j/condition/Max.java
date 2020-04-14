package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean  maximum = left > right;
        int result = maximum ? left : right;
        return result;

    }
}
