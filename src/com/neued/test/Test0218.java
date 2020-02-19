package com.neued.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test0218 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/a1?useUnicode=true&characterEncoding=utf8" ;
        String username="root";
        String password="123456";
        Connection con=null;
        PreparedStatement pstmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            pstmt= con.prepareStatement("insert into student(Sno,Sname,Ssex,Sage,Sdept) values(7,'小李','女',16,'计算机')");
            int i=pstmt.executeUpdate();
            System.out.println(i);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt!=null)
                    pstmt.close();
                if(pstmt!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
