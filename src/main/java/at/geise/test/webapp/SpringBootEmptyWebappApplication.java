package at.geise.test.webapp;

import at.geise.test.webapp.jpa.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.*;
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class SpringBootEmptyWebappApplication implements InitializingBean {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEmptyWebappApplication.class, args);
    }

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void afterPropertiesSet() throws Exception {

        personRepository.save(new Person(null, "Bettina", "Geise"));
        personRepository.save(new Person(null, "Maria", "Geise"));
        personRepository.save(new Person(null, "Gloria", "Geise"));
        personRepository.save(new Person(null, "Torsten", "Geise"));

        Iterable<Person> personIterable = personRepository.findAll();
        for (Person person : personIterable) {
            System.out.println(person);
        }

    }
}
