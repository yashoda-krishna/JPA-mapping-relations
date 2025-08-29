package com.example.Manytomany.Controller;

import com.example.Manytomany.Service.StudentService;
import com.example.Manytomany.entity.Course;
import com.example.Manytomany.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> findall()
    {
        return studentService.getAll();
    }
    @PostMapping("/post")
    public Student save(@RequestBody  Student student)
    {
        return studentService.save(student);
    }
    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable Long id)
    {
        return studentService.getById(id);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id)
    {

        return studentService.deleteById(id);
    }
    @PutMapping("/{id}")
     public String update(@PathVariable Long id,@RequestBody Student student)
     {
         return studentService.update(id, student);
     }
     @GetMapping("/course/{id}")
    public Optional<Course> getByCourse(@PathVariable Long id)
     {
         return studentService.fingByCourse(id);
     }
}
