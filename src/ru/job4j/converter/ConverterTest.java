package ru.job4j.converter;

public class ConverterTest {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }
    public static void main(String[] args) {
        int in1 = 140;
        int in2 = 180;
        int expected1 = 2;
        int expected2 = 3;
        int out1 = rubleToEuro(in1);
        int out2 = rubleToDollar(in2);
        boolean passed1 = expected1 == out1;
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2 Euro. Test result : " + passed1);
        System.out.println("140 rubles are 3 Dollars. Test result : " + passed2);
    }
}
