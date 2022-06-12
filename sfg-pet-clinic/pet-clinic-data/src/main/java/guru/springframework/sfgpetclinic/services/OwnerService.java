package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.time.LocalDate;
import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String LastName);

    Owner findById(Long id);
    Owner save(Owner owner);

    Set<Owner> findAll();
}
