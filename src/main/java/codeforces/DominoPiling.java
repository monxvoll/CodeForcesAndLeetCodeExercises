package codeforces;

import java.util.Scanner;

public class DominoPiling {
    //Problem - 50A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstGivenInteger = scanner.nextInt();
        int secondGivenInteger = scanner.nextInt();
        System.out.println((firstGivenInteger*secondGivenInteger)/2);
    }
}
