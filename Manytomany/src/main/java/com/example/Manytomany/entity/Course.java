package com.example.Manytomany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="Course")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Course {
    @Id
    private long id;
    private String title;
    private int modules;
    private double fee;

    @ManyToMany(mappedBy ="course",fetch = FetchType.LAZY)
    @JsonIgnoreProperties("course")
    private Set<Student> student;

}
