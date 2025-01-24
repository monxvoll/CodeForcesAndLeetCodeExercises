package codeforces;

import java.util.Objects;
import java.util.Scanner;

public class Translation {
    //Problem - 41A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String finalWord = scanner.nextLine();
        String result = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            result += word.charAt(i)+"";
        }
        if(Objects.equals(finalWord, result)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
