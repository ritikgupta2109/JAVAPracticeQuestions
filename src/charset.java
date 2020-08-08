/* Write a program to check whether two given strings contains same set of characters as well as having same length.
   input
   String s1 = "amar";
   String s2 = "rama";

   output : Both contains same characters.
 */

import java.util.Arrays;
import java.util.Scanner;
public class charset {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String1 = ");
        String s1 = sc.nextLine();
        char arr[] = s1.toCharArray();
        Arrays.sort(arr);
        s1 = String.valueOf (arr);
        System.out.println("Enter String2 = ");
        String s2 = sc.nextLine();
        char brr[] = s2.toCharArray();
        Arrays.sort(brr);
        s2 = String.valueOf (brr);
        if (s1.length() != s2.length())
        System.out.println("Not same length");
        else if (s1.length() == s2.length()){
            if(s1.equals(s2))
            System.out.println("Both contains same characters ");
        else
        System.out.println("Not having same characters but have same length");
        }
    }
}

