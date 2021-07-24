package com.tech.springintro.controller;

import com.tech.springintro.data.AddressRepository;
import com.tech.springintro.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController

public class Controller {

    @Autowired
    AddressRepository addressRepository;
    @GetMapping("/add")
    public Address getAddressById(@RequestParam Integer id) {
        return addressRepository.getAddressById(id);
    }

    @PutMapping("/addNewAddress")
    public String saveNewAddress( @RequestBody Address address) {
        addressRepository.save(address);
        return "added address";
    }
}

