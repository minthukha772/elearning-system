package com.blissstock.mappingSite.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="class_name")
    private String className;
    @Column(name="teacher_name")
    private String teacherName;
    @Column(name="passing_score")
    private String passingScore;
    @Column(name="exam_date")
    private String examDate;
    @Column(name="exam_description")
    private String examDescription;
    @Column(name="exam_minute")
    private String examMinute;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getPassingScore() {
        return passingScore;
    }
    public void setPassingScore(String passingScore) {
        this.passingScore = passingScore;
    }
    public String getExamDate() {
        return examDate;
    }
    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }
    public String getExamDescription() {
        return examDescription;
    }
    public void setExamDescription(String examDescription) {
        this.examDescription = examDescription;
    }
    public String getExamMinute() {
        return examMinute;
    }
    public void setExamMinute(String examMinute) {
        this.examMinute = examMinute;
    }
    
    


}
