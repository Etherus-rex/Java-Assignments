/*
Define an interface EmpInterface (void displayEmp(), void giveBonus(double amount)).
Define an abstract class Employee (empID, fName, lName, salary). Define a concrete class
Manager (bonus) subclass of Employee and define the interface methods. Perform the followings:

 a. Define the appropriate constructor in class hierarchy
 b. Ensure the bonus amount should not be negative and zero using exception handling.
 c. Create an array of interface reference variables and populate with manager objects.
 d. Write a Test class to implement the above said requirements of interface implement action and exception handling.

 */



import java.util.Objects;
import java.util.Scanner ;

interface EmpInterface {
    void displayEmp();
    void giveBonus(double amount);
}

abstract class Employee implements EmpInterface{
    int empID ;
    int salary ;
    String fName ;
    String lName ;

    Employee(){
        System.out.println("Enter the details of the employee's :");
        Scanner in  = new Scanner(System.in) ;

        System.out.print("Enter the employee's Id ; ");
        empID = in.nextInt();

        System.out.print("Enter the employee's salary ; ");
        salary = in.nextInt();

        System.out.print("Enter the employee's First name ; ");
        fName = in.next();

        System.out.print("Enter the employee's Last name ; ");
        lName = in.next();

    }
}

class Manager extends Employee {
    double bonus ;
    Manager(){
        super();
        Scanner in = new Scanner(System.in);
        System.out.print("add bonus : yes/no ; ");
        String temp = in.next();
        if (Objects.equals(temp, "yes")){
            System.out.print("Bonus ; ");
            double amt = in.nextDouble();
            giveBonus(amt);
        }
        else {
            bonus = 0 ;
        }
    }
    public void displayEmp(){
        System.out.println("The Employee details are as follows ; ");
        System.out.println("The employee Id is ; "+empID);
        System.out.println("The employee's First name is ; "+fName);
        System.out.println("The employee's Last name is ; "+lName);
        System.out.println("The employee's Salary is ; "+salary);
        System.out.println("Salary after bonus ; "+ (salary+bonus) );
    }

    public void giveBonus(double b){
        try {
            if (b<0){
                throw new ArithmeticException();
            }
            else{
                this.bonus = b ;
            }
        }

        catch (ArithmeticException e){
            System.out.println("Invalid input ; Bonus cannot be negative");
        }

        catch (Exception e ){
            System.out.println("Error occurred ; "+e);
        }
    }
}

public class Assignment_02_Question_08 {
    public static void main(String[] args) {
        Manager M = new Manager();

        M.displayEmp();
    }
}
