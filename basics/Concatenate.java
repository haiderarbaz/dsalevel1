//Read two integers from users, and you need to concatenate them so the output is ab and print it.

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1=scn.nextInt();
        System.out.println("Enter the second number: ");
        int n2=scn.nextInt();

        int concatenate=Integer.parseInt(Integer.toString(n1)+Integer.toString(n2));
        System.out.println(concatenate);

        scn.close();
    }
    
}
