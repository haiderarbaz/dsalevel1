import java.util.*;

public class IfElseDemo {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num=scn.nextInt();

        if(num>15){
            System.out.println(num + " is greter than 15.");
        }else {
            System.out.println(num + " is less than 15.");
        }
        
        scn.close();
    }
}
