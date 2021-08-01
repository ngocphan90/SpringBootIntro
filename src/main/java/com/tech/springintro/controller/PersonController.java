package com.tech.springintro.controller;

import com.tech.springintro.controller.Controller;
import com.tech.springintro.data.PersonRepository;
import com.tech.springintro.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/getPerson")
    public Person getPerson (@RequestParam Integer id) {
        return personRepository.getPersonById(id);

    }
    @PutMapping("/addNewPerson")
    public String addNewPerson(@RequestBody Person person) {
        personRepository.save(person);

        return "added person";

    }
}
