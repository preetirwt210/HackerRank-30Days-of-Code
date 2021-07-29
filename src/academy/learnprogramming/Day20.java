package academy.learnprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Day20 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int numElements = scan.nextInt();
        int elmArray[] = new int[numElements];

        for (int i=0; i<numElements; i++) {
            elmArray[i] = scan.nextInt();
        }
        // Write your code here  [6,4,1,2,8,3]
        int totatlNumberOfSwaps=0;
         for(int i=0;i<elmArray.length;i++){
             int numberOfSwaps = 0;
             for(int j=0;j<elmArray.length-1-i;j++){
                 int temp;
                 if(elmArray[j]>elmArray[j+1]){ //0>1  >6>4
                    temp=elmArray[j]; //temp=el[0] //temp=6
                    elmArray[j]=elmArray[j+1]; //el[0]=el[1] //el[0]=4
                    elmArray[j+1]=temp; //el[1]=temp el[1]=6

                     numberOfSwaps++;
                     totatlNumberOfSwaps++;
                 }
             }
             if(numberOfSwaps==0){
                 break;
             }
         }
        scan.close();

        System.out.println("Array is sorted in " + totatlNumberOfSwaps + " swaps.");
        System.out.println("First Element: " + elmArray[0]);
        System.out.println("Last Element: " + elmArray[elmArray.length-1]);
    }
}
