package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.time.LocalDate;

public interface  OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String LastName);
}
