// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

//     *
//    ***
//   *****
//  *******
// *********

// Print the pattern in the function given to you.

import java.util.*;

public class Pattern7{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a characteer: ");
        char c=scn.next().charAt(0);

        System.out.print("Enter number of lines you want to print: ");
        int N=scn.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i; j++ ){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(c);
            }

            // This one is optional not necessary but good you understanding the logic building
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }


        scn.close();
    }
}