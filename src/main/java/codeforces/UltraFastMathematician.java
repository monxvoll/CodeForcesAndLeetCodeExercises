package codeforces;

import java.util.Scanner;

public class UltraFastMathematician {
    //Problem - 61A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bitA = scanner.next();
        String bitB = scanner.next();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < bitA.length(); i++) {
            if(bitA.charAt(i)==bitB.charAt(i)){
                result.append('0');
            }else {
                result.append('1');
            }
        }
        System.out.println(result);
    }
}