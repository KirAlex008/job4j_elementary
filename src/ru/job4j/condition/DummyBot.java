package ru.job4j.condition;

    public class DummyBot {

        public static String answer(String question) {
            String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
            if ("Привет, Бот.".equals(question)) {
                // заменить ... на правильный ответ rsl = "ответ по заданию".
                rsl = "Привет, умник.";
            } else if ("Пока.".equals(question)) {
                rsl = "До скорой встречи.";
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
