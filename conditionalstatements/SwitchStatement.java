// Given a number, you have to use a switch statement to return "One" if the given number is equal to 1, "Two" if the number is 2 and so on till 9 ("Nine") else return "Unknown"(without quotes). 

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number=scn.nextInt();


        switch(number){
            case 1: 
                System.out.println("One");
                break;
            case 2: 
                System.out.println("Two");
                break;
            case 3: 
                System.out.println("Three");
                break;
            case 4: 
                System.out.println("Four");
                break;
            case 5: 
                System.out.println("Five");
                break;
            case 6: 
                System.out.println("Six");
                break;
            case 7: 
                System.out.println("Seven");
                break;
            case 8: 
                System.out.println("Eight");
                break;
            case 9: 
                System.out.println("Nine");
                break;
            default: 
                System.out.println("Unknown");

            
        }

        scn.close();
    }
}
