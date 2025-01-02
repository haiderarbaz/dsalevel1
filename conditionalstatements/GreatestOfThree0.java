// Given three numbers x, y, and z of which aim is to get the largest among these three numbers.

import java.util.Scanner;

public class GreatestOfThree0 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the first, second and the third number: ");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();

        String greatest;

        if(a>=b && a>=c){
            greatest = Integer.toString(a);
        }
        else if (b>=a && b>=c){
            greatest = Integer.toString(b);
        }
        else{
            greatest = Integer.toString(c);
        }

        System.out.println(greatest + " is the greates number.");


        scn.close();
    }
}
