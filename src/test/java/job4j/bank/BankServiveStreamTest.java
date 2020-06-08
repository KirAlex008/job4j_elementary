package job4j.bank;

import org.junit.Test;
import ru.job4j.bank.Account;
import ru.job4j.bank.BankService;
import ru.job4j.bank.User;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class BankServiveStreamTest {

    @Test
    public void addUser() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.get().getPassport(), Optional.of(new Account("5546", 150D)));
        Optional<Account> testAcc = bank.findByRequisite("34", "5546");
        System.out.println(testAcc);
        assertNull(bank.findByRequisite("34", "5546").orElse(null));
    }

    @Test
    public void addAccount() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.get().getPassport(), Optional.of(new Account("5546", 150D)));
        assertThat(bank.findByRequisite("3434", "5546").get().getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.get().getPassport(), Optional.of(new Account("113", 50D)));
        bank.addAccount(user.get().getPassport(), Optional.of(new Account("5546", 150D)));
        bank.transferMoney(user.get().getPassport(), "5546", user.get().getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.get().getPassport(), "113").get().getBalance(), is(200D));
    }
}