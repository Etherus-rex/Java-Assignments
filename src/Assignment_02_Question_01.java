/*
A sales person is paid commission based on the sales he makes as shown by the following
table:

-------------------------------------------------------------|
SALES                                 |         COMMISSION   |
--------------------------------------|--------------------  |
Under Rs. 500                         |         2% of SALES  |
Rs. 500 and under Rs. 5000            |         5% of SALES  |
Rs. 5000 and over                     |         8% of SALES  |
------------------------------------------------------------ |

Write a class, Commission, which has:
An instance variable, sales; an appropriate constructor; and a method, getCommission()
that returns the commission.
Now write a Demo class in Java to test the Commission class by reading a sale from the
user, using it to create a Commission object after validating that the value is not negative.
Finally, call the get-commission() method to get and print the commission. If the sales are
negative, your Demo class should print the message “Invalid Input”.

 */

import java.util.Scanner ;


class commission {
    int sales;
    int commission = 0;

    commission(int s) {
        sales = s;
    }

    public int getCommission(){
        if (sales<500){
            commission = 2 ;
        }

        else if (sales>=500 && sales<5000){
            commission = 5 ;
        }

        else if (sales > 5000){
            commission = 8 ;
        }

        return commission ;
    }



}


public class Assignment_02_Question_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the amount of sales ; ");
        int sale = input.nextInt();

        commission c1 = new commission(sale);
        System.out.println("Commission for the sales is ; "+ c1.getCommission() + "%");

    }
}

