import java.util.Scanner;

public class FirstDigitOfANumber {
    public static int firstDigit(int n){
        while (n>10){
            n=n/10;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n=scn.nextInt();

        System.out.println("The first digit of the number " + n + " is " +firstDigit(n));


        scn.close();
    }
}
