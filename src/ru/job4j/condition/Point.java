package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    /**
     * Это поле объекта. Оно доступно только кокретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только кокретному объекту.
     */
    private int y;
    /**
     * И это поле объекта. Оно доступно только кокретному объекту.
     */
    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public void info3d() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }
    public static void main(String[] args) {
        Point point1 = new Point(10, 20, -5);
        Point point2 = new Point(-20, 10, 30);
        double rsl = point1.distance3d(point2);
        System.out.println(rsl);
    }
}