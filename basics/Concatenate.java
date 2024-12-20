// Given two integers a and b, you need to concatenate them so the output is ab and print it.

import java.util.*;

public class Concatenate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a=scn.nextInt();
        System.out.print("Enter the value of b: ");
        int b= scn.nextInt();

        //int conacte=a+b;

        System.out.println(Integer.parseInt(Integer.toString(a)+(Integer.toString(b))));

        // Integer.toString(a):

        // Converts the integer a to its string representation.
        // Example: If a = 5, Integer.toString(a) produces "5".

        // Integer.toString(a):

        // Converts the integer a to its string representation.
        // Example: If a = 5, Integer.toString(a) produces "5".        



        scn.close();
    }
}
