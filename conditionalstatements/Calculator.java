// Given two numbers a and b; you need to perform basic mathematical operation on them. You will be provided an integer named as operator. 
// If operator equals to 1 add a and b, then print the result as a string.
// If operator equals to 2 subtract b from a, then print the result as a string.
// If operator equals to 3 multiply a and b, then print the result as a string.
// If operator equals to any another number, print "Invalid Input"(without quotes).
// Note: Do not add a new line at the end

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter an operator: ");
        int operator=scn.nextInt();

        System.out.print("Enter first number: ");
        int a = scn.nextInt();

        System.out.print("Enter second number: ");
        int b = scn.nextInt();

        if(operator==1){
            System.out.println(Integer.toString(a+b));
        } else if(operator==2){
            System.out.println(Integer.toString(a-b));
        } else if(operator==3){
            System.out.println(a*b);
        } else{
            System.out.println("Invalid Input");
        }

        scn.close();
    }
}
