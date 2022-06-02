/*
Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
 instance methods. A derived class Exam is created from the class Student . The derived
 class contains mark1, mark2, mark3 as instance variables representing the marks of three
 subjects and input_Marks () and display_Result () as instance methods. Create an array of
 objects of the Exam class and display the result of 5 students.
 */

import java.util.Scanner ;

class student {
    int roll_no ;
    String name ;
    String course ;

    student(){
    }

    student(int r , String n , String c){
        this.roll_no = r ;
        this.name = n ;
        this.course = c ;
    }

    public void input_Student(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the Student ; ");
        this.name = input.nextLine();

        System.out.print("Enter the course to which the student belongs ; ");
        this.course = input.nextLine();

        System.out.print("Enter the roll number of the Student ; ");
        this.roll_no = input.nextInt();

    }

    public void display_student(){
        System.out.println("THe details are as follows ; ");
        System.out.println("Roll number ; "+roll_no);
        System.out.println("Name ; "+name);
        System.out.println("Course ; "+course);
    }
}
class Exam extends student{
    int marks1 ;
    int marks2 ;
    int marks3 ;

    public void input_marks(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the marks of the 1st Subject  ; ");
        marks1 = input.nextInt();

        System.out.print("Enter the marks of the 2st Subject  ; ");
        marks2 = input.nextInt();

        System.out.print("Enter the marks of the 3st Subject  ; ");
        marks3 = input.nextInt();
    }

    public void display_marks(){
        System.out.println("The marks of the student are as follows ; ");
        System.out.println("the subject of 1st marks ; "+marks1);
        System.out.println("the subject of 2st marks ; "+marks2);
        System.out.println("the subject of 3st marks ; "+marks3);
    }
}

public class Assignment_02_Question_03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students u have details ; ");
        int n = s.nextInt() ;
        Exam[] students = new Exam[n];
        for(int x=0; x<n; x++){
            students[x] = new Exam() ;
        }

        for(int m=0; m<n ; m++ ){
            int c = m+1 ;
            System.out.println("Enter the details about the student no. ; "+c);
            students[m].input_Student();
            students[m].input_marks();
        }

        for (int i=0 ; i<n ; i++){
            students[i].display_student();
            students[i].display_marks();
        }
    }
}
