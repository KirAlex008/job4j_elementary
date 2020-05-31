package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int i = 0;
        for (String x : value) {
            if (x.equals(key)) {
                rsl = i;
                break;
            }
            i++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("The element doesn't exist.");
        }
        return rsl;
    }
    public static void main(String[] args) {
        String[] value = new String[] {"1", "2", "3", "4"};
        try {
            FindEl.indexOf(value, "5");
            System.out.println("The element exists.");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}