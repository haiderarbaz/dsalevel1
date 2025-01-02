import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int year=scn.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.println("The " + year + " is a LeapYear.");
        }
        else if(year%400==0){
            System.out.println("The " + year + " is a LeapYear.");
        }
        else{
           System.out.println("The " + year + " is not a LeapYear.");
        }

        scn.close();
    }
}
