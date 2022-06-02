/*
Define a class called Complex with instance variables real, image and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is: public Complex add(Complex, Complex).
 */

import java.util.Scanner ;

class complex {
    int[] complex =  new int[2];
    public static int real(){
        Scanner intake = new Scanner(System.in);
        System.out.print("Enter the real part of the complex number  ; ");
        return intake.nextInt();
    }
    public static int imaginary_coefficient(){
        Scanner intake = new Scanner(System.in);
        System.out.print("Enter the coefficient of imaginary part of the complex number  ; ");
        return intake.nextInt();
    }

    public void setData(){

        int real1 , imaginary1 ;
        real1 = real();
        imaginary1 = imaginary_coefficient();
        complex[0] = real1 ;
        complex[1] = imaginary1;

    }
    public void setData(int a,int b){
        complex[0] = a ;
        complex[1] = b ;
    }

    public void display(){
        System.out.println("the first complex number is ; "+complex[0]+"+"+complex[1]+"i");
    }

    public int real_data(){
        return complex[0];
    }
    public int imag_data(){
        return complex[1];
    }


    public void add(complex arr1 , complex arr2){
        System.out.println("the sum of the entered complex numbers ; "+arr1.real_data()+"+"+arr1.imag_data()+"i" +" and " +arr2.real_data()+"+"+arr2.imag_data()+"i");

        int x = arr1.real_data() + arr2.real_data() ;
        int y = arr1.imag_data() + arr2.imag_data() ;

        complex sum =  new complex();
        sum.setData(x ,y);
        sum.display();
    }

}

public class Assignment_02_Question_02 {
    public static void main(String[] args){
        complex num1 = new complex();
        complex num2 = new complex();
        complex result = new complex();

        System.out.println("Setting data ...");

        System.out.println("Enter data for 1st complex number ; ");
        num1.setData();
        System.out.println("Enter data for 2nd complex number ; ");
        num2.setData();

        System.out.println("Displaying data ...");
        num2.display();
        num2.display();


        System.out.println("Adding the above two complex numbers ; ");
        result.add(num1 , num2);     //  num1.add(num1,num2); ---> can also be used to calculate the sum of the numbers



    }
}
