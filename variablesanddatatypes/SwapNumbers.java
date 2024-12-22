//Take two numbers from user a a and b, you need to swap their values so a holds the value of b and b holds the value of a. Just write the code to swap values of a and b at the specified place.

import java.util.*;

public class SwapNumbers{
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a number to swap: ");
        int a=scn.nextInt();

        System.out.print("Enter a another number to swap: ");
        int b=scn.nextInt();

        int temp=a;
        a=b;
        b=temp;

        System.err.println(a + " " + b);

        scn.close();
    }
}