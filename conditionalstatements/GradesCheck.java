import java.util.*;

public class GradesCheck {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);

        System.out.print("Enter you marks: ");
        int marks=scn.nextInt();

        if(marks>90){
            System.out.println("Excellent");
        }
        else if(marks>80 && marks<=90){
            System.out.println("Good");
        }
        else if(marks>70 && marks<=80){
            System.out.println("Fair");
        }
        else if(marks>60 && marks<=70){
            System.out.println("Meets Expectations");
        }
        else{
            System.out.println("Below Par");
        }


        scn.close();
    }
}
