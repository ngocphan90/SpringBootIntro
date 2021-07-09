package com.tech.springintro.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String street;

    @Column
    private String city;

    @OneToOne
    @JoinColumn( name = "id" , referencedColumnName = "id")

    private Person person;

    public Address(Long id, String street, String city) {
        this.id = id;
        this.street = street;
        this.city = city;

    }

    public Address() {

    }
    public String toString(){
        return String.format("Testing ", id, street, city);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
