package com.tech.springintro.data;

import com.tech.springintro.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository <Person, Integer>{
    public Person getPersonById (Integer id);
}
