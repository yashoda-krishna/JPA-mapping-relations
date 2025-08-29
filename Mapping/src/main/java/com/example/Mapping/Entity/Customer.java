package com.example.Mapping.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;


    @OneToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Item> item;

}