//Given a text in the form of a string, you need to take input and print it.

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter your name: ");

        String str=scn.nextLine();
        System.out.println("User Name is: "+str);
        
        scn.close();
    }
}
