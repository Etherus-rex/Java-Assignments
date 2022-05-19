/*
Write a Java method for finding the smallest and largest numbers in an array of integers and
compare that to a java method that would do the same thing.

 */


import java.util.Arrays;
import java.util.Scanner;

public class Assignment_01_Question_06 {
    public static int[] num_check(int[] arr){
        int max = arr[0];
        int min = arr[0] ;

        for(int i : arr){
            for(int j:arr){
                if (i > j){
                    if (i > max){
                        max = i ;
                    }
                else if (j > i){
                    if (j > max){
                        max = j ;
                        }
                    }
                }
            }
        }

        for(int m : arr){
            for(int n:arr){
                if (m < n){
                    if (m < min){
                        min = m ;
                    }
                else if (n < m){
                    if (n < max){
                        max = n ;
                        }
                    }
                }
            }
        }

        int[] min_max = new int[2];
        min_max[0] = min ;
        min_max[1] = max ;


        return min_max ;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array ; ");
        int size = input.nextInt();

        int[] array = new int[size];

        System.out.println("please enter the elements for your array one bu=y one ; ");

        for (int i = 0  ; i<size ; i++){
            array[i] = input.nextInt();
        }

        int[] result = num_check(array);


        System.out.println("the minimum and maximum of the entered array "+ Arrays.toString(result));

    }
}
