package com.example.Manytomany.repository;

import com.example.Manytomany.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository<Course,Long> {
}
