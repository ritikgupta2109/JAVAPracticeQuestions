/* Write a program to display the length and capacity of String, StringBuffer and StringBuilder. */

import java.util.Scanner;
public class sbprog {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string :- ");
        String st = sc.nextLine();
        StringBuffer sbr= new StringBuffer (st);
        StringBuilder sbd= new StringBuilder (st);
        System.out.println("Length of String >> " + st.length());
        System.out.println("Capacity of String >> " + st.length());
        System.out.println("Length of StringBuffer >> " + sbr.length());
        System.out.println("Capacity of StringBuffer >> " + sbr.capacity());
        System.out.println("Length of StringBuilder >> " + sbd.length());
        System.out.println("Capacity of StringBuilder >> " + sbd.capacity());
    }
}
