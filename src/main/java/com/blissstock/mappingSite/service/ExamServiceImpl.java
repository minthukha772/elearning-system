package com.blissstock.mappingSite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blissstock.mappingSite.entity.Exam;
import com.blissstock.mappingSite.repository.ExamRepository;

@Service
public class ExamServiceImpl implements ExamService {
    
    @Autowired
    private ExamRepository examRepository;

    @Override
    public List<Exam> getAllClass() {
        return examRepository.findAll();
    }

    
}
