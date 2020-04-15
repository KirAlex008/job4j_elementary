package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
            //return rsl;
        }
        if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
            //return rsl;

        } else {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Привет, Бот.");
        System.out.println(DummyBot.answer("Привет, Бот."));

        System.out.println("Сколько будет 2 + 2?");
        System.out.println(DummyBot.answer("Сколько будет 2 + 2?"));

        System.out.println("Пока.");
        System.out.println(DummyBot.answer("Пока."));
        }
}
