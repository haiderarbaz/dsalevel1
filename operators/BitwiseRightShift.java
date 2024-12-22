// Take two positive integers a and b. Your task is to perform right shift bitwise operation on it as given below:
// Do a>>b.

import java.util.*;

public class BitwiseRightShift{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a value: ");
        int a=scn.nextInt();

        System.out.print("Enter b value: ");
        int b=scn.nextInt();

        int rightShift=a>>b;

        System.out.println(rightShift);




        scn.close();
    }
}
