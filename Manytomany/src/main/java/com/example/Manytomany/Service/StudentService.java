package com.example.Manytomany.Service;

import com.example.Manytomany.entity.Course;
import com.example.Manytomany.entity.Student;
import com.example.Manytomany.repository.CourseRepository;
import com.example.Manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }
    public Student save(Student student) {
        return studentRepository.save(student);
    }
    public Optional<Student> getById(Long id) {
        return studentRepository.findById(id);
    }
    public String deleteById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            studentRepository.deleteById(id);
            return "Student details deleted successfully";
        } else {
            return "Student not found with id " + id;
        }
    }
    public String update(Long id, Student student) {
        Optional<Student> studentOptional = studentRepository.findById(id);

        if (studentOptional.isPresent()) {
            Student update = studentOptional.get();
            update.setName(student.getName());
            update.setAge(student.getAge());
            update.setDept(student.getDept());
            if (student.getCourse() != null && !student.getCourse().isEmpty()) {
                update.setCourse(student.getCourse());
            }
            studentRepository.save(update);
            return "Student details updated successfully";
        } else {
            return "Student not found with id " + id;
        }
    }
    public Optional<Course> fingByCourse(Long id)
    {
        return courseRepository.findById(id);
    }
}
