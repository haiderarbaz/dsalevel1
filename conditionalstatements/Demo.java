import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scn.nextInt();

        if(x%2==0){
            System.out.println("The given number " + x + " is even.");
        }
        else{
            System.out.println("The given number " + x + " is odd.");
        }
        System.out.println("Demo for conditional statement.");

        scn.close();
    }
}
