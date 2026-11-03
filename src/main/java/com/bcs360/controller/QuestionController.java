package com.bcs360.controller;

import com.bcs360.entity.ImpQuestion;
import com.bcs360.repository.ImpQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin
public class QuestionController {

    @Autowired
    private ImpQuestionRepository impQuestionRepository;

    // 🔴 ADD QUESTION (ADMIN)
    @PostMapping("/add")
    public String addQuestion(@RequestBody ImpQuestion q){
        impQuestionRepository.save(q);
        return "Question Added Successfully";
    }

    // 🔵 GET QUESTIONS (STUDENT)
    @GetMapping
    public List<ImpQuestion> getQuestions(@RequestParam Long subjectId){
        return impQuestionRepository.findBySubjectId(subjectId);
    }
}