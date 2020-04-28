package ru.job4j.oop;

public class Tiger extends Predator {

    public Tiger(String name) {
        super();
        System.out.println("Tiger " + name);
    }
    public Tiger() {
        super();
        System.out.println("Tiger");
    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Vasia");
    }
}
