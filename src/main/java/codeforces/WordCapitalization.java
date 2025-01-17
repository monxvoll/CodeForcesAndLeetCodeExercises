package codeforces;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String newWord = word.replaceFirst(word.charAt(0)+"",(word.charAt(0)+"").toUpperCase());

        System.out.println(newWord);
    }
}
