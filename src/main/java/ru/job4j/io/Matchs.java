package ru.job4j.io;

import java.util.Scanner;

public class Matchs {

    public static void main(String[] args) {
        int matchs = 11;
        boolean player = false;
        System.out.println("Первый игрок, сделайте ход, введите число от 1 до 3.");
        while (true) {
            Scanner input = new Scanner(System.in);
            int select = Integer.valueOf(input.nextLine());
            matchs = matchs - select;
            player = !player;
            String winner = matchs <= 3 && player ? "Выиграл Второй игрок" : "Выиграл Первый игрок";
                if (matchs <= 3) {
                break;
            }
            System.out.println(winner);
            System.out.println("Осталось " + matchs + "спичек. Следующий игрок, сделайте ход, введите число от 1 до 3.");
        }
    }
}
