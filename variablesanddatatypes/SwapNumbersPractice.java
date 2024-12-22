
import java.util.*;

public class SwapNumbersPractice{
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a value: ");
        int d=scn.nextInt();

        System.out.print("Enter another value: ");
        int e=scn.nextInt();

        int temp=d;
        d=e;
        e=temp;

        System.out.println("After swapping: d = " + d + ", e = " + e);

        scn.close();
    }
}