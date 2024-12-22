//Given a number n. Take input and add 10 to its value and print it.

import java.util.Scanner;

public class InputInteger {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n= scn.nextInt();

        int add=n+10;
        System.out.println(add);

        //System.out.println(n+10);

        scn.close();
    }
}
