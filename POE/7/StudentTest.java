//Class student with variable rollno, getrollno(), setrollno() methods.
//Class test inherits student class and have variables sub1, sub2 and getmarks(), setmarks() methods. Interface sports with variable smarks and set() method.
//Class result inherits test class and an implements sport interface and displays that marks.
//Demonstrate these classes with application.

import java.io.*;
import java.util.Scanner;

class Student
{
    int rollno;
    void getrollno(int r){
        rollno=r;
    }
    void putrollno(){
        System.out.println("Roll no. is "+rollno);
    }
}

class Test extends Student{
    int sub1,sub2;
    void getmarks(int m1,int m2){
        sub1=m1;
        sub2=m2;
    }
    void putmarks(){
    System.out.println("Marks in sub1 is "+sub1);
    System.out.println("Marks in sub2 is "+sub2);
    }
}

interface Sports{
    int smarks=10;
    void putsmarks();
}

class Result extends Test implements Sports{

    int total;

    public void putsmarks(){
        System.out.println("Sports marks is "+smarks);
    }
    void display(){
        total=sub1+sub2+smarks;
        putrollno();
        putmarks();
        putsmarks();
        System.out.println("Total marks is "+total);
    }
}

class StudentTest{
public static void main(String args[])throws IOException{
    Scanner input= new Scanner(System.in);
    Result r=new Result();
    int rno,m1,m2;
    System.out.print("Enter roll no. : ");
    rno=input.nextInt();
    System.out.print("Enter marks in sub1 : ");
    m1=input.nextInt();
    System.out.print("Enter marks in sub2 : ");
    m2=input.nextInt();
    r.getrollno(rno);
    r.getmarks(m1,m2);
    r.display();
    input.close();
    }
}
