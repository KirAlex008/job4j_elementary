package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        int exp = 2;
        for (int index = 0; index < rst.length; index++) {
            rst[index] = index * index;
        }
        // заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}