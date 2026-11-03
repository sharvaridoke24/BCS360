package com.bcs360.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "quize")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long subjectId;

    private String question;

    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private String correctAnswer;

    public Quiz() {}

    // Getters

    public Long getId() { return id; }
    public Long getSubjectId() { return subjectId; }
    public String getQuestion() { return question; }
    public String getOption1() { return option1; }
    public String getOption2() { return option2; }
    public String getOption3() { return option3; }
    public String getOption4() { return option4; }
    public String getCorrectAnswer() { return correctAnswer; }
}