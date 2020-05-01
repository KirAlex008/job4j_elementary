package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;
/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] forback = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if ((items[index].getName() != null)) {
                forback[size] = items[index];
                size++;
            }
        }
        forback = Arrays.copyOf(forback, size);
        return forback;
    }

        public Item[] findByName(String key) {
        Item[] forback = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if ((items[index].getName() != null) && (items[index].getName().equals(key))) {
                forback[size] = items[index];
                size++;
            }
        }
            forback = Arrays.copyOf(forback, size);
        return forback;
    }

        public Item findById(String id) {
            int index = indexOf(id);
            return index != -1 ? items[index] : null;
        }

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
        return index != -1 ? true : false;
    }

        /**
         * Метод генерирует уникальный ключ для заявки.
         * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
         * @return Уникальный ключ.
         */
        private String generateId() {
            Random rm = new Random();
            return String.valueOf(rm.nextLong() + System.currentTimeMillis());
        }

    public Item[] getItems() {
        return items;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}