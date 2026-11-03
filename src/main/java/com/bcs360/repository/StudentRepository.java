package com.bcs360.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcs360.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

    //for login
    Student findByPrnAndPassword(String prn, String password);
    
    //to check duplicate prn
    boolean existsByPrn(String prn);
    
    //to check duplicate email
    boolean existsByEmail(String Email);
}