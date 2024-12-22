//Take two inputs and stored in variables a and b, you need to print a and b in a single line without space betweenthem.
//Note: Print a new line at the end after printing.

import java.util.Scanner;

public class PrintWithoutSpace {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Word: ");
        String str1=scn.nextLine();

        System.out.print("Enter another Word: ");
        String str2=scn.nextLine();

        System.out.println(str1+str2);

        scn.close();
    }
}