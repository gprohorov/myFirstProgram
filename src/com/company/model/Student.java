package com.company.model;
/*
 * Classname  Student
 *
 * Version 1
 *
 * Copyright Artem
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Student {
    private int id;
    private String fullName;
    private LocalDate dateOfBirth;
    private String ethnicity;
    private double grade;

    public Student() {
    }

    public Student(String fullName, LocalDate dateOfBirth, String ethnicity, double grade) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.ethnicity = ethnicity;
        this.grade = grade;
    }

    public Student(int id, String fullName, LocalDate dateOfBirth, String ethnicity, double grade) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.ethnicity = ethnicity;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public long getFullAge(){
        return ChronoUnit.YEARS.between( this.dateOfBirth, LocalDate.now());
    }

    public boolean isOverAge(){
        boolean result= false;
        if (this.getFullAge()>= 19) {result = true;}
        return  result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", ethnicity='" + ethnicity + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId() == student.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
