package com.lambton;

public class Student
{
    int studentID;
    String studentName;
    void setvalues()
    {
        studentID=1;
        studentName="Komal";
    }

    void display()
    {
        System.out.println("Student ID :" + studentID);
        System.out.println("Student Name :"+ studentName);
    }
}
