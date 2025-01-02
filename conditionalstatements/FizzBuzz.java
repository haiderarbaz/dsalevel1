// You are given a number  and you have to print your answer according to the following:
// If the number is divisible by 3, you print "Fizz" (without quotes)
// If the number is divisible by 5, you print "Buzz" (without quotes)
// If the number is divisible by both 3 and 5, you print "FizzBuzz" (without quotes)
// In any other case, you print the number itself

// Note: You should add a newline character after print() statement.

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number=scn.nextInt();

        if(number%3==0 && number%5==0){
            System.out.println("FizzBuzz");
        }else if(number%3==0){
            System.out.println("Fizz");
        }else if(number%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(number);
        }

        scn.close();
    }
}
