package codeforces;

import java.util.Scanner;

public class Games {
    //Problem - 268A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTeams  = scanner.nextInt();
        int counter = 0;
        int[] array = new int[numberOfTeams*2];

        for (int i = 0; i < numberOfTeams*2; i+=2) {
            int hostUniformColor = scanner.nextInt();
            int guestUniformColor = scanner.nextInt();
            array[i]=hostUniformColor;
            array[i+1]=guestUniformColor;
        }
        comparator(array,counter);
    }

    public static void comparator(int[] array,int counter){
        for (int i = 0; i < array.length ; i+=2) {
            for (int j = 1; j < array.length ; j+=2) {
                if(array[i]==array[j]){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
