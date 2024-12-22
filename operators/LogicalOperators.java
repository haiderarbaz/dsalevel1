//Logical operators AND, OR, NOT are used in condition checking. Like a AND b checks if both a and b are true. a OR b checks if either of a or b is true. !a complements the boolean value of a.

// In this question you basically need to do
// a && b
// a || b
// !a

import java.util.*;

public class LogicalOperators{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a boolean Value: ");
        boolean a=scn.nextBoolean();

        System.out.print("Enter a boolean Value: ");
        boolean b=scn.nextBoolean();

        boolean p = a&&b;
        System.out.println(p);

        boolean q = a||b;
        System.out.println(q);

        boolean r = !a;
        System.out.println(r);

        scn.close();
    }
}
