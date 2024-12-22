import java.util.*;

public class Demo0{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x=scn.nextInt();

        System.out.print("Enter second number: ");
        int y=scn.nextInt();

        if (x==y){
            System.out.println(x + " is equal to " + y);
        }
        else if (x>y){
            System.out.println(x + " is greater than " + y);
        }
        else{
            System.out.println(x + " is smaller than " + y);
        }

        scn.close();
    }
}