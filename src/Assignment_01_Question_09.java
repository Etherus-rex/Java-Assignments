/*
Create a class Student with instance variables name, roll, mark and instance methods setData(),
display(). Write a Java program to create three objects of Student class to input details of three
different students and display the details. Enclose main() method inside another class
StudentDetails. (Use the setter method setData() to input details.)
 */

class students {
    public String name ;
    public int roll ;
    public int marks ;

    public void setData(String Student_name , int Student_roll , int Student_marks){
        name = Student_name;
        roll = Student_roll;
        marks = Student_marks;
    }
    public void display(){
        System.out.println(name);
        System.out.println("Roll number "+roll);
        System.out.println("Marks "+marks);
    }
}



public class Assignment_01_Question_09 {
    public static void main(String[] args){

        students student1 = new students();
        student1.setData("Rohit Mishra",2141013130 , 80);

        students student2 = new students();
        student2.setData("Anshuman Nanda" , 214101465 , 75);

        students student3 = new students();
        student3.setData("Ayaskant pradhan" , 214101287 , 85);

        student1.display();
        student2.display();
        student3.display();
    }
}
