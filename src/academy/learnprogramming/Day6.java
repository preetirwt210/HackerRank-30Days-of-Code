package academy.learnprogramming;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int textCases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < textCases; i++) {
            String myString = sc.nextLine();
            char[] myArray = myString.toCharArray();

            for (int j = 0; j < myArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(myArray[j]);
                }
            }
            System.out.print(" ");
            for (int j = 0; j < myArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(myArray[j]);
                }
            }
            System.out.println("");
        }
    }
}
