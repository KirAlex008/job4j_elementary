package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGrupp("4211");
        student.setDateOfStart("20/09/2018");
        System.out.println(student.getFullName() + " starts learning in the group " + student.getGrupp() + " since " + student.getDateOfStart() + ".");
    }
}
