import java.util.Scanner;

public class PrintDays0 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Day Number: ");
        int dayNumber=scn.nextInt();

        String dayType="";
        String dayString="";

        switch (dayNumber) {
            case 1: 
                dayString="Monday";
                break;
            case 2: 
                dayString="Tuesday";
                break;
            case 3: 
                dayString="Wednesday";
                break;
            case 4: 
                dayString="Thursday";
                break;
            case 5: 
                dayString="Friday";
                break;
            case 6: 
                dayString="Saturday";
                break;
            case 7: 
                dayString="Sunday";
                break;
        
            default:
                dayString="Invalid Input";
                break;
        }

        switch (dayNumber) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
                dayType="Weekdays";
                break;
            case 6:
            case 7:
                dayType="Weekend";
                break;
        
            default:
                dayType="Invalid Daytype";
                break;
        }
        System.out.println(dayString + " is a " +dayType);


        scn.close();
    }
}
