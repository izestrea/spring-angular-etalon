package persons;

import com.reigncode.etalon.config.JpaSettings;
import com.reigncode.etalon.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertNotNull;

/**
 * Created by denchiosa on 4/7/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaSettings.class)
@WebAppConfiguration
public class PersonsRepoTests {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testRepository() {
        assertNotNull(personRepository);
    }

}
