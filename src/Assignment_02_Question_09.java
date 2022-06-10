/*
this is the runner for package A_02_Q_09 and sports



 Design a package that contains two classes Student & Test. The Student class has data
 members as name, roll and instance methods input( ) & output( ). Similarly the Test class
 has data members as mark1, mark2 and instance methods input( ), output( ), Student is
 extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
 Find grand total mark & score in another class.



 */


import A_02_Q_09.Test;
import Sports.Sports_interface ;
import java.util.Scanner;

class support extends A_02_Q_09.Test implements Sports_interface{
    public int gradTotalMarks(){
        int total_marks = mark1+mark2;
        if (total_marks>0){
            return total_marks ;
        }
        else{
            System.out.println("Enter the marks of the student ; ");
            input();
            gradTotalMarks();
            return total_marks;
        }
    }

    public void setScore(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Score in 1st subject ; ");
        Score1 = in.nextInt();

        System.out.println("Enter the Score in 2nd subject ; ");
        Score2 = in.nextInt();
    }
    public void getScore(){
        System.out.println("the Score in first match is  ;  "+Score1);
        System.out.println("the Score in Second match is ; "+Score2);
    }

    public int getTotalScore(){
        int total_Score = Score1+Score2;
        if (total_Score>0){
            return total_Score ;
        }
        else{
            setScore();
            return (Score1+Score2) ;
        }
    }
}

public class Assignment_02_Question_09 {
    public static void main(String[] args) {
        support s = new support();

        s.input();
        s.output();
        s.setScore();
        s.getScore();
        s.gradTotalMarks();
    }
}
