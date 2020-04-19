package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        //int i = 1;
        for (int index = 0; index < pref.length; index++) {
            //i = i + 1;
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
                }
    return result;
    }
}