/*
Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler
 */

import java.util.Scanner ;


class invalidInputException extends Exception{
    invalidInputException(String str){
        System.out.println(str);
    }
}

public class Assignment_03_Question_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your lucky number ; ");
        int num = in.nextInt();

        try {
            if (num < 0) {
                throw new invalidInputException("Invalid input");
            }
            else{
                System.out.println("your lucky number is ; "+num);
            }
        }
//        catch (NumberFormatException e){
//            System.out.println("Invalid Input ; -ve Numbers are not allowed");
//        }

        /// trying to make a custom class of exception


        catch (invalidInputException e) {
            System.out.println("next time please enter a positive number");
        }
    }
}
