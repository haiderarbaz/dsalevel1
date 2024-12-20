//Take a double value d from user, typecast it to an integer value and return it.

import java.util.*;

public class TypeConver{
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double d=scn.nextDouble();

        int i = (int) d;
        char c = (char) i;

        System.out.println(i);
        System.out.println(c);

        scn.close();


    }
}