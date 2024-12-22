//Take three positive integers a, b and c. Your task is to perform some bitwise operations on them as given below:
// 1. d = a ^ a
// 2. e = c ^ b
// 3. f = a & b
// 4. g = c | (a ^ a)
// 5. e = ~ e
// Note: ^ is for xor.

import java.util.*;

public class BitwiseOperators{
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a value for a: ");
        int a=scn.nextInt();

        System.out.print("Enter a value for b: ");
        int b=scn.nextInt();        

        System.out.print("Enter a value for c: ");
        int c=scn.nextInt();

        int d = a ^ a;
        int e = c ^ b;
        int f = a & b;
        int g = c | (a ^ a);
        e = ~ e;

        System.out.println(d + " " + e + " " + f + " " + g);

        scn.close();
    }
}