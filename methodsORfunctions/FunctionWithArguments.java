import java.util.*;

public class FunctionWithArguments {
    public static String helloFunction(String s){
        return s;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter an String: ");
        String s=scn.nextLine();

        System.out.println(helloFunction(s));

        scn.close();
    }
}
