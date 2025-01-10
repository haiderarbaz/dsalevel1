// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 1
// 12
// 123
// 1234
// 12345

// Print the pattern in the function given to you.

import java.util.*;

public class Pattern3{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number of lines you want to print: ");
        int N=scn.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        scn.close();
    }
}