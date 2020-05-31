package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean maximum = first > second;
        int result1 = maximum ? first : second;
        maximum = result1 > third;
        int result2 = maximum ? result1 : third;
        return result2;
        }
}
