package gt.edu.umg.addressdemo.controller;

import gt.edu.umg.addressdemo.model.Address;
import gt.edu.umg.addressdemo.model.Person;
import gt.edu.umg.addressdemo.repository.PersonRepository;
import gt.edu.umg.addressdemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private PersonRepository personRepository;

    // Crear persona
    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    // Obtener direcciones por persona
    @GetMapping("/{id}/addresses")
    public List<Address> getAddressesByPerson(@PathVariable Long id) {
        return addressService.getAddressesByPersonId(id);
    }
}
