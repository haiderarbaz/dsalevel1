//Here one integer n is given. You need to write the complete function returnValueFunction that takes n as a parameter and uses the return keyword to return double the value of n.

import java.util.Scanner;

public class FunctionWithReturnValue {
    public static int returnValueFunction(int n){
        return n*2;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter an Number: ");
        int n=scn.nextInt();
        
        System.out.println(returnValueFunction(n));
        

        scn.close();
    }


}
