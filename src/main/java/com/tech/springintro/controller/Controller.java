package com.tech.springintro.controller;

import com.tech.springintro.data.AddressRepository;
import com.tech.springintro.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/add")
    public Address  addNewAddress()
    {
        Address address = new Address();
        address.setId(1);
        address.setStreet("12613 Seattle Slew Dr");
        address.setCity("Houston");
        address.setApt(4222);

        addressRepository.save(address);
        return address;
    }
    @PutMapping("/addNewAddress")
    public String addNewAddress(@RequestBody Address address){
        addressRepository.save(address);
        return "added";
    }
}

