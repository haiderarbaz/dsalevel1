// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
import java.util.*;

public class Pattern10{

    private static void patternUpper(int N, char c){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(c);
            }System.out.println();
        }
    }
    private static void patternInverted(int N, char c){
        for(int i=1; i<=N; i++){
            for(int j=N; j>i; j--){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a character you want to print: ");
        char c=scn.next().charAt(0);

        System.out.print("Enter the number of lines you want to print: ");
        int N=scn.nextInt();

        patternUpper(N, c);
        patternInverted(N, c);

        scn.close();
    }
}