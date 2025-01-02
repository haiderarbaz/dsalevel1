import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Move: ");
        char move=scn.next().charAt(0);

        switch (move) {
            case 'L':
                System.out.println("x--");
                break;
            case 'R':
                 System.out.println("x++");
                break;
            case 'U':
                 System.out.println("y++");
                break;
            case 'D':
                System.out.println("y--");
                break;
            default:
                System.out.println("Invalid Input");
        }

        scn.close();
    }
}
