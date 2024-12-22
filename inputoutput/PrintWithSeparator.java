//Take two strings a and b, a separator symbol, and you need to print a and b such that a and b are separated by the separator symbol followed by a new line.

import java.util.Scanner;

public class PrintWithSeparator {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter Intial Character : ");
        String str1=scn.nextLine();

        System.out.print("Enter a separator between password: ");
        String str2=scn.nextLine();

        System.out.print("Enter character after separator: ");
        String str3=scn.nextLine();

        System.out.println(str1+str2+str3);

        scn.close();
    }
}