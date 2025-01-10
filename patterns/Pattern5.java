// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *****
// ****
// ***
// **
// *

// Print the pattern in the function given to you.

import java.util.*;

public class Pattern5{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter character *: ");
        char c= scn.next().charAt(0);

        System.out.print("Enter number of lines you want to print: ");
        int N=scn.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i+1; j++){
                System.out.print(c);
            }System.out.println();
        }

        // Another wayfor(int i=1; i<=n; i++){
            for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(c);
            }System.out.println();
        }

        scn.close();
    }
}