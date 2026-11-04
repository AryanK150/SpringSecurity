package com.security.controller;

import com.security.modal.Student;
import com.security.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping

    public Student addStudent(@RequestBody Student student){

        return studentService.addStudent(student);
    }

    @GetMapping

    public List<Student> getAllStudents(){

        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")

    public Student getStudentById(@PathVariable int id){

        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")

    public Student updateStudent(@PathVariable Integer id,@RequestBody Student student){

        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")

    public void deleteStudent(@PathVariable int id){

        studentService.deleteStudent(id);
    }

}
