package A_02_Q_09;

/*
 Design a package that contains two classes Student & Test. The Student class has data
 members as name, roll and instance methods input( ) & output( ). Similarly the Test class
 has data members as mark1, mark2 and instance methods input( ), output( ), Student is
 extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
 Find grand total mark & score in another class.
 */


import java.util.Scanner ;

class Student{
    int roll ;
    String name ;
    public int Score1 ,Score2 ;

    public void input(){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the name ; ");
        this.name = in.nextLine() ;

        System.out.print("Enter the roll number ; ");
        this.roll = in.nextInt();
    }

    public void output(){
        System.out.println("the name of the student is ; " + name);
        System.out.print("the roll number of the student ; "+roll);
    }
}

