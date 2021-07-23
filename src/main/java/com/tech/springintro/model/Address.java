package com.tech.springintro.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.List;
@Entity
@Table
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private int apt;

}
