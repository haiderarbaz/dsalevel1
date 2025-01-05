import java.util.*;

public class PrintXNNumberOfTime{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number X: ");
        int X=scn.nextInt();

        System.out.print("Enter Number of times you want to print X: ");
        int N=scn.nextInt();

        if(N<0){
            System.out.println("Invalid number of times.");
            return;
        }
        for(int i=1; i<=N; i++){
            System.out.print(X + " ");

            // if(i<N-1){
            //     System.out.print(" ");
            // }
        }
        System.out.println();


        scn.close();
    }
}