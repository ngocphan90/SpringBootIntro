package com.tech.springintro.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id ;

    private String first_name;

    private String last_name;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn (name = "address_id", referencedColumnName = "id")
    private Address address1;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn
    private Address address2;



}
