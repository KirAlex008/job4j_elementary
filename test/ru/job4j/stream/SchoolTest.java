package ru.job4j.stream;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.List;

public class SchoolTest {

    @Test
    public void when70to100() {
        List<Student> studentList = List.of(
                new Student("Ivanov", 50),
                new Student("Nikiforov", 99),
                new Student("Gagaulin", 30)
        );
        List<Student> result = School.collect(studentList, student -> student.getScore() >= 70 &&
                student.getScore() <= 100);
        List<Student> expected = List.of(
                new Student("Nikiforov", 99)
        );
        assertThat(result, is(expected));
    }
    @Test
    public void when0to50() {
        List<Student> studentList = List.of(
                new Student("Ivanov", 50),
                new Student("Nikiforov", 99),
                new Student("Gagaulin", 30)
        );
        List<Student> result = School.collect(studentList, student -> student.getScore() >= 0 &&
                student.getScore() < 50);
        List<Student> expected = List.of(
                new Student("Gagaulin", 30)
        );
        assertThat(result, is(expected));
    }
    @Test
    public void when50to70() {
        List<Student> studentList = List.of(
                new Student("Ivanov", 50),
                new Student("Nikiforov", 99),
                new Student("Gagaulin", 30)
        );
        List<Student> result = School.collect(studentList, student -> student.getScore() >= 50 &&
                student.getScore() < 70);
        List<Student> expected = List.of(
                new Student("Ivanov", 50)
        );
        assertThat(result, is(expected));
    }



}