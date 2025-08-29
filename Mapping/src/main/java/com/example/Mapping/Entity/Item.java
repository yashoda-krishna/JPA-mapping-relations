package com.example.Mapping.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter @Setter
public class Item {
    @Id
    @GeneratedValue
    private int item_id;
    private String name;


// @ManyToOne(cascade = CascadeType.ALL,mappedBy = "item")
    @JsonBackReference
    private Customer customer;


}
