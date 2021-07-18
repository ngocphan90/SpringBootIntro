package com.tech.springintro.model;

import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table (name= "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id ;

    private String first_name;
    private String last_name;

    @OneToOne
    @JoinColumn (name = "address_id", referencedColumnName = "id")
    private Address address;

    public Person(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public Person() {

    }
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
