import java.util.Scanner;

public class NestedSwitch{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter your year: ");
        int year=scn.nextInt();
        scn.nextLine();
        System.out.print("Enter your Branch: ");
        String branch=scn.nextLine();

       switch (year) {

        // Case
        case 1:
            System.out.println(
                "elective courses : Advance english, Algebra");
            break;
    
        case 2:
            // Switch inside a switch
            // Nested Switch
        switch (branch) {
            // Nested case
            case "CSE":
            case "CCE":
                System.out.println(
                    "elective courses : Machine Learning, Big Data");
                break;

            case "ECE":
                System.out.println(
                    "elective courses : Antenna Engineering");
                break;
                // default case
                // It will execute if above cases does not
                // execute
            default:
                // Print statement
                System.out.println(
                    "Elective courses : Optimization");
            }

            scn.close();
        }
    }
}