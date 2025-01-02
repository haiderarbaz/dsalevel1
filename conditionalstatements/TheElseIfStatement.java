// Given a number, you have to use if, else if, else conditional statements according to the following:
// if number is greater than 100: Print "Big" (without quotes)
// else if number is smaller than 10: Print "Small" (without quotes)
// else: Print "Number" (without quotes)

import java.util.Scanner;

public class TheElseIfStatement {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number");
        int number=scn.nextInt();

        if(number>100){
            System.out.println("Big");
        }else if(number<10){
            System.out.println("Small");
        }else{
            System.out.println("Number");
        }

        scn.close();
    }
}
