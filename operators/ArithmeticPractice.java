import java.util.*;

public class ArithmeticPractice{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Whole Number: ");
        int x=scn.nextInt();
        System.out.print("Enter a Whole Number again: ");
        int y=scn.nextInt();

        int sum=x+y;
        System.out.println("sum");
        System.out.println("Sum of " + x + " and " + y + " is " +sum);

        int sub=x-y;
        System.out.println("sub");
        System.out.println("Sub of " + x + " and " + y + " is " +sub);

        int prod=x*y;
        System.out.println("prod");
        System.out.println("Prod of " + x + " and " + y + " is " +prod);

        int div=x/y;
        System.out.println("div");
        System.out.println("Div of " + x + " and " + y + " is " +div);

        int mod=x%y;
        System.out.println("mod");
        System.out.println("Mod of " + x + " and " + y + " is " +mod);

        int exp=x*y/x+y;
        System.out.println(exp);

        int exp1=(x*y)/(x+y);
        System.out.println(exp1);

        scn.close();
    }
}