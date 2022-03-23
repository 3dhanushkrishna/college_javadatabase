package com.harman.javadb;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        try {
            Connection c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","");
            Scanner input = new Scanner(System.in);
            String name, rollno, admissionno, college;
            System.out.println("enter the name: ");
            name = input.next();
            System.out.println("Enter the rollno: ");
            rollno = input.next();
            System.out.println("enter the admissionno: ");
            admissionno = input.next();
            System.out.println("Enter the college name: ");
            college = input.next();
            Statement stmt=c.createStatement();
            stmt.executeUpdate("INSERT INTO `students`( `name`, `rollno`, `admissionno`, `college`)"+ "VALUES('"+name+"',"+rollno+","+admissionno+",'"+college+"')");
            System.out.println("Inserted successfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
