//Given a text in the form of a string, you need to take input and print it.

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String str=scn.nextLine();

        System.out.println(str + " logged in.");


        scn.close();
    }
}
