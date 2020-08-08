/* Write a program to lexicographically arrange the given strings "Raman", "Aman", "Vikram", "Shyam" and "Bhuvan". */


import java.util.Scanner;
public class lexicograph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Raman", "Aman", "Vikram", "Shyam", "Bhuvan"};
        int i, j,n=5;
        for (i = 0; i < n-1; ++i) {
            for (j = i + 1; j < n; ++j) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;


                }
            }

        }
        System.out.println("In Lexicographical order :- ");
        for (i = 0; i < n; i++)
            System.out.println(names[i]);
    }



}
