package ru.job4j.converter;

/**
 * Class Converter решение задачи Модульные тесты.[#269774]
 * @autor kirsha
 * @since 17.04.2020
 * @version 1
 */
public class Converter {
    /**
     * rubelToEuro
     * @param value - сумма в рублях
     * @return rsl - сумма в евро
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /**
     * rubelToDollar
     * @param value - сумма в рублях
     * @return rsl - сумма в доллорах
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }
    /**
     * main
     * @param args - args
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + dollar + " dollars.");
    }
}