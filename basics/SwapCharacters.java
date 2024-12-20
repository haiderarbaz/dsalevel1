//Swap characters

import java.util.*;

public class SwapCharacters{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);

        System.out.print("Enter a character: ");
        char a=scn.next().charAt(0);
        
        System.out.print("Enter another character: ");
        char b=scn.next().charAt(0);

        char temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        scn.close();
    }
}