//Given four inputs that are stored in variables a,b,c, and d. You need to write an expression to evaluate the following formula. Use integer division. The expression should be a single statement.

//a+b/c+d

import java.util.*;

public class EvaluateFormulae{
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a value for a: ");
        int a=scn.nextInt();

        System.out.print("Enter a value for b: ");
        int b=scn.nextInt();

        System.out.print("Enter a value for c: ");
        int c=scn.nextInt();
        
        System.out.print("Enter a value for d: ");
        int d=scn.nextInt();

        int expressions=((a+b)/c)+d;

        System.out.println(expressions);

        scn.close();
    }
}

