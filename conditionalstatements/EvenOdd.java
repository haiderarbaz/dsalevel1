import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter an Number: ");
        int num=scn.nextInt();

        if(num%2==0){
            System.out.println(num + " is a Even Number.");
        } else{
            System.out.println(num + " is a Odd Number.");
        }

        scn.close();
    }
}
