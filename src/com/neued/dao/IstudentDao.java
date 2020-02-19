package com.neued.dao;

import com.neued.pojo.Student;

import java.util.List;

public interface IstudentDao {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int Sno);
    Student queryOne(int Sno);
}
