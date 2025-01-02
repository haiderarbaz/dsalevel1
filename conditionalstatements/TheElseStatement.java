// Given a number, you have to use the if statement to print "Big" (without quotes) if the given number is greater than 100, and use the else statement to print "Number" (without quotes) when the number is smaller than or equal to 100.
// Note: You should print the newline after printing"Number" or"Big".

import java.util.Scanner;

public class TheElseStatement {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number=scn.nextInt();

        if(number>100){
            System.out.println("Big");
        }else{
            System.out.println("Number");
        }

        scn.close();
    }
}
