/* Write a program to get a substring of a StringBuffer.*/

import java.util.Scanner;

public class substr {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string :- ");
        String s1 = sc.nextLine();
        System.out.println("Enter the position:- ");
        int p1 = sc.nextInt();
        StringBuffer sbr = new StringBuffer(s1);
        StringBuffer sbr2 = new StringBuffer(sbr.substring(p1));
        System.out.println("Substring is. >> " +sbr2);
    }
}
