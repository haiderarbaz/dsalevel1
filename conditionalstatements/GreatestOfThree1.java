import java.util.Scanner;

public class GreatestOfThree1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter three Numbers: ");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();

        int ans_1=Math.max(a,b);
        int ans=Math.max(ans_1,c);

        System.out.println(ans + " is Greatest of Three.");


        scn.close();
    }
}
