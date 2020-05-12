package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        if (tasks.size() == 0) {
            this.tasks.add(index, task);
            index--;
        }
        if (tasks.size() != 0 && index != -1) {
            for (Task element : tasks) {
                if (task.getPriority() > index) {
                    index++;
                    if (task.getPriority() == index || index == tasks.size()) {
                        index--;
                       break;
                    }
                }
            }
            this.tasks.add(index, task);
        }
    }

    public Task take() {
         return tasks.poll();
        }
}

