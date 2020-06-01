package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class StudentsToMap {
    public static Map<String, Student> collect(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(student -> student.getSurname(), student -> student));
    }

    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Ivanov", 50),
                new Student("Nikiforov", 99),
                new Student("Gagaulin", 30)
        );
        Map<String, Student> studentMap = StudentsToMap.collect(studentList);
        System.out.println(StudentsToMap.collect(studentList));
    }
}
