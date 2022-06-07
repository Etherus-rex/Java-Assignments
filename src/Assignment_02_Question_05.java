/*
 Let a class Person contains data members name and age. A constructor with two arguments
 is used to assign name and age. Person is of two types a) Student and b) Teacher. class
Student contains data members i)course ii) Roll Number and iii)Marks and method
display() to display data related to student. Similarly, class Teacher contains data members
 i) subject_assigned (May take this as a String) ii) contact_hour and method display () to
 display data related to teacher. Implement this program using base class constructor in
 derived class.

 */
import java.util.Scanner ;

abstract class Person {
    int age ;
    String name ;
    Person(int age ,String name){
        this.age = age ;
        this.name = name ;
    }
}

class Student extends Person {
    int roll_number  , marks ;
    String course ;
    Student(int age , String name , String course , int roll_number , int marks ){
        super(age , name);
        this.course = course ;
        this.roll_number = roll_number ;
        this.marks = marks ;
    }

    public void displayStudentDetails(){
        System.out.println("the name of the student  ; " +name);
        System.out.println("the age of the student  ; " + age);
        System.out.println("the roll number of the student  ; " +roll_number);
        System.out.println("the course of the student  ; " +course);
        System.out.println("the marks of the student  ; " + marks);
    }
}

class Teacher extends Person {
    String contact ;
    String subjectAssigned  ;

    Teacher(int age , String name , String contact , String subjectAssigned){
        super(age , name ) ;
        this.contact = contact ;
        this.subjectAssigned =subjectAssigned ;
    }

    public void displayTeacherDetails(){
        System.out.println("The name of the teacher is ; "+name);
        System.out.println("The age of the teacher is ; "+age);
        System.out.println("The contact hour of the teacher is ; "+contact);
        System.out.println("The assigned subject of the teacher is ; "+subjectAssigned);
    }
}

public class Assignment_02_Question_05 {
    public static void main(String[] args) {
        Student friend = new Student(18 , "Ayashkant" , "cse ", 42 , 95 );
        Teacher Igtmam  = new Teacher(38 , "manju" , "1am to 2pm" , "IGT") ;

        friend.displayStudentDetails();
        Igtmam.displayTeacherDetails();
    }
}
