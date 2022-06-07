//package A_02_Q_09;
//
///*
// Design a package that contains two classes Student & Test. The Student class has data
// members as name, roll and instance methods input( ) & output( ). Similarly the Test class
// has data members as mark1, mark2 and instance methods input( ), output( ), Student is
// extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
// Find grand total mark & score in another class.
//
// */
//import java.util.Scanner ;
//
//class Student extends  Test{
//    int roll_number ;
//    String name ;
//
//    public void input(){
//        Scanner in = new Scanner(System.in);
//        this.roll_number = in.nextInt();
//        this.name = in.nextLine();
//    }
//
//    public void output(){
//        System.out.print("The roll number of the student ; "+roll_number);
//        System.out.println("the Name of the student is ; "+name);
//    }
//}
