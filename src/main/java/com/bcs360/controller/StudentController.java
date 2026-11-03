package com.bcs360.controller;

import com.bcs360.entity.Student;
import com.bcs360.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    // 🟢 Register API
    @PostMapping("/register")
    public String registerStudent(@RequestBody Student student) {

        if (studentRepository.existsByPrn(student.getPrn())) {
            return "PRN already registered!";
        }

        if (studentRepository.existsByEmail(student.getEmail())) {
            return "Email already registered!";
        }

        studentRepository.save(student);
        return "Registration success!";
    }

    // 🟢 Login API
    @PostMapping("/login")
    public String loginStudent(@RequestBody Student student) {

        Student existing = studentRepository.findByPrnAndPassword(student.getPrn(), student.getPassword());

        if (existing != null) {
            return "Login success";
        } else {
            return "Invalid PRN or Password!";
        }
    }
}