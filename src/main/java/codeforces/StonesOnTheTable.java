package codeforces;

import java.util.Scanner;

public class StonesOnTheTable {
    //Problem - 266A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nStones = scanner.nextInt();
        scanner.nextLine();
        String stones = scanner.nextLine();
        int mStones = 0;

        for (int i = 0; i < nStones-1; i++) {
            if(stones.charAt(i)==stones.charAt(i+1)){
                mStones++;
            }
        }
        System.out.println(mStones);
    }
}



