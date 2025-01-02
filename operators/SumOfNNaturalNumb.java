// Take an integer n find the sum of the first n natural number.

import java.util.Scanner;

public class SumOfNNaturalNumb {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        //Efficient way 
        System.out.print("Enter a natural number: ");

        int n=scn.nextInt();

        int sum=(n*(n+1))/2;

        System.out.println(sum);

        //second way using for loop
        System.out.print("Enter a natural number: ");
        int i = scn.nextInt();
        int sum1 = 0;
        for (int x = 1; x <= i; x++)
            sum1 = sum1 + x;
        System.out.println(sum1);

        //third way using conditional statements
        System.out.print("Ente a natural number: ");
        int m = scn.nextInt();
        int sum2;
        if (m % 2 == 0)
            sum2 = (m / 2) * (m + 1);
        // If n is odd, (n+1) must be even
        else
            sum2 = ((m + 1) / 2) * m;
        System.out.println(sum2);


        scn.close();
    }
}
