// Take an number input from user, print the sum of first n Natural Numbers, if users enters a negative number show error and exit.

import java.util.Scanner;

public class SumOfNNaturatlNumbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num=scn.nextInt();

        if(num<0){
            System.err.println("Invalid Input");
            return;
        }

        System.out.println("Sum of Natural " + num + " is " +(num*(num+1)/2));

        scn.close();
    }
}
