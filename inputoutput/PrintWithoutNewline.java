//As we have seen, the System.out.println() statement automatically appends a new line to our output. Here, we'll learn how to prevent that. 
//Take two string variables a and b, and you have to print a and b with a space between them. However, you must prevent the print statement from providing a new line as the new line will be given by the main driver code.

import java.util.Scanner;

public class PrintWithoutNewline {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter Subject Name: ");
        String str1=scn.nextLine();

        System.out.print("Enter Tutor Name: ");
        String str2=scn.nextLine();

        System.out.print(str1 + " " + str2);

        scn.close();
    }
}