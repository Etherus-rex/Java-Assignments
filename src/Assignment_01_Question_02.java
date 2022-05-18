/*
Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less than 2
 */

import java.util.Scanner;


public class Assignment_01_Question_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num>=2){
            int count = 0;
            for(; num>=2 ;num=num/2){
                count = count+1;
            }
            System.out.println("number of times "+num+" needed to be divided by 2 is "+ count);
        }
        else {
            System.out.println("the number u entered is smaller than 2");
        }
    }
}
