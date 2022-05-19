/*
Write a Java program that takes two arrays a and b of length n storing int values, and returns the
dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i], for i = 0, . . . ,
 */

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_01_Question_08 {
    public static int[] arrproduct( int[] arr1, int[] arr2) {
        int m = arr1.length;
        int[] arr3 = new int[m];
        for (int e = 0 ; e < m ; e++){
            arr3[e] = arr1[e]*arr2[e];
        }

        return arr3;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array ; ");
        int size_a = input.nextInt();
        int[] a = new int[size_a];

        System.out.println("Now enter the elements of the first  array one by one : ");

        for(int n = 0 ; n<size_a ; n++){
            System.out.print("enter the next element ; ") ;
            a[n] = input.nextInt();
        }

        System.out.println("Note : that both array may have different elements but need the same size ; ");


        int[] b = new int[size_a];

        System.out.println("Now enter the elements of the Second  array one by one : ");

        for(int i = 0; i< size_a; i++){
            System.out.print("enter the next element ; ") ;
            b[i] = input.nextInt();
        }

        int[] c;

        c = arrproduct(a ,b);

        System.out.println("the dot product of both of the arrays is " + Arrays.toString(c));


    }
}
