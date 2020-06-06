package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        for (var word : persons
        ) {
            if (word.getName().contains(key) || word.getSurname().contains(key) || word.getPhone().contains(key) || word.getAddress().contains(key)) {
                result.add(word);
            }
        }
        return result;
    }


}



