// Decide an input number is
// a) Positive Even
// b) Positive Odd
// c) Negative Even
// d) Negative Odd
// e) Zero

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num=scn.nextInt();

        if(num>0){
            System.out.print("Positive");
            if(num%2==0){
                System.out.println(" Even Number.");
            } else{
                System.out.println(" Odd Number.");
            }
        } else if(num<0){
            System.out.print("Negative");
            if(num%2==0){
                System.out.println(" Even Number.");
            }else{
                System.out.println(" Odd Number.");
            }
        } else{
            System.out.println("Number entered by user is " + num);
        }

        scn.close();
    }
}
