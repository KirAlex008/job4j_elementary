package job4j.stream;

import org.junit.Test;
import ru.job4j.stream.Address;
import ru.job4j.stream.Profile;
import ru.job4j.stream.Profiles;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void when70to100() {
        List<Profile> addressList = List.of(
                new Profile("Ivanov", new Address("Kazan", "Mira", 20, 10)),
                new Profile("Egorov", new Address("Moskva", "Vernadskogo", 120, 17)),
                new Profile("Ivanova", new Address("Kazan", "Mira", 20, 10))
        );
        List<Address> result = Profiles.collect(addressList);
        List<Address> expected = List.of(
                new Address("Kazan", "Mira", 20, 10),
                new Address("Moskva", "Vernadskogo", 120, 17)
        );
        assertThat(result, is(expected));
    }

}