package gt.edu.umg.addressdemo.controller;

import gt.edu.umg.addressdemo.model.Address;
import gt.edu.umg.addressdemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/{personId}")
    public Address create(@RequestBody Address address, @PathVariable Long personId) {
        return addressService.saveAddress(address, personId);
    }

    @GetMapping
    public List<Address> getAll() {
        return addressService.getAllAddresses();
    }
}
