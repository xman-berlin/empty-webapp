package at.geise.test.webapp.jpa;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
