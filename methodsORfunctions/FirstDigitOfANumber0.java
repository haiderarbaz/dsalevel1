import java.util.Scanner;

public class FirstDigitOfANumber0 {
    public static int firstDigit(int n){
        int power = (int) Math.log10(n); //typecasting 
        int a=(int)Math.pow(10, power); //typecasting
        int ans=n/a;

        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n=scn.nextInt();

        System.out.println(firstDigit(n));

        scn.close();
    }
}
