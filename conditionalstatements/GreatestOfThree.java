//Given three numbers a, b, and c. You need to find which is the greatest of them all.

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int a=scn.nextInt();

        System.out.print("Enter second Number: ");
        int b=scn.nextInt();

        System.out.print("Enter third Number: ");
        int c=scn.nextInt();

        if(a>b && a>c){
            System.out.println(a);
        } else if(b>a && b>c){
            System.out.println(b);
        } else if(c>a && c>b){
            System.out.println(c);
        } else if(a==b && b==c && c==a){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if(a==b && a>c && b>c){
            System.out.println(a);
            System.out.println(b);
        } else if(b==c && b>a && c>a){
            System.out.println(b);
            System.out.println(c);
        }else{
            System.out.println(c);
            System.out.println(a);
        }


        scn.close();
    }
}
