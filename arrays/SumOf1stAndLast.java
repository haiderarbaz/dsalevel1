// Given an integer array nums, return the sum of the 1st and last element of the array.

import java.util.*;

public class SumOf1stAndLast{
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);

        System.out.print("Enter size of the array: ");
        int size = scn.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            scn.close();
            return;
        }

        int[] arr= new int[size];

        System.out.print("Enter the element of the array: ");

        for(int i=0; i<=size-1; i++){
            arr[i]=scn.nextInt();
        }

        //int sumOfFirstAndLast= arr[0] + arr[arr.length-1];

        System.out.println("The sum of the first and last elements is: " +sumOfFirstAndLast(arr));
    }

    public static int sumOfFirstAndLast(int [] arr){
        return arr[0] + arr[arr.length-1];
    }

}