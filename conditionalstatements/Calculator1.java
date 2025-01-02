import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("SELECT the Operation: \n 1. Addition \n 2. Substraction \n 3. Multiplication \n");

        int operation=scn.nextInt();

        if(operation!=1 && operation!=2 && operation!=3){
            System.out.println("Invalid Output");
        } else {
            System.out.print("Enter first Number: ");
            int a = scn.nextInt();
            System.out.print("Enter second Number: ");
            int b=scn.nextInt();

            if(operation==1){
                System.out.println(a+b);
            } else if(operation==2){
                System.out.println(a-b);
            } else {
                System.out.println(a*b);
            }
        }


        scn.close();
    }
}
