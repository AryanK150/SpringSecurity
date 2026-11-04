package com.security.service;

import com.security.modal.Student;
import com.security.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {

        return studentRepository.save(student);
    }


    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }


    public Student getStudentById(int id) {

        return studentRepository.findById(id).get();
    }


    public Student updateStudent(Integer id, Student student) {

        Student sobj = getStudentById(id);

        sobj.setName(student.getName());
        sobj.setEmail(student.getEmail());
        sobj.setCourse(student.getCourse());

        return studentRepository.save(sobj);
    }

    public void deleteStudent(int id) {

        studentRepository.deleteById(id);
    }
}
