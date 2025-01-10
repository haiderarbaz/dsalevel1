// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 1
// 22
// 333
// 4444
// 55555

// Print the pattern in the function given to you.

import java.util.*;

public class Pattern4{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number of lines you want to print: ");
        int N=scn.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);

            }System.out.println();
        }

        scn.close();
    }
}