import java.util.Scanner;

public class LastDigitOfANumb {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=scn.nextInt();

        num=Math.abs(num);

        int res=num%10;

        System.out.println(res);


        scn.close();
    }
}
