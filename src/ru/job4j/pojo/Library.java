package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 200);
        Book book2 = new Book("Azbuka", 100);
        Book book3 = new Book("Bukvar", 150);
        Book book4 = new Book("Algebra", 200);
        Book[] shelf = new Book[4];
        shelf[0] = book1;
        shelf[1] = book2;
        shelf[2] = book3;
        shelf[3] = book4;

        for (int i = 0; i < shelf.length; i++) {
            System.out.println("Book " + shelf[i].getName() + " contains " + shelf[i].getPages() + " pages.");
        }

        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i].getName() == "Clean code") {
                System.out.println("Not only  " + shelf[i].getName() + " contains " + shelf[i].getPages() + " pages.");
            }
        }
    }
}
