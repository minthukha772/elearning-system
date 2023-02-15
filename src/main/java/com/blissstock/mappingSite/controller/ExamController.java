package com.blissstock.mappingSite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.blissstock.mappingSite.service.ExamService;

@Controller
public class ExamController {

    @Autowired
    private ExamService examService;

    @GetMapping("/exam")
    public String viewExamPage(Model model){
        model.addAttribute("examList", examService.getAllClass());
        return "ST0005_Exam";
    }
    @GetMapping("/showExamQuestions")
    public String showExamQuestions(Model model){
        return "ExamQuestions";
    }
    @GetMapping("/showExamResults")
    public String showExamResults(Model model){
        return "ExamResults";
    }
}
