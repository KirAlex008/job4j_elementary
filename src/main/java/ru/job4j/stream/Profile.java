package ru.job4j.stream;

public class Profile {
    private final String surname;
    private final Address address;

    public Profile(String surname, Address address) {
        this.surname = surname;
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAddress() {
        return address;
    }
}

