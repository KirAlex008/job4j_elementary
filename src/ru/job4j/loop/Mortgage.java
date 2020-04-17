package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount >= 0) {
            double debt = amount + (amount * percent) / 100;
            double payment = debt - salary;
            if (debt >= salary) {
                amount = amount - payment;
                year = year + 1;
            } else if (debt < salary) {
                year = year + 1;
                break;
            }
        }
        return year;
    }
}