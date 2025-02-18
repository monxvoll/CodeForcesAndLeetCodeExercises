package codeforces;


import java.util.Arrays;
import java.util.Scanner;

public class GettingAnA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCases = scanner.nextInt();

        int[] arr1 = new int[nCases];
        double sum = 0;
        int minimumAmount = 0;

        for (int i = 0; i < nCases ; i++) {
            arr1[i]= scanner.nextInt();
            sum+=arr1[i];
        }

        Arrays.sort(arr1);

        while (sum/nCases < 4.5){
            sum +=  5 - arr1[minimumAmount];
            minimumAmount++;
        }

        System.out.println(minimumAmount);
    }


}
