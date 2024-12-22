import java.util.Scanner;

public class Swap {
   public Swap() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Ente number a: ");
      int var2 = var1.nextInt();
      System.out.println("Enter number b: ");
      int var3 = var1.nextInt();
      System.out.println("Value of a is " + var3 + " Value of b is " + var2);
      var1.close();
   }
}
