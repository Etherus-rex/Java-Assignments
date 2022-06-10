package A_02_Q_09;

import java.util.Scanner ;

public class Test extends Student{
    public int mark1 , mark2 ;

    public void input(){
        input();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the marks in 1st subject ; ");
        this.mark1 = in.nextInt();

        System.out.print("Enter the marks in 2nd subject ; ");
        this.mark2 = in.nextInt();
    }

    public void output(){
        output();
        System.out.println("the marks of the student in first subject is ; "+mark1);
        System.out.println("the marks of the student in second subject is ; "+mark2);
    }
}
