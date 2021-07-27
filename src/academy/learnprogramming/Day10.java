package academy.learnprogramming;

import java.io.*;

public class Day10 {
    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    int rem=0;
    int temp=0;
    int maxCount=0;

    while(n>0){
        rem=n%2;
        n=n/2;

        if(rem==1){
            temp++;
            if(temp>maxCount){
                maxCount=temp;
            }
        }else{
            temp=0;
        }
    }
    System.out.println(maxCount);
        bufferedReader.close();
}
}
