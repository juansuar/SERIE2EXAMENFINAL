package gt.edu.umg.addressdemo.repository;

import gt.edu.umg.addressdemo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByPersonId(Long personId);
}
