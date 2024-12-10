import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter a byte value: ");
        byte b=scn.nextByte();
        System.out.println("byte value is: "+b);

        System.out.println("Enter a short value: ");
        short s=scn.nextShort();
        System.out.println("short value is: "+s);

        System.out.println("Enter a int value: ");
        int i = scn.nextInt();
        System.out.println("int value is: "+i);

        System.out.println("Enter a long value: ");
        long l=scn.nextLong();
        System.out.println("long value is: "+l);

        System.out.println("Enter a double value: ");
        double d = scn.nextDouble();
        System.out.println("double value is: "+d);

        System.out.println("Enter a float value: ");
        float f = scn.nextFloat();
        System.out.println("float value is: "+f);

        scn.nextLine();

        System.out.println("Enter a string: ");
        String str=scn.nextLine();
        System.out.println("String is: "+str);

        System.out.println("Enter a boolean: ");
        boolean bol=scn.nextBoolean();
        System.out.println("Boolean value is: "+bol);

        scn.close();

    }
    
    }