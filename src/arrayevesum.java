/* Write a program to find the sum of all the even elements in the given array.*/


import java.util.Scanner;
public class arrayevesum {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int []arr = {12,13,34,54,53,65,67,78,97};
        int  sum=0;
        for(int i =0; i<arr.length; i++)
        if (arr[i] % 2 == 0)
        sum = sum + arr[i];
        System.out.print("Sum is = " +sum);
    }
}