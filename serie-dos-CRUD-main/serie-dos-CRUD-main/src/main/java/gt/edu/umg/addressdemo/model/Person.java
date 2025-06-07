package gt.edu.umg.addressdemo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "person")
    private List<Address> addresses;

    // Getters y Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Address> getAddresses() { return addresses; }

    public void setAddresses(List<Address> addresses) { this.addresses = addresses; }
}
