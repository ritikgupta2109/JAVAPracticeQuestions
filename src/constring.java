/* Write A program to concatenate StringBuilder & StringBuffer objects.*/

import java.util.Scanner;

public class constring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string :- ");
        String a = sc.nextLine();
        System.out.println("Enter the second string :- ");
        String b = sc.nextLine();
        StringBuffer sbr = new StringBuffer(a);
        StringBuilder sbd= new StringBuilder(b);
        sbr.append(sbd);
        System.out.println(sbr);
    }

}
