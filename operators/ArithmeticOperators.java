//Take two integer variables x and y. You need to perform the following operations:

import java.util.Scanner;

public class ArithmeticOperators{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int i1=scn.nextInt();

        System.out.print("Enter a integer: ");
        int i2=scn.nextInt();

        //Addition
        int add=i1+i2;
        System.out.println("Addition of " + i1 + " and " + i2 + " is " +add);

        //Subtraction
        int sub=i1-i2;
        System.out.println("Subtraction of " + i1 + " and " + i2 + " is " +sub);

        //Multiplication
        int multiply=i1*i2;
        System.out.println("Multiplication of " + i1 + " and " + i2 + " is " +multiply);

        //Division
        int div=i1/i2;
        System.out.println("Division of " + i1 + " and " + i2 + " is " +div);

        //Modulus
        int mod=i1%i2;
        System.out.println("Modulus of " + i1 + " and " + i2 + " is " +mod);

        scn.close();
    }
}
