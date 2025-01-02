import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num=scn.nextInt();

        if(num==10 || num<15){
            if(num<15){
                System.out.println(num + " is less than 15.");
            }
            if (num<13) {
                System.out.println(num + " is less than 13 too.");
            }
        } else {
            System.out.println(num + " is greater than 15");
        }

        scn.close();
    }
}
