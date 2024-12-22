import java.util.Scanner;

public class WhileDemo{
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=scn.nextInt();

        int i=0;

        while(i<=n){
            System.out.println(i);
            i++;
        }
        System.out.println("Done");


        scn.close();
    }
}