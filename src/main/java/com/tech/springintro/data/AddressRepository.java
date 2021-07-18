package com.tech.springintro.data;

import com.tech.springintro.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository <Address, String>{

}
