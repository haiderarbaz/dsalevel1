//Given an input num as a string. You need to typecast into an integer and double it. 

import java.util.Scanner;

public class TypeCastAndDoubleIt{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num=scn.nextLine();

        int num1=Integer.parseInt(num);

        int Doublenum1=num1*2;

        System.out.println(Doublenum1);
    

        scn.close();
    }
}