package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {

    private static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (predicate.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                boolean rsl = false;
                if (attachment.getName().contains("bug")) {
                    rsl = true;
                }
                return rsl;
            }
        };
        return filter(list, func);
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                boolean rsl = false;
                if (attachment.getSize() > 100) {
                    rsl = true;
                }
                return rsl;
            }
        };
        return filter(list, func);
    }

    public static void main(String[] args) {
        List<Attachment> rsl = List.of(
                new Attachment("first", 90),
                new Attachment("bug", 110),
                new Attachment("third", 150)
        );
        System.out.println(filterName(rsl));
        System.out.println(filterSize(rsl));
    }
}