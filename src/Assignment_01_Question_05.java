/*
Write a Java method, isOdd, that takes an int i and returns true if and only if i is odd. Your method
can't use the multiplication, modulus, or division operators, however.
 */

import java.util.Scanner;
public class Assignment_01_Question_05 {
    public static boolean isOdd(int x){
        while (x>=2) {
            x = x-2;
        }
        if (x==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int i = input.nextInt();

        System.out.println("the statement that "+i+" is an odd number is "+isOdd(i));
    }
}