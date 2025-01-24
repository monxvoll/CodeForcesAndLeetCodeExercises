package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WayTooLongWords {
    //Problem - 71A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> wordsList = new ArrayList<>();
        scanner.nextLine();

        for (int i = 0; i < n ; i++) {
            String word = scanner.nextLine();
            if(word.length()<=10){
                wordsList.add(word);
            }else{
                String  mediumLetter =  word.length()-2+"";
                word = word.charAt(0) + mediumLetter + word.charAt(word.length()-1);
                wordsList.add(word);
            }
        }
        for (String string : wordsList){
            System.out.println(string);
        }
    }
}
