import java.util.Scanner;

public class PrintDays {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Day Number: ");
        int dayNumber=scn.nextInt();

        String dayString="";

        switch (dayNumber) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
        
            default:
                dayString = "Invalid Output";
                break;
        }
        System.out.println(dayString);

        scn.close();
    }
}
