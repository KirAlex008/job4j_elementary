package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        List<Address> list = profiles.stream()
                .map(profile -> profile.getAddress())
                .distinct()
                .collect(Collectors.toList());
        return list;
    }
}
