import java.util.*;

public class TypeConverPractice{
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a value: ");
        int i=scn.nextInt();

        long l=(long) i;
        float f = (float) l;
        double d = (double) f;
        char c=(char) i;

        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);

        scn.close();

    }
}