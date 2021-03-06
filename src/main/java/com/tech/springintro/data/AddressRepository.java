package com.tech.springintro.data;

import com.tech.springintro.model.Address;
import com.tech.springintro.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository <Address, Integer>{
    public Address getAddressById (Integer id);



}
