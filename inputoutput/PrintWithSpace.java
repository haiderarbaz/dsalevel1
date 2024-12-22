//Take two inputs and store in variables a and b, you need to print a and b in a single line with a space separating them.

import java.util.*;

public class PrintWithSpace{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter Your FirstName: ");
        String str1=scn.nextLine();

        System.out.print("Enter your LastName: ");
        String str2=scn.nextLine();

        System.out.println(str1 + " " +str2);


        scn.close();
    }
} 