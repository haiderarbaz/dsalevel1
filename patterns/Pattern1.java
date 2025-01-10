// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *****
// *****
// *****
// *****
// *****

// Print the pattern in the function given to you.

import java.util.*;

public class Pattern1{
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);

        System.out.print("Enter a character *: ");
        char c=scn.next().charAt(0);

        System.out.print("Enter number of lines you want to print: ");
        int N=scn.nextInt();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(c);
            }
            System.out.println();

        }

        scn.close();
    }
}