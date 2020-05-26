package ru.job4j.collection;

import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (!start.equals("")) {
                    tmp.add(start + "/" + el);
                    start = start + "/" + el;
                } else {
                    tmp.add(el);
                    start = el;
                }
            }
        }
        Set<String> set = tmp;
        List<String> tmp2 = new ArrayList<>(set);
        Departments.sortAsc(tmp2);
        return tmp2;
    }

    public static List<String> sortAsc(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
        return orgs;
    }

    public static List<String> sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
        return orgs;
    }

}