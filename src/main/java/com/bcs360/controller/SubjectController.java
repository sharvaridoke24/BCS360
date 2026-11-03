package com.bcs360.controller;

import com.bcs360.entity.Subject;
import com.bcs360.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
@CrossOrigin
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping
    public List<Subject> getSubjects(
            @RequestParam String year,
            @RequestParam int semester) {

        return subjectRepository.findByYearAndSemester(year, semester);
    } 
    
    @PostMapping("/add")
    public String addSubject(@RequestBody Subject subject){

        subjectRepository.save(subject);

        return "Subject Added Successfully";
    }
}