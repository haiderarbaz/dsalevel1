// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

// Print the pattern in the function given to you.

import java.util.*;

public class Pattern12{
    private static void numberPrint(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*(N-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);

        System.out.print("Enter the number of lines you want to print: ");
        int N=scn.nextInt();

        numberPrint(N);

        scn.close();
    }
}