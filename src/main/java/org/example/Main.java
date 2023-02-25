package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception{
foo();
    }
    public static void foo()throws Exception{
       // Class.forName("com.mysql.jdbc.Driver");
        String url="JDBC:mysql://localhost:3306/student";
        String username="root";
        String password="12345678910";
        Connection c= DriverManager.getConnection(url,username,password);
        String sql="INSERT INTO studentuser (id, name, surname,age) VALUES (?, ?, ?,?)";
       PreparedStatement  stmt=c.prepareStatement(sql);
        stmt.setInt(1,6);
        stmt.setString(2,"Aybeniz");
        stmt.setString(3,"Umudova");
        stmt.setInt(4,21);
        stmt.executeUpdate();
    }
}