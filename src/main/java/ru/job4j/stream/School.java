package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class School {
    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> list = students.stream()
                .filter(student -> predict.test(student))
                .collect(Collectors.toList());
        return list;
    }
}
