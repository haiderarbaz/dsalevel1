import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Ente number a: ");
        int a=scn.nextInt();
        System.out.println("Enter number b: ");
        int b=scn.nextInt();

        int temp=a;
        a=b;
        b=temp;

        System.out.println("Value of a is " + a + " Value of b is " +b);

        scn.close();
    }
    
}
