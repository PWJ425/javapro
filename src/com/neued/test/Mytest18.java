package com.neued.test;

import com.neued.pojo.Dept;
import com.neued.pojo.Student;
import com.neued.util.JdbcUtil;

import java.util.List;

public class Mytest18 {
    public static void main(String[] args) {
       /* StudentWeb studentWeb =new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();*/
        Class clz=Dept.class;
        List<Student> list= JdbcUtil.excutQuery("select Sno,Sname,Ssex,Sage,Sdept from student ",Student.class);
        System.out.println(list);
    }
}
