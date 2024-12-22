//Given a floating number, you need to input it. The floating number will then be print it after multiplying it by 10.

import java.util.Scanner;

public class InputFloat {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a floating value: ");
        float f=scn.nextFloat();

        float multiply=f*10;
        System.out.println("The floating value after multiplying it by 10: "+multiply);

        scn.close();
    }
}
