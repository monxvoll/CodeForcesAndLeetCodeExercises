package codeforces;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limakWeight = scanner.nextInt();
        int bobWeight = scanner.nextInt();
        int yearsNum = 0;

        while (limakWeight<=bobWeight){
            limakWeight *= 3;
            bobWeight *= 2;
            yearsNum++;
        }
        System.out.println(yearsNum);
    }
}
