package academy.learnprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Day28 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        List<String> list = new ArrayList();
        for (int i = 0; i < num; i++){
            String name = scanner.next();
            String email = scanner.next();
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()){
                list.add(name);
            }
        }
        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
    }
}
