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
        }
        if (tasks.size() >= 1) {
            for (Task element : tasks) {
                index++;
                if (task.getPriority() <= element.getPriority() || index == tasks.size()) {
                   break;
                    }
                }
            this.tasks.add(index - 1, task);
        }
    }

    public Task take() {
         return tasks.poll();
        }
}

