import java.util.Scanner;

public class FunctionWithReturnValue0 {
    public static int returnValueFunction(int n){
        return n*4;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=scn.nextInt();

        System.out.println(returnValueFunction(n));

        scn.close();
    }
}
