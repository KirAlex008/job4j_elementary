package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] allItem;
                allItem = tracker.findAll();
                for (int i = 0; i < allItem.length; i++) {
                    System.out.println(i + ". " + allItem[i].getName());
                }
            } else if (select == 2) {
                System.out.println("=== Find Item by Name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] allItem;
                allItem = tracker.findByName(name);
                for (int i = 0; i < allItem.length; i++) {
                    System.out.println(i + ". " + allItem[i].getName());
                }
            } else if (select == 3) {
                System.out.println("=== Find Item by Name ====");
                System.out.print("Enter id: ");
                String name = scanner.nextLine();
                Item allItem;
                allItem = tracker.findById(name);
                System.out.println(allItem.getName());
            } else if (select == 4) {
                System.out.println("=== Replace Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                tracker.replace(id, newItem);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Replace");
                } else {
                    System.out.println("NOT Replace");
                }

            } else if (select == 5) {
                System.out.println("=== Delete Item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                tracker.delete(id);
                if (tracker.delete(id)) {
                    System.out.println("Delete");
                } else {
                    System.out.println("NOT Delete");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
