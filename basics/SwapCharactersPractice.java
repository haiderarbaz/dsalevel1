import java.util.*;
public class SwapCharactersPractice{
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter a char: ");
        char first=scn.next().charAt(0);

        System.out.println("Enter another char: ");
        char second=scn.next().charAt(0);

        char temp=first;
        first=second;
        second=temp;

        System.out.println("After Swapping: first = " + first + " , second = " +second);

        scn.close();

    }
}