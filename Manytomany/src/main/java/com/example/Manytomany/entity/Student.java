package com.example.Manytomany.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name ="Student")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private String dept;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "Student_course",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id",referencedColumnName = "id")
            })

    @JsonIgnoreProperties("student")
    private Set<Course> course;

}
