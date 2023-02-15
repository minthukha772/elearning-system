package com.blissstock.mappingSite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blissstock.mappingSite.entity.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Long> {
    
}
