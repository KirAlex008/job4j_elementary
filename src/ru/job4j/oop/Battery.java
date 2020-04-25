package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }
    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = another.load * 2;
    }
    public static void main(String[] args) {
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(60);
        battery1.exchange(battery2);
        System.out.println("Battery 1 has: " + battery1.load);
        System.out.println("Battery 2 has: " + battery2.load);
    }
}
