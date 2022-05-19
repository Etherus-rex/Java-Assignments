/*
Write a Java method that takes an array of int values and determines if there is a pair of distinct
elements of the array whose product is odd.
 */

import java.util.Arrays;
import java.util.Scanner ;

public class Assignment_01_Question_07 {
    public static void distinct(int[] arr){
        int s = arr.length;
        int[] data = new int[s];

        int i = 0 ;

        for(int e:arr){
            for(int m:arr){
                if (e!=m){
                    int x = e*m;
                    if (x%2!=0){
                        System.out.println("the pair of distinct elements whose product is odd  are; "+e+" "+m);
                    }
                }
            }
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array u want ; ");
        int size = input.nextInt();

        int[] array = new int[size];
        System.out.println("Now enter the elements of the array one by one ; ");

        for (int n = 0 ; n < size; n++){
            array[n] = input.nextInt();
        }
        distinct(array);
    }
}
