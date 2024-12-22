//Given a number n. Take input and add 10 to its value and print it.

import java.util.Scanner;

public class InputInteger{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a integer value: ");
        int n=scn.nextInt();

        int res=n+10;

        System.out.println(res);

        scn.close();
    }
}