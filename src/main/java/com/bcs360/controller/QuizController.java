package com.bcs360.controller;

import com.bcs360.entity.Quiz;
import com.bcs360.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class QuizController {

    @Autowired
    private QuizRepository quizRepository;

    @GetMapping("/quiz")
    public List<Quiz> getQuiz(@RequestParam Long subjectId) {
        return quizRepository.findBySubjectId(subjectId);
    }
}