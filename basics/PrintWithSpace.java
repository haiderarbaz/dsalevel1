//Given two inputs that are store in variables a and b, you need to print a and b in a single line with a space separating them. Add new line after printing with space.

import java.util.Scanner;

public class PrintWithSpace {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String firstName=scn.nextLine();
        System.out.print("Enter your Last Name: ");
        String lastName=scn.nextLine();

        System.out.println(firstName + " " +lastName);    

        scn.close();
    }
}
