package codeforces;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine().toLowerCase();
        String secondWord = scanner.nextLine().toLowerCase();

        for (int i = 0; i < firstWord.length() ; i++) {
            if (firstWord.charAt(i)<secondWord.charAt(i)){
                System.out.println(-1);
                System.exit(0);
            }else if(firstWord.charAt(i)>secondWord.charAt(i)){
                System.out.println(1);
                System.exit(0);
            }
        }

        System.out.println(0);
    }
}
