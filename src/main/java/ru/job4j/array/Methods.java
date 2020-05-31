package ru.job4j.array;

/**
 * Methods Класс содержит методы для вычисления выигрышных комбинаций в игре Сокобан:
 * в горизонтальной плоскости - monoHorizontal
 * в вертикальной плоскости - monoVertical
 *  *
 * @author Alexandr Kirsha (avkirsha@yandex.ru)
 * @since 23.04.2020
 * @version 1
 *
 */

public class Methods {
    /**
     * Метод определяет заполнен ли горизонтальный ряд полностью единицами 1
     * @param board двухмерный массив, содрержащий ряд для проверки условия выигрыша
     * @param row номер одномерного массива, в котором проверяется уловие выигрыша
     * @return result содержит логическую переменную, вощвращает true, если условие выполнено
     */
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = false;
        int counter = 0;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == 1) {
                counter++;
                if (counter == board.length) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
    /**
     * Метод определяет заполнен ли вертикальный ряд полностью единицами 1
     * @param board двухмерный массив, содрержащий ряд для проверки условия выигрыша
     * @param column номер столбца мартицы, в котором проверяется уловие выигрыша
     * @return result содержит логическую переменную, вощвращает true, если условие выполнено
     */
    public static boolean monoVertical(int[][] board, int column) {
        boolean result = false;
        int counter = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 1) {
                counter++;
                if (counter == board.length) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}

