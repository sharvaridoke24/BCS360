package com.bcs360.repository;

import com.bcs360.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

    List<Quiz> findBySubjectId(Long subjectId);
}