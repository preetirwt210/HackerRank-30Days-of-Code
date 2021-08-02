package academy.learnprogramming;

import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Day29 {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN.
         Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            int maxed = 0;
            for (int b = 2; b <= n; b++) {
                for (int a = 1; a < b; a++) {
                    if (a == b) continue;
                    int ab = a&b;
                    if (ab > maxed && ab < k) maxed = ab;
                }
            }
            System.out.println(maxed);
        }
    }
}
