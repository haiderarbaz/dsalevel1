//Here two integers a and b are given. The given input and its values are passed as arguments to the function argumentFunction. The argumentFunction is responsible to return (a+b). You need to write this function.

import java.util.Scanner;

public class FunctionWithArguments0 {
    public static int argumentFunction(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter two number a and b: ");
        int a=scn.nextInt();
        int b=scn.nextInt();

        System.out.println("The sum of a & b is : " + argumentFunction(a, b));

        scn.close();
    }
}
