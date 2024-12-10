//Given an input String s, you need to print it and move the cursor to the next line.

import java.util.Scanner;

public class PrintStatement {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.print("What is your Name? ");
        String str1=scn.nextLine();
        System.out.print("Where are you from? ");
        String str2=scn.nextLine();

        System.out.println("User name is " + str1 + " and he is from " + str2 + ".");

        scn.close();
    }
}
