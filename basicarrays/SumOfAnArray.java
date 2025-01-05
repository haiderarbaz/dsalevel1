import java.util.*;

public class SumOfAnArray{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter size of the Array: ");
        int size = scn.nextInt();
        int[] arr=new int[size];

        //to take the number of array as input
        System.out.print("Enter element of the Array: ");
        for(int i=0; i<=size-1; i++){
            arr[i]=scn.nextInt();
        }

        int sum=0;
        //to print the element of the array
        for(int i=0; i<=size-1; i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of the Array element is: " +sum);

        scn.close();
    }
}