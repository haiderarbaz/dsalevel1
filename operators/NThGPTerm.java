import java.util.Scanner;

public class NThGPTerm {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the first term of the GP: ");
        int a=scn.nextInt();

        System.out.print("Enter the common difference of the GP: ");
        int r=scn.nextInt();

        System.out.print("Enter the Nth term to find in the GP: ");
        int N=scn.nextInt();

        int term=(a*(int)(Math.pow(r, N-1)));

        System.out.println("The " + N + "th term of the series is: "+term);


        scn.close();
    }
}
