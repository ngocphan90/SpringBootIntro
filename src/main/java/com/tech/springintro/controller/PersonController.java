package com.tech.springintro.controller;

import com.tech.springintro.controller.Controller;
import com.tech.springintro.data.PersonRepository;
import com.tech.springintro.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/addPerson")
    public Person person (@RequestParam Integer id) {
        return personRepository.getPersonById(id);

    }
    @PutMapping("/addNewPerson")
    public String addNewPerson(@RequestBody Person person) {
        personRepository.save(person);

        return "added person";

    }
}
