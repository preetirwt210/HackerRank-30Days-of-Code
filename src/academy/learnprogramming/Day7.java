package academy.learnprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Day7 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt(); scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = n-1; i >= 0; i--) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

}
