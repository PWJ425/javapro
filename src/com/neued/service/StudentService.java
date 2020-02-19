package com.neued.service;

import com.neued.dao.IstudentDao;
import com.neued.dao.StudentDao;
import com.neued.pojo.Student;

import java.util.List;

public class StudentService implements Istudentservice{
   IstudentDao  studentDao=new StudentDao();
    @Override
    public List<Student> query() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int del(int Sno) {
        return studentDao.del(Sno);
    }

    @Override
    public Student queryOne(int Sno) {
        return null;
    }
}
