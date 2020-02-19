package com.neued.service;

import com.neued.pojo.Student;

import java.util.List;

public interface Istudentservice {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int Sno);
    Student queryOne(int Sno);
}
