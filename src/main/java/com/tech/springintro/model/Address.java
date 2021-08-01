package com.tech.springintro.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String street;
    private int apt;

    private String city;
    @Length( min = 2, max = 2 )
    private String state;
    @Length (min = 5, max = 9)
    private String zipcode;

}
