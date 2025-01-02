// Given a number, you have to use the if statement to print "Big" (without quotes) if the given number is greater than 100. The statement "Number" (without quotes) will be printed regardless. Just write an if statement at the mentioned place that prints "Big" if the given number is greater than 100.

import java.util.Scanner;

public class TheIfStatement {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number=scn.nextInt();

        if(number>100){
            System.out.println("Big");
            System.out.println("Number");
        }
        else{
            System.out.println("Number");
        }

    scn.close();}
}
