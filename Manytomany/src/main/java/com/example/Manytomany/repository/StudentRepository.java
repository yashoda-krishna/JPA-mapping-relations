package com.example.Manytomany.repository;

import com.example.Manytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student,Long> {
}
