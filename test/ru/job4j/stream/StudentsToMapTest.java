package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StudentsToMapTest {
    @Test
    public void whenListToMap() {
        List<Student> studentList = List.of(
                new Student("Ivanov", 50),
                new Student("Nikiforov", 99),
                new Student("Gagaulin", 30),
                new Student("Gagaulin", 30)
        );
        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("Ivanov", new Student("Ivanov", 50));
        studentHashMap.put("Nikiforov", new Student("Nikiforov", 99));
        studentHashMap.put("Gagaulin", new Student("Gagaulin", 30));
        studentHashMap.put("Gagaulin", new Student("Gagaulin", 30));

        Map<String, Student> result = StudentsToMap.collect(studentList);
        Map<String, Student> expected = studentHashMap;
        assertThat(result, is(expected));
    }

}