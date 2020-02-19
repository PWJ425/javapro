package com.neued.dao;

import com.neued.pojo.Student;
import com.neued.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IstudentDao{
    String url="jdbc:mysql://localhost:3306/a1?useUnicode=true&characterEncoding=utf8" ;
    String username="root";
    String password="123456";
    @Override
    public List<Student> query() {
        List<Student>list=new ArrayList<>();
        Connection con =null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
             pstmt=con.prepareStatement("select Sno,Sname,Ssex,Sage,Sdept from student");
             rs =pstmt.executeQuery();

            while(rs.next()){
                Student student=new Student();
                student.setSno(rs.getInt("Sno"));
                student.setSname(rs.getString("Sname"));
                student.setSsex(rs.getString("Ssex"));
                student.setSage(rs.getInt("Sage"));
                student.setSdept(rs.getString("Sdept"));
                list.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (rs!=null)
                    rs.close();
                if(pstmt!=null);
                    pstmt.close();
                if(con!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public int add(Student student) {


        return JdbcUtil.executeUpdate("insert into student(Sname,Ssex,Sage,Sdept)values(?,?,?,?)",student.getSname(),student.getSsex(),student.getSage(),student.getSdept());

    }

    @Override
    public int update(Student student) {



        return JdbcUtil.executeUpdate("update student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=?",student.getSname(),student.getSsex(),student.getSage(),student.getSdept(),student.getSno());

    }

    @Override
    public int del(int Sno) {



        return JdbcUtil.executeUpdate("delete from student where Sno=?",Sno);

    }

    @Override
    public Student queryOne(int Sno) {
        return null;
    }
}
