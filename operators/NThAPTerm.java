// Given three integers a, d and n. Where a is the first term, d is the common difference of an A.P.  Calculate the nth term of A.P. 
// The nth term is given by an = a + (n-1)d

import java.util.Scanner;

public class NThAPTerm {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the first term of the AP: ");
        int a=scn.nextInt();

        System.out.print("Enter the common difference of the AP: ");
        int d=scn.nextInt();

        System.out.print("Enter the Nth term to find in the AP: ");
        int n=scn.nextInt();

        int nthTerm=a+(n-1)*d;

        System.out.println("The " + n + "th term of series is: " +nthTerm);

        scn.close();
    }
}
