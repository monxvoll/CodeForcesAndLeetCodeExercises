package codeforces;
import java.util.Scanner;

public class KefaFirstSteps {
    //Problem - 580
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nDays = scanner.nextInt();
        int prev = scanner.nextInt();
        int maxLength = 0;
        int currentLenght = 0;

        for (int i = 0; i < nDays-1; i++) {
            int pos = scanner.nextInt();
            if(prev<=pos){
                currentLenght++;
            }else {
                currentLenght = 0;
            }
            if (currentLenght > maxLength) {
                maxLength = currentLenght;
            }
            prev = pos;
        }
        System.out.println(maxLength+1);
    }
}
