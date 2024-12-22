// In this problem we will learn how to read inputs.
// You are given five inputs: a(integer), b(float ), c(long), d(byte), and s(string) respectively. 
// You need to use the scanner class object and then take all the input and print each in a new line.
// Note: Consider using sc.nextLine( ) after byte input to handle any issues with input reading.

import java.util.Scanner;

public class TakingInput{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte b=scn.nextByte();
        System.out.println("The byte value entered by user is: "+b);

        System.out.print("Enter a short value: ");
        short s=scn.nextShort();
        System.out.println("The short value entered by user is: "+s);

        System.out.print("Enter a int value: ");
        int i=scn.nextInt();
        System.out.println("The int value entered by user is: "+i);

        System.out.print("Enter a long value: ");
        long l=scn.nextLong();
        System.out.println("The long value entered by user is: "+l);

        System.out.print("Enter a float value: ");
        float f=scn.nextFloat();
        System.out.println("The float value entered by user is: "+f);

        System.out.print("Enter a double value: ");
        double d=scn.nextDouble();
        System.out.println("The double value entered by user is: "+d);

        System.out.print("Enter a boolean value: ");
        boolean bool=scn.nextBoolean();
        System.out.println("The boolean value entered by user is: "+bool);

        System.out.print("Enter a char value: ");
        char c=scn.next().charAt(0);
        System.out.println("The character entered by user is: "+c);

        scn.nextLine();
        System.out.println("Enter your name: ");
        String str=scn.nextLine();
        System.out.println("This data is provided for: "+str);


        

        scn.close();

    }
}
