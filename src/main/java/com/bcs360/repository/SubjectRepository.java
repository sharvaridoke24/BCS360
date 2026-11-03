package com.bcs360.repository;

import com.bcs360.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

    List<Subject> findByYearAndSemester(String year, int semester);
}