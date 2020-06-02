package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class StudentsToMap {
    public static Map<String, Student> collect(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(Student::getSurname, student -> student,
                        (surname1, surname2) -> {
                        System.out.println("duplicate key found!");
                        return surname1;
                }));
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
