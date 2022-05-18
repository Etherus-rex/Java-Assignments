/*
Write a Java program that takes as input three integers, a, b, and c, from the Java console and
determines if they can be used in a correct arithmetic formula (in the given order), like “a + b = c,” “a
= b − c,” or “a b = c.”
 */

import java.util.Scanner;

public class Assignment_01_Question_01 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a+b == c){
            System.out.println("the inputs satisfy the equation a + b = c ");
        }
        else if (a == b-c){
            System.out.println("the input satisfy the equation a = b - c");
        }
        else if (a*b==c){
            System.out.println("the input satisfy the equation a.b = c");
        }
        else {
            System.out.println("none of the input satisfy the equations ");
        }

    }
}
