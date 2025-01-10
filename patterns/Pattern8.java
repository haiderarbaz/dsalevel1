// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *********
//  *******
//   *****
//    ***
//     *

// Print the pattern in the function given to you.

import java.util.*;

public class Pattern8{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a character to print: ");
        char c=scn.next().charAt(0);

        System.out.print("Enter number of lines you want to print: ");
        int N=scn.nextInt();

        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*N-1)-(2*i); j++){
                System.out.print(c);
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        // Another way you can write it
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*(N-i)-1; j++){
                System.out.print(c);
            }
            // for(int j=0; j<i; j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
        scn.close();
    }
}