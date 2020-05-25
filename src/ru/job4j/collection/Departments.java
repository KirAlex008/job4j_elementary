package ru.job4j.collection;

import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        List<String> gruppeK1 = new ArrayList<>();
        List<String> gruppeK2 = new ArrayList<>();
        List<String> elemK1 = new ArrayList<>();
        List<String> elemK2 = new ArrayList<>();
        List<String> listK1 = new ArrayList<>();
        List<String> listK2 = new ArrayList<>();
        List<String> listAll = new ArrayList<>();
        gruppeK1 = Departments.gruppeOfK("K1", deps);
        gruppeK2 = Departments.gruppeOfK("K2", deps);
        elemK1 = Departments.formingOfParts(gruppeK1);
        elemK2 = Departments.formingOfParts(gruppeK2);
        listK1 = Departments.formingOfList(elemK1, deps.size() + 1);
        listK2 = Departments.formingOfList(elemK2, deps.size() + 1);
        listAll.addAll(listK1);
        listAll.addAll(listK2);

        return listAll;
    }

    public static List<String> sortAsc(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
        return orgs;
    }

    public static List<String> sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
        return orgs;
    }

    public static List<String> gruppeOfK(String k, List<String> deps) {
        List<String> rsl = new ArrayList<>();
        for (String value : deps) {
            String[] firstPart = value.split("/");
            if (firstPart[0].equals(k)) {
                rsl.add(value);
            }
        }
        return rsl;
    }

        public static List<String> formingOfParts(List<String> deps) {
            HashSet<String> rsl2 = new HashSet<>();
            List<String> rsl3 = new ArrayList<>();
            for (String value : deps) {
                String start = "";
                for (String el : value.split("/")) {
                    rsl2.add(start + el);
                }
            }
            rsl3.addAll(rsl2);
            Departments.sortAsc(rsl3);
            return rsl3;
        }

    public static List<String> formingOfList(List<String> deps, int num) {
        HashSet<String> tmp2 = new HashSet<>();
        List<String> rsl = new ArrayList<>();
        List<String> rsl2 = new ArrayList<>();
        List<String> rsl3 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        String start = "";
        for (String el : deps) {
            if (el.length() == 2) {
                list2.add(el);
            }
            if (el.length() == 3) {
                list3.add(el);
            }
            if (el.length() == 4) {
                list4.add(el);
            }
        }
        rsl.addAll(list2);
        for (int i = 0; i < list3.size(); i++) {
            rsl.add(rsl.get(0) + "/" + list3.get(i));
        }
        for (int i = 0; i < list4.size(); i++) {
            for (int j = 1; j <= list3.size(); j++) {
                rsl.add(rsl.get(j) + "/" + list4.get(i));
            }
        }
        tmp2.addAll(rsl);
        rsl2.addAll(tmp2);
        Departments.sortAsc(rsl2);
        int mark = rsl2.size() - 1;
        for (int i = mark; i >= num; i--) {
            rsl2.remove(i);
        }
        return rsl2;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("k1/sk1");
        //List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        result.sort(Comparator.naturalOrder());
        for (String el : result) {
            System.out.println(el);
        }
    }
}