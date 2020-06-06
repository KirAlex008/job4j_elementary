package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<Optional<User>, List<Optional<Account>>> users = new HashMap<>();

    public void addUser(Optional<User> user) {
        users.putIfAbsent(user, new ArrayList<Optional<Account>>());
    }

    public void addAccount(String passport, Optional<Account> account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Optional<Account>> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        for (Optional<User> element : users.keySet()) {
             if (element.get().getPassport().equals(passport)) {
                 rsl = element;
                 break;
             }
        }
        return rsl;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Optional<Account>> list = users.get(user);
            for (Optional<Account> element : list) {
                if (element.get().getRequisite().equals(requisite)) {
                    rsl = element;
                    break;
                }
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if ((srcAccount.isPresent() && destAccount.isPresent()) && (srcAccount.get().getBalance() >= amount)) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}