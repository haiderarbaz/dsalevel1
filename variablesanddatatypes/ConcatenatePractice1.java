import java.util.*;
public class ConcatenatePractice1{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x=scn.nextInt();

        System.out.print("Enter another number: ");
        int y=scn.nextInt();

        int concate=Integer.parseInt(Integer.toString(x)+Integer.toString(y));

        System.out.println("Concatenation of " + x + " and " + y + " is " +concate);

        scn.close();
    }
}