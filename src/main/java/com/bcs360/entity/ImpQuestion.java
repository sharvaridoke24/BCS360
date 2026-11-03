package com.bcs360.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "imp_questions")
public class ImpQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long subjectId;

    @Column(length = 1000)
    private String question;

    @Column(length = 2000)
    private String answer;

    public ImpQuestion() {}

    public Long getSubjectId() { return subjectId; }
    public String getQuestion() { return question; }
    public String getAnswer() { return answer; }

    public void setSubjectId(Long subjectId) { this.subjectId = subjectId; }
    public void setQuestion(String question) { this.question = question; }
    public void setAnswer(String answer) { this.answer = answer; }
}