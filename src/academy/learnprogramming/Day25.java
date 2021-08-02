package academy.learnprogramming;

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            int count = 0;
            if (n == 1) {
                System.out.println("Not prime");
            } else {
                for (int j = 2; j*j <= n; j++) {
                    if (n % j == 0)
                        count++;

                }
                if (count == 0)
                    System.out.println("Prime");
                else
                    System.out.println("Not prime");

            }
        }

    }
}

