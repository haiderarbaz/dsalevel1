import java.util.*;
public class QuadraticEquation{
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);

        System.out.print("Enter a, b, c: ");
        double a=scn.nextDouble();
        double b=scn.nextDouble();
        double c=scn.nextDouble();

        double r1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double r2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);

        System.out.println("Roots are: " + r1 + " and " + r2);

        scn.close();
    }
}

// Enter input as (1 -4 4) and (1 5 6) if you give 1 1 1 you will get NaN