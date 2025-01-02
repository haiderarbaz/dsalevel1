// Create a basic calculator in java using the nested if/else statements which can perform operations like addition, subtraction, multiplication, division, and modulo of any two numbers. We will be defining the numbers as an integer but if you want the decimal side of numbers as well feel free to initiate them as double or float. Let’s see what our calculator will look like – 

// Enter the two numbers - 2, 2
// Choose and Enter the type of operation you want to perform (+, -, *, /, %)  - +
// Your Answer is = 4

// Algorithm 
// Take two numbers and the operator as inputs from the user using the Scanner class..
// Use nested if/else statements to write the logic for the operations
// Initialize a new integer which will store the answer initially as 0
// Print the answer

import java.util.Scanner;

public class Calculator0 {
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);

        System.out.print("Enter first and the second number: ");
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %)- ");

        char operator=scn.next().charAt(0);

        int ans=0;

        if (operator=='+') {
            ans = a+b;
        } else if(operator=='-'){
            ans=a-b;
        } else if(operator=='*'){
            ans = a*b;
        } else if(operator=='/'){
            ans = a/b;
        } else{
            ans=a%b;
        }

        System.out.println("Your answer is : " +ans);

        scn.close();
    }
}
