package codeforces;

import java.util.Scanner;

public class GeorgeAndAccommodation {
    //Problem - 467A
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Long totalRooms = scanner.nextLong();
            int temp = 0;

            for (int i = 0; i <totalRooms ; i++) {
                Long actualPeople = scanner.nextLong();
                Long limitPeople = scanner.nextLong();
                if((limitPeople-actualPeople) >= 2){
                    temp++;

                }
            }
            System.out.print(temp);
    }
}
