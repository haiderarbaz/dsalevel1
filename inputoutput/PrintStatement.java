//Take an input String s, you need to print it and move the cursor to the next line.

import java.util.Scanner;

public class PrintStatement{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Where do you live? Enter full Address: ");
        String str=scn.nextLine();

        System.out.println(str);


        scn.close();
    }
}