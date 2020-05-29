package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaBlock {

    public static void main(String[] args) {
        String[] lines = {
                "Ivan",
                "Mariya",
                "Taniya"
        };

    Comparator<String> cmpDescSize = (left, right) -> {
        System.out.println("compare - " + left + " : " + right);
        return right.compareTo(left);
    };
    Arrays.sort(lines, cmpDescSize);
        for (String elem : lines) {
            System.out.println(elem);
        }
    }
}
