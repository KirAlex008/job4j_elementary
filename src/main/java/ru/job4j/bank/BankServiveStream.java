package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankServiveStream {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        Optional<User> first = (users.entrySet().stream()
                .filter(pass -> pass.getKey().getPassport().equals(passport))
                .map(pass -> pass.getKey())
                .findFirst());
        return first.orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        Optional<Account> first = null;
        User user = findByPassport(passport);
        if (user != null) {
            first = users.entrySet().stream()
                    .filter(elem -> elem.getKey().equals(user))
                    .map(elem -> elem.getValue())
                    .flatMap(elem -> elem.stream())
                    .filter((elem -> elem.getRequisite().equals(requisite)))
                    .findFirst();
        }
        return first.orElse(null);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if ((srcAccount != null && destAccount != null) && (srcAccount.getBalance() >= amount)) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}