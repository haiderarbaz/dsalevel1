//double to int

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter a double number: ");
        double n1=scn.nextDouble();

        int i =(int)n1;
        System.out.println(i);

        scn.close();
    }
    
}
