package com.lambton;

public class FirstDay
{
    public static void main(String[] args)
    {
        System.out.println("Komaldeep");
        int a,b,c;
        a=10;
        b=20;
        c=a+b;
        System.out.println("Sum:" + c);

        int x= Integer.MAX_VALUE;
        System.out.println("X :" + x);

        int y=x+1;
        System.out.println("Y :" + y);
        System.out.println("Min : " +Integer.MIN_VALUE);

        Student s1 = new Student();
        s1.setvalues();
        s1.display();

        Student s2 = new Student();
        s2.studentID =2;
        s2.studentName="name 2";
        s2.display();

        Student s3 = new Student();
        s3.studentID=3;
        s3.studentName = "name 3";
        s3.display();

        for(int i=0; i<10; i++)
        {
            System.out.println("Komal");
        }



    }
}