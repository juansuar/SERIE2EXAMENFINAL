package gt.edu.umg.addressdemo.repository;

import gt.edu.umg.addressdemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
