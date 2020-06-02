package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToListOfNumbers {
    public static List<Integer> collect(Integer[][] matrix) {
        return Arrays.stream(matrix)
                .flatMap(matrixLine -> Arrays.stream(matrixLine))
                .collect(Collectors.toList());
    }
}
