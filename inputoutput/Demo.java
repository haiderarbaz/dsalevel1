import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a number for counting: ");
        int n=Integer.parseInt(scn.nextLine());

        System.out.print("Enter a name to diplay the message: ");
        String s=scn.nextLine();

        System.out.println("Dear " + s + " .Here is the counting for you.");

        for(int i=0; i<=n; i++){
            System.out.println(i);
        }
        System.out.println("Done");


        scn.close();
    }
}