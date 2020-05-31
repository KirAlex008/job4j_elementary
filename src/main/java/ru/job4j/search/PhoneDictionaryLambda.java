package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionaryLambda {
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
        Predicate<Person> checkName = s -> s.getName().contains(key);
        Predicate<Person> checkSurname = s -> s.getSurname().contains(key);
        Predicate<Person> checkAddress = s -> s.getAddress().contains(key);
        Predicate<Person> checkPhone = s -> s.getPhone().contains(key);
        Predicate<Person> combine = checkName.or(checkSurname.or(checkAddress.or(checkPhone)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

/*    public ArrayList<Person> find(String key) {
        Predicate<String> checkContain = s -> s.contains(key);
        Predicate<Person> combine = (p) -> checkContain.test(p.getName())
                || checkContain.test(p.getSurname())
                || checkContain.test(p.getAddress())
                || checkContain.test(p.getPhone());
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }*/

}



