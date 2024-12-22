import java.util.Scanner;

public class DaysBeforeNDays {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a days number: ");
        int dayNumber=scn.nextInt();

        System.out.print("Enter the number of days before the given day: ");
        int number=scn.nextInt();

        int x=number%7;

        int res=dayNumber-x;
        if(res>0){
            System.out.println(res);
        }else if (res==0){
            System.out.println(0);
        } else{
            System.out.println(res+7);
        }

        // short hand form 
        // return (res > 0) ? res : (res==0) ? 0 : res + 7;


        // System.out.println(res);

        scn.close();
    }
}