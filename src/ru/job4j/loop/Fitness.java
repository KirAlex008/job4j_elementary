package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan = ivan * 3;
            nik = nik * 2;
            month = month + 1;
        }
        return month;
    }
}