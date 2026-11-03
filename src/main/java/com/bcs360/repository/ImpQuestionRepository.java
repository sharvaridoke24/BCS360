package com.bcs360.repository;

import com.bcs360.entity.ImpQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImpQuestionRepository extends JpaRepository<ImpQuestion, Long> {

    List<ImpQuestion> findBySubjectId(Long subjectId);
}