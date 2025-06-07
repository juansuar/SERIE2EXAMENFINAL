package gt.edu.umg.addressdemo.service;

import gt.edu.umg.addressdemo.model.Address;
import gt.edu.umg.addressdemo.model.Person;
import gt.edu.umg.addressdemo.repository.AddressRepository;
import gt.edu.umg.addressdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PersonRepository personRepository;

    public Address saveAddress(Address address, Long personId) {
        Person person = personRepository.findById(personId)
                .orElseThrow(() -> new RuntimeException("Persona no encontrada"));
        address.setPerson(person);
        return addressRepository.save(address);
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public List<Address> getAddressesByPersonId(Long personId) {
        return addressRepository.findByPersonId(personId);
    }
}
