import java.util.Scanner;

public class StringSwitchCase {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number in String: ");
        String strNumber=scn.nextLine();

        switch (strNumber) {
            case "one":
                System.out.println("Monday");
                break;
            case "two":
                System.out.println("Tuesday");
                break;
            case "three":
                System.out.println("Wednesday");
                break;
            case "four":
                System.out.println("Thursday");
                break;
            case "five":
                System.out.println("Friday");
                break;
            case "six":
                System.out.println("Saturday");
                break;
            case "seven":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Output");
        }
        scn.close();
    }
}
