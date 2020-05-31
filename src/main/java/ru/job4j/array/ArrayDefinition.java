package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Egorov";
        names[1] = "Ivanov";
        names[2] = "Petrov";
        names[3] = "Kuznezov";
        for (int index = 0; index <= 3; index++) {
            System.out.println(names[index]);
        }
    }
}
