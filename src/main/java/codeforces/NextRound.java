package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextRound {
    //Problem - 158A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int numberOfParticipants = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            arrayList.add(number);
        }
        if(k<=arrayList.size()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i)>0 && (arrayList.get(i) >= arrayList.get(k-1))) {
                    numberOfParticipants++;
                }
            }
        }
        System.out.println(numberOfParticipants);
    }
}
