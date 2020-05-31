package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean  maximum = first > second;
        int result = maximum ? first : second;
        return result;
    }
    public static int max(int first, int second, int third) {
        int tmp = max(second, third);
        return max(first, tmp);
    }
    public static int max(int first, int second, int third, int fourth) {
        int tmp = max(third, fourth);
        int tmp2 = max(second, tmp);
        return max(first, tmp2);
    }
}
